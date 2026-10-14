package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1201Sm extends AbstractC1072Nn {
    public C1201Sm(C1076Nr c1076Nr, boolean z10) {
        FrameLayout.LayoutParams layoutParams;
        super(c1076Nr, true);
        RelativeLayout relativeLayout = new RelativeLayout(c1076Nr.A05());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        LO.A0R(relativeLayout, getAdContextWrapper());
        LinearLayout linearLayout = new LinearLayout(c1076Nr.A05());
        linearLayout.setOrientation(!z10 ? 1 : 0);
        linearLayout.setGravity(80);
        LO.A0K(linearLayout);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(AbstractC1072Nn.A07, 0, AbstractC1072Nn.A07, AbstractC1072Nn.A07);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(z10 ? -2 : -1, -2);
        layoutParams4.setMargins(z10 ? AbstractC1072Nn.A07 : 0, z10 ? 0 : AbstractC1072Nn.A07, 0, 0);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(z10 ? 0 : -1, -2);
        layoutParams5.setMargins(0, 0, 0, 0);
        layoutParams5.weight = 1.0f;
        linearLayout.addView(getTitleDescContainer(), layoutParams5);
        linearLayout.addView(getCtaButton(), layoutParams4);
        relativeLayout.addView(linearLayout, layoutParams3);
        getCtaButton().A0A(c1076Nr.A04(), c1076Nr.A08());
        View viewA02 = c1076Nr.A02();
        if (viewA02 != null && IN.A16(getAdContextWrapper())) {
            if (z10) {
                layoutParams = new FrameLayout.LayoutParams(-2, -1);
            } else {
                layoutParams = new FrameLayout.LayoutParams(-1, -2);
            }
            layoutParams.gravity = 17;
            FrameLayout frameLayout = new FrameLayout(c1076Nr.A05());
            frameLayout.addView(viewA02, layoutParams);
            addView(frameLayout, new RelativeLayout.LayoutParams(-1, -1));
            NG.A00(viewA02, IN.A17(getAdContextWrapper()), new ViewOnClickListenerC1071Nm(this));
        } else if (viewA02 != null) {
            addView(viewA02, new RelativeLayout.LayoutParams(-1, -1));
        }
        addView(relativeLayout, layoutParams2);
        if (IN.A0z(c1076Nr.A05())) {
            getTitleDescContainer().setCTAClickListener(getCtaButton());
            if (c1076Nr.A08() != null) {
                c1076Nr.A08().setCTAClickListener(getCtaButton());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1072Nn
    public final void A0t(C1D c1d, String str, double d10, Bundle bundle) {
        super.A0t(c1d, str, d10, bundle);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1072Nn
    public final boolean A0u() {
        return true;
    }
}
