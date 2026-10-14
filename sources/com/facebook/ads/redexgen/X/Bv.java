package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Bv {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public boolean A04;
    public final byte[] A05 = new byte[10];

    public final void A00() {
        this.A04 = false;
    }

    public final void A01(BZ bz, int i10, int i11) throws InterruptedException, IOException {
        if (!this.A04) {
            bz.ADa(this.A05, 0, 10);
            bz.AEb();
            if (A6.A06(this.A05) == -1) {
                return;
            }
            this.A04 = true;
            this.A02 = 0;
        }
        if (this.A02 == 0) {
            this.A00 = i10;
            this.A01 = 0;
        }
        this.A01 += i11;
    }

    public final void A02(C0788Bu c0788Bu) {
        if (this.A04 && this.A02 > 0) {
            c0788Bu.A0W.AEh(this.A03, this.A00, this.A01, 0, c0788Bu.A0V);
            this.A02 = 0;
        }
    }

    public final void A03(C0788Bu c0788Bu, long j10) {
        if (!this.A04) {
            return;
        }
        int i10 = this.A02;
        int i11 = i10 + 1;
        this.A02 = i11;
        if (i10 == 0) {
            this.A03 = j10;
        }
        if (i11 < 16) {
            return;
        }
        c0788Bu.A0W.AEh(this.A03, this.A00, this.A01, 0, c0788Bu.A0V);
        this.A02 = 0;
    }
}
