package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
final class ih1 implements ek1<hh1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk1 f21714a = new fk1();

    @Override // com.yandex.mobile.ads.impl.ek1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final hh1 a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Objects.requireNonNull(this.f21714a);
        xmlPullParser.require(2, null, "ViewableImpression");
        ArrayList arrayList = new ArrayList();
        while (true) {
            Objects.requireNonNull(this.f21714a);
            if (!(xmlPullParser.next() != 3)) {
                return new hh1(arrayList);
            }
            Objects.requireNonNull(this.f21714a);
            if (xmlPullParser.getEventType() == 2) {
                if ("Viewable".equals(xmlPullParser.getName())) {
                    Objects.requireNonNull(this.f21714a);
                    arrayList.add(fk1.c(xmlPullParser));
                } else {
                    Objects.requireNonNull(this.f21714a);
                    fk1.d(xmlPullParser);
                }
            }
        }
    }
}
