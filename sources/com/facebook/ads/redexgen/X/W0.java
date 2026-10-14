package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class W0 implements InterfaceC0793Ce {
    public static String[] A0C = {"M8nxhoQeDkjHEk3tjnypaUsJeky9pUPe", "22wDV1USJ2tZABUEWkFG7fElxPqoDepQ", "WSXmuBny7XXEQ4s813c9BSbsqOjqSskJ", "KVrLQEQFGtTXAXMopyF5dj", "jUO9kFQXOuNF5MkzWpfFf35Wzr3tp3jj", "UgJN", "fATsZHYNQKGGAXuN", "X77CUtb4yEwh8nH4MH"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public InterfaceC0782Bk A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public final Be A09;
    public final C0914Hf A0A;
    public final String A0B;

    public W0() {
        this(null);
    }

    public W0(String str) {
        this.A02 = 0;
        C0914Hf c0914Hf = new C0914Hf(4);
        this.A0A = c0914Hf;
        c0914Hf.A00[0] = -1;
        this.A09 = new Be();
        this.A0B = str;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    private void A00(C0914Hf c0914Hf) {
        boolean z10;
        byte[] bArr = c0914Hf.A00;
        int iA07 = c0914Hf.A07();
        for (int iA06 = c0914Hf.A06(); iA06 < iA07; iA06++) {
            int startOffset = bArr[iA06];
            boolean z11 = (startOffset & 255) == 255;
            if (this.A08) {
                int startOffset2 = bArr[iA06];
                if ((startOffset2 & 224) == 224) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            this.A08 = z11;
            if (z10) {
                c0914Hf.A0Y(iA06 + 1);
                this.A08 = false;
                this.A0A.A00[1] = bArr[iA06];
                this.A00 = 2;
                this.A02 = 1;
                return;
            }
        }
        c0914Hf.A0Y(iA07);
    }

    private void A01(C0914Hf c0914Hf) {
        int iMin = Math.min(c0914Hf.A04(), this.A01 - this.A00);
        this.A05.AEg(c0914Hf, iMin);
        int bytesToRead = this.A00 + iMin;
        this.A00 = bytesToRead;
        int i10 = this.A01;
        if (bytesToRead < i10) {
            return;
        }
        InterfaceC0782Bk interfaceC0782Bk = this.A05;
        if (A0C[2].charAt(7) == 'H') {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[4] = "Ix3a1KSHqy7cK1t6WtGmlZzK6PY1tVDv";
        strArr[1] = "TW6fubs4zpuEa3cAWqrpZRXJHWdUZhrV";
        interfaceC0782Bk.AEh(this.A04, 1, i10, 0, null);
        this.A04 += this.A03;
        this.A00 = 0;
        this.A02 = 0;
    }

    private void A02(C0914Hf c0914Hf) {
        int iMin = Math.min(c0914Hf.A04(), 4 - this.A00);
        c0914Hf.A0c(this.A0A.A00, this.A00, iMin);
        int i10 = this.A00 + iMin;
        this.A00 = i10;
        if (i10 < 4) {
            return;
        }
        this.A0A.A0Y(0);
        if (Be.A04(this.A0A.A08(), this.A09)) {
            this.A01 = this.A09.A02;
            if (!this.A07) {
                this.A03 = (((long) this.A09.A04) * 1000000) / ((long) this.A09.A03);
                this.A05.A5i(Format.A07(this.A06, this.A09.A06, null, -1, 4096, this.A09.A01, this.A09.A03, null, null, 0, this.A0B));
                this.A07 = true;
            }
            this.A0A.A0Y(0);
            this.A05.AEg(this.A0A, 4);
            this.A02 = 2;
            return;
        }
        this.A00 = 0;
        this.A02 = 1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void A4N(C0914Hf c0914Hf) {
        while (c0914Hf.A04() > 0) {
            switch (this.A02) {
                case 0:
                    A00(c0914Hf);
                    break;
                case 1:
                    A02(c0914Hf);
                    break;
                case 2:
                    A01(c0914Hf);
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void A4k(InterfaceC0774Ba interfaceC0774Ba, C0804Cs c0804Cs) {
        c0804Cs.A05();
        this.A06 = c0804Cs.A04();
        this.A05 = interfaceC0774Ba.AFm(c0804Cs.A03(), 1);
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
