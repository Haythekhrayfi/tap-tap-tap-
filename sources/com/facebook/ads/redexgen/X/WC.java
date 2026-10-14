package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WC implements InterfaceC0793Ce {
    public static String[] A0C = {"jvuSXyRxFwWN5M53JxqXTqjBlHPmO5yS", "Nx6fwt5mIYqSRgPxQoB61NXpIqViXreb", "NbRu72XFqCPxMxVeHFzrnyrjREaihhdr", "Z3KBXmMomO9rJfjLZz1JQz2Kw0Fx28Ab", "zLbRIBf4nYWkQfyOEtwQDAQMGMEl8", "zvpubyWaUoinARhzufpjCqD1DbWF7ekR", "kxIGpaDKqbCPDUN5La7nQCmFVSx", "CqFgkkKKOYx1Bj1EdbgCjsaN4ksOOdQn"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public Format A05;
    public InterfaceC0782Bk A06;
    public String A07;
    public boolean A08;
    public final C0913He A09;
    public final C0914Hf A0A;
    public final String A0B;

    public WC() {
        this(null);
    }

    public WC(String str) {
        C0913He c0913He = new C0913He(new byte[128]);
        this.A09 = c0913He;
        this.A0A = new C0914Hf(c0913He.A00);
        this.A02 = 0;
        this.A0B = str;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    private void A00() {
        this.A09.A07(0);
        A5 a5A09 = A6.A09(this.A09);
        if (this.A05 == null || a5A09.A00 != this.A05.A05) {
            Format formatA07 = Format.A07(this.A07, a5A09.A05, null, -1, -1, a5A09.A00, a5A09.A03, null, null, 0, this.A0B);
            this.A05 = formatA07;
            this.A06.A5i(formatA07);
        } else {
            int i10 = a5A09.A03;
            int i11 = this.A05.A0C;
            if (A0C[6].length() != 27) {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[2] = "rmTuGOWOeoxLIH1QLptnusvxizN1V0jV";
            strArr[5] = "2RMufqWRuZFq3WutxyrHt00cbPeHqbYj";
            if (i10 != i11 || a5A09.A05 != this.A05.A0O) {
                Format formatA08 = Format.A07(this.A07, a5A09.A05, null, -1, -1, a5A09.A00, a5A09.A03, null, null, 0, this.A0B);
                this.A05 = formatA08;
                this.A06.A5i(formatA08);
            }
        }
        this.A01 = a5A09.A01;
        this.A03 = (((long) a5A09.A02) * 1000000) / ((long) this.A05.A0C);
    }

    private boolean A01(C0914Hf c0914Hf) {
        while (true) {
            if (c0914Hf.A04() <= 0) {
                return false;
            }
            if (!this.A08) {
                this.A08 = c0914Hf.A0E() == 11;
            } else {
                int iA0E = c0914Hf.A0E();
                if (iA0E == 119) {
                    this.A08 = false;
                    return true;
                }
                this.A08 = iA0E == 11;
            }
        }
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
        while (true) {
            int iA04 = c0914Hf.A04();
            if (A0C[3].charAt(28) != '2') {
                throw new RuntimeException();
            }
            A0C[6] = "j4ZJ9Sb1FxDogpbJuhr4W7MrwTg";
            if (iA04 > 0) {
                switch (this.A02) {
                    case 0:
                        if (A01(c0914Hf)) {
                            this.A02 = 1;
                            this.A0A.A00[0] = 11;
                            this.A0A.A00[1] = 119;
                            this.A00 = 2;
                        }
                        break;
                    case 1:
                        if (A02(c0914Hf, this.A0A.A00, 128)) {
                            A00();
                            this.A0A.A0Y(0);
                            this.A06.AEg(this.A0A, 128);
                            this.A02 = 2;
                        }
                        break;
                    case 2:
                        int iMin = Math.min(c0914Hf.A04(), this.A01 - this.A00);
                        this.A06.AEg(c0914Hf, iMin);
                        int bytesToRead = this.A00 + iMin;
                        this.A00 = bytesToRead;
                        int i10 = this.A01;
                        if (bytesToRead == i10) {
                            this.A06.AEh(this.A04, 1, i10, 0, null);
                            long j10 = this.A04;
                            long j11 = this.A03;
                            String[] strArr = A0C;
                            if (strArr[0].charAt(28) == strArr[7].charAt(28)) {
                                A0C[4] = "thGmrgzi8Rkjtt3yqKW2WPJBde0Fj";
                                this.A04 = j10 + j11;
                                this.A02 = 0;
                            } else {
                                this.A04 = j10 + j11;
                                this.A02 = 0;
                            }
                        }
                        break;
                }
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void A4k(InterfaceC0774Ba interfaceC0774Ba, C0804Cs c0804Cs) {
        c0804Cs.A05();
        this.A07 = c0804Cs.A04();
        this.A06 = interfaceC0774Ba.AFm(c0804Cs.A03(), 1);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void ADX() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void ADY(long j10, boolean z10) {
        this.A04 = j10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void AEk() {
        this.A02 = 0;
        this.A00 = 0;
        this.A08 = false;
    }
}
