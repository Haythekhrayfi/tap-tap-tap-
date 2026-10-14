package l8;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 extends vc.l implements uc.l<Object, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f32476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y9.x1 f32477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9.d f32478e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(View view, y9.x1 x1Var, v9.d dVar) {
        super(1);
        this.f32476c = view;
        this.f32477d = x1Var;
        this.f32478e = dVar;
    }

    @Override // uc.l
    public jc.w invoke(Object obj) {
        fd.j0.i(obj, "$noName_0");
        b.i(this.f32476c, this.f32477d, this.f32478e);
        return jc.w.f31842a;
    }
}
