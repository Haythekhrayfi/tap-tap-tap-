package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p91 f24578a = new p91();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, p> f24579b;

    public final p a(JSONObject jSONObject) throws JSONException, zi0 {
        String strA = jk0.a("type", jSONObject);
        if (this.f24579b == null) {
            this.f24579b = new q(this);
        }
        return (p) ((HashMap) this.f24579b).get(strA);
    }
}
