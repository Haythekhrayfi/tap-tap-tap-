package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
final class dr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk1 f19973a = new fk1();

    public final int a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Objects.requireNonNull(this.f19973a);
        xmlPullParser.require(2, null, "Duration");
        Objects.requireNonNull(this.f19973a);
        Long lA = ke1.a(fk1.c(xmlPullParser));
        if (lA != null) {
            return lA.intValue();
        }
        return 0;
    }
}
