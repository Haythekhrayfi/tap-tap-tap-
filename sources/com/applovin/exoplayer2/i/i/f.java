package com.applovin.exoplayer2.i.i;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
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
import com.applovin.exoplayer2.l.y;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f7100a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f7101b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, Integer> f7102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<String, Integer> f7103d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Comparator<a> f7104a = new Comparator() { // from class: com.applovin.exoplayer2.i.i.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return f.a.a((f.a) obj, (f.a) obj2);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f7105b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f7106c;

        private a(b bVar, int i10) {
            this.f7105b = bVar;
            this.f7106c = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int a(a aVar, a aVar2) {
            return Integer.compare(aVar.f7105b.f7108b, aVar2.f7105b.f7108b);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7108b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f7109c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Set<String> f7110d;

        private b(String str, int i10, String str2, Set<String> set) {
            this.f7108b = i10;
            this.f7107a = str;
            this.f7109c = str2;
            this.f7110d = set;
        }

        public static b a() {
            return new b("", 0, "", Collections.emptySet());
        }

        public static b a(String str, int i10) {
            String str2;
            String strTrim = str.trim();
            com.applovin.exoplayer2.l.a.a(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            String[] strArrA = ai.a(strTrim, "\\.");
            String str3 = strArrA[0];
            HashSet hashSet = new HashSet();
            for (int i11 = 1; i11 < strArrA.length; i11++) {
                hashSet.add(strArrA[i11]);
            }
            return new b(str3, i10, str2, hashSet);
        }
    }

    public static final class c implements Comparable<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.applovin.exoplayer2.i.i.d f7112b;

        public c(int i10, com.applovin.exoplayer2.i.i.d dVar) {
            this.f7111a = i10;
            this.f7112b = dVar;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return Integer.compare(this.f7111a, cVar.f7111a);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f7115c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f7113a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f7114b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f7116d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f7117e = -3.4028235E38f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f7118f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f7119g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f7120h = -3.4028235E38f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f7121i = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f7122j = 1.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f7123k = Integer.MIN_VALUE;

        private static float a(float f10, int i10) {
            if (f10 != -3.4028235E38f && i10 == 0 && (f10 < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || f10 > 1.0f)) {
                return 1.0f;
            }
            if (f10 != -3.4028235E38f) {
                return f10;
            }
            return i10 == 0 ? 1.0f : -3.4028235E38f;
        }

        private static float a(int i10) {
            if (i10 != 4) {
                return i10 != 5 ? 0.5f : 1.0f;
            }
            return StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        }

        private static float a(int i10, float f10) {
            if (i10 == 0) {
                return 1.0f - f10;
            }
            if (i10 == 1) {
                return f10 <= 0.5f ? f10 * 2.0f : (1.0f - f10) * 2.0f;
            }
            if (i10 == 2) {
                return f10;
            }
            throw new IllegalStateException(String.valueOf(i10));
        }

        private static int b(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 3) {
                return 2;
            }
            if (i10 != 4) {
                return i10 != 5 ? 1 : 2;
            }
            return 0;
        }

        private static Layout.Alignment c(int i10) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            q.c("WebvttCueParser", "Unknown textAlignment: " + i10);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        public e a() {
            return new e(b().e(), this.f7113a, this.f7114b);
        }

        public com.applovin.exoplayer2.i.a.C0095a b() {
            float fA = this.f7120h;
            if (fA == -3.4028235E38f) {
                fA = a(this.f7116d);
            }
            int iB = this.f7121i;
            if (iB == Integer.MIN_VALUE) {
                iB = b(this.f7116d);
            }
            com.applovin.exoplayer2.i.a.C0095a c0095aD = new com.applovin.exoplayer2.i.a.C0095a().a(c(this.f7116d)).a(a(this.f7117e, this.f7118f), this.f7118f).a(this.f7119g).a(fA).b(iB).b(Math.min(this.f7122j, a(iB, fA))).d(this.f7123k);
            CharSequence charSequence = this.f7115c;
            if (charSequence != null) {
                c0095aD.a(charSequence);
            }
            return c0095aD;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f7102c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f7103d = Collections.unmodifiableMap(map2);
    }

    private static int a(int i10, int i11, int i12) {
        if (i10 != -1) {
            return i10;
        }
        if (i11 != -1) {
            return i11;
        }
        if (i12 != -1) {
            return i12;
        }
        throw new IllegalArgumentException();
    }

    private static int a(String str, int i10) {
        int iIndexOf = str.indexOf(62, i10);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    private static int a(List<com.applovin.exoplayer2.i.i.d> list, String str, b bVar) {
        List<c> listB = b(list, str, bVar);
        for (int i10 = 0; i10 < listB.size(); i10++) {
            com.applovin.exoplayer2.i.i.d dVar = listB.get(i10).f7112b;
            if (dVar.k() != -1) {
                return dVar.k();
            }
        }
        return -1;
    }

    public static SpannedString a(String str, String str2, List<com.applovin.exoplayer2.i.i.d> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < str2.length()) {
            char cCharAt = str2.charAt(i10);
            if (cCharAt == '&') {
                i10++;
                int iIndexOf = str2.indexOf(59, i10);
                int iIndexOf2 = str2.indexOf(32, i10);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    a(str2.substring(i10, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i10 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i10++;
            } else {
                int iA = i10 + 1;
                if (iA < str2.length()) {
                    boolean z10 = str2.charAt(iA) == '/';
                    iA = a(str2, iA);
                    int i11 = iA - 2;
                    boolean z11 = str2.charAt(i11) == '/';
                    int i12 = i10 + (z10 ? 2 : 1);
                    if (!z11) {
                        i11 = iA - 1;
                    }
                    String strSubstring = str2.substring(i12, i11);
                    if (!strSubstring.trim().isEmpty()) {
                        String strG = g(strSubstring);
                        if (f(strG)) {
                            if (z10) {
                                while (!arrayDeque.isEmpty()) {
                                    b bVar = (b) arrayDeque.pop();
                                    a(str, bVar, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new a(bVar, spannableStringBuilder.length()));
                                    }
                                    if (bVar.f7107a.equals(strG)) {
                                        break;
                                    }
                                }
                            } else if (!z11) {
                                arrayDeque.push(b.a(strSubstring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i10 = iA;
            }
        }
        while (!arrayDeque.isEmpty()) {
            a(str, (b) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        a(str, b.a(), (List<a>) Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    public static com.applovin.exoplayer2.i.a.C0095a a(String str) {
        d dVar = new d();
        a(str, dVar);
        return dVar.b();
    }

    public static com.applovin.exoplayer2.i.a a(CharSequence charSequence) {
        d dVar = new d();
        dVar.f7115c = charSequence;
        return dVar.b().e();
    }

    public static e a(y yVar, List<com.applovin.exoplayer2.i.i.d> list) {
        String strC = yVar.C();
        if (strC == null) {
            return null;
        }
        Pattern pattern = f7100a;
        Matcher matcher = pattern.matcher(strC);
        if (matcher.matches()) {
            return a((String) null, matcher, yVar, list);
        }
        String strC2 = yVar.C();
        if (strC2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(strC2);
        if (matcher2.matches()) {
            return a(strC.trim(), matcher2, yVar, list);
        }
        return null;
    }

    private static e a(String str, Matcher matcher, y yVar, List<com.applovin.exoplayer2.i.i.d> list) {
        d dVar = new d();
        try {
            dVar.f7113a = h.a((String) com.applovin.exoplayer2.l.a.b(matcher.group(1)));
            dVar.f7114b = h.a((String) com.applovin.exoplayer2.l.a.b(matcher.group(2)));
            a((String) com.applovin.exoplayer2.l.a.b(matcher.group(3)), dVar);
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String strC = yVar.C();
                if (TextUtils.isEmpty(strC)) {
                    dVar.f7115c = a(str, sb2.toString(), list);
                    return dVar.a();
                }
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(strC.trim());
            }
        } catch (NumberFormatException unused) {
            StringBuilder sbA = defpackage.a.a("Skipping cue with bad header: ");
            sbA.append(matcher.group());
            q.c("WebvttCueParser", sbA.toString());
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    private static void a(SpannableStringBuilder spannableStringBuilder, com.applovin.exoplayer2.i.i.d dVar, int i10, int i11) {
        Object absoluteSizeSpan;
        if (dVar == null) {
            return;
        }
        if (dVar.a() != -1) {
            com.applovin.exoplayer2.i.d.d.a(spannableStringBuilder, new StyleSpan(dVar.a()), i10, i11, 33);
        }
        if (dVar.b()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (dVar.c()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (dVar.f()) {
            com.applovin.exoplayer2.i.d.d.a(spannableStringBuilder, new ForegroundColorSpan(dVar.e()), i10, i11, 33);
        }
        if (dVar.h()) {
            com.applovin.exoplayer2.i.d.d.a(spannableStringBuilder, new BackgroundColorSpan(dVar.g()), i10, i11, 33);
        }
        if (dVar.d() != null) {
            com.applovin.exoplayer2.i.d.d.a(spannableStringBuilder, new TypefaceSpan(dVar.d()), i10, i11, 33);
        }
        int i12 = dVar.i();
        if (i12 == 1) {
            absoluteSizeSpan = new AbsoluteSizeSpan((int) dVar.j(), true);
        } else {
            if (i12 != 2) {
                if (i12 == 3) {
                    absoluteSizeSpan = new RelativeSizeSpan(dVar.j() / 100.0f);
                }
                if (dVar.l()) {
                    spannableStringBuilder.setSpan(new com.applovin.exoplayer2.i.d.a(), i10, i11, 33);
                }
            }
            absoluteSizeSpan = new RelativeSizeSpan(dVar.j());
        }
        com.applovin.exoplayer2.i.d.d.a(spannableStringBuilder, absoluteSizeSpan, i10, i11, 33);
        if (dVar.l()) {
            spannableStringBuilder.setSpan(new com.applovin.exoplayer2.i.d.a(), i10, i11, 33);
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, String str, b bVar, List<a> list, List<com.applovin.exoplayer2.i.i.d> list2) {
        int iA = a(list2, str, bVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, a.f7104a);
        int i10 = bVar.f7108b;
        int length = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if ("rt".equals(((a) arrayList.get(i11)).f7105b.f7107a)) {
                a aVar = (a) arrayList.get(i11);
                int iA2 = a(a(list2, str, aVar.f7105b), iA, 1);
                int i12 = aVar.f7105b.f7108b - length;
                int i13 = aVar.f7106c - length;
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i12, i13);
                spannableStringBuilder.delete(i12, i13);
                spannableStringBuilder.setSpan(new com.applovin.exoplayer2.i.d.c(charSequenceSubSequence.toString(), iA2), i10, i12, 33);
                length = charSequenceSubSequence.length() + length;
                i10 = i12;
            }
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i10, int i11) {
        Object foregroundColorSpan;
        for (String str : set) {
            Map<String, Integer> map = f7102c;
            if (map.containsKey(str)) {
                foregroundColorSpan = new ForegroundColorSpan(map.get(str).intValue());
            } else {
                Map<String, Integer> map2 = f7103d;
                if (map2.containsKey(str)) {
                    foregroundColorSpan = new BackgroundColorSpan(map2.get(str).intValue());
                }
            }
            spannableStringBuilder.setSpan(foregroundColorSpan, i10, i11, 33);
        }
    }

    private static void a(String str, SpannableStringBuilder spannableStringBuilder) {
        char c10;
        Objects.requireNonNull(str);
        switch (str) {
            case "gt":
                c10 = '>';
                break;
            case "lt":
                c10 = '<';
                break;
            case "amp":
                c10 = '&';
                break;
            case "nbsp":
                c10 = ' ';
                break;
            default:
                q.c("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                return;
        }
        spannableStringBuilder.append(c10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:49:0x009d A[LOOP:0: B:47:0x0097->B:49:0x009d, LOOP_END] */
    private static void a(String str, b bVar, List<a> list, SpannableStringBuilder spannableStringBuilder, List<com.applovin.exoplayer2.i.i.d> list2) {
        List<c> listB;
        Object styleSpan;
        int i10 = bVar.f7108b;
        int length = spannableStringBuilder.length();
        String str2 = bVar.f7107a;
        Objects.requireNonNull(str2);
        switch (str2) {
            case "":
            case "v":
            case "lang":
                listB = b(list2, str, bVar);
                for (int i11 = 0; i11 < listB.size(); i11++) {
                    a(spannableStringBuilder, listB.get(i11).f7112b, i10, length);
                }
                break;
            case "b":
                styleSpan = new StyleSpan(1);
                spannableStringBuilder.setSpan(styleSpan, i10, length, 33);
                listB = b(list2, str, bVar);
                while (i11 < listB.size()) {
                    a(spannableStringBuilder, listB.get(i11).f7112b, i10, length);
                }
                break;
            case "c":
                a(spannableStringBuilder, bVar.f7110d, i10, length);
                listB = b(list2, str, bVar);
                while (i11 < listB.size()) {
                    a(spannableStringBuilder, listB.get(i11).f7112b, i10, length);
                }
                break;
            case "i":
                styleSpan = new StyleSpan(2);
                spannableStringBuilder.setSpan(styleSpan, i10, length, 33);
                listB = b(list2, str, bVar);
                while (i11 < listB.size()) {
                    a(spannableStringBuilder, listB.get(i11).f7112b, i10, length);
                }
                break;
            case "u":
                styleSpan = new UnderlineSpan();
                spannableStringBuilder.setSpan(styleSpan, i10, length, 33);
                listB = b(list2, str, bVar);
                while (i11 < listB.size()) {
                    a(spannableStringBuilder, listB.get(i11).f7112b, i10, length);
                }
                break;
            case "ruby":
                a(spannableStringBuilder, str, bVar, list, list2);
                listB = b(list2, str, bVar);
                while (i11 < listB.size()) {
                    a(spannableStringBuilder, listB.get(i11).f7112b, i10, length);
                }
                break;
        }
    }

    private static void a(String str, d dVar) {
        Matcher matcher = f7101b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) com.applovin.exoplayer2.l.a.b(matcher.group(1));
            String str3 = (String) com.applovin.exoplayer2.l.a.b(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    b(str3, dVar);
                } else if ("align".equals(str2)) {
                    dVar.f7116d = e(str3);
                } else if ("position".equals(str2)) {
                    c(str3, dVar);
                } else if ("size".equals(str2)) {
                    dVar.f7122j = h.b(str3);
                } else if ("vertical".equals(str2)) {
                    dVar.f7123k = d(str3);
                } else {
                    q.c("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                StringBuilder sbA = defpackage.a.a("Skipping bad cue setting: ");
                sbA.append(matcher.group());
                q.c("WebvttCueParser", sbA.toString());
            }
        }
    }

    private static int b(String str) {
        Objects.requireNonNull(str);
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                q.c("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static List<c> b(List<com.applovin.exoplayer2.i.i.d> list, String str, b bVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.applovin.exoplayer2.i.i.d dVar = list.get(i10);
            int iA = dVar.a(str, bVar.f7107a, bVar.f7110d, bVar.f7109c);
            if (iA > 0) {
                arrayList.add(new c(iA, dVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static void b(String str, d dVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            dVar.f7119g = b(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            dVar.f7117e = h.b(str);
            dVar.f7118f = 0;
        } else {
            dVar.f7117e = Integer.parseInt(str);
            dVar.f7118f = 1;
        }
    }

    private static int c(String str) {
        Objects.requireNonNull(str);
        str.hashCode();
        switch (str) {
            case "line-left":
            case "start":
                return 0;
            case "center":
            case "middle":
                return 1;
            case "line-right":
            case "end":
                return 2;
            default:
                q.c("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static void c(String str, d dVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            dVar.f7121i = c(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        dVar.f7120h = h.b(str);
    }

    private static int d(String str) {
        Objects.requireNonNull(str);
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        q.c("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return Integer.MIN_VALUE;
    }

    private static int e(String str) {
        Objects.requireNonNull(str);
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                q.c("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    private static boolean f(String str) {
        Objects.requireNonNull(str);
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "rt":
            case "lang":
            case "ruby":
                return true;
            default:
                return false;
        }
    }

    private static String g(String str) {
        String strTrim = str.trim();
        com.applovin.exoplayer2.l.a.a(!strTrim.isEmpty());
        return ai.b(strTrim, "[ \\.]")[0];
    }
}
