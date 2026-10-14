package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class ab extends d {
    public ab(String str, com.applovin.impl.sdk.o oVar) {
        super(str, oVar);
    }

    public abstract String a();

    public void a(int i10) {
        com.applovin.impl.sdk.utils.i.a(i10, this.f10534f);
    }

    public abstract void a(JSONObject jSONObject);

    public void a(JSONObject jSONObject, final com.applovin.impl.sdk.network.b.d<JSONObject> dVar) {
        Map<String, String> mapE = com.applovin.impl.sdk.utils.i.e(this.f10534f);
        if (((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.fS)).booleanValue() || ((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.fL)).booleanValue()) {
            JsonUtils.putAll(jSONObject, mapE);
            mapE = null;
        }
        x<JSONObject> xVar = new x<JSONObject>(com.applovin.impl.sdk.network.c.a(this.f10534f).a(com.applovin.impl.sdk.utils.i.a(a(), this.f10534f)).c(com.applovin.impl.sdk.utils.i.b(a(), this.f10534f)).a(mapE).a(jSONObject).b("POST").f(((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.f10374gb)).booleanValue()).a(new JSONObject()).a(h()).a(com.applovin.impl.sdk.utils.r.a.a(((Integer) this.f10534f.a(com.applovin.impl.sdk.c.b.fK)).intValue())).a(), this.f10534f) { // from class: com.applovin.impl.sdk.e.ab.1
            @Override // com.applovin.impl.sdk.e.x, com.applovin.impl.sdk.network.b.d
            public void a(int i10, String str, JSONObject jSONObject2) {
                dVar.a(i10, str, jSONObject2);
            }

            @Override // com.applovin.impl.sdk.e.x, com.applovin.impl.sdk.network.b.d
            public void a(JSONObject jSONObject2, int i10) {
                dVar.a(jSONObject2, i10);
            }
        };
        xVar.a(com.applovin.impl.sdk.c.b.bj);
        xVar.b(com.applovin.impl.sdk.c.b.bk);
        this.f10534f.G().a((d) xVar);
    }

    public abstract int h();

    public JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        String strQ = this.f10534f.q();
        if (((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.ef)).booleanValue() && StringUtils.isValidString(strQ)) {
            JsonUtils.putString(jSONObject, "cuid", strQ);
        }
        if (((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.eh)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.f10534f.r());
        }
        if (((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.ej)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.f10534f.s());
        }
        a(jSONObject);
        return jSONObject;
    }
}
