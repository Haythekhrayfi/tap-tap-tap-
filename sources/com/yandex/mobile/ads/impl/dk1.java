package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public final class dk1<T> implements ek1<List<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk1 f19889a = new fk1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f19891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ek1<T> f19892d;

    public dk1(ek1<T> ek1Var, String str, String str2) {
        this.f19892d = ek1Var;
        this.f19890b = str;
        this.f19891c = str2;
    }

    @Override // com.yandex.mobile.ads.impl.ek1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ArrayList a(XmlPullParser xmlPullParser) throws XmlPullParserException, JSONException, IOException {
        ArrayList arrayList = new ArrayList();
        fk1 fk1Var = this.f19889a;
        String str = this.f19890b;
        Objects.requireNonNull(fk1Var);
        xmlPullParser.require(2, null, str);
        while (true) {
            Objects.requireNonNull(this.f19889a);
            if (!(xmlPullParser.next() != 3)) {
                return arrayList;
            }
            Objects.requireNonNull(this.f19889a);
            if (xmlPullParser.getEventType() == 2) {
                if (this.f19891c.equals(xmlPullParser.getName())) {
                    T tA = this.f19892d.a(xmlPullParser);
                    if (tA != null) {
                        arrayList.add(tA);
                    }
                } else {
                    Objects.requireNonNull(this.f19889a);
                    fk1.d(xmlPullParser);
                }
            }
        }
    }
}
