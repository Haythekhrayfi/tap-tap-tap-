package com.applovin.exoplayer2.i.g;

import android.text.Layout;
import androidx.activity.j;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.aj;
import com.applovin.exoplayer2.l.q;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes.dex */
public final class c extends com.applovin.exoplayer2.i.d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final XmlPullParserFactory f7009j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f7002c = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f7003d = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f7004e = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f7000a = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f7001b = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f7005f = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f7006g = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final b f7007h = new b(30.0f, 1, 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f7008i = new a(32, 15);

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7011b;

        public a(int i10, int i11) {
            this.f7010a = i10;
            this.f7011b = i11;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f7012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f7014c;

        public b(float f10, int i10, int i11) {
            this.f7012a = f10;
            this.f7013b = i10;
            this.f7014c = i11;
        }
    }

    /* JADX INFO: renamed from: com.applovin.exoplayer2.i.g.c$c, reason: collision with other inner class name */
    public static final class C0101c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7016b;

        public C0101c(int i10, int i11) {
            this.f7015a = i10;
            this.f7016b = i11;
        }
    }

    public c() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f7009j = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    private static long a(String str, b bVar) throws com.applovin.exoplayer2.i.h {
        double d10;
        double d11;
        Matcher matcher = f7002c.matcher(str);
        if (matcher.matches()) {
            double d12 = (Long.parseLong((String) com.applovin.exoplayer2.l.a.b(matcher.group(1))) * 3600) + (Long.parseLong((String) com.applovin.exoplayer2.l.a.b(matcher.group(2))) * 60) + Long.parseLong((String) com.applovin.exoplayer2.l.a.b(matcher.group(3)));
            String strGroup = matcher.group(4);
            double d13 = d12 + (strGroup != null ? Double.parseDouble(strGroup) : 0.0d);
            String strGroup2 = matcher.group(5);
            double d14 = d13 + (strGroup2 != null ? Long.parseLong(strGroup2) / bVar.f7012a : 0.0d);
            String strGroup3 = matcher.group(6);
            return (long) ((d14 + (strGroup3 != null ? (Long.parseLong(strGroup3) / ((double) bVar.f7013b)) / ((double) bVar.f7012a) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f7003d.matcher(str);
        if (!matcher2.matches()) {
            throw new com.applovin.exoplayer2.i.h(i.f.a("Malformed time expression: ", str));
        }
        double d15 = Double.parseDouble((String) com.applovin.exoplayer2.l.a.b(matcher2.group(1)));
        String str2 = (String) com.applovin.exoplayer2.l.a.b(matcher2.group(2));
        Objects.requireNonNull(str2);
        str2.hashCode();
        switch (str2) {
            case "f":
                d10 = bVar.f7012a;
                d15 /= d10;
                return (long) (d15 * 1000000.0d);
            case "h":
                d11 = 3600.0d;
                break;
            case "m":
                d11 = 60.0d;
                break;
            case "t":
                d10 = bVar.f7014c;
                d15 /= d10;
                return (long) (d15 * 1000000.0d);
            case "ms":
                d10 = 1000.0d;
                d15 /= d10;
                return (long) (d15 * 1000000.0d);
            default:
                return (long) (d15 * 1000000.0d);
        }
        d15 *= d11;
        return (long) (d15 * 1000000.0d);
    }

    private static a a(XmlPullParser xmlPullParser, a aVar) throws com.applovin.exoplayer2.i.h {
        StringBuilder sb2;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f7006g.matcher(attributeValue);
        if (matcher.matches()) {
            try {
                int i10 = Integer.parseInt((String) com.applovin.exoplayer2.l.a.b(matcher.group(1)));
                int i11 = Integer.parseInt((String) com.applovin.exoplayer2.l.a.b(matcher.group(2)));
                if (i10 != 0 && i11 != 0) {
                    return new a(i10, i11);
                }
                throw new com.applovin.exoplayer2.i.h("Invalid cell resolution " + i10 + " " + i11);
            } catch (NumberFormatException unused) {
                sb2 = new StringBuilder();
            }
        } else {
            sb2 = new StringBuilder();
        }
        sb2.append("Ignoring malformed cell resolution: ");
        sb2.append(attributeValue);
        q.c("TtmlDecoder", sb2.toString());
        return aVar;
    }

    private static b a(XmlPullParser xmlPullParser) throws com.applovin.exoplayer2.i.h {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f10 = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] strArrA = ai.a(attributeValue2, " ");
            if (strArrA.length != 2) {
                throw new com.applovin.exoplayer2.i.h("frameRateMultiplier doesn't have 2 parts");
            }
            f10 = Integer.parseInt(strArrA[0]) / Integer.parseInt(strArrA[1]);
        }
        b bVar = f7007h;
        int i11 = bVar.f7013b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i11 = Integer.parseInt(attributeValue3);
        }
        int i12 = bVar.f7014c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i12 = Integer.parseInt(attributeValue4);
        }
        return new b(i10 * f10, i11, i12);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:66:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:6:0x0038  */
    private static d a(XmlPullParser xmlPullParser, d dVar, Map<String, e> map, b bVar) throws com.applovin.exoplayer2.i.h {
        long j10;
        long j11;
        int attributeCount = xmlPullParser.getAttributeCount();
        g gVarA = a(xmlPullParser, (g) null);
        String strSubstring = null;
        String str = "";
        long jA = -9223372036854775807L;
        long jA2 = -9223372036854775807L;
        long jA3 = -9223372036854775807L;
        String[] strArr = null;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            Objects.requireNonNull(attributeName);
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    break;
                case "dur":
                    jA3 = a(attributeValue, bVar);
                    break;
                case "end":
                    jA2 = a(attributeValue, bVar);
                    break;
                case "begin":
                    jA = a(attributeValue, bVar);
                    break;
                case "style":
                    String[] strArrA = a(attributeValue);
                    if (strArrA.length > 0) {
                        strArr = strArrA;
                        break;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith("#")) {
                        strSubstring = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (dVar != null) {
            long j12 = dVar.f7020d;
            j10 = -9223372036854775807L;
            if (j12 != -9223372036854775807L) {
                if (jA != -9223372036854775807L) {
                    jA += j12;
                }
                if (jA2 != -9223372036854775807L) {
                    jA2 += j12;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        long j13 = jA;
        if (jA2 != j10) {
            j11 = jA2;
        } else if (jA3 != j10) {
            j11 = j13 + jA3;
        } else if (dVar != null) {
            long j14 = dVar.f7021e;
            if (j14 != j10) {
                j11 = j14;
            } else {
                j11 = jA2;
            }
        } else {
            j11 = jA2;
        }
        return d.a(xmlPullParser.getName(), j13, j11, gVarA, strArr, str, strSubstring, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0099  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:34:0x0113  */
    /* JADX WARN: Code duplicated, block: B:36:0x0122  */
    /* JADX WARN: Code duplicated, block: B:39:0x012b  */
    /* JADX WARN: Code duplicated, block: B:40:0x012f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0137  */
    /* JADX WARN: Code duplicated, block: B:44:0x014c  */
    /* JADX WARN: Code duplicated, block: B:47:0x015f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0168  */
    /* JADX WARN: Code duplicated, block: B:51:0x016a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0173  */
    /* JADX WARN: Code duplicated, block: B:55:0x0175  */
    /* JADX WARN: Code duplicated, block: B:58:0x017e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0183  */
    /* JADX WARN: Code duplicated, block: B:62:0x0185  */
    /* JADX WARN: Code duplicated, block: B:63:0x0187  */
    /* JADX WARN: Code duplicated, block: B:67:0x019a  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private static e a(XmlPullParser xmlPullParser, a aVar, C0101c c0101c) {
        String string;
        StringBuilder sb2;
        float f10;
        float f11;
        String str;
        String strC;
        Matcher matcher;
        Matcher matcher2;
        float f12;
        float f13;
        String strC2;
        int i10;
        float f14;
        String strC3;
        int i11;
        String lowerCase;
        String lowerCase2;
        String strC4 = aj.c(xmlPullParser, FacebookMediationAdapter.KEY_ID);
        if (strC4 == null) {
            return null;
        }
        String strC5 = aj.c(xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
        if (strC5 != null) {
            Pattern pattern = f7001b;
            Matcher matcher3 = pattern.matcher(strC5);
            Pattern pattern2 = f7005f;
            Matcher matcher4 = pattern2.matcher(strC5);
            String str2 = "Ignoring region with malformed origin: ";
            if (matcher3.matches()) {
                try {
                    float f15 = Float.parseFloat((String) com.applovin.exoplayer2.l.a.b(matcher3.group(1))) / 100.0f;
                    f10 = Float.parseFloat((String) com.applovin.exoplayer2.l.a.b(matcher3.group(2))) / 100.0f;
                    f11 = f15;
                    strC = aj.c(xmlPullParser, "extent");
                    if (strC != null) {
                        matcher = pattern.matcher(strC);
                        matcher2 = pattern2.matcher(strC);
                        str2 = "Ignoring region with malformed extent: ";
                        if (matcher.matches()) {
                            try {
                                f12 = Float.parseFloat((String) com.applovin.exoplayer2.l.a.b(matcher.group(1))) / 100.0f;
                                f13 = Float.parseFloat((String) com.applovin.exoplayer2.l.a.b(matcher.group(2))) / 100.0f;
                            } catch (NumberFormatException unused) {
                                sb2 = new StringBuilder();
                                sb2.append(str2);
                                sb2.append(strC5);
                                string = sb2.toString();
                                q.c("TtmlDecoder", string);
                                return null;
                            }
                        } else if (matcher2.matches()) {
                            sb2 = new StringBuilder();
                            str = "Ignoring region with unsupported extent: ";
                            sb2.append(str);
                            sb2.append(strC5);
                            string = sb2.toString();
                        } else if (c0101c == null) {
                            sb2 = new StringBuilder();
                            sb2.append("Ignoring region with missing tts:extent: ");
                            sb2.append(strC5);
                            string = sb2.toString();
                        } else {
                            try {
                                int i12 = Integer.parseInt((String) com.applovin.exoplayer2.l.a.b(matcher2.group(1)));
                                int i13 = Integer.parseInt((String) com.applovin.exoplayer2.l.a.b(matcher2.group(2)));
                                f12 = i12 / c0101c.f7015a;
                                f13 = i13 / c0101c.f7016b;
                            } catch (NumberFormatException unused2) {
                                sb2 = new StringBuilder();
                                sb2.append(str2);
                                sb2.append(strC5);
                                string = sb2.toString();
                                q.c("TtmlDecoder", string);
                                return null;
                            }
                        }
                        strC2 = aj.c(xmlPullParser, "displayAlign");
                        if (strC2 != null) {
                            lowerCase2 = Ascii.toLowerCase(strC2);
                            Objects.requireNonNull(lowerCase2);
                            if (!lowerCase2.equals("center")) {
                                f14 = (f13 / 2.0f) + f10;
                                i10 = 1;
                            } else if (lowerCase2.equals("after")) {
                                f14 = f10 + f13;
                                i10 = 2;
                            } else {
                                i10 = 0;
                                f14 = f10;
                            }
                        } else {
                            i10 = 0;
                            f14 = f10;
                        }
                        float f16 = 1.0f / aVar.f7011b;
                        strC3 = aj.c(xmlPullParser, "writingMode");
                        if (strC3 != null) {
                            lowerCase = Ascii.toLowerCase(strC3);
                            Objects.requireNonNull(lowerCase);
                            lowerCase.hashCode();
                            switch (lowerCase) {
                                case "tb":
                                case "tblr":
                                    i11 = 2;
                                    break;
                                case "tbrl":
                                    i11 = 1;
                                    break;
                                default:
                                    i11 = Integer.MIN_VALUE;
                                    break;
                            }
                        } else {
                            i11 = Integer.MIN_VALUE;
                        }
                        return new e(strC4, f11, f14, 0, i10, f12, f13, 1, f16, i11);
                    }
                    string = "Ignoring region without an extent";
                } catch (NumberFormatException unused3) {
                    sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(strC5);
                    string = sb2.toString();
                    q.c("TtmlDecoder", string);
                    return null;
                }
            } else {
                if (matcher4.matches()) {
                    if (c0101c == null) {
                        sb2 = new StringBuilder();
                    } else {
                        try {
                            int i14 = Integer.parseInt((String) com.applovin.exoplayer2.l.a.b(matcher4.group(1)));
                            int i15 = Integer.parseInt((String) com.applovin.exoplayer2.l.a.b(matcher4.group(2)));
                            f11 = i14 / c0101c.f7015a;
                            f10 = i15 / c0101c.f7016b;
                            strC = aj.c(xmlPullParser, "extent");
                            if (strC != null) {
                                matcher = pattern.matcher(strC);
                                matcher2 = pattern2.matcher(strC);
                                str2 = "Ignoring region with malformed extent: ";
                                if (matcher.matches()) {
                                    f12 = Float.parseFloat((String) com.applovin.exoplayer2.l.a.b(matcher.group(1))) / 100.0f;
                                    f13 = Float.parseFloat((String) com.applovin.exoplayer2.l.a.b(matcher.group(2))) / 100.0f;
                                } else if (matcher2.matches()) {
                                    sb2 = new StringBuilder();
                                    str = "Ignoring region with unsupported extent: ";
                                } else if (c0101c == null) {
                                    sb2 = new StringBuilder();
                                } else {
                                    int i16 = Integer.parseInt((String) com.applovin.exoplayer2.l.a.b(matcher2.group(1)));
                                    int i17 = Integer.parseInt((String) com.applovin.exoplayer2.l.a.b(matcher2.group(2)));
                                    f12 = i16 / c0101c.f7015a;
                                    f13 = i17 / c0101c.f7016b;
                                }
                                strC2 = aj.c(xmlPullParser, "displayAlign");
                                if (strC2 != null) {
                                    lowerCase2 = Ascii.toLowerCase(strC2);
                                    Objects.requireNonNull(lowerCase2);
                                    if (!lowerCase2.equals("center")) {
                                        f14 = (f13 / 2.0f) + f10;
                                        i10 = 1;
                                    } else if (lowerCase2.equals("after")) {
                                        i10 = 0;
                                        f14 = f10;
                                    } else {
                                        f14 = f10 + f13;
                                        i10 = 2;
                                    }
                                } else {
                                    i10 = 0;
                                    f14 = f10;
                                }
                                float f17 = 1.0f / aVar.f7011b;
                                strC3 = aj.c(xmlPullParser, "writingMode");
                                if (strC3 != null) {
                                    lowerCase = Ascii.toLowerCase(strC3);
                                    Objects.requireNonNull(lowerCase);
                                    lowerCase.hashCode();
                                    switch (lowerCase) {
                                        case 3694:
                                            if (lowerCase.equals("tb")) {
                                            }
                                            break;
                                        case 3553396:
                                            if (lowerCase.equals("tblr")) {
                                            }
                                            break;
                                        case 3553576:
                                            if (lowerCase.equals("tbrl")) {
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
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                                        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
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
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
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
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
                                        Method dump skipped, instruction units count: 478
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.g.c.a(org.xmlpull.v1.XmlPullParser, com.applovin.exoplayer2.i.g.c$a, com.applovin.exoplayer2.i.g.c$c):com.applovin.exoplayer2.i.g.e");
                                }

                                private static g a(g gVar) {
                                    return gVar == null ? new g() : gVar;
                                }

                                private static g a(XmlPullParser xmlPullParser, g gVar) {
                                    StringBuilder sb2;
                                    String str;
                                    int attributeCount = xmlPullParser.getAttributeCount();
                                    for (int i10 = 0; i10 < attributeCount; i10++) {
                                        String attributeValue = xmlPullParser.getAttributeValue(i10);
                                        String attributeName = xmlPullParser.getAttributeName(i10);
                                        Objects.requireNonNull(attributeName);
                                        switch (attributeName) {
                                            case "fontStyle":
                                                gVar = a(gVar).d("italic".equalsIgnoreCase(attributeValue));
                                                continue;
                                                break;
                                            case "fontFamily":
                                                gVar = a(gVar).a(attributeValue);
                                                continue;
                                                break;
                                            case "textAlign":
                                                gVar = a(gVar).a(b(attributeValue));
                                                continue;
                                                break;
                                            case "textDecoration":
                                                String lowerCase = Ascii.toLowerCase(attributeValue);
                                                Objects.requireNonNull(lowerCase);
                                                lowerCase.hashCode();
                                                switch (lowerCase) {
                                                    case "nounderline":
                                                        gVar = a(gVar).b(false);
                                                        break;
                                                    case "underline":
                                                        gVar = a(gVar).b(true);
                                                        break;
                                                    case "nolinethrough":
                                                        gVar = a(gVar).a(false);
                                                        break;
                                                    case "linethrough":
                                                        gVar = a(gVar).a(true);
                                                        continue;
                                                        break;
                                                }
                                                break;
                                            case "fontWeight":
                                                gVar = a(gVar).c("bold".equalsIgnoreCase(attributeValue));
                                                continue;
                                                break;
                                            case "id":
                                                if ("style".equals(xmlPullParser.getName())) {
                                                    gVar = a(gVar).b(attributeValue);
                                                } else {
                                                    continue;
                                                }
                                                break;
                                            case "ruby":
                                                String lowerCase2 = Ascii.toLowerCase(attributeValue);
                                                Objects.requireNonNull(lowerCase2);
                                                lowerCase2.hashCode();
                                                switch (lowerCase2) {
                                                    case "baseContainer":
                                                    case "base":
                                                        gVar = a(gVar).c(2);
                                                        break;
                                                    case "container":
                                                        gVar = a(gVar).c(1);
                                                        break;
                                                    case "delimiter":
                                                        gVar = a(gVar).c(4);
                                                        break;
                                                    case "textContainer":
                                                    case "text":
                                                        gVar = a(gVar).c(3);
                                                        continue;
                                                        break;
                                                }
                                                break;
                                            case "color":
                                                gVar = a(gVar);
                                                try {
                                                    gVar.a(com.applovin.exoplayer2.l.f.a(attributeValue));
                                                    continue;
                                                } catch (IllegalArgumentException unused) {
                                                    sb2 = new StringBuilder();
                                                    str = "Failed parsing color value: ";
                                                    sb2.append(str);
                                                    sb2.append(attributeValue);
                                                    q.c("TtmlDecoder", sb2.toString());
                                                }
                                                break;
                                            case "shear":
                                                gVar = a(gVar).a(d(attributeValue));
                                                continue;
                                                break;
                                            case "textCombine":
                                                String lowerCase3 = Ascii.toLowerCase(attributeValue);
                                                Objects.requireNonNull(lowerCase3);
                                                if (lowerCase3.equals("all")) {
                                                    gVar = a(gVar).e(true);
                                                } else if (lowerCase3.equals("none")) {
                                                    gVar = a(gVar).e(false);
                                                    continue;
                                                }
                                                break;
                                            case "fontSize":
                                                try {
                                                    gVar = a(gVar);
                                                    a(attributeValue, gVar);
                                                    continue;
                                                } catch (com.applovin.exoplayer2.i.h unused2) {
                                                    sb2 = new StringBuilder();
                                                    str = "Failed parsing fontSize value: ";
                                                    sb2.append(str);
                                                    sb2.append(attributeValue);
                                                    q.c("TtmlDecoder", sb2.toString());
                                                }
                                                break;
                                            case "textEmphasis":
                                                gVar = a(gVar).a(com.applovin.exoplayer2.i.g.b.a(attributeValue));
                                                continue;
                                                break;
                                            case "rubyPosition":
                                                String lowerCase4 = Ascii.toLowerCase(attributeValue);
                                                Objects.requireNonNull(lowerCase4);
                                                if (lowerCase4.equals("before")) {
                                                    gVar = a(gVar).d(1);
                                                } else if (lowerCase4.equals("after")) {
                                                    gVar = a(gVar).d(2);
                                                    continue;
                                                }
                                                break;
                                            case "backgroundColor":
                                                gVar = a(gVar);
                                                try {
                                                    gVar.b(com.applovin.exoplayer2.l.f.a(attributeValue));
                                                    continue;
                                                } catch (IllegalArgumentException unused3) {
                                                    sb2 = new StringBuilder();
                                                    str = "Failed parsing background value: ";
                                                    sb2.append(str);
                                                    sb2.append(attributeValue);
                                                    q.c("TtmlDecoder", sb2.toString());
                                                }
                                                break;
                                            case "multiRowAlign":
                                                gVar = a(gVar).b(b(attributeValue));
                                                continue;
                                                break;
                                            default:
                                                continue;
                                                break;
                                        }
                                        sb2.append(str);
                                        sb2.append(attributeValue);
                                        q.c("TtmlDecoder", sb2.toString());
                                    }
                                    return gVar;
                                }

                                private static Map<String, g> a(XmlPullParser xmlPullParser, Map<String, g> map, a aVar, C0101c c0101c, Map<String, e> map2, Map<String, String> map3) throws XmlPullParserException, IOException {
                                    do {
                                        xmlPullParser.next();
                                        if (aj.b(xmlPullParser, "style")) {
                                            String strC = aj.c(xmlPullParser, "style");
                                            g gVarA = a(xmlPullParser, new g());
                                            if (strC != null) {
                                                for (String str : a(strC)) {
                                                    gVarA.a(map.get(str));
                                                }
                                            }
                                            String strJ = gVarA.j();
                                            if (strJ != null) {
                                                map.put(strJ, gVarA);
                                            }
                                        } else if (aj.b(xmlPullParser, "region")) {
                                            e eVarA = a(xmlPullParser, aVar, c0101c);
                                            if (eVarA != null) {
                                                map2.put(eVarA.f7030a, eVarA);
                                            }
                                        } else if (aj.b(xmlPullParser, "metadata")) {
                                            a(xmlPullParser, map3);
                                        }
                                    } while (!aj.a(xmlPullParser, "head"));
                                    return map;
                                }

                                private static void a(String str, g gVar) throws com.applovin.exoplayer2.i.h {
                                    Matcher matcher;
                                    String[] strArrA = ai.a(str, "\\s+");
                                    if (strArrA.length == 1) {
                                        matcher = f7004e.matcher(str);
                                    } else {
                                        if (strArrA.length != 2) {
                                            throw new com.applovin.exoplayer2.i.h(android.support.v4.media.b.a(defpackage.a.a("Invalid number of entries for fontSize: "), strArrA.length, "."));
                                        }
                                        matcher = f7004e.matcher(strArrA[1]);
                                        q.c("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                                    }
                                    if (!matcher.matches()) {
                                        throw new com.applovin.exoplayer2.i.h(j.a("Invalid expression for fontSize: '", str, "'."));
                                    }
                                    String str2 = (String) com.applovin.exoplayer2.l.a.b(matcher.group(3));
                                    Objects.requireNonNull(str2);
                                    str2.hashCode();
                                    switch (str2) {
                                        case "%":
                                            gVar.e(3);
                                            break;
                                        case "em":
                                            gVar.e(2);
                                            break;
                                        case "px":
                                            gVar.e(1);
                                            break;
                                        default:
                                            throw new com.applovin.exoplayer2.i.h(j.a("Invalid unit for fontSize: '", str2, "'."));
                                    }
                                    gVar.b(Float.parseFloat((String) com.applovin.exoplayer2.l.a.b(matcher.group(1))));
                                }

                                private static void a(XmlPullParser xmlPullParser, Map<String, String> map) throws XmlPullParserException, IOException {
                                    String strC;
                                    do {
                                        xmlPullParser.next();
                                        if (aj.b(xmlPullParser, "image") && (strC = aj.c(xmlPullParser, FacebookMediationAdapter.KEY_ID)) != null) {
                                            map.put(strC, xmlPullParser.nextText());
                                        }
                                    } while (!aj.a(xmlPullParser, "metadata"));
                                }

                                private static String[] a(String str) {
                                    String strTrim = str.trim();
                                    return strTrim.isEmpty() ? new String[0] : ai.a(strTrim, "\\s+");
                                }

                                private static Layout.Alignment b(String str) {
                                    String lowerCase = Ascii.toLowerCase(str);
                                    Objects.requireNonNull(lowerCase);
                                    switch (lowerCase) {
                                        case "center":
                                            return Layout.Alignment.ALIGN_CENTER;
                                        case "end":
                                        case "right":
                                            return Layout.Alignment.ALIGN_OPPOSITE;
                                        case "left":
                                        case "start":
                                            return Layout.Alignment.ALIGN_NORMAL;
                                        default:
                                            return null;
                                    }
                                }

                                private static C0101c b(XmlPullParser xmlPullParser) {
                                    StringBuilder sb2;
                                    String str;
                                    String strC = aj.c(xmlPullParser, "extent");
                                    if (strC == null) {
                                        return null;
                                    }
                                    Matcher matcher = f7005f.matcher(strC);
                                    if (matcher.matches()) {
                                        try {
                                            return new C0101c(Integer.parseInt((String) com.applovin.exoplayer2.l.a.b(matcher.group(1))), Integer.parseInt((String) com.applovin.exoplayer2.l.a.b(matcher.group(2))));
                                        } catch (NumberFormatException unused) {
                                            sb2 = new StringBuilder();
                                            str = "Ignoring malformed tts extent: ";
                                        }
                                    } else {
                                        sb2 = new StringBuilder();
                                        str = "Ignoring non-pixel tts extent: ";
                                    }
                                    sb2.append(str);
                                    sb2.append(strC);
                                    q.c("TtmlDecoder", sb2.toString());
                                    return null;
                                }

                                private static boolean c(String str) {
                                    return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
                                }

                                private static float d(String str) {
                                    Matcher matcher = f7000a.matcher(str);
                                    if (!matcher.matches()) {
                                        q.c("TtmlDecoder", "Invalid value for shear: " + str);
                                        return Float.MAX_VALUE;
                                    }
                                    try {
                                        return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) com.applovin.exoplayer2.l.a.b(matcher.group(1)))));
                                    } catch (NumberFormatException e10) {
                                        q.b("TtmlDecoder", "Failed to parse shear: " + str, e10);
                                        return Float.MAX_VALUE;
                                    }
                                }

                                @Override // com.applovin.exoplayer2.i.d
                                public com.applovin.exoplayer2.i.f a(byte[] bArr, int i10, boolean z10) throws com.applovin.exoplayer2.i.h {
                                    b bVar;
                                    try {
                                        XmlPullParser xmlPullParserNewPullParser = this.f7009j.newPullParser();
                                        HashMap map = new HashMap();
                                        HashMap map2 = new HashMap();
                                        HashMap map3 = new HashMap();
                                        map2.put("", new e(""));
                                        C0101c c0101cB = null;
                                        xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), null);
                                        ArrayDeque arrayDeque = new ArrayDeque();
                                        b bVarA = f7007h;
                                        a aVarA = f7008i;
                                        int i11 = 0;
                                        h hVar = null;
                                        for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                                            d dVar = (d) arrayDeque.peek();
                                            if (i11 == 0) {
                                                String name = xmlPullParserNewPullParser.getName();
                                                if (eventType == 2) {
                                                    if ("tt".equals(name)) {
                                                        bVarA = a(xmlPullParserNewPullParser);
                                                        aVarA = a(xmlPullParserNewPullParser, f7008i);
                                                        c0101cB = b(xmlPullParserNewPullParser);
                                                    }
                                                    C0101c c0101c = c0101cB;
                                                    b bVar2 = bVarA;
                                                    a aVar = aVarA;
                                                    if (c(name)) {
                                                        if ("head".equals(name)) {
                                                            bVar = bVar2;
                                                            a(xmlPullParserNewPullParser, map, aVar, c0101c, map2, map3);
                                                        } else {
                                                            bVar = bVar2;
                                                            try {
                                                                d dVarA = a(xmlPullParserNewPullParser, dVar, map2, bVar);
                                                                arrayDeque.push(dVarA);
                                                                if (dVar != null) {
                                                                    dVar.a(dVarA);
                                                                }
                                                            } catch (com.applovin.exoplayer2.i.h e10) {
                                                                q.b("TtmlDecoder", "Suppressing parser error", e10);
                                                                i11++;
                                                            }
                                                        }
                                                        bVarA = bVar;
                                                    } else {
                                                        q.b("TtmlDecoder", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                                                        i11++;
                                                        bVarA = bVar2;
                                                    }
                                                    c0101cB = c0101c;
                                                    aVarA = aVar;
                                                } else if (eventType == 4) {
                                                    ((d) com.applovin.exoplayer2.l.a.b(dVar)).a(d.a(xmlPullParserNewPullParser.getText()));
                                                } else if (eventType == 3) {
                                                    if (xmlPullParserNewPullParser.getName().equals("tt")) {
                                                        hVar = new h((d) com.applovin.exoplayer2.l.a.b((d) arrayDeque.peek()), map, map2, map3);
                                                    }
                                                    arrayDeque.pop();
                                                }
                                            } else if (eventType == 2) {
                                                i11++;
                                            } else if (eventType == 3) {
                                                i11--;
                                            }
                                            xmlPullParserNewPullParser.next();
                                        }
                                        if (hVar != null) {
                                            return hVar;
                                        }
                                        throw new com.applovin.exoplayer2.i.h("No TTML subtitles found");
                                    } catch (IOException e11) {
                                        throw new IllegalStateException("Unexpected error when reading input.", e11);
                                    } catch (XmlPullParserException e12) {
                                        throw new com.applovin.exoplayer2.i.h("Unable to decode source", e12);
                                    }
                                }
                            }
