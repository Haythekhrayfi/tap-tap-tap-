package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1384Zt extends K4 {
    public final /* synthetic */ C1421aU A00;
    public final /* synthetic */ C05461r A01;
    public final /* synthetic */ C0853Eu A02;

    public C1384Zt(C0853Eu c0853Eu, C05461r c05461r, C1421aU c1421aU) {
        this.A02 = c0853Eu;
        this.A01 = c05461r;
        this.A00 = c1421aU;
    }

    @Override // com.facebook.ads.redexgen.X.K4
    public final void A06() {
        this.A02.A0P(this.A01);
        this.A02.A0M(this.A00);
        this.A02.A00 = null;
        JD jdA00 = JD.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0E().A4o(jdA00.A03().getErrorCode(), jdA00.A04());
        this.A02.A06.A0G(jdA00);
    }
}
