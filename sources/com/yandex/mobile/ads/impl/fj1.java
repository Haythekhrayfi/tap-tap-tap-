package com.yandex.mobile.ads.impl;

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
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
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

/* JADX INFO: loaded from: classes3.dex */
public final class fj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f20722a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f20723b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, Integer> f20724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<String, Integer> f20725d;

    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Comparator<a> f20726c = zn1.f27376d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f20727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f20728b;

        private a(b bVar, int i10) {
            this.f20727a = bVar;
            this.f20728b = i10;
        }

        public /* synthetic */ a(b bVar, int i10, int i11) {
            this(bVar, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int a(a aVar, a aVar2) {
            return Integer.compare(aVar.f20727a.f20730b, aVar2.f20727a.f20730b);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f20729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f20730b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f20731c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Set<String> f20732d;

        private b(String str, int i10, String str2, Set<String> set) {
            this.f20730b = i10;
            this.f20729a = str;
            this.f20731c = str2;
            this.f20732d = set;
        }

        public static b a() {
            return new b("", 0, "", Collections.emptySet());
        }

        public static b a(int i10, String str) {
            String str2;
            String strTrim = str.trim();
            pa.a(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            int i11 = da1.f19803a;
            String[] strArrSplit = strTrim.split("\\.", -1);
            String str3 = strArrSplit[0];
            HashSet hashSet = new HashSet();
            for (int i12 = 1; i12 < strArrSplit.length; i12++) {
                hashSet.add(strArrSplit[i12]);
            }
            return new b(str3, i10, str2, hashSet);
        }
    }

    public static final class c implements Comparable<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dj1 f20734b;

        public c(int i10, dj1 dj1Var) {
            this.f20733a = i10;
            this.f20734b = dj1Var;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            return Integer.compare(this.f20733a, cVar.f20733a);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f20737c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f20735a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f20736b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f20738d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f20739e = -3.4028235E38f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f20740f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f20741g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f20742h = -3.4028235E38f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f20743i = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f20744j = 1.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f20745k = Integer.MIN_VALUE;

        /* JADX WARN: Code duplicated, block: B:20:0x0032  */
        /* JADX WARN: Code duplicated, block: B:21:0x0034  */
        /* JADX WARN: Code duplicated, block: B:29:0x004f  */
        /* JADX WARN: Code duplicated, block: B:31:0x0055  */
        /* JADX WARN: Code duplicated, block: B:43:0x0074  */
        public final am.a a() {
            Layout.Alignment alignment;
            float f10 = this.f20742h;
            float f11 = -3.4028235E38f;
            if (f10 == -3.4028235E38f) {
                int i10 = this.f20738d;
                if (i10 != 4) {
                    f10 = i10 != 5 ? 0.5f : 1.0f;
                } else {
                    f10 = 0.0f;
                }
            }
            int i11 = this.f20743i;
            if (i11 == Integer.MIN_VALUE) {
                int i12 = this.f20738d;
                if (i12 == 1) {
                    i11 = 0;
                } else if (i12 == 3) {
                    i11 = 2;
                } else if (i12 == 4) {
                    i11 = 0;
                } else if (i12 != 5) {
                    i11 = 1;
                } else {
                    i11 = 2;
                }
            }
            am.a aVar = new am.a();
            int i13 = this.f20738d;
            if (i13 == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i13 == 2) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else if (i13 == 3) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i13 == 4) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i13 != 5) {
                o80.a("Unknown textAlignment: ", i13, "WebvttCueParser");
                alignment = null;
            } else {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            }
            am.a aVarB = aVar.b(alignment);
            float f12 = this.f20739e;
            int i14 = this.f20740f;
            if (f12 != -3.4028235E38f && i14 == 0 && (f12 < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || f12 > 1.0f)) {
                f11 = 1.0f;
            } else if (f12 != -3.4028235E38f) {
                f11 = f12;
            } else if (i14 == 0) {
                f11 = 1.0f;
            }
            am.a aVarB2 = aVarB.a(i14, f11).a(this.f20741g).b(f10).b(i11);
            float f13 = this.f20744j;
            if (i11 == 0) {
                f10 = 1.0f - f10;
            } else if (i11 == 1) {
                f10 = f10 <= 0.5f ? f10 * 2.0f : (1.0f - f10) * 2.0f;
            } else if (i11 != 2) {
                throw new IllegalStateException(String.valueOf(i11));
            }
            am.a aVarC = aVarB2.d(Math.min(f13, f10)).c(this.f20745k);
            CharSequence charSequence = this.f20737c;
            if (charSequence != null) {
                aVarC.a(charSequence);
            }
            return aVarC;
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
        f20724c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f20725d = Collections.unmodifiableMap(map2);
    }

    public static SpannedString a(String str, String str2, List<dj1> list) {
        int i10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        int i12 = 0;
        while (i12 < str2.length()) {
            char cCharAt = str2.charAt(i12);
            int i13 = 1;
            if (cCharAt == '&') {
                i12++;
                int iIndexOf = str2.indexOf(59, i12);
                int iIndexOf2 = str2.indexOf(32, i12);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    String strSubstring = str2.substring(i12, iIndexOf);
                    Objects.requireNonNull(strSubstring);
                    switch (strSubstring) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            p90.d("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                            break;
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i12 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
                i11 = 0;
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i12++;
            } else {
                int length = i12 + 1;
                if (length < str2.length()) {
                    int i14 = str2.charAt(length) == '/' ? 1 : i11;
                    int iIndexOf3 = str2.indexOf(62, length);
                    length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                    int i15 = length - 2;
                    int i16 = str2.charAt(i15) == '/' ? 1 : i11;
                    int i17 = i12 + (i14 != 0 ? 2 : 1);
                    if (i16 == 0) {
                        i15 = length - 1;
                    }
                    String strSubstring2 = str2.substring(i17, i15);
                    if (!strSubstring2.trim().isEmpty()) {
                        String strTrim = strSubstring2.trim();
                        pa.a(!strTrim.isEmpty());
                        int i18 = da1.f19803a;
                        String str3 = strTrim.split("[ \\.]", 2)[i11];
                        Objects.requireNonNull(str3);
                        switch (str3.hashCode()) {
                            case 98:
                                if (str3.equals("b")) {
                                }
                                break;
                            case 99:
                                if (str3.equals("c")) {
                                }
                                break;
                            case 105:
                                if (str3.equals(IntegerTokenConverter.CONVERTER_KEY)) {
                                }
                                break;
                            case 117:
                                if (str3.equals("u")) {
                                }
                                break;
                            case 118:
                                if (str3.equals("v")) {
                                    i10 = 4;
                                    break;
                                }
                                break;
                            case 3650:
                                if (str3.equals("rt")) {
                                    i10 = 5;
                                    break;
                                }
                                break;
                            case 3314158:
                                if (str3.equals("lang")) {
                                    i10 = 6;
                                    break;
                                }
                                break;
                            case 3511770:
                                if (str3.equals("ruby")) {
                                    i10 = 7;
                                    break;
                                }
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
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
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
                            Method dump skipped, instruction units count: 582
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.fj1.a(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
                    }

                    public static am.a a(String str) {
                        d dVar = new d();
                        a(str, dVar);
                        return dVar.a();
                    }

                    public static ej1 a(mp0 mp0Var, ArrayList arrayList) {
                        String strJ = mp0Var.j();
                        if (strJ == null) {
                            return null;
                        }
                        Pattern pattern = f20722a;
                        Matcher matcher = pattern.matcher(strJ);
                        if (matcher.matches()) {
                            return a(null, matcher, mp0Var, arrayList);
                        }
                        String strJ2 = mp0Var.j();
                        if (strJ2 == null) {
                            return null;
                        }
                        Matcher matcher2 = pattern.matcher(strJ2);
                        if (matcher2.matches()) {
                            return a(strJ.trim(), matcher2, mp0Var, arrayList);
                        }
                        return null;
                    }

                    private static ej1 a(String str, Matcher matcher, mp0 mp0Var, ArrayList arrayList) {
                        d dVar = new d();
                        try {
                            String strGroup = matcher.group(1);
                            Objects.requireNonNull(strGroup);
                            dVar.f20735a = hj1.a(strGroup);
                            String strGroup2 = matcher.group(2);
                            Objects.requireNonNull(strGroup2);
                            dVar.f20736b = hj1.a(strGroup2);
                            String strGroup3 = matcher.group(3);
                            Objects.requireNonNull(strGroup3);
                            a(strGroup3, dVar);
                            StringBuilder sb2 = new StringBuilder();
                            while (true) {
                                String strJ = mp0Var.j();
                                if (TextUtils.isEmpty(strJ)) {
                                    dVar.f20737c = a(str, sb2.toString(), arrayList);
                                    return new ej1(dVar.a().a(), dVar.f20735a, dVar.f20736b);
                                }
                                if (sb2.length() > 0) {
                                    sb2.append("\n");
                                }
                                sb2.append(strJ.trim());
                            }
                        } catch (NumberFormatException unused) {
                            StringBuilder sbA = v60.a("Skipping cue with bad header: ");
                            sbA.append(matcher.group());
                            p90.d("WebvttCueParser", sbA.toString());
                            return null;
                        }
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code duplicated, block: B:101:0x0229  */
                    /* JADX WARN: Code duplicated, block: B:102:0x0231  */
                    /* JADX WARN: Code duplicated, block: B:104:0x0238  */
                    /* JADX WARN: Code duplicated, block: B:107:0x024a  */
                    /* JADX WARN: Code duplicated, block: B:108:0x0255  */
                    /* JADX WARN: Code duplicated, block: B:111:0x025d  */
                    /* JADX WARN: Code duplicated, block: B:114:0x026b  */
                    /* JADX WARN: Code duplicated, block: B:117:0x027d  */
                    /* JADX WARN: Code duplicated, block: B:120:0x028f  */
                    /* JADX WARN: Code duplicated, block: B:123:0x02a2  */
                    /* JADX WARN: Code duplicated, block: B:125:0x02a6 A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:127:0x02a9  */
                    /* JADX WARN: Code duplicated, block: B:128:0x02b6  */
                    /* JADX WARN: Code duplicated, block: B:131:0x02c4  */
                    /* JADX WARN: Code duplicated, block: B:134:0x02da  */
                    /* JADX WARN: Code duplicated, block: B:135:0x02e5  */
                    /* JADX WARN: Code duplicated, block: B:159:0x0212 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:92:0x01f6  */
                    /* JADX WARN: Code duplicated, block: B:94:0x020a  */
                    /* JADX WARN: Code duplicated, block: B:99:0x021f  */
                    private static void a(SpannableStringBuilder spannableStringBuilder, b bVar, String str, List list, List list2) {
                        ArrayList arrayList;
                        int i10;
                        int i11;
                        dj1 dj1Var;
                        int i12;
                        int iF;
                        RelativeSizeSpan relativeSizeSpan;
                        dj1 dj1Var2;
                        int iA;
                        Object foregroundColorSpan;
                        int i13;
                        int i14;
                        Object styleSpan;
                        ArrayList arrayList2;
                        List list3 = list2;
                        int i15 = bVar.f20730b;
                        int length = spannableStringBuilder.length();
                        String str2 = bVar.f20729a;
                        Objects.requireNonNull(str2);
                        switch (str2) {
                            case "":
                            case "v":
                            case "lang":
                                arrayList = new ArrayList();
                                for (i10 = 0; i10 < list2.size(); i10++) {
                                    dj1Var2 = (dj1) list2.get(i10);
                                    iA = dj1Var2.a(str, bVar.f20729a, bVar.f20732d, bVar.f20731c);
                                    if (iA > 0) {
                                        arrayList.add(new c(iA, dj1Var2));
                                    }
                                }
                                Collections.sort(arrayList);
                                for (i11 = 0; i11 < arrayList.size(); i11++) {
                                    dj1Var = ((c) arrayList.get(i11)).f20734b;
                                    if (dj1Var != null) {
                                        if (dj1Var.h() != -1) {
                                            u31.a(spannableStringBuilder, new StyleSpan(dj1Var.h()), i15, length);
                                        }
                                        if (dj1Var.k()) {
                                            i12 = 33;
                                            spannableStringBuilder.setSpan(new StrikethroughSpan(), i15, length, 33);
                                        } else {
                                            i12 = 33;
                                        }
                                        if (dj1Var.l()) {
                                            spannableStringBuilder.setSpan(new UnderlineSpan(), i15, length, i12);
                                        }
                                        if (dj1Var.j()) {
                                            u31.a(spannableStringBuilder, new ForegroundColorSpan(dj1Var.c()), i15, length);
                                        }
                                        if (dj1Var.i()) {
                                            u31.a(spannableStringBuilder, new BackgroundColorSpan(dj1Var.a()), i15, length);
                                        }
                                        if (dj1Var.d() != null) {
                                            u31.a(spannableStringBuilder, new TypefaceSpan(dj1Var.d()), i15, length);
                                        }
                                        iF = dj1Var.f();
                                        if (iF != 1) {
                                            if (iF != 2) {
                                                relativeSizeSpan = new RelativeSizeSpan(dj1Var.e());
                                            } else if (iF == 3) {
                                                relativeSizeSpan = new RelativeSizeSpan(dj1Var.e() / 100.0f);
                                            }
                                            u31.a(spannableStringBuilder, relativeSizeSpan, i15, length);
                                        } else {
                                            u31.a(spannableStringBuilder, new AbsoluteSizeSpan((int) dj1Var.e(), true), i15, length);
                                        }
                                        if (dj1Var.b()) {
                                            spannableStringBuilder.setSpan(new wy(), i15, length, 33);
                                        }
                                    }
                                }
                                break;
                            case "b":
                                spannableStringBuilder.setSpan(new StyleSpan(1), i15, length, 33);
                                arrayList = new ArrayList();
                                while (i10 < list2.size()) {
                                    dj1Var2 = (dj1) list2.get(i10);
                                    iA = dj1Var2.a(str, bVar.f20729a, bVar.f20732d, bVar.f20731c);
                                    if (iA > 0) {
                                        arrayList.add(new c(iA, dj1Var2));
                                    }
                                }
                                Collections.sort(arrayList);
                                while (i11 < arrayList.size()) {
                                    dj1Var = ((c) arrayList.get(i11)).f20734b;
                                    if (dj1Var != null) {
                                        if (dj1Var.h() != -1) {
                                            u31.a(spannableStringBuilder, new StyleSpan(dj1Var.h()), i15, length);
                                        }
                                        if (dj1Var.k()) {
                                            i12 = 33;
                                            spannableStringBuilder.setSpan(new StrikethroughSpan(), i15, length, 33);
                                        } else {
                                            i12 = 33;
                                        }
                                        if (dj1Var.l()) {
                                            spannableStringBuilder.setSpan(new UnderlineSpan(), i15, length, i12);
                                        }
                                        if (dj1Var.j()) {
                                            u31.a(spannableStringBuilder, new ForegroundColorSpan(dj1Var.c()), i15, length);
                                        }
                                        if (dj1Var.i()) {
                                            u31.a(spannableStringBuilder, new BackgroundColorSpan(dj1Var.a()), i15, length);
                                        }
                                        if (dj1Var.d() != null) {
                                            u31.a(spannableStringBuilder, new TypefaceSpan(dj1Var.d()), i15, length);
                                        }
                                        iF = dj1Var.f();
                                        if (iF != 1) {
                                            if (iF != 2) {
                                                relativeSizeSpan = new RelativeSizeSpan(dj1Var.e());
                                            } else if (iF == 3) {
                                                relativeSizeSpan = new RelativeSizeSpan(dj1Var.e() / 100.0f);
                                            }
                                            u31.a(spannableStringBuilder, relativeSizeSpan, i15, length);
                                        } else {
                                            u31.a(spannableStringBuilder, new AbsoluteSizeSpan((int) dj1Var.e(), true), i15, length);
                                        }
                                        if (dj1Var.b()) {
                                            spannableStringBuilder.setSpan(new wy(), i15, length, 33);
                                        }
                                    }
                                }
                                break;
                            case "c":
                                for (String str3 : bVar.f20732d) {
                                    Map<String, Integer> map = f20724c;
                                    if (map.containsKey(str3)) {
                                        foregroundColorSpan = new ForegroundColorSpan(map.get(str3).intValue());
                                        i13 = 33;
                                    } else {
                                        i13 = 33;
                                        Map<String, Integer> map2 = f20725d;
                                        if (map2.containsKey(str3)) {
                                            foregroundColorSpan = new BackgroundColorSpan(map2.get(str3).intValue());
                                        }
                                    }
                                    spannableStringBuilder.setSpan(foregroundColorSpan, i15, length, i13);
                                }
                                arrayList = new ArrayList();
                                while (i10 < list2.size()) {
                                    dj1Var2 = (dj1) list2.get(i10);
                                    iA = dj1Var2.a(str, bVar.f20729a, bVar.f20732d, bVar.f20731c);
                                    if (iA > 0) {
                                        arrayList.add(new c(iA, dj1Var2));
                                    }
                                }
                                Collections.sort(arrayList);
                                while (i11 < arrayList.size()) {
                                    dj1Var = ((c) arrayList.get(i11)).f20734b;
                                    if (dj1Var != null) {
                                        if (dj1Var.h() != -1) {
                                            u31.a(spannableStringBuilder, new StyleSpan(dj1Var.h()), i15, length);
                                        }
                                        if (dj1Var.k()) {
                                            i12 = 33;
                                            spannableStringBuilder.setSpan(new StrikethroughSpan(), i15, length, 33);
                                        } else {
                                            i12 = 33;
                                        }
                                        if (dj1Var.l()) {
                                            spannableStringBuilder.setSpan(new UnderlineSpan(), i15, length, i12);
                                        }
                                        if (dj1Var.j()) {
                                            u31.a(spannableStringBuilder, new ForegroundColorSpan(dj1Var.c()), i15, length);
                                        }
                                        if (dj1Var.i()) {
                                            u31.a(spannableStringBuilder, new BackgroundColorSpan(dj1Var.a()), i15, length);
                                        }
                                        if (dj1Var.d() != null) {
                                            u31.a(spannableStringBuilder, new TypefaceSpan(dj1Var.d()), i15, length);
                                        }
                                        iF = dj1Var.f();
                                        if (iF != 1) {
                                            if (iF != 2) {
                                                relativeSizeSpan = new RelativeSizeSpan(dj1Var.e());
                                            } else if (iF == 3) {
                                                relativeSizeSpan = new RelativeSizeSpan(dj1Var.e() / 100.0f);
                                            }
                                            u31.a(spannableStringBuilder, relativeSizeSpan, i15, length);
                                        } else {
                                            u31.a(spannableStringBuilder, new AbsoluteSizeSpan((int) dj1Var.e(), true), i15, length);
                                        }
                                        if (dj1Var.b()) {
                                            spannableStringBuilder.setSpan(new wy(), i15, length, 33);
                                        }
                                    }
                                }
                                break;
                            case "i":
                                i14 = 33;
                                styleSpan = new StyleSpan(2);
                                spannableStringBuilder.setSpan(styleSpan, i15, length, i14);
                                arrayList = new ArrayList();
                                while (i10 < list2.size()) {
                                    dj1Var2 = (dj1) list2.get(i10);
                                    iA = dj1Var2.a(str, bVar.f20729a, bVar.f20732d, bVar.f20731c);
                                    if (iA > 0) {
                                        arrayList.add(new c(iA, dj1Var2));
                                    }
                                }
                                Collections.sort(arrayList);
                                while (i11 < arrayList.size()) {
                                    dj1Var = ((c) arrayList.get(i11)).f20734b;
                                    if (dj1Var != null) {
                                        if (dj1Var.h() != -1) {
                                            u31.a(spannableStringBuilder, new StyleSpan(dj1Var.h()), i15, length);
                                        }
                                        if (dj1Var.k()) {
                                            i12 = 33;
                                            spannableStringBuilder.setSpan(new StrikethroughSpan(), i15, length, 33);
                                        } else {
                                            i12 = 33;
                                        }
                                        if (dj1Var.l()) {
                                            spannableStringBuilder.setSpan(new UnderlineSpan(), i15, length, i12);
                                        }
                                        if (dj1Var.j()) {
                                            u31.a(spannableStringBuilder, new ForegroundColorSpan(dj1Var.c()), i15, length);
                                        }
                                        if (dj1Var.i()) {
                                            u31.a(spannableStringBuilder, new BackgroundColorSpan(dj1Var.a()), i15, length);
                                        }
                                        if (dj1Var.d() != null) {
                                            u31.a(spannableStringBuilder, new TypefaceSpan(dj1Var.d()), i15, length);
                                        }
                                        iF = dj1Var.f();
                                        if (iF != 1) {
                                            if (iF != 2) {
                                                relativeSizeSpan = new RelativeSizeSpan(dj1Var.e());
                                            } else if (iF == 3) {
                                                relativeSizeSpan = new RelativeSizeSpan(dj1Var.e() / 100.0f);
                                            }
                                            u31.a(spannableStringBuilder, relativeSizeSpan, i15, length);
                                        } else {
                                            u31.a(spannableStringBuilder, new AbsoluteSizeSpan((int) dj1Var.e(), true), i15, length);
                                        }
                                        if (dj1Var.b()) {
                                            spannableStringBuilder.setSpan(new wy(), i15, length, 33);
                                        }
                                    }
                                }
                                break;
                            case "u":
                                i14 = 33;
                                styleSpan = new UnderlineSpan();
                                spannableStringBuilder.setSpan(styleSpan, i15, length, i14);
                                arrayList = new ArrayList();
                                while (i10 < list2.size()) {
                                    dj1Var2 = (dj1) list2.get(i10);
                                    iA = dj1Var2.a(str, bVar.f20729a, bVar.f20732d, bVar.f20731c);
                                    if (iA > 0) {
                                        arrayList.add(new c(iA, dj1Var2));
                                    }
                                }
                                Collections.sort(arrayList);
                                while (i11 < arrayList.size()) {
                                    dj1Var = ((c) arrayList.get(i11)).f20734b;
                                    if (dj1Var != null) {
                                        if (dj1Var.h() != -1) {
                                            u31.a(spannableStringBuilder, new StyleSpan(dj1Var.h()), i15, length);
                                        }
                                        if (dj1Var.k()) {
                                            i12 = 33;
                                            spannableStringBuilder.setSpan(new StrikethroughSpan(), i15, length, 33);
                                        } else {
                                            i12 = 33;
                                        }
                                        if (dj1Var.l()) {
                                            spannableStringBuilder.setSpan(new UnderlineSpan(), i15, length, i12);
                                        }
                                        if (dj1Var.j()) {
                                            u31.a(spannableStringBuilder, new ForegroundColorSpan(dj1Var.c()), i15, length);
                                        }
                                        if (dj1Var.i()) {
                                            u31.a(spannableStringBuilder, new BackgroundColorSpan(dj1Var.a()), i15, length);
                                        }
                                        if (dj1Var.d() != null) {
                                            u31.a(spannableStringBuilder, new TypefaceSpan(dj1Var.d()), i15, length);
                                        }
                                        iF = dj1Var.f();
                                        if (iF != 1) {
                                            if (iF != 2) {
                                                relativeSizeSpan = new RelativeSizeSpan(dj1Var.e());
                                            } else if (iF == 3) {
                                                relativeSizeSpan = new RelativeSizeSpan(dj1Var.e() / 100.0f);
                                            }
                                            u31.a(spannableStringBuilder, relativeSizeSpan, i15, length);
                                        } else {
                                            u31.a(spannableStringBuilder, new AbsoluteSizeSpan((int) dj1Var.e(), true), i15, length);
                                        }
                                        if (dj1Var.b()) {
                                            spannableStringBuilder.setSpan(new wy(), i15, length, 33);
                                        }
                                    }
                                }
                                break;
                            case "ruby":
                                ArrayList arrayList3 = new ArrayList();
                                for (int i16 = 0; i16 < list2.size(); i16++) {
                                    dj1 dj1Var3 = (dj1) list3.get(i16);
                                    int iA2 = dj1Var3.a(str, bVar.f20729a, bVar.f20732d, bVar.f20731c);
                                    if (iA2 > 0) {
                                        arrayList3.add(new c(iA2, dj1Var3));
                                    }
                                }
                                Collections.sort(arrayList3);
                                for (int i17 = 0; i17 < arrayList3.size() && ((c) arrayList3.get(i17)).f20734b.g() == -1; i17++) {
                                }
                                ArrayList arrayList4 = new ArrayList(list.size());
                                arrayList4.addAll(list);
                                Collections.sort(arrayList4, a.f20726c);
                                int i18 = bVar.f20730b;
                                int i19 = 0;
                                int length2 = 0;
                                while (i19 < arrayList4.size()) {
                                    if ("rt".equals(((a) arrayList4.get(i19)).f20727a.f20729a)) {
                                        a aVar = (a) arrayList4.get(i19);
                                        b bVar2 = aVar.f20727a;
                                        ArrayList arrayList5 = new ArrayList();
                                        int i20 = 0;
                                        while (i20 < list2.size()) {
                                            dj1 dj1Var4 = (dj1) list3.get(i20);
                                            ArrayList arrayList6 = arrayList4;
                                            int iA3 = dj1Var4.a(str, bVar2.f20729a, bVar2.f20732d, bVar2.f20731c);
                                            if (iA3 > 0) {
                                                arrayList5.add(new c(iA3, dj1Var4));
                                            }
                                            i20++;
                                            list3 = list2;
                                            arrayList4 = arrayList6;
                                        }
                                        arrayList2 = arrayList4;
                                        Collections.sort(arrayList5);
                                        for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                            dj1 dj1Var5 = ((c) arrayList5.get(i21)).f20734b;
                                            if (dj1Var5.g() != -1) {
                                                dj1Var5.g();
                                                int i22 = aVar.f20727a.f20730b - length2;
                                                int i23 = aVar.f20728b - length2;
                                                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i22, i23);
                                                spannableStringBuilder.delete(i22, i23);
                                                charSequenceSubSequence.toString();
                                                spannableStringBuilder.setSpan(new sy0(), i18, i22, 33);
                                                length2 += charSequenceSubSequence.length();
                                                i18 = i22;
                                            }
                                        }
                                        int i24 = aVar.f20727a.f20730b - length2;
                                        int i25 = aVar.f20728b - length2;
                                        CharSequence charSequenceSubSequence2 = spannableStringBuilder.subSequence(i24, i25);
                                        spannableStringBuilder.delete(i24, i25);
                                        charSequenceSubSequence2.toString();
                                        spannableStringBuilder.setSpan(new sy0(), i18, i24, 33);
                                        length2 += charSequenceSubSequence2.length();
                                        i18 = i24;
                                    } else {
                                        arrayList2 = arrayList4;
                                    }
                                    i19++;
                                    list3 = list2;
                                    arrayList4 = arrayList2;
                                }
                                arrayList = new ArrayList();
                                while (i10 < list2.size()) {
                                    dj1Var2 = (dj1) list2.get(i10);
                                    iA = dj1Var2.a(str, bVar.f20729a, bVar.f20732d, bVar.f20731c);
                                    if (iA > 0) {
                                        arrayList.add(new c(iA, dj1Var2));
                                    }
                                }
                                Collections.sort(arrayList);
                                while (i11 < arrayList.size()) {
                                    dj1Var = ((c) arrayList.get(i11)).f20734b;
                                    if (dj1Var != null) {
                                        if (dj1Var.h() != -1) {
                                            u31.a(spannableStringBuilder, new StyleSpan(dj1Var.h()), i15, length);
                                        }
                                        if (dj1Var.k()) {
                                            i12 = 33;
                                            spannableStringBuilder.setSpan(new StrikethroughSpan(), i15, length, 33);
                                        } else {
                                            i12 = 33;
                                        }
                                        if (dj1Var.l()) {
                                            spannableStringBuilder.setSpan(new UnderlineSpan(), i15, length, i12);
                                        }
                                        if (dj1Var.j()) {
                                            u31.a(spannableStringBuilder, new ForegroundColorSpan(dj1Var.c()), i15, length);
                                        }
                                        if (dj1Var.i()) {
                                            u31.a(spannableStringBuilder, new BackgroundColorSpan(dj1Var.a()), i15, length);
                                        }
                                        if (dj1Var.d() != null) {
                                            u31.a(spannableStringBuilder, new TypefaceSpan(dj1Var.d()), i15, length);
                                        }
                                        iF = dj1Var.f();
                                        if (iF != 1) {
                                            if (iF != 2) {
                                                relativeSizeSpan = new RelativeSizeSpan(dj1Var.e());
                                            } else if (iF == 3) {
                                                relativeSizeSpan = new RelativeSizeSpan(dj1Var.e() / 100.0f);
                                            }
                                            u31.a(spannableStringBuilder, relativeSizeSpan, i15, length);
                                        } else {
                                            u31.a(spannableStringBuilder, new AbsoluteSizeSpan((int) dj1Var.e(), true), i15, length);
                                        }
                                        if (dj1Var.b()) {
                                            spannableStringBuilder.setSpan(new wy(), i15, length, 33);
                                        }
                                    }
                                }
                                break;
                        }
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    private static void a(String str, d dVar) {
                        Matcher matcher = f20723b.matcher(str);
                        while (matcher.find()) {
                            int i10 = 1;
                            String strGroup = matcher.group(1);
                            Objects.requireNonNull(strGroup);
                            String strGroup2 = matcher.group(2);
                            Objects.requireNonNull(strGroup2);
                            try {
                                if ("line".equals(strGroup)) {
                                    b(strGroup2, dVar);
                                } else {
                                    if ("align".equals(strGroup)) {
                                        switch (strGroup2) {
                                            case "center":
                                            case "middle":
                                                i10 = 2;
                                                break;
                                            case "end":
                                                i10 = 3;
                                                break;
                                            case "left":
                                                i10 = 4;
                                                break;
                                            case "right":
                                                i10 = 5;
                                                break;
                                            case "start":
                                                break;
                                            default:
                                                p90.d("WebvttCueParser", "Invalid alignment value: " + strGroup2);
                                                i10 = 2;
                                                break;
                                        }
                                        dVar.f20738d = i10;
                                    } else if ("position".equals(strGroup)) {
                                        c(strGroup2, dVar);
                                    } else if ("size".equals(strGroup)) {
                                        int i11 = hj1.f21440a;
                                        if (!strGroup2.endsWith("%")) {
                                            throw new NumberFormatException("Percentages must end with %");
                                        }
                                        dVar.f20744j = Float.parseFloat(strGroup2.substring(0, strGroup2.length() - 1)) / 100.0f;
                                    } else if ("vertical".equals(strGroup)) {
                                        if (strGroup2.equals("lr")) {
                                            i10 = 2;
                                        } else if (!strGroup2.equals("rl")) {
                                            p90.d("WebvttCueParser", "Invalid 'vertical' value: " + strGroup2);
                                            i10 = Integer.MIN_VALUE;
                                        }
                                        dVar.f20745k = i10;
                                    } else {
                                        p90.d("WebvttCueParser", "Unknown cue setting " + strGroup + ":" + strGroup2);
                                    }
                                }
                            } catch (NumberFormatException unused) {
                                StringBuilder sbA = v60.a("Skipping bad cue setting: ");
                                sbA.append(matcher.group());
                                p90.d("WebvttCueParser", sbA.toString());
                            }
                        }
                    }

                    private static void b(String str, d dVar) {
                        int iIndexOf = str.indexOf(44);
                        if (iIndexOf != -1) {
                            String strSubstring = str.substring(iIndexOf + 1);
                            Objects.requireNonNull(strSubstring);
                            int i10 = 2;
                            switch (strSubstring) {
                                case "center":
                                case "middle":
                                    i10 = 1;
                                    break;
                                case "end":
                                    break;
                                case "start":
                                    i10 = 0;
                                    break;
                                default:
                                    li1.a("Invalid anchor value: ", strSubstring, "WebvttCueParser");
                                    i10 = Integer.MIN_VALUE;
                                    break;
                            }
                            dVar.f20741g = i10;
                            str = str.substring(0, iIndexOf);
                        }
                        if (!str.endsWith("%")) {
                            dVar.f20739e = Integer.parseInt(str);
                            dVar.f20740f = 1;
                            return;
                        }
                        int i11 = hj1.f21440a;
                        if (!str.endsWith("%")) {
                            throw new NumberFormatException("Percentages must end with %");
                        }
                        dVar.f20739e = Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
                        dVar.f20740f = 0;
                    }

                    private static void c(String str, d dVar) {
                        int iIndexOf = str.indexOf(44);
                        if (iIndexOf != -1) {
                            String strSubstring = str.substring(iIndexOf + 1);
                            Objects.requireNonNull(strSubstring);
                            int i10 = 2;
                            switch (strSubstring) {
                                case "line-left":
                                case "start":
                                    i10 = 0;
                                    break;
                                case "center":
                                case "middle":
                                    i10 = 1;
                                    break;
                                case "line-right":
                                case "end":
                                    break;
                                default:
                                    li1.a("Invalid anchor value: ", strSubstring, "WebvttCueParser");
                                    i10 = Integer.MIN_VALUE;
                                    break;
                            }
                            dVar.f20743i = i10;
                            str = str.substring(0, iIndexOf);
                        }
                        int i11 = hj1.f21440a;
                        if (!str.endsWith("%")) {
                            throw new NumberFormatException("Percentages must end with %");
                        }
                        dVar.f20742h = Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
                    }
                }
