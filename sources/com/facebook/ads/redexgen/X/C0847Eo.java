package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Eo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0847Eo {
    public static String[] A0I = {"AXNp2q2PpEahITHLh", "xQEpoEpGgC2eanPxpW7aZYHhG9yms2rq", "3j6TAof", "i8THqobYCLYXuqAnsJGXzeKTVyKCbEfb", "ggw9auSRsP4B09On0iatBfmdaYF861sQ", "10OfiNQ0BRtOqE95ZnYZi1qGxLNxD1sx", "iFzh6NRuyiOyJdjYiPViJ2RhowiTnlD0", "JJpEbWQFS8eJaCoVgzG8fIG9CRI9jzfg"};
    public int A00;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public Format A08;
    public int A01 = 1000;
    public int[] A0D = new int[1000];
    public long[] A0E = new long[1000];
    public long[] A0F = new long[1000];
    public int[] A0B = new int[1000];
    public int[] A0C = new int[1000];
    public C0781Bj[] A0H = new C0781Bj[1000];
    public Format[] A0G = new Format[1000];
    public long A06 = Long.MIN_VALUE;
    public long A07 = Long.MIN_VALUE;
    public boolean A09 = true;
    public boolean A0A = true;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized int A09(C9V c9v, X0 x10, boolean z10, boolean z11, Format format, C0846En c0846En) {
        if (!A0I()) {
            if (z11) {
                x10.A02(4);
                return -4;
            }
            Format format2 = this.A08;
            if (format2 == null || (!z10 && format2 == format)) {
                return -3;
            }
            c9v.A00 = format2;
            return -5;
        }
        int iA00 = A00(this.A03);
        if (z10 || this.A0G[iA00] != format) {
            c9v.A00 = this.A0G[iA00];
            return -5;
        }
        if (x10.A0B()) {
            return -3;
        }
        x10.A00 = this.A0F[iA00];
        x10.A02(this.A0B[iA00]);
        c0846En.A00 = this.A0C[iA00];
        c0846En.A01 = this.A0E[iA00];
        c0846En.A02 = this.A0H[iA00];
        this.A03++;
        return -4;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0G(long j10, int i10, long j11, int i11, C0781Bj c0781Bj) {
        if (this.A0A) {
            if ((i10 & 1) == 0) {
                return;
            } else {
                this.A0A = false;
            }
        }
        HG.A04(!this.A09);
        A04(j10);
        int iA00 = A00(this.A02);
        this.A0F[iA00] = j10;
        long[] jArr = this.A0E;
        jArr[iA00] = j11;
        this.A0C[iA00] = i11;
        this.A0B[iA00] = i10;
        this.A0H[iA00] = c0781Bj;
        this.A0G[iA00] = this.A08;
        this.A0D[iA00] = this.A05;
        int i12 = this.A02 + 1;
        this.A02 = i12;
        int i13 = this.A01;
        if (i12 == i13) {
            int i14 = i13 + 1000;
            int[] iArr = new int[i14];
            long[] jArr2 = new long[i14];
            long[] jArr3 = new long[i14];
            int[] iArr2 = new int[i14];
            int[] iArr3 = new int[i14];
            C0781Bj[] c0781BjArr = new C0781Bj[i14];
            Format[] formatArr = new Format[i14];
            int i15 = this.A04;
            int i16 = i13 - i15;
            System.arraycopy(jArr, i15, jArr2, 0, i16);
            System.arraycopy(this.A0F, this.A04, jArr3, 0, i16);
            System.arraycopy(this.A0B, this.A04, iArr2, 0, i16);
            System.arraycopy(this.A0C, this.A04, iArr3, 0, i16);
            System.arraycopy(this.A0H, this.A04, c0781BjArr, 0, i16);
            System.arraycopy(this.A0G, this.A04, formatArr, 0, i16);
            System.arraycopy(this.A0D, this.A04, iArr, 0, i16);
            int i17 = this.A04;
            System.arraycopy(this.A0E, 0, jArr2, i16, i17);
            System.arraycopy(this.A0F, 0, jArr3, i16, i17);
            System.arraycopy(this.A0B, 0, iArr2, i16, i17);
            System.arraycopy(this.A0C, 0, iArr3, i16, i17);
            System.arraycopy(this.A0H, 0, c0781BjArr, i16, i17);
            System.arraycopy(this.A0G, 0, formatArr, i16, i17);
            System.arraycopy(this.A0D, 0, iArr, i16, i17);
            this.A0E = jArr2;
            this.A0F = jArr3;
            this.A0B = iArr2;
            this.A0C = iArr3;
            this.A0H = c0781BjArr;
            this.A0G = formatArr;
            this.A0D = iArr;
            this.A04 = 0;
            this.A02 = this.A01;
            this.A01 = i14;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized boolean A0J(long j10) {
        if (this.A02 == 0) {
            return j10 > this.A06;
        }
        if (Math.max(this.A06, A03(this.A03)) >= j10) {
            return false;
        }
        int i10 = this.A02;
        int iA00 = A00(i10 - 1);
        while (i10 > this.A03 && this.A0F[iA00] >= j10) {
            i10--;
            iA00--;
            if (iA00 == -1) {
                iA00 = this.A01 - 1;
            }
        }
        A0C(this.A00 + i10);
        return true;
    }

    private int A00(int i10) {
        int i11 = this.A04 + i10;
        int relativeIndex = this.A01;
        return i11 < relativeIndex ? i11 : i11 - relativeIndex;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0016  */
    private int A01(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11 && this.A0F[i10] <= j10; i13++) {
            if (z10) {
                int sampleCountToTarget = this.A0B[i10];
                if ((sampleCountToTarget & 1) != 0) {
                    i12 = i13;
                }
            } else {
                i12 = i13;
            }
            i10++;
            int sampleCountToTarget2 = this.A01;
            if (i10 == sampleCountToTarget2) {
                i10 = 0;
            }
        }
        return i12;
    }

    private long A02(int i10) {
        this.A06 = Math.max(this.A06, A03(i10));
        int i11 = this.A02 - i10;
        this.A02 = i11;
        this.A00 += i10;
        int i12 = this.A04 + i10;
        this.A04 = i12;
        int i13 = this.A01;
        if (i12 >= i13) {
            this.A04 = i12 - i13;
        }
        int i14 = this.A03 - i10;
        this.A03 = i14;
        if (i14 < 0) {
            this.A03 = 0;
        }
        if (i11 == 0) {
            int i15 = this.A04;
            if (i15 != 0) {
                i13 = i15;
            }
            int i16 = i13 - 1;
            return this.A0E[i16] + ((long) this.A0C[i16]);
        }
        return this.A0E[this.A04];
    }

    private long A03(int i10) {
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        long jMax = Long.MIN_VALUE;
        int iA00 = A00(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            jMax = Math.max(jMax, this.A0F[iA00]);
            int i12 = this.A0B[iA00];
            if ((i12 & 1) != 0) {
                break;
            }
            iA00--;
            if (iA00 == -1) {
                int i13 = this.A01;
                String[] strArr = A0I;
                if (strArr[6].charAt(24) == strArr[3].charAt(24)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0I;
                strArr2[2] = "ogUh654";
                strArr2[5] = "2cGjVSXzBWiJJ6u2fOJU9D000d34dgjx";
                iA00 = i13 - 1;
            }
        }
        return jMax;
    }

    private final synchronized void A04(long j10) {
        this.A07 = Math.max(this.A07, j10);
    }

    public final int A05() {
        return this.A00 + this.A03;
    }

    public final int A06() {
        return this.A00 + this.A02;
    }

    public final synchronized int A07() {
        int i10;
        int skipCount = this.A02;
        i10 = skipCount - this.A03;
        this.A03 = skipCount;
        return i10;
    }

    public final synchronized int A08(long j10, boolean z10, boolean z11) {
        int iA00 = A00(this.A03);
        if (!A0I() || j10 < this.A0F[iA00] || (j10 > this.A07 && !z11)) {
            return -1;
        }
        int i10 = this.A02;
        int relativeReadIndex = this.A03;
        int offset = A01(iA00, i10 - relativeReadIndex, j10, z10);
        if (offset == -1) {
            return -1;
        }
        int relativeReadIndex2 = this.A03;
        this.A03 = relativeReadIndex2 + offset;
        return offset;
    }

    public final synchronized long A0A() {
        int i10 = this.A02;
        if (i10 == 0) {
            return -1L;
        }
        return A02(i10);
    }

    public final synchronized long A0B() {
        return this.A07;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    public final long A0C(int i10) {
        boolean z10;
        int iA06 = A06() - i10;
        if (iA06 >= 0) {
            if (iA06 <= this.A02 - this.A03) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        HG.A03(z10);
        int discardCount = this.A02 - iA06;
        this.A02 = discardCount;
        this.A07 = Math.max(this.A06, A03(discardCount));
        int discardCount2 = this.A02;
        if (discardCount2 == 0) {
            return 0L;
        }
        int relativeLastWriteIndex = A00(discardCount2 - 1);
        return this.A0E[relativeLastWriteIndex] + ((long) this.A0C[relativeLastWriteIndex]);
    }

    public final synchronized long A0D(long j10, boolean z10, boolean z11) {
        int i10;
        int i11 = this.A02;
        if (i11 != 0) {
            long[] jArr = this.A0F;
            int searchLength = this.A04;
            if (j10 >= jArr[searchLength]) {
                if (z11 && (i10 = this.A03) != i11) {
                    i11 = i10 + 1;
                }
                int iA01 = A01(searchLength, i11, j10, z10);
                if (iA01 == -1) {
                    return -1L;
                }
                return A02(iA01);
            }
        }
        return -1L;
    }

    public final synchronized Format A0E() {
        return this.A09 ? null : this.A08;
    }

    public final synchronized void A0F() {
        this.A03 = 0;
    }

    public final void A0H(boolean z10) {
        this.A02 = 0;
        this.A00 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A0A = true;
        this.A06 = Long.MIN_VALUE;
        this.A07 = Long.MIN_VALUE;
        if (z10) {
            this.A08 = null;
            this.A09 = true;
        }
    }

    public final synchronized boolean A0I() {
        return this.A03 != this.A02;
    }

    public final synchronized boolean A0K(Format format) {
        try {
            if (format == null) {
                this.A09 = true;
                return false;
            }
            this.A09 = false;
            if (C0930Hv.A0g(format, this.A08)) {
                return false;
            }
            this.A08 = format;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
