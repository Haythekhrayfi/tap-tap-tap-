package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1217Tc implements C5F {
    public final /* synthetic */ TZ A00;

    public C1217Tc(TZ tz) {
        this.A00 = tz;
    }

    @Override // com.facebook.ads.redexgen.X.C5F
    public final boolean A8j() {
        if (this.A00.A0B.canGoBack()) {
            this.A00.A0B.goBack();
            return true;
        }
        return false;
    }
}
