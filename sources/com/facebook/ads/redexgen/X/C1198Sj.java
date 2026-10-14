package com.facebook.ads.redexgen.X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1198Sj extends AbstractC1072Nn {
    public static final int A01 = Resources.getSystem().getDisplayMetrics().widthPixels;
    public final O9 A00;

    public C1198Sj(C1076Nr c1076Nr, boolean z10) {
        super(c1076Nr, z10);
        O9 o10 = new O9(c1076Nr.A05(), c1076Nr.A02());
        this.A00 = o10;
        o10.A01(getTitleDescContainer(), z10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(AbstractC1072Nn.A07, AbstractC1072Nn.A07, AbstractC1072Nn.A07, AbstractC1072Nn.A07);
        getCtaButton().setLayoutParams(layoutParams);
        FrameLayout insideContainerLayout = new FrameLayout(c1076Nr.A05());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(2, getCtaButton().getId());
        insideContainerLayout.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 17;
        layoutParams3.setMargins(AbstractC1072Nn.A07, 0, AbstractC1072Nn.A07, 0);
        insideContainerLayout.addView(o10, layoutParams3);
        addView(insideContainerLayout);
        addView(getCtaButton());
        getCtaButton().A0A(c1076Nr.A04(), c1076Nr.A08());
        View viewA02 = c1076Nr.A02();
        if (viewA02 != null && IN.A16(getAdContextWrapper())) {
            NG.A00(viewA02, IN.A17(getAdContextWrapper()), new ViewOnClickListenerC1080Nv(this));
        }
        if (IN.A0z(c1076Nr.A05())) {
            getTitleDescContainer().setCTAClickListener(getCtaButton());
            View mMediaView = c1076Nr.A08();
            if (mMediaView != null) {
                c1076Nr.A08().setCTAClickListener(getCtaButton());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1072Nn
    public final boolean A02() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1072Nn
    public final boolean A0D() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1072Nn
    public final void A0t(C1D c1d, String str, double d10, Bundle bundle) {
        super.A0t(c1d, str, d10, bundle);
        if (d10 > 0.0d) {
            int mediaHeight = (int) (((double) (A01 - (AbstractC1072Nn.A07 * 2))) / d10);
            this.A00.A00(mediaHeight);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1072Nn
    public final boolean A0u() {
        return false;
    }
}
