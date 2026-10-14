package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class y2 extends vc.l implements uc.l<Object, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r2 f32980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o8.h f32981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9.b<Long> f32982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v9.d f32983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y9.n6 f32984g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(r2 r2Var, o8.h hVar, v9.b<Long> bVar, v9.d dVar, y9.n6 n6Var) {
        super(1);
        this.f32980c = r2Var;
        this.f32981d = hVar;
        this.f32982e = bVar;
        this.f32983f = dVar;
        this.f32984g = n6Var;
    }

    @Override // uc.l
    public jc.w invoke(Object obj) {
        fd.j0.i(obj, "$noName_0");
        this.f32980c.a(this.f32981d, this.f32982e.b(this.f32983f), this.f32984g);
        return jc.w.f31842a;
    }
}
