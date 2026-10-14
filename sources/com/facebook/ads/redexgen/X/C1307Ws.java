package com.facebook.ads.redexgen.X;

import android.media.MediaCrypto;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ws, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1307Ws implements BJ {
    public final MediaCrypto A00;
    public final boolean A01;

    public final MediaCrypto A00() {
        return this.A00;
    }

    public final boolean A01(String str) {
        return !this.A01 && this.A00.requiresSecureDecoderComponent(str);
    }
}
