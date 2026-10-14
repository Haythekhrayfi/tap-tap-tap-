package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ep, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0848Ep {
    public C0848Ep A00;
    public GR A01;
    public boolean A02;
    public final long A03;
    public final long A04;

    public C0848Ep(long j10, int i10) {
        this.A04 = j10;
        this.A03 = ((long) i10) + j10;
    }

    public final int A00(long j10) {
        return ((int) (j10 - this.A04)) + this.A01.A00;
    }

    public final C0848Ep A01() {
        this.A01 = null;
        C0848Ep c0848Ep = this.A00;
        this.A00 = null;
        return c0848Ep;
    }

    public final void A02(GR gr, C0848Ep c0848Ep) {
        this.A01 = gr;
        this.A00 = c0848Ep;
        this.A02 = true;
    }
}
