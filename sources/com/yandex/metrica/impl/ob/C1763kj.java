package com.yandex.metrica.impl.ob;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1763kj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1879pa f16778a;

    public C1763kj() {
        this(new C1879pa());
    }

    public C1763kj(C1879pa c1879pa) {
        this.f16778a = c1879pa;
    }

    public void a(C2042vj c2042vj, C2120ym.a aVar) {
        if (c2042vj.e().f17341f) {
            C1760kg.j jVar = new C1760kg.j();
            JSONObject jSONObjectOptJSONObject = aVar.optJSONObject("identity_light_collecting");
            if (jSONObjectOptJSONObject != null) {
                jVar.f16656b = jSONObjectOptJSONObject.optLong("min_interval_seconds", jVar.f16656b);
            }
            c2042vj.a(this.f16778a.a(jVar));
        }
    }
}
