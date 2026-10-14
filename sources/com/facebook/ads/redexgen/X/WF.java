package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WF extends CU {
    public static byte[] A05;
    public static String[] A06 = {"yJHQcBl4f4L", "G0ieIp3rn9VMbRQq", "FaSr", "diNTGhkPk6T4rZ0cbtlCtFUtzgnoDDOW", "ZsfK02RsUHO", "uQbwEIiYvgO", "fIpYaZEOmsgiiOCz2AK4PDqwDhI8GLBw", "t90Xt1PXy7A3GvR50K3KPdbeyD"};
    public int A00;
    public CW A01;
    public CY A02;
    public C0791Ca A03;
    public boolean A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final CW A02(C0914Hf c0914Hf) throws IOException {
        if (this.A03 == null) {
            this.A03 = C0792Cb.A04(c0914Hf);
            return null;
        }
        if (this.A02 == null) {
            this.A02 = C0792Cb.A03(c0914Hf);
            return null;
        }
        byte[] bArr = new byte[c0914Hf.A07()];
        System.arraycopy(c0914Hf.A00, 0, bArr, 0, c0914Hf.A07());
        CZ[] czArrA0C = C0792Cb.A0C(c0914Hf, this.A03.A05);
        return new CW(this.A03, this.A02, bArr, czArrA0C, C0792Cb.A00(czArrA0C.length - 1));
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 45);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{88, 76, 93, 80, 86, 22, 79, 86, 75, 91, 80, 74};
    }

    static {
        A04();
    }

    public static int A00(byte b10, int i10, int i11) {
        return (b10 >> i11) & (255 >>> (8 - i10));
    }

    public static int A01(byte b10, CW cw) {
        if (!cw.A04[A00(b10, cw.A00, 1)].A03) {
            int modeNumber = cw.A02.A03;
            return modeNumber;
        }
        int modeNumber2 = cw.A02.A04;
        return modeNumber2;
    }

    public static void A05(C0914Hf c0914Hf, long j10) {
        c0914Hf.A0X(c0914Hf.A07() + 4);
        c0914Hf.A00[c0914Hf.A07() - 4] = (byte) (j10 & 255);
        c0914Hf.A00[c0914Hf.A07() - 3] = (byte) ((j10 >>> 8) & 255);
        c0914Hf.A00[c0914Hf.A07() - 2] = (byte) ((j10 >>> 16) & 255);
        c0914Hf.A00[c0914Hf.A07() - 1] = (byte) (255 & (j10 >>> 24));
    }

    public static boolean A06(C0914Hf c0914Hf) {
        try {
            return C0792Cb.A0A(1, c0914Hf, true);
        } catch (C07249b unused) {
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final long A07(C0914Hf c0914Hf) {
        int i10 = 0;
        if ((c0914Hf.A00[0] & 1) == 1) {
            return -1L;
        }
        int iA01 = A01(c0914Hf.A00[0], this.A01);
        if (this.A04) {
            int packetBlockSize = this.A00;
            i10 = (packetBlockSize + iA01) / 4;
        }
        A05(c0914Hf, i10);
        this.A04 = true;
        int samplesInPacket = A06[2].length();
        if (samplesInPacket == 7) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[6] = "lV1SPFBYbG5lxAnFlWta4jj5erMHhp00";
        strArr[3] = "grWENQhpkSsLY54DCH6OLJaVWIdWM4Dq";
        this.A00 = iA01;
        return i10;
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void A08(long j10) {
        super.A08(j10);
        this.A04 = j10 != 0;
        C0791Ca c0791Ca = this.A03;
        this.A00 = c0791Ca != null ? c0791Ca.A03 : 0;
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void A09(boolean z10) {
        super.A09(z10);
        if (z10) {
            this.A01 = null;
            this.A03 = null;
            this.A02 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final boolean A0A(C0914Hf c0914Hf, long j10, CT ct) throws InterruptedException, IOException {
        if (this.A01 != null) {
            return false;
        }
        CW cwA02 = A02(c0914Hf);
        this.A01 = cwA02;
        if (cwA02 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.A01.A02.A09);
        arrayList.add(this.A01.A03);
        ct.A00 = Format.A07(null, A03(0, 12, 20), null, this.A01.A02.A02, -1, this.A01.A02.A05, (int) this.A01.A02.A06, arrayList, null, 0, null);
        return true;
    }
}
