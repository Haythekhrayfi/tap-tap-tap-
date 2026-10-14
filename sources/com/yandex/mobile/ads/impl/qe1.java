package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
final class qe1 implements ek1<pe1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk1 f24465a = new fk1();

    @Override // com.yandex.mobile.ads.impl.ek1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final pe1 a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Objects.requireNonNull(this.f24465a);
        String str = null;
        xmlPullParser.require(2, null, "VideoClicks");
        ArrayList arrayList = new ArrayList();
        while (true) {
            Objects.requireNonNull(this.f24465a);
            if (!(xmlPullParser.next() != 3)) {
                return new pe1(str, arrayList);
            }
            Objects.requireNonNull(this.f24465a);
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("ClickThrough".equals(name)) {
                    Objects.requireNonNull(this.f24465a);
                    String strC = fk1.c(xmlPullParser);
                    if (!TextUtils.isEmpty(strC)) {
                        str = strC;
                    }
                } else if ("ClickTracking".equals(name)) {
                    Objects.requireNonNull(this.f24465a);
                    String strC2 = fk1.c(xmlPullParser);
                    if (!TextUtils.isEmpty(strC2)) {
                        arrayList.add(strC2);
                    }
                } else {
                    Objects.requireNonNull(this.f24465a);
                    fk1.d(xmlPullParser);
                }
            }
        }
    }
}
