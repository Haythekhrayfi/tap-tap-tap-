package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class y extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.e f10673a;

    public y(com.applovin.impl.sdk.ad.e eVar, com.applovin.impl.sdk.o oVar) {
        super("TaskReportAppLovinReward", oVar);
        this.f10673a = eVar;
    }

    @Override // com.applovin.impl.sdk.e.ab
    public String a() {
        return "2.0/cr";
    }

    @Override // com.applovin.impl.sdk.e.ab
    public void a(int i10) {
        super.a(i10);
        if (com.applovin.impl.sdk.y.a()) {
            com.applovin.impl.sdk.y yVar = this.f10536h;
            String str = this.f10535g;
            StringBuilder sbA = defpackage.a.a("Failed to report reward for ad: ");
            sbA.append(this.f10673a);
            sbA.append(" - error code: ");
            sbA.append(i10);
            yVar.e(str, sbA.toString());
        }
    }

    @Override // com.applovin.impl.sdk.e.ab
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, this.f10673a.getAdZone().a());
        JsonUtils.putInt(jSONObject, "fire_percent", this.f10673a.aj());
        String clCode = this.f10673a.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.sdk.e.z
    public com.applovin.impl.sdk.b.c b() {
        return this.f10673a.aN();
    }

    @Override // com.applovin.impl.sdk.e.z
    public void b(JSONObject jSONObject) {
        if (com.applovin.impl.sdk.y.a()) {
            com.applovin.impl.sdk.y yVar = this.f10536h;
            String str = this.f10535g;
            StringBuilder sbA = defpackage.a.a("Reported reward successfully for ad: ");
            sbA.append(this.f10673a);
            yVar.b(str, sbA.toString());
        }
    }

    @Override // com.applovin.impl.sdk.e.z
    public void c() {
        if (com.applovin.impl.sdk.y.a()) {
            com.applovin.impl.sdk.y yVar = this.f10536h;
            String str = this.f10535g;
            StringBuilder sbA = defpackage.a.a("No reward result was found for ad: ");
            sbA.append(this.f10673a);
            yVar.e(str, sbA.toString());
        }
    }
}
