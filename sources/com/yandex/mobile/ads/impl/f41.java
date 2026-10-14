package com.yandex.mobile.ads.impl;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
final class f41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f20526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f20527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f20528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f20529f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f20530g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f20531h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f20532i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f20533j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20534a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f20535b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f20536c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f20537d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f20538e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f20539f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f20540g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f20541h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f20542i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f20543j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f20544k;

        private a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
            this.f20534a = i10;
            this.f20535b = i11;
            this.f20536c = i12;
            this.f20537d = i13;
            this.f20538e = i14;
            this.f20539f = i15;
            this.f20540g = i16;
            this.f20541h = i17;
            this.f20542i = i18;
            this.f20543j = i19;
            this.f20544k = i20;
        }

        public static a a(String str) {
            String[] strArrSplit = TextUtils.split(str.substring(7), ",");
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            for (int i20 = 0; i20 < strArrSplit.length; i20++) {
                String strB = na.b(strArrSplit[i20].trim());
                Objects.requireNonNull(strB);
                switch (strB) {
                    case "italic":
                        i16 = i20;
                        break;
                    case "underline":
                        i17 = i20;
                        break;
                    case "strikeout":
                        i18 = i20;
                        break;
                    case "primarycolour":
                        i12 = i20;
                        break;
                    case "bold":
                        i15 = i20;
                        break;
                    case "name":
                        i10 = i20;
                        break;
                    case "fontsize":
                        i14 = i20;
                        break;
                    case "borderstyle":
                        i19 = i20;
                        break;
                    case "alignment":
                        i11 = i20;
                        break;
                    case "outlinecolour":
                        i13 = i20;
                        break;
                }
            }
            if (i10 != -1) {
                return new a(i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, strArrSplit.length);
            }
            return null;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Pattern f20545c = Pattern.compile("\\{([^}]*)\\}");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Pattern f20546d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Pattern f20547e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Pattern f20548f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PointF f20550b;

        static {
            int i10 = da1.f19803a;
            Locale locale = Locale.US;
            f20546d = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
            f20547e = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
            f20548f = Pattern.compile("\\\\an(\\d+)");
        }

        private b(int i10, PointF pointF) {
            this.f20549a = i10;
            this.f20550b = pointF;
        }

        public static b a(String str) {
            int iA;
            Matcher matcher = f20545c.matcher(str);
            PointF pointF = null;
            int i10 = -1;
            while (matcher.find()) {
                String strGroup = matcher.group(1);
                Objects.requireNonNull(strGroup);
                try {
                    PointF pointFB = b(strGroup);
                    if (pointFB != null) {
                        pointF = pointFB;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    Matcher matcher2 = f20548f.matcher(strGroup);
                    if (matcher2.find()) {
                        String strGroup2 = matcher2.group(1);
                        Objects.requireNonNull(strGroup2);
                        iA = f41.a(strGroup2);
                    } else {
                        iA = -1;
                    }
                    if (iA != -1) {
                        i10 = iA;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i10, pointF);
        }

        private static PointF b(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = f20546d.matcher(str);
            Matcher matcher2 = f20547e.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    p90.c("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            Objects.requireNonNull(strGroup);
            float f10 = Float.parseFloat(strGroup.trim());
            Objects.requireNonNull(strGroup2);
            return new PointF(f10, Float.parseFloat(strGroup2.trim()));
        }

        public static String c(String str) {
            return f20545c.matcher(str).replaceAll("");
        }
    }

    private f41(String str, int i10, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f20524a = str;
        this.f20525b = i10;
        this.f20526c = num;
        this.f20527d = num2;
        this.f20528e = f10;
        this.f20529f = z10;
        this.f20530g = z11;
        this.f20531h = z12;
        this.f20532i = z13;
        this.f20533j = i11;
    }

    public static int a(String str) {
        boolean z10;
        try {
            int i10 = Integer.parseInt(str.trim());
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z10 = true;
                    break;
                default:
                    z10 = false;
                    break;
            }
            if (z10) {
                return i10;
            }
        } catch (NumberFormatException unused) {
        }
        li1.a("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0137, code lost:
    
        if ((r4 == 1 || r4 == 3) != false) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.yandex.mobile.ads.impl.f41 a(java.lang.String r20, com.yandex.mobile.ads.impl.f41.a r21) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.f41.a(java.lang.String, com.yandex.mobile.ads.impl.f41$a):com.yandex.mobile.ads.impl.f41");
    }

    private static boolean b(String str) {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e10) {
            p90.b("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }

    public static Integer c(String str) {
        try {
            long j10 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            pa.a(j10 <= 4294967295L);
            return Integer.valueOf(Color.argb(h70.a(((j10 >> 24) & 255) ^ 255), h70.a(j10 & 255), h70.a((j10 >> 8) & 255), h70.a((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            p90.b("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }
}
