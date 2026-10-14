package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class CU {
    public static String[] A0D = {"0vhu5jxS", "Yr1jkp10QbCUuCnawnVg6DyED3T", "sHPBJpa0rClOKB4ts4mek83zSMf", "023O0ZSY", "oXq1fAkWHKLdk2C1T6ZzlQ7WbkpG5dco", "r27coonoikndR5VwsgZJDPH1Xbh3nrzE", "wA4WoZs0OtPlvEvglX5psUeQApq37N8U", "1wN1LzZhcL4LE4gXrEEsM7fopE3lhqwu"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public InterfaceC0774Ba A06;
    public InterfaceC0782Bk A07;
    public CR A08;
    public CT A09;
    public boolean A0A;
    public boolean A0B;
    public final CP A0C = new CP();

    public abstract long A07(C0914Hf c0914Hf);

    public abstract boolean A0A(C0914Hf c0914Hf, long j10, CT ct) throws InterruptedException, IOException;

    private int A00(BZ bz) throws InterruptedException, IOException {
        boolean zA0A = true;
        while (zA0A) {
            boolean readingHeaders = this.A0C.A05(bz);
            if (!readingHeaders) {
                this.A01 = 3;
                return -1;
            }
            this.A03 = bz.A7Z() - this.A04;
            zA0A = A0A(this.A0C.A02(), this.A04, this.A09);
            if (zA0A) {
                this.A04 = bz.A7Z();
            }
        }
        this.A00 = this.A09.A00.A0C;
        boolean readingHeaders2 = this.A0A;
        if (!readingHeaders2) {
            this.A07.A5i(this.A09.A00);
            this.A0A = true;
        }
        if (this.A09.A01 != null) {
            this.A08 = this.A09.A01;
        } else if (bz.A7A() == -1) {
            this.A08 = new WG();
        } else {
            CQ firstPayloadPageHeader = this.A0C.A01();
            this.A08 = new WM(this.A04, bz.A7A(), this, firstPayloadPageHeader.A01 + firstPayloadPageHeader.A00, firstPayloadPageHeader.A05);
        }
        this.A09 = null;
        this.A01 = 2;
        this.A0C.A04();
        return 0;
    }

    private int A01(BZ bz, C0777Bf c0777Bf) throws InterruptedException, IOException {
        long position = this.A08.ADz(bz);
        if (position >= 0) {
            c0777Bf.A00 = position;
            return 1;
        }
        if (position < -1) {
            A08(-(2 + position));
        }
        if (!this.A0B) {
            this.A06.AEm(this.A08.A4h());
            this.A0B = true;
        }
        if (this.A03 <= 0 && !this.A0C.A05(bz)) {
            this.A01 = 3;
            return -1;
        }
        this.A03 = 0L;
        C0914Hf c0914HfA02 = this.A0C.A02();
        long jA07 = A07(c0914HfA02);
        if (jA07 >= 0) {
            long j10 = this.A02;
            long granulesInPacket = j10 + jA07;
            if (granulesInPacket >= this.A05) {
                long jA03 = A03(j10);
                this.A07.AEg(c0914HfA02, c0914HfA02.A07());
                this.A07.AEh(jA03, 1, c0914HfA02.A07(), 0, null);
                this.A05 = -1L;
            }
        }
        this.A02 += jA07;
        return 0;
    }

    public final int A02(BZ bz, C0777Bf c0777Bf) throws InterruptedException, IOException {
        switch (this.A01) {
            case 0:
                return A00(bz);
            case 1:
                bz.AFT((int) this.A04);
                this.A01 = 2;
                return 0;
            case 2:
                return A01(bz, c0777Bf);
            default:
                throw new IllegalStateException();
        }
    }

    public final long A03(long j10) {
        return (1000000 * j10) / ((long) this.A00);
    }

    public final long A04(long j10) {
        return (((long) this.A00) * j10) / 1000000;
    }

    public final void A05(long j10, long j11) {
        this.A0C.A03();
        if (j10 == 0) {
            boolean z10 = !this.A0B;
            String[] strArr = A0D;
            if (strArr[6].charAt(24) == strArr[7].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[4] = "k4zvnx9t3uHSh6LLctIVLoh0Ftprjk2l";
            strArr2[5] = "HhnKvAaHZTpmoBA85UMRj52n1m1tHG3b";
            A09(z10);
            return;
        }
        if (this.A01 == 0) {
            return;
        }
        this.A05 = this.A08.AFb(j11);
        this.A01 = 2;
    }

    public final void A06(InterfaceC0774Ba interfaceC0774Ba, InterfaceC0782Bk interfaceC0782Bk) {
        this.A06 = interfaceC0774Ba;
        this.A07 = interfaceC0782Bk;
        A09(true);
    }

    public void A08(long j10) {
        this.A02 = j10;
    }

    public void A09(boolean z10) {
        if (z10) {
            this.A09 = new CT();
            this.A04 = 0L;
            this.A01 = 0;
        } else {
            this.A01 = 1;
        }
        this.A05 = -1L;
        this.A02 = 0L;
    }
}
