package l8;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 extends vc.l implements uc.l<Double, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f32274c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(View view) {
        super(1);
        this.f32274c = view;
    }

    @Override // uc.l
    public jc.w invoke(Double d10) {
        double dDoubleValue = d10.doubleValue();
        View view = this.f32274c;
        fd.j0.i(view, "<this>");
        view.setAlpha((float) dDoubleValue);
        return jc.w.f31842a;
    }
}
