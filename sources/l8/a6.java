package l8;

import y9.m7;

/* JADX INFO: loaded from: classes2.dex */
public final class a6 extends vc.l implements uc.l<Object, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m5 f32251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o8.i f32252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9.d f32253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m7 f32254f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(m5 m5Var, o8.i iVar, v9.d dVar, m7 m7Var) {
        super(1);
        this.f32251c = m5Var;
        this.f32252d = iVar;
        this.f32253e = dVar;
        this.f32254f = m7Var;
    }

    @Override // uc.l
    public jc.w invoke(Object obj) {
        fd.j0.i(obj, "$noName_0");
        this.f32251c.i(this.f32252d, this.f32253e, this.f32254f);
        return jc.w.f31842a;
    }
}
