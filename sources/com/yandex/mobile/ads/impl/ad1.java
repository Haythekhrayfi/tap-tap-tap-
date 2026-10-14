package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.io.IOException;
import java.util.Objects;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
final class ad1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f18877a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c30 f18879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zj1 f18880d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fk1 f18878b = new fk1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x01 f18881e = new x01();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c51 f18882f = new c51();

    public ad1(Context context) {
        this.f18877a = context.getApplicationContext();
        this.f18879c = new c30(new kc1(context));
        this.f18880d = new zj1(context);
    }

    public final ac1 a(XmlPullParser xmlPullParser) throws XmlPullParserException, JSONException, IOException {
        String strA = this.f18882f.a(xmlPullParser);
        Integer numA = this.f18881e.a(xmlPullParser);
        Objects.requireNonNull(this.f18878b);
        ac1 ac1VarA = null;
        xmlPullParser.require(2, null, "Ad");
        while (true) {
            Objects.requireNonNull(this.f18878b);
            if (!(xmlPullParser.next() != 3)) {
                return ac1VarA;
            }
            Objects.requireNonNull(this.f18878b);
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("InLine".equals(name)) {
                    ac1.a aVar = new ac1.a(this.f18877a, false);
                    aVar.d(strA);
                    aVar.a(numA);
                    ac1VarA = this.f18879c.a(xmlPullParser, aVar);
                } else if ("Wrapper".equals(name)) {
                    ac1.a aVar2 = new ac1.a(this.f18877a, true);
                    aVar2.d(strA);
                    aVar2.a(numA);
                    ac1VarA = this.f18880d.a(xmlPullParser, aVar2);
                } else {
                    Objects.requireNonNull(this.f18878b);
                    fk1.d(xmlPullParser);
                }
            }
        }
    }
}
