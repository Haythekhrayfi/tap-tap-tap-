package com.yandex.mobile.ads.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class za1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f27265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f27266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f27267c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bs0 f27268d;

    private za1(boolean z10, Float f10, bs0 bs0Var) {
        this.f27265a = z10;
        this.f27266b = f10;
        this.f27268d = bs0Var;
    }

    public static za1 a(float f10, bs0 bs0Var) {
        return new za1(true, Float.valueOf(f10), bs0Var);
    }

    public static za1 a(bs0 bs0Var) {
        return new za1(false, null, bs0Var);
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f27265a);
            if (this.f27265a) {
                jSONObject.put("skipOffset", this.f27266b);
            }
            jSONObject.put("autoPlay", this.f27267c);
            jSONObject.put("position", this.f27268d);
        } catch (JSONException e10) {
            ym1.a("VastProperties: JSON error", e10);
        }
        return jSONObject;
    }
}
