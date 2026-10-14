package com.applovin.exoplayer2.ui;

import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import com.applovin.exoplayer2.common.a.u;
import com.applovin.exoplayer2.l.ai;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f8133a = Pattern.compile("(&#13;)?&#10;");

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<String, String> f8135b;

        private a(String str, Map<String, String> map) {
            this.f8134a = str;
            this.f8135b = map;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Comparator<b> f8136e = new Comparator() { // from class: com.applovin.exoplayer2.ui.p
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return h.b.b((h.b) obj, (h.b) obj2);
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Comparator<b> f8137f = new Comparator() { // from class: com.applovin.exoplayer2.ui.o
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return h.b.a((h.b) obj, (h.b) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f8140c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f8141d;

        private b(int i10, int i11, String str, String str2) {
            this.f8138a = i10;
            this.f8139b = i11;
            this.f8140c = str;
            this.f8141d = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int a(b bVar, b bVar2) {
            int iCompare = Integer.compare(bVar2.f8138a, bVar.f8138a);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = bVar2.f8140c.compareTo(bVar.f8140c);
            return iCompareTo != 0 ? iCompareTo : bVar2.f8141d.compareTo(bVar.f8141d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int b(b bVar, b bVar2) {
            int iCompare = Integer.compare(bVar2.f8139b, bVar.f8139b);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = bVar.f8140c.compareTo(bVar2.f8140c);
            return iCompareTo != 0 ? iCompareTo : bVar.f8141d.compareTo(bVar2.f8141d);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<b> f8142a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<b> f8143b = new ArrayList();
    }

    private static SparseArray<c> a(Spanned spanned, float f10) {
        SparseArray<c> sparseArray = new SparseArray<>();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String strA = a(obj, f10);
            String strA2 = a(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (strA != null) {
                com.applovin.exoplayer2.l.a.b(strA2);
                b bVar = new b(spanStart, spanEnd, strA, strA2);
                a(sparseArray, spanStart).f8142a.add(bVar);
                a(sparseArray, spanEnd).f8143b.add(bVar);
            }
        }
        return sparseArray;
    }

    public static a a(CharSequence charSequence, float f10) {
        if (charSequence == null) {
            return new a("", u.a());
        }
        if (!(charSequence instanceof Spanned)) {
            return new a(a(charSequence), u.a());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet hashSet = new HashSet();
        int i10 = 0;
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            map.put(e.a(android.support.v4.media.a.a("bg_", iIntValue)), ai.a("background-color:%s;", e.a(iIntValue)));
        }
        SparseArray<c> sparseArrayA = a(spanned, f10);
        StringBuilder sb2 = new StringBuilder(spanned.length());
        int i11 = 0;
        while (i10 < sparseArrayA.size()) {
            int iKeyAt = sparseArrayA.keyAt(i10);
            sb2.append(a(spanned.subSequence(i11, iKeyAt)));
            c cVar = sparseArrayA.get(iKeyAt);
            Collections.sort(cVar.f8143b, b.f8137f);
            Iterator it2 = cVar.f8143b.iterator();
            while (it2.hasNext()) {
                sb2.append(((b) it2.next()).f8141d);
            }
            Collections.sort(cVar.f8142a, b.f8136e);
            Iterator it3 = cVar.f8142a.iterator();
            while (it3.hasNext()) {
                sb2.append(((b) it3.next()).f8140c);
            }
            i10++;
            i11 = iKeyAt;
        }
        sb2.append(a(spanned.subSequence(i11, spanned.length())));
        return new a(sb2.toString(), map);
    }

    private static c a(SparseArray<c> sparseArray, int i10) {
        c cVar = sparseArray.get(i10);
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        sparseArray.put(i10, cVar2);
        return cVar2;
    }

    private static String a(int i10) {
        return i10 != 2 ? "over right" : "under left";
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0016 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0018 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x001a  */
    /* JADX WARN: Code duplicated, block: B:14:0x001d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0020  */
    /* JADX WARN: Code duplicated, block: B:16:0x0023  */
    /* JADX WARN: Code duplicated, block: B:17:0x0026  */
    /* JADX WARN: Code duplicated, block: B:18:0x0029  */
    private static String a(int i10, int i11) {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (i11 != 1) {
            str2 = i11 == 2 ? "open " : "filled ";
            if (i10 != 0) {
                str = "none";
            } else if (i10 != 1) {
                str = "circle";
            } else if (i10 != 2) {
                str = "dot";
            } else if (i10 != 3) {
                str = "unset";
            } else {
                str = "sesame";
            }
            sb2.append(str);
            return sb2.toString();
        }
        sb2.append(str2);
        if (i10 != 0) {
            str = "none";
        } else if (i10 != 1) {
            str = "circle";
        } else if (i10 != 2) {
            str = "dot";
        } else if (i10 != 3) {
            str = "unset";
        } else {
            str = "sesame";
        }
        sb2.append(str);
        return sb2.toString();
    }

    private static String a(CharSequence charSequence) {
        return f8133a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    private static String a(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof com.applovin.exoplayer2.i.d.a) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof com.applovin.exoplayer2.i.d.e)) {
            return "</span>";
        }
        if (obj instanceof TypefaceSpan) {
            if (((TypefaceSpan) obj).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "</b>";
            }
            if (style == 2) {
                return "</i>";
            }
            if (style == 3) {
                return "</i></b>";
            }
        } else {
            if (obj instanceof com.applovin.exoplayer2.i.d.c) {
                return androidx.activity.k.a(defpackage.a.a("<rt>"), a((CharSequence) ((com.applovin.exoplayer2.i.d.c) obj).f6944a), "</rt></ruby>");
            }
            if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
        }
        return null;
    }

    private static String a(Object obj, float f10) {
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return ai.a("<span style='color:%s;'>", e.a(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return ai.a("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof com.applovin.exoplayer2.i.d.a) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
            boolean dip = absoluteSizeSpan.getDip();
            float size = absoluteSizeSpan.getSize();
            if (!dip) {
                size /= f10;
            }
            return ai.a("<span style='font-size:%.2fpx;'>", Float.valueOf(size));
        }
        if (obj instanceof RelativeSizeSpan) {
            return ai.a("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        }
        if (obj instanceof TypefaceSpan) {
            String family = ((TypefaceSpan) obj).getFamily();
            if (family != null) {
                return ai.a("<span style='font-family:\"%s\";'>", family);
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "<b>";
            }
            if (style == 2) {
                return "<i>";
            }
            if (style != 3) {
                return null;
            }
            return "<b><i>";
        }
        if (!(obj instanceof com.applovin.exoplayer2.i.d.c)) {
            if (obj instanceof UnderlineSpan) {
                return "<u>";
            }
            if (!(obj instanceof com.applovin.exoplayer2.i.d.e)) {
                return null;
            }
            com.applovin.exoplayer2.i.d.e eVar = (com.applovin.exoplayer2.i.d.e) obj;
            return ai.a("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", a(eVar.f6946a, eVar.f6947b), a(eVar.f6948c));
        }
        int i10 = ((com.applovin.exoplayer2.i.d.c) obj).f6945b;
        if (i10 == -1) {
            return "<ruby style='ruby-position:unset;'>";
        }
        if (i10 == 1) {
            return "<ruby style='ruby-position:over;'>";
        }
        if (i10 != 2) {
            return null;
        }
        return "<ruby style='ruby-position:under;'>";
    }
}
