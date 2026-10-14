package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import ch.qos.logback.core.net.SyslogConstants;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0962Jd {
    public static byte[] A0E;
    public static String[] A0F = {"D9utVieqpHmzq", "1reJ20tywIkt8c03XFg68iFkPgUpcQh9", "1hiVgm3FzyAWthqubctijKn7iSl8t7OZ", "2MGbhVYWK6vnLzanQZMPK5FLJbU6N2Mg", "tHlP6Jv5sj70nCQXOaNATx3kiWqPf1Tp", "kSrICwDX6P2QTtBsWrInLj9wi3Ca9feR", "Z5GcmA6HHHf7tKUPWv2sbOMAsuTj15Gl", "CZogAanemwBaq"};
    public int A00;
    public C7Q A01;
    public JI A02;
    public L0 A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final AdPlacementType A0B;
    public final JN A0C;
    public final String A0D;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 87);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0E = new byte[]{-69, -68, -91, -88, -61, -87, -68, -76, -87, -74, -83, -87, -78, -89, -87, -61, -72, -67, -76, -87, 18, 21, 48, 35, 22, 33, 32, 35, 37, Ascii.SUB, Ascii.US, Ascii.CAN, 48, 20, 32, Ascii.US, 23, Ascii.SUB, Ascii.CAN, 48, Ascii.GS, 18, 36, 37, 48, 38, 33, 21, 18, 37, 22, 48, 37, Ascii.SUB, Ascii.RS, 22, 10, 17, 12, 39, 17, 12, -32, -25, -30, -3, -14, -25, -21, -29, -3, -14, -19, -23, -29, -20, -29, -20, -23, -27, -18, -12, -1, -14, -27, -15, -11, -27, -13, -12, -1, -23, -28, -73, -61, -60, -60, -75, -50, -49, -41, -39, -23, -53, -50, -23, -45, -50, 11, Ascii.RS, Ascii.SUB, Ascii.CAN, 7, 37, 14, 15, 20, Ascii.SUB, Ascii.EM, -16, -19, -15, -17, -16, -4, -5, -10, -8, -13, -65, -70, -68, -73, -43, -68, -62, -73, -67, -4, 6, 18, 0, 8, -1, 7, -4, 18, -12, -9, 18, -8, 11, 3, -8, 5, -4, -8, 1, -10, -8, -14, -18, 6, -7, -20, -6, -5, -7, -16, -22, -5, -20, -21, -43, -54, -36, -35, -24, -36, -54, -33, -50, -51, -24, -43, -40, -52, -54, -43, -50, 22, Ascii.GS, 21, 39, 9, 12, Ascii.ESC, 39, Ascii.SUB, 13, Ascii.EM, Ascii.GS, 13, Ascii.ESC, Ascii.FS, 13, 12, -86, -90, -101, -99, -97, -89, -97, -88, -82, -71, -93, -98, -59, -63, -74, -72, -70, -62, -70, -61, -55, -44, -55, -50, -59, -70, 39, Ascii.SUB, 38, 42, Ascii.SUB, 40, 41, 52, 41, Ascii.RS, 34, Ascii.SUB, Ascii.FS, Ascii.GS, 10, 12, 20, 40, Ascii.GS, Ascii.ESC, 10, 12, 14, -49, -64, -56, -53, -57, -68, -49, -64, -38, -60, -65, 14, -1, 13, 14, Ascii.EM, 7, 9, -2, -1, -30, -44, -49, -33, -45};
    }

    static {
        A02();
    }

    public C0962Jd(C7Q c7q, String str, L0 l10, JI ji, String str2, int i10, boolean z10, boolean z11, JN jn, String str3, String str4, String str5) {
        this.A01 = c7q;
        this.A06 = str;
        this.A03 = l10;
        this.A02 = ji;
        this.A0D = str2;
        this.A00 = i10;
        this.A0A = z10;
        this.A08 = z11;
        this.A0C = jn;
        this.A0B = ji.A04();
        this.A07 = str3;
        this.A05 = str4;
        this.A04 = str5;
    }

    private long A00() {
        SharedPreferences sharedPreferencesA00 = C0972Jp.A00(this.A01);
        String strA01 = A01(173, 17, 50);
        String string = sharedPreferencesA00.getString(strA01, A01(0, 0, 83));
        if (string == null) {
            return 0L;
        }
        String string2 = Locale.getDefault().toString();
        if (A0F[5].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A0F;
        strArr[7] = "UbRIo10SAcnK0";
        strArr[0] = "rMKDtS17rDD7f";
        if (string.equals(string2)) {
            return C2F.A00(this.A01.A01()).A09();
        }
        sharedPreferencesA00.edit().putString(strA01, Locale.getDefault().toString()).apply();
        return 0L;
    }

    private void A03(Map<String, String> params, String str, String str2) {
        params.put(str, str2);
    }

    public final int A04() {
        return this.A00;
    }

    public final JI A05() {
        return this.A02;
    }

    public final L0 A06() {
        return this.A03;
    }

    public final String A07() {
        return this.A06;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0119  */
    /* JADX WARN: Code duplicated, block: B:29:0x012a  */
    /* JADX WARN: Code duplicated, block: B:32:0x013f  */
    /* JADX WARN: Code duplicated, block: B:40:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:43:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:46:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:49:0x0207  */
    /* JADX WARN: Code duplicated, block: B:53:0x0225  */
    public final Map<String, String> A08(Map<String, String> map) {
        String strA01;
        String str;
        int i10;
        boolean z10;
        String strA05;
        String str2;
        String str3;
        String str4;
        HashMap map2 = new HashMap(map);
        A03(map2, A01(125, 4, 91), AnonymousClass60.A00().A03());
        if (AnonymousClass60.A00().A04()) {
            strA01 = A01(0, 1, 52);
        } else {
            strA01 = A01(1, 1, 52);
        }
        A03(map2, A01(129, 9, 31), strA01);
        A03(map2, A01(93, 5, 29), String.valueOf(this.A08));
        A03(map2, A01(207, 12, 3), this.A06);
        if (this.A0B != AdPlacementType.UNKNOWN) {
            A03(map2, A01(219, 14, 30), this.A0B.toString().toLowerCase());
        }
        L0 l10 = this.A03;
        if (l10 != null) {
            A03(map2, A01(276, 5, 52), String.valueOf(l10.A01()));
            A03(map2, A01(119, 6, 81), String.valueOf(this.A03.A00()));
        }
        JI ji = this.A02;
        if (ji != null) {
            A03(map2, A01(256, 11, 36), String.valueOf(ji.A03()));
        }
        boolean z11 = this.A0A;
        String[] strArr = A0F;
        String idfaFlag = strArr[1];
        if (idfaFlag.charAt(22) == strArr[3].charAt(22)) {
            String[] strArr2 = A0F;
            strArr2[1] = "IzDezfH0vo2hFBj3g0HaogFvU1PF9PgW";
            strArr2[3] = "07eFZyxYDfzIdCogAj5SagFmNdTPnXPY";
            if (z11) {
                String strA02 = A01(267, 9, 99);
                String strA03 = A01(1, 1, 52);
                String[] strArr3 = A0F;
                String idfaFlag2 = strArr3[7];
                if (idfaFlag2.length() == strArr3[0].length()) {
                    A0F[5] = "fhkQkDUQCs0vTSuMh05aUEfBswduYuq5";
                    A03(map2, strA02, strA03);
                    str = this.A0D;
                    if (str != null) {
                        A03(map2, A01(98, 10, 51), str);
                    }
                    i10 = this.A00;
                    if (i10 != 0) {
                        A03(map2, A01(190, 17, 113), String.valueOf(i10));
                    }
                    z10 = this.A09;
                    if (z10) {
                        A03(map2, A01(138, 22, 92), String.valueOf(z10));
                    }
                    A03(map2, A01(SyslogConstants.LOG_LOCAL4, 13, 80), String.valueOf(LP.A02(this.A01)));
                    A03(map2, A01(233, 12, 126), LF.A05(System.currentTimeMillis()));
                    if (this.A0C.A06() && this.A0C.A04() != null) {
                        A03(map2, A01(56, 6, 113), this.A0C.A04());
                    }
                    strA05 = this.A0C.A05();
                    if (!TextUtils.isEmpty(strA05)) {
                        A03(map2, A01(62, 14, 71), strA05);
                    }
                    str2 = this.A07;
                    if (str2 != null) {
                        A03(map2, A01(245, 11, 114), str2);
                    }
                    A03(map2, A01(76, 17, 73), UUID.randomUUID().toString());
                    A03(map2, A01(20, 36, 122), LF.A06(A00()));
                    str3 = this.A05;
                    if (str3 != null) {
                        A03(map2, A01(108, 11, 111), str3);
                    }
                    str4 = this.A04;
                    if (str4 != null) {
                        if (A0F[5].length() == 32) {
                            String[] strArr4 = A0F;
                            strArr4[1] = "oug9irQjulGDcN1zjjec1oFwPujMP8yb";
                            strArr4[3] = "P1fPvVUp9X55Q5Xl2H8DBdFxzWSw3WjN";
                            A03(map2, A01(2, 18, 13), str4);
                        }
                    }
                    return map2;
                }
            } else {
                str = this.A0D;
                if (str != null) {
                    A03(map2, A01(98, 10, 51), str);
                }
                i10 = this.A00;
                if (i10 != 0) {
                    A03(map2, A01(190, 17, 113), String.valueOf(i10));
                }
                z10 = this.A09;
                if (z10) {
                    A03(map2, A01(138, 22, 92), String.valueOf(z10));
                }
                A03(map2, A01(SyslogConstants.LOG_LOCAL4, 13, 80), String.valueOf(LP.A02(this.A01)));
                A03(map2, A01(233, 12, 126), LF.A05(System.currentTimeMillis()));
                if (this.A0C.A06()) {
                    A03(map2, A01(56, 6, 113), this.A0C.A04());
                }
                strA05 = this.A0C.A05();
                if (!TextUtils.isEmpty(strA05)) {
                    A03(map2, A01(62, 14, 71), strA05);
                }
                str2 = this.A07;
                if (str2 != null) {
                    A03(map2, A01(245, 11, 114), str2);
                }
                A03(map2, A01(76, 17, 73), UUID.randomUUID().toString());
                A03(map2, A01(20, 36, 122), LF.A06(A00()));
                str3 = this.A05;
                if (str3 != null) {
                    A03(map2, A01(108, 11, 111), str3);
                }
                str4 = this.A04;
                if (str4 != null) {
                    if (A0F[5].length() == 32) {
                        String[] strArr5 = A0F;
                        strArr5[1] = "oug9irQjulGDcN1zjjec1oFwPujMP8yb";
                        strArr5[3] = "P1fPvVUp9X55Q5Xl2H8DBdFxzWSw3WjN";
                        A03(map2, A01(2, 18, 13), str4);
                    }
                }
                return map2;
            }
        }
        throw new RuntimeException();
    }
}
