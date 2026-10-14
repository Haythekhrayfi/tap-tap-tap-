package com.yandex.metrica.impl.ob;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.dj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1589dj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z9 f15975a;

    public C1589dj() {
        this(new Z9());
    }

    public C1589dj(Z9 z10) {
        this.f15975a = z10;
    }

    public void a(C2042vj c2042vj, JSONObject jSONObject) {
        Z9 z10 = this.f15975a;
        C1760kg.b bVar = new C1760kg.b();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("auto_inapp_collecting");
        if (jSONObjectOptJSONObject != null) {
            bVar.f16611b = jSONObjectOptJSONObject.optInt("send_frequency_seconds", bVar.f16611b);
            bVar.f16612c = jSONObjectOptJSONObject.optInt("first_collecting_inapp_max_age_seconds", bVar.f16612c);
        }
        c2042vj.a(z10.a(bVar));
    }
}
