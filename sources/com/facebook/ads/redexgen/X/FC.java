package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class FC extends T2 {
    public static byte[] A02;
    public final /* synthetic */ C1422aV A00;
    public final /* synthetic */ C1412aL A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 74);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-113, -68, -68, -71, -68, 106, -81, -62, -81, -83, -65, -66, -77, -72, -79, 106, -85, -83, -66, -77, -71, -72, 2, -2, -3, 0};
    }

    public FC(C1422aV c1422aV, C1412aL c1412aL) {
        this.A00 = c1422aV;
        this.A01 = c1412aL;
    }

    @Override // com.facebook.ads.redexgen.X.N6
    public final void AAN() {
        this.A00.A0E = true;
        if (!this.A00.A0F) {
            return;
        }
        this.A00.A09();
    }

    @Override // com.facebook.ads.redexgen.X.T2, com.facebook.ads.redexgen.X.N6
    public final void AAe(String str, Map<String, String> extraData) {
        this.A00.A03.A0E().A3e();
        Uri uriA00 = KW.A00(str);
        if (A00(22, 4, 82).equals(uriA00.getScheme()) && C05110h.A04(uriA00.getAuthority()) && this.A00.A00 != null) {
            this.A00.A00.AAX(this.A00);
        }
        AbstractC05100g adAction = C05110h.A00(this.A00.A03, this.A00.A04, this.A01.A6M(), uriA00, extraData);
        if (adAction == null) {
            return;
        }
        try {
            this.A00.A03.A0E().A3b();
            adAction.A0C();
        } catch (Exception e10) {
            Log.e(C1422aV.A0I, A00(0, 22, 0), e10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.T2, com.facebook.ads.redexgen.X.N6
    public final void ABO() {
        this.A00.A03.A0E().A3f(this.A00.A01 != null);
        if (this.A00.A01 == null) {
            return;
        }
        this.A00.A01.A02();
    }

    @Override // com.facebook.ads.redexgen.X.T2, com.facebook.ads.redexgen.X.N6
    public final void AC6() {
        this.A00.A03.A0E().A3h();
        this.A00.A01.A07();
    }

    @Override // com.facebook.ads.redexgen.X.N6
    public final void ADO() {
    }
}
