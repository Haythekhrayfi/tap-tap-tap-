package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ew, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0855Ew extends AbstractC1404aD implements Serializable {
    public static byte[] A00 = null;
    public static String[] A01 = {"lNfLNH12lo092G91EOzeY1GmrD7sd3LT", "IfriMLumcJB6cDz8CdV53z8mw", "VqAXCxmiQObdbt99qEtF0Khtp", "Er74lg0w9IOdrBN2LYFe3VajafM65LKV", "PApxnlfYZYjRi2lMOUBi6X3WbwZz37rL", "HRTNeezFOCXWn2GXnxOdBfrunSk2O2aN", "VET24gqvkOE8n1LMNVzexbAvR8qySpIp", "2OknKa0ZFArae7oBhfBaswv35Z02O68Z"};
    public static final long serialVersionUID = 2751287062553772011L;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 1);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{123, 108, 126, 104, 123, 109, 108, 109, 86, Ascii.DEL, 96, 109, 108, 102};
    }

    static {
        A04();
    }

    public C0855Ew(List<C1D> list) {
        super(list);
    }

    public static C0855Ew A02(JSONObject jSONObject, C1337Xw c1337Xw) {
        C0855Ew c0855Ew = new C0855Ew(AbstractC1404aD.A08(jSONObject, c1337Xw, new C1399a8()));
        c0855Ew.A0w(jSONObject);
        c0855Ew.A0T(A03(0, 14, 8));
        return c0855Ew;
    }

    @Override // com.facebook.ads.redexgen.X.C1C
    public final int A0C() {
        if (!A0a()) {
            if (A0n().A0D().A06() != null) {
                return 1;
            }
            return 0;
        }
        String[] strArr = A01;
        if (strArr[2].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A01[3] = "Avc54I4RohpfVXuEjhFSHVQISVBIYsCd";
        return 3;
    }

    @Override // com.facebook.ads.redexgen.X.C1C
    public final int A0D() {
        return A0n().A0D().A04();
    }
}
