package com.facebook.ads.redexgen.X;

import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class PN extends RelativeLayout implements InterfaceC1111Pa {
    public RN A00;

    public PN(C1337Xw c1337Xw) {
        super(c1337Xw);
    }

    public PN(C1337Xw c1337Xw, AttributeSet attributeSet, int i10) {
        super(c1337Xw, attributeSet, i10);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(params);
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Pa
    public final void A9B(RN rn) {
        this.A00 = rn;
        A07();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Pa
    public final void AFp(RN rn) {
        A08();
        this.A00 = null;
    }

    public RN getVideoView() {
        return this.A00;
    }
}
