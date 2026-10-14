package l8;

import y9.l7;

/* JADX INFO: loaded from: classes2.dex */
public final class c6 extends vc.l implements uc.l<Object, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m5 f32309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o8.i f32310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l7 f32311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v9.d f32312f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(m5 m5Var, o8.i iVar, l7 l7Var, v9.d dVar) {
        super(1);
        this.f32309c = m5Var;
        this.f32310d = iVar;
        this.f32311e = l7Var;
        this.f32312f = dVar;
    }

    @Override // uc.l
    public jc.w invoke(Object obj) {
        fd.j0.i(obj, "$noName_0");
        m5 m5Var = this.f32309c;
        this.f32310d.setTypeface(m5Var.f32592b.a(this.f32311e.f41286r.b(this.f32312f), this.f32311e.f41289u.b(this.f32312f)));
        return jc.w.f31842a;
    }
}
