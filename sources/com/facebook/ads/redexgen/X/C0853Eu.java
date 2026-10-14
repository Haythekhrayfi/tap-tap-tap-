package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Eu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0853Eu extends AbstractC1385Zu {
    public C0853Eu(C1337Xw c1337Xw, C05451q c05451q) {
        super(c1337Xw, c05451q);
    }

    private C1383Zs A00(Runnable runnable) {
        return new C1383Zs(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1385Zu
    public final C1C A0F() {
        C1421aU successfullyLoadedAdapter = (C1421aU) this.A01;
        if (successfullyLoadedAdapter != null) {
            return successfullyLoadedAdapter.A09();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1385Zu
    public final void A0L() {
        C1421aU interstitialAdapter = (C1421aU) this.A01;
        interstitialAdapter.A0B();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1385Zu
    public final void A0N(InterfaceC05170o interfaceC05170o, C8D c8d, C8B c8b, C05461r c05461r) {
        C1421aU c1421aU = (C1421aU) interfaceC05170o;
        C1384Zt c1384Zt = new C1384Zt(this, c05461r, c1421aU);
        A0E().postDelayed(c1384Zt, c8d.A05().A05());
        c1421aU.A0A(this.A0B, A00(c1384Zt), c05461r, this.A07.A0A, this.A07.A04, this.A07.A05, this.A07.A02);
    }
}
