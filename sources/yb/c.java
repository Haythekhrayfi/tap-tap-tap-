package yb;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Callable<Void>, nb.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final FutureTask<Void> f44823h = new FutureTask<>(rb.a.f35358a, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f44824c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ExecutorService f44827f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Thread f44828g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference<Future<?>> f44826e = new AtomicReference<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference<Future<?>> f44825d = new AtomicReference<>();

    public c(Runnable runnable, ExecutorService executorService) {
        this.f44824c = runnable;
        this.f44827f = executorService;
    }

    public void a(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.f44826e.get();
            if (future2 == f44823h) {
                future.cancel(this.f44828g != Thread.currentThread());
                return;
            }
        } while (!this.f44826e.compareAndSet(future2, future));
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        Future<?> future;
        this.f44828g = Thread.currentThread();
        try {
            this.f44824c.run();
            Future<?> futureSubmit = this.f44827f.submit(this);
            do {
                future = this.f44825d.get();
                if (future == f44823h) {
                    futureSubmit.cancel(this.f44828g != Thread.currentThread());
                    break;
                }
            } while (!this.f44825d.compareAndSet(future, futureSubmit));
            this.f44828g = null;
        } catch (Throwable th) {
            this.f44828g = null;
            dc.a.b(th);
        }
        return null;
    }

    @Override // nb.b
    public void dispose() {
        AtomicReference<Future<?>> atomicReference = this.f44826e;
        FutureTask<Void> futureTask = f44823h;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        if (andSet != null && andSet != futureTask) {
            andSet.cancel(this.f44828g != Thread.currentThread());
        }
        Future<?> andSet2 = this.f44825d.getAndSet(futureTask);
        if (andSet2 == null || andSet2 == futureTask) {
            return;
        }
        andSet2.cancel(this.f44828g != Thread.currentThread());
    }
}
