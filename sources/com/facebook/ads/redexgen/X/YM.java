package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class YM extends AbstractRunnableC0974Jr {
    public final /* synthetic */ YJ A00;
    public final /* synthetic */ JD A01;

    public YM(YJ yj, JD jd2) {
        this.A00 = yj;
        this.A01 = jd2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0974Jr
    public final void A01() {
        if (this.A00.A00.A00() != null) {
            this.A00.A00.A00().onAdError(KZ.A00(this.A01));
        }
    }
}
