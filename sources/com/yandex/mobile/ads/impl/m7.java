package com.yandex.mobile.ads.impl;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class m7 implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p91 f22925a;

    public m7(p91 p91Var) {
        this.f22925a = p91Var;
    }

    @Override // com.yandex.mobile.ads.impl.p
    public final m a(JSONObject jSONObject) throws JSONException, zi0 {
        String strA = jk0.a("type", jSONObject);
        Objects.requireNonNull(this.f22925a);
        String strA2 = p91.a(ImagesContract.URL, jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("trackingUrls");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(jSONArray.getString(i10));
        }
        return new k7(strA, strA2, arrayList);
    }
}
