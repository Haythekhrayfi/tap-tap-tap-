package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class RR extends K4 {
    public final /* synthetic */ RN A00;

    public RR(RN rn) {
        this.A00 = rn;
    }

    @Override // com.facebook.ads.redexgen.X.K4
    public final void A06() {
        if (!this.A00.A03) {
            C8X c8x = this.A00.A0B;
            final int currentPositionInMillis = this.A00.getCurrentPositionInMillis();
            c8x.A02(new AbstractC1108Ox(currentPositionInMillis) { // from class: com.facebook.ads.redexgen.X.6z
            });
            this.A00.A07.postDelayed(this, this.A00.A00);
        }
    }
}
