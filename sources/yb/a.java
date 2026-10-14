package yb;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends AtomicReference<Future<?>> implements nb.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final FutureTask<Void> f44805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final FutureTask<Void> f44806f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f44807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Thread f44808d;

    static {
        Runnable runnable = rb.a.f35358a;
        f44805e = new FutureTask<>(runnable, null);
        f44806f = new FutureTask<>(runnable, null);
    }

    public a(Runnable runnable) {
        this.f44807c = runnable;
    }

    public final void a(Future<?> future) {
        Future<?> future2;
        do {
            future2 = get();
            if (future2 == f44805e) {
                return;
            }
            if (future2 == f44806f) {
                future.cancel(this.f44808d != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // nb.b
    public final void dispose() {
        FutureTask<Void> futureTask;
        Future<?> future = get();
        if (future == f44805e || future == (futureTask = f44806f) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.f44808d != Thread.currentThread());
    }
}
