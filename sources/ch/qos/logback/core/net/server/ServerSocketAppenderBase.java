package ch.qos.logback.core.net.server;

import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.net.AbstractSocketAppender;
import ch.qos.logback.core.spi.PreSerializationTransformer;
import java.io.IOException;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.UnknownHostException;
import java.util.concurrent.Executor;
import javax.net.ServerSocketFactory;

/* JADX INFO: loaded from: classes.dex */
public abstract class ServerSocketAppenderBase<E> extends AppenderBase<E> {
    public static final int DEFAULT_BACKLOG = 50;
    public static final int DEFAULT_CLIENT_QUEUE_SIZE = 100;
    private String address;
    private ServerRunner<u2.a> runner;
    private int port = AbstractSocketAppender.DEFAULT_PORT;
    private int backlog = 50;
    private int clientQueueSize = 100;

    public class a implements ClientVisitor<u2.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Serializable f3706a;

        public a(ServerSocketAppenderBase serverSocketAppenderBase, Serializable serializable) {
            this.f3706a = serializable;
        }

        @Override // ch.qos.logback.core.net.server.ClientVisitor
        public void visit(Client client) {
            ((u2.a) client).o(this.f3706a);
        }
    }

    @Override // ch.qos.logback.core.AppenderBase
    public void append(E e10) {
        if (e10 == null) {
            return;
        }
        postProcessEvent(e10);
        this.runner.accept(new a(this, getPST().transform(e10)));
    }

    public ServerListener<u2.a> createServerListener(ServerSocket serverSocket) {
        return new ch.qos.logback.core.net.server.a(serverSocket);
    }

    public ServerRunner<u2.a> createServerRunner(ServerListener<u2.a> serverListener, Executor executor) {
        return new u2.b(serverListener, executor, getClientQueueSize());
    }

    public String getAddress() {
        return this.address;
    }

    public Integer getBacklog() {
        return Integer.valueOf(this.backlog);
    }

    public int getClientQueueSize() {
        return this.clientQueueSize;
    }

    public InetAddress getInetAddress() throws UnknownHostException {
        if (getAddress() == null) {
            return null;
        }
        return InetAddress.getByName(getAddress());
    }

    public abstract PreSerializationTransformer<E> getPST();

    public int getPort() {
        return this.port;
    }

    public ServerSocketFactory getServerSocketFactory() throws Exception {
        return ServerSocketFactory.getDefault();
    }

    public abstract void postProcessEvent(E e10);

    public void setAddress(String str) {
        this.address = str;
    }

    public void setBacklog(Integer num) {
        this.backlog = num.intValue();
    }

    public void setClientQueueSize(int i10) {
        this.clientQueueSize = i10;
    }

    public void setPort(int i10) {
        this.port = i10;
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        if (isStarted()) {
            return;
        }
        try {
            ServerRunner<u2.a> serverRunnerCreateServerRunner = createServerRunner(createServerListener(getServerSocketFactory().createServerSocket(getPort(), getBacklog().intValue(), getInetAddress())), getContext().getScheduledExecutorService());
            this.runner = serverRunnerCreateServerRunner;
            serverRunnerCreateServerRunner.setContext(getContext());
            getContext().getScheduledExecutorService().execute(this.runner);
            super.start();
        } catch (Exception e10) {
            addError("server startup error: " + e10, e10);
        }
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        if (isStarted()) {
            try {
                this.runner.stop();
                super.stop();
            } catch (IOException e10) {
                addError("server shutdown error: " + e10, e10);
            }
        }
    }
}
