package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1416aP implements InterfaceC06435n {
    public final /* synthetic */ F8 A00;
    public final /* synthetic */ boolean A01;

    public C1416aP(F8 f10, boolean z10) {
        this.A00 = f10;
        this.A01 = z10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06435n
    public final void AAL() {
        if (!IN.A1R(this.A00.A04) || !this.A01) {
            this.A00.A0C.set(true);
            this.A00.A01.ACc(this.A00);
        } else {
            F8 f10 = this.A00;
            f10.A06 = OY.A01(f10.A04, (C0855Ew) this.A00.A03, 0, new C1417aQ(this));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06435n
    public final void AAM() {
        this.A00.A01.ACf(this.A00, AdError.CACHE_ERROR);
    }
}
