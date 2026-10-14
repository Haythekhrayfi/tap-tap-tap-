package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class W7 implements InterfaceC0793Ce {
    public int A00;
    public int A01;
    public int A03;
    public long A04;
    public long A05;
    public Format A06;
    public InterfaceC0782Bk A07;
    public String A08;
    public final String A0A;
    public final C0914Hf A09 = new C0914Hf(new byte[18]);
    public int A02 = 0;

    public W7(String str) {
        this.A0A = str;
    }

    private void A00() {
        byte[] bArr = this.A09.A00;
        if (this.A06 == null) {
            Format formatA03 = C0755Ah.A03(bArr, this.A08, this.A0A, null);
            this.A06 = formatA03;
            this.A07.A5i(formatA03);
        }
        this.A01 = C0755Ah.A01(bArr);
        this.A04 = (int) ((((long) C0755Ah.A02(bArr)) * 1000000) / ((long) this.A06.A0C));
    }

    private boolean A01(C0914Hf c0914Hf) {
        while (c0914Hf.A04() > 0) {
            int i10 = this.A03 << 8;
            this.A03 = i10;
            int iA0E = i10 | c0914Hf.A0E();
            this.A03 = iA0E;
            if (C0755Ah.A07(iA0E)) {
                this.A09.A00[0] = (byte) ((this.A03 >> 24) & 255);
                this.A09.A00[1] = (byte) ((this.A03 >> 16) & 255);
                this.A09.A00[2] = (byte) ((this.A03 >> 8) & 255);
                this.A09.A00[3] = (byte) (this.A03 & 255);
                this.A00 = 4;
                this.A03 = 0;
                return true;
            }
        }
        return false;
    }

    private boolean A02(C0914Hf c0914Hf, byte[] bArr, int i10) {
        int iMin = Math.min(c0914Hf.A04(), i10 - this.A00);
        int bytesToRead = this.A00;
        c0914Hf.A0c(bArr, bytesToRead, iMin);
        int bytesToRead2 = this.A00;
        int bytesToRead3 = bytesToRead2 + iMin;
        this.A00 = bytesToRead3;
        return bytesToRead3 == i10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void A4N(C0914Hf c0914Hf) {
        while (c0914Hf.A04() > 0) {
            switch (this.A02) {
                case 0:
                    if (A01(c0914Hf)) {
                        this.A02 = 1;
                    }
                    break;
                case 1:
                    if (A02(c0914Hf, this.A09.A00, 18)) {
                        A00();
                        this.A09.A0Y(0);
                        this.A07.AEg(this.A09, 18);
                        this.A02 = 2;
                    }
                    break;
                case 2:
                    int iMin = Math.min(c0914Hf.A04(), this.A01 - this.A00);
                    this.A07.AEg(c0914Hf, iMin);
                    int bytesToRead = this.A00 + iMin;
                    this.A00 = bytesToRead;
                    int i10 = this.A01;
                    if (bytesToRead == i10) {
                        this.A07.AEh(this.A05, 1, i10, 0, null);
                        this.A05 += this.A04;
                        this.A02 = 0;
                    }
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void A4k(InterfaceC0774Ba interfaceC0774Ba, C0804Cs c0804Cs) {
        c0804Cs.A05();
        this.A08 = c0804Cs.A04();
        this.A07 = interfaceC0774Ba.AFm(c0804Cs.A03(), 1);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void ADX() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void ADY(long j10, boolean z10) {
        this.A05 = j10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void AEk() {
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }
}
