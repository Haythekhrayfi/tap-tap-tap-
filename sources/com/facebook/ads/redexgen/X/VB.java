package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class VB implements GL {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final GV A06;
    public final HJ A07;

    public VB(GV gv) {
        this(gv, 10000, 25000, 25000, 0.75f, 0.75f, 2000L, HJ.A00);
    }

    public VB(GV gv, int i10, int i11, int i12, float f10, float f11, long j10, HJ hj) {
        this.A06 = gv;
        this.A03 = i10;
        this.A02 = i11;
        this.A04 = i12;
        this.A00 = f10;
        this.A01 = f11;
        this.A05 = j10;
        this.A07 = hj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.GL
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final BA A4j(TrackGroup trackGroup, int... iArr) {
        return new BA(trackGroup, iArr, this.A06, this.A03, this.A02, this.A04, this.A00, this.A01, this.A05, this.A07);
    }
}
