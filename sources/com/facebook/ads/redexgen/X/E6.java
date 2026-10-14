package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class E6 extends MB {
    public final /* synthetic */ C5T A00;

    public E6(C5T c5t) {
        this.A00 = c5t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C8Y
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(MC mc2) {
        if (this.A00.A08 != null) {
            U7.A0L(this.A00.A08.getInternalNativeAd()).A1c(true, true);
        }
        this.A00.A00.onPlayed();
    }
}
