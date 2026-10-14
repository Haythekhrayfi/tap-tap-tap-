package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class F9 extends AbstractC1389Zy {
    public final /* synthetic */ int A00;
    public final /* synthetic */ F8 A01;
    public final /* synthetic */ C1402aB A02;
    public final /* synthetic */ C0855Ew A03;
    public final /* synthetic */ C1337Xw A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F9(F8 f10, boolean z10, C1337Xw c1337Xw, C0855Ew c0855Ew, C1402aB c1402aB, int i10) {
        super(z10);
        this.A01 = f10;
        this.A04 = c1337Xw;
        this.A03 = c0855Ew;
        this.A02 = c1402aB;
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1389Zy
    public final void A00() {
        this.A01.A01.ACf(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1389Zy
    public final void A01(boolean z10) {
        F8.A0D = null;
        if (z10) {
            this.A04.A00().AEv(this.A03.A0s(), this.A02.A0m());
        }
        if (this.A00 == 0) {
            this.A01.A0C.set(true);
            this.A01.A01.ACc(this.A01);
        }
        this.A01.A0B(this.A04, this.A02, this.A00 + 1);
    }
}
