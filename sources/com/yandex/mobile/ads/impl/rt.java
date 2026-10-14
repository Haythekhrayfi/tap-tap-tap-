package com.yandex.mobile.ads.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class rt {
    public static Integer a(y9.z1 z1Var) {
        JSONObject jSONObject = z1Var.f44586b;
        if (jSONObject == null) {
            return null;
        }
        try {
            return Integer.valueOf(jSONObject.getInt("position"));
        } catch (JSONException unused) {
            return null;
        }
    }
}
