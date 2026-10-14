package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C07259c {
    public final int A00;
    public final long A01;
    public final long A02;
    public final AbstractC07459x A03;
    public final EU A04;
    public final TrackGroupArray A05;
    public final GQ A06;
    public final Object A07;
    public final boolean A08;
    public volatile long A09;
    public volatile long A0A;

    public C07259c(AbstractC07459x abstractC07459x, long j10, TrackGroupArray trackGroupArray, GQ gq) {
        this(abstractC07459x, null, new EU(0), j10, -9223372036854775807L, 1, false, trackGroupArray, gq);
    }

    public C07259c(AbstractC07459x abstractC07459x, Object obj, EU eu, long j10, long j11, int i10, boolean z10, TrackGroupArray trackGroupArray, GQ gq) {
        this.A03 = abstractC07459x;
        this.A07 = obj;
        this.A04 = eu;
        this.A02 = j10;
        this.A01 = j11;
        this.A0A = j10;
        this.A09 = j10;
        this.A00 = i10;
        this.A08 = z10;
        this.A05 = trackGroupArray;
        this.A06 = gq;
    }

    public static void A00(C07259c c07259c, C07259c c07259c2) {
        c07259c2.A0A = c07259c.A0A;
        c07259c2.A09 = c07259c.A09;
    }

    public final C07259c A01(int i10) {
        C07259c c07259c = new C07259c(this.A03, this.A07, this.A04.A00(i10), this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, c07259c);
        return c07259c;
    }

    public final C07259c A02(int i10) {
        C07259c playbackInfo = new C07259c(this.A03, this.A07, this.A04, this.A02, this.A01, i10, this.A08, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C07259c A03(AbstractC07459x abstractC07459x, Object obj) {
        C07259c playbackInfo = new C07259c(abstractC07459x, obj, this.A04, this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C07259c A04(EU eu, long j10, long j11) {
        long j12 = j11;
        AbstractC07459x abstractC07459x = this.A03;
        Object obj = this.A07;
        if (!eu.A01()) {
            j12 = -9223372036854775807L;
        }
        return new C07259c(abstractC07459x, obj, eu, j10, j12, this.A00, this.A08, this.A05, this.A06);
    }

    public final C07259c A05(TrackGroupArray trackGroupArray, GQ gq) {
        C07259c playbackInfo = new C07259c(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, this.A08, trackGroupArray, gq);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C07259c A06(boolean z10) {
        C07259c playbackInfo = new C07259c(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, z10, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }
}
