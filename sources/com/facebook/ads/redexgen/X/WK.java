package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WK extends CU {
    public static byte[] A02;
    public static String[] A03 = {"8dTWvXK8tch0WiEnFvHb8QUOTjgSOqY9", "GP5XsFGUIcP3F8wb7eo6", "CqCUMDrIKsNfOt03xA9INRdZ8", "ntm6pkiJXJn0b4vYMFRbAtYqalurqDmt", "MKNWZ4ceQqyXKZHhShlPBWdiS", "qmQfSGtBK4Bh2Swsb", "DS4", "jEA"};
    public WL A00;
    public HS A01;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 12);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-97, -77, -94, -89, -83, 109, -92, -86, -97, -95};
    }

    static {
        A03();
    }

    private int A00(C0914Hf c0914Hf) {
        int i10 = (c0914Hf.A00[2] & 255) >> 4;
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                int i11 = i10 - 2;
                String[] strArr = A03;
                String str = strArr[3];
                String str2 = strArr[0];
                int iCharAt = str.charAt(11);
                int blockSizeCode = str2.charAt(11);
                if (iCharAt != blockSizeCode) {
                    String[] strArr2 = A03;
                    strArr2[6] = "ZGd";
                    strArr2[7] = "V9k";
                    return 576 << i11;
                }
                A03[1] = "m7WV3F64xJdvTLT";
                return 576 << i11;
            case 6:
            case 7:
                c0914Hf.A0Z(4);
                c0914Hf.A0O();
                String[] strArr3 = A03;
                String str3 = strArr3[3];
                String str4 = strArr3[0];
                int iCharAt2 = str3.charAt(11);
                int blockSizeCode2 = str4.charAt(11);
                if (iCharAt2 != blockSizeCode2) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A03;
                strArr4[6] = "ycs";
                strArr4[7] = "AJV";
                int value = i10 == 6 ? c0914Hf.A0E() : c0914Hf.A0I();
                c0914Hf.A0Y(0);
                int blockSizeCode3 = value + 1;
                return blockSizeCode3;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                int blockSizeCode4 = i10 - 8;
                int value2 = 256 << blockSizeCode4;
                return value2;
            default:
                return -1;
        }
    }

    public static boolean A04(C0914Hf c0914Hf) {
        return c0914Hf.A04() >= 5 && c0914Hf.A0E() == 127 && c0914Hf.A0M() == 1179402563;
    }

    public static boolean A05(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final long A07(C0914Hf c0914Hf) {
        if (!A05(c0914Hf.A00)) {
            return -1L;
        }
        return A00(c0914Hf);
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void A09(boolean z10) {
        super.A09(z10);
        if (z10) {
            this.A01 = null;
            this.A00 = null;
        }
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final boolean A0A(C0914Hf c0914Hf, long j10, CT ct) throws InterruptedException, IOException {
        byte[] bArr = c0914Hf.A00;
        if (this.A01 == null) {
            this.A01 = new HS(bArr, 17);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 9, c0914Hf.A07());
            bArrCopyOfRange[4] = -128;
            List listSingletonList = Collections.singletonList(bArrCopyOfRange);
            ct.A00 = Format.A07(null, A02(0, 10, 50), null, -1, this.A01.A00(), this.A01.A01, this.A01.A06, listSingletonList, null, 0, null);
            return true;
        }
        if ((bArr[0] & Ascii.DEL) == 3) {
            WL wl = new WL(this);
            this.A00 = wl;
            wl.A01(c0914Hf);
            return true;
        }
        if (!A05(bArr)) {
            return true;
        }
        WL wl2 = this.A00;
        if (A03[5].length() != 17) {
            throw new RuntimeException();
        }
        A03[1] = "qWJSCS9yuHod5mMI2FbA5J9U";
        if (wl2 != null) {
            wl2.A00(j10);
            ct.A01 = this.A00;
        }
        return false;
    }
}
