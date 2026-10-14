package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.To, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1229To extends K4 {
    public final /* synthetic */ C0990Kh A00;

    public C1229To(C0990Kh c0990Kh) {
        this.A00 = c0990Kh;
    }

    @Override // com.facebook.ads.redexgen.X.K4
    public final void A06() {
        if (this.A00.A06()) {
            this.A00.A02();
            this.A00.A05.postDelayed(this, this.A00.A02);
        }
    }
}
