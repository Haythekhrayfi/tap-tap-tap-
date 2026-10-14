package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XZ implements C0T {
    public static byte[] A01;
    public static String[] A02 = {"EcOoOPxvgIM5VM8gU5MNIX90mja3CaI7", "nhJ", "HCYDUCxXnFbS3htlRPDiG7BoiyzyMxIV", "Fv3YAwH75PiBj9X6AN971g", "yIx", "", "9xkhFmOksAfwag3lVFNPfz", "xjMRz"};
    public final C7Q A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 90);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        String[] strArr = A02;
        if (strArr[1].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[0] = "mKsg4hxQhHaV0fiKABuoeRg1A6SJU8YP";
        strArr2[2] = "TgUrCFxQKf96ICwhyLjRHk1rYV6JKdAm";
        A01 = new byte[]{-91, -111, -94, -120, -18, Ascii.GS, 22, 22, 13, 20, -12, 35, Ascii.FS, Ascii.FS, 19, Ascii.SUB, -24, -50, -3, 12, 34, -16, 33, 16, Ascii.EM, Ascii.US, 10, -37, -22, -29, -29, -38, -31, 57, 72, 65, 65, 56, 63, 50, 63, 66, 58, 58, 56, 55};
    }

    static {
        A01();
    }

    public XZ(C7Q c7q) {
        this.A00 = c7q;
    }

    private void A02(int i10, String str, JSONObject jSONObject, boolean z10) {
        C06947w c06947w = new C06947w(A00(4, 6, 78));
        c06947w.A05(jSONObject);
        c06947w.A03(1);
        c06947w.A07(z10);
        try {
            jSONObject.put(A00(33, 13, 121), C06877p.A0H(this.A00));
        } catch (JSONException unused) {
        }
        this.A00.A07().A9L(A00(27, 6, 27), i10 + 4000, c06947w);
        if (this.A00.A04().A8n()) {
            String str2 = A00(10, 8, 84) + str + A00(0, 1, 35) + i10 + A00(1, 3, 14) + jSONObject.toString();
        }
    }

    public static boolean A03(C0U c0u) {
        for (C0U c0u2 : XR.A09) {
            if (c0u2.equals(c0u)) {
                String[] strArr = A02;
                if (strArr[5].length() == strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[0] = "Wnbl1SxbPUMoFXuq6aB18pNeXqZWWzDi";
                strArr2[2] = "Lc0ARXxjXBXBpMD71LOao0gY4EKFysHu";
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.C0T
    public final void A9M(C0U c0u, JSONObject jSONObject) {
        A02(c0u.A02(), c0u.toString(), jSONObject, A03(c0u));
    }

    @Override // com.facebook.ads.redexgen.X.C0T
    public final void A9Y(int i10, JSONObject jSONObject) {
        A02(i10, A00(18, 9, 81) + i10, jSONObject, false);
    }
}
