package com.yandex.mobile.ads.impl;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class lu implements p<ju> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p91 f22794a;

    public lu(p91 p91Var) {
        this.f22794a = p91Var;
    }

    @Override // com.yandex.mobile.ads.impl.p
    public final m a(JSONObject jSONObject) throws JSONException, zi0 {
        String strA = jk0.a("type", jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("items");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
            String strA2 = jk0.a("title", jSONObject2);
            Objects.requireNonNull(this.f22794a);
            arrayList.add(new ju.a(strA2, p91.a(ImagesContract.URL, jSONObject2)));
        }
        if (arrayList.isEmpty()) {
            throw new zi0("Native Ad json has not required attributes");
        }
        return new ju(strA, arrayList);
    }
}
