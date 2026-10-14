package com.facebook.ads.redexgen.X;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Re, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1167Re extends QQ {
    public final /* synthetic */ C7F A00;

    public C1167Re(C7F c7f) {
        this.A00 = c7f;
    }

    @Override // com.facebook.ads.redexgen.X.QQ
    public final void A03() {
        if (!this.A00.A0E.A07()) {
            C7F c7f = this.A00;
            c7f.setImpressionRecordingFlag(c7f.A0E);
            if (!TextUtils.isEmpty(this.A00.A0A)) {
                ((TR) ((TR) this.A00)).A0C.A9P(this.A00.A0A, new ND().A03(this.A00.A09).A02(this.A00.A0E).A04(((TR) ((TR) this.A00)).A0A.A0J()).A05());
                this.A00.A0D.A0E().A2f();
                C2A.A00(this.A00.A03.A0I());
            }
        }
    }
}
