package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class F4 extends AbstractC1404aD {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772012L;

    static {
        A04();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 8);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-123, -124, -111, -111, -120, -107};
    }

    public F4(List<C1D> list) {
        super(list);
    }

    public static F4 A02(JSONObject jSONObject, C1337Xw c1337Xw) {
        F4 f10 = new F4(AbstractC1404aD.A08(jSONObject, c1337Xw, new C1403aC()));
        f10.A0w(jSONObject);
        f10.A0T(A03(0, 6, 27));
        return f10;
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
