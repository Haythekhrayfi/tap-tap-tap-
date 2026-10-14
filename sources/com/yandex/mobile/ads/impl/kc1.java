package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.facebook.ads.AdSDKNotificationListener;
import java.io.IOException;
import java.util.Objects;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
final class kc1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dk1<nl> f22385b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk1 f22384a = new fk1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ih1 f22387d = new ih1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final oc1 f22388e = new oc1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dk1<lb1> f22386c = new dk1<>(new qb1(), "AdVerifications", "Verification");

    public kc1(Context context) {
        this.f22385b = new dk1<>(new ul(context), "Creatives", "Creative");
    }

    public final void a(XmlPullParser xmlPullParser, ac1.a aVar) throws XmlPullParserException, JSONException, IOException {
        String strC;
        String str;
        String name = xmlPullParser.getName();
        if ("Impression".equals(name)) {
            Objects.requireNonNull(this.f22384a);
            strC = fk1.c(xmlPullParser);
            str = AdSDKNotificationListener.IMPRESSION_EVENT;
        } else {
            if ("ViewableImpression".equals(name)) {
                aVar.a(this.f22387d.a(xmlPullParser));
                return;
            }
            if (!"Error".equals(name)) {
                if ("Survey".equals(name)) {
                    Objects.requireNonNull(this.f22384a);
                    aVar.e(fk1.c(xmlPullParser));
                    return;
                }
                if ("Description".equals(name)) {
                    Objects.requireNonNull(this.f22384a);
                    aVar.c(fk1.c(xmlPullParser));
                    return;
                }
                if ("AdTitle".equals(name)) {
                    Objects.requireNonNull(this.f22384a);
                    aVar.b(fk1.c(xmlPullParser));
                    return;
                }
                if ("AdSystem".equals(name)) {
                    Objects.requireNonNull(this.f22384a);
                    aVar.a(fk1.c(xmlPullParser));
                    return;
                }
                if ("Creatives".equals(name)) {
                    aVar.b(this.f22385b.a(xmlPullParser));
                    return;
                }
                if ("AdVerifications".equals(name)) {
                    aVar.a(this.f22386c.a(xmlPullParser));
                    return;
                } else if ("Extensions".equals(name)) {
                    aVar.a(this.f22388e.a(xmlPullParser));
                    return;
                } else {
                    Objects.requireNonNull(this.f22384a);
                    fk1.d(xmlPullParser);
                    return;
                }
            }
            Objects.requireNonNull(this.f22384a);
            strC = fk1.c(xmlPullParser);
            str = "error";
        }
        aVar.a(str, strC);
    }
}
