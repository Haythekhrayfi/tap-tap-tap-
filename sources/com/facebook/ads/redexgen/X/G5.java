package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class G5 {
    public static byte[] A04;
    public static String[] A05 = {"tfY6MbCXKCMIEBFaz5DTNSwQjeQlsdhW", "1UTUottnLG4Bc2erVSXZ5CquC0lsHmD9", "WRMBQ6uqQ67Iv9A4m1bVrpx6x8KF8zD0", "GdVDnzSaJp111GE95ChA", "h9KCnpbAgc3gR8", "h9vqZVyAxwthOkAWolCZS7P8JeHRRya", "xZHasxsAmMNy85vBb9toR", "aWQTkv"};
    public static final String[] A06;
    public final int A00;
    public final String A01;
    public final String A02;
    public final String[] A03;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 39);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{-102, -51, -97};
    }

    static {
        A03();
        A06 = new String[0];
    }

    public G5(String str, int i10, String str2, String[] strArr) {
        this.A00 = i10;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = strArr;
    }

    public static G5 A00() {
        String strA02 = A02(0, 0, 73);
        return new G5(strA02, 0, strA02, new String[0]);
    }

    public static G5 A01(String str, int i10) {
        String strTrim;
        String[] strArr;
        String strTrim2 = str.trim();
        if (strTrim2.isEmpty()) {
            if (A05[5].length() != 31) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[4] = "p9dgK4HsNp7ZHS";
            strArr2[3] = "rCFBFYq0pHxXM20TKPTK";
            return null;
        }
        if (A05[1].charAt(25) != '0') {
            throw new RuntimeException();
        }
        String[] strArr3 = A05;
        strArr3[4] = "ihPGMeIk0rsbhx";
        strArr3[3] = "BIjif2bQ9kjhGmUX3ymE";
        int iIndexOf = strTrim2.indexOf(A02(0, 1, 83));
        if (iIndexOf == -1) {
            strTrim = A02(0, 0, 73);
        } else {
            strTrim = strTrim2.substring(iIndexOf).trim();
            strTrim2 = strTrim2.substring(0, iIndexOf);
        }
        String[] nameAndClasses = C0930Hv.A0l(strTrim2, A02(1, 2, 74));
        String name = nameAndClasses[0];
        int voiceStartIndex = nameAndClasses.length;
        if (voiceStartIndex > 1) {
            int voiceStartIndex2 = nameAndClasses.length;
            strArr = (String[]) Arrays.copyOfRange(nameAndClasses, 1, voiceStartIndex2);
        } else {
            strArr = A06;
        }
        return new G5(name, i10, strTrim, strArr);
    }
}
