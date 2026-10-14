package jd;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements mc.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f31864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mc.f f31865d;

    public k(Throwable th, mc.f fVar) {
        this.f31864c = th;
        this.f31865d = fVar;
    }

    @Override // mc.f
    public <R> R Y(R r10, uc.p<? super R, ? super mc.f.a, ? extends R> pVar) {
        return (R) this.f31865d.Y(r10, pVar);
    }

    @Override // mc.f
    public <E extends mc.f.a> E b(mc.f.b<E> bVar) {
        return (E) this.f31865d.b(bVar);
    }

    @Override // mc.f
    public mc.f i(mc.f fVar) {
        return this.f31865d.i(fVar);
    }

    @Override // mc.f
    public mc.f p(mc.f.b<?> bVar) {
        return this.f31865d.p(bVar);
    }
}
