package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class VV implements InterfaceC0850Er {
    public final int A00;
    public final /* synthetic */ BR A01;

    public VV(BR br, int i10) {
        this.A01 = br;
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0850Er
    public final boolean A8z() {
        return this.A01.A0S(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0850Er
    public final void A9r() throws IOException {
        this.A01.A0Q();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0850Er
    public final int AE1(C9V c9v, X0 x10, boolean z10) {
        return this.A01.A0P(this.A00, c9v, x10, z10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0850Er
    public final int AFS(long j10) {
        return this.A01.A0O(this.A00, j10);
    }
}
