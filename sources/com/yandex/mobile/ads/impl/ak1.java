package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ak1 implements zw0<ac1, List<ac1>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qa1 f18948a;

    public ak1(qa1 qa1Var) {
        this.f18948a = qa1Var;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0021  */
    @Override // com.yandex.mobile.ads.impl.zw0
    public final fw0 a(gx0<List<ac1>> gx0Var, int i10, ac1 ac1Var) {
        fw0.c cVar;
        List<ac1> list;
        HashMap map = new HashMap();
        map.put("page_id", this.f18948a.b());
        map.put("imp_id", this.f18948a.a());
        if (204 == i10) {
            cVar = fw0.c.f20903d;
        } else if (gx0Var == null || (list = gx0Var.f21226a) == null || i10 != 200) {
            cVar = fw0.c.f20902c;
        } else if (list.isEmpty()) {
            cVar = fw0.c.f20903d;
        } else {
            cVar = fw0.c.f20901b;
        }
        map.put("status", cVar.a());
        return new fw0(fw0.b.f20888o.a(), map);
    }

    @Override // com.yandex.mobile.ads.impl.zw0
    public final fw0 a(ac1 ac1Var) {
        HashMap map = new HashMap();
        map.put("page_id", this.f18948a.b());
        map.put("imp_id", this.f18948a.a());
        return new fw0(fw0.b.f20887n.a(), map);
    }
}
