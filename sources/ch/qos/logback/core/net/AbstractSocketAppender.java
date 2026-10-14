package ch.qos.logback.core.net;

import android.support.v4.media.b;
import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.spi.PreSerializationTransformer;
import ch.qos.logback.core.util.CloseUtil;
import ch.qos.logback.core.util.Duration;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractSocketAppender<E> extends AppenderBase<E> implements SocketConnector.ExceptionHandler {
    private static final int DEFAULT_ACCEPT_CONNECTION_DELAY = 5000;
    private static final int DEFAULT_EVENT_DELAY_TIMEOUT = 100;
    public static final int DEFAULT_PORT = 4560;
    public static final int DEFAULT_QUEUE_SIZE = 128;
    public static final int DEFAULT_RECONNECTION_DELAY = 30000;
    private int acceptConnectionTimeout;
    private InetAddress address;
    private SocketConnector connector;
    private BlockingDeque<E> deque;
    private Duration eventDelayLimit;
    private final ObjectWriterFactory objectWriterFactory;
    private String peerId;
    private int port;
    private final QueueFactory queueFactory;
    private int queueSize;
    private Duration reconnectionDelay;
    private String remoteHost;
    private volatile Socket socket;
    private Future<?> task;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractSocketAppender.this.connectSocketAndDispatchEvents();
        }
    }

    public AbstractSocketAppender() {
        this(new QueueFactory(), new ObjectWriterFactory());
    }

    public AbstractSocketAppender(QueueFactory queueFactory, ObjectWriterFactory objectWriterFactory) {
        this.port = DEFAULT_PORT;
        this.reconnectionDelay = new Duration(30000L);
        this.queueSize = 128;
        this.acceptConnectionTimeout = 5000;
        this.eventDelayLimit = new Duration(100L);
        this.objectWriterFactory = objectWriterFactory;
        this.queueFactory = queueFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectSocketAndDispatchEvents() {
        StringBuilder sb2;
        while (socketConnectionCouldBeEstablished()) {
            try {
                try {
                    try {
                        ObjectWriter objectWriterCreateObjectWriterForSocket = createObjectWriterForSocket();
                        addInfo(this.peerId + "connection established");
                        dispatchEvents(objectWriterCreateObjectWriterForSocket);
                        CloseUtil.closeQuietly(this.socket);
                        this.socket = null;
                        sb2 = new StringBuilder();
                        sb2.append(this.peerId);
                        sb2.append("connection closed");
                    } catch (IOException e10) {
                        addInfo(this.peerId + "connection failed: " + e10);
                        CloseUtil.closeQuietly(this.socket);
                        this.socket = null;
                        sb2 = new StringBuilder();
                        sb2.append(this.peerId);
                        sb2.append("connection closed");
                    }
                    addInfo(sb2.toString());
                } catch (Throwable th) {
                    CloseUtil.closeQuietly(this.socket);
                    this.socket = null;
                    addInfo(this.peerId + "connection closed");
                    throw th;
                }
            } catch (InterruptedException unused) {
            }
        }
        addInfo("shutting down");
    }

    private SocketConnector createConnector(InetAddress inetAddress, int i10, int i11, long j10) {
        SocketConnector socketConnectorNewConnector = newConnector(inetAddress, i10, i11, j10);
        socketConnectorNewConnector.setExceptionHandler(this);
        socketConnectorNewConnector.setSocketFactory(getSocketFactory());
        return socketConnectorNewConnector;
    }

    private ObjectWriter createObjectWriterForSocket() throws IOException {
        this.socket.setSoTimeout(this.acceptConnectionTimeout);
        AutoFlushingObjectWriter autoFlushingObjectWriterNewAutoFlushingObjectWriter = this.objectWriterFactory.newAutoFlushingObjectWriter(this.socket.getOutputStream());
        this.socket.setSoTimeout(0);
        return autoFlushingObjectWriterNewAutoFlushingObjectWriter;
    }

    private void dispatchEvents(ObjectWriter objectWriter) throws InterruptedException, IOException {
        while (true) {
            E eTakeFirst = this.deque.takeFirst();
            postProcessEvent(eTakeFirst);
            try {
                objectWriter.write(getPST().transform(eTakeFirst));
            } catch (IOException e10) {
                tryReAddingEventToFrontOfQueue(eTakeFirst);
                throw e10;
            }
        }
    }

    private boolean socketConnectionCouldBeEstablished() throws InterruptedException {
        Socket socketCall = this.connector.call();
        this.socket = socketCall;
        return socketCall != null;
    }

    private void tryReAddingEventToFrontOfQueue(E e10) {
        if (this.deque.offerFirst(e10)) {
            return;
        }
        addInfo("Dropping event due to socket connection error and maxed out deque capacity");
    }

    @Override // ch.qos.logback.core.AppenderBase
    public void append(E e10) {
        if (e10 == null || !isStarted()) {
            return;
        }
        try {
            if (this.deque.offer(e10, this.eventDelayLimit.getMilliseconds(), TimeUnit.MILLISECONDS)) {
                return;
            }
            addInfo("Dropping event due to timeout limit of [" + this.eventDelayLimit + "] being exceeded");
        } catch (InterruptedException e11) {
            addError("Interrupted while appending event to SocketAppender", e11);
        }
    }

    @Override // ch.qos.logback.core.net.SocketConnector.ExceptionHandler
    public void connectionFailed(SocketConnector socketConnector, Exception exc) {
        StringBuilder sb2;
        String string;
        if (exc instanceof InterruptedException) {
            string = "connector interrupted";
        } else {
            if (exc instanceof ConnectException) {
                sb2 = new StringBuilder();
                sb2.append(this.peerId);
                sb2.append("connection refused");
            } else {
                sb2 = new StringBuilder();
                sb2.append(this.peerId);
                sb2.append(exc);
            }
            string = sb2.toString();
        }
        addInfo(string);
    }

    public Duration getEventDelayLimit() {
        return this.eventDelayLimit;
    }

    public abstract PreSerializationTransformer<E> getPST();

    public int getPort() {
        return this.port;
    }

    public int getQueueSize() {
        return this.queueSize;
    }

    public Duration getReconnectionDelay() {
        return this.reconnectionDelay;
    }

    public String getRemoteHost() {
        return this.remoteHost;
    }

    public SocketFactory getSocketFactory() {
        return SocketFactory.getDefault();
    }

    public SocketConnector newConnector(InetAddress inetAddress, int i10, long j10, long j11) {
        return new DefaultSocketConnector(inetAddress, i10, j10, j11);
    }

    public abstract void postProcessEvent(E e10);

    public void setAcceptConnectionTimeout(int i10) {
        this.acceptConnectionTimeout = i10;
    }

    public void setEventDelayLimit(Duration duration) {
        this.eventDelayLimit = duration;
    }

    public void setPort(int i10) {
        this.port = i10;
    }

    public void setQueueSize(int i10) {
        this.queueSize = i10;
    }

    public void setReconnectionDelay(Duration duration) {
        this.reconnectionDelay = duration;
    }

    public void setRemoteHost(String str) {
        this.remoteHost = str;
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        if (isStarted()) {
            return;
        }
        int i10 = 0;
        if (this.port <= 0) {
            StringBuilder sbA = defpackage.a.a("No port was configured for appender");
            sbA.append(this.name);
            sbA.append(" For more information, please visit http://logback.qos.ch/codes.html#socket_no_port");
            addError(sbA.toString());
            i10 = 1;
        }
        if (this.remoteHost == null) {
            i10++;
            StringBuilder sbA2 = defpackage.a.a("No remote host was configured for appender");
            sbA2.append(this.name);
            sbA2.append(" For more information, please visit http://logback.qos.ch/codes.html#socket_no_host");
            addError(sbA2.toString());
        }
        if (this.queueSize == 0) {
            addWarn("Queue size of zero is deprecated, use a size of one to indicate synchronous processing");
        }
        if (this.queueSize < 0) {
            i10++;
            addError("Queue size must be greater than zero");
        }
        if (i10 == 0) {
            try {
                this.address = InetAddress.getByName(this.remoteHost);
            } catch (UnknownHostException unused) {
                StringBuilder sbA3 = defpackage.a.a("unknown host: ");
                sbA3.append(this.remoteHost);
                addError(sbA3.toString());
                i10++;
            }
        }
        if (i10 == 0) {
            this.deque = this.queueFactory.newLinkedBlockingDeque(this.queueSize);
            StringBuilder sbA4 = defpackage.a.a("remote peer ");
            sbA4.append(this.remoteHost);
            sbA4.append(":");
            this.peerId = b.a(sbA4, this.port, ": ");
            this.connector = createConnector(this.address, this.port, 0, this.reconnectionDelay.getMilliseconds());
            this.task = getContext().getScheduledExecutorService().submit(new a());
            super.start();
        }
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        if (isStarted()) {
            CloseUtil.closeQuietly(this.socket);
            this.task.cancel(true);
            super.stop();
        }
    }
}
