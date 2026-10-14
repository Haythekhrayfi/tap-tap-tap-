package com.facebook.ads.redexgen.X;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class G7 {
    public static byte[] A01;
    public static String[] A02 = {"JYYG6mQudNNGYNEgDR02nAMcKzDjIK4P", "2FeNcZ4AMvklOu4dQ", "gTW6toOfk8MVsyPSs", "RutE2HgswW2Ba8ERBuDpKSxIcN55U9", "rp2dSjsGIei", "VbvhM5GUqSDZ5Gwz8nmiFAQ41xb0JLlL", "3r4p5hSJjLrlxa79edZPjpayqJig4NbN", "nYAJe"};
    public static final Pattern A03;
    public static final Pattern A04;
    public final StringBuilder A00 = new StringBuilder();

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 77);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{39, 124, 71, 101, 17, Ascii.RS, 102, 114, 100, 119, 101, 17, Ascii.RS, 102, 100, 100, 94, 66, 56, Ascii.US, 7, 16, Ascii.GS, Ascii.CAN, 21, 81, 16, Ascii.GS, Ascii.CAN, 22, Ascii.US, Ascii.FS, 20, Ascii.US, 5, 81, 7, 16, Ascii.GS, 4, 20, 75, 81, Ascii.EM, 62, 38, 49, 60, 57, 52, 112, 49, 62, 51, 56, 63, 34, 112, 38, 49, 60, 37, 53, 106, 112, 81, 105, 107, 114, 114, 107, 108, 101, 34, 96, 99, 102, 34, 97, 119, 103, 34, 113, 103, 118, 118, 107, 108, 101, 56, 34, 105, 81, 83, 74, 74, 83, 84, 93, Ascii.SUB, 89, 79, 95, Ascii.SUB, 77, 83, 78, 82, Ascii.SUB, 88, 91, 94, Ascii.SUB, 82, 95, 91, 94, 95, 72, 0, Ascii.SUB, 15, 52, 49, 52, 53, 45, 52, 122, 57, 47, 63, 122, 41, 63, 46, 46, 51, 52, 61, 122, 21, 39, 32, 52, 54, 54, 1, 55, 39, 18, 35, 48, 49, 39, 48, 58, 65, 61, 79, 60, 88, 46, 90, 85, 45, 47, 90, 117, 45, 43, 43, 56, 90, 117, 45, 46, 90, 85, 45, 47, 46, 40, 44, 47, 57, 34, 106, 103, 98, 108, 101, 48, 60, 33, 109, 36, 76, 74, 65, 91, 74, 93, Ascii.CAN, 19, Ascii.EM, 20, 7, 66, 99, 109, 100, 101, 120, 99, 100, 109, 42, Ascii.DEL, 100, 121, Ascii.DEL, 122, 122, 101, 120, 126, 111, 110, 42, 111, 100, 126, 99, 126, 115, 48, 42, 45, 44, 53, 56, 55, 62, 9, 0, 3, 17, 114, 119, 112, 123, 84, 76, Ascii.CAN, Ascii.FS, 17, 17, Ascii.EM, 16, 87, 91, 74, 73, 79, 80, 76, 86, 75, 86, 80, 81, 34, 57, 55, 56, 36, 58, 32, 51, 44, Ascii.GS, Ascii.SUB, 15, Ascii.FS, Ascii.SUB, 111, 74};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0C(String str, String str2, G4 g10, List<G2> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int iA01 = 0;
        while (iA01 < str2.length()) {
            char cCharAt = str2.charAt(iA01);
            switch (cCharAt) {
                case '&':
                    int iIndexOf = str2.indexOf(59, iA01 + 1);
                    int iIndexOf2 = str2.indexOf(32, iA01 + 1);
                    if (iIndexOf == -1) {
                        iIndexOf = iIndexOf2;
                    } else if (iIndexOf2 != -1) {
                        iIndexOf = Math.min(iIndexOf, iIndexOf2);
                    }
                    if (iIndexOf == -1) {
                        spannableStringBuilder.append(cCharAt);
                        iA01++;
                    } else {
                        A07(str2.substring(iA01 + 1, iIndexOf), spannableStringBuilder);
                        if (iIndexOf == iIndexOf2) {
                            spannableStringBuilder.append((CharSequence) A03(1, 1, 17));
                        }
                        iA01 = iIndexOf + 1;
                    }
                    break;
                case '<':
                    if (iA01 + 1 < str2.length()) {
                        int i10 = iA01;
                        boolean z10 = str2.charAt(i10 + 1) == '/';
                        iA01 = A01(str2, i10 + 1);
                        boolean z11 = str2.charAt(iA01 + (-2)) == '/';
                        String strSubstring = str2.substring((z10 ? 2 : 1) + i10, z11 ? iA01 - 2 : iA01 - 1);
                        String strA04 = A04(strSubstring);
                        if (strA04 != null && A0E(strA04)) {
                            if (z10) {
                                while (!arrayDeque.isEmpty()) {
                                    G5 g11 = (G5) arrayDeque.pop();
                                    A0B(str, g11, spannableStringBuilder, list, arrayList);
                                    if (g11.A01.equals(strA04)) {
                                    }
                                    break;
                                }
                            } else if (!z11) {
                                arrayDeque.push(G5.A01(strSubstring, spannableStringBuilder.length()));
                            }
                        }
                    } else {
                        iA01++;
                    }
                    break;
                default:
                    spannableStringBuilder.append(cCharAt);
                    if (A02[6].charAt(12) == 'U') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A02;
                    strArr[0] = "1EgemSjEd6OX6IjZrpNfGkrOscE7SpVJ";
                    strArr[5] = "BPkE8PNmcvUgQGAm1QCgLjutlWPlJ3J2";
                    iA01++;
                    break;
                    break;
            }
        }
        while (!arrayDeque.isEmpty()) {
            A0B(str, (G5) arrayDeque.pop(), spannableStringBuilder, list, arrayList);
        }
        A0B(str, G5.A00(), spannableStringBuilder, list, arrayList);
        g10.A0C(spannableStringBuilder);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final boolean A0G(C0914Hf c0914Hf, G4 g10, List<G2> list) {
        String strA0P = c0914Hf.A0P();
        if (strA0P == null) {
            return false;
        }
        Pattern pattern = A03;
        Matcher matcher = pattern.matcher(strA0P);
        if (matcher.matches()) {
            return A0F(null, matcher, c0914Hf, g10, this.A00, list);
        }
        String strA0P2 = c0914Hf.A0P();
        if (strA0P2 == null) {
            return false;
        }
        Matcher matcher2 = pattern.matcher(strA0P2);
        if (matcher2.matches()) {
            return A0F(strA0P.trim(), matcher2, c0914Hf, g10, this.A00, list);
        }
        return false;
    }

    static {
        A05();
        A03 = Pattern.compile(A03(161, 26, 75));
        A04 = Pattern.compile(A03(3, 12, 0));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:12:0x005b  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    /* JADX WARN: Code duplicated, block: B:6:0x000e  */
    public static int A00(String str) {
        byte b10;
        switch (str.hashCode()) {
            case -1364013995:
                boolean zEquals = str.equals(A03(197, 6, 98));
                if (A02[7].length() != 5) {
                    A02[4] = "DMfdGkOFUxynodxW9z1tlml8oHZW88";
                    if (zEquals) {
                        b10 = 1;
                    } else {
                        b10 = -1;
                    }
                } else {
                    String[] strArr = A02;
                    strArr[2] = "ZWUMzT4FbwhCC9zvg";
                    strArr[1] = "lQdDUKdfIZs4MkB9q";
                    if (zEquals) {
                        b10 = 1;
                    } else {
                        b10 = -1;
                    }
                }
                switch (b10) {
                    case 0:
                        return 0;
                    case 1:
                    case 2:
                        return 1;
                    case 3:
                        return 2;
                    default:
                        Log.w(A03(141, 15, 15), A03(43, 22, 29) + str);
                        return Integer.MIN_VALUE;
                }
            case -1074341483:
                if (str.equals(A03(254, 6, 56))) {
                    b10 = 2;
                } else {
                    b10 = -1;
                }
                switch (b10) {
                    case 0:
                        return 0;
                    case 1:
                    case 2:
                        return 1;
                    case 3:
                        return 2;
                    default:
                        Log.w(A03(141, 15, 15), A03(43, 22, 29) + str);
                        return Integer.MIN_VALUE;
                }
            case 100571:
                if (A02[6].charAt(12) == 'U') {
                    throw new RuntimeException();
                }
                A02[4] = "1rUDZc1zpmKXAlK5wqzuXN7L1n8yuk";
                if (str.equals(A03(203, 3, 48))) {
                    b10 = 3;
                } else {
                    b10 = -1;
                }
                switch (b10) {
                    case 0:
                        return 0;
                    case 1:
                    case 2:
                        return 1;
                    case 3:
                        return 2;
                    default:
                        Log.w(A03(141, 15, 15), A03(43, 22, 29) + str);
                        return Integer.MIN_VALUE;
                }
            case 109757538:
                if (str.equals(A03(281, 5, 35))) {
                    b10 = 0;
                } else {
                    b10 = -1;
                }
                switch (b10) {
                    case 0:
                        return 0;
                    case 1:
                    case 2:
                        return 1;
                    case 3:
                        return 2;
                    default:
                        Log.w(A03(141, 15, 15), A03(43, 22, 29) + str);
                        return Integer.MIN_VALUE;
                }
            default:
                b10 = -1;
                switch (b10) {
                    case 0:
                        return 0;
                    case 1:
                    case 2:
                        return 1;
                    case 3:
                        return 2;
                    default:
                        Log.w(A03(141, 15, 15), A03(43, 22, 29) + str);
                        return Integer.MIN_VALUE;
                }
        }
    }

    public static int A01(String str, int i10) {
        int iIndexOf = str.indexOf(62, i10);
        if (iIndexOf == -1) {
            int index = str.length();
            return index;
        }
        int index2 = iIndexOf + 1;
        return index2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    public static Layout.Alignment A02(String str) {
        byte b10;
        switch (str.hashCode()) {
            case -1364013995:
                if (!str.equals(A03(197, 6, 98))) {
                    b10 = -1;
                } else {
                    b10 = 2;
                }
                break;
            case -1074341483:
                if (!str.equals(A03(254, 6, 56))) {
                    b10 = -1;
                } else {
                    b10 = 3;
                }
                break;
            case 100571:
                if (!str.equals(A03(203, 3, 48))) {
                    b10 = -1;
                } else {
                    b10 = 4;
                }
                break;
            case 3317767:
                if (!str.equals(A03(244, 4, 40))) {
                    b10 = -1;
                } else {
                    b10 = 1;
                }
                break;
            case 108511772:
                if (!str.equals(A03(272, 5, 29))) {
                    b10 = -1;
                } else {
                    b10 = 5;
                }
                break;
            case 109757538:
                if (!str.equals(A03(281, 5, 35))) {
                    b10 = -1;
                } else {
                    b10 = 0;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
            case 1:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 3:
                return Layout.Alignment.ALIGN_CENTER;
            case 4:
            case 5:
                return Layout.Alignment.ALIGN_OPPOSITE;
            default:
                Log.w(A03(141, 15, 15), A03(18, 25, 60) + str);
                return null;
        }
    }

    public static String A04(String str) {
        String strTrim = str.trim();
        if (!strTrim.isEmpty()) {
            return C0930Hv.A0m(strTrim, A03(156, 5, 44))[0];
        }
        if (A02[4].length() == 19) {
            throw new RuntimeException();
        }
        A02[3] = "n2qP40ip31gyFkT4bwxWbWgEBn8x5R";
        return null;
    }

    public static void A06(SpannableStringBuilder spannableStringBuilder, G2 g10, int i10, int i11) {
        if (g10 == null) {
            return;
        }
        if (g10.A08() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(g10.A08()), i10, i11, 33);
        }
        if (g10.A0O()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (g10.A0P()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (g10.A0N()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(g10.A06()), i10, i11, 33);
        }
        if (g10.A0M()) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(g10.A05()), i10, i11, 33);
        }
        String strA0H = g10.A0H();
        if (A02[6].charAt(12) == 'U') {
            throw new RuntimeException();
        }
        A02[6] = "tzfwj6Yb5L7snAfsv0bj9UNvpNFUfxvv";
        if (strA0H != null) {
            spannableStringBuilder.setSpan(new TypefaceSpan(g10.A0H()), i10, i11, 33);
        }
        if (g10.A0A() != null) {
            spannableStringBuilder.setSpan(new AlignmentSpan.Standard(g10.A0A()), i10, i11, 33);
        }
        switch (g10.A07()) {
            case 1:
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) g10.A04(), true), i10, i11, 33);
                return;
            case 2:
                spannableStringBuilder.setSpan(new RelativeSizeSpan(g10.A04()), i10, i11, 33);
                return;
            case 3:
                spannableStringBuilder.setSpan(new RelativeSizeSpan(g10.A04() / 100.0f), i10, i11, 33);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    public static void A07(String str, SpannableStringBuilder spannableStringBuilder) {
        byte b10;
        switch (str.hashCode()) {
            case 3309:
                if (!str.equals(A03(206, 2, 62))) {
                    b10 = -1;
                } else {
                    b10 = 1;
                }
                break;
            case 3464:
                if (!str.equals(A03(252, 2, 117))) {
                    b10 = -1;
                } else {
                    b10 = 0;
                }
                break;
            case 96708:
                if (!str.equals(A03(192, 3, 28))) {
                    b10 = -1;
                } else {
                    b10 = 3;
                }
                break;
            case 3374865:
                if (!str.equals(A03(260, 4, 116))) {
                    b10 = -1;
                } else {
                    b10 = 2;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                spannableStringBuilder.append('<');
                return;
            case 1:
                spannableStringBuilder.append('>');
                return;
            case 2:
                spannableStringBuilder.append(' ');
                return;
            case 3:
                if (A02[7].length() != 5) {
                    throw new RuntimeException();
                }
                A02[7] = "j55CB";
                spannableStringBuilder.append('&');
                return;
            default:
                Log.w(A03(141, 15, 15), A03(209, 31, 71) + str + A03(16, 2, 40));
                return;
        }
    }

    public static void A08(String str, G4 g10) {
        String strA03 = A03(141, 15, 15);
        Matcher matcher = A04.matcher(str);
        while (true) {
            boolean zFind = matcher.find();
            if (A02[7].length() != 5) {
                throw new RuntimeException();
            }
            A02[7] = "ISZNO";
            if (zFind) {
                String strGroup = matcher.group(1);
                String strGroup2 = matcher.group(2);
                try {
                    if (A03(248, 4, 83).equals(strGroup)) {
                        A09(strGroup2, g10);
                    } else if (A03(187, 5, 70).equals(strGroup)) {
                        g10.A0B(A02(strGroup2));
                    } else if (A03(264, 8, 114).equals(strGroup)) {
                        A0A(strGroup2, g10);
                    } else if (A03(277, 4, 4).equals(strGroup)) {
                        g10.A05(G8.A00(strGroup2));
                    } else {
                        Log.w(strA03, A03(121, 20, 23) + strGroup + A03(15, 1, 19) + strGroup2);
                    }
                } catch (NumberFormatException unused) {
                    Log.w(strA03, A03(65, 26, 79) + matcher.group());
                }
            } else {
                return;
            }
        }
    }

    public static void A09(String str, G4 g10) throws NumberFormatException {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            g10.A06(A00(str.substring(iIndexOf + 1)));
            str = str.substring(0, iIndexOf);
        } else {
            g10.A06(Integer.MIN_VALUE);
        }
        if (str.endsWith(A03(2, 1, 47))) {
            g10.A03(G8.A00(str)).A07(0);
            return;
        }
        int commaIndex = Integer.parseInt(str);
        if (commaIndex < 0) {
            commaIndex--;
        }
        g10.A03(commaIndex).A07(1);
    }

    public static void A0A(String str, G4 g10) throws NumberFormatException {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            int commaIndex = iIndexOf + 1;
            g10.A08(A00(str.substring(commaIndex)));
            str = str.substring(0, iIndexOf);
        } else {
            g10.A08(Integer.MIN_VALUE);
        }
        g10.A04(G8.A00(str));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0011  */
    public static void A0B(String str, G5 g10, SpannableStringBuilder spannableStringBuilder, List<G2> list, List<G6> list2) {
        byte b10;
        int i10 = g10.A00;
        int i11 = spannableStringBuilder.length();
        String str2 = g10.A01;
        int start = str2.hashCode();
        switch (start) {
            case 0:
                if (str2.equals(A03(0, 0, 94))) {
                    b10 = 6;
                } else {
                    b10 = -1;
                }
                break;
            case 98:
                if (str2.equals(A03(195, 1, 66))) {
                    b10 = 0;
                } else {
                    b10 = -1;
                }
                break;
            case 99:
                if (str2.equals(A03(196, 1, 10))) {
                    b10 = 3;
                } else {
                    b10 = -1;
                }
                break;
            case 105:
                if (str2.equals(A03(208, 1, 102))) {
                    b10 = 1;
                } else {
                    b10 = -1;
                }
                break;
            case 117:
                if (str2.equals(A03(286, 1, 87))) {
                    b10 = 2;
                } else {
                    b10 = -1;
                }
                break;
            case 118:
                if (str2.equals(A03(287, 1, 113))) {
                    b10 = 5;
                } else {
                    b10 = -1;
                }
                break;
            case 3314158:
                if (str2.equals(A03(240, 4, 20))) {
                    b10 = 4;
                } else {
                    b10 = -1;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        String[] strArr = A02;
        String str3 = strArr[2];
        String str4 = strArr[1];
        int end = str3.length();
        int start2 = str4.length();
        if (end != start2) {
            throw new RuntimeException();
        }
        A02[4] = "fbk5bLqQNEDh8uMBzoI0ZNvOUZBwB";
        switch (b10) {
            case 0:
                spannableStringBuilder.setSpan(new StyleSpan(1), i10, i11, 33);
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, 33);
                break;
            case 2:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                break;
            default:
                return;
        }
        list2.clear();
        A0D(list, str, g10, list2);
        int styleMatchesCount = list2.size();
        for (int end2 = 0; end2 < styleMatchesCount; end2++) {
            A06(spannableStringBuilder, list2.get(end2).A01, i10, i11);
        }
    }

    public static void A0D(List<G2> list, String str, G5 g10, List<G6> list2) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            G2 g11 = list.get(i10);
            String str2 = g10.A01;
            String[] strArr = g10.A03;
            String str3 = g10.A02;
            if (A02[3].length() == 7) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[0] = "AMyBO4NnCnMpgJ1A04yWFmVBrU3uxkkG";
            strArr2[5] = "4pWDMPx0mcGHcptb8cUlFxOOK6mkNbT4";
            int i11 = g11.A09(str, str2, strArr, str3);
            if (i11 > 0) {
                list2.add(new G6(i11, g11));
            }
        }
        Collections.sort(list2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0009  */
    public static boolean A0E(String str) {
        byte b10;
        switch (str.hashCode()) {
            case 98:
                if (!str.equals(A03(195, 1, 66))) {
                    b10 = -1;
                } else {
                    b10 = 0;
                }
                break;
            case 99:
                if (!str.equals(A03(196, 1, 10))) {
                    b10 = -1;
                } else {
                    b10 = 1;
                }
                break;
            case 105:
                if (!str.equals(A03(208, 1, 102))) {
                    b10 = -1;
                } else {
                    b10 = 2;
                }
                break;
            case 117:
                if (!str.equals(A03(286, 1, 87))) {
                    b10 = -1;
                } else {
                    b10 = 4;
                }
                break;
            case 118:
                if (!str.equals(A03(287, 1, 113))) {
                    b10 = -1;
                } else {
                    b10 = 5;
                }
                break;
            case 3314158:
                if (!str.equals(A03(240, 4, 20))) {
                    b10 = -1;
                } else {
                    b10 = 3;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            default:
                return false;
        }
    }

    public static boolean A0F(String str, Matcher matcher, C0914Hf c0914Hf, G4 g10, StringBuilder sb2, List<G2> list) {
        try {
            g10.A0A(G8.A01(matcher.group(1))).A09(G8.A01(matcher.group(2)));
            A08(matcher.group(3), g10);
            sb2.setLength(0);
            while (true) {
                String strA0P = c0914Hf.A0P();
                if (!TextUtils.isEmpty(strA0P)) {
                    if (sb2.length() > 0) {
                        sb2.append(A03(0, 1, 96));
                    }
                    sb2.append(strA0P.trim());
                } else {
                    A0C(str, sb2.toString(), g10, list);
                    return true;
                }
            }
        } catch (NumberFormatException unused) {
            Log.w(A03(141, 15, 15), A03(91, 30, 119) + matcher.group());
            return false;
        }
    }
}
