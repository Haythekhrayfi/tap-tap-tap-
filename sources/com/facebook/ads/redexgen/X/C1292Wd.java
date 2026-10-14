package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1292Wd implements InterfaceC0786Bq {
    public static byte[] A07;
    public static String[] A08 = {"S6y5l6jxI9", "6mnEH66ZFffSlH4yeHJS8qNG", "YOAMbMDgHDJdJlquETda64yXe2Dsnigk", "hsyrHKVntalAWTsGKMDD", "vPfGZ", "fU8euoLNwl", "f8hQ6WKdo4yu3", "0USUeFTSnT76dGHmDwgcSkrJJgtZvyOb"};
    public int A00;
    public int A01;
    public long A02;
    public InterfaceC0787Bs A03;
    public final byte[] A06 = new byte[8];
    public final ArrayDeque<C0785Bp> A05 = new ArrayDeque<>();
    public final C0789Bx A04 = new C0789Bx();

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 40);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A07 = new byte[]{124, -95, -87, -108, -97, -100, -105, 83, -104, -97, -104, -96, -104, -95, -89, 83, -89, -84, -93, -104, 83, -100, -63, -55, -76, -65, -68, -73, 115, -71, -65, -62, -76, -57, 115, -58, -68, -51, -72, -115, 115, -27, 10, 18, -3, 8, 5, 0, -68, 5, 10, 16, 1, 3, 1, 14, -68, 15, 5, 22, 1, -42, -68, -127, -94, -96, -105, -100, -107, 78, -109, -102, -109, -101, -109, -100, -94, 78, -95, -105, -88, -109, 104, 78};
    }

    static {
        A05();
    }

    private double A00(BZ bz, int i10) throws InterruptedException, IOException {
        long jA02 = A02(bz, i10);
        if (i10 == 4) {
            return Float.intBitsToFloat((int) jA02);
        }
        return Double.longBitsToDouble(jA02);
    }

    private long A01(BZ bz) throws InterruptedException, IOException {
        bz.AEb();
        while (true) {
            bz.ADa(this.A06, 0, 4);
            int iA00 = C0789Bx.A00(this.A06[0]);
            if (iA00 != -1 && iA00 <= 4) {
                int iA01 = (int) C0789Bx.A01(this.A06, iA00, false);
                if (this.A03.A8u(iA01)) {
                    bz.AFT(iA00);
                    return iA01;
                }
            }
            bz.AFT(1);
        }
    }

    private long A02(BZ bz, int i10) throws InterruptedException, IOException {
        bz.readFully(this.A06, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            long value = this.A06[i11] & 255;
            j10 = (j10 << 8) | value;
        }
        return j10;
    }

    private String A04(BZ bz, int i10) throws InterruptedException, IOException {
        if (i10 == 0) {
            return A03(0, 0, 103);
        }
        byte[] bArr = new byte[i10];
        bz.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0786Bq
    public final void A8e(InterfaceC0787Bs interfaceC0787Bs) {
        this.A03 = interfaceC0787Bs;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0786Bq
    public final boolean AE0(BZ bz) throws InterruptedException, IOException {
        HG.A04(this.A03 != null);
        while (true) {
            if (!this.A05.isEmpty()) {
                long jA7Z = bz.A7Z();
                C0785Bp c0785BpPeek = this.A05.peek();
                if (A08[4].length() == 19) {
                    throw new RuntimeException();
                }
                A08[1] = "iTM85rd";
                if (jA7Z >= c0785BpPeek.A01) {
                    this.A03.A5R(this.A05.pop().A00);
                    return true;
                }
            }
            if (this.A01 == 0) {
                long jA05 = this.A04.A05(bz, true, false, 4);
                if (jA05 == -2) {
                    jA05 = A01(bz);
                }
                if (jA05 == -1) {
                    return false;
                }
                this.A00 = (int) jA05;
                this.A01 = 1;
            }
            if (this.A01 == 1) {
                this.A02 = this.A04.A05(bz, false, true, 8);
                this.A01 = 2;
            }
            int iA6k = this.A03.A6k(this.A00);
            switch (iA6k) {
                case 0:
                    int type = (int) this.A02;
                    bz.AFT(type);
                    this.A01 = 0;
                    break;
                case 1:
                    long elementContentPosition = bz.A7Z();
                    this.A05.push(new C0785Bp(this.A00, elementContentPosition + this.A02));
                    InterfaceC0787Bs interfaceC0787Bs = this.A03;
                    int i10 = this.A00;
                    long elementEndPosition = this.A02;
                    interfaceC0787Bs.AFY(i10, elementContentPosition, elementEndPosition);
                    this.A01 = 0;
                    return true;
                case 2:
                    long j10 = this.A02;
                    if (j10 <= 8) {
                        this.A03.A8i(this.A00, A02(bz, (int) j10));
                        this.A01 = 0;
                        return true;
                    }
                    throw new C07249b(A03(41, 22, 116) + this.A02);
                case 3:
                    long j11 = this.A02;
                    if (j11 <= 2147483647L) {
                        this.A03.AFg(this.A00, A04(bz, (int) j11));
                        this.A01 = 0;
                        return true;
                    }
                    throw new C07249b(A03(63, 21, 6) + this.A02);
                case 4:
                    this.A03.A3x(this.A00, (int) this.A02, bz);
                    if (A08[7].charAt(2) != 'S') {
                        A08[2] = "x8X2xTnJq9Kheln0ABdW7PO8kghsREvE";
                        this.A01 = 0;
                        return true;
                    }
                    A08[4] = "mGqeeb15RRoJ11oGs7LhfnjQvY";
                    this.A01 = 0;
                    return true;
                case 5:
                    long j12 = this.A02;
                    if (j12 == 4 || j12 == 8) {
                        this.A03.A5e(this.A00, A00(bz, (int) j12));
                        this.A01 = 0;
                        return true;
                    }
                    throw new C07249b(A03(21, 20, 43) + this.A02);
                default:
                    throw new C07249b(A03(0, 21, 11) + iA6k);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0786Bq
    public final void reset() {
        this.A01 = 0;
        this.A05.clear();
        this.A04.A06();
    }
}
