package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9Z, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C9Z {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final EU A04;
    public final boolean A05;
    public final boolean A06;

    public C9Z(EU eu, long j10, long j11, long j12, long j13, boolean z10, boolean z11) {
        this.A04 = eu;
        this.A03 = j10;
        this.A02 = j11;
        this.A00 = j12;
        this.A01 = j13;
        this.A06 = z10;
        this.A05 = z11;
    }

    public final C9Z A00(int i10) {
        return new C9Z(this.A04.A00(i10), this.A03, this.A02, this.A00, this.A01, this.A06, this.A05);
    }

    public final C9Z A01(long j10) {
        return new C9Z(this.A04, j10, this.A02, this.A00, this.A01, this.A06, this.A05);
    }
}
