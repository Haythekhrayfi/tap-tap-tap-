package l8;

import y9.l7;

/* JADX INFO: loaded from: classes2.dex */
public final class u5 extends vc.l implements uc.l<String, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m5 f32886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o8.i f32887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i8.k f32888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v9.d f32889f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l7 f32890g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(m5 m5Var, o8.i iVar, i8.k kVar, v9.d dVar, l7 l7Var) {
        super(1);
        this.f32886c = m5Var;
        this.f32887d = iVar;
        this.f32888e = kVar;
        this.f32889f = dVar;
        this.f32890g = l7Var;
    }

    @Override // uc.l
    public jc.w invoke(String str) {
        fd.j0.i(str, "it");
        this.f32886c.g(this.f32887d, this.f32888e, this.f32889f, this.f32890g);
        this.f32886c.e(this.f32887d, this.f32889f, this.f32890g);
        return jc.w.f31842a;
    }
}
