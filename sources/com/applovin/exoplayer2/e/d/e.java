package com.applovin.exoplayer2.e.d;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.l.aj;
import com.applovin.exoplayer2.l.q;
import i.f;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f5324a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f5325b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f5326c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    private static s<b.a> a(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        s.a aVarI = s.i();
        String strA = f.a(str, ":Item");
        String strA2 = f.a(str, ":Directory");
        do {
            xmlPullParser.next();
            if (aj.b(xmlPullParser, strA)) {
                String strA3 = f.a(str2, ":Mime");
                String strA4 = f.a(str2, ":Semantic");
                String strA5 = f.a(str2, ":Length");
                String strA6 = f.a(str2, ":Padding");
                String strC = aj.c(xmlPullParser, strA3);
                String strC2 = aj.c(xmlPullParser, strA4);
                String strC3 = aj.c(xmlPullParser, strA5);
                String strC4 = aj.c(xmlPullParser, strA6);
                if (strC == null || strC2 == null) {
                    return s.g();
                }
                aVarI.a(new b.a(strC, strC2, strC3 != null ? Long.parseLong(strC3) : 0L, strC4 != null ? Long.parseLong(strC4) : 0L));
            }
        } while (!aj.a(xmlPullParser, strA2));
        return aVarI.a();
    }

    public static b a(String str) throws IOException {
        try {
            return b(str);
        } catch (ai | NumberFormatException | XmlPullParserException unused) {
            q.c("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static boolean a(XmlPullParser xmlPullParser) {
        for (String str : f5324a) {
            String strC = aj.c(xmlPullParser, str);
            if (strC != null) {
                return Integer.parseInt(strC) == 1;
            }
        }
        return false;
    }

    private static long b(XmlPullParser xmlPullParser) {
        for (String str : f5325b) {
            String strC = aj.c(xmlPullParser, str);
            if (strC != null) {
                long j10 = Long.parseLong(strC);
                if (j10 == -1) {
                    return -9223372036854775807L;
                }
                return j10;
            }
        }
        return -9223372036854775807L;
    }

    private static b b(String str) throws XmlPullParserException, IOException {
        String str2;
        String str3;
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!aj.b(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw ai.b("Couldn't find xmp metadata", null);
        }
        long jB = -9223372036854775807L;
        s<b.a> sVarG = s.g();
        do {
            xmlPullParserNewPullParser.next();
            if (!aj.b(xmlPullParserNewPullParser, "rdf:Description")) {
                if (aj.b(xmlPullParserNewPullParser, "Container:Directory")) {
                    str2 = "Container";
                    str3 = "Item";
                } else if (aj.b(xmlPullParserNewPullParser, "GContainer:Directory")) {
                    str2 = "GContainer";
                    str3 = "GContainerItem";
                }
                sVarG = a(xmlPullParserNewPullParser, str2, str3);
            } else {
                if (!a(xmlPullParserNewPullParser)) {
                    return null;
                }
                jB = b(xmlPullParserNewPullParser);
                sVarG = c(xmlPullParserNewPullParser);
            }
        } while (!aj.a(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (sVarG.isEmpty()) {
            return null;
        }
        return new b(jB, sVarG);
    }

    private static s<b.a> c(XmlPullParser xmlPullParser) {
        for (String str : f5326c) {
            String strC = aj.c(xmlPullParser, str);
            if (strC != null) {
                return s.a(new b.a("image/jpeg", "Primary", 0L, 0L), new b.a("video/mp4", "MotionPhoto", Long.parseLong(strC), 0L));
            }
        }
        return s.g();
    }
}
