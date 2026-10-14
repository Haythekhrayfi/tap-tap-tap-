package com.applovin.impl.mediation.c;

import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.y;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class g extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.mediation.a.c f9365a;

    public g(com.applovin.impl.mediation.a.c cVar, o oVar) {
        super("TaskReportMaxReward", oVar);
        this.f9365a = cVar;
    }

    @Override // com.applovin.impl.sdk.e.ab
    public String a() {
        return "2.0/mcr";
    }

    @Override // com.applovin.impl.sdk.e.ab
    public void a(int i10) {
        super.a(i10);
        if (y.a()) {
            y yVar = this.f10536h;
            String str = this.f10535g;
            StringBuilder sbA = defpackage.a.a("Failed to report reward for mediated ad: ");
            sbA.append(this.f9365a);
            sbA.append(" - error code: ");
            sbA.append(i10);
            yVar.b(str, sbA.toString());
        }
    }

    @Override // com.applovin.impl.sdk.e.ab
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f9365a.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f9365a.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f9365a.aq());
        String strP = this.f9365a.P();
        if (!StringUtils.isValidString(strP)) {
            strP = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", strP);
        String strA = this.f9365a.a();
        if (!StringUtils.isValidString(strA)) {
            strA = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", strA);
    }

    @Override // com.applovin.impl.sdk.e.z
    public com.applovin.impl.sdk.b.c b() {
        return this.f9365a.S();
    }

    @Override // com.applovin.impl.sdk.e.z
    public void b(JSONObject jSONObject) {
        if (y.a()) {
            y yVar = this.f10536h;
            String str = this.f10535g;
            StringBuilder sbA = defpackage.a.a("Reported reward successfully for mediated ad: ");
            sbA.append(this.f9365a);
            yVar.b(str, sbA.toString());
        }
    }

    @Override // com.applovin.impl.sdk.e.z
    public void c() {
        if (y.a()) {
            y yVar = this.f10536h;
            String str = this.f10535g;
            StringBuilder sbA = defpackage.a.a("No reward result was found for mediated ad: ");
            sbA.append(this.f9365a);
            yVar.e(str, sbA.toString());
        }
    }
}
