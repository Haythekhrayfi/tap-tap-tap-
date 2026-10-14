package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.yandex.mobile.ads.video.models.ad.JavaScriptResource;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public final class l70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk1 f22640a = new fk1();

    public final JavaScriptResource a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Objects.requireNonNull(this.f22640a);
        xmlPullParser.require(2, null, "JavaScriptResource");
        Objects.requireNonNull(this.f22640a);
        String attributeValue = xmlPullParser.getAttributeValue(null, "apiFramework");
        Objects.requireNonNull(this.f22640a);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "browserOptional");
        Boolean boolValueOf = attributeValue2 != null ? Boolean.valueOf(Boolean.parseBoolean(attributeValue2)) : null;
        Objects.requireNonNull(this.f22640a);
        String strC = fk1.c(xmlPullParser);
        if (TextUtils.isEmpty(attributeValue) || boolValueOf == null || TextUtils.isEmpty(strC)) {
            return null;
        }
        return new JavaScriptResource(attributeValue, strC, boolValueOf.booleanValue());
    }
}
