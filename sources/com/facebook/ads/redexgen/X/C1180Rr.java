package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1180Rr implements OF {
    public final /* synthetic */ C1179Rq A00;

    public C1180Rr(C1179Rq c1179Rq) {
        this.A00 = c1179Rq;
    }

    @Override // com.facebook.ads.redexgen.X.OF
    public final void ADG(View view) {
        if (this.A00.A09) {
            this.A00.A07 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.OF
    public final void ADI(View view) {
        AbstractC1189Sa abstractC1189Sa = (AbstractC1189Sa) view;
        abstractC1189Sa.A0z();
        if (this.A00.A09) {
            this.A00.A07 = true;
        }
        if (this.A00.A04.A0Z() && ((Integer) abstractC1189Sa.getTag(-1593835536)).intValue() == 0) {
            this.A00.A04.A0U();
        }
    }
}
