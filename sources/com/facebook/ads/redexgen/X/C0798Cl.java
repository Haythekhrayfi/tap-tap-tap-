package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0798Cl {
    public int A00;
    public long A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final InterfaceC0793Ce A05;
    public final C0913He A06 = new C0913He(new byte[64]);
    public final C0926Hr A07;

    public C0798Cl(InterfaceC0793Ce interfaceC0793Ce, C0926Hr c0926Hr) {
        this.A05 = interfaceC0793Ce;
        this.A07 = c0926Hr;
    }

    private void A00() {
        this.A06.A08(8);
        this.A03 = this.A06.A0F();
        this.A02 = this.A06.A0F();
        this.A06.A08(6);
        this.A00 = this.A06.A04(8);
    }

    private void A01() {
        this.A01 = 0L;
        if (this.A03) {
            this.A06.A08(4);
            long jA04 = ((long) this.A06.A04(3)) << 30;
            this.A06.A08(1);
            long pts = this.A06.A04(15) << 15;
            long j10 = jA04 | pts;
            this.A06.A08(1);
            long pts2 = this.A06.A04(15);
            long j11 = j10 | pts2;
            this.A06.A08(1);
            if (!this.A04 && this.A02) {
                this.A06.A08(4);
                long pts3 = this.A06.A04(3);
                this.A06.A08(1);
                long pts4 = (pts3 << 30) | ((long) (this.A06.A04(15) << 15));
                this.A06.A08(1);
                long pts5 = pts4 | ((long) this.A06.A04(15));
                this.A06.A08(1);
                this.A07.A07(pts5);
                this.A04 = true;
            }
            this.A01 = this.A07.A07(j11);
        }
    }

    public final void A02() {
        this.A04 = false;
        this.A05.AEk();
    }

    public final void A03(C0914Hf c0914Hf) throws C07249b {
        c0914Hf.A0c(this.A06.A00, 0, 3);
        this.A06.A07(0);
        A00();
        c0914Hf.A0c(this.A06.A00, 0, this.A00);
        this.A06.A07(0);
        A01();
        this.A05.ADY(this.A01, true);
        this.A05.A4N(c0914Hf);
        this.A05.ADX();
    }
}
