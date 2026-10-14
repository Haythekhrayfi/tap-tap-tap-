package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RY extends C4O<RW> {
    public final int A00;
    public final C1337Xw A01;
    public final ViewOnClickListenerC1207Ss A02;
    public final List<String> A03;

    public RY(C1337Xw c1337Xw, List<String> screenshotUrls, int i10, ViewOnClickListenerC1207Ss viewOnClickListenerC1207Ss) {
        this.A03 = screenshotUrls;
        this.A00 = i10;
        this.A01 = c1337Xw;
        this.A02 = viewOnClickListenerC1207Ss;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4O
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final RW A0C(ViewGroup viewGroup, int i10) {
        RX rx = new RX(this.A01);
        if (IN.A12(this.A01)) {
            rx.setOnClickListener(new PJ(this));
        }
        return new RW(rx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4O
    /* JADX INFO: renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final void A0E(RW rw, int i10) {
        String str = this.A03.get(i10);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int leftMargin = this.A00;
        int i11 = leftMargin * 4;
        if (i10 == 0) {
            leftMargin = i11;
        }
        marginLayoutParams.setMargins(leftMargin, 0, i10 >= A0D() + (-1) ? this.A00 * 4 : this.A00, 0);
        rw.A0l().setLayoutParams(marginLayoutParams);
        rw.A0l().A00(str);
    }

    @Override // com.facebook.ads.redexgen.X.C4O
    public final int A0D() {
        return this.A03.size();
    }
}
