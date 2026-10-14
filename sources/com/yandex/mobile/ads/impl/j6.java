package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
final class j6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk1 f21951a;

    public j6(fk1 fk1Var) {
        this.f21951a = fk1Var;
    }

    public final i6 a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Objects.requireNonNull(this.f21951a);
        xmlPullParser.require(2, null, "AdTagURI");
        xmlPullParser.getAttributeValue(null, "templateType");
        Objects.requireNonNull(this.f21951a);
        String strC = fk1.c(xmlPullParser);
        if (TextUtils.isEmpty(strC)) {
            return null;
        }
        return sh1.a(strC);
    }
}
