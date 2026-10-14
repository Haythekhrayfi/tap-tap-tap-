package com.facebook.ads.redexgen.X;

import android.text.TextUtils;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class SB extends QQ {
    public final /* synthetic */ S7 A00;

    public SB(S7 s10) {
        this.A00 = s10;
    }

    @Override // com.facebook.ads.redexgen.X.QQ
    public final void A03() {
        if (!this.A00.A06.A07()) {
            this.A00.A06.A05();
            if (!TextUtils.isEmpty(this.A00.A01.A0s())) {
                this.A00.A04.A9P(this.A00.A01.A0s(), new ND().A03(this.A00.A0A).A02(this.A00.A06).A04(this.A00.A01.A0J()).A05());
                this.A00.A03.A0E().A2f();
                C2A.A00(this.A00.A01.A0I());
                this.A00.A08.A3y(this.A00.A09.A73());
            }
        }
    }
}
