package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.io.IOException;
import java.util.Objects;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
final class zj1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kc1 f27351b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk1 f27350a = new fk1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final xj1 f27352c = new xj1();

    public zj1(Context context) {
        this.f27351b = new kc1(context);
    }

    public final ac1 a(XmlPullParser xmlPullParser, ac1.a aVar) throws XmlPullParserException, JSONException, IOException {
        Objects.requireNonNull(this.f27350a);
        xmlPullParser.require(2, null, "Wrapper");
        Objects.requireNonNull(this.f27352c);
        aVar.a(new wj1(Boolean.parseBoolean(xmlPullParser.getAttributeValue(null, "allowMultipleAds")), Boolean.parseBoolean(xmlPullParser.getAttributeValue(null, "followAdditionalWrappers"))));
        while (true) {
            Objects.requireNonNull(this.f27350a);
            if (!(xmlPullParser.next() != 3)) {
                return aVar.a();
            }
            Objects.requireNonNull(this.f27350a);
            if (xmlPullParser.getEventType() == 2) {
                if ("VASTAdTagURI".equals(xmlPullParser.getName())) {
                    Objects.requireNonNull(this.f27350a);
                    aVar.f(fk1.c(xmlPullParser));
                } else {
                    this.f27351b.a(xmlPullParser, aVar);
                }
            }
        }
    }
}
