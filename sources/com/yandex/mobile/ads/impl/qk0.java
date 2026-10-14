package com.yandex.mobile.ads.impl;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class qk0 implements fw0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fw0.a f24522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private mb f24523b;

    public qk0(fw0.a aVar, mb mbVar) {
        fd.j0.i(aVar, "reportManager");
        fd.j0.i(mbVar, "assetsRenderedReportParameterProvider");
        this.f24522a = aVar;
        this.f24523b = mbVar;
    }

    @Override // com.yandex.mobile.ads.impl.fw0.a
    public final Map<String, Object> a() {
        Map<String, Object> mapA = this.f24522a.a();
        fd.j0.h(mapA, "reportManager.getReportParameters()");
        return kc.f0.g(mapA, kc.e0.b(new jc.h("assets", kc.e0.b(new jc.h("rendered", this.f24523b.a())))));
    }
}
