package com.yandex.mobile.ads.impl;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ya1 implements jq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lc1 f26752b;

    public ya1(String str, lc1 lc1Var) {
        fd.j0.i(str, "responseStatus");
        this.f26751a = str;
        this.f26752b = lc1Var;
    }

    @Override // com.yandex.mobile.ads.impl.jq0
    public final Map<String, Object> a(long j10) {
        Map<String, Object> mapF = kc.f0.f(new jc.h("duration", Long.valueOf(j10)), new jc.h("status", this.f26751a));
        lc1 lc1Var = this.f26752b;
        if (lc1Var != null) {
            String strC = lc1Var.c();
            fd.j0.h(strC, "videoAdError.description");
            mapF.put("failure_reason", strC);
        }
        return mapF;
    }
}
