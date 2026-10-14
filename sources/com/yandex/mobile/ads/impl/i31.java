package com.yandex.mobile.ads.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class i31 implements cb<h31> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f20 f21586a;

    public i31(p91 p91Var) {
        this.f21586a = new f20(p91Var);
    }

    @Override // com.yandex.mobile.ads.impl.cb
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final h31 a(JSONObject jSONObject) throws JSONException, zi0 {
        return new h31(this.f21586a.a(jSONObject.getJSONObject("image")), jk0.a("title", jSONObject));
    }
}
