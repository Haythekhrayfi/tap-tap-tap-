package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
final class l80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk1 f22641a = new fk1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k21 f22644d = new k21();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final dk1<j10> f22646f = new dk1<>(new k10(), "Icons", "Icon");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dk1<vb0> f22645e = new dk1<>(new yb0(), "MediaFiles", "MediaFile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final dk1<u71> f22647g = new dk1<>(new w71(), "TrackingEvents", "Tracking");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qe1 f22642b = new qe1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dr f22643c = new dr();

    public final void a(XmlPullParser xmlPullParser, nl.a aVar) throws XmlPullParserException, JSONException, IOException {
        Objects.requireNonNull(this.f22641a);
        xmlPullParser.require(2, null, "Linear");
        Objects.requireNonNull(this.f22644d);
        String attributeValue = xmlPullParser.getAttributeValue(null, "skipoffset");
        aVar.a(!TextUtils.isEmpty(attributeValue) ? new j21.a(attributeValue).a() : null);
        while (true) {
            Objects.requireNonNull(this.f22641a);
            if (!(xmlPullParser.next() != 3)) {
                return;
            }
            Objects.requireNonNull(this.f22641a);
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("Duration".equals(name)) {
                    aVar.a(this.f22643c.a(xmlPullParser));
                } else if ("TrackingEvents".equals(name)) {
                    Iterator it = this.f22647g.a(xmlPullParser).iterator();
                    while (it.hasNext()) {
                        aVar.a((u71) it.next());
                    }
                } else if ("MediaFiles".equals(name)) {
                    aVar.b(this.f22645e.a(xmlPullParser));
                } else if ("VideoClicks".equals(name)) {
                    pe1 pe1VarA = this.f22642b.a(xmlPullParser);
                    aVar.a(pe1VarA.a());
                    Iterator<String> it2 = pe1VarA.b().iterator();
                    while (it2.hasNext()) {
                        aVar.a(new u71("clickTracking", it2.next(), null));
                    }
                } else if ("Icons".equals(name)) {
                    aVar.a((List) this.f22646f.a(xmlPullParser));
                } else {
                    Objects.requireNonNull(this.f22641a);
                    fk1.d(xmlPullParser);
                }
            }
        }
    }
}
