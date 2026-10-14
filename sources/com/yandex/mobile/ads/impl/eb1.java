package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class eb1 implements zw0<ab1, sa1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z4 f20143a;

    public eb1(z4 z4Var) {
        this.f20143a = z4Var;
    }

    @Override // com.yandex.mobile.ads.impl.zw0
    public final fw0 a(gx0<sa1> gx0Var, int i10, ab1 ab1Var) {
        HashMap map = new HashMap();
        String strC = this.f20143a.c();
        String strD = this.f20143a.d();
        if (TextUtils.isEmpty(strD)) {
            strD = "null";
        }
        map.put("page_id", strD);
        if (TextUtils.isEmpty(strC)) {
            strC = "null";
        }
        map.put("imp_id", strC);
        if (i10 != -1) {
            map.put("code", Integer.valueOf(i10));
        }
        return new fw0(fw0.b.f20886m.a(), map);
    }

    @Override // com.yandex.mobile.ads.impl.zw0
    public final fw0 a(ab1 ab1Var) {
        HashMap map = new HashMap();
        String strC = this.f20143a.c();
        String strD = this.f20143a.d();
        if (TextUtils.isEmpty(strD)) {
            strD = "null";
        }
        map.put("page_id", strD);
        if (TextUtils.isEmpty(strC)) {
            strC = "null";
        }
        map.put("imp_id", strC);
        return new fw0(fw0.b.f20885l.a(), map);
    }
}
