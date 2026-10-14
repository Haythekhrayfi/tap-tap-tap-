package l8;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class q0 extends vc.l implements uc.l<Double, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f32757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y9.g0 f32758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9.d f32759e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(View view, y9.g0 g0Var, v9.d dVar) {
        super(1);
        this.f32757c = view;
        this.f32758d = g0Var;
        this.f32759e = dVar;
    }

    @Override // uc.l
    public jc.w invoke(Double d10) {
        d10.doubleValue();
        b.o(this.f32757c, this.f32758d, this.f32759e);
        return jc.w.f31842a;
    }
}
