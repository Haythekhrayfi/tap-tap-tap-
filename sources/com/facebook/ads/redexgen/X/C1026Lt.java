package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.ads.internal.api.AdNativeComponentView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1026Lt extends AdNativeComponentView {
    public static final int A01 = (int) (Kn.A02 * 1.0f);
    public final ImageView A00;

    public C1026Lt(C1337Xw c1337Xw) {
        super(c1337Xw);
        M5 m10 = new M5(c1337Xw);
        this.A00 = m10;
        m10.setScaleType(ImageView.ScaleType.CENTER_CROP);
        EnumC0999Ks.A04(m10, EnumC0999Ks.A0A);
        addView(m10, new ViewGroup.LayoutParams(-1, -1));
        LO.A0M(m10, -2130706433);
        int i10 = A01;
        setPadding(i10, i10, i10, i10);
    }

    @Override // com.facebook.ads.internal.api.AdNativeComponentView
    public View getAdContentsView() {
        return this.A00;
    }

    public ImageView getImageCardView() {
        return this.A00;
    }
}
