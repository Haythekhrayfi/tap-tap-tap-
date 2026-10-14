package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public final class tt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk1 f25493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p11 f25494b;

    public tt(fk1 fk1Var) {
        this.f25493a = fk1Var;
        this.f25494b = new p11(fk1Var);
    }

    public final ArrayList a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Objects.requireNonNull(this.f25493a);
        xmlPullParser.require(2, null, "Extensions");
        ArrayList arrayList = new ArrayList();
        while (true) {
            Objects.requireNonNull(this.f25493a);
            if (!(xmlPullParser.next() != 3)) {
                return arrayList;
            }
            Objects.requireNonNull(this.f25493a);
            if (xmlPullParser.getEventType() == 2) {
                if ("Extension".equals(xmlPullParser.getName())) {
                    pt ptVarA = this.f25494b.a(xmlPullParser);
                    if (ptVarA != null) {
                        arrayList.add(ptVarA);
                    }
                } else {
                    Objects.requireNonNull(this.f25493a);
                    fk1.d(xmlPullParser);
                }
            }
        }
    }
}
