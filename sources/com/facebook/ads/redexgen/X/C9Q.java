package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9Q, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C9Q {
    public int A00;
    public int A01;
    public C07259c A02;
    public boolean A03;

    public C9Q() {
    }

    public final void A03(int i10) {
        this.A01 += i10;
    }

    public final void A04(int i10) {
        if (this.A03 && this.A00 != 4) {
            HG.A03(i10 == 4);
        } else {
            this.A03 = true;
            this.A00 = i10;
        }
    }

    public final void A05(C07259c c07259c) {
        this.A02 = c07259c;
        this.A01 = 0;
        this.A03 = false;
    }

    public final boolean A06(C07259c c07259c) {
        return c07259c != this.A02 || this.A01 > 0 || this.A03;
    }
}
