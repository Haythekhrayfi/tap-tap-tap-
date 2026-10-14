package com.yandex.metrica.impl.ob;

import android.app.Activity;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Ql implements InterfaceC1790ll {
    @Override // com.yandex.metrica.impl.ob.InterfaceC1790ll
    public JSONObject a(Activity activity, long j10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ssh", new JSONArray().put(new JSONObject().put("si", new JSONObject().put("cn", activity.getClass().getName())).put("cid", j10)));
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
