package com.facebook.ads.redexgen.X;

import android.widget.RelativeLayout;
import java.util.HashMap;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class NP {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.27] */
    public static AnonymousClass27 A00(final C1076Nr c1076Nr, final U7 u10, final String str, final C07309h c07309h) {
        final boolean z10 = true;
        return new C9E(c1076Nr, u10, z10, str, c07309h) { // from class: com.facebook.ads.redexgen.X.27
            public ViewOnClickListenerC1207Ss A00;
            public P2 A01;
            public final InterfaceC0937Id A02 = this.A0I.A05().A01().A09();
            public final U7 A03;
            public final C07309h A04;
            public final String A05;
            public static final int A07 = (int) (Kn.A02 * (-4.0f));
            public static final int A06 = (int) (Kn.A02 * 6.0f);

            {
                this.A03 = u10;
                this.A05 = str;
                this.A04 = c07309h;
                u10.A1K(this);
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC1189Sa
            public void setupNativeCtaExtension(P2 p10) {
                this.A01 = p10;
                int iA0M = IN.A0M(this.A0I.A05());
                C1M c1mA01 = this.A03.A0z().A0m().A01();
                ViewOnClickListenerC1207Ss viewOnClickListenerC1207Ss = new ViewOnClickListenerC1207Ss(this.A0I.A05(), this.A03.A0z().A0G(), c1mA01, this.A02, N1.getDummyListener(), this.A04.A0c(), this.A03.A19());
                this.A00 = viewOnClickListenerC1207Ss;
                viewOnClickListenerC1207Ss.setCta(p10.A03().A0F(), this.A05, new HashMap());
                this.A03.A1K(this.A00);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                if (iA0M == 1) {
                    layoutParams.addRule(12);
                    ViewOnClickListenerC1207Ss viewOnClickListenerC1207Ss2 = this.A00;
                    int i10 = A06;
                    int extensionVariant = c1mA01.A09(false);
                    LO.A0P(viewOnClickListenerC1207Ss2, i10, 5, extensionVariant);
                    ((C9E) this).A06.addView(this.A00, layoutParams);
                    return;
                }
                if (iA0M != 2) {
                    return;
                }
                int extensionVariant2 = ((C9E) this).A06.getId();
                layoutParams.addRule(3, extensionVariant2);
                int extensionVariant3 = A07;
                layoutParams.setMargins(0, extensionVariant3, 0, 0);
                addView(this.A00, 0, layoutParams);
                ((C9E) this).A06.bringToFront();
            }
        };
    }

    public static C9E A01(C1076Nr c1076Nr, String str, C1179Rq c1179Rq) {
        return new C9E(c1076Nr, true, str, c1179Rq);
    }
}
