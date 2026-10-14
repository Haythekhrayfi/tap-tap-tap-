package com.yandex.mobile.ads.impl;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.IOException;
import java.util.Objects;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
final class yb0 implements ek1<vb0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk1 f26763a = new fk1();

    @Override // com.yandex.mobile.ads.impl.ek1
    public final vb0 a(XmlPullParser xmlPullParser) throws XmlPullParserException, JSONException, IOException {
        Objects.requireNonNull(this.f26763a);
        xmlPullParser.require(2, null, "MediaFile");
        Objects.requireNonNull(this.f26763a);
        String attributeValue = xmlPullParser.getAttributeValue(null, "delivery");
        Objects.requireNonNull(this.f26763a);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "type");
        Objects.requireNonNull(this.f26763a);
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "height");
        Objects.requireNonNull(this.f26763a);
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "width");
        Objects.requireNonNull(this.f26763a);
        String attributeValue5 = xmlPullParser.getAttributeValue(null, "bitrate");
        Objects.requireNonNull(this.f26763a);
        String attributeValue6 = xmlPullParser.getAttributeValue(null, FacebookMediationAdapter.KEY_ID);
        Objects.requireNonNull(this.f26763a);
        String attributeValue7 = xmlPullParser.getAttributeValue(null, "codec");
        Objects.requireNonNull(this.f26763a);
        String attributeValue8 = xmlPullParser.getAttributeValue(null, "vmaf");
        Objects.requireNonNull(this.f26763a);
        String strC = fk1.c(xmlPullParser);
        vb0.a aVarH = new vb0.a().d(attributeValue6).b(attributeValue).c(attributeValue3).h(attributeValue4);
        try {
            aVarH.f25950i = Integer.valueOf(attributeValue5).intValue();
        } catch (Exception unused) {
        }
        return aVarH.e(attributeValue2).f(strC).a(attributeValue7).g(attributeValue8).a();
    }
}
