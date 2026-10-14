package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class n extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AppLovinAdLoadListener f10591b;

    public n(com.applovin.impl.sdk.ad.d dVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.o oVar) {
        this(dVar, appLovinAdLoadListener, "TaskFetchNextAd", oVar);
    }

    public n(com.applovin.impl.sdk.ad.d dVar, AppLovinAdLoadListener appLovinAdLoadListener, String str, com.applovin.impl.sdk.o oVar) {
        super(dVar, str, oVar);
        this.f10591b = appLovinAdLoadListener;
    }

    @Override // com.applovin.impl.sdk.e.k
    public d a(JSONObject jSONObject) {
        return new s(jSONObject, ((k) this).f10582a, h(), this.f10591b, this.f10534f);
    }

    @Override // com.applovin.impl.sdk.e.k
    public void a(int i10, String str) {
        super.a(i10, str);
        AppLovinAdLoadListener appLovinAdLoadListener = this.f10591b;
        if (!(appLovinAdLoadListener instanceof com.applovin.impl.sdk.ad.i)) {
            appLovinAdLoadListener.failedToReceiveAd(i10);
        } else {
            ((com.applovin.impl.sdk.ad.i) this.f10591b).failedToReceiveAdV2(new AppLovinError(i10, str));
        }
    }

    @Override // com.applovin.impl.sdk.e.k
    public String b() {
        return com.applovin.impl.sdk.utils.i.h(this.f10534f);
    }

    @Override // com.applovin.impl.sdk.e.k
    public String c() {
        return com.applovin.impl.sdk.utils.i.i(this.f10534f);
    }
}
