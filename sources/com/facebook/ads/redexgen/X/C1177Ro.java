package com.facebook.ads.redexgen.X;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ro, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1177Ro extends QQ {
    public final /* synthetic */ C7G A00;

    public C1177Ro(C7G c7g) {
        this.A00 = c7g;
    }

    @Override // com.facebook.ads.redexgen.X.QQ
    public final void A03() {
        if (!this.A00.A0H.A07()) {
            C7G c7g = this.A00;
            c7g.setImpressionRecordingFlag(c7g.A0H);
            if (!TextUtils.isEmpty(this.A00.A0C)) {
                ((TR) ((TR) this.A00)).A0C.A9P(this.A00.A0C, new ND().A03(this.A00.A0B).A02(this.A00.A0H).A04(((TR) ((TR) this.A00)).A0A.A0J()).A05());
                this.A00.A0G.A0E().A2f();
                C2A.A00(this.A00.A04.A0I());
            }
        }
    }
}
