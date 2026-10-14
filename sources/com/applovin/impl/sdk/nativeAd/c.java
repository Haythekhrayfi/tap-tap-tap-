package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.e.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.i;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f10790b;

    public c(com.applovin.impl.sdk.ad.d dVar, String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, o oVar) {
        super(dVar, str, oVar);
        this.f10790b = appLovinNativeAdLoadListener;
    }

    @Override // com.applovin.impl.sdk.e.k
    public com.applovin.impl.sdk.e.d a(JSONObject jSONObject) {
        return new d(jSONObject, this.f10790b, this.f10534f);
    }

    @Override // com.applovin.impl.sdk.e.k
    public void a(int i10, String str) {
        super.a(i10, str);
        this.f10790b.onNativeAdLoadFailed(new AppLovinError(i10, str));
    }

    @Override // com.applovin.impl.sdk.e.k
    public String b() {
        return i.j(this.f10534f);
    }

    @Override // com.applovin.impl.sdk.e.k
    public String c() {
        return i.k(this.f10534f);
    }
}
