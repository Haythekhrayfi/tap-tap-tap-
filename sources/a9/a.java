package a9;

import ed.u;
import fd.j0;
import java.util.Locale;
import vc.g;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0007a f201b = new C0007a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f202a;

    /* JADX INFO: renamed from: a9.a$a, reason: collision with other inner class name */
    public static final class C0007a {
        public C0007a() {
        }

        public C0007a(g gVar) {
        }

        public final int a(int i10, int i11, int i12, int i13) {
            int i14 = (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
            C0007a c0007a = a.f201b;
            return i14;
        }

        public final int b(String str) throws IllegalArgumentException {
            String str2;
            j0.i(str, "colorString");
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("Expected color string, actual string is empty".toString());
            }
            if (!(str.charAt(0) == '#')) {
                throw new IllegalArgumentException(j0.p("Unknown color ", str).toString());
            }
            int length = str.length();
            if (length == 4) {
                char cCharAt = str.charAt(1);
                char cCharAt2 = str.charAt(2);
                char cCharAt3 = str.charAt(3);
                str2 = new String(new char[]{'f', 'f', cCharAt, cCharAt, cCharAt2, cCharAt2, cCharAt3, cCharAt3});
            } else if (length == 5) {
                char cCharAt4 = str.charAt(1);
                char cCharAt5 = str.charAt(2);
                char cCharAt6 = str.charAt(3);
                char cCharAt7 = str.charAt(4);
                str2 = new String(new char[]{cCharAt4, cCharAt4, cCharAt5, cCharAt5, cCharAt6, cCharAt6, cCharAt7, cCharAt7});
            } else if (length == 7) {
                String strSubstring = str.substring(1);
                j0.h(strSubstring, "this as java.lang.String).substring(startIndex)");
                str2 = j0.p("ff", strSubstring);
            } else {
                if (length != 9) {
                    throw new IllegalArgumentException(j0.p("Unknown color ", str));
                }
                str2 = str.substring(1);
                j0.h(str2, "this as java.lang.String).substring(startIndex)");
            }
            ed.a.a(16);
            int i10 = (int) Long.parseLong(str2, 16);
            C0007a c0007a = a.f201b;
            return i10;
        }
    }

    public /* synthetic */ a(int i10) {
        this.f202a = i10;
    }

    public static String a(int i10) {
        String hexString = Integer.toHexString(i10);
        j0.h(hexString, "toHexString(value)");
        String upperCase = u.J(hexString, 8, '0').toUpperCase(Locale.ROOT);
        j0.h(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return j0.p("#", upperCase);
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && this.f202a == ((a) obj).f202a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f202a);
    }

    public String toString() {
        return a(this.f202a);
    }
}
