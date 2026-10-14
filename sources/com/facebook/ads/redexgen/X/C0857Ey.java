package com.facebook.ads.redexgen.X;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ey, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0857Ey extends AbstractC1404aD implements Serializable {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772011L;

    static {
        A04();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{72, 79, 85, 68, 83, 82, 85, 72, 85, 72, 64, 77};
    }

    public C0857Ey(List<C1D> list) {
        super(list);
    }

    public static C0857Ey A02(JSONObject jSONObject, C1337Xw c1337Xw) {
        C0857Ey c0857Ey = new C0857Ey(AbstractC1404aD.A08(jSONObject, c1337Xw, new C1401aA()));
        c0857Ey.A0w(jSONObject);
        c0857Ey.A0T(A03(0, 12, 67));
        return c0857Ey;
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
