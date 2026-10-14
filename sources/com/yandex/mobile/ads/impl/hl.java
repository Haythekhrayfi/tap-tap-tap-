package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import com.developer.filepicker.model.DialogConfigs;
import com.google.android.gms.common.internal.ImagesContract;
import com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.http.DatesKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes3.dex */
public final class hl {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f21452j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f21453k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f21454l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f21455m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f21456n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f21459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f21460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f21461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f21462f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f21463g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f21464h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f21465i;

    public static final class a {
        /* JADX WARN: Code duplicated, block: B:32:0x003f  */
        private static int a(int i10, int i11, String str, boolean z10) {
            boolean z11;
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if ((cCharAt >= ' ' || cCharAt == '\t') && cCharAt < 127) {
                    if (!(cCharAt <= '9' && '0' <= cCharAt)) {
                        if (!(cCharAt <= 'z' && 'a' <= cCharAt)) {
                            z11 = (cCharAt <= 'Z' && 'A' <= cCharAt) || cCharAt == ':';
                        }
                    }
                }
                if (z11 == (!z10)) {
                    return i10;
                }
                i10++;
            }
            return i11;
        }

        private static long a(int i10, String str) {
            int iA = a(0, i10, str, false);
            Matcher matcher = hl.f21455m.matcher(str);
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int iE = -1;
            int i14 = -1;
            int i15 = -1;
            while (iA < i10) {
                int iA2 = a(iA + 1, i10, str, true);
                matcher.region(iA, iA2);
                if (i12 == -1 && matcher.usePattern(hl.f21455m).matches()) {
                    String strGroup = matcher.group(1);
                    fd.j0.h(strGroup, "matcher.group(1)");
                    i12 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    fd.j0.h(strGroup2, "matcher.group(2)");
                    i14 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    fd.j0.h(strGroup3, "matcher.group(3)");
                    i15 = Integer.parseInt(strGroup3);
                } else if (i13 == -1 && matcher.usePattern(hl.f21454l).matches()) {
                    String strGroup4 = matcher.group(1);
                    fd.j0.h(strGroup4, "matcher.group(1)");
                    i13 = Integer.parseInt(strGroup4);
                } else if (iE == -1 && matcher.usePattern(hl.f21453k).matches()) {
                    String strGroup5 = matcher.group(1);
                    fd.j0.h(strGroup5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    fd.j0.h(locale, "US");
                    String lowerCase = strGroup5.toLowerCase(locale);
                    fd.j0.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String strPattern = hl.f21453k.pattern();
                    fd.j0.h(strPattern, "MONTH_PATTERN.pattern()");
                    iE = ed.u.E(strPattern, lowerCase, 0, false, 6) / 4;
                } else if (i11 == -1 && matcher.usePattern(hl.f21452j).matches()) {
                    String strGroup6 = matcher.group(1);
                    fd.j0.h(strGroup6, "matcher.group(1)");
                    i11 = Integer.parseInt(strGroup6);
                }
                iA = a(iA2 + 1, i10, str, false);
            }
            if (70 <= i11 && i11 < 100) {
                i11 += 1900;
            }
            if (i11 >= 0 && i11 < 70) {
                i11 += 2000;
            }
            if (!(i11 >= 1601)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(iE != -1)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(1 <= i13 && i13 < 32)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i12 >= 0 && i12 < 24)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i14 >= 0 && i14 < 60)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i15 >= 0 && i15 < 60)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(ea1.f20134d);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i11);
            gregorianCalendar.set(2, iE - 1);
            gregorianCalendar.set(5, i13);
            gregorianCalendar.set(11, i12);
            gregorianCalendar.set(12, i14);
            gregorianCalendar.set(13, i15);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        /* JADX WARN: Code duplicated, block: B:40:0x00e2  */
        /* JADX WARN: Code duplicated, block: B:6:0x003d  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r16v1 */
        /* JADX WARN: Type inference failed for: r16v2 */
        /* JADX WARN: Type inference failed for: r16v4 */
        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r6v1, types: [int] */
        /* JADX WARN: Type inference failed for: r6v14 */
        /* JADX WARN: Type inference failed for: r9v10 */
        /* JADX WARN: Type inference failed for: r9v11 */
        /* JADX WARN: Type inference failed for: r9v15 */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v8 */
        /* JADX WARN: Type inference failed for: r9v9 */
        public static List a(d10 d10Var, ry ryVar) {
            long j10;
            boolean z10;
            boolean z11;
            boolean z12;
            String str;
            boolean z13;
            hl hlVar;
            ?? r10;
            ?? r11;
            fd.j0.i(d10Var, ImagesContract.URL);
            fd.j0.i(ryVar, "headers");
            List listD = ryVar.d();
            int size = listD.size();
            ?? r12 = 0;
            int i10 = 0;
            ArrayList arrayList = null;
            while (i10 < size) {
                String str2 = (String) listD.get(i10);
                fd.j0.i(str2, "setCookie");
                long jCurrentTimeMillis = System.currentTimeMillis();
                char c10 = ';';
                int iB = ea1.b(str2, ';', r12, 6);
                char c11 = '=';
                int iB2 = ea1.b(str2, '=', iB, 2);
                if (iB2 == iB) {
                    r10 = r12;
                    hlVar = null;
                    r11 = r10;
                } else {
                    String strC = ea1.c(0, iB2, str2);
                    if ((strC.length() == 0 ? 1 : r12) == 0) {
                        if (ea1.b(strC) == -1) {
                            String strC2 = ea1.c(iB2 + 1, iB, str2);
                            if (ea1.b(strC2) == -1) {
                                int i11 = iB + 1;
                                int length = str2.length();
                                long j11 = -1;
                                long jA = 253402300799999L;
                                String str3 = null;
                                boolean z14 = false;
                                boolean z15 = false;
                                boolean z16 = false;
                                boolean z17 = true;
                                String str4 = null;
                                while (true) {
                                    long j12 = RecyclerView.FOREVER_NS;
                                    if (i11 < length) {
                                        int iA = ea1.a(str2, c10, i11, length);
                                        int iA2 = ea1.a(str2, c11, i11, iA);
                                        String strC3 = ea1.c(i11, iA2, str2);
                                        String strC4 = iA2 < iA ? ea1.c(iA2 + 1, iA, str2) : "";
                                        if (ed.q.i(strC3, "expires", true)) {
                                            try {
                                                jA = a(strC4.length(), strC4);
                                                z16 = true;
                                            } catch (NumberFormatException | IllegalArgumentException unused) {
                                            }
                                        } else if (ed.q.i(strC3, "max-age", true)) {
                                            try {
                                                j11 = Long.parseLong(strC4);
                                                if (j11 <= 0) {
                                                    j11 = Long.MIN_VALUE;
                                                }
                                            } catch (NumberFormatException e10) {
                                                if (!new ed.f("-?\\d+").a(strC4)) {
                                                    throw e10;
                                                }
                                                if (ed.q.u(strC4, "-", false, 2)) {
                                                    j11 = Long.MIN_VALUE;
                                                } else {
                                                    j11 = Long.MAX_VALUE;
                                                }
                                            }
                                            z16 = true;
                                        } else if (ed.q.i(strC3, "domain", true)) {
                                            if (!(!ed.q.h(strC4, ".", false, 2))) {
                                                throw new IllegalArgumentException("Failed requirement.".toString());
                                            }
                                            String strA = hz.a(ed.u.M(strC4, "."));
                                            if (strA == null) {
                                                throw new IllegalArgumentException();
                                            }
                                            str3 = strA;
                                            z17 = false;
                                        } else if (ed.q.i(strC3, "path", true)) {
                                            str4 = strC4;
                                        } else if (ed.q.i(strC3, "secure", true)) {
                                            z14 = true;
                                        } else if (ed.q.i(strC3, "httponly", true)) {
                                            z15 = true;
                                        }
                                        i11 = iA + 1;
                                        c10 = ';';
                                        c11 = '=';
                                    } else {
                                        if (j11 == Long.MIN_VALUE) {
                                            j10 = Long.MIN_VALUE;
                                        } else if (j11 != -1) {
                                            if (j11 <= 9223372036854775L) {
                                                j12 = j11 * ((long) 1000);
                                            }
                                            long j13 = jCurrentTimeMillis + j12;
                                            j10 = (j13 < jCurrentTimeMillis || j13 > DatesKt.MAX_DATE) ? 253402300799999L : j13;
                                        } else {
                                            j10 = jA;
                                        }
                                        String strG = d10Var.g();
                                        if (str3 == null) {
                                            str3 = strG;
                                        } else {
                                            if (fd.j0.d(strG, str3)) {
                                                z11 = true;
                                            } else {
                                                if (ed.q.h(strG, str3, false, 2)) {
                                                    z11 = true;
                                                    if (strG.charAt((strG.length() - str3.length()) - 1) != '.' || ea1.a(strG)) {
                                                    }
                                                    if (z10) {
                                                    }
                                                }
                                                z10 = false;
                                                if (z10) {
                                                }
                                            }
                                            z10 = z11;
                                            if (z10) {
                                            }
                                        }
                                        if (strG.length() != str3.length()) {
                                            int i12 = PublicSuffixDatabase.f18404h;
                                            if (PublicSuffixDatabase.a.a().a(str3) == null) {
                                            }
                                        }
                                        String strSubstring = DialogConfigs.DIRECTORY_SEPERATOR;
                                        String str5 = str4;
                                        if (str5 != null) {
                                            z12 = false;
                                            z13 = false;
                                            if (ed.q.u(str5, DialogConfigs.DIRECTORY_SEPERATOR, false, 2)) {
                                                str = str5;
                                            }
                                            hlVar = new hl(strC, strC2, j10, str3, str, z14, z15, z16, z17, 0);
                                            r11 = z13;
                                        } else {
                                            z12 = false;
                                        }
                                        String strC5 = d10Var.c();
                                        int iG = ed.u.G(strC5, '/', z12 ? 1 : 0, z12, 6);
                                        if (iG != 0) {
                                            strSubstring = strC5.substring(z12 ? 1 : 0, iG);
                                            fd.j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                                        }
                                        str = strSubstring;
                                        z13 = z12;
                                        hlVar = new hl(strC, strC2, j10, str3, str, z14, z15, z16, z17, 0);
                                        r11 = z13;
                                    }
                                }
                            }
                        }
                        r10 = 0;
                    } else {
                        r10 = r12;
                    }
                    hlVar = null;
                    r11 = r10;
                }
                if (hlVar != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(hlVar);
                }
                i10++;
                r12 = r11;
            }
            if (arrayList == null) {
                return kc.w.f32009c;
            }
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            fd.j0.h(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return listUnmodifiableList;
        }
    }

    private hl(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f21457a = str;
        this.f21458b = str2;
        this.f21459c = j10;
        this.f21460d = str3;
        this.f21461e = str4;
        this.f21462f = z10;
        this.f21463g = z11;
        this.f21464h = z12;
        this.f21465i = z13;
    }

    public /* synthetic */ hl(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, int i10) {
        this(str, str2, j10, str3, str4, z10, z11, z12, z13);
    }

    public final String e() {
        return this.f21457a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hl) {
            hl hlVar = (hl) obj;
            if (fd.j0.d(hlVar.f21457a, this.f21457a) && fd.j0.d(hlVar.f21458b, this.f21458b) && hlVar.f21459c == this.f21459c && fd.j0.d(hlVar.f21460d, this.f21460d) && fd.j0.d(hlVar.f21461e, this.f21461e) && hlVar.f21462f == this.f21462f && hlVar.f21463g == this.f21463g && hlVar.f21464h == this.f21464h && hlVar.f21465i == this.f21465i) {
                return true;
            }
        }
        return false;
    }

    public final String f() {
        return this.f21458b;
    }

    @IgnoreJRERequirement
    public final int hashCode() {
        return Boolean.hashCode(this.f21465i) + ((Boolean.hashCode(this.f21464h) + ((Boolean.hashCode(this.f21463g) + ((Boolean.hashCode(this.f21462f) + z11.a(this.f21461e, z11.a(this.f21460d, r6.b.a(this.f21459c, z11.a(this.f21458b, z11.a(this.f21457a, 527, 31), 31), 31), 31), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String strA;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f21457a);
        sb2.append('=');
        sb2.append(this.f21458b);
        if (this.f21464h) {
            if (this.f21459c == Long.MIN_VALUE) {
                strA = "; max-age=0";
            } else {
                sb2.append("; expires=");
                strA = sm.a(new Date(this.f21459c));
            }
            sb2.append(strA);
        }
        if (!this.f21465i) {
            sb2.append("; domain=");
            sb2.append(this.f21460d);
        }
        sb2.append("; path=");
        sb2.append(this.f21461e);
        if (this.f21462f) {
            sb2.append("; secure");
        }
        if (this.f21463g) {
            sb2.append("; httponly");
        }
        String string = sb2.toString();
        fd.j0.h(string, "toString()");
        return string;
    }
}
