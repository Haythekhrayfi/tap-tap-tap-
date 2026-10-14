package l8;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class t0 extends vc.l implements uc.l<y9.n6, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f32848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y9.g0 f32849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9.d f32850e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(View view, y9.g0 g0Var, v9.d dVar) {
        super(1);
        this.f32848c = view;
        this.f32849d = g0Var;
        this.f32850e = dVar;
    }

    @Override // uc.l
    public jc.w invoke(y9.n6 n6Var) {
        fd.j0.i(n6Var, "it");
        b.q(this.f32848c, this.f32849d, this.f32850e);
        return jc.w.f31842a;
    }
}
