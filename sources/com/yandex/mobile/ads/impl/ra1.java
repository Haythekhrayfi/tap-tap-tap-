package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
final class ra1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk1 f24651a = new fk1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ad1 f24652b;

    public ra1(Context context) {
        this.f24652b = new ad1(context);
    }

    public final na1 a(XmlPullParser xmlPullParser) throws XmlPullParserException, JSONException, IOException {
        Objects.requireNonNull(this.f24651a);
        String attributeValue = xmlPullParser.getAttributeValue(null, "version");
        ArrayList arrayList = new ArrayList();
        while (true) {
            Objects.requireNonNull(this.f24651a);
            if (!(xmlPullParser.next() != 3)) {
                break;
            }
            Objects.requireNonNull(this.f24651a);
            if (xmlPullParser.getEventType() == 2) {
                if ("Ad".equals(xmlPullParser.getName())) {
                    ac1 ac1VarA = this.f24652b.a(xmlPullParser);
                    if (ac1VarA != null) {
                        arrayList.add(ac1VarA);
                    }
                } else {
                    Objects.requireNonNull(this.f24651a);
                    fk1.d(xmlPullParser);
                }
            }
        }
        if (TextUtils.isEmpty(attributeValue)) {
            return null;
        }
        return new na1(attributeValue, arrayList);
    }
}
