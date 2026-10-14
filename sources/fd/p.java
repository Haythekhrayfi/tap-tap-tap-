package fd;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends l1 implements o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q f29606g;

    public p(q qVar) {
        this.f29606g = qVar;
    }

    @Override // fd.o
    public boolean e(Throwable th) {
        return x().M(th);
    }

    @Override // fd.o
    public j1 getParent() {
        return x();
    }

    @Override // uc.l
    public /* bridge */ /* synthetic */ jc.w invoke(Throwable th) {
        w(th);
        return jc.w.f31842a;
    }

    @Override // fd.x
    public void w(Throwable th) {
        this.f29606g.n(x());
    }
}
