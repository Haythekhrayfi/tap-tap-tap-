package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Or, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1102Or {
    public String A02;
    public String A03;
    public final C1K A04;
    public final C1W A05;
    public final C1337Xw A06;
    public C1M A01 = C1M.A01(null);
    public int A00 = 1000;

    public C1102Or(C1337Xw c1337Xw, C1K c1k, C1W c1w) {
        this.A06 = c1337Xw;
        this.A04 = c1k;
        this.A05 = c1w;
    }

    public final C1102Or A07(int i10) {
        this.A00 = i10;
        return this;
    }

    public final C1102Or A08(C1M c1m) {
        this.A01 = c1m;
        return this;
    }

    public final C1102Or A09(String str) {
        this.A02 = str;
        return this;
    }

    public final C1102Or A0A(String str) {
        this.A03 = str;
        return this;
    }

    public final C1104Ot A0B() {
        return new C1104Ot(this, null);
    }
}
