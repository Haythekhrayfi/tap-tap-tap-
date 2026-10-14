package com.applovin.impl.sdk.e;

import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class o extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.c f10592b;

    public o(com.applovin.impl.sdk.ad.c cVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.o oVar) {
        super(com.applovin.impl.sdk.ad.d.a("adtoken_zone"), appLovinAdLoadListener, "TaskFetchTokenAd", oVar);
        this.f10592b = cVar;
    }

    @Override // com.applovin.impl.sdk.e.k
    public Map<String, String> a() {
        HashMap map = new HashMap(2);
        map.put("adtoken", this.f10592b.a());
        map.put("adtoken_prefix", this.f10592b.c());
        return map;
    }

    @Override // com.applovin.impl.sdk.e.k
    public com.applovin.impl.sdk.ad.b h() {
        return com.applovin.impl.sdk.ad.b.REGULAR_AD_TOKEN;
    }
}
