package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1378Zn extends K4 {
    public final /* synthetic */ F8 A00;
    public final /* synthetic */ C05461r A01;
    public final /* synthetic */ ET A02;

    public C1378Zn(ET et, C05461r c05461r, F8 f10) {
        this.A02 = et;
        this.A01 = c05461r;
        this.A00 = f10;
    }

    @Override // com.facebook.ads.redexgen.X.K4
    public final void A06() {
        this.A02.A0P(this.A01);
        this.A02.A0M(this.A00);
        this.A02.A00 = null;
        AdErrorType adErrorType = AdErrorType.RV_AD_TIMEOUT;
        this.A02.A0B.A0E().A4o(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
        this.A02.A06.A0G(new JD(adErrorType, ""));
    }
}
