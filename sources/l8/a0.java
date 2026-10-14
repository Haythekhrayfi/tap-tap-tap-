package l8;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends vc.l implements uc.l<Object, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f32231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v9.b<y9.t> f32232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9.d f32233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v9.b<y9.u> f32234f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(View view, v9.b<y9.t> bVar, v9.d dVar, v9.b<y9.u> bVar2) {
        super(1);
        this.f32231c = view;
        this.f32232d = bVar;
        this.f32233e = dVar;
        this.f32234f = bVar2;
    }

    @Override // uc.l
    public jc.w invoke(Object obj) {
        fd.j0.i(obj, "$noName_0");
        View view = this.f32231c;
        v9.b<y9.t> bVar = this.f32232d;
        y9.t tVarB = bVar == null ? null : bVar.b(this.f32233e);
        v9.b<y9.u> bVar2 = this.f32234f;
        b.a(view, tVarB, bVar2 != null ? bVar2.b(this.f32233e) : null);
        return jc.w.f31842a;
    }
}
