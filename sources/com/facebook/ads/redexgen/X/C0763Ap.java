package com.facebook.ads.redexgen.X;

import android.media.MediaCodec;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ap, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0763Ap {
    public final MediaCodec.CryptoInfo.Pattern A00;
    public final MediaCodec.CryptoInfo A01;

    public C0763Ap(MediaCodec.CryptoInfo cryptoInfo) {
        this.A01 = cryptoInfo;
        this.A00 = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00(int i10, int i11) {
        this.A00.set(i10, i11);
        this.A01.setPattern(this.A00);
    }
}
