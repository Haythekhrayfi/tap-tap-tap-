package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0X, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0X {
    public static byte[] A02;
    public final C0Y A00;
    public final String A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 77);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-56, -41, -48, -48, -57, -50, -63};
    }

    public C0X(C0Y c0y, String str) {
        this.A00 = c0y;
        this.A01 = str;
    }

    public final void A02(JSONObject jSONObject) {
        try {
            jSONObject.put(A00(0, 7, 21) + this.A00.getName(), this.A01);
        } catch (JSONException unused) {
        }
    }
}
