package com.yandex.mobile.ads.impl;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class s30 implements fw0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z4 f24927a;

    public s30(w50 w50Var) {
        fd.j0.i(w50Var, "instreamVideoAdBreak");
        this.f24927a = new z4(w50Var.a());
    }

    @Override // com.yandex.mobile.ads.impl.fw0.a
    public final Map<String, Object> a() {
        gw0 gw0Var = new gw0(kc.f0.f(new jc.h("ad_type", l6.f22632g.a())));
        gw0Var.b(this.f24927a.d(), "page_id");
        gw0Var.b(this.f24927a.b(), "category_id");
        gw0Var.b(this.f24927a.c(), "imp_id");
        Map<String, Object> mapA = gw0Var.a();
        fd.j0.h(mapA, "reportDataWrapper.reportData");
        return mapA;
    }
}
