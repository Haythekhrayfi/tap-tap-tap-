package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class SQ extends FrameLayout implements InterfaceC1020Ln {
    public String A00;
    public final InterfaceC1019Lm A01;
    public final OX A02;

    public SQ(C1337Xw c1337Xw, InterfaceC1019Lm interfaceC1019Lm, OX ox, String str) {
        super(c1337Xw);
        this.A02 = ox;
        this.A01 = interfaceC1019Lm;
        this.A00 = str;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void A9A(Intent intent, Bundle bundle, C5H c5h) {
        OX.A0B().incrementAndGet();
        this.A02.A0V();
        LO.A0J(this.A02.A0O());
        addView(this.A02.A0O(), new FrameLayout.LayoutParams(-1, -1));
        this.A01.A3P(this, new RelativeLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void AC8(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void ACY(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void AEi(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public String getCurrentClientToken() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void onDestroy() {
        this.A02.A0U();
        if (this.A02.A0N() != null) {
            this.A02.A0N().ABI();
        }
        OX.A0B().decrementAndGet();
    }

    public void setListener(InterfaceC1019Lm interfaceC1019Lm) {
    }
}
