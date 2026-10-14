package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class v extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f10659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f10660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AppLovinAdLoadListener f10661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f10662d;

    public v(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.o oVar) {
        super("TaskRenderAppLovinAd", oVar);
        this.f10659a = jSONObject;
        this.f10660b = jSONObject2;
        this.f10662d = bVar;
        this.f10661c = appLovinAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.y.a()) {
            this.f10536h.b(this.f10535g, "Rendering ad...");
        }
        com.applovin.impl.sdk.ad.a aVar = new com.applovin.impl.sdk.ad.a(this.f10659a, this.f10660b, this.f10662d, this.f10534f);
        boolean zBooleanValue = JsonUtils.getBoolean(this.f10659a, "gs_load_immediately", Boolean.FALSE).booleanValue();
        boolean zBooleanValue2 = JsonUtils.getBoolean(this.f10659a, "vs_load_immediately", Boolean.TRUE).booleanValue();
        g gVar = new g(aVar, this.f10534f, this.f10661c);
        gVar.b(zBooleanValue2);
        gVar.c(zBooleanValue);
        r.b bVar = r.b.CACHING_OTHER;
        if (((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.b.bx)).booleanValue()) {
            AppLovinAdSize size = aVar.getSize();
            AppLovinAdSize appLovinAdSize = AppLovinAdSize.INTERSTITIAL;
            if (size == appLovinAdSize && aVar.getType() == AppLovinAdType.REGULAR) {
                bVar = r.b.CACHING_INTERSTITIAL;
            } else if (aVar.getSize() == appLovinAdSize && aVar.getType() == AppLovinAdType.INCENTIVIZED) {
                bVar = r.b.CACHING_INCENTIVIZED;
            } else if (aVar.getSize() == AppLovinAdSize.NATIVE && aVar.getType() == AppLovinAdType.NATIVE) {
                bVar = r.b.CACHING_NATIVE;
            }
        }
        this.f10534f.G().a(gVar, bVar);
    }
}
