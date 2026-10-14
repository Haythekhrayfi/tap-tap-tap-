package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.IOException;
import java.util.Objects;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
final class ul implements ek1<nl> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk1 f25687a = new fk1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l80 f25688b = new l80();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rl f25689c;

    public ul(Context context) {
        this.f25689c = new rl(context);
    }

    @Override // com.yandex.mobile.ads.impl.ek1
    public final nl a(XmlPullParser xmlPullParser) throws XmlPullParserException, JSONException, IOException {
        Objects.requireNonNull(this.f25687a);
        xmlPullParser.require(2, null, "Creative");
        Objects.requireNonNull(this.f25687a);
        String attributeValue = xmlPullParser.getAttributeValue(null, FacebookMediationAdapter.KEY_ID);
        nl.a aVar = new nl.a();
        aVar.b(attributeValue);
        boolean z10 = false;
        while (true) {
            Objects.requireNonNull(this.f25687a);
            if (!(xmlPullParser.next() != 3)) {
                break;
            }
            Objects.requireNonNull(this.f25687a);
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("Linear".equals(name)) {
                    this.f25688b.a(xmlPullParser, aVar);
                    z10 = true;
                } else if ("CreativeExtensions".equals(name)) {
                    aVar.a(this.f25689c.a(xmlPullParser));
                } else {
                    Objects.requireNonNull(this.f25687a);
                    fk1.d(xmlPullParser);
                }
            }
        }
        if (z10) {
            return aVar.a();
        }
        return null;
    }
}
