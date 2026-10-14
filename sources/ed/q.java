package ed;

import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.util.Collection;
import java.util.Comparator;
import kc.c0;
import vc.e0;

/* JADX INFO: loaded from: classes3.dex */
public class q extends p {
    public static boolean h(String str, String str2, boolean z10, int i10) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        j0.i(str, "<this>");
        j0.i(str2, "suffix");
        return !z10 ? str.endsWith(str2) : l(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static final boolean i(String str, String str2, boolean z10) {
        if (str == null) {
            return str2 == null;
        }
        return !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static final Comparator<String> j(e0 e0Var) {
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
        j0.h(comparator, "CASE_INSENSITIVE_ORDER");
        return comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean k(CharSequence charSequence) {
        boolean z10;
        j0.i(charSequence, "<this>");
        if (charSequence.length() != 0) {
            bd.c cVar = new bd.c(0, charSequence.length() - 1);
            if (!(cVar instanceof Collection) || !((Collection) cVar).isEmpty()) {
                c0 c0VarD = cVar.iterator();
                while (true) {
                    if (!((bd.b) c0VarD).f3520e) {
                        z10 = true;
                        break;
                    }
                    if (!a.b(charSequence.charAt(c0VarD.a()))) {
                        z10 = false;
                        break;
                    }
                }
            } else {
                z10 = true;
                break;
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public static final boolean l(String str, int i10, String str2, int i11, int i12, boolean z10) {
        j0.i(str, "<this>");
        j0.i(str2, "other");
        return !z10 ? str.regionMatches(i10, str2, i11, i12) : str.regionMatches(z10, i10, str2, i11, i12);
    }

    public static /* synthetic */ boolean m(String str, int i10, String str2, int i11, int i12, boolean z10, int i13) {
        if ((i13 & 16) != 0) {
            z10 = false;
        }
        return l(str, i10, str2, i11, i12, z10);
    }

    public static final String n(CharSequence charSequence, int i10) {
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + CoreConstants.DOT).toString());
        }
        if (i10 != 0) {
            if (i10 == 1) {
                return charSequence.toString();
            }
            int length = charSequence.length();
            if (length != 0) {
                if (length == 1) {
                    char cCharAt = charSequence.charAt(0);
                    char[] cArr = new char[i10];
                    for (int i11 = 0; i11 < i10; i11++) {
                        cArr[i11] = cCharAt;
                    }
                    return new String(cArr);
                }
                StringBuilder sb2 = new StringBuilder(charSequence.length() * i10);
                c0 c0VarD = new bd.c(1, i10).iterator();
                while (((bd.b) c0VarD).f3520e) {
                    c0VarD.a();
                    sb2.append(charSequence);
                }
                String string = sb2.toString();
                j0.h(string, "{\n                    va…tring()\n                }");
                return string;
            }
        }
        return "";
    }

    public static final String o(String str, String str2, String str3, boolean z10) {
        j0.i(str, "<this>");
        j0.i(str2, "oldValue");
        j0.i(str3, "newValue");
        int i10 = 0;
        int iA = u.A(str, str2, 0, z10);
        if (iA < 0) {
            return str;
        }
        int length = str2.length();
        int i11 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        do {
            sb2.append((CharSequence) str, i10, iA);
            sb2.append(str3);
            i10 = iA + length;
            if (iA >= str.length()) {
                break;
            }
            iA = u.A(str, str2, iA + i11, z10);
        } while (iA > 0);
        sb2.append((CharSequence) str, i10, str.length());
        String string = sb2.toString();
        j0.h(string, "stringBuilder.append(this, i, length).toString()");
        return string;
    }

    public static String p(String str, char c10, char c11, boolean z10, int i10) {
        String string;
        String str2;
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        j0.i(str, "<this>");
        if (z10) {
            StringBuilder sb2 = new StringBuilder(str.length());
            for (int i11 = 0; i11 < str.length(); i11++) {
                char cCharAt = str.charAt(i11);
                if (b.c(cCharAt, c10, z10)) {
                    cCharAt = c11;
                }
                sb2.append(cCharAt);
            }
            string = sb2.toString();
            str2 = "StringBuilder(capacity).…builderAction).toString()";
        } else {
            string = str.replace(c10, c11);
            str2 = "this as java.lang.String…replace(oldChar, newChar)";
        }
        j0.h(string, str2);
        return string;
    }

    public static /* synthetic */ String q(String str, String str2, String str3, boolean z10, int i10) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return o(str, str2, str3, z10);
    }

    public static final boolean r(String str, String str2, int i10, boolean z10) {
        j0.i(str, "<this>");
        j0.i(str2, "prefix");
        return !z10 ? str.startsWith(str2, i10) : l(str, i10, str2, 0, str2.length(), z10);
    }

    public static final boolean s(String str, String str2, boolean z10) {
        j0.i(str, "<this>");
        j0.i(str2, "prefix");
        return !z10 ? str.startsWith(str2) : l(str, 0, str2, 0, str2.length(), z10);
    }

    public static /* synthetic */ boolean t(String str, String str2, int i10, boolean z10, int i11) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return r(str, str2, i10, z10);
    }

    public static /* synthetic */ boolean u(String str, String str2, boolean z10, int i10) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return s(str, str2, z10);
    }
}
