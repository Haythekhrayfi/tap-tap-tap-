package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public final class x71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk1 f26431a = new fk1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w71 f26432b = new w71();

    public final HashMap a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Objects.requireNonNull(this.f26431a);
        xmlPullParser.require(2, null, "TrackingEvents");
        HashMap map = new HashMap();
        while (true) {
            Objects.requireNonNull(this.f26431a);
            if (!(xmlPullParser.next() != 3)) {
                return map;
            }
            Objects.requireNonNull(this.f26431a);
            if (xmlPullParser.getEventType() == 2) {
                if ("Tracking".equals(xmlPullParser.getName())) {
                    u71 u71VarA = this.f26432b.a(xmlPullParser);
                    if (u71VarA != null) {
                        String strA = u71VarA.a();
                        String strC = u71VarA.c();
                        if (!map.containsKey(strA)) {
                            map.put(strA, new ArrayList());
                        }
                        ((List) map.get(strA)).add(strC);
                    }
                } else {
                    Objects.requireNonNull(this.f26431a);
                    fk1.d(xmlPullParser);
                }
            }
        }
    }
}
