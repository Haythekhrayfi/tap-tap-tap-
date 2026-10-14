package com.applovin.impl.mediation.debugger.b.a;

import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9465b;

    public d(JSONObject jSONObject, o oVar) {
        this.f9464a = JsonUtils.getString(jSONObject, FacebookMediationAdapter.KEY_ID, "");
        this.f9465b = JsonUtils.getString(jSONObject, "price", null);
    }

    public String a() {
        return this.f9464a;
    }

    public String b() {
        return this.f9465b;
    }
}
