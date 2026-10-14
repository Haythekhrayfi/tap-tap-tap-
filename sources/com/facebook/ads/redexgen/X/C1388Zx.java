package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1388Zx extends K4 {
    public static byte[] A03;
    public final /* synthetic */ C1422aV A00;
    public final /* synthetic */ C05461r A01;
    public final /* synthetic */ C0854Ev A02;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 74);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{32, 5, 0, 17, 21, 4, 19, 65, 21, 8, 12, 4, 14, 20, 21, 79};
    }

    public C1388Zx(C0854Ev c0854Ev, C05461r c05461r, C1422aV c1422aV) {
        this.A02 = c0854Ev;
        this.A01 = c05461r;
        this.A00 = c1422aV;
    }

    @Override // com.facebook.ads.redexgen.X.K4
    public final void A06() {
        this.A02.A0P(this.A01);
        this.A02.A0M(this.A00);
        this.A02.AB6(new JD(AdErrorType.NETWORK_ERROR, A00(0, 16, 43)));
    }
}
