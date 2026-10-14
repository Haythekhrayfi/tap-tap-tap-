package com.applovin.exoplayer2.i.e;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f6963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f6964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f6966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f6967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f6968h;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6969a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6970b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6971c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f6972d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f6973e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f6974f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f6975g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f6976h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f6977i;

        private a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            this.f6969a = i10;
            this.f6970b = i11;
            this.f6971c = i12;
            this.f6972d = i13;
            this.f6973e = i14;
            this.f6974f = i15;
            this.f6975g = i16;
            this.f6976h = i17;
            this.f6977i = i18;
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
            for (int i18 = 0; i18 < strArrSplit.length; i18++) {
                String lowerCase = Ascii.toLowerCase(strArrSplit[i18].trim());
                Objects.requireNonNull(lowerCase);
                switch (lowerCase) {
                    case "italic":
                        i15 = i18;
                        break;
                    case "underline":
                        i16 = i18;
                        break;
                    case "strikeout":
                        i17 = i18;
                        break;
                    case "primarycolour":
                        i12 = i18;
                        break;
                    case "bold":
                        i14 = i18;
                        break;
                    case "name":
                        i10 = i18;
                        break;
                    case "fontsize":
                        i13 = i18;
                        break;
                    case "alignment":
                        i11 = i18;
                        break;
                }
            }
            if (i10 != -1) {
                return new a(i10, i11, i12, i13, i14, i15, i16, i17, strArrSplit.length);
            }
            return null;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Pattern f6978c = Pattern.compile("\\{([^}]*)\\}");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Pattern f6979d = Pattern.compile(ai.a("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Pattern f6980e = Pattern.compile(ai.a("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Pattern f6981f = Pattern.compile("\\\\an(\\d+)");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6982a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PointF f6983b;

        private b(int i10, PointF pointF) {
            this.f6982a = i10;
            this.f6983b = pointF;
        }

        public static b a(String str) {
            Matcher matcher = f6978c.matcher(str);
            PointF pointF = null;
            int i10 = -1;
            while (matcher.find()) {
                String str2 = (String) com.applovin.exoplayer2.l.a.b(matcher.group(1));
                try {
                    PointF pointFC = c(str2);
                    if (pointFC != null) {
                        pointF = pointFC;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int iD = d(str2);
                    if (iD != -1) {
                        i10 = iD;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i10, pointF);
        }

        public static String b(String str) {
            return f6978c.matcher(str).replaceAll("");
        }

        private static PointF c(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = f6979d.matcher(str);
            Matcher matcher2 = f6980e.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    q.b("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
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
            return new PointF(Float.parseFloat(((String) com.applovin.exoplayer2.l.a.b(strGroup)).trim()), Float.parseFloat(((String) com.applovin.exoplayer2.l.a.b(strGroup2)).trim()));
        }

        private static int d(String str) {
            Matcher matcher = f6981f.matcher(str);
            if (matcher.find()) {
                return c.c((String) com.applovin.exoplayer2.l.a.b(matcher.group(1)));
            }
            return -1;
        }
    }

    private c(String str, int i10, Integer num, float f10, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f6961a = str;
        this.f6962b = i10;
        this.f6963c = num;
        this.f6964d = f10;
        this.f6965e = z10;
        this.f6966f = z11;
        this.f6967g = z12;
        this.f6968h = z13;
    }

    public static c a(String str, a aVar) {
        com.applovin.exoplayer2.l.a.a(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i10 = aVar.f6977i;
        if (length != i10) {
            q.c("SsaStyle", ai.a("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i10), Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            String strTrim = strArrSplit[aVar.f6969a].trim();
            int i11 = aVar.f6970b;
            int iC = i11 != -1 ? c(strArrSplit[i11].trim()) : -1;
            int i12 = aVar.f6971c;
            Integer numA = i12 != -1 ? a(strArrSplit[i12].trim()) : null;
            int i13 = aVar.f6972d;
            float fD = i13 != -1 ? d(strArrSplit[i13].trim()) : -3.4028235E38f;
            int i14 = aVar.f6973e;
            boolean z10 = i14 != -1 && e(strArrSplit[i14].trim());
            int i15 = aVar.f6974f;
            boolean z11 = i15 != -1 && e(strArrSplit[i15].trim());
            int i16 = aVar.f6975g;
            boolean z12 = i16 != -1 && e(strArrSplit[i16].trim());
            int i17 = aVar.f6976h;
            return new c(strTrim, iC, numA, fD, z10, z11, z12, i17 != -1 && e(strArrSplit[i17].trim()));
        } catch (RuntimeException e10) {
            q.b("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e10);
            return null;
        }
    }

    public static Integer a(String str) {
        try {
            long j10 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            com.applovin.exoplayer2.l.a.a(j10 <= 4294967295L);
            return Integer.valueOf(Color.argb(com.applovin.exoplayer2.common.b.c.a(((j10 >> 24) & 255) ^ 255), com.applovin.exoplayer2.common.b.c.a(j10 & 255), com.applovin.exoplayer2.common.b.c.a((j10 >> 8) & 255), com.applovin.exoplayer2.common.b.c.a((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            q.b("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }

    private static boolean a(int i10) {
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
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(String str) {
        try {
            int i10 = Integer.parseInt(str.trim());
            if (a(i10)) {
                return i10;
            }
        } catch (NumberFormatException unused) {
        }
        q.c("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    private static float d(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e10) {
            q.b("SsaStyle", "Failed to parse font size: '" + str + "'", e10);
            return -3.4028235E38f;
        }
    }

    private static boolean e(String str) {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e10) {
            q.b("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }
}
