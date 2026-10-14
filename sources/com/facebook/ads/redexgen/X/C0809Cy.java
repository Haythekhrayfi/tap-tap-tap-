package com.facebook.ads.redexgen.X;

import android.media.MediaCodec;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0809Cy extends Exception {
    public static byte[] A04;
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    static {
        A03();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 113);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{5, -7, -8, Ascii.EM, 23, 35, Ascii.CAN, Ascii.EM, 38, -44, Ascii.GS, 34, Ascii.GS, 40, -44, Ascii.SUB, 21, Ascii.GS, 32, Ascii.EM, Ascii.CAN, -18, -44, -21, 12, 10, 22, 11, 12, Ascii.EM, -57, 16, 21, 16, Ascii.ESC, -57, 13, 8, 16, 19, 12, 11, -31, -57, 2, -22, -71, -83, 35, 47, 45, -18, 39, 47, 47, 39, 44, 37, -18, 33, 46, 36, 50, 47, 41, 36, -18, 37, 56, 47, 48, 44, 33, 57, 37, 50, -18, 13, 37, 36, 41, 33, 3, 47, 36, 37, 35, 20, 50, 33, 35, 43, 18, 37, 46, 36, 37, 50, 37, 50, Ascii.US, 92, 83, 85, 77};
    }

    public C0809Cy(Format format, Throwable th, boolean z10, int i10) {
        super(A01(23, 22, 54) + i10 + A01(45, 3, 28) + format, th);
        this.A02 = format.A0O;
        this.A03 = z10;
        this.A00 = null;
        this.A01 = A00(i10);
    }

    public C0809Cy(Format format, Throwable th, boolean z10, String str) {
        super(A01(2, 21, 67) + str + A01(0, 2, 104) + format, th);
        this.A02 = format.A0O;
        this.A03 = z10;
        this.A00 = str;
        this.A01 = C0930Hv.A02 >= 21 ? A02(th) : null;
    }

    public static String A00(int i10) {
        String strA01 = i10 < 0 ? A01(101, 4, 125) : A01(0, 0, 80);
        StringBuilder sb2 = new StringBuilder();
        String sign = A01(48, 53, 79);
        return sb2.append(sign).append(strA01).append(Math.abs(i10)).toString();
    }

    public static String A02(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
