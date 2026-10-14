package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class vm implements um {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final iw0 f26027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Object> f26028b;

    public vm(iw0 iw0Var, Map<String, ? extends Object> map) {
        fd.j0.i(iw0Var, "metricaReporter");
        fd.j0.i(map, "extraParams");
        this.f26027a = iw0Var;
        this.f26028b = map;
    }

    @Override // com.yandex.mobile.ads.impl.um
    public final void a(tm tmVar) {
        Map mapB;
        fd.j0.i(tmVar, "eventType");
        fw0.b bVar = fw0.b.T;
        Map<String, Object> map = this.f26028b;
        jc.h hVar = new jc.h("log_type", tmVar.a());
        fd.j0.i(map, "<this>");
        fd.j0.i(hVar, "pair");
        if (map.isEmpty()) {
            mapB = kc.e0.b(hVar);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put(hVar.f31811c, hVar.f31812d);
            mapB = linkedHashMap;
        }
        this.f26027a.a(new fw0(bVar, (Map<String, Object>) mapB));
    }
}
