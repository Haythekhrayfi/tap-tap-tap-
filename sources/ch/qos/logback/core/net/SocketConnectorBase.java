package ch.qos.logback.core.net;

import androidx.recyclerview.widget.RecyclerView;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.SocketFactory;

/* JADX INFO: loaded from: classes.dex */
public class SocketConnectorBase implements SocketConnector {
    private final InetAddress address;
    private final Condition connectCondition;
    private DelayStrategy delayStrategy;
    private SocketConnector.ExceptionHandler exceptionHandler;
    private final Lock lock;
    private final int port;
    private Socket socket;
    private SocketFactory socketFactory;

    public interface DelayStrategy {
        int nextDelay();
    }

    public static class b implements SocketConnector.ExceptionHandler {
        public b(a aVar) {
        }

        @Override // ch.qos.logback.core.net.SocketConnector.ExceptionHandler
        public void connectionFailed(SocketConnector socketConnector, Exception exc) {
            System.out.println(exc);
        }
    }

    public static class c implements DelayStrategy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3702b;

        public c(int i10, int i11) {
            this.f3702b = i10;
            this.f3701a = i11;
        }

        @Override // ch.qos.logback.core.net.SocketConnectorBase.DelayStrategy
        public int nextDelay() {
            int i10 = this.f3702b;
            this.f3702b = this.f3701a;
            return i10;
        }
    }

    public SocketConnectorBase(InetAddress inetAddress, int i10, int i11, int i12) {
        this(inetAddress, i10, new c(i11, i12));
    }

    public SocketConnectorBase(InetAddress inetAddress, int i10, DelayStrategy delayStrategy) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.connectCondition = reentrantLock.newCondition();
        this.address = inetAddress;
        this.port = i10;
        this.delayStrategy = delayStrategy;
    }

    private void signalConnected() {
        this.lock.lock();
        try {
            this.connectCondition.signalAll();
        } finally {
            this.lock.unlock();
        }
    }

    public Socket awaitConnection() throws InterruptedException {
        return awaitConnection(RecyclerView.FOREVER_NS);
    }

    public Socket awaitConnection(long j10) throws InterruptedException {
        Socket socket;
        this.lock.lock();
        boolean z10 = false;
        while (true) {
            try {
                socket = this.socket;
                if (socket != null || z10) {
                    break;
                }
                z10 = !this.connectCondition.await(j10, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                this.lock.unlock();
                throw th;
            }
        }
        this.lock.unlock();
        return socket;
    }

    @Override // java.util.concurrent.Callable
    public Socket call() throws InterruptedException {
        return null;
    }

    public void run() {
        if (this.socket != null) {
            throw new IllegalStateException("connector cannot be reused");
        }
        if (this.exceptionHandler == null) {
            this.exceptionHandler = new b(null);
        }
        if (this.socketFactory == null) {
            this.socketFactory = SocketFactory.getDefault();
        }
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(this.delayStrategy.nextDelay());
                try {
                    this.socket = this.socketFactory.createSocket(this.address, this.port);
                    signalConnected();
                    return;
                } catch (Exception e10) {
                    this.exceptionHandler.connectionFailed(this, e10);
                }
            } catch (InterruptedException e11) {
                this.exceptionHandler.connectionFailed(this, e11);
                return;
            }
        }
    }

    @Override // ch.qos.logback.core.net.SocketConnector
    public void setExceptionHandler(SocketConnector.ExceptionHandler exceptionHandler) {
        this.exceptionHandler = exceptionHandler;
    }

    @Override // ch.qos.logback.core.net.SocketConnector
    public void setSocketFactory(SocketFactory socketFactory) {
        this.socketFactory = socketFactory;
    }
}
