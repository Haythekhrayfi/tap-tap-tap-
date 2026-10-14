package com.yandex.mobile.ads.impl;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.android.gms.common.internal.ImagesContract;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes3.dex */
public final class d10 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final char[] f19721j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f19724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f19725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f19726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<String> f19727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f19728g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f19729h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f19730i;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f19731a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f19734d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final ArrayList f19736f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ArrayList f19737g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f19738h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f19732b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f19733c = "";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f19735e = -1;

        /* JADX INFO: renamed from: com.yandex.mobile.ads.impl.d10$a$a, reason: collision with other inner class name */
        public static final class C0203a {
            private C0203a() {
            }

            public /* synthetic */ C0203a(int i10) {
                this();
            }

            public static final int a(String str, int i10, int i11) {
                try {
                    int i12 = Integer.parseInt(b.a(str, i10, i11, "", false, false, false, false, 248));
                    if (1 <= i12 && i12 < 65536) {
                        return i12;
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                }
            }

            public static final int b(String str, int i10, int i11) {
                while (i10 < i11) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt == '[') {
                        do {
                            i10++;
                            if (i10 >= i11) {
                                break;
                            }
                        } while (str.charAt(i10) != ']');
                    } else if (cCharAt == ':') {
                        return i10;
                    }
                    i10++;
                }
                return i11;
            }

            public static final int c(String str, int i10, int i11) {
                boolean z10;
                char cCharAt;
                if (i11 - i10 >= 2) {
                    char cCharAt2 = str.charAt(i10);
                    if ((fd.j0.k(cCharAt2, 97) >= 0 && fd.j0.k(cCharAt2, 122) <= 0) || (fd.j0.k(cCharAt2, 65) >= 0 && fd.j0.k(cCharAt2, 90) <= 0)) {
                        do {
                            z10 = true;
                            i10++;
                            if (i10 < i11) {
                                cCharAt = str.charAt(i10);
                                if (!((((('a' <= cCharAt && cCharAt < '{') || ('A' <= cCharAt && cCharAt < '[')) || ('0' <= cCharAt && cCharAt < ':')) || cCharAt == '+') || cCharAt == '-') && cCharAt != '.') {
                                    z10 = false;
                                }
                            }
                        } while (z10);
                        if (cCharAt == ':') {
                            return i10;
                        }
                    }
                }
                return -1;
            }

            public static final int d(String str, int i10, int i11) {
                int i12 = 0;
                while (i10 < i11) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i12++;
                    i10++;
                }
                return i12;
            }
        }

        static {
            new C0203a(0);
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f19736f = arrayList;
            arrayList.add("");
        }

        public final a a(int i10) {
            if (!(1 <= i10 && i10 < 65536)) {
                throw new IllegalArgumentException(u60.a("unexpected port: ", i10).toString());
            }
            this.f19735e = i10;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:106:0x0261  */
        /* JADX WARN: Code duplicated, block: B:108:0x0274  */
        /* JADX WARN: Code duplicated, block: B:109:0x0276  */
        /* JADX WARN: Code duplicated, block: B:114:0x028d  */
        /* JADX WARN: Code duplicated, block: B:116:0x02a0  */
        /* JADX WARN: Code duplicated, block: B:117:0x02a2  */
        /* JADX WARN: Code duplicated, block: B:120:0x02a7  */
        /* JADX WARN: Code duplicated, block: B:121:0x02b0  */
        /* JADX WARN: Code duplicated, block: B:123:0x02b5  */
        /* JADX WARN: Multi-variable type inference failed */
        public final a a(d10 d10Var, String str) {
            int iA;
            int i10;
            int i11;
            char c10;
            int i12;
            int i13;
            ArrayList arrayList;
            int i14;
            ArrayList arrayList2;
            ArrayList arrayList3;
            int i15;
            fd.j0.i(str, "input");
            int iA2 = ea1.a(0, str.length(), str);
            int iB = ea1.b(iA2, str.length(), str);
            int iC = C0203a.c(str, iA2, iB);
            char c11 = 65535;
            if (iC != -1) {
                if (ed.q.r(str, "https:", iA2, true)) {
                    this.f19731a = "https";
                    iA2 += 6;
                } else {
                    if (!ed.q.r(str, "http:", iA2, true)) {
                        StringBuilder sbA = v60.a("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = str.substring(0, iC);
                        fd.j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sbA.append(strSubstring);
                        sbA.append(CoreConstants.SINGLE_QUOTE_CHAR);
                        throw new IllegalArgumentException(sbA.toString());
                    }
                    this.f19731a = "http";
                    iA2 += 5;
                }
            } else {
                if (d10Var == null) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
                }
                this.f19731a = d10Var.l();
            }
            int iD = C0203a.d(str, iA2, iB);
            char c12 = '?';
            char c13 = CoreConstants.ESCAPE_CHAR;
            char c14 = '/';
            char c15 = '#';
            if (iD >= 2 || d10Var == null || !fd.j0.d(d10Var.l(), this.f19731a)) {
                int i16 = iA2 + iD;
                boolean z10 = false;
                Object[] objArr = false;
                while (true) {
                    iA = ea1.a(i16, iB, str, "@/\\?#");
                    char cCharAt = iA != iB ? str.charAt(iA) : c11;
                    if (cCharAt == c11 || cCharAt == c15 || cCharAt == c14 || cCharAt == c13 || cCharAt == c12) {
                        break;
                    }
                    if (cCharAt == '@') {
                        if (z10) {
                            this.f19733c += "%40" + b.a(str, i16, iA, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                            z10 = z10;
                            objArr = objArr;
                        } else {
                            int iA3 = ea1.a(str, CoreConstants.COLON_CHAR, i16, iA);
                            boolean z11 = z10;
                            String strA = b.a(str, i16, iA3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                            if (objArr != false) {
                                strA = androidx.fragment.app.d0.a(new StringBuilder(), this.f19732b, "%40", strA);
                            }
                            this.f19732b = strA;
                            if (iA3 != iA) {
                                this.f19733c = b.a(str, iA3 + 1, iA, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                                z10 = true;
                            } else {
                                z10 = z11;
                            }
                            objArr = true;
                        }
                        i16 = iA + 1;
                        c15 = '#';
                        c14 = '/';
                        c13 = CoreConstants.ESCAPE_CHAR;
                        c12 = '?';
                        c11 = 65535;
                    }
                }
                int iB2 = C0203a.b(str, i16, iA);
                int i17 = iB2 + 1;
                if (i17 < iA) {
                    this.f19734d = hz.a(b.a(str, i16, iB2, false, 4));
                    int iA4 = C0203a.a(str, i17, iA);
                    this.f19735e = iA4;
                    if (!(iA4 != -1)) {
                        StringBuilder sbA2 = v60.a("Invalid URL port: \"");
                        String strSubstring2 = str.substring(i17, iA);
                        fd.j0.h(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sbA2.append(strSubstring2);
                        sbA2.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                        throw new IllegalArgumentException(sbA2.toString().toString());
                    }
                    i10 = 0;
                } else {
                    i10 = 0;
                    this.f19734d = hz.a(b.a(str, i16, iB2, false, 4));
                    String str2 = this.f19731a;
                    fd.j0.f(str2);
                    this.f19735e = b.a(str2);
                }
                if ((this.f19734d != null ? 1 : i10) == 0) {
                    StringBuilder sbA3 = v60.a("Invalid URL host: \"");
                    String strSubstring3 = str.substring(i16, iB2);
                    fd.j0.h(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    sbA3.append(strSubstring3);
                    sbA3.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                    throw new IllegalArgumentException(sbA3.toString().toString());
                }
                i11 = i10;
                iA2 = iA;
            } else {
                this.f19732b = d10Var.f();
                this.f19733c = d10Var.b();
                this.f19734d = d10Var.g();
                this.f19735e = d10Var.i();
                this.f19736f.clear();
                this.f19736f.addAll(d10Var.d());
                if (iA2 == iB || str.charAt(iA2) == '#') {
                    a(d10Var.e());
                }
                i11 = 0;
            }
            int iA5 = ea1.a(iA2, iB, str, "?#");
            if (iA2 != iA5) {
                char cCharAt2 = str.charAt(iA2);
                if (cCharAt2 == '/' || cCharAt2 == '\\') {
                    this.f19736f.clear();
                    this.f19736f.add("");
                    iA2++;
                } else {
                    ArrayList arrayList4 = this.f19736f;
                    arrayList4.set(arrayList4.size() - 1, "");
                }
                int i18 = iA2;
                while (i18 < iA5) {
                    int iA6 = ea1.a(i18, iA5, str, "/\\");
                    int i19 = iA6 < iA5 ? 1 : i11;
                    String strA2 = b.a(str, i18, iA6, HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, false, 240);
                    if (((fd.j0.d(strA2, ".") || ed.q.i(strA2, "%2e", true)) ? 1 : i11) == 0) {
                        if (fd.j0.d(strA2, CallerDataConverter.DEFAULT_RANGE_DELIMITER)) {
                            i12 = 1;
                        } else {
                            i12 = 1;
                            if (!ed.q.i(strA2, "%2e.", true) && !ed.q.i(strA2, ".%2e", true) && !ed.q.i(strA2, "%2e%2e", true)) {
                                i13 = 1;
                                i12 = i11;
                            }
                            if (i12 != 0) {
                                arrayList3 = this.f19736f;
                                if (((String) arrayList3.remove(arrayList3.size() - i13)).length() == 0) {
                                    i15 = i13;
                                } else {
                                    i15 = i11;
                                }
                                if (i15 != 0 || ((this.f19736f.isEmpty() ? 1 : 0) ^ i13) == 0) {
                                    this.f19736f.add("");
                                } else {
                                    ArrayList arrayList5 = this.f19736f;
                                    arrayList5.set(arrayList5.size() - i13, "");
                                }
                            } else {
                                arrayList = this.f19736f;
                                if (((CharSequence) arrayList.get(arrayList.size() - i13)).length() == 0) {
                                    i14 = i13;
                                } else {
                                    i14 = i11;
                                }
                                arrayList2 = this.f19736f;
                                if (i14 != 0) {
                                    arrayList2.set(arrayList2.size() - i13, strA2);
                                } else {
                                    arrayList2.add(strA2);
                                }
                                if (i19 != 0) {
                                    this.f19736f.add("");
                                }
                            }
                        }
                        i13 = i12;
                        if (i12 != 0) {
                            arrayList3 = this.f19736f;
                            if (((String) arrayList3.remove(arrayList3.size() - i13)).length() == 0) {
                                i15 = i13;
                            } else {
                                i15 = i11;
                            }
                            if (i15 != 0) {
                                this.f19736f.add("");
                            } else {
                                this.f19736f.add("");
                            }
                        } else {
                            arrayList = this.f19736f;
                            if (((CharSequence) arrayList.get(arrayList.size() - i13)).length() == 0) {
                                i14 = i13;
                            } else {
                                i14 = i11;
                            }
                            arrayList2 = this.f19736f;
                            if (i14 != 0) {
                                arrayList2.set(arrayList2.size() - i13, strA2);
                            } else {
                                arrayList2.add(strA2);
                            }
                            if (i19 != 0) {
                                this.f19736f.add("");
                            }
                        }
                    }
                    i18 = i19 != 0 ? iA6 + 1 : iA6;
                }
            }
            if (iA5 >= iB || str.charAt(iA5) != '?') {
                c10 = '#';
            } else {
                c10 = '#';
                int iA7 = ea1.a(str, '#', iA5, iB);
                this.f19737g = b.d(b.a(str, iA5 + 1, iA7, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, 208));
                iA5 = iA7;
            }
            if (iA5 < iB && str.charAt(iA5) == c10) {
                this.f19738h = b.a(str, iA5 + 1, iB, "", true, false, false, true, SyslogConstants.LOG_LOCAL6);
            }
            return this;
        }

        public final d10 a() {
            ArrayList arrayList;
            String str = this.f19731a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            String strA = b.a(this.f19732b, 0, 0, false, 7);
            String strA2 = b.a(this.f19733c, 0, 0, false, 7);
            String str2 = this.f19734d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iA = this.f19735e;
            if (iA == -1) {
                String str3 = this.f19731a;
                fd.j0.f(str3);
                iA = b.a(str3);
            }
            int i10 = iA;
            ArrayList arrayList2 = this.f19736f;
            ArrayList arrayList3 = new ArrayList(kc.m.j(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(b.a((String) it.next(), 0, 0, false, 7));
            }
            ArrayList<String> arrayList4 = this.f19737g;
            if (arrayList4 != null) {
                arrayList = new ArrayList(kc.m.j(arrayList4, 10));
                for (String str4 : arrayList4) {
                    arrayList.add(str4 != null ? b.a(str4, 0, 0, true, 3) : null);
                }
            } else {
                arrayList = null;
            }
            String str5 = this.f19738h;
            return new d10(str, strA, strA2, str2, i10, arrayList3, arrayList, str5 != null ? b.a(str5, 0, 0, false, 7) : null, toString());
        }

        public final void a(String str) {
            String strA;
            this.f19737g = (str == null || (strA = b.a(str, 0, 0, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, 211)) == null) ? null : b.d(strA);
        }

        public final a b(String str) {
            fd.j0.i(str, "host");
            String strA = hz.a(b.a(str, 0, 0, false, 7));
            if (strA == null) {
                throw new IllegalArgumentException(fn1.a("unexpected host: ", str));
            }
            this.f19734d = strA;
            return this;
        }

        public final ArrayList b() {
            return this.f19736f;
        }

        public final void b(int i10) {
            this.f19735e = i10;
        }

        public final a c() {
            this.f19733c = b.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
            return this;
        }

        public final a c(String str) {
            fd.j0.i(str, "scheme");
            String str2 = "http";
            if (!ed.q.i(str, "http", true)) {
                str2 = "https";
                if (!ed.q.i(str, "https", true)) {
                    throw new IllegalArgumentException(fn1.a("unexpected scheme: ", str));
                }
            }
            this.f19731a = str2;
            return this;
        }

        public final a d() {
            String str = this.f19734d;
            this.f19734d = str != null ? new ed.f("[\"<>^`{|}]").b(str, "") : null;
            int size = this.f19736f.size();
            for (int i10 = 0; i10 < size; i10++) {
                ArrayList arrayList = this.f19736f;
                arrayList.set(i10, b.a((String) arrayList.get(i10), 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, 227));
            }
            ArrayList arrayList2 = this.f19737g;
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str2 = (String) arrayList2.get(i11);
                    arrayList2.set(i11, str2 != null ? b.a(str2, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, 195) : null);
                }
            }
            String str3 = this.f19738h;
            this.f19738h = str3 != null ? b.a(str3, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, 163) : null;
            return this;
        }

        public final void d(String str) {
            this.f19738h = str;
        }

        public final a e() {
            this.f19732b = b.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
            return this;
        }

        public final void e(String str) {
            fd.j0.i(str, "<set-?>");
            this.f19733c = str;
        }

        public final void f(String str) {
            fd.j0.i(str, "<set-?>");
            this.f19732b = str;
        }

        public final void g(String str) {
            this.f19734d = str;
        }

        public final void h(String str) {
            this.f19731a = str;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0032  */
        /* JADX WARN: Code duplicated, block: B:20:0x0040  */
        /* JADX WARN: Code duplicated, block: B:22:0x0043  */
        public final String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            String str2 = this.f19731a;
            if (str2 != null) {
                sb2.append(str2);
                str = "://";
            } else {
                str = "//";
            }
            sb2.append(str);
            if (this.f19732b.length() > 0) {
                sb2.append(this.f19732b);
                if (this.f19733c.length() > 0) {
                    sb2.append(CoreConstants.COLON_CHAR);
                    sb2.append(this.f19733c);
                }
                sb2.append('@');
            } else {
                if (this.f19733c.length() > 0) {
                    sb2.append(this.f19732b);
                    if (this.f19733c.length() > 0) {
                        sb2.append(CoreConstants.COLON_CHAR);
                        sb2.append(this.f19733c);
                    }
                    sb2.append('@');
                }
            }
            String str3 = this.f19734d;
            if (str3 != null) {
                if (ed.u.w(str3, CoreConstants.COLON_CHAR, false, 2)) {
                    sb2.append('[');
                    sb2.append(this.f19734d);
                    sb2.append(']');
                } else {
                    sb2.append(this.f19734d);
                }
            }
            int iA = this.f19735e;
            if (iA != -1 || this.f19731a != null) {
                if (iA == -1) {
                    String str4 = this.f19731a;
                    fd.j0.f(str4);
                    iA = b.a(str4);
                }
                String str5 = this.f19731a;
                if (str5 == null || iA != b.a(str5)) {
                    sb2.append(CoreConstants.COLON_CHAR);
                    sb2.append(iA);
                }
            }
            b.a(this.f19736f, sb2);
            if (this.f19737g != null) {
                sb2.append('?');
                ArrayList arrayList = this.f19737g;
                fd.j0.f(arrayList);
                b.a((List) arrayList, sb2);
            }
            if (this.f19738h != null) {
                sb2.append('#');
                sb2.append(this.f19738h);
            }
            String string = sb2.toString();
            fd.j0.h(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(int i10) {
            this();
        }

        public static int a(String str) {
            fd.j0.i(str, "scheme");
            if (fd.j0.d(str, "http")) {
                return 80;
            }
            return fd.j0.d(str, "https") ? 443 : -1;
        }

        /* JADX WARN: Code duplicated, block: B:100:0x011b  */
        /* JADX WARN: Code duplicated, block: B:102:0x011e  */
        /* JADX WARN: Code duplicated, block: B:106:0x012c A[LOOP:2: B:104:0x0126->B:106:0x012c, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:119:0x0097 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:49:0x0090  */
        /* JADX WARN: Code duplicated, block: B:51:0x0094 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:98:0x0116  */
        public static String a(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, int i12) {
            int i13;
            boolean z14;
            boolean z15 = false;
            int i14 = (i12 & 1) != 0 ? 0 : i10;
            int length = (i12 & 2) != 0 ? str.length() : i11;
            boolean z16 = (i12 & 8) != 0 ? false : z10;
            boolean z17 = (i12 & 16) != 0 ? false : z11;
            boolean z18 = (i12 & 32) != 0 ? false : z12;
            boolean z19 = (i12 & 64) != 0 ? false : z13;
            fd.j0.i(str, "<this>");
            fd.j0.i(str2, "encodeSet");
            int iCharCount = i14;
            while (true) {
                if (iCharCount >= length) {
                    String strSubstring = str.substring(i14, length);
                    fd.j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return strSubstring;
                }
                int iCodePointAt = str.codePointAt(iCharCount);
                i13 = 127;
                if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || z19) && !ed.u.w(str2, (char) iCodePointAt, z15, 2))) {
                    if (iCodePointAt == 37) {
                        if (!z16) {
                            break;
                        }
                        if (z17) {
                            int i15 = iCharCount + 2;
                            if (!(i15 < length && str.charAt(iCharCount) == '%' && ea1.a(str.charAt(iCharCount + 1)) != -1 && ea1.a(str.charAt(i15)) != -1)) {
                                break;
                            }
                            if (iCodePointAt != 43) {
                            }
                            iCharCount += Character.charCount(iCodePointAt);
                            z15 = false;
                        } else {
                            if (iCodePointAt != 43) {
                            }
                            iCharCount += Character.charCount(iCodePointAt);
                            z15 = false;
                        }
                    } else {
                        if (iCodePointAt != 43 && z18) {
                            break;
                        }
                        iCharCount += Character.charCount(iCodePointAt);
                        z15 = false;
                    }
                } else {
                    break;
                }
            }
            qd.c cVar = new qd.c();
            cVar.f0(str, i14, iCharCount);
            qd.c cVar2 = null;
            while (iCharCount < length) {
                int iCodePointAt2 = str.codePointAt(iCharCount);
                if (!z16 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                    if (iCodePointAt2 == 43 && z18) {
                        cVar.e0(z16 ? "+" : "%2B");
                    } else if (iCodePointAt2 < 32 || iCodePointAt2 == i13 || ((iCodePointAt2 >= 128 && !z19) || ed.u.w(str2, (char) iCodePointAt2, false, 2))) {
                        if (cVar2 == null) {
                            cVar2 = new qd.c();
                        }
                        cVar2.g0(iCodePointAt2);
                        while (!cVar2.y()) {
                            int i16 = cVar2.readByte() & 255;
                            cVar.R(37);
                            cVar.R(d10.f19721j[(i16 >> 4) & 15]);
                            cVar.R(d10.f19721j[i16 & 15]);
                        }
                    } else {
                        if (iCodePointAt2 == 37) {
                            if (z16) {
                                if (z17) {
                                    int i17 = iCharCount + 2;
                                    if (i17 < length && str.charAt(iCharCount) == '%') {
                                        if (ea1.a(str.charAt(iCharCount + 1)) != -1 && ea1.a(str.charAt(i17)) != -1) {
                                            z14 = true;
                                        }
                                        if (!z14) {
                                        }
                                    }
                                    z14 = false;
                                    if (!z14) {
                                    }
                                }
                            }
                            if (cVar2 == null) {
                                cVar2 = new qd.c();
                            }
                            cVar2.g0(iCodePointAt2);
                            while (!cVar2.y()) {
                                int i18 = cVar2.readByte() & 255;
                                cVar.R(37);
                                cVar.R(d10.f19721j[(i18 >> 4) & 15]);
                                cVar.R(d10.f19721j[i18 & 15]);
                            }
                        }
                        cVar.g0(iCodePointAt2);
                    }
                }
                iCharCount += Character.charCount(iCodePointAt2);
                i13 = 127;
            }
            return cVar.n();
        }

        public static String a(String str, int i10, int i11, boolean z10, int i12) {
            int i13;
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 4) != 0) {
                z10 = false;
            }
            fd.j0.i(str, "<this>");
            int iCharCount = i10;
            while (iCharCount < i11) {
                char cCharAt = str.charAt(iCharCount);
                if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                    qd.c cVar = new qd.c();
                    cVar.f0(str, i10, iCharCount);
                    while (iCharCount < i11) {
                        int iCodePointAt = str.codePointAt(iCharCount);
                        if (iCodePointAt == 37 && (i13 = iCharCount + 2) < i11) {
                            int iA = ea1.a(str.charAt(iCharCount + 1));
                            int iA2 = ea1.a(str.charAt(i13));
                            if (iA == -1 || iA2 == -1) {
                                cVar.g0(iCodePointAt);
                                iCharCount += Character.charCount(iCodePointAt);
                            } else {
                                cVar.R((iA << 4) + iA2);
                                iCharCount = Character.charCount(iCodePointAt) + i13;
                            }
                        } else if (iCodePointAt == 43 && z10) {
                            cVar.R(32);
                            iCharCount++;
                        } else {
                            cVar.g0(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        }
                    }
                    return cVar.n();
                }
                iCharCount++;
            }
            String strSubstring = str.substring(i10, i11);
            fd.j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public static void a(ArrayList arrayList, StringBuilder sb2) {
            fd.j0.i(arrayList, "<this>");
            fd.j0.i(sb2, "out");
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append('/');
                sb2.append((String) arrayList.get(i10));
            }
        }

        public static void a(List list, StringBuilder sb2) {
            fd.j0.i(list, "<this>");
            fd.j0.i(sb2, "out");
            bd.a aVarG = bd.e.g(bd.e.h(0, list.size()), 2);
            int i10 = aVarG.f3515c;
            int i11 = aVarG.f3516d;
            int i12 = aVarG.f3517e;
            if ((i12 <= 0 || i10 > i11) && (i12 >= 0 || i11 > i10)) {
                return;
            }
            while (true) {
                String str = (String) list.get(i10);
                String str2 = (String) list.get(i10 + 1);
                if (i10 > 0) {
                    sb2.append('&');
                }
                sb2.append(str);
                if (str2 != null) {
                    sb2.append('=');
                    sb2.append(str2);
                }
                if (i10 == i11) {
                    return;
                } else {
                    i10 += i12;
                }
            }
        }

        public static d10 b(String str) {
            fd.j0.i(str, "<this>");
            return new a().a(null, str).a();
        }

        public static d10 c(String str) {
            fd.j0.i(str, "<this>");
            try {
                return b(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public static ArrayList d(String str) {
            String strSubstring;
            fd.j0.i(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                int iD = ed.u.D(str, '&', i10, false, 4);
                if (iD == -1) {
                    iD = str.length();
                }
                int iD2 = ed.u.D(str, '=', i10, false, 4);
                if (iD2 == -1 || iD2 > iD) {
                    String strSubstring2 = str.substring(i10, iD);
                    fd.j0.h(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    strSubstring = null;
                } else {
                    String strSubstring3 = str.substring(i10, iD2);
                    fd.j0.h(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                    strSubstring = str.substring(iD2 + 1, iD);
                    fd.j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(strSubstring);
                i10 = iD + 1;
            }
            return arrayList;
        }
    }

    static {
        new b(0);
        f19721j = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public d10(String str, String str2, String str3, String str4, int i10, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        fd.j0.i(str, "scheme");
        fd.j0.i(str2, AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER);
        fd.j0.i(str3, "password");
        fd.j0.i(str4, "host");
        fd.j0.i(arrayList, "pathSegments");
        fd.j0.i(str6, ImagesContract.URL);
        this.f19722a = str;
        this.f19723b = str2;
        this.f19724c = str3;
        this.f19725d = str4;
        this.f19726e = i10;
        this.f19727f = arrayList2;
        this.f19728g = str5;
        this.f19729h = str6;
        this.f19730i = fd.j0.d(str, "https");
    }

    public static final d10 a(String str) {
        return b.c(str);
    }

    public final d10 b(String str) {
        a aVarA;
        fd.j0.i(str, "link");
        try {
            aVarA = new a().a(this, str);
        } catch (IllegalArgumentException unused) {
            aVarA = null;
        }
        if (aVarA != null) {
            return aVarA.a();
        }
        return null;
    }

    public final String b() {
        if (this.f19724c.length() == 0) {
            return "";
        }
        String strSubstring = this.f19729h.substring(ed.u.D(this.f19729h, CoreConstants.COLON_CHAR, this.f19722a.length() + 3, false, 4) + 1, ed.u.D(this.f19729h, '@', 0, false, 6));
        fd.j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String c() {
        int iD = ed.u.D(this.f19729h, '/', this.f19722a.length() + 3, false, 4);
        String str = this.f19729h;
        String strSubstring = this.f19729h.substring(iD, ea1.a(iD, str.length(), str, "?#"));
        fd.j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final ArrayList d() {
        int iD = ed.u.D(this.f19729h, '/', this.f19722a.length() + 3, false, 4);
        String str = this.f19729h;
        int iA = ea1.a(iD, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iD < iA) {
            int i10 = iD + 1;
            int iA2 = ea1.a(this.f19729h, '/', i10, iA);
            String strSubstring = this.f19729h.substring(i10, iA2);
            fd.j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iD = iA2;
        }
        return arrayList;
    }

    public final String e() {
        if (this.f19727f == null) {
            return null;
        }
        int iD = ed.u.D(this.f19729h, '?', 0, false, 6) + 1;
        String str = this.f19729h;
        String strSubstring = this.f19729h.substring(iD, ea1.a(str, '#', iD, str.length()));
        fd.j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d10) && fd.j0.d(((d10) obj).f19729h, this.f19729h);
    }

    public final String f() {
        if (this.f19723b.length() == 0) {
            return "";
        }
        int length = this.f19722a.length() + 3;
        String str = this.f19729h;
        String strSubstring = this.f19729h.substring(length, ea1.a(length, str.length(), str, ":@"));
        fd.j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String g() {
        return this.f19725d;
    }

    public final boolean h() {
        return this.f19730i;
    }

    public final int hashCode() {
        return this.f19729h.hashCode();
    }

    public final int i() {
        return this.f19726e;
    }

    public final String j() {
        if (this.f19727f == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        b.a(this.f19727f, sb2);
        return sb2.toString();
    }

    public final String k() {
        a aVarA;
        try {
            aVarA = new a().a(this, "/...");
        } catch (IllegalArgumentException unused) {
            aVarA = null;
        }
        fd.j0.f(aVarA);
        return aVarA.e().c().a().f19729h;
    }

    public final String l() {
        return this.f19722a;
    }

    public final URI m() {
        String strSubstring;
        a aVar = new a();
        aVar.h(this.f19722a);
        aVar.f(f());
        aVar.e(b());
        aVar.g(this.f19725d);
        aVar.b(this.f19726e != b.a(this.f19722a) ? this.f19726e : -1);
        aVar.b().clear();
        aVar.b().addAll(d());
        aVar.a(e());
        if (this.f19728g == null) {
            strSubstring = null;
        } else {
            strSubstring = this.f19729h.substring(ed.u.D(this.f19729h, '#', 0, false, 6) + 1);
            fd.j0.h(strSubstring, "this as java.lang.String).substring(startIndex)");
        }
        aVar.d(strSubstring);
        String string = aVar.d().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                URI uriCreate = URI.create(new ed.f("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").b(string, ""));
                fd.j0.h(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final URL n() {
        try {
            return new URL(this.f19729h);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final String toString() {
        return this.f19729h;
    }
}
