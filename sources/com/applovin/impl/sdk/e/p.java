package com.applovin.impl.sdk.e;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class p extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f10593a;

    public interface a {
        void a();
    }

    public p(com.applovin.impl.sdk.o oVar, a aVar) {
        super("TaskFetchVariables", oVar);
        this.f10593a = aVar;
    }

    private Map<String, String> a() {
        return com.applovin.impl.sdk.utils.w.a(this.f10534f.M() != null ? this.f10534f.M().a(null, false, false) : this.f10534f.K().a(null, false, false));
    }

    @Override // java.lang.Runnable
    public void run() {
        x<JSONObject> xVar = new x<JSONObject>(com.applovin.impl.sdk.network.c.a(this.f10534f).a(com.applovin.impl.sdk.utils.i.l(this.f10534f)).c(com.applovin.impl.sdk.utils.i.m(this.f10534f)).a(a()).b("GET").a(new JSONObject()).b(((Integer) this.f10534f.a(com.applovin.impl.sdk.c.b.dJ)).intValue()).a(com.applovin.impl.sdk.utils.r.a.a(((Integer) this.f10534f.a(com.applovin.impl.sdk.c.b.fF)).intValue())).a(), this.f10534f) { // from class: com.applovin.impl.sdk.e.p.1
            @Override // com.applovin.impl.sdk.e.x, com.applovin.impl.sdk.network.b.d
            public void a(int i10, String str, JSONObject jSONObject) {
                if (com.applovin.impl.sdk.y.a()) {
                    this.f10536h.e(this.f10535g, "Unable to fetch variables: server returned " + i10);
                }
                com.applovin.impl.sdk.y.j("AppLovinVariableService", "Failed to load variables.");
                p.this.f10593a.a();
            }

            @Override // com.applovin.impl.sdk.e.x, com.applovin.impl.sdk.network.b.d
            public void a(JSONObject jSONObject, int i10) {
                com.applovin.impl.sdk.utils.i.e(jSONObject, this.f10534f);
                com.applovin.impl.sdk.utils.i.d(jSONObject, this.f10534f);
                com.applovin.impl.sdk.utils.i.g(jSONObject, this.f10534f);
                com.applovin.impl.sdk.utils.i.f(jSONObject, this.f10534f);
                p.this.f10593a.a();
            }
        };
        xVar.a(com.applovin.impl.sdk.c.b.bn);
        xVar.b(com.applovin.impl.sdk.c.b.bo);
        this.f10534f.G().a((d) xVar);
    }
}
