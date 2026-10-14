package ch.qos.logback.classic.net;

import android.support.v4.media.b;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.net.server.HardenedLoggingEventInputStream;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.net.DefaultSocketConnector;
import ch.qos.logback.core.net.SocketConnector;
import ch.qos.logback.core.util.CloseUtil;
import defpackage.a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import javax.net.SocketFactory;

/* JADX INFO: loaded from: classes.dex */
public class SocketReceiver extends ReceiverBase implements Runnable, SocketConnector.ExceptionHandler {
    private static final int DEFAULT_ACCEPT_CONNECTION_DELAY = 5000;
    private int acceptConnectionTimeout = 5000;
    private InetAddress address;
    private Future<Socket> connectorTask;
    private int port;
    private String receiverId;
    private int reconnectionDelay;
    private String remoteHost;
    private volatile Socket socket;

    private Future<Socket> activateConnector(SocketConnector socketConnector) {
        try {
            return getContext().getScheduledExecutorService().submit(socketConnector);
        } catch (RejectedExecutionException unused) {
            return null;
        }
    }

    private SocketConnector createConnector(InetAddress inetAddress, int i10, int i11, int i12) {
        SocketConnector socketConnectorNewConnector = newConnector(inetAddress, i10, i11, i12);
        socketConnectorNewConnector.setExceptionHandler(this);
        socketConnectorNewConnector.setSocketFactory(getSocketFactory());
        return socketConnectorNewConnector;
    }

    private void dispatchEvents(LoggerContext loggerContext) throws Throwable {
        HardenedLoggingEventInputStream hardenedLoggingEventInputStream;
        StringBuilder sb2;
        try {
            try {
                this.socket.setSoTimeout(this.acceptConnectionTimeout);
                hardenedLoggingEventInputStream = new HardenedLoggingEventInputStream(this.socket.getInputStream());
                try {
                    this.socket.setSoTimeout(0);
                    addInfo(this.receiverId + "connection established");
                    while (true) {
                        ILoggingEvent iLoggingEvent = (ILoggingEvent) hardenedLoggingEventInputStream.readObject();
                        Logger logger = loggerContext.getLogger(iLoggingEvent.getLoggerName());
                        if (logger.isEnabledFor(iLoggingEvent.getLevel())) {
                            logger.callAppenders(iLoggingEvent);
                        }
                    }
                } catch (EOFException unused) {
                    addInfo(this.receiverId + "end-of-stream detected");
                    CloseUtil.closeQuietly(hardenedLoggingEventInputStream);
                    CloseUtil.closeQuietly(this.socket);
                    this.socket = null;
                    sb2 = new StringBuilder();
                    sb2.append(this.receiverId);
                    sb2.append("connection closed");
                    addInfo(sb2.toString());
                } catch (IOException e10) {
                    e = e10;
                    addInfo(this.receiverId + "connection failed: " + e);
                    CloseUtil.closeQuietly(hardenedLoggingEventInputStream);
                    CloseUtil.closeQuietly(this.socket);
                    this.socket = null;
                    sb2 = new StringBuilder();
                    sb2.append(this.receiverId);
                    sb2.append("connection closed");
                    addInfo(sb2.toString());
                } catch (ClassNotFoundException e11) {
                    e = e11;
                    addInfo(this.receiverId + "unknown event class: " + e);
                    CloseUtil.closeQuietly(hardenedLoggingEventInputStream);
                    CloseUtil.closeQuietly(this.socket);
                    this.socket = null;
                    sb2 = new StringBuilder();
                    sb2.append(this.receiverId);
                    sb2.append("connection closed");
                    addInfo(sb2.toString());
                }
            } catch (Throwable th) {
                th = th;
                CloseUtil.closeQuietly((Closeable) null);
                CloseUtil.closeQuietly(this.socket);
                this.socket = null;
                addInfo(this.receiverId + "connection closed");
                throw th;
            }
        } catch (EOFException unused2) {
            hardenedLoggingEventInputStream = null;
        } catch (IOException e12) {
            e = e12;
            hardenedLoggingEventInputStream = null;
        } catch (ClassNotFoundException e13) {
            e = e13;
            hardenedLoggingEventInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            CloseUtil.closeQuietly((Closeable) null);
            CloseUtil.closeQuietly(this.socket);
            this.socket = null;
            addInfo(this.receiverId + "connection closed");
            throw th;
        }
    }

