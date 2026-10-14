package yb;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, nb.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f44856d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f44857e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f44858f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f44859g = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f44860c;

    public j(Runnable runnable, qb.a aVar) {
        super(3);
        this.f44860c = runnable;
        lazySet(0, aVar);
    }

    public void a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f44859g) {
                return;
            }
            if (obj == f44857e) {
                future.cancel(false);
                return;
            } else if (obj == f44858f) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    @Override // nb.b
    public void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        while (true) {
            Object obj5 = get(1);
            if (obj5 == f44859g || obj5 == (obj3 = f44857e) || obj5 == (obj4 = f44858f)) {
                break;
            }
            boolean z10 = get(2) != Thread.currentThread();
            if (z10) {
                obj3 = obj4;
            }
            if (compareAndSet(1, obj5, obj3)) {
                if (obj5 == null) {
                    break;
                }
                ((Future) obj5).cancel(z10);
                break;
            }
        }
        do {
            obj = get(0);
            if (obj == f44859g || obj == (obj2 = f44856d) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((qb.a) obj).c(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        lazySet(2, Thread.currentThread());
        try {
            this.f44860c.run();
        } catch (Throwable th) {
            try {
                dc.a.b(th);
            } finally {
                lazySet(2, null);
                Object obj3 = get(0);
                if (obj3 != f44856d && compareAndSet(0, obj3, f44859g) && obj3 != null) {
                    ((qb.a) obj3).c(this);
                }
                do {
                    obj = get(1);
                    if (obj == f44857e || obj == f44858f) {
                        break;
                    }
                } while (!compareAndSet(1, obj, f44859g));
            }
        }
        lazySet(2, null);
        Object obj4 = get(0);
        if (obj4 != f44856d && compareAndSet(0, obj4, f44859g) && obj4 != null) {
            ((qb.a) obj4).c(this);
        }
        do {
            obj = get(1);
            Object obj5 = f44857e;
            if (obj == obj5) {
                return;
            } else {
                if (obj == obj2) {
                    return;
                }
            }
        } while (!compareAndSet(1, obj, f44859g));
    }
}
