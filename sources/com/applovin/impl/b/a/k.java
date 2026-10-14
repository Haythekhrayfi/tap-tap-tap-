package com.applovin.impl.b.a;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k {
    public static JSONArray a(JSONObject jSONObject, String str) {
        return JsonUtils.getJSONArray(jSONObject, str, new JSONArray());
    }
}
