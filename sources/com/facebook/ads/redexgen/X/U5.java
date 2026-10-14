package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class U5 extends AbstractRunnableC0974Jr {
    public final /* synthetic */ C0757Aj A00;
    public final /* synthetic */ JD A01;

    public U5(C0757Aj c0757Aj, JD jd2) {
        this.A00 = c0757Aj;
        this.A01 = jd2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0974Jr
    public final void A01() {
        this.A00.A01.onError(this.A00.A00, KZ.A00(this.A01));
    }
}
