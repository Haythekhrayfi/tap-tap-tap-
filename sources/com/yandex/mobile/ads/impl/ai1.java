package com.yandex.mobile.ads.impl;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ai1 implements zw0<wh1, rh1> {
    @Override // com.yandex.mobile.ads.impl.zw0
    public final fw0 a(gx0<rh1> gx0Var, int i10, wh1 wh1Var) {
        wh1 wh1Var2 = wh1Var;
        HashMap map = new HashMap();
        map.put("page_id", wh1Var2.c());
        map.put("category_id", wh1Var2.b());
        if (i10 != -1) {
            map.put("code", Integer.valueOf(i10));
        }
        return new fw0(fw0.b.f20893t.a(), map);
    }

    @Override // com.yandex.mobile.ads.impl.zw0
    public final fw0 a(wh1 wh1Var) {
        wh1 wh1Var2 = wh1Var;
        HashMap map = new HashMap();
        map.put("page_id", wh1Var2.c());
        map.put("category_id", wh1Var2.b());
        return new fw0(fw0.b.f20892s.a(), map);
    }
}
