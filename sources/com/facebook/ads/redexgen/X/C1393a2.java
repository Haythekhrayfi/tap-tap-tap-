package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1393a2 implements InterfaceC05411m {
    public final /* synthetic */ C05331e A00;

    public C1393a2(C05331e c05331e) {
        this.A00 = c05331e;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05411m
    public final void ACB(AdError adError) {
        this.A00.A04.AAE(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05411m
    public final void ACC() {
        this.A00.A04.AAF();
    }
}
