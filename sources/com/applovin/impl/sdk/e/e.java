package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
class e extends d {
    public e(com.applovin.impl.sdk.o oVar) {
        super("TaskApiSubmitData", oVar);
    }

    private void a(Map<String, String> map, JSONObject jSONObject) {
        x<JSONObject> xVar = new x<JSONObject>(com.applovin.impl.sdk.network.c.a(this.f10534f).a(com.applovin.impl.sdk.utils.i.a("2.0/device", this.f10534f)).c(com.applovin.impl.sdk.utils.i.b("2.0/device", this.f10534f)).a(map).a(jSONObject).b("POST").f(((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.fY)).booleanValue()).a(new JSONObject()).a(((Integer) this.f10534f.a(com.applovin.impl.sdk.c.b.dC)).intValue()).a(com.applovin.impl.sdk.utils.r.a.a(((Integer) this.f10534f.a(com.applovin.impl.sdk.c.b.fJ)).intValue())).a(), this.f10534f) { // from class: com.applovin.impl.sdk.e.e.1
            @Override // com.applovin.impl.sdk.e.x, com.applovin.impl.sdk.network.b.d
            public void a(int i10, String str, JSONObject jSONObject2) {
                com.applovin.impl.sdk.utils.i.a(i10, this.f10534f);
            }

            @Override // com.applovin.impl.sdk.e.x, com.applovin.impl.sdk.network.b.d
            public void a(JSONObject jSONObject2, int i10) {
                e.this.a(jSONObject2);
            }
        };
        xVar.a(com.applovin.impl.sdk.c.b.bj);
        xVar.b(com.applovin.impl.sdk.c.b.bk);
        this.f10534f.G().a((d) xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(com.applovin.impl.b.a.k.a(jSONObject, "results"), 0, new JSONObject());
        this.f10534f.H().a(com.applovin.impl.sdk.c.b.f10344ad, JsonUtils.getString(jSONObject2, "device_id", ""));
        this.f10534f.H().a(com.applovin.impl.sdk.c.b.ag, JsonUtils.getString(jSONObject2, "device_token", ""));
        this.f10534f.H().a(com.applovin.impl.sdk.c.b.ah, Long.valueOf(JsonUtils.getLong(jSONObject2, "publisher_id", 0L)));
        com.applovin.impl.sdk.utils.i.e(jSONObject2, this.f10534f);
        com.applovin.impl.sdk.utils.i.f(jSONObject2, this.f10534f);
        String string = JsonUtils.getString(jSONObject2, "latest_version", "");
        if (StringUtils.isValidString(string)) {
            String str = AppLovinSdk.VERSION;
            if (!str.equals(string)) {
                String strA = y.q.a("Current SDK version (", str, ") is outdated. Please integrate the latest version of the AppLovin SDK (", string, "). Doing so will improve your CPMs and ensure you have access to the latest revenue earning features.");
                if (JsonUtils.valueExists(jSONObject2, "sdk_update_message")) {
                    strA = JsonUtils.getString(jSONObject2, "sdk_update_message", strA);
                }
                com.applovin.impl.sdk.y.h("AppLovinSdk", strA);
            }
        }
        this.f10534f.J().b();
    }

    private void b(JSONObject jSONObject) {
        Map<String, Object> mapD;
        Map<String, Object> mapH;
        if (this.f10534f.M() != null) {
            com.applovin.impl.sdk.q qVarM = this.f10534f.M();
            mapD = qVarM.b();
            mapH = qVarM.e();
        } else {
            com.applovin.impl.sdk.p pVarK = this.f10534f.K();
            mapD = pVarK.d();
            mapH = pVarK.h();
        }
        com.applovin.impl.sdk.utils.w.a("platform", "type", mapD);
        com.applovin.impl.sdk.utils.w.a("api_level", "sdk_version", mapD);
        JsonUtils.putObject(jSONObject, "device_info", new JSONObject(mapD));
        com.applovin.impl.sdk.utils.w.a("sdk_version", "applovin_sdk_version", mapH);
        com.applovin.impl.sdk.utils.w.a("ia", "installed_at", mapH);
        JsonUtils.putObject(jSONObject, "app_info", new JSONObject(mapH));
    }

    private void c(JSONObject jSONObject) {
        if (((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.eX)).booleanValue()) {
            JsonUtils.putJSONObjectIfValid(jSONObject, "stats", this.f10534f.J().c());
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.y.a()) {
            this.f10536h.c(this.f10535g, "Submitting user data...");
        }
        Map<String, String> mapE = com.applovin.impl.sdk.utils.i.e(this.f10534f);
        JSONObject jSONObject = new JSONObject();
        b(jSONObject);
        c(jSONObject);
        if (((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.fR)).booleanValue() || ((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.fL)).booleanValue()) {
            JsonUtils.putAll(jSONObject, mapE);
            mapE = null;
        }
        a(mapE, jSONObject);
    }
}
