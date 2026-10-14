package com.applovin.impl.mediation.c;

import com.applovin.impl.sdk.e.ae;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class h extends ae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.mediation.a.c f9366a;

    public h(com.applovin.impl.mediation.a.c cVar, o oVar) {
        super("TaskValidateMaxReward", oVar);
        this.f9366a = cVar;
    }

    @Override // com.applovin.impl.sdk.e.ab
    public String a() {
        return "2.0/mvr";
    }

    @Override // com.applovin.impl.sdk.e.ab
    public void a(int i10) {
        super.a(i10);
        this.f9366a.a(com.applovin.impl.sdk.b.c.a((i10 < 400 || i10 >= 500) ? "network_timeout" : "rejected"));
    }

    @Override // com.applovin.impl.sdk.e.ae
    public void a(com.applovin.impl.sdk.b.c cVar) {
        this.f9366a.a(cVar);
    }

    @Override // com.applovin.impl.sdk.e.ab
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f9366a.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f9366a.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f9366a.aq());
        JsonUtils.putString(jSONObject, "ad_format", this.f9366a.getFormat().getLabel());
        String strP = this.f9366a.P();
        if (!StringUtils.isValidString(strP)) {
            strP = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", strP);
        String strA = this.f9366a.a();
        if (!StringUtils.isValidString(strA)) {
            strA = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", strA);
    }

    @Override // com.applovin.impl.sdk.e.ae
    public boolean b() {
        return this.f9366a.Q();
    }
}
