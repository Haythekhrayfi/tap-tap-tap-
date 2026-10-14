package com.yandex.mobile.ads.impl;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class d41 extends t11 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Pattern f19754r = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f19755m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final e41 f19756n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private LinkedHashMap f19757o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f19758p = -3.4028235E38f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f19759q = -3.4028235E38f;

    public d41(List<byte[]> list) {
        if (list == null || list.isEmpty()) {
            this.f19755m = false;
            this.f19756n = null;
            return;
        }
        this.f19755m = true;
        String strA = da1.a(list.get(0));
        pa.a(strA.startsWith("Format:"));
        this.f19756n = (e41) pa.a(e41.a(strA));
        a(new mp0(list.get(1)));
    }

    private static int a(long j10, ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j10) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j10) {
                i10 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i10, Long.valueOf(j10));
        arrayList2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i10 - 1)));
        return i10;
    }

    private static long a(String str) {
        Matcher matcher = f19754r.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i10 = da1.f19803a;
        return (Long.parseLong(matcher.group(4)) * AbstractComponentTracker.LINGERING_TIMEOUT) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(strGroup) * 60 * 60 * 1000000);
    }

    private void a(mp0 mp0Var) {
        while (true) {
            String strJ = mp0Var.j();
            if (strJ == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strJ)) {
                while (true) {
                    String strJ2 = mp0Var.j();
                    if (strJ2 == null || (mp0Var.a() != 0 && mp0Var.g() == 91)) {
                        break;
                    }
                    String[] strArrSplit = strJ2.split(":");
                    if (strArrSplit.length == 2) {
                        String strB = na.b(strArrSplit[0].trim());
                        Objects.requireNonNull(strB);
                        if (strB.equals("playresx")) {
                            this.f19758p = Float.parseFloat(strArrSplit[1].trim());
                        } else if (strB.equals("playresy")) {
                            try {
                                this.f19759q = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strJ)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                f41.a aVarA = null;
                while (true) {
                    String strJ3 = mp0Var.j();
                    if (strJ3 == null || (mp0Var.a() != 0 && mp0Var.g() == 91)) {
                        break;
                    }
                    if (strJ3.startsWith("Format:")) {
                        aVarA = f41.a.a(strJ3);
                    } else if (strJ3.startsWith("Style:")) {
                        if (aVarA == null) {
                            li1.a("Skipping 'Style:' line before 'Format:' line: ", strJ3, "SsaDecoder");
                        } else {
                            f41 f41VarA = f41.a(strJ3, aVarA);
                            if (f41VarA != null) {
                                linkedHashMap.put(f41VarA.f20524a, f41VarA);
                            }
                        }
                    }
                }
                this.f19757o = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strJ)) {
                p90.c("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strJ)) {
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x016c  */
    /* JADX WARN: Code duplicated, block: B:69:0x017c  */
    @Override // com.yandex.mobile.ads.impl.t11
    public final h51 a(byte[] bArr, int i10, boolean z10) {
        mp0 mp0Var;
        Layout.Alignment alignment;
        int i11;
        float f10;
        int i12;
        int i13;
        StyleSpan styleSpan;
        int length;
        int i14;
        String str;
        d41 d41Var = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        mp0 mp0Var2 = new mp0(i10, bArr);
        if (!d41Var.f19755m) {
            d41Var.a(mp0Var2);
        }
        e41 e41VarA = d41Var.f19755m ? d41Var.f19756n : null;
        while (true) {
            String strJ = mp0Var2.j();
            if (strJ == null) {
                return new g41(arrayList, arrayList2);
            }
            if (strJ.startsWith("Format:")) {
                e41VarA = e41.a(strJ);
            } else {
                if (strJ.startsWith("Dialogue:")) {
                    if (e41VarA == null) {
                        str = "Skipping dialogue line before complete format: ";
                    } else {
                        pa.a(strJ.startsWith("Dialogue:"));
                        String[] strArrSplit = strJ.substring(9).split(",", e41VarA.f20067e);
                        if (strArrSplit.length != e41VarA.f20067e) {
                            str = "Skipping dialogue line with fewer columns than format: ";
                        } else {
                            if (a(strArrSplit[e41VarA.f20063a]) == -9223372036854775807L) {
                                li1.a("Skipping invalid timing: ", strJ, "SsaDecoder");
                            } else {
                                long jA = a(strArrSplit[e41VarA.f20064b]);
                                if (jA == -9223372036854775807L) {
                                    li1.a("Skipping invalid timing: ", strJ, "SsaDecoder");
                                } else {
                                    LinkedHashMap linkedHashMap = d41Var.f19757o;
                                    f41 f41Var = (linkedHashMap == null || (i14 = e41VarA.f20065c) == -1) ? null : (f41) linkedHashMap.get(strArrSplit[i14].trim());
                                    String str2 = strArrSplit[e41VarA.f20066d];
                                    f41.b bVarA = f41.b.a(str2);
                                    String strReplace = f41.b.c(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f11 = d41Var.f19758p;
                                    float f12 = d41Var.f19759q;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    am.a aVarA = new am.a().a(spannableString);
                                    if (f41Var != null) {
                                        mp0Var = mp0Var2;
                                        if (f41Var.f20526c != null) {
                                            spannableString.setSpan(new ForegroundColorSpan(f41Var.f20526c.intValue()), 0, spannableString.length(), 33);
                                        }
                                        if (f41Var.f20533j == 3 && f41Var.f20527d != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(f41Var.f20527d.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f13 = f41Var.f20528e;
                                        if (f13 != -3.4028235E38f && f12 != -3.4028235E38f) {
                                            aVarA.b(1, f13 / f12);
                                        }
                                        boolean z11 = f41Var.f20529f;
                                        if (z11 && f41Var.f20530g) {
                                            styleSpan = new StyleSpan(3);
                                            length = spannableString.length();
                                            i12 = 33;
                                            i13 = 0;
                                        } else {
                                            i12 = 33;
                                            i13 = 0;
                                            if (z11) {
                                                styleSpan = new StyleSpan(1);
                                            } else if (f41Var.f20530g) {
                                                styleSpan = new StyleSpan(2);
                                            } else {
                                                if (f41Var.f20531h) {
                                                    spannableString.setSpan(new UnderlineSpan(), i13, spannableString.length(), i12);
                                                }
                                                if (f41Var.f20532i) {
                                                    spannableString.setSpan(new StrikethroughSpan(), i13, spannableString.length(), i12);
                                                }
                                            }
                                            length = spannableString.length();
                                        }
                                        spannableString.setSpan(styleSpan, i13, length, i12);
                                        if (f41Var.f20531h) {
                                            spannableString.setSpan(new UnderlineSpan(), i13, spannableString.length(), i12);
                                        }
                                        if (f41Var.f20532i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i13, spannableString.length(), i12);
                                        }
                                    } else {
                                        mp0Var = mp0Var2;
                                        e41VarA = e41VarA;
                                        jA = jA;
                                    }
                                    int i15 = bVarA.f20549a;
                                    int i16 = i15 != -1 ? i15 : f41Var != null ? f41Var.f20525b : -1;
                                    switch (i16) {
                                        case 0:
                                        default:
                                            o80.a("Unknown alignment: ", i16, "SsaDecoder");
                                        case -1:
                                            alignment = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            break;
                                    }
                                    am.a aVarB = aVarA.b(alignment);
                                    int i17 = Integer.MIN_VALUE;
                                    switch (i16) {
                                        case 0:
                                        default:
                                            o80.a("Unknown alignment: ", i16, "SsaDecoder");
                                        case -1:
                                            i11 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i11 = 0;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i11 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i11 = 2;
                                            break;
                                    }
                                    am.a aVarB2 = aVarB.b(i11);
                                    switch (i16) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            o80.a("Unknown alignment: ", i16, "SsaDecoder");
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i17 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i17 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i17 = 0;
                                            break;
                                    }
                                    aVarB2.a(i17);
                                    PointF pointF = bVarA.f20550b;
                                    if (pointF == null || f12 == -3.4028235E38f || f11 == -3.4028235E38f) {
                                        int iD = aVarA.d();
                                        float f14 = 0.95f;
                                        if (iD == 0) {
                                            f10 = 0.05f;
                                        } else if (iD != 1) {
                                            f10 = iD != 2 ? -3.4028235E38f : 0.95f;
                                        } else {
                                            f10 = 0.5f;
                                        }
                                        aVarA.b(f10);
                                        int iC = aVarA.c();
                                        if (iC == 0) {
                                            f14 = 0.05f;
                                        } else if (iC == 1) {
                                            f14 = 0.5f;
                                        } else if (iC != 2) {
                                            f14 = -3.4028235E38f;
                                        }
                                        aVarA.a(0, f14);
                                    } else {
                                        aVarA.b(pointF.x / f11);
                                        aVarA.a(0, bVarA.f20550b.y / f12);
                                    }
                                    am amVarA = aVarA.a();
                                    int iA = a(jA, arrayList2, arrayList);
                                    for (int iA2 = a(r9, arrayList2, arrayList); iA2 < iA; iA2++) {
                                        ((List) arrayList.get(iA2)).add(amVarA);
                                    }
                                }
                            }
                            mp0Var = mp0Var2;
                            e41VarA = e41VarA;
                        }
                    }
                    li1.a(str, strJ, "SsaDecoder");
                    mp0Var = mp0Var2;
                    e41VarA = e41VarA;
                } else {
                    mp0Var = mp0Var2;
                    e41VarA = e41VarA;
                }
                d41Var = this;
                mp0Var2 = mp0Var;
                e41VarA = e41VarA;
            }
        }
    }
}
