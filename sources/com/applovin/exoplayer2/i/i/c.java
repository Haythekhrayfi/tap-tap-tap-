package com.applovin.exoplayer2.i.i;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f7076a = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f7077b = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y f7078c = new y();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final StringBuilder f7079d = new StringBuilder();

    private static char a(y yVar, int i10) {
        return (char) yVar.d()[i10];
    }

    public static String a(y yVar, StringBuilder sb2) {
        b(yVar);
        if (yVar.a() == 0) {
            return null;
        }
        String strD = d(yVar, sb2);
        if (!"".equals(strD)) {
            return strD;
        }
        StringBuilder sbA = defpackage.a.a("");
        sbA.append((char) yVar.h());
        return sbA.toString();
    }

    private void a(d dVar, String str) {
        if ("".equals(str)) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = f7076a.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                dVar.c((String) com.applovin.exoplayer2.l.a.b(matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrA = ai.a(str, "\\.");
        String str2 = strArrA[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            dVar.b(str2.substring(0, iIndexOf2));
            dVar.a(str2.substring(iIndexOf2 + 1));
        } else {
            dVar.b(str2);
        }
        if (strArrA.length > 1) {
            dVar.a((String[]) ai.a(strArrA, 1, strArrA.length));
        }
    }

    private static void a(y yVar, d dVar, StringBuilder sb2) {
        b(yVar);
        String strD = d(yVar, sb2);
        if (!"".equals(strD) && ":".equals(a(yVar, sb2))) {
            b(yVar);
            String strC = c(yVar, sb2);
            if (strC == null || "".equals(strC)) {
                return;
            }
            int iC = yVar.c();
            String strA = a(yVar, sb2);
            if (!";".equals(strA)) {
                if (!"}".equals(strA)) {
                    return;
                } else {
                    yVar.d(iC);
                }
            }
            if ("color".equals(strD)) {
                dVar.a(com.applovin.exoplayer2.l.f.b(strC));
                return;
            }
            if ("background-color".equals(strD)) {
                dVar.b(com.applovin.exoplayer2.l.f.b(strC));
                return;
            }
            boolean z10 = true;
            if ("ruby-position".equals(strD)) {
                if ("over".equals(strC)) {
                    dVar.d(1);
                    return;
                } else {
                    if ("under".equals(strC)) {
                        dVar.d(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(strD)) {
                if (!"all".equals(strC) && !strC.startsWith("digits")) {
                    z10 = false;
                }
                dVar.d(z10);
                return;
            }
            if ("text-decoration".equals(strD)) {
                if ("underline".equals(strC)) {
                    dVar.a(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(strD)) {
                dVar.d(strC);
                return;
            }
            if ("font-weight".equals(strD)) {
                if ("bold".equals(strC)) {
                    dVar.b(true);
                }
            } else if ("font-style".equals(strD)) {
                if ("italic".equals(strC)) {
                    dVar.c(true);
                }
            } else if ("font-size".equals(strD)) {
                a(strC, dVar);
            }
        }
    }

    private static void a(String str, d dVar) {
        Matcher matcher = f7077b.matcher(Ascii.toLowerCase(str));
        if (!matcher.matches()) {
            q.c("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        int i10 = 2;
        String str2 = (String) com.applovin.exoplayer2.l.a.b(matcher.group(2));
        Objects.requireNonNull(str2);
        switch (str2) {
            case "%":
                i10 = 3;
            case "em":
                dVar.c(i10);
                dVar.a(Float.parseFloat((String) com.applovin.exoplayer2.l.a.b(matcher.group(1))));
                return;
            case "px":
                dVar.c(1);
                dVar.a(Float.parseFloat((String) com.applovin.exoplayer2.l.a.b(matcher.group(1))));
                return;
            default:
                throw new IllegalStateException();
        }
    }

    private static String b(y yVar, StringBuilder sb2) {
        b(yVar);
        if (yVar.a() < 5 || !"::cue".equals(yVar.f(5))) {
            return null;
        }
        int iC = yVar.c();
        String strA = a(yVar, sb2);
        if (strA == null) {
            return null;
        }
        if ("{".equals(strA)) {
            yVar.d(iC);
            return "";
        }
        String strD = "(".equals(strA) ? d(yVar) : null;
        if (")".equals(a(yVar, sb2))) {
            return strD;
        }
        return null;
    }

    public static void b(y yVar) {
        while (true) {
            for (boolean z10 = true; yVar.a() > 0 && z10; z10 = false) {
                if (!e(yVar) && !f(yVar)) {
                }
            }
            return;
        }
    }

    private static String c(y yVar, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int iC = yVar.c();
            String strA = a(yVar, sb2);
            if (strA == null) {
                return null;
            }
            if ("}".equals(strA) || ";".equals(strA)) {
                yVar.d(iC);
                z10 = true;
            } else {
                sb3.append(strA);
            }
        }
        return sb3.toString();
    }

    public static void c(y yVar) {
        while (!TextUtils.isEmpty(yVar.C())) {
        }
    }

    private static String d(y yVar) {
        int iC = yVar.c();
        int iB = yVar.b();
        boolean z10 = false;
        while (iC < iB && !z10) {
            int i10 = iC + 1;
            z10 = ((char) yVar.d()[iC]) == ')';
            iC = i10;
        }
        return yVar.f((iC - 1) - yVar.c()).trim();
    }

    private static String d(y yVar, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int iC = yVar.c();
        int iB = yVar.b();
        while (iC < iB && !z10) {
            char c10 = (char) yVar.d()[iC];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                iC++;
                sb2.append(c10);
            }
        }
        yVar.e(iC - yVar.c());
        return sb2.toString();
    }

    private static boolean e(y yVar) {
        char cA = a(yVar, yVar.c());
        if (cA != '\t' && cA != '\n' && cA != '\f' && cA != '\r' && cA != ' ') {
            return false;
        }
        yVar.e(1);
        return true;
    }

    private static boolean f(y yVar) {
        int iC = yVar.c();
        int iB = yVar.b();
        byte[] bArrD = yVar.d();
        if (iC + 2 > iB) {
            return false;
        }
        int i10 = iC + 1;
        if (bArrD[iC] != 47) {
            return false;
        }
        int i11 = i10 + 1;
        if (bArrD[i10] != 42) {
            return false;
        }
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= iB) {
                yVar.e(iB - yVar.c());
                return true;
            }
            if (((char) bArrD[i11]) == '*' && ((char) bArrD[i12]) == '/') {
                i11 = i12 + 1;
                iB = i11;
            } else {
                i11 = i12;
            }
        }
    }

    public List<d> a(y yVar) {
        this.f7079d.setLength(0);
        int iC = yVar.c();
        c(yVar);
        this.f7078c.a(yVar.d(), yVar.c());
        this.f7078c.d(iC);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strB = b(this.f7078c, this.f7079d);
            if (strB == null || !"{".equals(a(this.f7078c, this.f7079d))) {
                return arrayList;
            }
            d dVar = new d();
            a(dVar, strB);
            String str = null;
            boolean z10 = false;
            while (!z10) {
                int iC2 = this.f7078c.c();
                String strA = a(this.f7078c, this.f7079d);
                boolean z11 = strA == null || "}".equals(strA);
                if (!z11) {
                    this.f7078c.d(iC2);
                    a(this.f7078c, dVar, this.f7079d);
                }
                str = strA;
                z10 = z11;
            }
            if ("}".equals(str)) {
                arrayList.add(dVar);
            }
        }
    }
}
