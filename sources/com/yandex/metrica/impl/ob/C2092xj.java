package com.yandex.metrica.impl.ob;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.xj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2092xj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C1760kg.t f17856a = new C1760kg.t();

    public Vi a(C2120ym.a aVar, String str) {
        Vi.a aVar2;
        JSONObject jSONObjectOptJSONObject = aVar.optJSONObject(str);
        Vi.a aVar3 = null;
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("cell");
        if (jSONObjectOptJSONObject2 != null) {
            C1760kg.t tVar = f17856a;
            aVar2 = new Vi.a(jSONObjectOptJSONObject2.optInt("refresh_event_count", tVar.f16723b), jSONObjectOptJSONObject2.optLong("refresh_period_seconds", tVar.f16724c));
        } else {
            aVar2 = null;
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("wifi");
        if (jSONObjectOptJSONObject3 != null) {
            C1760kg.t tVar2 = f17856a;
            aVar3 = new Vi.a(jSONObjectOptJSONObject3.optInt("refresh_event_count", tVar2.f16723b), jSONObjectOptJSONObject3.optLong("refresh_period_seconds", tVar2.f16724c));
        }
        return new Vi(aVar2, aVar3);
    }
}
