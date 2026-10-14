package okhttp3;

import fd.j0;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealConnectionPool;

/* JADX INFO: loaded from: classes3.dex */
public final class ConnectionPool {
    private final RealConnectionPool delegate;

    public ConnectionPool() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionPool(int i10, long j10, TimeUnit timeUnit) {
        this(new RealConnectionPool(TaskRunner.INSTANCE, i10, j10, timeUnit));
        j0.i(timeUnit, "timeUnit");
    }

    public ConnectionPool(RealConnectionPool realConnectionPool) {
        j0.i(realConnectionPool, "delegate");
        this.delegate = realConnectionPool;
    }

    public final int connectionCount() {
        return this.delegate.connectionCount();
    }

    public final void evictAll() {
        this.delegate.evictAll();
    }

    public final RealConnectionPool getDelegate$okhttp() {
        return this.delegate;
    }

    public final int idleConnectionCount() {
        return this.delegate.idleConnectionCount();
    }
}
