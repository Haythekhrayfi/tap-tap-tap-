package com.facebook.ads.redexgen.X;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1T, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1T implements Serializable {
    public static byte[] A04 = null;
    public static String[] A05 = {"fMgCBjwnSPLlGmCQgsSLupdT7pqDzyp4", "yUS8gRlB2MWxUDhPAJrAYtkWaSt8qz4B", "dBasyOwTmlOZTCbIWWmvB1g7E", "RqaXhgYUvoqEq", "F0nm8JPdbdm", "Y401XUNRFDrr9SfWxNZZjZ9oz", "LA5HjnpgcUFB3", "MK9sfwjFqBk"};
    public static final long serialVersionUID = 351643298236575729L;
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 77);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{121, -7, -31, -13, -16, -16, -29, -20, -31, -9, -5, -23, -33, -29, -49, -36, -30, -41, -30, -25, -21};
    }

    static {
        A02();
    }

    public C1T(C1S c1s) {
        this.A02 = c1s.A02;
        this.A03 = c1s.A03;
        this.A00 = c1s.A00;
        this.A01 = c1s.A01;
    }

    public static String A01(String str, String str2, int i10) {
        String strReplace = str.replace(A00(1, 10, 49), str2);
        String strA00 = A00(0, 0, 15);
        if (i10 > 0) {
            StringBuilder sbAppend = new StringBuilder().append(i10);
            String updatedString = A00(0, 1, 12);
            strA00 = sbAppend.append(updatedString).toString();
        }
        String updatedString2 = A00(11, 10, 33);
        String strReplace2 = strReplace.replace(updatedString2, strA00);
        String updatedString3 = A05[7];
        if (updatedString3.length() == 29) {
            throw new RuntimeException();
        }
        A05[4] = "HwfJGa76I4tQ";
        return strReplace2;
    }

    public final String A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }

    public final String A05() {
        return this.A02;
    }

    public final String A06(String str, int i10) {
        return A01(this.A03, str, i10);
    }
}
