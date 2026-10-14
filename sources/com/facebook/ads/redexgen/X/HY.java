package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import ch.qos.logback.core.net.SyslogConstants;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class HY {
    public static byte[] A00;
    public static String[] A01 = {"ieRwpCtuK3Uo85cjZEKrdCd37bpimhtY", "SWj8fz5xlO0E25uIaEG5QR97PjyPRjqc", "qo9VJyE5iR063JUt4OVQofS18tUFAamR", "Gteq1bVQSr5XKs4A7OlOChfT", "PlUSU1U83lKSeB2O5clYiMU4GGCz", "temwCY24a07Ffi16KYvyo8ZHegbdFSBA", "rqFjIUeqZXsH", "sifdD3H0nhYqlD5Nup1ZT"};
    public static final ArrayList<HX> A02;

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A01[4].length() == 2) {
                throw new RuntimeException();
            }
            A01[6] = "B0XYBYFpMcx2";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 15);
            i13++;
        }
    }

    public static void A08() {
        A00 = new byte[]{92, -127, -119, 116, Ascii.DEL, 124, 119, 51, -128, 124, -128, 120, 51, -121, -116, -125, 120, 77, 51, -56, -54, -108, -102, -32, -17, -17, -21, -24, -30, -32, -13, -24, -18, -19, -82, -30, -28, -32, -84, -75, -81, -73, -89, -74, -74, -78, -81, -87, -89, -70, -81, -75, -76, 117, -87, -85, -89, 115, 125, 118, 126, -55, -40, -40, -44, -47, -53, -55, -36, -47, -41, -42, -105, -52, -34, -54, -37, -35, -54, -37, -101, -86, -86, -90, -93, -99, -101, -82, -93, -87, -88, 105, -93, -98, 109, -81, -66, -66, -70, -73, -79, -81, -62, -73, -67, -68, 125, -66, -75, -63, -85, -70, -70, -74, -77, -83, -85, -66, -77, -71, -72, 121, -66, -66, -73, -74, 117, -62, -73, -74, -127, -112, -112, -116, -119, -125, -127, -108, -119, -113, -114, 79, -106, -113, -126, -109, -107, -126, -96, -81, -81, -85, -88, -94, -96, -77, -88, -82, -83, 110, -73, 108, -94, -96, -84, -92, -79, -96, 108, -84, -82, -77, -88, -82, -83, -40, -25, -25, -29, -32, -38, -40, -21, -32, -26, -27, -90, -17, -92, -36, -28, -22, -34, -18, -3, -3, -7, -10, -16, -18, 1, -10, -4, -5, -68, 5, -70, -6, -3, -63, -70, -16, -14, -18, -70, -61, -67, -59, -70, -55, -55, -59, -62, -68, -70, -51, -62, -56, -57, -120, -47, -122, -58, -55, -115, -122, -49, -51, -51, -100, -85, -85, -89, -92, -98, -100, -81, -92, -86, -87, 106, -77, 104, -84, -80, -92, -98, -90, -81, -92, -88, -96, 104, -81, -77, 110, -94, -93, -78, -78, -82, -85, -91, -93, -74, -85, -79, -80, 113, -70, 111, -76, -93, -71, -91, -91, 119, -122, -122, -126, Ascii.DEL, 121, 119, -118, Ascii.DEL, -123, -124, 69, -114, 67, -119, 121, -118, 123, 73, 75, 124, -117, -117, -121, -124, 126, 124, -113, -124, -118, -119, 74, -109, 72, -114, -112, 125, -115, -124, -117, -42, -22, -39, -34, -28, -59, -39, -56, -51, -45, -109, -59, -57, -105, -113, -93, -110, -105, -99, 93, -109, -113, -111, 97, -125, -105, -122, -117, -111, 81, -121, -125, -123, 85, 79, -116, -111, -123, 116, -120, 119, 124, -126, 66, -128, -125, 71, 116, 64, Ascii.DEL, 116, -121, -128, -62, -42, -59, -54, -48, -112, -50, -47, -58, -56, -128, -108, -125, -120, -114, 78, -114, -113, -108, -110, -105, -85, -102, -97, -91, 101, -86, -88, -85, -101, 99, -98, -102, -109, -89, -106, -101, -95, 97, -88, -96, -106, 96, -106, -90, -91, -52, -32, -49, -44, -38, -102, -31, -39, -49, -103, -49, -33, -34, -103, -45, -49, -61, -41, -58, -53, -47, -111, -40, -47, -44, -60, -53, -43, -88, -67, -86, 120, -23, -2, -21, -69, -34, -37, -35, -83, -115, -114, -116, 92, -27, -11, -12, -28, -26, -10, -11, -25, -99, -83, -84, -95, 122, -118, -119, -126, -53, -55, -111, -103, -36, -38, -92, -86, -121, -124, -107, 80, -126, -112, 125, 75, -54, -51, -111, -66, -39, -36, -96, -51, -102, -58, -57, -52, -54, -95, -110, -91, -95, -80, -93, -98, -97, -87, -12, -25, -30, -29, -19, -83, -33, -12, -31, -42, -55, -60, -59, -49, -113, -56, -59, -42, -61, -97, -110, -115, -114, -104, 88, -106, -103, 93, -97, 86, -114, -100, -41, -54, -59, -58, -48, -112, -50, -47, -58, -56, -116, Ascii.DEL, 122, 123, -123, 69, -125, -122, 123, 125, 72, -109, -122, -127, -126, -116, 76, -108, -109, -128, 78, -45, -58, -63, -62, -52, -116, -43, -118, -45, -53, -63, -117, -52, -53, -113, -117, -45, -51, -107, -18, -31, -36, -35, -25, -89, -16, -91, -18, -26, -36, -90, -25, -26, -86, -90, -18, -24, -79, -31, -38, -35, -51, -44, -34, -23, -29, -93, -85, -33, -39, -103, -94, -10, -16, -72, -53, -59, -114};
    }

    static {
        A08();
        A02 = new ArrayList<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0009  */
    public static int A00(String str) {
        byte b10;
        switch (str.hashCode()) {
            case -2123537834:
                if (!str.equals(A04(350, 14, 19))) {
                    b10 = -1;
                } else {
                    b10 = 2;
                }
                break;
            case -1095064472:
                if (!str.equals(A04(412, 13, 35))) {
                    b10 = -1;
                } else {
                    b10 = 3;
                }
                break;
            case 187078296:
                if (!str.equals(A04(331, 9, 85))) {
                    b10 = -1;
                } else {
                    b10 = 0;
                }
                break;
            case 1504578661:
                if (!str.equals(A04(340, 10, 31))) {
                    b10 = -1;
                } else {
                    b10 = 1;
                }
                break;
            case 1505942594:
                if (!str.equals(A04(425, 16, 92))) {
                    b10 = -1;
                } else {
                    b10 = 4;
                }
                break;
            case 1556697186:
                if (!str.equals(A04(399, 13, 39))) {
                    b10 = -1;
                } else {
                    b10 = 5;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return 5;
            case 1:
            case 2:
                return 6;
            case 3:
                return 7;
            case 4:
                return 8;
            case 5:
                if (A01[0].charAt(10) != 'U') {
                    throw new RuntimeException();
                }
                A01[4] = "";
                return 14;
            default:
                return 0;
        }
    }

    public static int A01(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (A09(str)) {
            return 1;
        }
        if (A0B(str)) {
            return 2;
        }
        if (A0A(str) || A04(23, 19, 112).equals(str)) {
            return 3;
        }
        if (A01[3].length() != 9) {
            String[] strArr = A01;
            strArr[1] = "LJhw0AyNjlY1daGtGtEMPB4ZWI4lLjxq";
            strArr[2] = "Jpqt6rhjDWOI2VL5M75U9AGCLzRFcI9K";
            if (A04(42, 19, 55).equals(str) || A04(193, 25, 126).equals(str) || A04(306, 20, 12).equals(str) || A04(110, 20, 59).equals(str) || A04(239, 28, 44).equals(str) || A04(218, 21, 74).equals(str) || A04(267, 19, 51).equals(str) || A04(130, 18, 17).equals(str) || A04(95, 15, 63).equals(str) || A04(61, 19, 89).equals(str)) {
                return 3;
            }
            if (!A04(80, 15, 43).equals(str)) {
                if (A01[6].length() != 12) {
                    A01[5] = "rwbag1QSJlT1yZsbEhClTGvMhp5yspb0";
                    if (A04(HideBottomViewOnScrollBehavior.EXIT_ANIMATION_DURATION, 5, 84).equals(str)) {
                        return 4;
                    }
                } else {
                    String[] strArr2 = A01;
                    strArr2[1] = "oiEUm8Pa8xqbloGyO2Igjyb7THZFd6q8";
                    strArr2[2] = "XLA61hR1gHB686GQiHbqHMaGrNzQ5Lyu";
                    if (A04(HideBottomViewOnScrollBehavior.EXIT_ANIMATION_DURATION, 18, 104).equals(str)) {
                        return 4;
                    }
                }
                if (!A04(286, 20, 7).equals(str)) {
                    boolean zEquals = A04(148, 27, 48).equals(str);
                    if (A01[0].charAt(10) != 'U') {
                        throw new RuntimeException();
                    }
                    A01[4] = "H9g3dImLmMl";
                    if (zEquals) {
                        return 4;
                    }
                    return A02(str);
                }
                return 4;
            }
            return 4;
        }
        throw new RuntimeException();
    }

    public static int A02(String str) {
        int size = A02.size();
        for (int i10 = 0; i10 < size; i10++) {
            HX hx = A02.get(i10);
            if (str.equals(hx.A02)) {
                int customMimeTypeCount = hx.A00;
                return customMimeTypeCount;
            }
        }
        return -1;
    }

    public static String A03(int i10) {
        switch (i10) {
            case 32:
                return A04(542, 13, 26);
            case 33:
                return A04(523, 9, 111);
            case 35:
                return A04(532, 10, 81);
            case 64:
            case 102:
            case 103:
            case 104:
                return A04(364, 15, 4);
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return A04(565, 11, 7);
            case 105:
            case 107:
                return A04(379, 10, 82);
            case 106:
                return A04(555, 10, 82);
            case 163:
                return A04(576, 10, 14);
            case 165:
                return A04(331, 9, 85);
            case 166:
                return A04(340, 10, 31);
            case 169:
            case 172:
                return A04(412, 13, 35);
            case 170:
            case 171:
                return A04(425, 16, 92);
            case 173:
                return A04(389, 10, 16);
            case 177:
                return A04(605, 19, 105);
            default:
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0101  */
    /* JADX WARN: Code duplicated, block: B:41:0x010d  */
    public static String A05(String str) {
        String strSubstring;
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.startsWith(A04(453, 4, 56)) || strTrim.startsWith(A04(457, 4, 121))) {
            String[] strArr = A01;
            if (strArr[1].charAt(18) != strArr[2].charAt(18)) {
                A01[6] = "dBf8LPxRTZfA";
                return A04(523, 9, 111);
            }
        } else {
            if (strTrim.startsWith(A04(493, 4, 16)) || strTrim.startsWith(A04(497, 4, 11))) {
                return A04(532, 10, 81);
            }
            if (strTrim.startsWith(A04(641, 3, 70)) || strTrim.startsWith(A04(634, 4, 90))) {
                return A04(605, 19, 105);
            }
            if (strTrim.startsWith(A04(638, 3, 113)) || strTrim.startsWith(A04(630, 4, 100))) {
                if (A01[0].charAt(10) == 'U') {
                    A01[4] = "N4y1wlrnUtzUy4IbT1xu4qgz3N7JO";
                    return A04(586, 19, 78);
                }
            } else {
                if (strTrim.startsWith(A04(501, 4, 78))) {
                    String strA03 = null;
                    if (A01[7].length() != 21) {
                        if (strTrim.startsWith(A04(505, 5, 93))) {
                            strSubstring = strTrim.substring(5);
                            if (strSubstring.length() >= 2) {
                                try {
                                    String objectTypeString = strSubstring.substring(0, 2);
                                    String objectTypeHexString = C0930Hv.A0N(objectTypeString);
                                    strA03 = A03(Integer.parseInt(objectTypeHexString, 16));
                                } catch (NumberFormatException unused) {
                                }
                            }
                        }
                    } else {
                        A01[0] = "ymRJewdyBBUw0Z4KdSSTlQuR9QXQD1Bs";
                        String objectTypeString2 = A04(505, 5, 93);
                        if (strTrim.startsWith(objectTypeString2)) {
                            strSubstring = strTrim.substring(5);
                            if (strSubstring.length() >= 2) {
                                String objectTypeString3 = strSubstring.substring(0, 2);
                                String objectTypeHexString2 = C0930Hv.A0N(objectTypeString3);
                                strA03 = A03(Integer.parseInt(objectTypeHexString2, 16));
                            }
                        }
                    }
                    return strA03 == null ? A04(364, 15, 4) : strA03;
                }
                String strA04 = A04(19, 4, 88);
                if (A01[6].length() == 12) {
                    A01[4] = "7flMggQ72b";
                    if (strTrim.startsWith(strA04) || strTrim.startsWith(A04(461, 4, 107))) {
                        return A04(331, 9, 85);
                    }
                    if (strTrim.startsWith(A04(489, 4, 104)) || strTrim.startsWith(A04(465, 4, 26))) {
                        return A04(340, 10, 31);
                    }
                    if (strTrim.startsWith(A04(485, 4, 87))) {
                        return A04(350, 14, 19);
                    }
                    if (strTrim.startsWith(A04(469, 4, 114)) || strTrim.startsWith(A04(473, 4, 115))) {
                        return A04(412, 13, 35);
                    }
                    if (strTrim.startsWith(A04(477, 4, 42)) || strTrim.startsWith(A04(481, 4, 7))) {
                        return A04(425, 16, 92);
                    }
                    if (strTrim.startsWith(A04(510, 4, 72))) {
                        return A04(389, 10, 16);
                    }
                    if (strTrim.startsWith(A04(624, 6, 92))) {
                        return A04(441, 12, 83);
                    }
                    return A06(strTrim);
                }
            }
        }
        throw new RuntimeException();
    }

    public static String A06(String str) {
        int size = A02.size();
        for (int i10 = 0; i10 < size; i10++) {
            HX hx = A02.get(i10);
            if (str.startsWith(hx.A01)) {
                return hx.A02;
            }
        }
        return null;
    }

    public static String A07(String str) {
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(47);
        if (iIndexOf != -1) {
            return str.substring(0, iIndexOf);
        }
        throw new IllegalArgumentException(A04(0, 19, 4) + str);
    }

    public static boolean A09(String str) {
        return A04(326, 5, 102).equals(A07(str));
    }

    public static boolean A0A(String str) {
        return A04(SyslogConstants.SYSLOG_PORT, 4, 30).equals(A07(str));
    }

    public static boolean A0B(String str) {
        return A04(518, 5, 43).equals(A07(str));
    }
}
