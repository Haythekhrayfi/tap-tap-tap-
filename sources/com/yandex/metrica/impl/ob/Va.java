package com.yandex.metrica.impl.ob;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Va implements Ya<P3> {
    private JSONObject a(P3.a aVar) throws JSONException {
        if (aVar == null) {
            return null;
        }
        return new JSONObject().putOpt("clids", C2120ym.e(aVar.b())).putOpt("source", aVar.a().a());
    }

    @Override // com.yandex.metrica.impl.ob.Ya
    public JSONObject a(P3 p10) {
        P3 p11 = p10;
        JSONObject jSONObject = new JSONObject();
        if (p11 != null) {
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator<P3.a> it = p11.a().iterator();
                while (it.hasNext()) {
                    jSONArray.put(a(it.next()));
                }
                jSONObject.putOpt("chosen", a(p11.c())).putOpt("candidates", jSONArray);
            } catch (Throwable unused) {
            }
        }
        return jSONObject;
    }
}
