package com.facebook.ads.redexgen.X;

import android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC06777d {
    public static byte[] A01;
    public static String[] A02 = {"HVKZvR5UTjStDLOL9o4rPessbKuh0O7V", "lcBs6IulTDBXs0xMNwr7074HBb5CT680", "pp9", "08Pk9qbigTz1ItVQ0hAeiWjKqsV0Kke0", "IZPR1WSW", "qkmVdqnPN26Te8aFuQlNVKOt05q5LyYY", "adXBxD3OrJvPB32QQ8w", "pvdflY6bA4nr3ZgRZtp7kAtC3Qj6GBkc"};
    public final C7Z A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 59);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{121, -127, 123, -104, 123, -102, -86, -48, -36, -39, -41, -86, -44, 11, -4, -7, 6, -7, -44, -108, -118, 126, -126, -111, -124, -128, -109, -124, 95, -109, -128, -127, -117, -124, 95, -95, -81, -84, -83, 125, -79, -98, -97, -87, -94, 125, -90, -93, 125, -94, -75, -90, -80, -79, -80, 125, -8, -22, -15, -22, -24, -7, -59};
    }

    public abstract String A06();

    public abstract C7X[] A0A();

    static {
        A04();
    }

    public AbstractC06777d(C7Z c7z) {
        this.A00 = c7z;
    }

    private String A00() {
        C7X[] c7xArrA0A = A0A();
        if (c7xArrA0A.length < 1) {
            if (A02[4].length() != 8) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[0] = "NTtbWHu0RetWI6yxki67w6X3knWPKgwD";
            strArr[1] = "wg0AU135P1OwlpIQrYrtBV6UQnwqkPhP";
            return null;
        }
        String result = A01(0, 0, 31);
        for (int i10 = 0; i10 < c7xArrA0A.length - 1; i10++) {
            result = result + c7xArrA0A[i10].A02() + A01(20, 2, 35);
        }
        return result + c7xArrA0A[c7xArrA0A.length - 1].A02();
    }

    public static String A02(String str, C7X[] c7xArr) {
        StringBuilder sb2 = new StringBuilder(A01(56, 7, 106));
        for (int i10 = 0; i10 < c7xArr.length - 1; i10++) {
            sb2.append(c7xArr[i10].A01);
            int i11 = A02[2].length();
            if (i11 != 3) {
                throw new RuntimeException();
            }
            A02[4] = "CXWyM2Ol";
            sb2.append(A01(20, 2, 35));
        }
        sb2.append(c7xArr[c7xArr.length - 1].A01);
        sb2.append(A01(6, 6, 79));
        sb2.append(str);
        return sb2.toString();
    }

    public static String A03(String str, C7X[] c7xArr, C7X c7x) {
        return A02(str, c7xArr) + A01(12, 7, 121) + c7x.A01 + A01(2, 4, 32);
    }

    public final SQLiteDatabase A05() {
        return this.A00.A0E();
    }

    public final void A07(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(A01(22, 13, 4) + A06() + A01(0, 2, 30) + A00() + A01(19, 1, 48));
    }

    public final void A08(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(A01(35, 21, 34) + A06());
    }

    public final boolean A09() {
        return A05().delete(A06(), null, null) > 0;
    }
}
