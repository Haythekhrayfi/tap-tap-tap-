package e9;

import fd.j0;
import vc.g;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends AssertionError {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f29115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f29116d;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
        }
    }

    /* JADX INFO: renamed from: e9.b$b, reason: collision with other inner class name */
    public static final class C0251b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f29117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f29118b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f29119c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f29120d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f29121e;

        /* JADX INFO: renamed from: e9.b$b$a */
        public static final class a {
            public a() {
            }

            public a(g gVar) {
            }
        }

        static {
            new a(null);
        }

        public C0251b(int i10, String str, String str2) {
            this.f29117a = i10;
            this.f29118b = str;
            this.f29119c = str2;
        }

        public final String a(String str) {
            StringBuilder sbA = o2.b.a('[');
            String strSubstring = str.substring(this.f29120d, (str.length() - this.f29121e) + 1);
            j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            sbA.append(strSubstring);
            sbA.append(']');
            String string = sbA.toString();
            int i10 = this.f29120d;
            if (i10 > 0) {
                String str2 = i10 > this.f29117a ? "..." : "";
                String str3 = this.f29118b;
                j0.f(str3);
                String strSubstring2 = str3.substring(Math.max(0, this.f29120d - this.f29117a), this.f29120d);
                j0.h(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                string = j0.p(j0.p(str2, strSubstring2), string);
            }
            if (this.f29121e <= 0) {
                return string;
            }
            String str4 = this.f29118b;
            j0.f(str4);
            int iMin = Math.min((str4.length() - this.f29121e) + 1 + this.f29117a, this.f29118b.length());
            String str5 = (this.f29118b.length() - this.f29121e) + 1 >= this.f29118b.length() - this.f29117a ? "" : "...";
            String str6 = this.f29118b;
            String strSubstring3 = str6.substring((str6.length() - this.f29121e) + 1, iMin);
            j0.h(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
            return j0.p(string, j0.p(strSubstring3, str5));
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, String str2, String str3) {
        super(str);
        j0.i(str2, "expected");
        j0.i(str3, "actual");
        this.f29115c = str2;
        this.f29116d = str3;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String strA;
        String strA2;
        String str;
        C0251b c0251b = new C0251b(20, this.f29115c, this.f29116d);
        String message = super.getMessage();
        String str2 = c0251b.f29118b;
        if (str2 == null || (str = c0251b.f29119c) == null || j0.d(str2, str)) {
            strA = c0251b.f29118b;
            strA2 = c0251b.f29119c;
        } else {
            c0251b.f29120d = 0;
            String str3 = c0251b.f29118b;
            j0.f(str3);
            int length = str3.length();
            String str4 = c0251b.f29119c;
            j0.f(str4);
            int iMin = Math.min(length, str4.length());
            while (true) {
                int i10 = c0251b.f29120d;
                if (i10 >= iMin || c0251b.f29118b.charAt(i10) != c0251b.f29119c.charAt(c0251b.f29120d)) {
                    break;
                }
                c0251b.f29120d++;
            }
            String str5 = c0251b.f29118b;
            j0.f(str5);
            int length2 = str5.length() - 1;
            String str6 = c0251b.f29119c;
            j0.f(str6);
            int length3 = str6.length() - 1;
            while (true) {
                int i11 = c0251b.f29120d;
                if (length3 < i11 || length2 < i11 || c0251b.f29118b.charAt(length2) != c0251b.f29119c.charAt(length3)) {
                    break;
                }
                length3--;
                length2--;
            }
            c0251b.f29121e = c0251b.f29118b.length() - length2;
            strA = c0251b.a(c0251b.f29118b);
            strA2 = c0251b.a(c0251b.f29119c);
        }
        String strC = e9.a.c(message, strA, strA2);
        j0.h(strC, "format(message, expected, actual)");
        return strC;
    }
}
