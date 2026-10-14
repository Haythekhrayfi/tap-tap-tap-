package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public final class oc1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List<String> f23774d = kc.l.c("ad_system", "social_ad_info", "yandex_ad_info");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk1 f23775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p11 f23776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dk1<u71> f23777c;

    public oc1() {
        fk1 fk1Var = new fk1();
        this.f23775a = fk1Var;
        this.f23776b = new p11(fk1Var);
        this.f23777c = a();
    }

    private static dk1 a() {
        return new dk1(new w71(), "Extension", "Tracking");
    }

    public final nc1 a(XmlPullParser xmlPullParser) throws XmlPullParserException, JSONException, IOException {
        fd.j0.i(xmlPullParser, "parser");
        Objects.requireNonNull(this.f23775a);
        fk1.a(xmlPullParser, "Extensions");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        nc1.a aVar = new nc1.a();
        while (true) {
            Objects.requireNonNull(this.f23775a);
            if (!fk1.a(xmlPullParser)) {
                aVar.a(arrayList2);
                aVar.b(arrayList);
                return aVar.a();
            }
            Objects.requireNonNull(this.f23775a);
            if (fk1.b(xmlPullParser)) {
                if (fd.j0.d("Extension", xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(null, "type");
                    if (f23774d.contains(attributeValue)) {
                        pt ptVarA = this.f23776b.a(xmlPullParser);
                        if (ptVarA != null) {
                            arrayList2.add(ptVarA);
                        }
                    } else if (fd.j0.d("yandex_tracking_events", attributeValue)) {
                        ArrayList arrayListA = this.f23777c.a(xmlPullParser);
                        fd.j0.h(arrayListA, "trackingEventsParser.parseElement(parser)");
                        arrayList.addAll(arrayListA);
                    }
                }
                Objects.requireNonNull(this.f23775a);
                fk1.d(xmlPullParser);
            }
        }
    }
}
