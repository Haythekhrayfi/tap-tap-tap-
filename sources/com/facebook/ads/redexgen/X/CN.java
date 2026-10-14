package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class CN {
    public final int A00;
    public final int A01;
    public final long A02;
    public final CK A03;
    public final int[] A04;
    public final int[] A05;
    public final long[] A06;
    public final long[] A07;

    public CN(CK ck, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        HG.A03(iArr.length == jArr2.length);
        HG.A03(jArr.length == jArr2.length);
        HG.A03(iArr2.length == jArr2.length);
        this.A03 = ck;
        this.A06 = jArr;
        this.A05 = iArr;
        this.A00 = i10;
        this.A07 = jArr2;
        this.A04 = iArr2;
        this.A02 = j10;
        this.A01 = jArr.length;
    }

    public final int A00(long j10) {
        for (int iA0B = C0930Hv.A0B(this.A07, j10, true, false); iA0B >= 0; iA0B--) {
            int startIndex = this.A04[iA0B];
            if ((startIndex & 1) != 0) {
                return iA0B;
            }
        }
        return -1;
    }

    public final int A01(long j10) {
        for (int iA0A = C0930Hv.A0A(this.A07, j10, true, false); iA0A < startIndex; iA0A++) {
            int startIndex = this.A04[iA0A];
            if ((startIndex & 1) != 0) {
                return iA0A;
            }
        }
        return -1;
    }
}
