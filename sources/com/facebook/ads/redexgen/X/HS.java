package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class HS {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;

    public HS(byte[] bArr, int i10) {
        C0913He c0913He = new C0913He(bArr);
        c0913He.A07(i10 * 8);
        this.A04 = c0913He.A04(16);
        this.A02 = c0913He.A04(16);
        this.A05 = c0913He.A04(24);
        this.A03 = c0913He.A04(24);
        this.A06 = c0913He.A04(20);
        this.A01 = c0913He.A04(3) + 1;
        this.A00 = c0913He.A04(5) + 1;
        this.A07 = ((((long) c0913He.A04(4)) & 15) << 32) | (((long) c0913He.A04(32)) & 4294967295L);
    }

    public final int A00() {
        return this.A00 * this.A06;
    }

    public final long A01() {
        return (this.A07 * 1000000) / ((long) this.A06);
    }
}
