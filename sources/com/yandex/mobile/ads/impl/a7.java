package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class a7 implements jq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fw0.c f18804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f18805b;

    public a7(fw0.c cVar, String str) {
        this.f18804a = cVar;
        this.f18805b = str;
    }

    @Override // com.yandex.mobile.ads.impl.jq0
    public final Map<String, Object> a(long j10) {
        gw0 gw0Var = new gw0(new HashMap());
        gw0Var.b(this.f18805b, "adapter");
        gw0Var.b(this.f18804a.a(), "status");
        gw0Var.b(Long.valueOf(j10), "duration");
        return gw0Var.a();
    }
}
