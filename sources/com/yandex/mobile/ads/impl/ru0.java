package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ru0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final td f24874a = new td();

    public final qu0 a(String str) throws JSONException {
        Objects.requireNonNull(this.f24874a);
        JSONObject jSONObject = new JSONObject(td.a(str.getBytes()));
        HashMap map = new HashMap();
        String string = jSONObject.getString("body");
        JSONObject jSONObject2 = jSONObject.getJSONObject("headers");
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, jSONObject2.getString(next));
        }
        return new qu0(string, map);
    }
}
