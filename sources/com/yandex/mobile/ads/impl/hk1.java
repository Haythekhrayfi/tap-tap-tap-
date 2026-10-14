package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes3.dex */
final class hk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f21449a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f21450b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f21451c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    private static com.yandex.mobile.ads.embedded.guava.collect.p<lf0.a> a(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        int i10 = com.yandex.mobile.ads.embedded.guava.collect.p.f18374c;
        com.yandex.mobile.ads.embedded.guava.collect.p.a aVar = new com.yandex.mobile.ads.embedded.guava.collect.p.a();
        String strA = fn1.a(str, ":Item");
        String strA2 = fn1.a(str, ":Directory");
        do {
            xmlPullParser.next();
            if (gk1.c(xmlPullParser, strA)) {
                String strA3 = fn1.a(str2, ":Mime");
                String strA4 = fn1.a(str2, ":Semantic");
                String strA5 = fn1.a(str2, ":Length");
                String strA6 = fn1.a(str2, ":Padding");
                String strA7 = gk1.a(xmlPullParser, strA3);
                String strA8 = gk1.a(xmlPullParser, strA4);
                String strA9 = gk1.a(xmlPullParser, strA5);
                String strA10 = gk1.a(xmlPullParser, strA6);
                if (strA7 == null || strA8 == null) {
                    return com.yandex.mobile.ads.embedded.guava.collect.p.i();
                }
                aVar.b(new lf0.a(strA7, strA9 != null ? Long.parseLong(strA9) : 0L, strA10 != null ? Long.parseLong(strA10) : 0L));
            }
        } while (!gk1.b(xmlPullParser, strA2));
        return aVar.a();
    }

    public static lf0 a(String str) throws IOException {
        try {
            return b(str);
        } catch (qp0 | NumberFormatException | XmlPullParserException unused) {
            p90.d("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static lf0 b(String str) throws XmlPullParserException, IOException {
        String str2;
        String str3;
        boolean z10;
        long j10;
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!gk1.c(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw qp0.a("Couldn't find xmp metadata", (Exception) null);
        }
        com.yandex.mobile.ads.embedded.guava.collect.p<lf0.a> pVarI = com.yandex.mobile.ads.embedded.guava.collect.p.i();
        long j11 = -9223372036854775807L;
        do {
            xmlPullParserNewPullParser.next();
            if (gk1.c(xmlPullParserNewPullParser, "rdf:Description")) {
                String[] strArr = f21449a;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    z10 = true;
                    if (i11 < 4) {
                        String strA = gk1.a(xmlPullParserNewPullParser, strArr[i11]);
                        if (strA != null) {
                            if (Integer.parseInt(strA) == 1) {
                                break;
                            }
                            break;
                        }
                        i11++;
                    }
                    z10 = false;
                    break;
                }
                if (!z10) {
                    return null;
                }
                String[] strArr2 = f21450b;
                int i12 = 0;
                while (true) {
                    if (i12 < 4) {
                        String strA2 = gk1.a(xmlPullParserNewPullParser, strArr2[i12]);
                        if (strA2 != null) {
                            j10 = Long.parseLong(strA2);
                            if (j10 != -1) {
                                break;
                            }
                            break;
                        }
                        i12++;
                    }
                    j10 = -9223372036854775807L;
                    break;
                }
                String[] strArr3 = f21451c;
                while (true) {
                    if (i10 >= 2) {
                        pVarI = com.yandex.mobile.ads.embedded.guava.collect.p.i();
                        break;
                    }
                    String strA3 = gk1.a(xmlPullParserNewPullParser, strArr3[i10]);
                    if (strA3 != null) {
                        pVarI = com.yandex.mobile.ads.embedded.guava.collect.p.a(new lf0.a("image/jpeg", 0L, 0L), new lf0.a("video/mp4", Long.parseLong(strA3), 0L));
                        break;
                    }
                    i10++;
                }
                j11 = j10;
            } else {
                if (gk1.c(xmlPullParserNewPullParser, "Container:Directory")) {
                    str2 = "Container";
                    str3 = "Item";
                } else if (gk1.c(xmlPullParserNewPullParser, "GContainer:Directory")) {
                    str2 = "GContainer";
                    str3 = "GContainerItem";
                }
                pVarI = a(xmlPullParserNewPullParser, str2, str3);
            }
        } while (!gk1.b(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (pVarI.isEmpty()) {
            return null;
        }
        return new lf0(j11, pVarI);
    }
}
