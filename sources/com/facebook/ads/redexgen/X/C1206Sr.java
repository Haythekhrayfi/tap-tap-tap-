package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1206Sr extends K4 {
    public final /* synthetic */ NS A00;

    public C1206Sr(NS ns) {
        this.A00 = ns;
    }

    @Override // com.facebook.ads.redexgen.X.K4
    public final void A06() {
        if (this.A00.isPressed()) {
            NS ns = this.A00;
            ns.postDelayed(this, ns.A07);
        } else {
            this.A00.setPressed(true);
            NS ns2 = this.A00;
            ns2.postOnAnimationDelayed(ns2.A09, 250L);
        }
    }
}
