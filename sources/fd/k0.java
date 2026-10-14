package fd;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends y0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final k0 f29587j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f29588k;

    static {
        Long l10;
        k0 k0Var = new k0();
        f29587j = k0Var;
        k0Var.h0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f29588k = timeUnit.toNanos(l10.longValue());
    }

    @Override // fd.y0, fd.o0
    public t0 k(long j10, Runnable runnable, mc.f fVar) {
        long jA = a1.a(j10);
        if (jA >= 4611686018427387903L) {
            return u1.f29627c;
        }
        long jNanoTime = System.nanoTime();
        y0.b bVar = new y0.b(jA + jNanoTime, runnable);
        s0(jNanoTime, bVar);
        return bVar;
    }

    @Override // fd.z0
    public Thread k0() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // fd.z0
    public void l0(long j10, y0.c cVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // fd.y0
    public void n0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.n0(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z10;
        c2 c2Var = c2.f29557a;
        c2.f29558b.set(this);
        try {
            synchronized (this) {
                if (u0()) {
                    z10 = false;
                } else {
                    z10 = true;
                    debugStatus = 1;
                    notifyAll();
                }
            }
            if (!z10) {
                _thread = null;
                t0();
                if (p0()) {
                    return;
                }
                k0();
                return;
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jQ0 = q0();
                if (jQ0 == RecyclerView.FOREVER_NS) {
                    long jNanoTime = System.nanoTime();
                    if (j10 == RecyclerView.FOREVER_NS) {
                        j10 = f29588k + jNanoTime;
                    }
                    long j11 = j10 - jNanoTime;
                    if (j11 <= 0) {
                        _thread = null;
                        t0();
                        if (p0()) {
                            return;
                        }
                        k0();
                        return;
                    }
                    jQ0 = bd.e.c(jQ0, j11);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (jQ0 > 0) {
                    if (u0()) {
                        _thread = null;
                        t0();
                        if (p0()) {
                            return;
                        }
                        k0();
                        return;
                    }
                    LockSupport.parkNanos(this, jQ0);
                }
            }
        } catch (Throwable th) {
            _thread = null;
            t0();
            if (!p0()) {
                k0();
            }
            throw th;
        }
    }

    @Override // fd.y0, fd.x0
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    public final synchronized void t0() {
        if (u0()) {
            debugStatus = 3;
            r0();
            notifyAll();
        }
    }

    public final boolean u0() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }
}
