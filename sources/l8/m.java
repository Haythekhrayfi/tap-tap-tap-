package l8;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends vc.l implements uc.a<jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f32574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f32575d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(View.OnClickListener onClickListener, View view) {
        super(0);
        this.f32574c = onClickListener;
        this.f32575d = view;
    }

    @Override // uc.a
    public jc.w invoke() {
        this.f32574c.onClick(this.f32575d);
        return jc.w.f31842a;
    }
}
