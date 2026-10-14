package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes3.dex */
public final class k80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lb f22292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fk1 f22293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n80 f22294c;

    public k80(lb lbVar) {
        fd.j0.i(lbVar, "assetsJsonParser");
        this.f22292a = lbVar;
        this.f22293b = new fk1();
        this.f22294c = new n80();
    }

    public final j80 a(XmlPullParser xmlPullParser) throws JSONException {
        fd.j0.i(xmlPullParser, "parser");
        try {
            j80.a aVar = new j80.a();
            Objects.requireNonNull(this.f22293b);
            String strC = fk1.c(xmlPullParser);
            fd.j0.h(strC, "xmlHelper.parseText(parser)");
            JSONObject jSONObject = new JSONObject(strC);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (fd.j0.d("assets", next)) {
                    aVar.a(this.f22292a.a(jSONObject));
                } else if (fd.j0.d("link", next)) {
                    m80 m80VarA = this.f22294c.a(jSONObject.getJSONObject(next));
                    fd.j0.h(m80VarA, "linkJsonParser.parseLink(jsonLink)");
                    aVar.a(m80VarA);
                }
            }
            return aVar.a();
        } catch (Exception e10) {
            throw new JSONException(e10.getMessage());
        }
    }
}
