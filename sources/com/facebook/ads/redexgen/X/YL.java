package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class YL extends AbstractRunnableC0974Jr {
    public final /* synthetic */ YK A00;

    public YL(YK yk) {
        this.A00 = yk;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0974Jr
    public final void A01() {
        if (this.A00.A01.A00.A00() != null) {
            this.A00.A01.A00.A00().onAdsLoaded();
        }
    }
}
