package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.joda.time.DateTimeConstants;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1141Qe {
    public static byte[] A07;
    public QV A05;
    public int A04 = DateTimeConstants.MILLIS_PER_MINUTE;
    public int A03 = 100;
    public int A00 = 10000;
    public int A02 = 8000;
    public int A01 = 3;
    public Map<String, String> A06 = new HashMap();

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 68);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{49, Ascii.GS, 4, 21, 17, 9, 17, 92, 14, Ascii.EM, 8, 14, 21, Ascii.EM, 15, 92, 17, 9, 15, 8, 92, Ascii.RS, Ascii.EM, 92, Ascii.RS, Ascii.EM, 8, 11, Ascii.EM, Ascii.EM, 18, 92, 77, 92, Ascii.GS, 18, Ascii.CAN, 92, 77, 68};
    }

    public final C1141Qe A02(int i10) {
        this.A00 = i10;
        return this;
    }

    public final C1141Qe A03(int i10) {
        if (i10 >= 1 && i10 <= 18) {
            this.A01 = i10;
            return this;
        }
        throw new IllegalArgumentException(A00(0, 40, 56));
    }

    public final C1141Qe A04(int i10) {
        this.A02 = i10;
        return this;
    }

    public final C1141Qe A05(int i10) {
        this.A03 = i10;
        return this;
    }

    public final C1141Qe A06(int i10) {
        this.A04 = i10;
        return this;
    }

    public final C1141Qe A07(QV qv) {
        this.A05 = qv;
        return this;
    }

    public final C1141Qe A08(Map<String, String> requestHeaders) {
        this.A06 = requestHeaders;
        return this;
    }

    public final C1142Qf A09() {
        return new C1142Qf(this.A04, this.A00, this.A02, this.A03, this.A01, this.A06, this.A05);
    }
}
