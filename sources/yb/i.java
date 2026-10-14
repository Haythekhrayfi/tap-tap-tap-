package yb;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends a implements Callable<Void> {
    public i(Runnable runnable) {
        super(runnable);
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        this.f44808d = Thread.currentThread();
        try {
            this.f44807c.run();
            return null;
        } finally {
            lazySet(a.f44805e);
            this.f44808d = null;
        }
    }
}
