package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1386Zv extends K4 {
    public final /* synthetic */ AbstractC1385Zu A00;
    public final /* synthetic */ JD A01;

    public C1386Zv(AbstractC1385Zu abstractC1385Zu, JD jd2) {
        this.A00 = abstractC1385Zu;
        this.A01 = jd2;
    }

    @Override // com.facebook.ads.redexgen.X.K4
    public final void A06() {
        this.A00.A0B.A0E().A4o(this.A01.A03().getErrorCode(), this.A01.A04());
        if (this.A00.A06 != null) {
            this.A00.A06.A0G(this.A01);
        }
    }
}
