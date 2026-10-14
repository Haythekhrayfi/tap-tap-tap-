package yb;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends a implements Runnable {
    public h(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f44808d = Thread.currentThread();
        try {
            this.f44807c.run();
            this.f44808d = null;
        } catch (Throwable th) {
            this.f44808d = null;
            lazySet(a.f44805e);
            dc.a.b(th);
        }
    }
}
