package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ud, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1243Ud implements InterfaceC1161Qy {
    public static byte[] A02;
    public final /* synthetic */ C1336Xv A00;
    public final /* synthetic */ InterfaceC1159Qw A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-120, -121, -125, -106, -105, -108, -121, -127, -123, -111, -112, -120, -117, -119};
    }

    public C1243Ud(InterfaceC1159Qw interfaceC1159Qw, C1336Xv c1336Xv) {
        this.A01 = interfaceC1159Qw;
        this.A00 = c1336Xv;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1161Qy
    public final void A40() {
        try {
            IN.A0Q(this.A00).A2S(this.A01.A6a().optJSONObject(A00(0, 14, 2)));
        } catch (JSONException e10) {
            this.A00.A07().A3X(e10);
        }
    }
}
