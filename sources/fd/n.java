package fd;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends l1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k<?> f29595g;

    public n(k<?> kVar) {
        this.f29595g = kVar;
    }

    @Override // uc.l
    public /* bridge */ /* synthetic */ jc.w invoke(Throwable th) {
        w(th);
        return jc.w.f31842a;
    }

    @Override // fd.x
    public void w(Throwable th) {
        k<?> kVar = this.f29595g;
        Throwable thQ = kVar.q(x());
        if (!kVar.w() ? false : ((kd.f) kVar.f29584f).k(thQ)) {
            return;
        }
        kVar.x(thQ);
        kVar.n();
    }
}
