package ed;

import fd.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kc.c0;

/* JADX INFO: loaded from: classes3.dex */
public class u extends q {
    public static final int A(CharSequence charSequence, String str, int i10, boolean z10) {
        j0.i(charSequence, "<this>");
        j0.i(str, "string");
        return (z10 || !(charSequence instanceof String)) ? C(charSequence, str, i10, charSequence.length(), z10, false, 16) : ((String) charSequence).indexOf(str, i10);
    }

    public static final int B(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        bd.a aVar;
        if (z11) {
            int iZ = z(charSequence);
            if (i10 > iZ) {
                i10 = iZ;
            }
            if (i11 < 0) {
                i11 = 0;
            }
            Objects.requireNonNull(bd.a.f3514f);
            aVar = new bd.a(i10, i11, -1);
        } else {
            if (i10 < 0) {
                i10 = 0;
            }
            int length = charSequence.length();
            if (i11 > length) {
                i11 = length;
            }
            aVar = new bd.c(i10, i11);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int i12 = aVar.f3515c;
            int i13 = aVar.f3516d;
            int i14 = aVar.f3517e;
            if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                while (!q.l((String) charSequence2, 0, (String) charSequence, i12, charSequence2.length(), z10)) {
                    if (i12 != i13) {
                        i12 += i14;
                    }
                }
                return i12;
            }
        } else {
            int i15 = aVar.f3515c;
            int i16 = aVar.f3516d;
            int i17 = aVar.f3517e;
            if ((i17 > 0 && i15 <= i16) || (i17 < 0 && i16 <= i15)) {
                while (!L(charSequence2, 0, charSequence, i15, charSequence2.length(), z10)) {
                    if (i15 != i16) {
                        i15 += i17;
                    }
                }
                return i15;
            }
        }
        return -1;
    }

    public static /* synthetic */ int C(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12) {
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return B(charSequence, charSequence2, i10, i11, z10, z11);
    }

    public static int D(CharSequence charSequence, char c10, int i10, boolean z10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        j0.i(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? F(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).indexOf(c10, i10);
    }

    public static /* synthetic */ int E(CharSequence charSequence, String str, int i10, boolean z10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return A(charSequence, str, i10, z10);
    }

    public static final int F(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        boolean z11;
        j0.i(cArr, "chars");
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(kc.j.z(cArr), i10);
        }
        if (i10 < 0) {
            i10 = 0;
        }
        c0 c0VarD = new bd.c(i10, z(charSequence)).iterator();
        while (((bd.b) c0VarD).f3520e) {
            int iA = c0VarD.a();
            char cCharAt = charSequence.charAt(iA);
            int length = cArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z11 = false;
                    break;
                }
                if (b.c(cArr[i11], cCharAt, z10)) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            if (z11) {
                return iA;
            }
        }
        return -1;
    }

    public static int G(CharSequence charSequence, char c10, int i10, boolean z10, int i11) {
        boolean z11;
        if ((i11 & 2) != 0) {
            i10 = z(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        j0.i(charSequence, "<this>");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c10, i10);
        }
        char[] cArr = {c10};
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(kc.j.z(cArr), i10);
        }
        int iZ = z(charSequence);
        if (i10 > iZ) {
            i10 = iZ;
        }
        while (-1 < i10) {
            char cCharAt = charSequence.charAt(i10);
            int i12 = 0;
            while (true) {
                if (i12 >= 1) {
                    z11 = false;
                    break;
                }
                if (b.c(cArr[i12], cCharAt, z10)) {
                    z11 = true;
                    break;
                }
                i12++;
            }
            if (z11) {
                return i10;
            }
            i10--;
        }
        return -1;
    }

    public static int H(CharSequence charSequence, String str, int i10, boolean z10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = z(charSequence);
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        j0.i(charSequence, "<this>");
        j0.i(str, "string");
        return (z11 || !(charSequence instanceof String)) ? B(charSequence, str, i12, 0, z11, true) : ((String) charSequence).lastIndexOf(str, i12);
    }

    public static final List<String> I(CharSequence charSequence) {
        return dd.q.h(dd.q.f(K(charSequence, new String[]{"\r\n", "\n", "\r"}, 0, false, 0, 2), new t(charSequence)));
    }

    public static final String J(String str, int i10, char c10) {
        CharSequence charSequenceSubSequence;
        j0.i(str, "<this>");
        j0.i(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.j.a("Desired length ", i10, " is less than zero."));
        }
        if (i10 <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i10);
            c0 c0VarD = new bd.c(1, i10 - str.length()).iterator();
            while (((bd.b) c0VarD).f3520e) {
                c0VarD.a();
                sb2.append(c10);
            }
            sb2.append((CharSequence) str);
            charSequenceSubSequence = sb2;
        }
        return charSequenceSubSequence.toString();
    }

    public static dd.g K(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        O(i11);
        return new d(charSequence, i10, i11, new s(kc.i.b(strArr), z10));
    }

    public static final boolean L(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z10) {
        j0.i(charSequence, "<this>");
        j0.i(charSequence2, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > charSequence2.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!b.c(charSequence.charAt(i10 + i13), charSequence2.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static final String M(String str, CharSequence charSequence) {
        if (!S(str, charSequence, false, 2)) {
            return str;
        }
        String strSubstring = str.substring(charSequence.length());
        j0.h(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public static final String N(String str, CharSequence charSequence) {
        if (!y(str, charSequence, false, 2)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - charSequence.length());
        j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static final void O(int i10) {
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("Limit must be non-negative, but was ", i10).toString());
        }
    }

    public static final List<String> P(CharSequence charSequence, String str, boolean z10, int i10) {
        O(i10);
        int length = 0;
        int iA = A(charSequence, str, 0, z10);
        if (iA != -1) {
            if (i10 != 1) {
                boolean z11 = i10 > 0;
                int i11 = 10;
                if (z11 && i10 <= 10) {
                    i11 = i10;
                }
                ArrayList arrayList = new ArrayList(i11);
                do {
                    arrayList.add(charSequence.subSequence(length, iA).toString());
                    length = str.length() + iA;
                    if (z11 && arrayList.size() == i10 - 1) {
                        break;
                    }
                    iA = A(charSequence, str, length, z10);
                } while (iA != -1);
                arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
                return arrayList;
            }
        }
        return kc.k.a(charSequence.toString());
    }

    public static List Q(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        j0.i(charSequence, "<this>");
        if (cArr.length == 1) {
            return P(charSequence, String.valueOf(cArr[0]), z10, i10);
        }
        O(i10);
        dd.l lVar = new dd.l(new d(charSequence, 0, i10, new r(cArr, z10)));
        ArrayList arrayList = new ArrayList(kc.m.j(lVar, 10));
        Iterator<Object> it = lVar.iterator();
        while (it.hasNext()) {
            arrayList.add(T(charSequence, (bd.c) it.next()));
        }
        return arrayList;
    }

    public static List R(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11) {
        boolean z11 = (i11 & 2) != 0 ? false : z10;
        int i12 = (i11 & 4) != 0 ? 0 : i10;
        j0.i(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (!(str.length() == 0)) {
                return P(charSequence, str, z11, i12);
            }
        }
        dd.l lVar = new dd.l(K(charSequence, strArr, 0, z11, i12, 2));
        ArrayList arrayList = new ArrayList(kc.m.j(lVar, 10));
        Iterator<Object> it = lVar.iterator();
        while (it.hasNext()) {
            arrayList.add(T(charSequence, (bd.c) it.next()));
        }
        return arrayList;
    }

    public static boolean S(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10) {
        boolean z11 = (i10 & 2) != 0 ? false : z10;
        return (z11 || !(charSequence2 instanceof String)) ? L(charSequence, 0, charSequence2, 0, charSequence2.length(), z11) : q.u((String) charSequence, (String) charSequence2, false, 2);
    }

    public static final String T(CharSequence charSequence, bd.c cVar) {
        j0.i(charSequence, "<this>");
        j0.i(cVar, "range");
        return charSequence.subSequence(Integer.valueOf(cVar.f3515c).intValue(), Integer.valueOf(cVar.f3516d).intValue() + 1).toString();
    }

    public static String U(String str, String str2, String str3, int i10) {
        String str4 = (i10 & 2) != 0 ? str : null;
        j0.i(str, "<this>");
        j0.i(str2, "delimiter");
        j0.i(str4, "missingDelimiterValue");
        int iE = E(str, str2, 0, false, 6);
        if (iE == -1) {
            return str4;
        }
        String strSubstring = str.substring(str2.length() + iE, str.length());
        j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static String V(String str, char c10, String str2, int i10) {
        String str3 = (i10 & 2) != 0 ? str : null;
        j0.i(str, "<this>");
        j0.i(str3, "missingDelimiterValue");
        int iG = G(str, c10, 0, false, 6);
        if (iG == -1) {
            return str3;
        }
        String strSubstring = str.substring(iG + 1, str.length());
        j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static String W(String str, String str2, String str3, int i10) {
        String str4 = (i10 & 2) != 0 ? str : null;
        j0.i(str, "<this>");
        j0.i(str4, "missingDelimiterValue");
        int iE = E(str, str2, 0, false, 6);
        if (iE == -1) {
            return str4;
        }
        String strSubstring = str.substring(0, iE);
        j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static final Boolean X(String str) {
        j0.i(str, "<this>");
        if (j0.d(str, "true")) {
            return Boolean.TRUE;
        }
        if (j0.d(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final CharSequence Y(CharSequence charSequence) {
        j0.i(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zB = a.b(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zB) {
                    break;
                }
                length--;
            } else if (zB) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static final boolean v(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        j0.i(charSequence, "<this>");
        j0.i(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (E(charSequence, (String) charSequence2, 0, z10, 2) >= 0) {
                return true;
            }
        } else if (C(charSequence, charSequence2, 0, charSequence.length(), z10, false, 16) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean w(CharSequence charSequence, char c10, boolean z10, int i10) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        j0.i(charSequence, "<this>");
        return D(charSequence, c10, 0, z10, 2) >= 0;
    }

    public static /* synthetic */ boolean x(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return v(charSequence, charSequence2, z10);
    }

    public static boolean y(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10) {
        boolean z11 = (i10 & 2) != 0 ? false : z10;
        return (z11 || !(charSequence2 instanceof String)) ? L(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z11) : q.h((String) charSequence, (String) charSequence2, false, 2);
    }

    public static final int z(CharSequence charSequence) {
        j0.i(charSequence, "<this>");
        return charSequence.length() - 1;
    }
}
