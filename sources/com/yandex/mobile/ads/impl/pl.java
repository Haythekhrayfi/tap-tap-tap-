package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.Objects;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public final class pl<T> implements ek1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk1 f24078a = new fk1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ek1<T> f24079b;

    public pl(cu cuVar) {
        this.f24079b = cuVar;
    }

    @Override // com.yandex.mobile.ads.impl.ek1
    public final T a(XmlPullParser xmlPullParser) throws XmlPullParserException, JSONException, IOException {
        Objects.requireNonNull(this.f24078a);
        T tA = null;
        xmlPullParser.require(2, null, "CreativeExtension");
        while (true) {
            Objects.requireNonNull(this.f24078a);
            if (!(xmlPullParser.next() != 3)) {
                return tA;
            }
            Objects.requireNonNull(this.f24078a);
            if (xmlPullParser.getEventType() == 2) {
                tA = this.f24079b.a(xmlPullParser);
            }
        }
    }
}
