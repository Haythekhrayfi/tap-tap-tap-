package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class MK extends FrameLayout {
    public int A00;
    public C2G A01;
    public C2H A02;
    public C2I A03;
    public final C2E A04;
    public final C1337Xw A05;
    public final InterfaceC0937Id A06;
    public final InterfaceC1019Lm A07;
    public final InterfaceC1020Ln A08;
    public final String A09;
    public final C1W A0A;
    public final MM A0B;

    public abstract void A0L();

    public abstract void A0M();

    public abstract void A0N(C2I c2i, C2G c2g);

    public abstract void A0O(C2I c2i, C2G c2g);

    public abstract boolean A0P();

    public MK(C1337Xw c1337Xw, InterfaceC0937Id interfaceC0937Id, String str) {
        this(c1337Xw, interfaceC0937Id, str, null, null, null);
    }

    public MK(C1337Xw c1337Xw, InterfaceC0937Id interfaceC0937Id, String str, C1W c1w, InterfaceC1020Ln interfaceC1020Ln, InterfaceC1019Lm interfaceC1019Lm) {
        super(c1337Xw);
        this.A00 = 0;
        this.A01 = C2G.A04;
        this.A03 = null;
        this.A0B = new TD(this);
        this.A05 = c1337Xw;
        this.A06 = interfaceC0937Id;
        this.A08 = interfaceC1020Ln;
        this.A07 = interfaceC1019Lm;
        this.A09 = str;
        this.A0A = c1w;
        this.A04 = C2F.A00(c1337Xw.A01());
    }

    public static /* synthetic */ int A00(MK mk) {
        int i10 = mk.A00;
        mk.A00 = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int A01(MK mk) {
        int i10 = mk.A00;
        mk.A00 = i10 - 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        if (this.A02.A0A()) {
            this.A06.A9D(this.A09, this.A02.A02());
            this.A02.A03();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C() {
        this.A03 = null;
        this.A02.A05();
        A0L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(C2I c2i) {
        this.A02.A08(this.A01);
        A0N(c2i, this.A01);
        C05240v.A01(this.A05).A0L();
        if (A0P()) {
            A0B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(C2I c2i) {
        this.A03 = c2i;
        this.A02.A09(this.A01, this.A00);
        A0O(c2i, this.A01);
    }

    public final void A0J() {
        A0B();
    }

    public final void A0K() {
        this.A02 = new C2H(new C0945Il(this.A09, this.A06));
        InterfaceC1020Ln interfaceC1020Ln = this.A08;
        if (interfaceC1020Ln != null) {
            interfaceC1020Ln.AC8(true);
        }
        A0C();
    }
}
