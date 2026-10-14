package com.yandex.mobile.ads.impl;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class l60 implements fw0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wh1 f22636a;

    public l60(wh1 wh1Var) {
        fd.j0.i(wh1Var, "requestConfig");
        this.f22636a = wh1Var;
    }

    @Override // com.yandex.mobile.ads.impl.fw0.a
    public final Map<String, Object> a() {
        return kc.f0.e(new jc.h("ad_type", l6.f22632g.a()), new jc.h("page_id", this.f22636a.c()), new jc.h("category_id", this.f22636a.b()));
    }
}
