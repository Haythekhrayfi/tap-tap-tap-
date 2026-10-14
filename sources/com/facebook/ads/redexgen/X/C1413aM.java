package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1413aM implements InterfaceC05411m {
    public final /* synthetic */ F8 A00;

    public C1413aM(F8 f10) {
        this.A00 = f10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05411m
    public final void ACB(AdError adError) {
        this.A00.A01.ACf(this.A00, adError);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05411m
    public final void ACC() {
        this.A00.A0C.set(true);
        this.A00.A01.ACc(this.A00);
    }
}
