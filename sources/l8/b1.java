package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class b1 extends vc.l implements uc.l<y9.w0.j, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o8.j f32275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y9.w0 f32276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9.d f32277e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(o8.j jVar, y9.w0 w0Var, v9.d dVar) {
        super(1);
        this.f32275c = jVar;
        this.f32276d = w0Var;
        this.f32277e = dVar;
    }

    @Override // uc.l
    public jc.w invoke(y9.w0.j jVar) {
        fd.j0.i(jVar, "it");
        this.f32275c.setOrientation(!b.G(this.f32276d, this.f32277e) ? 1 : 0);
        return jc.w.f31842a;
    }
}
