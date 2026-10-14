package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class ge0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final be0 f21014a = new be0();

    public final ce0 a(JSONObject jSONObject) {
        try {
            String strB = r70.b("adapter", jSONObject);
            JSONObject jSONObject2 = jSONObject.getJSONObject("network_data");
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject2.getString(next));
            }
            if (!map.isEmpty()) {
                ce0.a aVar = new ce0.a(strB, map);
                ArrayList arrayListC = r70.c("click_tracking_urls", jSONObject);
                ArrayList arrayListC2 = r70.c("impression_tracking_urls", jSONObject);
                ArrayList arrayListC3 = r70.c("ad_response_tracking_urls", jSONObject);
                aVar.b(arrayListC).c(arrayListC2).a(arrayListC3).a(r70.a(jSONObject));
                if (jSONObject.has("impression_data")) {
                    Objects.requireNonNull(this.f21014a);
                    aVar.a(be0.a(jSONObject));
                }
                return aVar.a();
            }
        } catch (JSONException e10) {
            x60.a(e10, "Can't parse mediation network", new Object[0]);
        }
        return null;
    }
}
