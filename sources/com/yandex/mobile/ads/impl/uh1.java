package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import android.util.Xml;
import com.yandex.mobile.ads.video.parser.vmap.configurator.AdBreakParameters;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public final class uh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s1 f25654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final tt f25655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fk1 f25656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b2 f25657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.yandex.mobile.ads.video.parser.vmap.configurator.a f25658e;

    public uh1() {
        fk1 fk1Var = new fk1();
        this.f25656c = fk1Var;
        tt ttVar = new tt(fk1Var);
        this.f25655b = ttVar;
        this.f25654a = new s1(fk1Var, ttVar);
        this.f25657d = new b2();
        this.f25658e = new com.yandex.mobile.ads.video.parser.vmap.configurator.a();
    }

    public final rh1 a(String str) throws XmlPullParserException, JSONException, IOException, th1 {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.nextTag();
        Objects.requireNonNull(this.f25656c);
        xmlPullParserNewPullParser.require(2, null, "VMAP");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "version");
        while (true) {
            Objects.requireNonNull(this.f25656c);
            if (!(xmlPullParserNewPullParser.next() != 3)) {
                break;
            }
            Objects.requireNonNull(this.f25656c);
            if (xmlPullParserNewPullParser.getEventType() == 2) {
                String name = xmlPullParserNewPullParser.getName();
                if ("AdBreak".equals(name)) {
                    q1 q1VarA = this.f25654a.a(xmlPullParserNewPullParser);
                    if (q1VarA != null) {
                        arrayList.add(q1VarA);
                    }
                } else if ("Extensions".equals(name)) {
                    arrayList2.addAll(this.f25655b.a(xmlPullParserNewPullParser));
                } else {
                    Objects.requireNonNull(this.f25656c);
                    fk1.d(xmlPullParserNewPullParser);
                }
            }
        }
        if (TextUtils.isEmpty(attributeValue)) {
            throw new th1();
        }
        Objects.requireNonNull(this.f25658e);
        AdBreakParameters adBreakParametersA = com.yandex.mobile.ads.video.parser.vmap.configurator.a.a(arrayList2);
        Objects.requireNonNull(this.f25657d);
        b2.a(arrayList, adBreakParametersA);
        return sh1.a(arrayList);
    }
}
