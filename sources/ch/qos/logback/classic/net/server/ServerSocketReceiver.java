package ch.qos.logback.classic.net.server;

import ch.qos.logback.classic.net.ReceiverBase;
import ch.qos.logback.core.net.AbstractSocketAppender;
import ch.qos.logback.core.net.server.ServerListener;
import ch.qos.logback.core.net.server.ServerRunner;
import ch.qos.logback.core.util.CloseUtil;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.UnknownHostException;
import java.util.concurrent.Executor;
import javax.net.ServerSocketFactory;

/* JADX INFO: loaded from: classes.dex */
public class ServerSocketReceiver extends ReceiverBase {
    public static final int DEFAULT_BACKLOG = 50;
    private String address;
    private ServerRunner runner;
    private int port = AbstractSocketAppender.DEFAULT_PORT;
    private int backlog = 50;

    public ServerListener<n2.a> createServerListener(ServerSocket serverSocket) {
        return new a(serverSocket);
    }

    public ServerRunner createServerRunner(ServerListener<n2.a> serverListener, Executor executor) {
        return new n2.b(serverListener, executor);
    }

    public String getAddress() {
        return this.address;
    }

    public int getBacklog() {
        return this.backlog;
    }

    public InetAddress getInetAddress() throws UnknownHostException {
        if (getAddress() == null) {
            return null;
        }
        return InetAddress.getByName(getAddress());
    }

    public int getPort() {
        return this.port;
    }

    @Override // ch.qos.logback.classic.net.ReceiverBase
    public Runnable getRunnableTask() {
        return this.runner;
    }

    public ServerSocketFactory getServerSocketFactory() throws Exception {
        return ServerSocketFactory.getDefault();
    }

    @Override // ch.qos.logback.classic.net.ReceiverBase
    public void onStop() {
        try {
            ServerRunner serverRunner = this.runner;
            if (serverRunner == null) {
                return;
            }
            serverRunner.stop();
        } catch (IOException e10) {
            addError("server shutdown error: " + e10, e10);
        }
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setBacklog(int i10) {
        this.backlog = i10;
    }

    public void setPort(int i10) {
        this.port = i10;
    }

    @Override // ch.qos.logback.classic.net.ReceiverBase
    public boolean shouldStart() {
        ServerSocket serverSocketCreateServerSocket = null;
        try {
            serverSocketCreateServerSocket = getServerSocketFactory().createServerSocket(getPort(), getBacklog(), getInetAddress());
            ServerRunner serverRunnerCreateServerRunner = createServerRunner(createServerListener(serverSocketCreateServerSocket), getContext().getScheduledExecutorService());
            this.runner = serverRunnerCreateServerRunner;
            serverRunnerCreateServerRunner.setContext(getContext());
            return true;
        } catch (Exception e10) {
            addError("server startup error: " + e10, e10);
            CloseUtil.closeQuietly(serverSocketCreateServerSocket);
            return false;
        }
    }
}
