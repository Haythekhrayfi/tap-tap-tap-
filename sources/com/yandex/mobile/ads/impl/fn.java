package com.yandex.mobile.ads.impl;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class fn implements p<dn> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ms0 f20755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p91 f20756b;

    public fn(p91 p91Var) {
        this.f20756b = p91Var;
        this.f20755a = new ms0(p91Var);
    }

    @Override // com.yandex.mobile.ads.impl.p
    public final m a(JSONObject jSONObject) throws JSONException, zi0 {
        String strA = jk0.a("type", jSONObject);
        Objects.requireNonNull(this.f20756b);
        return new dn(strA, p91.a("fallbackUrl", jSONObject), this.f20755a.a(jSONObject.optJSONArray("preferredPackages")));
    }
}
