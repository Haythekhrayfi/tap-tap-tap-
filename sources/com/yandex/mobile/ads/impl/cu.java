package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;
import java.io.IOException;
import java.util.Objects;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public final class cu implements ek1<FalseClick> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk1 f19627a = new fk1();

    @Override // com.yandex.mobile.ads.impl.ek1
    public final FalseClick a(XmlPullParser xmlPullParser) throws XmlPullParserException, JSONException, IOException {
        Long lValueOf;
        Objects.requireNonNull(this.f19627a);
        xmlPullParser.require(2, null, "FalseClick");
        Objects.requireNonNull(this.f19627a);
        String attributeValue = xmlPullParser.getAttributeValue(null, "interval");
        if (attributeValue != null) {
            try {
                lValueOf = Long.valueOf(Long.parseLong(attributeValue));
            } catch (Exception unused) {
                lValueOf = null;
            }
        } else {
            lValueOf = null;
        }
        Objects.requireNonNull(this.f19627a);
        String strC = fk1.c(xmlPullParser);
        if (TextUtils.isEmpty(strC) || lValueOf == null) {
            return null;
        }
        return new FalseClick(strC, lValueOf.longValue());
    }
}
