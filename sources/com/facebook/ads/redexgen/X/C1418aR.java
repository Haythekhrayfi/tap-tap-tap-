package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1418aR implements C6G {
    public final /* synthetic */ F8 A00;

    public C1418aR(F8 f10) {
        this.A00 = f10;
    }

    private void A00(boolean z10) {
        if (!z10) {
            this.A00.A01.ACf(this.A00, AdError.CACHE_ERROR);
        } else {
            this.A00.A0C.set(true);
            this.A00.A01.ACc(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C6G
    public final void AAc() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.X.C6G
    public final void AAl() {
        A00(true);
    }
}
