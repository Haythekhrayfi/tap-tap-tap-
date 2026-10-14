package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class d1 extends vc.l implements uc.l<y9.w0.j, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o8.u f32319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y9.w0 f32320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9.d f32321e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(o8.u uVar, y9.w0 w0Var, v9.d dVar) {
        super(1);
        this.f32319c = uVar;
        this.f32320d = w0Var;
        this.f32321e = dVar;
    }

    @Override // uc.l
    public jc.w invoke(y9.w0.j jVar) {
        fd.j0.i(jVar, "it");
        this.f32319c.setWrapDirection(!b.G(this.f32320d, this.f32321e) ? 1 : 0);
        return jc.w.f31842a;
    }
}
