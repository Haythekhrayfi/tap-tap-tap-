package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class c2 extends vc.l implements uc.l<Object, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o8.f f32296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v9.b<y9.t> f32297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9.d f32298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v9.b<y9.u> f32299f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(o8.f fVar, v9.b<y9.t> bVar, v9.d dVar, v9.b<y9.u> bVar2) {
        super(1);
        this.f32296c = fVar;
        this.f32297d = bVar;
        this.f32298e = dVar;
        this.f32299f = bVar2;
    }

    @Override // uc.l
    public jc.w invoke(Object obj) {
        fd.j0.i(obj, "$noName_0");
        this.f32296c.setGravity(b.x(this.f32297d.b(this.f32298e), this.f32299f.b(this.f32298e)));
        return jc.w.f31842a;
    }
}
