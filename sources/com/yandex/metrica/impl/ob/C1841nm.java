package com.yandex.metrica.impl.ob;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.nm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1841nm extends Wl {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile String f16962h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile String f16963i;

    public C1841nm(String str, String str2, Wl.b bVar, int i10, boolean z10) {
        super(str, str2, null, i10, z10, Wl.c.VIEW, Wl.a.WEBVIEW);
        this.f16962h = null;
        this.f16963i = null;
    }

    @Override // com.yandex.metrica.impl.ob.Wl
    public JSONArray a(Kl kl) {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("t", "HTML");
            if (kl.f14368j) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("u", U2.a(this.f16962h, kl.f14373o));
                jSONObject2.putOpt("ou", U2.a(this.f16963i, kl.f14373o));
                if (jSONObject2.length() > 0) {
                    jSONObject.put(IntegerTokenConverter.CONVERTER_KEY, jSONObject2);
                }
            }
            jSONArray.put(jSONObject);
        } catch (Throwable unused) {
        }
        return jSONArray;
    }

    @Override // com.yandex.metrica.impl.ob.Wl
    public boolean a() {
        return true;
    }

    @Override // com.yandex.metrica.impl.ob.Wl
    public String toString() {
        StringBuilder sbA = defpackage.a.a("WebViewElement{url='");
        l1.c.a(sbA, this.f16962h, CoreConstants.SINGLE_QUOTE_CHAR, ", originalUrl='");
        l1.c.a(sbA, this.f16963i, CoreConstants.SINGLE_QUOTE_CHAR, ", mClassName='");
        l1.c.a(sbA, this.f15405a, CoreConstants.SINGLE_QUOTE_CHAR, ", mId='");
        l1.c.a(sbA, this.f15406b, CoreConstants.SINGLE_QUOTE_CHAR, ", mParseFilterReason=");
        sbA.append(this.f15407c);
        sbA.append(", mDepth=");
        sbA.append(this.f15408d);
        sbA.append(", mListItem=");
        sbA.append(this.f15409e);
        sbA.append(", mViewType=");
        sbA.append(this.f15410f);
        sbA.append(", mClassType=");
        sbA.append(this.f15411g);
        sbA.append("} ");
        return sbA.toString();
    }
}
