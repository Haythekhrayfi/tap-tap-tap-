package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class DH implements WY {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public DH(long j10, long j11, Be be2) {
        this.A04 = j11;
        this.A01 = be2.A02;
        this.A00 = be2.A00;
        if (j10 == -1) {
            this.A02 = -1L;
            this.A03 = -9223372036854775807L;
        } else {
            this.A02 = j10 - j11;
            this.A03 = A7y(j10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0779Bh
    public final long A6j() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0779Bh
    public final C0778Bg A7k(long j10) {
        long j11 = this.A02;
        if (j11 == -1) {
            return new C0778Bg(new C0780Bi(0L, this.A04));
        }
        long j12 = (((long) this.A00) * j10) / 8000000;
        int i10 = this.A01;
        long jA0E = C0930Hv.A0E((j12 / ((long) i10)) * ((long) i10), 0L, j11 - ((long) i10));
        long j13 = this.A04 + jA0E;
        long jA7y = A7y(j13);
        C0780Bi seekPoint = new C0780Bi(jA7y, j13);
        if (jA7y < j10) {
            long j14 = this.A02;
            int i11 = this.A01;
            if (jA0E != j14 - ((long) i11)) {
                long j15 = ((long) i11) + j13;
                return new C0778Bg(seekPoint, new C0780Bi(A7y(j15), j15));
            }
        }
        return new C0778Bg(seekPoint);
    }

    @Override // com.facebook.ads.redexgen.X.WY
    public final long A7y(long j10) {
        return ((Math.max(0L, j10 - this.A04) * 1000000) * 8) / ((long) this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0779Bh
    public final boolean A93() {
        return this.A02 != -1;
    }
}
