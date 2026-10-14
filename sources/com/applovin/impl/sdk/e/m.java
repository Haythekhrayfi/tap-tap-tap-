package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class m extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f10590b;

    public m(List<String> list, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.o oVar) {
        super(com.applovin.impl.sdk.ad.d.a(a(list)), appLovinAdLoadListener, "TaskFetchMultizoneAd", oVar);
        this.f10590b = Collections.unmodifiableList(list);
    }

    private static String a(List<String> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("No zone identifiers specified");
        }
        return list.get(0);
    }

    @Override // com.applovin.impl.sdk.e.k
    public Map<String, String> a() {
        HashMap map = new HashMap(1);
        List<String> list = this.f10590b;
        map.put("zone_ids", CollectionUtils.implode(list, list.size()));
        return map;
    }

    @Override // com.applovin.impl.sdk.e.k
    public com.applovin.impl.sdk.ad.b h() {
        return com.applovin.impl.sdk.ad.b.APPLOVIN_MULTIZONE;
    }
}
