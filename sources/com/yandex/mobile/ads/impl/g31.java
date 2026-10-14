package com.yandex.mobile.ads.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class g31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n80 f20938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i31 f20939b;

    public g31(n80 n80Var, p91 p91Var) {
        this.f20938a = n80Var;
        this.f20939b = new i31(p91Var);
    }

    public final f31 a(JSONObject jSONObject) throws JSONException, zi0 {
        String strA = jk0.a("name", jSONObject);
        return new f31(this.f20938a.a(jSONObject.getJSONObject("link")), strA, this.f20939b.a(jSONObject.getJSONObject("value")));
    }
}
