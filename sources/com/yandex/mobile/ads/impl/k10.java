package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
final class k10 implements ek1<j10> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk1 f22222a = new fk1();

    @Override // com.yandex.mobile.ads.impl.ek1
    public final j10 a(XmlPullParser xmlPullParser) throws XmlPullParserException, JSONException, IOException {
        Objects.requireNonNull(this.f22222a);
        int i10 = 2;
        xmlPullParser.require(2, null, "Icon");
        j10.a aVar = new j10.a();
        Objects.requireNonNull(this.f22222a);
        String attributeValue = xmlPullParser.getAttributeValue(null, "program");
        Objects.requireNonNull(this.f22222a);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "height");
        Objects.requireNonNull(this.f22222a);
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "width");
        Objects.requireNonNull(this.f22222a);
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "xPosition");
        Objects.requireNonNull(this.f22222a);
        String attributeValue5 = xmlPullParser.getAttributeValue(null, "yPosition");
        Objects.requireNonNull(this.f22222a);
        String attributeValue6 = xmlPullParser.getAttributeValue(null, "apiFramework");
        Objects.requireNonNull(this.f22222a);
        String attributeValue7 = xmlPullParser.getAttributeValue(null, "offset");
        Objects.requireNonNull(this.f22222a);
        String attributeValue8 = xmlPullParser.getAttributeValue(null, "duration");
        while (true) {
            Objects.requireNonNull(this.f22222a);
            boolean z10 = true;
            if (!(xmlPullParser.next() != 3)) {
                return aVar.f(attributeValue).c(attributeValue2).j(attributeValue3).d(attributeValue4).i(attributeValue5).a(attributeValue6).e(attributeValue7).b(attributeValue8).a();
            }
            Objects.requireNonNull(this.f22222a);
            if (xmlPullParser.getEventType() == i10) {
                String name = xmlPullParser.getName();
                Iterator it = Arrays.asList(j10.b.values()).iterator();
                do {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    }
                } while (!((j10.b) it.next()).f21908a.equals(name));
                Objects.requireNonNull(this.f22222a);
                if (z10) {
                    aVar.g(name).h(fk1.c(xmlPullParser));
                } else {
                    fk1.d(xmlPullParser);
                }
                i10 = 2;
            }
        }
    }
}
