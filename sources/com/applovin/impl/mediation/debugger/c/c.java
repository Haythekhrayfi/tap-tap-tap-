package com.applovin.impl.mediation.debugger.c;

import com.applovin.impl.sdk.e.d;
import com.applovin.impl.sdk.e.x;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.r;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.b.d<JSONObject> f9537a;

    public c(com.applovin.impl.sdk.network.b.d<JSONObject> dVar, o oVar) {
        super("TaskFetchMediationDebuggerInfo", oVar, true);
        this.f9537a = dVar;
    }

    private JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putJsonArrayIfValid(jSONObject, "installed_mediation_adapters", com.applovin.impl.mediation.d.c.a(this.f10534f));
        com.applovin.impl.sdk.utils.d.a aVarD = this.f10534f.M() != null ? this.f10534f.L().d() : this.f10534f.K().l();
        JsonUtils.putStringIfValid(jSONObject, "dnt_code", aVarD.c().a());
        Boolean boolA = com.applovin.impl.b.a.a().a(f());
        if (((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.em)).booleanValue() && !Boolean.TRUE.equals(boolA)) {
            JsonUtils.putStringIfValid(jSONObject, "idfa", aVarD.b());
        }
        return jSONObject;
    }

    public Map<String, String> a() {
        Map<String, Object> mapH;
        Map<String, Object> mapB;
        HashMap map = new HashMap();
        map.put("sdk_version", AppLovinSdk.VERSION);
        if (!((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.fx)).booleanValue()) {
            map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f10534f.ax());
        }
        if (this.f10534f.M() != null) {
            mapH = this.f10534f.M().e();
            mapB = this.f10534f.M().g();
        } else {
            mapH = this.f10534f.K().h();
            mapB = this.f10534f.K().b();
        }
        map.put("package_name", String.valueOf(mapH.get("package_name")));
        map.put("app_version", String.valueOf(mapH.get("app_version")));
        map.put("platform", String.valueOf(mapB.get("platform")));
        map.put("os", String.valueOf(mapB.get("os")));
        return map;
    }

    @Override // java.lang.Runnable
    public void run() {
        Map<String, String> mapA = a();
        JSONObject jSONObjectB = b();
        if (((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.fO)).booleanValue() || ((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.fL)).booleanValue()) {
            JsonUtils.putAll(jSONObjectB, mapA);
            mapA = null;
        }
        x<JSONObject> xVar = new x<JSONObject>(com.applovin.impl.sdk.network.c.a(this.f10534f).b("POST").a(com.applovin.impl.mediation.d.b.c(this.f10534f)).c(com.applovin.impl.mediation.d.b.d(this.f10534f)).a(mapA).a(jSONObjectB).a(new JSONObject()).b(((Long) this.f10534f.a(com.applovin.impl.sdk.c.a.f10322g)).intValue()).a(r.a.a(((Integer) this.f10534f.a(com.applovin.impl.sdk.c.b.fE)).intValue())).a(), this.f10534f, g()) { // from class: com.applovin.impl.mediation.debugger.c.c.1
            @Override // com.applovin.impl.sdk.e.x, com.applovin.impl.sdk.network.b.d
            public void a(int i10, String str, JSONObject jSONObject) {
                c.this.f9537a.a(i10, str, jSONObject);
            }

            @Override // com.applovin.impl.sdk.e.x, com.applovin.impl.sdk.network.b.d
            public void a(JSONObject jSONObject, int i10) {
                c.this.f9537a.a(jSONObject, i10);
            }
        };
        xVar.a(com.applovin.impl.sdk.c.a.f10318c);
        xVar.b(com.applovin.impl.sdk.c.a.f10319d);
        this.f10534f.G().a((d) xVar);
    }
}
