package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1343Yc extends AbstractRunnableC0974Jr {
    public final /* synthetic */ YZ A00;

    public C1343Yc(YZ yz) {
        this.A00 = yz;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0974Jr
    public final void A01() {
        if (this.A00.A01.A06() != null) {
            this.A00.A01.A06().onAdLoaded(this.A00.A01.A07());
        }
    }
}
