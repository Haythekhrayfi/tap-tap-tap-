package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class w5 extends vc.l implements uc.l<Object, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m5 f32941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o8.i f32942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9.b<y9.t> f32943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v9.d f32944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v9.b<y9.u> f32945g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(m5 m5Var, o8.i iVar, v9.b<y9.t> bVar, v9.d dVar, v9.b<y9.u> bVar2) {
        super(1);
        this.f32941c = m5Var;
        this.f32942d = iVar;
        this.f32943e = bVar;
        this.f32944f = dVar;
        this.f32945g = bVar2;
    }

    @Override // uc.l
    public jc.w invoke(Object obj) {
        fd.j0.i(obj, "$noName_0");
        this.f32941c.h(this.f32942d, this.f32943e.b(this.f32944f), this.f32945g.b(this.f32944f));
        return jc.w.f31842a;
    }
}
