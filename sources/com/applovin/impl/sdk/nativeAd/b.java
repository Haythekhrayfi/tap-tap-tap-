package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.sdk.o;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.c f10789b;

    public b(com.applovin.impl.sdk.ad.c cVar, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, o oVar) {
        super(com.applovin.impl.sdk.ad.d.a("adtoken_zone"), "TaskFetchNativeTokenAd", appLovinNativeAdLoadListener, oVar);
        this.f10789b = cVar;
    }

    @Override // com.applovin.impl.sdk.e.k
    public Map<String, String> a() {
        HashMap map = new HashMap(2);
        map.put("adtoken", this.f10789b.a());
        map.put("adtoken_prefix", this.f10789b.c());
        return map;
    }
}
