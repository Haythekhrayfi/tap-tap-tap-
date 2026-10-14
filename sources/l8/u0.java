package l8;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class u0 extends vc.l implements uc.l<Double, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f32871c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(View view) {
        super(1);
        this.f32871c = view;
    }

    @Override // uc.l
    public jc.w invoke(Double d10) {
        b.f(this.f32871c, (float) d10.doubleValue());
        return jc.w.f31842a;
    }
}