    private Socket waitForConnectorToReturnASocket() throws InterruptedException {
        try {
            Socket socket = this.connectorTask.get();
            this.connectorTask = null;
            return socket;
        } catch (ExecutionException unused) {
            return null;
        }
    }

    @Override // ch.qos.logback.core.net.SocketConnector.ExceptionHandler
    public void connectionFailed(SocketConnector socketConnector, Exception exc) {
        StringBuilder sb2;
        String str;
        String string;
        if (exc instanceof InterruptedException) {
            string = "connector interrupted";
        } else {
            if (exc instanceof ConnectException) {
                sb2 = new StringBuilder();
                sb2.append(this.receiverId);
                str = "connection refused";
            } else {
                sb2 = new StringBuilder();
                sb2.append(this.receiverId);
                str = "unspecified error";
            }
            sb2.append(str);
            string = sb2.toString();
        }
        addWarn(string, exc);
    }

    @Override // ch.qos.logback.classic.net.ReceiverBase
    public Runnable getRunnableTask() {
        return this;
    }

    public SocketFactory getSocketFactory() {
        return SocketFactory.getDefault();
    }

    public SocketConnector newConnector(InetAddress inetAddress, int i10, int i11, int i12) {
        return new DefaultSocketConnector(inetAddress, i10, i11, i12);
    }

    @Override // ch.qos.logback.classic.net.ReceiverBase
    public void onStop() {
        if (this.socket != null) {
            CloseUtil.closeQuietly(this.socket);
        }
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            LoggerContext loggerContext = (LoggerContext) getContext();
            while (!Thread.currentThread().isInterrupted()) {
                Future<Socket> futureActivateConnector = activateConnector(createConnector(this.address, this.port, 0, this.reconnectionDelay));
                this.connectorTask = futureActivateConnector;
                if (futureActivateConnector == null) {
                    break;
                }
                this.socket = waitForConnectorToReturnASocket();
                if (this.socket == null) {
                    break;
                } else {
                    dispatchEvents(loggerContext);
                }
            }
        } catch (InterruptedException unused) {
        }
        addInfo("shutting down");
    }

    public void setAcceptConnectionTimeout(int i10) {
        this.acceptConnectionTimeout = i10;
    }

    public void setPort(int i10) {
        this.port = i10;
    }

    public void setReconnectionDelay(int i10) {
        this.reconnectionDelay = i10;
    }

    public void setRemoteHost(String str) {
        this.remoteHost = str;
    }

    @Override // ch.qos.logback.classic.net.ReceiverBase
    public boolean shouldStart() {
        int i10;
        if (this.port == 0) {
            addError("No port was configured for receiver. For more information, please visit http://logback.qos.ch/codes.html#receiver_no_port");
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (this.remoteHost == null) {
            i10++;
            addError("No host name or address was configured for receiver. For more information, please visit http://logback.qos.ch/codes.html#receiver_no_host");
        }
        if (this.reconnectionDelay == 0) {
            this.reconnectionDelay = 30000;
        }
        if (i10 == 0) {
            try {
                this.address = InetAddress.getByName(this.remoteHost);
            } catch (UnknownHostException unused) {
                StringBuilder sbA = a.a("unknown host: ");
                sbA.append(this.remoteHost);
                addError(sbA.toString());
                i10++;
            }
        }
        if (i10 == 0) {
            StringBuilder sbA2 = a.a("receiver ");
            sbA2.append(this.remoteHost);
            sbA2.append(":");
            this.receiverId = b.a(sbA2, this.port, ": ");
        }
        return i10 == 0;
    }
}
