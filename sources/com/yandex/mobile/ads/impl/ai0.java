package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ai0 implements fw0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f18939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fw0.a f18940c;

    public ai0(String str, String str2, fw0.a aVar) {
        this.f18938a = str;
        this.f18939b = str2;
        this.f18940c = aVar;
    }

    @Override // com.yandex.mobile.ads.impl.fw0.a
    public final Map<String, Object> a() {
        HashMap map = new HashMap();
        map.put("asset_name", this.f18938a);
        map.put("action_type", this.f18939b);
        fw0.a aVar = this.f18940c;
        if (aVar != null) {
            map.putAll(aVar.a());
        }
        return map;
    }
}
