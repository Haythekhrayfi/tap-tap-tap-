package com.facebook.ads.redexgen.X;

import com.facebook.ads.AudienceNetworkAds;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1324Xj extends K4 {
    public static byte[] A02;
    public final /* synthetic */ AudienceNetworkAds.InitListener A00;
    public final /* synthetic */ C1336Xv A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 8);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{91, 108, 99, 40, 123, 125, 107, 107, 109, 123, 123, 110, 125, 100, 100, 113, 40, 97, 102, 97, 124, 97, 105, 100, 97, 114, 109, 108, 41};
    }

    public C1324Xj(C1336Xv c1336Xv, AudienceNetworkAds.InitListener initListener) {
        this.A01 = c1336Xv;
        this.A00 = initListener;
    }

    @Override // com.facebook.ads.redexgen.X.K4
    public final void A06() {
        try {
            XU.A02().A0C(this.A01);
        } catch (Throwable th) {
            this.A01.A07().A3X(th);
        }
        C8J.A0C(this.A01);
        AudienceNetworkAds.InitListener initListener = this.A00;
        if (initListener != null) {
            C8J.A04(initListener, new C8I(true, A00(0, 29, 0)));
        }
    }
}
