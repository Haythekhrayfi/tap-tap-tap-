package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class o2 extends vc.l implements uc.l<Object, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p2 f32669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o8.k f32670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9.d f32671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y9.k3 f32672f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(p2 p2Var, o8.k kVar, v9.d dVar, y9.k3 k3Var) {
        super(1);
        this.f32669c = p2Var;
        this.f32670d = kVar;
        this.f32671e = dVar;
        this.f32672f = k3Var;
    }

    @Override // uc.l
    public jc.w invoke(Object obj) {
        fd.j0.i(obj, "$noName_0");
        this.f32669c.a(this.f32670d, this.f32671e, this.f32672f);
        return jc.w.f31842a;
    }
}
