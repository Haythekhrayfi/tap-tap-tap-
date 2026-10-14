package com.yandex.mobile.ads.impl;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
final class e6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk1 f20077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j6 f20078b;

    public e6(fk1 fk1Var) {
        this.f20077a = fk1Var;
        this.f20078b = new j6(fk1Var);
    }

    public final d6 a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Objects.requireNonNull(this.f20077a);
        d6 d6VarA = null;
        xmlPullParser.require(2, null, "AdSource");
        Objects.requireNonNull(this.f20077a);
        String attributeValue = xmlPullParser.getAttributeValue(null, "allowMultipleAds");
        if (attributeValue != null) {
            Boolean.parseBoolean(attributeValue);
        }
        Objects.requireNonNull(this.f20077a);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "followRedirects");
        if (attributeValue2 != null) {
            Boolean.parseBoolean(attributeValue2);
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, FacebookMediationAdapter.KEY_ID);
        while (true) {
            Objects.requireNonNull(this.f20077a);
            if (!(xmlPullParser.next() != 3)) {
                return d6VarA;
            }
            Objects.requireNonNull(this.f20077a);
            if (xmlPullParser.getEventType() == 2) {
                if ("AdTagURI".equals(xmlPullParser.getName())) {
                    i6 i6VarA = this.f20078b.a(xmlPullParser);
                    if (i6VarA != null) {
                        d6VarA = sh1.a(i6VarA, attributeValue3);
                    }
                } else {
                    Objects.requireNonNull(this.f20077a);
                    fk1.d(xmlPullParser);
                }
            }
        }
    }
}
