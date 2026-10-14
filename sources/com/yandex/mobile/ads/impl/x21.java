package com.yandex.mobile.ads.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class x21 {
    public static q21 a(JSONObject jSONObject) throws JSONException {
        fd.j0.i(jSONObject, "jsonValue");
        return new q21(jSONObject.getInt("x"), jSONObject.getInt("y"), jSONObject.getInt("w"), jSONObject.getInt("h"));
    }
}
