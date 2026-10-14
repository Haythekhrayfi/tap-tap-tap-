package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1426aZ extends K4 {
    public final /* synthetic */ C1425aY A00;
    public final /* synthetic */ AnonymousClass93 A01;

    public C1426aZ(C1425aY c1425aY, AnonymousClass93 anonymousClass93) {
        this.A00 = c1425aY;
        this.A01 = anonymousClass93;
    }

    @Override // com.facebook.ads.redexgen.X.K4
    public final void A06() {
        this.A00.A00.A09();
        if (this.A00.A00.A0A != null) {
            this.A01.setAdViewabilityChecker(this.A00.A00.A0A);
            this.A00.A00.A0A.A0U();
        }
    }
}
