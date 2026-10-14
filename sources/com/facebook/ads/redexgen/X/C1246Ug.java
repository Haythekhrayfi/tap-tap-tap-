package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ug, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1246Ug implements HW {
    public long A00;
    public long A01;
    public C07269d A02 = C07269d.A04;
    public boolean A03;
    public final HJ A04;

    public C1246Ug(HJ hj) {
        this.A04 = hj;
    }

    public final void A00() {
        if (!this.A03) {
            this.A00 = this.A04.A5N();
            this.A03 = true;
        }
    }

    public final void A01() {
        if (this.A03) {
            A02(A7b());
            this.A03 = false;
        }
    }

    public final void A02(long j10) {
        this.A01 = j10;
        if (this.A03) {
            this.A00 = this.A04.A5N();
        }
    }

    @Override // com.facebook.ads.redexgen.X.HW
    public final C07269d A7Y() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.HW
    public final long A7b() {
        long elapsedSinceBaseMs = this.A01;
        if (this.A03) {
            long jA5N = this.A04.A5N();
            long positionUs = this.A00;
            long j10 = jA5N - positionUs;
            if (this.A02.A01 == 1.0f) {
                long positionUs2 = C9C.A00(j10);
                return elapsedSinceBaseMs + positionUs2;
            }
            long positionUs3 = this.A02.A00(j10);
            return elapsedSinceBaseMs + positionUs3;
        }
        return elapsedSinceBaseMs;
    }

    @Override // com.facebook.ads.redexgen.X.HW
    public final C07269d AFE(C07269d c07269d) {
        if (this.A03) {
            A02(A7b());
        }
        this.A02 = c07269d;
        return c07269d;
    }
}
