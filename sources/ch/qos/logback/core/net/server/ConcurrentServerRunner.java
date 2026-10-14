package ch.qos.logback.core.net.server;

import ch.qos.logback.core.net.server.Client;
import ch.qos.logback.core.spi.ContextAwareBase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public abstract class ConcurrentServerRunner<T extends Client> extends ContextAwareBase implements Runnable, ServerRunner<T> {
    private final Executor executor;
    private final ServerListener<T> listener;
    private boolean running;
    private final Lock clientsLock = new ReentrantLock();
    private final Collection<T> clients = new ArrayList();

    public class a implements ClientVisitor<T> {
        public a(ConcurrentServerRunner concurrentServerRunner) {
        }

        @Override // ch.qos.logback.core.net.server.ClientVisitor
        public void visit(T t10) {
            t10.close();
        }
    }

    public class b implements Client {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T f3704c;

        public b(T t10) {
            this.f3704c = t10;
        }

        @Override // ch.qos.logback.core.net.server.Client, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f3704c.close();
        }

        @Override // java.lang.Runnable
        public void run() {
            ConcurrentServerRunner.this.addClient(this.f3704c);
            try {
                this.f3704c.run();
            } finally {
                ConcurrentServerRunner.this.removeClient(this.f3704c);
            }
        }
    }

    public ConcurrentServerRunner(ServerListener<T> serverListener, Executor executor) {
        this.listener = serverListener;
        this.executor = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addClient(T t10) {
        this.clientsLock.lock();
        try {
            this.clients.add(t10);
        } finally {
            this.clientsLock.unlock();
        }
    }

    private Collection<T> copyClients() {
        this.clientsLock.lock();
        try {
            return new ArrayList(this.clients);
        } finally {
            this.clientsLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeClient(T t10) {
        this.clientsLock.lock();
        try {
            this.clients.remove(t10);
        } finally {
            this.clientsLock.unlock();
        }
    }

    @Override // ch.qos.logback.core.net.server.ServerRunner
    public void accept(ClientVisitor<T> clientVisitor) {
        for (T t10 : copyClients()) {
            try {
                clientVisitor.visit(t10);
            } catch (RuntimeException e10) {
                addError(t10 + ": " + e10);
            }
        }
    }

    public abstract boolean configureClient(T t10);

    @Override // ch.qos.logback.core.net.server.ServerRunner
    public boolean isRunning() {
        return this.running;
    }

    @Override // java.lang.Runnable
    public void run() {
        setRunning(true);
        try {
            addInfo("listening on " + this.listener);
            while (!Thread.currentThread().isInterrupted()) {
                Client clientAcceptClient = this.listener.acceptClient();
                if (configureClient(clientAcceptClient)) {
                    try {
                        this.executor.execute(new b(clientAcceptClient));
                    } catch (RejectedExecutionException unused) {
                        addError(clientAcceptClient + ": connection dropped");
                        clientAcceptClient.close();
                    }
                } else {
                    addError(clientAcceptClient + ": connection dropped");
                }
                clientAcceptClient.close();
            }
        } catch (InterruptedException unused2) {
        } catch (Exception e10) {
            addError("listener: " + e10);
        }
        setRunning(false);
        addInfo("shutting down");
        this.listener.close();
    }

    public void setRunning(boolean z10) {
        this.running = z10;
    }

    @Override // ch.qos.logback.core.net.server.ServerRunner
    public void stop() throws IOException {
        this.listener.close();
        accept(new a(this));
    }
}
