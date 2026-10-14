package l8;

import y9.l7;

/* JADX INFO: loaded from: classes2.dex */
public final class r5 extends vc.l implements uc.l<Object, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m5 f32804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o8.i f32805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9.d f32806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l7 f32807f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(m5 m5Var, o8.i iVar, v9.d dVar, l7 l7Var) {
        super(1);
        this.f32804c = m5Var;
        this.f32805d = iVar;
        this.f32806e = dVar;
        this.f32807f = l7Var;
    }

    @Override // uc.l
    public jc.w invoke(Object obj) {
        fd.j0.i(obj, "$noName_0");
        this.f32804c.d(this.f32805d, this.f32806e, this.f32807f);
        return jc.w.f31842a;
    }
}
