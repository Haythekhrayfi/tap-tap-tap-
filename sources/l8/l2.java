package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class l2 extends vc.l implements uc.l<String, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o8.g f32550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g2 f32551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i8.k f32552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v9.d f32553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y9.d3 f32554g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q8.d f32555h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(o8.g gVar, g2 g2Var, i8.k kVar, v9.d dVar, y9.d3 d3Var, q8.d dVar2) {
        super(1);
        this.f32550c = gVar;
        this.f32551d = g2Var;
        this.f32552e = kVar;
        this.f32553f = dVar;
        this.f32554g = d3Var;
        this.f32555h = dVar2;
    }

    @Override // uc.l
    public jc.w invoke(String str) {
        String str2 = str;
        fd.j0.i(str2, "newPreview");
        if (!this.f32550c.j() && !fd.j0.d(str2, this.f32550c.getPreview$div_release())) {
            this.f32550c.l();
            g2 g2Var = this.f32551d;
            o8.g gVar = this.f32550c;
            i8.k kVar = this.f32552e;
            v9.d dVar = this.f32553f;
            y9.d3 d3Var = this.f32554g;
            g2Var.b(gVar, kVar, dVar, d3Var, this.f32555h, g2Var.d(dVar, gVar, d3Var));
        }
        return jc.w.f31842a;
    }
}
