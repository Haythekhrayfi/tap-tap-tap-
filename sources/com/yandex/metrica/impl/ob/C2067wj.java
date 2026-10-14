package com.yandex.metrica.impl.ob;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.wj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2067wj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Fa f17806a;

    public C2067wj() {
        this(new Fa());
    }

    public C2067wj(Fa fa2) {
        this.f17806a = fa2;
    }

    public final void a(C2042vj c2042vj, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("startup_update");
        C1760kg.q qVar = new C1760kg.q();
        Integer numC = C2120ym.c(jSONObjectOptJSONObject, "interval_seconds");
        if (numC != null) {
            qVar.f16719b = numC.intValue();
        }
        c2042vj.a(this.f17806a.a(qVar));
    }
}
