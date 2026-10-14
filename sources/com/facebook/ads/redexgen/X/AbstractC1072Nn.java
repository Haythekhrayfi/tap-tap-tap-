package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.RelativeLayout;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1072Nn extends RelativeLayout {
    public static final int A07 = (int) (Kn.A02 * 16.0f);
    public static final int A08 = (int) (Kn.A02 * 28.0f);
    public C1M A00;
    public boolean A01;
    public final C1337Xw A02;
    public final InterfaceC0937Id A03;
    public final ViewOnClickListenerC1207Ss A04;
    public final C1065Ng A05;
    public final C1076Nr A06;

    public abstract boolean A0u();

    public AbstractC1072Nn(C1076Nr c1076Nr, boolean z10) {
        C1M c1mA00;
        super(c1076Nr.A05());
        this.A06 = c1076Nr;
        C1337Xw c1337XwA05 = c1076Nr.A05();
        this.A02 = c1337XwA05;
        this.A03 = c1076Nr.A06();
        if (c1076Nr.A00() == 1) {
            c1mA00 = c1076Nr.A04().A0m().A01();
        } else {
            c1mA00 = c1076Nr.A04().A0m().A00();
        }
        this.A00 = c1mA00;
        this.A01 = z10;
        ViewOnClickListenerC1207Ss viewOnClickListenerC1207Ss = new ViewOnClickListenerC1207Ss(c1076Nr.A05(), c1076Nr.A04().A0G(), this.A00, c1076Nr.A04().A0n().A0F().A06(), c1076Nr.A06(), c1076Nr.A09(), c1076Nr.A0B(), c1076Nr.A07());
        this.A04 = viewOnClickListenerC1207Ss;
        viewOnClickListenerC1207Ss.setRoundedCornersEnabled(A00());
        viewOnClickListenerC1207Ss.setViewShowsOverMedia(A0D());
        LO.A0G(1001, viewOnClickListenerC1207Ss);
        C1065Ng c1065Ng = new C1065Ng(c1337XwA05, this.A00, this.A01, A01(), A02());
        this.A05 = c1065Ng;
        LO.A0K(c1065Ng);
    }

    public boolean A00() {
        return true;
    }

    public boolean A01() {
        return true;
    }

    public boolean A02() {
        return true;
    }

    public void A0B(AnonymousClass73 anonymousClass73) {
    }

    public void A0C(C06746z c06746z) {
    }

    public boolean A0D() {
        return true;
    }

    public void A0o() {
    }

    public void A0p() {
    }

    public void A0q() {
    }

    public void A0r() {
    }

    public void A0s() {
    }

    public void A0t(C1D c1d, String str, double d10, Bundle bundle) {
        this.A05.A03(c1d.A0E().A05(), c1d.A0E().A01(), null, false, !A0u() && d10 > 0.0d && d10 < 1.0d);
        this.A04.setCta(c1d.A0F(), str, new HashMap());
    }

    public boolean A0v(boolean z10) {
        return false;
    }

    public C1337Xw getAdContextWrapper() {
        return this.A02;
    }

    public InterfaceC0937Id getAdEventManager() {
        return this.A03;
    }

    public int getCloseButtonStyle() {
        return 0;
    }

    public C1M getColors() {
        return this.A00;
    }

    public ViewOnClickListenerC1207Ss getCtaButton() {
        return this.A04;
    }

    public C1065Ng getTitleDescContainer() {
        return this.A05;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        C1M c1mA00;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 1) {
            c1mA00 = this.A06.A04().A0m().A01();
        } else {
            c1mA00 = this.A06.A04().A0m().A00();
        }
        this.A00 = c1mA00;
        this.A04.setViewShowsOverMedia(A0D());
        this.A04.setUpButtonColors(this.A00);
        this.A05.A02(this.A00, this.A01);
    }
}
