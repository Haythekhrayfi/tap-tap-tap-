package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class mj0 implements fw0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k2 f23101a;

    public mj0(k2 k2Var) {
        this.f23101a = k2Var;
    }

    @Override // com.yandex.mobile.ads.impl.fw0.a
    public final Map<String, Object> a() {
        HashMap map = new HashMap();
        String[] strArrK = this.f23101a.k();
        if (strArrK != null && strArrK.length > 0) {
            map.put("image_sizes", Arrays.asList(strArrK));
        }
        return map;
    }
}
