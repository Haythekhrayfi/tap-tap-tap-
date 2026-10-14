package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.af, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1432af extends AbstractC05100g {
    public static byte[] A01;
    public static final String A02;
    public final Uri A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 1);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{88, 115, 123, 126, 119, 118, 50, -122, -127, 50, -127, -126, 119, -128, 50, 126, 123, -128, 125, 50, -121, -124, 126, 76, 50};
    }

    static {
        A01();
        A02 = C1432af.class.getSimpleName();
    }

    public C1432af(C1337Xw c1337Xw, InterfaceC0937Id interfaceC0937Id, String str, Uri uri) {
        super(c1337Xw, interfaceC0937Id, str);
        this.A00 = uri;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05100g
    public final void A0C() {
        try {
            KV.A0C(new KV(), super.A00, this.A00, this.A02);
        } catch (Exception unused) {
            String str = A00(0, 25, 17) + this.A00.toString();
        }
    }
}
