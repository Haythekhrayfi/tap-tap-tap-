package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.Objects;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
final class c30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kc1 f19366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fk1 f19367b = new fk1();

    public c30(kc1 kc1Var) {
        this.f19366a = kc1Var;
    }

    public final ac1 a(XmlPullParser xmlPullParser, ac1.a aVar) throws XmlPullParserException, JSONException, IOException {
        Objects.requireNonNull(this.f19367b);
        xmlPullParser.require(2, null, "InLine");
        while (true) {
            Objects.requireNonNull(this.f19367b);
            if (!(xmlPullParser.next() != 3)) {
                break;
            }
            Objects.requireNonNull(this.f19367b);
            if (xmlPullParser.getEventType() == 2) {
                this.f19366a.a(xmlPullParser, aVar);
            }
        }
        ac1 ac1VarA = aVar.a();
        if (ac1VarA.e().isEmpty()) {
            return null;
        }
        return ac1VarA;
    }
}
