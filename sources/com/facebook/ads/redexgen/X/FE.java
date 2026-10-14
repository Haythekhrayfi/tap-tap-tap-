package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FE extends AbstractC1434ah {
    public static byte[] A02;
    public static String[] A03 = {"EO73VH", "Qgz5bq7vpM6wgaeZrwJ0N", "K0RixItTLV229tIQ9volfY9Fr2yfBG4Z", "0XJd0xzB9RaoqzSBbOWrwbmO5Qd7B1Hm", "", "cDFQfUnzrKwrnb1BC8KnyL9IHyRAK9fC", "Q7Q0M0vYffDRrtcuJmKxnq", "hygqtGcON2Cep"};
    public static final String A04;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 99);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {14, 41, 49, 52, 45, 44, -24, 60, 55, -24, 55, 56, 45, 54, -24, 52, 49, 54, 51, -24, 61, 58, 52, 2, -24, -14, -17, -12, -15};
        if (A03[0].length() == 23) {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[3] = "z2LBMWL3UZ6mgEOfq1wT6wdWGhdUBaxY";
        strArr[2] = "LNV6u0tAGiEAXpu6l5ZCQkq7c5KJBKxy";
        A02 = bArr;
    }

    static {
        A01();
        A04 = FE.class.getSimpleName();
    }

    public FE(C1337Xw c1337Xw, InterfaceC0937Id interfaceC0937Id, String str, Uri uri, Map<String, String> mExtraData, C05160n c05160n, boolean z10) {
        super(c1337Xw, interfaceC0937Id, str, c05160n, z10);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05100g
    public final EnumC05090f A0A() {
        if (A0F(this.A00)) {
            return null;
        }
        try {
            KV.A0C(new KV(), ((AbstractC05100g) this).A00, KW.A00(this.A00.getQueryParameter(A00(25, 4, 35))), ((AbstractC05100g) this).A02);
            return null;
        } catch (Exception unused) {
            String str = A00(0, 25, 101) + this.A00.toString();
            return EnumC05090f.A02;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1434ah
    public final void A0D() {
        EnumC05090f enumC05090fA0A = null;
        if (((AbstractC1434ah) this).A02) {
            enumC05090fA0A = A0A();
        }
        A0E(this.A01, enumC05090fA0A);
    }
}
