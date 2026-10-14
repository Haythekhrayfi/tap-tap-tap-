package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1288Vz implements InterfaceC0805Ct {
    public static byte[] A0C;
    public static String[] A0D = {"wYbCHe4PqE0rUTWdo8mFq0UBpfkRDoC", "CuNoFwrXbx7Fup1Bnz4crpheboHEAq61", "i4a35YUA6bJnEiUQjLdSeulU0LA5VC2", "DQj4nZO33GsRRuNygGqDxWwIbU", "NTzjfKAdqL5R4ni", "Zn", "9Rh66LtnIoGSEkHARJ7O", "nCQ56kMXgmV4b9DPw80w9mtudgrGO1uA"};
    public int A00;
    public int A01;
    public int A02;
    public long A04;
    public C0926Hr A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final InterfaceC0793Ce A0A;
    public final C0913He A0B = new C0913He(new byte[10]);
    public int A03 = 0;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0D;
            if (strArr[6].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[6] = "tGST5WGrXasfnynKry2Y";
            strArr2[4] = "X7BCEDGkhqj2a0M";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 105);
            i13++;
        }
    }

    public static void A02() {
        A0C = new byte[]{-37, 40, 42, 45, 32, -37, Ascii.GS, 52, 47, 32, 46, -44, -23, -9, -42, -23, -27, -24, -23, -10, -14, 11, 2, 21, 13, 2, 0, 17, 2, 1, -67, 16, 17, -2, 15, 17, -67, 0, 12, 1, 2, -67, 13, 15, 2, 3, 6, 21, -41, -67, 40, 65, 56, 75, 67, 56, 54, 71, 56, 55, -13, 70, 71, 52, 69, 71, -13, 60, 65, 55, 60, 54, 52, 71, 66, 69, -13, 69, 56, 52, 55, 60, 65, 58, -13, 56, 75, 71, 56, 65, 55, 56, 55, -13, 59, 56, 52, 55, 56, 69, -2, 23, 14, 33, Ascii.EM, 14, 12, Ascii.GS, 14, 13, -55, Ascii.FS, Ascii.GS, 10, Ascii.ESC, Ascii.GS, -55, 18, 23, 13, 18, 12, 10, Ascii.GS, Ascii.CAN, Ascii.ESC, -29, -55, 14, 33, Ascii.EM, 14, 12, Ascii.GS, 14, 13, -55};
    }

    static {
        A02();
    }

    public C1288Vz(InterfaceC0793Ce interfaceC0793Ce) {
        this.A0A = interfaceC0793Ce;
    }

    private void A01() {
        this.A0B.A07(0);
        this.A04 = -9223372036854775807L;
        if (this.A08) {
            this.A0B.A08(4);
            long jA04 = ((long) this.A0B.A04(3)) << 30;
            this.A0B.A08(1);
            long pts = this.A0B.A04(15) << 15;
            long j10 = jA04 | pts;
            this.A0B.A08(1);
            long pts2 = this.A0B.A04(15);
            long j11 = j10 | pts2;
            this.A0B.A08(1);
            if (!this.A09 && this.A07) {
                this.A0B.A08(4);
                long pts3 = this.A0B.A04(3);
                this.A0B.A08(1);
                long pts4 = (pts3 << 30) | ((long) (this.A0B.A04(15) << 15));
                this.A0B.A08(1);
                long pts5 = pts4 | ((long) this.A0B.A04(15));
                this.A0B.A08(1);
                this.A05.A07(pts5);
                this.A09 = true;
            }
            this.A04 = this.A05.A07(j11);
        }
    }

    private void A03(int i10) {
        this.A03 = i10;
        this.A00 = 0;
    }

    private boolean A04() {
        this.A0B.A07(0);
        int iA04 = this.A0B.A04(24);
        if (iA04 != 1) {
            Log.w(A00(11, 9, 27), A00(20, 30, 52) + iA04);
            this.A02 = -1;
            return false;
        }
        this.A0B.A08(8);
        int iA05 = this.A0B.A04(16);
        this.A0B.A08(5);
        this.A06 = this.A0B.A0F();
        this.A0B.A08(2);
        this.A08 = this.A0B.A0F();
        this.A07 = this.A0B.A0F();
        this.A0B.A08(6);
        int packetLength = this.A0B.A04(8);
        this.A01 = packetLength;
        if (iA05 == 0) {
            this.A02 = -1;
        } else {
            int startCodePrefix = iA05 + 6;
            this.A02 = (startCodePrefix - 9) - packetLength;
        }
        return true;
    }

    private boolean A05(C0914Hf c0914Hf, byte[] bArr, int i10) {
        int iMin = Math.min(c0914Hf.A04(), i10 - this.A00);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            c0914Hf.A0Z(iMin);
        } else {
            int bytesToRead = this.A00;
            c0914Hf.A0c(bArr, bytesToRead, iMin);
        }
        int bytesToRead2 = this.A00;
        int bytesToRead3 = bytesToRead2 + iMin;
        this.A00 = bytesToRead3;
        return bytesToRead3 == i10;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e8  */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0805Ct
    public final void A4O(C0914Hf c0914Hf, boolean z10) throws C07249b {
        if (z10) {
            int i10 = this.A03;
            String strA00 = A00(11, 9, 27);
            switch (i10) {
                case 2:
                    Log.w(strA00, A00(50, 50, 106));
                    break;
                case 3:
                    int i11 = this.A02;
                    String[] strArr = A0D;
                    if (strArr[1].charAt(7) != strArr[7].charAt(7)) {
                        A0D[3] = "iT6qZLxrsL5nFXzA5eMWRbmPpry";
                        if (i11 != -1) {
                            Log.w(strA00, A00(100, 37, 64) + this.A02 + A00(0, 11, 82));
                        }
                    } else {
                        String[] strArr2 = A0D;
                        strArr2[6] = "yVWHAKGbYqdJQnId175P";
                        strArr2[4] = "7JSMzt33eVYw0UR";
                        if (i11 != -1) {
                            Log.w(strA00, A00(100, 37, 64) + this.A02 + A00(0, 11, 82));
                        }
                    }
                    this.A0A.ADX();
                    break;
            }
            A03(1);
        }
        while (c0914Hf.A04() > 0) {
            switch (this.A03) {
                case 0:
                    c0914Hf.A0Z(c0914Hf.A04());
                    break;
                case 1:
                    if (A05(c0914Hf, this.A0B.A00, 9)) {
                        A03(A04() ? 2 : 0);
                    }
                    break;
                case 2:
                    if (A05(c0914Hf, this.A0B.A00, Math.min(10, this.A01)) && A05(c0914Hf, null, this.A01)) {
                        A01();
                        this.A0A.ADY(this.A04, this.A06);
                        A03(3);
                    }
                    break;
                case 3:
                    int iA04 = c0914Hf.A04();
                    String[] strArr3 = A0D;
                    if (strArr3[0].length() != strArr3[2].length()) {
                        throw new RuntimeException();
                    }
                    A0D[3] = "hjut4LIYfO6UEnzCC4LSiWMZuOq2ZkQ";
                    int i12 = this.A02;
                    int i13 = i12 != -1 ? iA04 - i12 : 0;
                    if (i13 > 0) {
                        iA04 -= i13;
                        c0914Hf.A0X(c0914Hf.A06() + iA04);
                    }
                    this.A0A.A4N(c0914Hf);
                    int i14 = this.A02;
                    if (i14 != -1) {
                        int i15 = i14 - iA04;
                        this.A02 = i15;
                        if (i15 == 0) {
                            this.A0A.ADX();
                            A03(1);
                        }
                    }
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0805Ct
    public final void A8f(C0926Hr c0926Hr, InterfaceC0774Ba interfaceC0774Ba, C0804Cs c0804Cs) {
        this.A05 = c0926Hr;
        this.A0A.A4k(interfaceC0774Ba, c0804Cs);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0805Ct
    public final void AEk() {
        this.A03 = 0;
        this.A00 = 0;
        this.A09 = false;
        this.A0A.AEk();
    }
}
