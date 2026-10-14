package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1414aN implements InterfaceC06435n {
    public final /* synthetic */ F8 A00;

    public C1414aN(F8 f10) {
        this.A00 = f10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06435n
    public final void AAL() {
        this.A00.A0C.set(true);
        this.A00.A01.ACc(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06435n
    public final void AAM() {
        this.A00.A01.ACf(this.A00, AdError.CACHE_ERROR);
    }
}
