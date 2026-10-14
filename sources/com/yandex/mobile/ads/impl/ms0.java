package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class ms0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ls0 f23136a;

    public ms0(p91 p91Var) {
        this.f23136a = new ls0(p91Var);
    }

    public final ArrayList a(JSONArray jSONArray) throws JSONException, zi0 {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(this.f23136a.a(jSONObjectOptJSONObject));
                }
            }
        }
        return arrayList;
    }
}
