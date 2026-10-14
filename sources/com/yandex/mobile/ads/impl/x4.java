package com.yandex.mobile.ads.impl;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class x4 implements fw0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k2 f26417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b5 f26418b;

    public x4(k2 k2Var) {
        fd.j0.i(k2Var, "adConfiguration");
        this.f26417a = k2Var;
        this.f26418b = new b5();
    }

    @Override // com.yandex.mobile.ads.impl.fw0.a
    public final Map<String, Object> a() {
        Map<String, Object> mapF = kc.f0.f(new jc.h("ad_type", this.f26417a.b().a()));
        String strC = this.f26417a.c();
        if (strC != null) {
            mapF.put("block_id", strC);
            mapF.put("ad_unit_id", strC);
        }
        Map<String, Object> mapA = this.f26418b.a(this.f26417a.a());
        fd.j0.h(mapA, "adRequestReportDataProvi…dConfiguration.adRequest)");
        mapF.putAll(mapA);
        return mapF;
    }
}
