package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public final class x01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk1 f26404a = new fk1();

    public final Integer a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Integer numValueOf;
        Objects.requireNonNull(this.f26404a);
        xmlPullParser.require(2, null, "Ad");
        try {
            numValueOf = Integer.valueOf(xmlPullParser.getAttributeValue(null, "sequence"));
        } catch (NumberFormatException e10) {
            x60.a(e10, e10.toString(), new Object[0]);
            numValueOf = null;
        }
        if (numValueOf == null || numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        return null;
    }
}
