package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public final class w71 implements ek1<u71> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk1 f26201a = new fk1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.yandex.mobile.ads.video.parser.offset.a f26202b = new com.yandex.mobile.ads.video.parser.offset.a(new HashSet(Arrays.asList(q61.values())));

    @Override // com.yandex.mobile.ads.impl.ek1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final u71 a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Objects.requireNonNull(this.f26201a);
        xmlPullParser.require(2, null, "Tracking");
        String attributeValue = xmlPullParser.getAttributeValue(null, "event");
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "offset");
        Objects.requireNonNull(this.f26201a);
        String strC = fk1.c(xmlPullParser);
        boolean z10 = !TextUtils.isEmpty(attributeValue);
        boolean z11 = !TextUtils.isEmpty(strC);
        if (z10 && z11) {
            return new u71(attributeValue, strC, attributeValue2 != null ? this.f26202b.a(attributeValue2) : null);
        }
        return null;
    }
}
