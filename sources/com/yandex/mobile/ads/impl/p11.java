package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public final class p11 implements ek1<pt> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk1 f23953a;

    public p11(fk1 fk1Var) {
        this.f23953a = fk1Var;
    }

    @Override // com.yandex.mobile.ads.impl.ek1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final pt a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Objects.requireNonNull(this.f23953a);
        xmlPullParser.require(2, null, "Extension");
        String attributeValue = xmlPullParser.getAttributeValue(null, "type");
        Objects.requireNonNull(this.f23953a);
        String strC = fk1.c(xmlPullParser);
        if (TextUtils.isEmpty(attributeValue) || TextUtils.isEmpty(strC)) {
            return null;
        }
        return sj.a(attributeValue, strC);
    }
}
