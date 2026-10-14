package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ad extends ae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.e f10508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AppLovinAdRewardListener f10509b;

    public ad(com.applovin.impl.sdk.ad.e eVar, AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.impl.sdk.o oVar) {
        super("TaskValidateAppLovinReward", oVar);
        this.f10508a = eVar;
        this.f10509b = appLovinAdRewardListener;
    }

    @Override // com.applovin.impl.sdk.e.ab
    public String a() {
        return "2.0/vr";
    }

    @Override // com.applovin.impl.sdk.e.ab
    public void a(int i10) {
        String str;
        super.a(i10);
        if (i10 < 400 || i10 >= 500) {
            this.f10509b.validationRequestFailed(this.f10508a, i10);
            str = "network_timeout";
        } else {
            this.f10509b.userRewardRejected(this.f10508a, Collections.emptyMap());
            str = "rejected";
        }
        this.f10508a.a(com.applovin.impl.sdk.b.c.a(str));
    }

    @Override // com.applovin.impl.sdk.e.ae
    public void a(com.applovin.impl.sdk.b.c cVar) {
        this.f10508a.a(cVar);
        String strB = cVar.b();
        Map<String, String> mapA = cVar.a();
        if (strB.equals("accepted")) {
            this.f10509b.userRewardVerified(this.f10508a, mapA);
            return;
        }
        if (strB.equals("quota_exceeded")) {
            this.f10509b.userOverQuota(this.f10508a, mapA);
        } else if (strB.equals("rejected")) {
            this.f10509b.userRewardRejected(this.f10508a, mapA);
        } else {
            this.f10509b.validationRequestFailed(this.f10508a, AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR);
        }
    }

    @Override // com.applovin.impl.sdk.e.ab
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, this.f10508a.getAdZone().a());
        String clCode = this.f10508a.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.sdk.e.ae
    public boolean b() {
        return this.f10508a.aL();
    }
}
