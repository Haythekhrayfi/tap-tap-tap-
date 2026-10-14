package com.yandex.mobile.ads.impl;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class f51 extends t11 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Pattern f20553o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Pattern f20554p = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final StringBuilder f20555m = new StringBuilder();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayList<String> f20556n = new ArrayList<>();

    private static long a(Matcher matcher, int i10) {
        String strGroup = matcher.group(i10 + 1);
        long j10 = strGroup != null ? Long.parseLong(strGroup) * 60 * 60 * 1000 : 0L;
        String strGroup2 = matcher.group(i10 + 2);
        Objects.requireNonNull(strGroup2);
        long j11 = (Long.parseLong(strGroup2) * 60 * 1000) + j10;
        String strGroup3 = matcher.group(i10 + 3);
        Objects.requireNonNull(strGroup3);
        long j12 = (Long.parseLong(strGroup3) * 1000) + j11;
        String strGroup4 = matcher.group(i10 + 4);
        if (strGroup4 != null) {
            j12 += Long.parseLong(strGroup4);
        }
        return j12 * 1000;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:101:0x01af  */
    /* JADX WARN: Code duplicated, block: B:103:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:106:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:107:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:110:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:112:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:116:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:123:0x01db  */
    /* JADX WARN: Code duplicated, block: B:125:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:126:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:130:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:132:0x01f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:136:0x0201  */
    /* JADX WARN: Code duplicated, block: B:137:0x0203  */
    /* JADX WARN: Code duplicated, block: B:140:0x020e  */
    /* JADX WARN: Code duplicated, block: B:142:0x0211  */
    /* JADX WARN: Code duplicated, block: B:144:0x0214  */
    /* JADX WARN: Code duplicated, block: B:147:0x021e  */
    /* JADX WARN: Code duplicated, block: B:160:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:38:0x0112  */
    /* JADX WARN: Code duplicated, block: B:40:0x0118  */
    /* JADX WARN: Code duplicated, block: B:41:0x011a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0120  */
    /* JADX WARN: Code duplicated, block: B:44:0x0123  */
    /* JADX WARN: Code duplicated, block: B:46:0x0129  */
    /* JADX WARN: Code duplicated, block: B:47:0x012b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0131  */
    /* JADX WARN: Code duplicated, block: B:50:0x0133  */
    /* JADX WARN: Code duplicated, block: B:52:0x0139  */
    /* JADX WARN: Code duplicated, block: B:53:0x013b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0141  */
    /* JADX WARN: Code duplicated, block: B:56:0x0143  */
    /* JADX WARN: Code duplicated, block: B:58:0x0149  */
    /* JADX WARN: Code duplicated, block: B:59:0x014b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0151  */
    /* JADX WARN: Code duplicated, block: B:62:0x0153  */
    /* JADX WARN: Code duplicated, block: B:64:0x0159  */
    /* JADX WARN: Code duplicated, block: B:65:0x015b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0161  */
    /* JADX WARN: Code duplicated, block: B:79:0x0172  */
    /* JADX WARN: Code duplicated, block: B:83:0x017e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0184  */
    /* JADX WARN: Code duplicated, block: B:86:0x0186  */
    /* JADX WARN: Code duplicated, block: B:88:0x018c  */
    /* JADX WARN: Code duplicated, block: B:89:0x018e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0194  */
    /* JADX WARN: Code duplicated, block: B:92:0x0196  */
    /* JADX WARN: Code duplicated, block: B:94:0x019c  */
    /* JADX WARN: Code duplicated, block: B:95:0x019f  */
    /* JADX WARN: Code duplicated, block: B:97:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:98:0x01a7  */
    /* JADX WARN: Instruction removed from duplicated block: B:112:0x01cb, please report this as an issue */
    @Override // com.yandex.mobile.ads.impl.t11
    public final h51 a(byte[] bArr, int i10, boolean z10) {
        am.a aVarA;
        byte b10;
        int i11;
        byte b11;
        int i12;
        int iD;
        float f10;
        float f11;
        int iC;
        am amVarA;
        this = this;
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        q90 q90Var = new q90(0);
        mp0 mp0Var = new mp0(i10, bArr);
        while (true) {
            String strJ = mp0Var.j();
            if (strJ != null) {
                if (strJ.length() != 0) {
                    try {
                        Integer.parseInt(strJ);
                        String strJ2 = mp0Var.j();
                        if (strJ2 == null) {
                            p90.d("SubripDecoder", "Unexpected end");
                        } else {
                            Matcher matcher = f20553o.matcher(strJ2);
                            if (matcher.matches()) {
                                q90Var.a(a(matcher, 1));
                                q90Var.a(a(matcher, 6));
                                this.f20555m.setLength(i13);
                                this.f20556n.clear();
                                for (String strJ3 = mp0Var.j(); !TextUtils.isEmpty(strJ3); strJ3 = mp0Var.j()) {
                                    if (this.f20555m.length() > 0) {
                                        this.f20555m.append("<br>");
                                    }
                                    StringBuilder sb2 = this.f20555m;
                                    ArrayList<String> arrayList2 = this.f20556n;
                                    String strTrim = strJ3.trim();
                                    StringBuilder sb3 = new StringBuilder(strTrim);
                                    Matcher matcher2 = f20554p.matcher(strTrim);
                                    int i14 = i13;
                                    while (matcher2.find()) {
                                        String strGroup = matcher2.group();
                                        arrayList2.add(strGroup);
                                        int iStart = matcher2.start() - i14;
                                        int length = strGroup.length();
                                        sb3.replace(iStart, iStart + length, "");
                                        i14 += length;
                                    }
                                    sb2.append(sb3.toString());
                                }
                                Spanned spannedFromHtml = Html.fromHtml(this.f20555m.toString());
                                String str = null;
                                for (int i15 = i13; i15 < this.f20556n.size(); i15++) {
                                    String str2 = this.f20556n.get(i15);
                                    if (str2.matches("\\{\\\\an[1-9]\\}")) {
                                        str = str2;
                                        aVarA = new am.a().a(spannedFromHtml);
                                        if (str == null) {
                                            amVarA = aVarA.a();
                                        } else {
                                            switch (str) {
                                                case "{\an1}":
                                                    b10 = 0;
                                                    break;
                                                case "{\an2}":
                                                    b10 = 6;
                                                    break;
                                                case "{\an3}":
                                                    b10 = 3;
                                                    break;
                                                case "{\an4}":
                                                    b10 = 1;
                                                    break;
                                                case "{\an5}":
                                                    b10 = 7;
                                                    break;
                                                case "{\an6}":
                                                    b10 = 4;
                                                    break;
                                                case "{\an7}":
                                                    b10 = 2;
                                                    break;
                                                case "{\an8}":
                                                    b10 = 8;
                                                    break;
                                                case "{\an9}":
                                                    b10 = 5;
                                                    break;
                                                default:
                                                    b10 = -1;
                                                    break;
                                            }
                                            if (b10 != 0) {
                                                i11 = 1;
                                                if (b10 != 1 || b10 == 2) {
                                                    i11 = 0;
                                                } else if (b10 == 3 || b10 == 4 || b10 == 5) {
                                                    i11 = 2;
                                                }
                                            } else {
                                                i11 = 0;
                                            }
                                            aVarA.b(i11);
                                            switch (str) {
                                                case "{\an1}":
                                                    b11 = 0;
                                                    break;
                                                case "{\an2}":
                                                    b11 = 1;
                                                    break;
                                                case "{\an3}":
                                                    b11 = 2;
                                                    break;
                                                case "{\an4}":
                                                    b11 = 6;
                                                    break;
                                                case "{\an5}":
                                                    b11 = 7;
                                                    break;
                                                case "{\an6}":
                                                    b11 = 8;
                                                    break;
                                                case "{\an7}":
                                                    b11 = 3;
                                                    break;
                                                case "{\an8}":
                                                    b11 = 4;
                                                    break;
                                                case "{\an9}":
                                                    b11 = 5;
                                                    break;
                                                default:
                                                    b11 = -1;
                                                    break;
                                            }
                                            if (b11 != 0) {
                                                if (b11 != 1) {
                                                    i12 = 2;
                                                } else if (b11 != 2) {
                                                    aVarA.a((b11 != 3 || b11 == 4 || b11 == 5) ? 0 : 1);
                                                    i12 = 2;
                                                } else {
                                                    i12 = 2;
                                                }
                                                aVarA.a(i12);
                                            } else {
                                                i12 = 2;
                                                aVarA.a(i12);
                                            }
                                            iD = aVarA.d();
                                            f10 = 0.5f;
                                            if (iD != 0) {
                                                f11 = 0.08f;
                                            } else if (iD != 1) {
                                                f11 = 0.5f;
                                            } else {
                                                if (iD == i12) {
                                                    throw new IllegalArgumentException();
                                                }
                                                f11 = 0.92f;
                                            }
                                            am.a aVarB = aVarA.b(f11);
                                            iC = aVarA.c();
                                            if (iC != 0) {
                                                f10 = 0.08f;
                                            } else if (iC != 1) {
                                                if (iC == 2) {
                                                    throw new IllegalArgumentException();
                                                }
                                                f10 = 0.92f;
                                            }
                                            amVarA = aVarB.a(0, f10).a();
                                        }
                                        arrayList.add(amVarA);
                                        arrayList.add(am.f18955r);
                                        mp0Var = mp0Var;
                                        q90Var = q90Var;
                                    }
                                }
                                aVarA = new am.a().a(spannedFromHtml);
                                if (str == null) {
                                    amVarA = aVarA.a();
                                } else {
                                    switch (str) {
                                        case -685620710:
                                            if (!str.equals("{\\an1}")) {
                                                b10 = 0;
                                            }
                                            break;
                                        case -685620679:
                                            if (!str.equals("{\\an2}")) {
                                                b10 = 6;
                                            }
                                            break;
                                        case -685620648:
                                            if (!str.equals("{\\an3}")) {
                                                b10 = 3;
                                            }
                                            break;
                                        case -685620617:
                                            if (!str.equals("{\\an4}")) {
                                                b10 = 1;
                                            }
                                            break;
                                        case -685620586:
                                            if (!str.equals("{\\an5}")) {
                                                b10 = 7;
                                            }
                                            break;
                                        case -685620555:
                                            if (!str.equals("{\\an6}")) {
                                                b10 = 4;
                                            }
                                            break;
                                        case -685620524:
                                            if (!str.equals("{\\an7}")) {
                                                b10 = 2;
                                            }
                                            break;
                                        case -685620493:
                                            if (!str.equals("{\\an8}")) {
                                                b10 = 8;
                                            }
                                            break;
                                        case -685620462:
                                            if (!str.equals("{\\an9}")) {
                                                b10 = 5;
                                            }
                                            break;
                                        default:
                                            b10 = -1;
                                            break;
                                    }
                                    if (b10 != 0) {
                                        i11 = 1;
                                        if (b10 != 1) {
                                            i11 = 0;
                                        } else {
                                            i11 = 0;
                                        }
                                    } else {
                                        i11 = 0;
                                    }
                                    aVarA.b(i11);
                                    switch (str) {
                                        case -685620710:
                                            if (!str.equals("{\\an1}")) {
                                                b11 = 0;
                                            }
                                            break;
                                        case -685620679:
                                            if (!str.equals("{\\an2}")) {
                                                b11 = 1;
                                            }
                                            break;
                                        case -685620648:
                                            if (!str.equals("{\\an3}")) {
                                                b11 = 2;
                                            }
                                            break;
                                        case -685620617:
                                            if (!str.equals("{\\an4}")) {
                                                b11 = 6;
                                            }
                                            break;
                                        case -685620586:
                                            if (!str.equals("{\\an5}")) {
                                                b11 = 7;
                                            }
                                            break;
                                        case -685620555:
                                            if (!str.equals("{\\an6}")) {
                                                b11 = 8;
                                            }
                                            break;
                                        case -685620524:
                                            if (!str.equals("{\\an7}")) {
                                                b11 = 3;
                                            }
                                            break;
                                        case -685620493:
                                            if (!str.equals("{\\an8}")) {
                                                b11 = 4;
                                            }
                                            break;
                                        case -685620462:
                                            if (!str.equals("{\\an9}")) {
                                                b11 = 5;
                                            }
                                            break;
                                        default:
                                            b11 = -1;
                                            break;
                                    }
                                    if (b11 != 0) {
                                        if (b11 != 1) {
                                            i12 = 2;
                                        } else if (b11 != 2) {
                                            aVarA.a((b11 != 3 || b11 == 4 || b11 == 5) ? 0 : 1);
                                            i12 = 2;
                                        } else {
                                            i12 = 2;
                                        }
                                        aVarA.a(i12);
                                    } else {
                                        i12 = 2;
                                        aVarA.a(i12);
                                    }
                                    iD = aVarA.d();
                                    f10 = 0.5f;
                                    if (iD != 0) {
                                        f11 = 0.08f;
                                    } else if (iD != 1) {
                                        f11 = 0.5f;
                                    } else {
                                        if (iD == i12) {
                                            throw new IllegalArgumentException();
                                        }
                                        f11 = 0.92f;
                                    }
                                    am.a aVarB2 = aVarA.b(f11);
                                    iC = aVarA.c();
                                    if (iC != 0) {
                                        f10 = 0.08f;
                                    } else if (iC != 1) {
                                        if (iC == 2) {
                                            throw new IllegalArgumentException();
                                        }
                                        f10 = 0.92f;
                                    }
                                    amVarA = aVarB2.a(0, f10).a();
                                }
                                arrayList.add(amVarA);
                                arrayList.add(am.f18955r);
                                mp0Var = mp0Var;
                                q90Var = q90Var;
                            } else {
                                li1.a("Skipping invalid timing: ", strJ2, "SubripDecoder");
                            }
                            i13 = 0;
                        }
                    } catch (NumberFormatException unused) {
                        q90Var = q90Var;
                        mp0Var = mp0Var;
                        li1.a("Skipping invalid index: ", strJ, "SubripDecoder");
                    }
                }
            }
        }
        return new g51((am[]) arrayList.toArray(new am[i13]), q90Var.b());
    }
}
