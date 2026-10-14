package com.yandex.mobile.ads.impl;

import com.google.android.gms.common.internal.ImagesContract;
import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class n80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f23303a = new r();

    public final m80 a(JSONObject jSONObject) throws JSONException, zi0 {
        ArrayList arrayList;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("actions");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                p pVarA = this.f23303a.a(jSONObject2);
                if (pVarA != null) {
                    arrayList2.add(pVarA.a(jSONObject2));
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        String strA = jSONObject.has("falseClickUrl") ? jk0.a("falseClickUrl", jSONObject) : null;
        Long lValueOf = Long.valueOf(jSONObject.optLong("falseClickInterval", 0L));
        return new m80(arrayList, (strA == null || lValueOf == null) ? null : new FalseClick(strA, lValueOf.longValue()), jSONObject.has("trackingUrl") ? jk0.a("trackingUrl", jSONObject) : null, jSONObject.has(ImagesContract.URL) ? jk0.a(ImagesContract.URL, jSONObject) : null, jSONObject.optLong("clickableDelay", 0L));
    }
}
