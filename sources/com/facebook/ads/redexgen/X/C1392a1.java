package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1392a1 implements InterfaceC06435n {
    public final /* synthetic */ C05331e A00;

    public C1392a1(C05331e c05331e) {
        this.A00 = c05331e;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06435n
    public final void AAL() {
        this.A00.A04.AAF();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06435n
    public final void AAM() {
        this.A00.A04.AAE(AdError.CACHE_ERROR);
    }
}
