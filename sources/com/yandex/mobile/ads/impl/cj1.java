package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
final class cj1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f19527c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f19528d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mp0 f19529a = new mp0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StringBuilder f19530b = new StringBuilder();

    private static String a(mp0 mp0Var, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int iD = mp0Var.d();
        int iE = mp0Var.e();
        while (iD < iE && !z10) {
            char c10 = (char) mp0Var.c()[iD];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                iD++;
                sb2.append(c10);
            }
        }
        mp0Var.f(iD - mp0Var.d());
        return sb2.toString();
    }

    public static String b(mp0 mp0Var, StringBuilder sb2) {
        b(mp0Var);
        if (mp0Var.a() == 0) {
            return null;
        }
        String strA = a(mp0Var, sb2);
        if (!"".equals(strA)) {
            return strA;
        }
        StringBuilder sbA = v60.a("");
        sbA.append((char) mp0Var.t());
        return sbA.toString();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    public static void b(mp0 mp0Var) {
        boolean z10;
        boolean z11;
        while (true) {
            for (boolean z12 = true; mp0Var.a() > 0 && z12; z12 = false) {
                char c10 = (char) mp0Var.c()[mp0Var.d()];
                if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
                    mp0Var.f(1);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    int iD = mp0Var.d();
                    int iE = mp0Var.e();
                    byte[] bArrC = mp0Var.c();
                    if (iD + 2 <= iE) {
                        int i10 = iD + 1;
                        if (bArrC[iD] == 47) {
                            int i11 = i10 + 1;
                            if (bArrC[i10] == 42) {
                                while (true) {
                                    int i12 = i11 + 1;
                                    if (i12 >= iE) {
                                        break;
                                    }
                                    if (((char) bArrC[i11]) == '*' && ((char) bArrC[i12]) == '/') {
                                        iE = i12 + 1;
                                        i11 = iE;
                                    } else {
                                        i11 = i12;
                                    }
                                }
                                mp0Var.f(iE - mp0Var.d());
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                        } else {
                            z11 = false;
                        }
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                    }
                }
            }
            return;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:101:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:103:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:105:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:106:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:108:0x0203  */
    /* JADX WARN: Code duplicated, block: B:109:0x0208  */
    /* JADX WARN: Code duplicated, block: B:111:0x0210  */
    /* JADX WARN: Code duplicated, block: B:117:0x0223  */
    /* JADX WARN: Code duplicated, block: B:119:0x0229  */
    /* JADX WARN: Code duplicated, block: B:121:0x0231  */
    /* JADX WARN: Code duplicated, block: B:123:0x0239  */
    /* JADX WARN: Code duplicated, block: B:124:0x023e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0246  */
    /* JADX WARN: Code duplicated, block: B:127:0x024b  */
    /* JADX WARN: Code duplicated, block: B:129:0x0253  */
    /* JADX WARN: Code duplicated, block: B:131:0x025b  */
    /* JADX WARN: Code duplicated, block: B:132:0x0260  */
    /* JADX WARN: Code duplicated, block: B:134:0x0268  */
    /* JADX WARN: Code duplicated, block: B:136:0x0270  */
    /* JADX WARN: Code duplicated, block: B:137:0x0275  */
    /* JADX WARN: Code duplicated, block: B:139:0x027d  */
    /* JADX WARN: Code duplicated, block: B:141:0x028d  */
    /* JADX WARN: Code duplicated, block: B:142:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:144:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:145:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:148:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:149:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:152:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:153:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:156:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:160:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:161:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:162:0x02e7 A[FALL_THROUGH, PHI: r4
  0x02e7: PHI (r4v11 int) = (r4v10 int), (r4v12 int) binds: [B:157:0x02d9, B:161:0x02e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:174:0x02dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x02f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x02f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x02f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x02f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x02f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:97:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d4  */
    /* JADX WARN: Instruction removed from duplicated block: B:141:0x028d, please report this as an issue */
    public final ArrayList a(mp0 mp0Var) {
        String strSubstring;
        String string;
        int i10;
        Matcher matcher;
        String strGroup;
        boolean z10;
        int i11 = 0;
        this.f19530b.setLength(0);
        int iD = mp0Var.d();
        while (!TextUtils.isEmpty(mp0Var.j())) {
        }
        this.f19529a.a(mp0Var.d(), mp0Var.c());
        this.f19529a.e(iD);
        ArrayList arrayList = new ArrayList();
        while (true) {
            mp0 mp0Var2 = this.f19529a;
            StringBuilder sb2 = this.f19530b;
            b(mp0Var2);
            if (mp0Var2.a() >= 5 && "::cue".equals(mp0Var2.a(5, qh.f24496c))) {
                int iD2 = mp0Var2.d();
                String strB = b(mp0Var2, sb2);
                if (strB == null) {
                    strSubstring = null;
                } else if ("{".equals(strB)) {
                    mp0Var2.e(iD2);
                    strSubstring = "";
                } else {
                    if ("(".equals(strB)) {
                        int iD3 = mp0Var2.d();
                        int iE = mp0Var2.e();
                        int i12 = i11;
                        while (iD3 < iE && i12 == 0) {
                            int i13 = iD3 + 1;
                            i12 = ((char) mp0Var2.c()[iD3]) == ')' ? 1 : i11;
                            iD3 = i13;
                        }
                        strSubstring = mp0Var2.a((iD3 - 1) - mp0Var2.d(), qh.f24496c).trim();
                    } else {
                        strSubstring = null;
                    }
                    if (!")".equals(b(mp0Var2, sb2))) {
                        strSubstring = null;
                    }
                }
            } else {
                strSubstring = null;
            }
            if (strSubstring == null || !"{".equals(b(this.f19529a, this.f19530b))) {
                return arrayList;
            }
            dj1 dj1Var = new dj1();
            if (!"".equals(strSubstring)) {
                int iIndexOf = strSubstring.indexOf(91);
                if (iIndexOf != -1) {
                    Matcher matcher2 = f19527c.matcher(strSubstring.substring(iIndexOf));
                    if (matcher2.matches()) {
                        String strGroup2 = matcher2.group(1);
                        Objects.requireNonNull(strGroup2);
                        dj1Var.d(strGroup2);
                    }
                    strSubstring = strSubstring.substring(i11, iIndexOf);
                }
                int i14 = da1.f19803a;
                String[] strArrSplit = strSubstring.split("\\.", -1);
                String str = strArrSplit[i11];
                int iIndexOf2 = str.indexOf(35);
                if (iIndexOf2 != -1) {
                    dj1Var.c(str.substring(i11, iIndexOf2));
                    dj1Var.b(str.substring(iIndexOf2 + 1));
                } else {
                    dj1Var.c(str);
                }
                if (strArrSplit.length > 1) {
                    dj1Var.a((String[]) da1.a(strArrSplit, strArrSplit.length));
                }
            }
            int i15 = i11;
            String strB2 = null;
            while (i15 == 0) {
                int iD4 = this.f19529a.d();
                strB2 = b(this.f19529a, this.f19530b);
                int i16 = (strB2 == null || "}".equals(strB2)) ? 1 : i11;
                if (i16 == 0) {
                    this.f19529a.e(iD4);
                    mp0 mp0Var3 = this.f19529a;
                    StringBuilder sb3 = this.f19530b;
                    b(mp0Var3);
                    String strA = a(mp0Var3, sb3);
                    if (!"".equals(strA) && ":".equals(b(mp0Var3, sb3))) {
                        b(mp0Var3);
                        StringBuilder sb4 = new StringBuilder();
                        int i17 = i11;
                        while (true) {
                            if (i17 == 0) {
                                int iD5 = mp0Var3.d();
                                String strB3 = b(mp0Var3, sb3);
                                if (strB3 == null) {
                                    string = null;
                                } else if ("}".equals(strB3) || ";".equals(strB3)) {
                                    mp0Var3.e(iD5);
                                    i17 = 1;
                                } else {
                                    sb4.append(strB3);
                                }
                            } else {
                                string = sb4.toString();
                            }
                        }
                        if (string != null && !"".equals(string)) {
                            int iD6 = mp0Var3.d();
                            String strB4 = b(mp0Var3, sb3);
                            if (";".equals(strB4)) {
                                if ("color".equals(strA)) {
                                    dj1Var.b(oj.a(string));
                                } else if ("background-color".equals(strA)) {
                                    dj1Var.a(oj.a(string));
                                } else {
                                    i10 = 2;
                                    if ("ruby-position".equals(strA)) {
                                        if ("over".equals(string)) {
                                            dj1Var.d(1);
                                        } else if ("under".equals(string)) {
                                            dj1Var.d(2);
                                        }
                                    } else if ("text-combine-upright".equals(strA)) {
                                        if ("all".equals(string)) {
                                            z10 = true;
                                        } else {
                                            z10 = true;
                                        }
                                        dj1Var.a(z10);
                                    } else if ("text-decoration".equals(strA)) {
                                        if ("underline".equals(string)) {
                                            dj1Var.o();
                                        }
                                    } else if ("font-family".equals(strA)) {
                                        dj1Var.a(string);
                                    } else if ("font-weight".equals(strA)) {
                                        if ("bold".equals(string)) {
                                            dj1Var.m();
                                        }
                                    } else if ("font-style".equals(strA)) {
                                        if ("italic".equals(string)) {
                                            dj1Var.n();
                                        }
                                    } else if ("font-size".equals(strA)) {
                                        matcher = f19528d.matcher(na.b(string));
                                        if (matcher.matches()) {
                                            strGroup = matcher.group(2);
                                            Objects.requireNonNull(strGroup);
                                            switch (strGroup) {
                                                case "%":
                                                    i10 = 3;
                                                case "em":
                                                    dj1Var.c(i10);
                                                    String strGroup3 = matcher.group(1);
                                                    Objects.requireNonNull(strGroup3);
                                                    dj1Var.a(Float.parseFloat(strGroup3));
                                                    break;
                                                case "px":
                                                    dj1Var.c(1);
                                                    String strGroup4 = matcher.group(1);
                                                    Objects.requireNonNull(strGroup4);
                                                    dj1Var.a(Float.parseFloat(strGroup4));
                                                    break;
                                                default:
                                                    throw new IllegalStateException();
                                            }
                                        } else {
                                            p90.d("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            } else if ("}".equals(strB4)) {
                                mp0Var3.e(iD6);
                                if ("color".equals(strA)) {
                                    dj1Var.b(oj.a(string));
                                } else if ("background-color".equals(strA)) {
                                    dj1Var.a(oj.a(string));
                                } else {
                                    i10 = 2;
                                    if ("ruby-position".equals(strA)) {
                                        if ("over".equals(string)) {
                                            dj1Var.d(1);
                                        } else if ("under".equals(string)) {
                                            dj1Var.d(2);
                                        }
                                    } else if ("text-combine-upright".equals(strA)) {
                                        if ("all".equals(string) || string.startsWith("digits")) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        dj1Var.a(z10);
                                    } else if ("text-decoration".equals(strA)) {
                                        if ("underline".equals(string)) {
                                            dj1Var.o();
                                        }
                                    } else if ("font-family".equals(strA)) {
                                        dj1Var.a(string);
                                    } else if ("font-weight".equals(strA)) {
                                        if ("bold".equals(string)) {
                                            dj1Var.m();
                                        }
                                    } else if ("font-style".equals(strA)) {
                                        if ("italic".equals(string)) {
                                            dj1Var.n();
                                        }
                                    } else if ("font-size".equals(strA)) {
                                        matcher = f19528d.matcher(na.b(string));
                                        if (matcher.matches()) {
                                            p90.d("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                        } else {
                                            strGroup = matcher.group(2);
                                            Objects.requireNonNull(strGroup);
                                            switch (strGroup) {
                                                case 37:
                                                    if (strGroup.equals("%")) {
                                                    }
                                                    break;
                                                case 3240:
                                                    if (strGroup.equals("em")) {
                                                    }
                                                    break;
                                                case 3592:
                                                    if (strGroup.equals("px")) {
                                                    }
                                                    break;
                                                default:
                                                    break;
                                            }
                                            /*  JADX ERROR: Method code generation error
                                                java.lang.NullPointerException: Switch insn not found in header
                                                	at java.base/java.util.Objects.requireNonNull(Unknown Source)
                                                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                                                	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:226)
                                                	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:175)
                                                	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                                                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                                                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                                                */
                                            /*
                                                Method dump skipped, instruction units count: 802
                                                To view this dump add '--comments-level debug' option
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.cj1.a(com.yandex.mobile.ads.impl.mp0):java.util.ArrayList");
                                        }
                                    }
