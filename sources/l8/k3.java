package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class k3 extends vc.l implements uc.l<Object, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o8.h f32531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y9.s3 f32532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9.d f32533e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(o8.h hVar, y9.s3 s3Var, v9.d dVar) {
        super(1);
        this.f32531c = hVar;
        this.f32532d = s3Var;
        this.f32533e = dVar;
    }

    @Override // uc.l
    public jc.w invoke(Object obj) {
        fd.j0.i(obj, "$noName_0");
        this.f32531c.setTextColor(this.f32532d.E.b(this.f32533e).intValue());
        return jc.w.f31842a;
    }
}
