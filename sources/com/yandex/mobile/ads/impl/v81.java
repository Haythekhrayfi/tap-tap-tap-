package com.yandex.mobile.ads.impl;

import android.text.Layout;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class v81 extends t11 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Pattern f25903n = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Pattern f25904o = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Pattern f25905p = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f25906q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f25907r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Pattern f25908s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Pattern f25909t = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final b f25910u = new b(30.0f, 1, 1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final a f25911v = new a(15);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final XmlPullParserFactory f25912m;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f25913a;

        public a(int i10) {
            this.f25913a = i10;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f25914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f25915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f25916c;

        public b(float f10, int i10, int i11) {
            this.f25914a = f10;
            this.f25915b = i10;
            this.f25916c = i11;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f25917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f25918b;

        public c(int i10, int i11) {
            this.f25917a = i10;
            this.f25918b = i11;
        }
    }

    public v81() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f25912m = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    private static long a(String str, b bVar) throws j51 {
        double d10;
        double d11;
        Matcher matcher = f25903n.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            Objects.requireNonNull(strGroup);
            double d12 = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            Objects.requireNonNull(strGroup2);
            double d13 = d12 + (Long.parseLong(strGroup2) * 60);
            String strGroup3 = matcher.group(3);
            Objects.requireNonNull(strGroup3);
            double d14 = d13 + Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d15 = d14 + (strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d);
            String strGroup5 = matcher.group(5);
            double d16 = d15 + (strGroup5 != null ? Long.parseLong(strGroup5) / bVar.f25914a : 0.0d);
            String strGroup6 = matcher.group(6);
            return (long) ((d16 + (strGroup6 != null ? (Long.parseLong(strGroup6) / ((double) bVar.f25915b)) / ((double) bVar.f25914a) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f25904o.matcher(str);
        if (!matcher2.matches()) {
            throw new j51(fn1.a("Malformed time expression: ", str));
        }
        String strGroup7 = matcher2.group(1);
        Objects.requireNonNull(strGroup7);
        double d17 = Double.parseDouble(strGroup7);
        String strGroup8 = matcher2.group(2);
        Objects.requireNonNull(strGroup8);
        switch (strGroup8) {
            case "f":
                d10 = bVar.f25914a;
                d17 /= d10;
                return (long) (d17 * 1000000.0d);
            case "h":
                d11 = 3600.0d;
                break;
            case "m":
                d11 = 60.0d;
                break;
            case "t":
                d10 = bVar.f25916c;
                d17 /= d10;
                return (long) (d17 * 1000000.0d);
            case "ms":
                d10 = 1000.0d;
                d17 /= d10;
                return (long) (d17 * 1000000.0d);
            default:
                return (long) (d17 * 1000000.0d);
        }
        d17 *= d11;
        return (long) (d17 * 1000000.0d);
    }

    private static a a(XmlPullParser xmlPullParser, a aVar) throws j51 {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f25909t.matcher(attributeValue);
        if (!matcher.matches()) {
            li1.a("Ignoring malformed cell resolution: ", attributeValue, "TtmlDecoder");
            return aVar;
        }
        try {
            String strGroup = matcher.group(1);
            Objects.requireNonNull(strGroup);
            int i10 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            Objects.requireNonNull(strGroup2);
            int i11 = Integer.parseInt(strGroup2);
            if (i10 != 0 && i11 != 0) {
                return new a(i11);
            }
            throw new j51("Invalid cell resolution " + i10 + " " + i11);
        } catch (NumberFormatException unused) {
            li1.a("Ignoring malformed cell resolution: ", attributeValue, "TtmlDecoder");
            return aVar;
        }
    }

    private static b a(XmlPullParser xmlPullParser) throws j51 {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f10 = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i11 = da1.f19803a;
            String[] strArrSplit = attributeValue2.split(" ", -1);
            if (strArrSplit.length != 2) {
                throw new j51("frameRateMultiplier doesn't have 2 parts");
            }
            f10 = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
        }
        b bVar = f25910u;
        int i12 = bVar.f25915b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i12 = Integer.parseInt(attributeValue3);
        }
        int i13 = bVar.f25916c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i13 = Integer.parseInt(attributeValue4);
        }
        return new b(i10 * f10, i12, i13);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:6:0x0038  */
    /* JADX WARN: Code duplicated, block: B:70:0x00fd  */
    private static w81 a(XmlPullParser xmlPullParser, w81 w81Var, HashMap map, b bVar) throws j51 {
        long j10;
        long j11;
        String[] strArrSplit;
        int attributeCount = xmlPullParser.getAttributeCount();
        z81 z81VarA = a(xmlPullParser, (z81) null);
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
                    String strTrim = attributeValue.trim();
                    if (strTrim.isEmpty()) {
                        strArrSplit = new String[0];
                    } else {
                        int i11 = da1.f19803a;
                        strArrSplit = strTrim.split("\\s+", -1);
                    }
                    if (strArrSplit.length > 0) {
                        strArr = strArrSplit;
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
        if (w81Var != null) {
            long j12 = w81Var.f26210d;
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
        } else if (w81Var != null) {
            long j14 = w81Var.f26211e;
            if (j14 != j10) {
                j11 = j14;
            } else {
                j11 = jA2;
            }
        } else {
            j11 = jA2;
        }
        return w81.a(xmlPullParser.getName(), j13, j11, z81VarA, strArr, str, strSubstring, w81Var);
    }

    private static z81 a(z81 z81Var) {
        return z81Var == null ? new z81() : z81Var;
    }

    private static z81 a(XmlPullParser xmlPullParser, z81 z81Var) {
        String str;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            String attributeName = xmlPullParser.getAttributeName(i10);
            Objects.requireNonNull(attributeName);
            switch (attributeName) {
                case "fontStyle":
                    z81Var = a(z81Var).b("italic".equalsIgnoreCase(attributeValue));
                    continue;
                    break;
                case "fontFamily":
                    z81Var = a(z81Var).a(attributeValue);
                    continue;
                    break;
                case "textAlign":
                    z81Var = a(z81Var).b(b(attributeValue));
                    continue;
                    break;
                case "textDecoration":
                    String strB = na.b(attributeValue);
                    Objects.requireNonNull(strB);
                    switch (strB) {
                        case "nounderline":
                            z81Var = a(z81Var).e(false);
                            break;
                        case "underline":
                            z81Var = a(z81Var).e(true);
                            break;
                        case "nolinethrough":
                            z81Var = a(z81Var).c(false);
                            break;
                        case "linethrough":
                            z81Var = a(z81Var).c(true);
                            continue;
                            break;
                    }
                    break;
                case "fontWeight":
                    z81Var = a(z81Var).a("bold".equalsIgnoreCase(attributeValue));
                    continue;
                    break;
                case "id":
                    if ("style".equals(xmlPullParser.getName())) {
                        z81Var = a(z81Var).b(attributeValue);
                    } else {
                        continue;
                    }
                    break;
                case "ruby":
                    String strB2 = na.b(attributeValue);
                    Objects.requireNonNull(strB2);
                    switch (strB2) {
                        case "baseContainer":
                        case "base":
                            z81Var = a(z81Var).e(2);
                            break;
                        case "container":
                            z81Var = a(z81Var).e(1);
                            break;
                        case "delimiter":
                            z81Var = a(z81Var).e(4);
                            break;
                        case "textContainer":
                        case "text":
                            z81Var = a(z81Var).e(3);
                            continue;
                            break;
                    }
                    break;
                case "color":
                    z81Var = a(z81Var);
                    try {
                        z81Var.b(oj.b(attributeValue));
                        continue;
                    } catch (IllegalArgumentException unused) {
                        str = "Failed parsing color value: ";
                        li1.a(str, attributeValue, "TtmlDecoder");
                    }
                    break;
                case "shear":
                    z81 z81VarA = a(z81Var);
                    Matcher matcher = f25906q.matcher(attributeValue);
                    float fMin = Float.MAX_VALUE;
                    if (matcher.matches()) {
                        try {
                            String strGroup = matcher.group(1);
                            Objects.requireNonNull(strGroup);
                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup)));
                        } catch (NumberFormatException e10) {
                            p90.b("TtmlDecoder", "Failed to parse shear: " + attributeValue, e10);
                        }
                        break;
                    } else {
                        li1.a("Invalid value for shear: ", attributeValue, "TtmlDecoder");
                    }
                    z81Var = z81VarA.b(fMin);
                    continue;
                    break;
                case "textCombine":
                    String strB3 = na.b(attributeValue);
                    Objects.requireNonNull(strB3);
                    if (strB3.equals("all")) {
                        z81Var = a(z81Var).d(true);
                    } else if (strB3.equals("none")) {
                        z81Var = a(z81Var).d(false);
                        continue;
                    }
                    break;
                case "fontSize":
                    try {
                        z81Var = a(z81Var);
                        a(attributeValue, z81Var);
                        continue;
                    } catch (j51 unused2) {
                        str = "Failed parsing fontSize value: ";
                        li1.a(str, attributeValue, "TtmlDecoder");
                    }
                    break;
                case "textEmphasis":
                    z81Var = a(z81Var).a(h61.a(attributeValue));
                    continue;
                    break;
                case "rubyPosition":
                    String strB4 = na.b(attributeValue);
                    Objects.requireNonNull(strB4);
                    if (strB4.equals("before")) {
                        z81Var = a(z81Var).d(1);
                    } else if (strB4.equals("after")) {
                        z81Var = a(z81Var).d(2);
                        continue;
                    }
                    break;
                case "backgroundColor":
                    z81Var = a(z81Var);
                    try {
                        z81Var.a(oj.b(attributeValue));
                        continue;
                    } catch (IllegalArgumentException unused3) {
                        str = "Failed parsing background value: ";
                        li1.a(str, attributeValue, "TtmlDecoder");
                    }
                    break;
                case "multiRowAlign":
                    z81Var = a(z81Var).a(b(attributeValue));
                    continue;
                    break;
                default:
                    continue;
                    break;
            }
            li1.a(str, attributeValue, "TtmlDecoder");
        }
        return z81Var;
    }

    private static void a(String str, z81 z81Var) throws j51 {
        Matcher matcher;
        int i10 = da1.f19803a;
        String[] strArrSplit = str.split("\\s+", -1);
        if (strArrSplit.length == 1) {
            matcher = f25905p.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new j51(android.support.v4.media.b.a(v60.a("Invalid number of entries for fontSize: "), strArrSplit.length, "."));
            }
            matcher = f25905p.matcher(strArrSplit[1]);
            p90.d("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new j51(androidx.activity.j.a("Invalid expression for fontSize: '", str, "'."));
        }
        String strGroup = matcher.group(3);
        Objects.requireNonNull(strGroup);
        strGroup.hashCode();
        switch (strGroup) {
            case "%":
                z81Var.c(3);
                break;
            case "em":
                z81Var.c(2);
                break;
            case "px":
                z81Var.c(1);
                break;
            default:
                throw new j51(androidx.activity.j.a("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        Objects.requireNonNull(strGroup2);
        z81Var.a(Float.parseFloat(strGroup2));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:57:0x016b  */
    /* JADX WARN: Code duplicated, block: B:62:0x018d  */
    /* JADX WARN: Code duplicated, block: B:79:0x01bd  */
    private static void a(XmlPullParser xmlPullParser, HashMap map, a aVar, c cVar, HashMap map2, HashMap map3) throws XmlPullParserException, IOException {
        String strA;
        String str;
        float f10;
        float f11;
        String str2;
        float f12;
        float f13;
        int i10;
        int i11;
        x81 x81Var;
        String[] strArrSplit;
        do {
            xmlPullParser.next();
            if (gk1.c(xmlPullParser, "style")) {
                String strA2 = gk1.a(xmlPullParser, "style");
                z81 z81VarA = a(xmlPullParser, new z81());
                if (strA2 != null) {
                    String strTrim = strA2.trim();
                    if (strTrim.isEmpty()) {
                        strArrSplit = new String[0];
                    } else {
                        int i12 = da1.f19803a;
                        strArrSplit = strTrim.split("\\s+", -1);
                    }
                    for (String str3 : strArrSplit) {
                        z81VarA.a((z81) map.get(str3));
                    }
                }
                String strF = z81VarA.f();
                if (strF != null) {
                    map.put(strF, z81VarA);
                }
            } else if (gk1.c(xmlPullParser, "region")) {
                String strA3 = gk1.a(xmlPullParser, FacebookMediationAdapter.KEY_ID);
                if (strA3 != null) {
                    String strA4 = gk1.a(xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
                    if (strA4 != null) {
                        Pattern pattern = f25907r;
                        Matcher matcher = pattern.matcher(strA4);
                        Pattern pattern2 = f25908s;
                        Matcher matcher2 = pattern2.matcher(strA4);
                        if (matcher.matches()) {
                            try {
                                String strGroup = matcher.group(1);
                                Objects.requireNonNull(strGroup);
                                float f14 = Float.parseFloat(strGroup) / 100.0f;
                                String strGroup2 = matcher.group(2);
                                Objects.requireNonNull(strGroup2);
                                f10 = Float.parseFloat(strGroup2) / 100.0f;
                                f11 = f14;
                            } catch (NumberFormatException unused) {
                                li1.a("Ignoring region with malformed origin: ", strA4, "TtmlDecoder");
                            }
                        } else {
                            if (matcher2.matches()) {
                                if (cVar == null) {
                                    li1.a("Ignoring region with missing tts:extent: ", strA4, "TtmlDecoder");
                                } else {
                                    String strGroup3 = matcher2.group(1);
                                    Objects.requireNonNull(strGroup3);
                                    int i13 = Integer.parseInt(strGroup3);
                                    String strGroup4 = matcher2.group(2);
                                    Objects.requireNonNull(strGroup4);
                                    int i14 = Integer.parseInt(strGroup4);
                                    f11 = i13 / cVar.f25917a;
                                    f10 = i14 / cVar.f25918b;
                                }
                                x81Var = null;
                            } else {
                                str2 = "Ignoring region with unsupported origin: ";
                            }
                            li1.a(str2, strA4, "TtmlDecoder");
                            x81Var = null;
                        }
                        String strA5 = gk1.a(xmlPullParser, "extent");
                        if (strA5 != null) {
                            Matcher matcher3 = pattern.matcher(strA5);
                            Matcher matcher4 = pattern2.matcher(strA5);
                            if (matcher3.matches()) {
                                String strGroup5 = matcher3.group(1);
                                Objects.requireNonNull(strGroup5);
                                float f15 = Float.parseFloat(strGroup5) / 100.0f;
                                String strGroup6 = matcher3.group(2);
                                Objects.requireNonNull(strGroup6);
                                f13 = Float.parseFloat(strGroup6) / 100.0f;
                                f12 = f15;
                            } else if (matcher4.matches()) {
                                if (cVar != null) {
                                    String strGroup7 = matcher4.group(1);
                                    Objects.requireNonNull(strGroup7);
                                    int i15 = Integer.parseInt(strGroup7);
                                    String strGroup8 = matcher4.group(2);
                                    Objects.requireNonNull(strGroup8);
                                    float f16 = Integer.parseInt(strGroup8);
                                    f12 = i15 / cVar.f25917a;
                                    f13 = f16 / cVar.f25918b;
                                }
                                li1.a("Ignoring region with missing tts:extent: ", strA4, "TtmlDecoder");
                                x81Var = null;
                            } else {
                                str2 = "Ignoring region with unsupported extent: ";
                                li1.a(str2, strA4, "TtmlDecoder");
                                x81Var = null;
                            }
                            String strA6 = gk1.a(xmlPullParser, "displayAlign");
                            if (strA6 != null) {
                                String strB = na.b(strA6);
                                Objects.requireNonNull(strB);
                                if (strB.equals("center")) {
                                    f10 = (f13 / 2.0f) + f10;
                                    i10 = 1;
                                } else if (strB.equals("after")) {
                                    f10 += f13;
                                    i10 = 2;
                                } else {
                                    i10 = 0;
                                }
                            } else {
                                i10 = 0;
                            }
                            float f17 = 1.0f / aVar.f25913a;
                            String strA7 = gk1.a(xmlPullParser, "writingMode");
                            if (strA7 != null) {
                                String strB2 = na.b(strA7);
                                Objects.requireNonNull(strB2);
                                switch (strB2) {
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
                            x81Var = new x81(strA3, f11, f10, 0, i10, f12, f13, 1, f17, i11);
                        } else {
                            str = "Ignoring region without an extent";
                        }
                    } else {
                        str = "Ignoring region without an origin";
                    }
                    p90.d("TtmlDecoder", str);
                    x81Var = null;
                } else {
                    x81Var = null;
                }
                if (x81Var != null) {
                    map2.put(x81Var.f26463a, x81Var);
                }
            } else if (gk1.c(xmlPullParser, "metadata")) {
                do {
                    xmlPullParser.next();
                    if (gk1.c(xmlPullParser, "image") && (strA = gk1.a(xmlPullParser, FacebookMediationAdapter.KEY_ID)) != null) {
                        map3.put(strA, xmlPullParser.nextText());
                    }
                } while (!gk1.b(xmlPullParser, "metadata"));
            }
        } while (!gk1.b(xmlPullParser, "head"));
    }

    private static boolean a(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    private static Layout.Alignment b(String str) {
        String strB = na.b(str);
        Objects.requireNonNull(strB);
        switch (strB) {
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

    private static c b(XmlPullParser xmlPullParser) {
        String str;
        String strA = gk1.a(xmlPullParser, "extent");
        if (strA == null) {
            return null;
        }
        Matcher matcher = f25908s.matcher(strA);
        if (matcher.matches()) {
            try {
                String strGroup = matcher.group(1);
                Objects.requireNonNull(strGroup);
                int i10 = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(2);
                Objects.requireNonNull(strGroup2);
                return new c(i10, Integer.parseInt(strGroup2));
            } catch (NumberFormatException unused) {
                str = "Ignoring malformed tts extent: ";
            }
        } else {
            str = "Ignoring non-pixel tts extent: ";
        }
        li1.a(str, strA, "TtmlDecoder");
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.t11
    public final h51 a(byte[] bArr, int i10, boolean z10) throws j51 {
        b bVar;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f25912m.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new x81("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            c cVarB = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVarA = f25910u;
            a aVarA = f25911v;
            int i11 = 0;
            a91 a91Var = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                w81 w81Var = (w81) arrayDeque.peek();
                if (i11 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVarA = a(xmlPullParserNewPullParser);
                            aVarA = a(xmlPullParserNewPullParser, f25911v);
                            cVarB = b(xmlPullParserNewPullParser);
                        }
                        c cVar = cVarB;
                        b bVar2 = bVarA;
                        a aVar = aVarA;
                        if (a(name)) {
                            if ("head".equals(name)) {
                                bVar = bVar2;
                                a(xmlPullParserNewPullParser, map, aVar, cVar, map2, map3);
                            } else {
                                bVar = bVar2;
                                try {
                                    w81 w81VarA = a(xmlPullParserNewPullParser, w81Var, map2, bVar);
                                    arrayDeque.push(w81VarA);
                                    if (w81Var != null) {
                                        w81Var.a(w81VarA);
                                    }
                                } catch (j51 e10) {
                                    p90.b("TtmlDecoder", "Suppressing parser error", e10);
                                    bVarA = bVar;
                                    cVarB = cVar;
                                    aVarA = aVar;
                                    i11++;
                                }
                            }
                            bVarA = bVar;
                            cVarB = cVar;
                            aVarA = aVar;
                        } else {
                            p90.c("TtmlDecoder", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            bVar = bVar2;
                        }
                        bVarA = bVar;
                        cVarB = cVar;
                        aVarA = aVar;
                        i11++;
                    } else if (eventType == 4) {
                        Objects.requireNonNull(w81Var);
                        w81Var.a(w81.a(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            w81 w81Var2 = (w81) arrayDeque.peek();
                            Objects.requireNonNull(w81Var2);
                            a91Var = new a91(w81Var2, map, map2, map3);
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
            if (a91Var != null) {
                return a91Var;
            }
            throw new j51("No TTML subtitles found");
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new j51("Unable to decode source", e12);
        }
    }
}
