package com.applovin.exoplayer2.i.g;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import java.util.ArrayDeque;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class f {
    private static d a(d dVar, Map<String, g> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(dVar);
        while (!arrayDeque.isEmpty()) {
            d dVar2 = (d) arrayDeque.pop();
            g gVarA = a(dVar2.f7022f, dVar2.c(), map);
            if (gVarA != null && gVarA.k() == 3) {
                return dVar2;
            }
            for (int iA = dVar2.a() - 1; iA >= 0; iA--) {
                arrayDeque.push(dVar2.a(iA));
            }
        }
        return null;
    }

    public static g a(g gVar, String[] strArr, Map<String, g> map) {
        int i10 = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                g gVar2 = new g();
                int length = strArr.length;
                while (i10 < length) {
                    gVar2.a(map.get(strArr[i10]));
                    i10++;
                }
                return gVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return gVar.a(map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    gVar.a(map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return gVar;
    }

    public static String a(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    public static void a(Spannable spannable, int i10, int i11, g gVar, d dVar, Map<String, g> map, int i12) {
        d dVarA;
        Object cVar;
        g gVarA;
        Object absoluteSizeSpan;
        int i13;
        if (gVar.a() != -1) {
            spannable.setSpan(new StyleSpan(gVar.a()), i10, i11, 33);
        }
        if (gVar.b()) {
            spannable.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (gVar.c()) {
            spannable.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (gVar.f()) {
            com.applovin.exoplayer2.i.d.d.a(spannable, new ForegroundColorSpan(gVar.e()), i10, i11, 33);
        }
        if (gVar.h()) {
            com.applovin.exoplayer2.i.d.d.a(spannable, new BackgroundColorSpan(gVar.g()), i10, i11, 33);
        }
        if (gVar.d() != null) {
            com.applovin.exoplayer2.i.d.d.a(spannable, new TypefaceSpan(gVar.d()), i10, i11, 33);
        }
        if (gVar.p() != null) {
            b bVar = (b) com.applovin.exoplayer2.l.a.b(gVar.p());
            int i14 = bVar.f6997a;
            if (i14 == -1) {
                i14 = (i12 == 2 || i12 == 1) ? 3 : 1;
                i13 = 1;
            } else {
                i13 = bVar.f6998b;
            }
            int i15 = bVar.f6999c;
            if (i15 == -2) {
                i15 = 1;
            }
            com.applovin.exoplayer2.i.d.d.a(spannable, new com.applovin.exoplayer2.i.d.e(i14, i13, i15), i10, i11, 33);
        }
        int iK = gVar.k();
        if (iK == 2) {
            d dVarB = b(dVar, map);
            if (dVarB != null && (dVarA = a(dVarB, map)) != null) {
                if (dVarA.a() != 1 || dVarA.a(0).f7018b == null) {
                    q.b("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                } else {
                    String str = (String) ai.a(dVarA.a(0).f7018b);
                    g gVarA2 = a(dVarA.f7022f, dVarA.c(), map);
                    int iL = gVarA2 != null ? gVarA2.l() : -1;
                    if (iL == -1 && (gVarA = a(dVarB.f7022f, dVarB.c(), map)) != null) {
                        iL = gVarA.l();
                    }
                    cVar = new com.applovin.exoplayer2.i.d.c(str, iL);
                    spannable.setSpan(cVar, i10, i11, 33);
                }
            }
        } else if (iK == 3 || iK == 4) {
            cVar = new a();
            spannable.setSpan(cVar, i10, i11, 33);
        }
        if (gVar.o()) {
            com.applovin.exoplayer2.i.d.d.a(spannable, new com.applovin.exoplayer2.i.d.a(), i10, i11, 33);
        }
        int iQ = gVar.q();
        if (iQ == 1) {
            absoluteSizeSpan = new AbsoluteSizeSpan((int) gVar.r(), true);
        } else if (iQ == 2) {
            absoluteSizeSpan = new RelativeSizeSpan(gVar.r());
        } else if (iQ != 3) {
            return;
        } else {
            absoluteSizeSpan = new RelativeSizeSpan(gVar.r() / 100.0f);
        }
        com.applovin.exoplayer2.i.d.d.a(spannable, absoluteSizeSpan, i10, i11, 33);
    }

    public static void a(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    private static d b(d dVar, Map<String, g> map) {
        while (dVar != null) {
            g gVarA = a(dVar.f7022f, dVar.c(), map);
            if (gVarA != null && gVarA.k() == 1) {
                return dVar;
            }
            dVar = dVar.f7025i;
        }
        return null;
    }
}
