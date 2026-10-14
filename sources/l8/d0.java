package l8;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends vc.l implements uc.l<y9.n6, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f32316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y9.g0 f32317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9.d f32318e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(View view, y9.g0 g0Var, v9.d dVar) {
        super(1);
        this.f32316c = view;
        this.f32317d = g0Var;
        this.f32318e = dVar;
    }

    @Override // uc.l
    public jc.w invoke(y9.n6 n6Var) {
        fd.j0.i(n6Var, "it");
        b.e(this.f32316c, this.f32317d, this.f32318e);
        return jc.w.f31842a;
    }
}
