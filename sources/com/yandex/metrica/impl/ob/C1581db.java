package com.yandex.metrica.impl.ob;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.db, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1581db implements Ya<Be> {
    @Override // com.yandex.metrica.impl.ob.Ya
    public JSONObject a(Be be2) {
        Be be3 = be2;
        JSONObject jSONObject = new JSONObject();
        if (be3 != null) {
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator<Be.a> it = be3.f13722b.iterator();
                while (it.hasNext()) {
                    Be.a next = it.next();
                    jSONArray.put(next == null ? null : new JSONObject().putOpt("tracking_id", next.f13723a).put("additional_parameters", next.f13724b).put("source", next.f13725c.a()));
                }
                JSONObject jSONObjectPut = jSONObject.put("candidates", jSONArray);
                Le le2 = be3.f13721a;
                jSONObjectPut.put("chosen", new JSONObject().putOpt("tracking_id", le2.f14405a).put("additional_parameters", le2.f14406b).put("source", le2.f14409e.a()).put("auto_tracking_enabled", le2.f14408d));
            } catch (Throwable unused) {
            }
        }
        return jSONObject;
    }
}
