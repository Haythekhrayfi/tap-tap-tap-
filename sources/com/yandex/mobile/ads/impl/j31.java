package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class j31 implements p<c31> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g31 f21938a;

    public j31(p91 p91Var) {
        this.f21938a = new g31(new n80(), p91Var);
    }

    @Override // com.yandex.mobile.ads.impl.p
    public final m a(JSONObject jSONObject) throws JSONException, zi0 {
        String strA = jk0.a("type", jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("items");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(this.f21938a.a(jSONArray.getJSONObject(i10)));
        }
        if (arrayList.isEmpty()) {
            throw new zi0("Native Ad json has not required attributes");
        }
        return new c31(strA, arrayList);
    }
}
