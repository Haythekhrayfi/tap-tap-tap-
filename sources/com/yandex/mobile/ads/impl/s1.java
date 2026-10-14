package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk1 f24915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e6 f24916b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final tt f24918d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pf f24917c = new pf();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final uv0 f24919e = new uv0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final r61 f24920f = new r61();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final x71 f24921g = new x71();

    public s1(fk1 fk1Var, tt ttVar) {
        this.f24915a = fk1Var;
        this.f24918d = ttVar;
        this.f24916b = new e6(fk1Var);
    }

    public final q1 a(XmlPullParser xmlPullParser) throws XmlPullParserException, JSONException, IOException {
        ArrayList arrayList;
        HashMap map;
        d6 d6VarA;
        Objects.requireNonNull(this.f24915a);
        xmlPullParser.require(2, null, "AdBreak");
        String attributeValue = xmlPullParser.getAttributeValue(null, "breakId");
        Objects.requireNonNull(this.f24919e);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "repeatAfter");
        if (!TextUtils.isEmpty(attributeValue2)) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.US);
                simpleDateFormat.parse(attributeValue2).getTime();
                simpleDateFormat.parse("00:00:00").getTime();
            } catch (Exception e10) {
                x60.a(e10, e10.getMessage(), new Object[0]);
            }
        }
        Objects.requireNonNull(this.f24920f);
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "timeOffset");
        p61 p61VarB = !TextUtils.isEmpty(attributeValue3) ? sh1.b(attributeValue3) : null;
        Objects.requireNonNull(this.f24917c);
        List arrayList2 = new ArrayList();
        try {
            String attributeValue4 = xmlPullParser.getAttributeValue(null, "breakType");
            if (!TextUtils.isEmpty(attributeValue4)) {
                arrayList2 = Arrays.asList(attributeValue4.split(","));
            }
            while (true) {
                Objects.requireNonNull(this.f24915a);
                if (!(xmlPullParser.next() != 3)) {
                    break;
                }
                Objects.requireNonNull(this.f24915a);
                if (xmlPullParser.getEventType() == 2) {
                    String name = xmlPullParser.getName();
                    if ("AdSource".equals(name)) {
                        d6VarA = this.f24916b.a(xmlPullParser);
                    } else if ("Extensions".equals(name)) {
                        arrayList.addAll(this.f24918d.a(xmlPullParser));
                    } else if ("TrackingEvents".equals(name)) {
                        map.putAll(this.f24921g.a(xmlPullParser));
                    } else {
                        Objects.requireNonNull(this.f24915a);
                        fk1.d(xmlPullParser);
                    }
                }
            }
        } catch (Exception e11) {
            x60.a(e11, e11.getMessage(), new Object[0]);
        }
        arrayList = new ArrayList();
        map = new HashMap();
        d6VarA = null;
        if (d6VarA == null || p61VarB == null || arrayList2.isEmpty()) {
            return null;
        }
        return sh1.a(d6VarA, attributeValue, p61VarB, arrayList2, map);
    }
}
