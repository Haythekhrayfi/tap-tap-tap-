package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class n30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m30 f23210a = new m30();

    public final ArrayList a(JSONObject jSONObject) throws JSONException, zi0 {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("installedPackages");
        if (jSONArrayOptJSONArray != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                Objects.requireNonNull(this.f23210a);
                if (!kk0.a(jSONObject2, "name")) {
                    throw new zi0("Native Ad json has not required attributes");
                }
                String strA = jk0.a("name", jSONObject2);
                int i11 = t6.f25286b;
                int iOptInt = jSONObject2.optInt("minVersion", 0);
                if (iOptInt < 0) {
                    iOptInt = 0;
                }
                int i12 = Integer.MAX_VALUE;
                int iOptInt2 = jSONObject2.optInt("maxVersion", Integer.MAX_VALUE);
                if (iOptInt2 >= 0) {
                    i12 = iOptInt2;
                }
                arrayList.add(new l30(iOptInt, i12, strA));
            }
        }
        return arrayList;
    }
}
