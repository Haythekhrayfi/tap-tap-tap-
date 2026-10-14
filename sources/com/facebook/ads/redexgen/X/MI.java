package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class MI {
    public int A00;
    public LW A01;
    public MM A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public final C1337Xw A0C;
    public boolean A0A = true;
    public boolean A0B = true;
    public boolean A09 = true;
    public boolean A07 = true;
    public boolean A08 = true;

    public MI(C1337Xw c1337Xw, MM mm) {
        this.A0C = c1337Xw;
        this.A02 = mm;
    }

    public final MI A0D(int i10) {
        this.A00 = i10;
        return this;
    }

    public final MI A0E(LW lw) {
        this.A01 = lw;
        return this;
    }

    public final MI A0F(String str) {
        this.A03 = str;
        return this;
    }

    public final MI A0G(String str) {
        this.A04 = str;
        return this;
    }

    public final MI A0H(String str) {
        this.A05 = str;
        return this;
    }

    public final MI A0I(String str) {
        this.A06 = str;
        return this;
    }

    public final MI A0J(boolean z10) {
        this.A09 = z10;
        return this;
    }

    public final MI A0K(boolean z10) {
        this.A0A = z10;
        return this;
    }

    public final MI A0L(boolean z10) {
        this.A0B = z10;
        return this;
    }

    public final MJ A0M() {
        return new MJ(this, null);
    }
}
