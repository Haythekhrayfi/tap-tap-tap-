package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class BA extends VA {
    public float A00;
    public int A01;
    public int A02;
    public long A03;
    public final float A04;
    public final float A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final GV A0A;
    public final HJ A0B;

    public BA(TrackGroup trackGroup, int[] iArr, GV gv, long j10, long j11, long j12, float f10, float f11, long j13, HJ hj) {
        super(trackGroup, iArr);
        this.A0A = gv;
        this.A07 = j10 * 1000;
        this.A06 = j11 * 1000;
        this.A08 = 1000 * j12;
        this.A04 = f10;
        this.A05 = f11;
        this.A09 = j13;
        this.A0B = hj;
        this.A00 = 1.0f;
        this.A01 = 1;
        this.A03 = -9223372036854775807L;
        this.A02 = A00(Long.MIN_VALUE);
    }

    private int A00(long j10) {
        long jA61 = (long) (this.A0A.A61() * this.A04);
        int i10 = 0;
        for (int i11 = 0; i11 < super.A03; i11++) {
            if (j10 == Long.MIN_VALUE || !A00(i11, j10)) {
                if (Math.round(A6y(i11).A04 * this.A00) <= jA61) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }

    @Override // com.facebook.ads.redexgen.X.VA, com.facebook.ads.redexgen.X.GM
    public final void A5O() {
        this.A03 = -9223372036854775807L;
    }

    @Override // com.facebook.ads.redexgen.X.GM
    public final int A7m() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.VA, com.facebook.ads.redexgen.X.GM
    public final void ACE(float f10) {
        this.A00 = f10;
    }
}
