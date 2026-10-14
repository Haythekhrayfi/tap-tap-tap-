package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public final class pb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk1 f24037a = new fk1();

    public final String a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Objects.requireNonNull(this.f24037a);
        xmlPullParser.require(2, null, "VerificationParameters");
        Objects.requireNonNull(this.f24037a);
        String strC = fk1.c(xmlPullParser);
        if (TextUtils.isEmpty(strC)) {
            return null;
        }
        return strC;
    }
}
