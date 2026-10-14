package com.yandex.metrica.impl.ob;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Ml implements InterfaceC1765kl {
    @Override // com.yandex.metrica.impl.ob.InterfaceC1765kl
    public void a(JSONObject jSONObject, Object obj, String str) {
        try {
            jSONObject.put(str, obj);
        } catch (Throwable unused) {
        }
    }
}
