package com.yandex.metrica.impl.ob;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Gk implements InterfaceC1691hl {
    @Override // com.yandex.metrica.impl.ob.InterfaceC1691hl
    public JSONObject a(Object obj) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cxts", obj);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
