package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.joran.action.Action;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class az0 {
    public static Object a(String str, JSONObject jSONObject) {
        fd.j0.i(jSONObject, "<this>");
        fd.j0.i(str, Action.KEY_ATTRIBUTE);
        try {
            return jSONObject.get(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static Object a(JSONArray jSONArray, int i10) {
        fd.j0.i(jSONArray, "<this>");
        try {
            return jSONArray.get(i10);
        } catch (JSONException unused) {
            return null;
        }
    }
}
