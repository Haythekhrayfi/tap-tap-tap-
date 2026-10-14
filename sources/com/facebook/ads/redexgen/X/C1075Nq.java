package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1075Nq {
    public View A02;
    public U7 A03;
    public AbstractC1018Ll A04;
    public JY A05;
    public final View A06;
    public final AbstractC1404aD A07;
    public final C1337Xw A08;
    public final InterfaceC0937Id A09;
    public final LG A0A;
    public final InterfaceC1019Lm A0B;
    public final QR A0C;
    public int A01 = 0;
    public int A00 = 1;

    public C1075Nq(C1337Xw c1337Xw, InterfaceC0937Id interfaceC0937Id, InterfaceC1019Lm interfaceC1019Lm, AbstractC1404aD abstractC1404aD, View view, QR qr, LG lg) {
        this.A08 = c1337Xw;
        this.A09 = interfaceC0937Id;
        this.A0B = interfaceC1019Lm;
        this.A07 = abstractC1404aD;
        this.A06 = view;
        this.A0C = qr;
        this.A0A = lg;
    }

    public final C1075Nq A0D(int i10) {
        this.A00 = i10;
        return this;
    }

    public final C1075Nq A0E(int i10) {
        this.A01 = i10;
        return this;
    }

    public final C1075Nq A0F(View view) {
        this.A02 = view;
        return this;
    }

    public final C1075Nq A0G(U7 u10) {
        this.A03 = u10;
        return this;
    }

    public final C1075Nq A0H(AbstractC1018Ll abstractC1018Ll) {
        this.A04 = abstractC1018Ll;
        return this;
    }

    public final C1075Nq A0I(JY jy) {
        this.A05 = jy;
        return this;
    }

    public final C1076Nr A0J() {
        return new C1076Nr(this);
    }
}
