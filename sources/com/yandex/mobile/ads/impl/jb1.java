package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.Xml;
import java.io.IOException;
import java.io.StringReader;
import java.util.Objects;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public final class jb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk1 f22009a = new fk1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ra1 f22010b;

    public jb1(Context context) {
        this.f22010b = new ra1(context);
    }

    public final na1 a(String str) throws XmlPullParserException, JSONException, IOException {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.nextTag();
        Objects.requireNonNull(this.f22009a);
        xmlPullParserNewPullParser.require(2, null, "VAST");
        return this.f22010b.a(xmlPullParserNewPullParser);
    }
}
