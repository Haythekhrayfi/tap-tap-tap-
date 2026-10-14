package com.facebook.ads.redexgen.X;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WM implements CR {
    public static byte[] A0C;
    public static String[] A0D = {"qlUqm53dx2wRFYI19yFYkvkmPQFopPfK", "kfzPj4jiKhQrTstJ9wOtTomcMDMJFI2R", "tio4jxSpdKgrcMNksdh3F2ai0PxCizyi", "S5qskWqDqPkhPpuUuuvRcKySD9vc4n0H", "X67UodKHNvmZa3DnASt4fZlpL2cJMcNV", "01LnOYH7rGQp5f5o2UGBiyg7bnJQxBa8", "qDTiiMVukWANjWrPbJo4riKeblMOo1tu", "5dAWhKcmsHilqUXjq3PFXu2GkNxyPnDG"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public final long A08;
    public final long A09;
    public final CQ A0A = new CQ();
    public final CU A0B;

    public static String A09(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A0C = new byte[]{22, 55, 120, 55, 63, 63, 120, 40, 57, 63, 61, 120, 59, 57, 54, 120, 58, 61, 120, 62, 55, 45, 54, 60, 118};
    }

    static {
        A0A();
    }

    public WM(long j10, long j11, CU cu, int i10, long j12) {
        HG.A03(j10 >= 0 && j11 > j10);
        this.A0B = cu;
        this.A09 = j10;
        this.A08 = j11;
        if (i10 == j11 - j10) {
            this.A07 = j12;
            this.A00 = 3;
        } else {
            this.A00 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A00(long j10, long j11, long j12) {
        long j13 = this.A08;
        long j14 = this.A09;
        long j15 = j10 + ((((j13 - j14) * j11) / this.A07) - j12);
        if (j15 < j14) {
            j15 = this.A09;
        }
        if (j15 >= j13) {
            return j13 - 1;
        }
        return j15;
    }

    private final long A01(long j10, BZ bz) throws InterruptedException, IOException {
        if (this.A04 == this.A01) {
            return -(this.A05 + 2);
        }
        long jA7Z = bz.A7Z();
        if (A0D(bz, this.A01)) {
            this.A0A.A03(bz, false);
            bz.AEb();
            long j11 = j10 - this.A0A.A05;
            int i10 = this.A0A.A01 + this.A0A.A00;
            if (j11 < 0 || j11 > 72000) {
                if (j11 < 0) {
                    this.A01 = jA7Z;
                    this.A02 = this.A0A.A05;
                } else {
                    long initialPosition = bz.A7Z();
                    this.A04 = initialPosition + ((long) i10);
                    this.A05 = this.A0A.A05;
                    long initialPosition2 = this.A01;
                    if ((initialPosition2 - this.A04) + ((long) i10) < 100000) {
                        bz.AFT(i10);
                        long initialPosition3 = this.A05;
                        return -(initialPosition3 + 2);
                    }
                }
                long initialPosition4 = this.A01;
                long j12 = this.A04;
                String[] strArr = A0D;
                if (strArr[4].charAt(12) == strArr[0].charAt(12)) {
                    throw new RuntimeException();
                }
                A0D[3] = "zvKF8WQUI0SajHpo4Xv9v8DHT9e2MTPL";
                if (initialPosition4 - j12 < 100000) {
                    this.A01 = j12;
                    return j12;
                }
                long j13 = i10;
                long j14 = j11 > 0 ? 1L : 2L;
                long jA7Z2 = bz.A7Z();
                long j15 = this.A01;
                long granuleDistance = this.A04;
                long initialPosition5 = this.A02;
                long nextPosition = (jA7Z2 - (j13 * j14)) + (((j15 - granuleDistance) * j11) / (initialPosition5 - this.A05));
                return Math.min(Math.max(nextPosition, granuleDistance), this.A01 - 1);
            }
            bz.AFT(i10);
            return -(this.A0A.A05 + 2);
        }
        long j16 = this.A04;
        if (j16 != jA7Z) {
            return j16;
        }
        throw new IOException(A09(0, 25, 22));
    }

    private final long A02(BZ bz) throws InterruptedException, IOException {
        A0C(bz);
        this.A0A.A02();
        while (true) {
            int i10 = this.A0A.A04;
            String[] strArr = A0D;
            if (strArr[4].charAt(12) == strArr[0].charAt(12)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[1] = "8L7HD1AI4we5ropKbStlQEIIPOmJrEUL";
            strArr2[2] = "xLnKc6RM4Edpr9DSdPLSxPAMnW98GKHb";
            if ((i10 & 4) != 4 && bz.A7Z() < this.A08) {
                this.A0A.A03(bz, false);
                bz.AFT(this.A0A.A01 + this.A0A.A00);
            } else {
                return this.A0A.A05;
            }
        }
    }

    private final long A03(BZ bz, long j10, long j11) throws InterruptedException, IOException {
        this.A0A.A03(bz, false);
        while (this.A0A.A05 < j10) {
            bz.AFT(this.A0A.A01 + this.A0A.A00);
            j11 = this.A0A.A05;
            this.A0A.A03(bz, false);
        }
        bz.AEb();
        return j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.CR
    /* JADX INFO: renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final WN A4h() {
        CO co = null;
        if (this.A07 != 0) {
            return new WN(this);
        }
        return null;
    }

    private final void A0B() {
        this.A04 = this.A09;
        this.A01 = this.A08;
        this.A05 = 0L;
        this.A02 = this.A07;
    }

    private final void A0C(BZ bz) throws InterruptedException, IOException {
        if (A0D(bz, this.A08)) {
        } else {
            throw new EOFException();
        }
    }

    private final boolean A0D(BZ bz, long j10) throws InterruptedException, IOException {
        long jMin = Math.min(3 + j10, this.A08);
        byte[] bArr = new byte[2048];
        int i10 = bArr.length;
        while (true) {
            if (bz.A7Z() + ((long) i10) > jMin && (i10 = (int) (jMin - bz.A7Z())) < 4) {
                return false;
            }
            bz.ADb(bArr, 0, i10, false);
            for (int i11 = 0; i11 < i10 - 3; i11++) {
                int peekLength = bArr[i11];
                if (peekLength == 79 && bArr[i11 + 1] == 103 && bArr[i11 + 2] == 103) {
                    int peekLength2 = bArr[i11 + 3];
                    if (peekLength2 == 83) {
                        bz.AFT(i11);
                        return true;
                    }
                }
            }
            bz.AFT(i10 - 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        if (r1 > r3) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (r1 > r3) goto L10;
     */
    @Override // com.facebook.ads.redexgen.X.CR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long ADz(com.facebook.ads.redexgen.X.BZ r14) throws java.lang.InterruptedException, java.io.IOException {
        /*
            r13 = this;
            int r0 = r13.A00
            r5 = 3
            r8 = r14
            switch(r0) {
                case 0: goto Ld;
                case 1: goto L51;
                case 2: goto L5c;
                case 3: goto L9c;
                default: goto L7;
            }
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        Ld:
            long r3 = r8.A7Z()
            r13.A03 = r3
            r0 = 1
            r13.A00 = r0
            long r1 = r13.A08
            java.lang.String[] r6 = com.facebook.ads.redexgen.X.WM.A0D
            r0 = 5
            r6 = r6[r0]
            r0 = 14
            char r6 = r6.charAt(r0)
            r0 = 69
            if (r6 == r0) goto L3c
            java.lang.String[] r7 = com.facebook.ads.redexgen.X.WM.A0D
            java.lang.String r6 = "y7O6pPdi4ZltSjD6KADDWtfh1EQ3ypYE"
            r0 = 1
            r7[r0] = r6
            java.lang.String r6 = "PCOWfrd56ab6qHMTUxzEVaAjhpd6ZxlM"
            r0 = 2
            r7[r0] = r6
            r6 = 65307(0xff1b, double:3.2266E-319)
            long r1 = r1 - r6
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L51
        L3b:
            return r1
        L3c:
            java.lang.String[] r7 = com.facebook.ads.redexgen.X.WM.A0D
            java.lang.String r6 = "CYddPgWATLyxqxIaeTkpx7ccDiEA63Cn"
            r0 = 4
            r7[r0] = r6
            java.lang.String r6 = "yHXSkk2QTXaOjUGCO1LifWaF4YjGjaVe"
            r0 = 0
            r7[r0] = r6
            r6 = 65307(0xff1b, double:3.2266E-319)
            long r1 = r1 - r6
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L51
            goto L3b
        L51:
            long r0 = r13.A02(r8)
            r13.A07 = r0
            r13.A00 = r5
            long r0 = r13.A03
            return r0
        L5c:
            long r0 = r13.A06
            java.lang.String[] r3 = com.facebook.ads.redexgen.X.WM.A0D
            r2 = 3
            r3 = r3[r2]
            r2 = 18
            char r3 = r3.charAt(r2)
            r2 = 118(0x76, float:1.65E-43)
            if (r3 == r2) goto L73
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L73:
            java.lang.String[] r4 = com.facebook.ads.redexgen.X.WM.A0D
            java.lang.String r3 = "5HAo5Th3dlJMt4bYi9vd99sok2AKRnDx"
            r2 = 3
            r4[r2] = r3
            r2 = 2
            r6 = 0
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 != 0) goto L89
            r0 = 0
        L84:
            r13.A00 = r5
            long r2 = r2 + r0
            long r0 = -r2
            return r0
        L89:
            long r0 = r13.A01(r0, r8)
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 < 0) goto L92
            return r0
        L92:
            long r9 = r13.A06
            long r0 = r0 + r2
            long r11 = -r0
            r7 = r13
            long r0 = r7.A03(r8, r9, r11)
            goto L84
        L9c:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.WM.ADz(com.facebook.ads.redexgen.X.BZ):long");
    }

    @Override // com.facebook.ads.redexgen.X.CR
    public final long AFb(long j10) {
        int i10 = this.A00;
        HG.A03(i10 == 3 || i10 == 2);
        long jA04 = 0;
        if (j10 != 0) {
            jA04 = this.A0B.A04(j10);
        }
        this.A06 = jA04;
        this.A00 = 2;
        A0B();
        return this.A06;
    }
}
