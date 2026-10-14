package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1344Yd extends AbstractRunnableC0974Jr {
    public final /* synthetic */ YZ A00;
    public final /* synthetic */ JD A01;

    public C1344Yd(YZ yz, JD jd2) {
        this.A00 = yz;
        this.A01 = jd2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0974Jr
    public final void A01() {
        if (this.A00.A01.A06() != null) {
            this.A00.A01.A06().onError(this.A00.A01.A07(), KZ.A00(this.A01));
        }
    }
}
