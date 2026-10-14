package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C06726w extends MB {
    public final /* synthetic */ C0981Jy A00;

    public C06726w(C0981Jy c0981Jy) {
        this.A00 = c0981Jy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C8Y
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(MC mc2) {
        if (!this.A00.A03 || !this.A00.A02) {
            return;
        }
        this.A00.A03 = false;
        if (!this.A00.A0D(EnumC1132Pv.A04) && !this.A00.A04) {
            if (!this.A00.A0D(EnumC1132Pv.A03)) {
                return;
            }
            this.A00.A03();
            this.A00.A06(true, true);
            return;
        }
        this.A00.A04 = false;
        this.A00.A05.postDelayed(new K0(this), this.A00.A00);
    }
}
