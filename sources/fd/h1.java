package fd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class h1 extends l1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f29574h = AtomicIntegerFieldUpdater.newUpdater(h1.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final uc.l<Throwable, jc.w> f29575g;

    /* JADX WARN: Multi-variable type inference failed */
    public h1(uc.l<? super Throwable, jc.w> lVar) {
        this.f29575g = lVar;
    }

    @Override // uc.l
    public /* bridge */ /* synthetic */ jc.w invoke(Throwable th) {
        w(th);
        return jc.w.f31842a;
    }

    @Override // fd.x
    public void w(Throwable th) {
        if (f29574h.compareAndSet(this, 0, 1)) {
            this.f29575g.invoke(th);
        }
    }
}
