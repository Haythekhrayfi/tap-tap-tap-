package com.yandex.mobile.ads.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class qn0 implements cb<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ux0 f24544a = new ux0();

    @Override // com.yandex.mobile.ads.impl.cb
    public final String a(JSONObject jSONObject) throws JSONException, zi0 {
        String strA = jk0.a("name", jSONObject);
        String strA2 = jk0.a("value", jSONObject);
        return "review_count".equals(strA) ? this.f24544a.a(strA2) : strA2;
    }
}
