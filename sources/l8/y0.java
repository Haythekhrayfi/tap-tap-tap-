package l8;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class y0 extends vc.l implements uc.l<y9.n6, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f32971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f32972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y9.l6 f32973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v9.d f32974f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(View view, v vVar, y9.l6 l6Var, v9.d dVar) {
        super(1);
        this.f32971c = view;
        this.f32972d = vVar;
        this.f32973e = l6Var;
        this.f32974f = dVar;
    }

    @Override // uc.l
    public jc.w invoke(y9.n6 n6Var) {
        fd.j0.i(n6Var, "it");
        b.k(this.f32971c, this.f32972d.f(this.f32973e), this.f32974f);
        return jc.w.f31842a;
    }
}
