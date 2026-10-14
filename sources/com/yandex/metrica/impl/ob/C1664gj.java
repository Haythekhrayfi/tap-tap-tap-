package com.yandex.metrica.impl.ob;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.gj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1664gj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1705ia f16227a;

    public C1664gj() {
        this(new C1705ia());
    }

    public C1664gj(C1705ia c1705ia) {
        this.f16227a = c1705ia;
    }

    public final void a(C2042vj c2042vj, JSONObject jSONObject) {
        C1760kg.g gVar = new C1760kg.g();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("easy_collecting");
        if (jSONObjectOptJSONObject != null) {
            gVar.f16625b = jSONObjectOptJSONObject.optLong("first_delay_seconds", gVar.f16625b);
        }
        c2042vj.a(this.f16227a.a(gVar));
    }
}
