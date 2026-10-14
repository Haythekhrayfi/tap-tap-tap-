package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ex, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0856Ex extends AbstractC1404aD {
    public static byte[] A00 = null;
    public static String[] A01 = {"jMc", "F9KJU5nWCxEJfH1MtrJPQ98rlg2xhqhb", "7jNlYgKw34wypv3TsOCVRM97qni1IFkS", "W5gvHzH3tQhCbbf1Q7sr07NWbFeRHxz0", "QDsxhdyObZs2LD8uuSUlwesP8VUImdt4", "RqkZZA1TQwwc7Sj8gFRGBwQRvCLKOG1p", "3", "FXFS7BhAGvbRYPXLgdilxhgSLH2Ol13Z"};
    public static final long serialVersionUID = 5751287062553772012L;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A01[0].length() == 16) {
                throw new RuntimeException();
            }
            A01[0] = "basKOcZiobbMvO07tra14WeVIAzrAzDF";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 105);
            i13++;
        }
    }

    public static void A04() {
        A00 = new byte[]{5, -8, 11, 0, 13, -4};
    }

    static {
        A04();
    }

    public C0856Ex(List<C1D> list) {
        super(list);
    }

    public static C0856Ex A02(JSONObject jSONObject, C1337Xw c1337Xw) {
        C0856Ex c0856Ex = new C0856Ex(AbstractC1404aD.A08(jSONObject, c1337Xw, new C1400a9()));
        c0856Ex.A0w(jSONObject);
        c0856Ex.A0T(A03(0, 6, 46));
        return c0856Ex;
    }

    @Override // com.facebook.ads.redexgen.X.C1C
    public final int A0C() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.C1C
    public final int A0D() {
        return 0;
    }
}
