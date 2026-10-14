package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.yandex.mobile.ads.video.models.ad.JavaScriptResource;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public final class qb1 implements ek1<lb1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk1 f24422a = new fk1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l70 f24423b = new l70();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pb1 f24424c = new pb1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x71 f24425d = new x71();

    @Override // com.yandex.mobile.ads.impl.ek1
    public final lb1 a(XmlPullParser xmlPullParser) throws XmlPullParserException, JSONException, IOException {
        Objects.requireNonNull(this.f24422a);
        xmlPullParser.require(2, null, "Verification");
        Objects.requireNonNull(this.f24422a);
        String attributeValue = xmlPullParser.getAttributeValue(null, "vendor");
        HashMap map = new HashMap();
        JavaScriptResource javaScriptResourceA = null;
        String strA = null;
        while (true) {
            Objects.requireNonNull(this.f24422a);
            if (!(xmlPullParser.next() != 3)) {
                break;
            }
            Objects.requireNonNull(this.f24422a);
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("JavaScriptResource".equals(name)) {
                    javaScriptResourceA = this.f24423b.a(xmlPullParser);
                } else if ("VerificationParameters".equals(name)) {
                    strA = this.f24424c.a(xmlPullParser);
                } else if ("TrackingEvents".equals(name)) {
                    map = this.f24425d.a(xmlPullParser);
                } else {
                    Objects.requireNonNull(this.f24422a);
                    fk1.d(xmlPullParser);
                }
            }
        }
        if (TextUtils.isEmpty(attributeValue)) {
            return null;
        }
        return new lb1(attributeValue, javaScriptResourceA, strA, map);
    }
}
