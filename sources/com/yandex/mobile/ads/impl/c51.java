package com.yandex.mobile.ads.impl;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes3.dex */
public final class c51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19392a = FacebookMediationAdapter.KEY_ID;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19393b = "Ad";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fk1 f19394c = new fk1();

    public final String a(XmlPullParser xmlPullParser) {
        fd.j0.i(xmlPullParser, "parser");
        fk1 fk1Var = this.f19394c;
        String str = this.f19393b;
        Objects.requireNonNull(fk1Var);
        fk1.a(xmlPullParser, str);
        String attributeValue = xmlPullParser.getAttributeValue(null, this.f19392a);
        if (attributeValue == null || attributeValue.length() == 0) {
            return null;
        }
        return attributeValue;
    }
}
