package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;
import java.io.IOException;
import java.util.Objects;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public final class rl {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k80 f24787d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dk1<u71> f24786c = b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pl<FalseClick> f24785b = a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk1 f24784a = new fk1();

    public rl(Context context) {
        this.f24787d = new k80(new lb(context));
    }

    private static pl a() {
        return new pl(new cu());
    }

    private static dk1 b() {
        return new dk1(new w71(), "CreativeExtension", "Tracking");
    }

    public final ql a(XmlPullParser xmlPullParser) throws XmlPullParserException, JSONException, IOException {
        Objects.requireNonNull(this.f24784a);
        xmlPullParser.require(2, null, "CreativeExtensions");
        ql.a aVar = new ql.a();
        while (true) {
            Objects.requireNonNull(this.f24784a);
            if (!(xmlPullParser.next() != 3)) {
                return new ql(aVar);
            }
            Objects.requireNonNull(this.f24784a);
            if (xmlPullParser.getEventType() == 2) {
                if ("CreativeExtension".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(null, "type");
                    if ("false_click".equals(attributeValue)) {
                        aVar.a(this.f24785b.a(xmlPullParser));
                    } else if ("yandex_tracking_events".equals(attributeValue)) {
                        aVar.a(this.f24786c.a(xmlPullParser));
                    } else if ("yandex_linear_creative_info".equals(attributeValue)) {
                        aVar.a(this.f24787d.a(xmlPullParser));
                    }
                }
                Objects.requireNonNull(this.f24784a);
                fk1.d(xmlPullParser);
            }
        }
    }
}
