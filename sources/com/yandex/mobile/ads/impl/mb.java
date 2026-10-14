package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<qa> f23017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.yandex.mobile.ads.nativeads.w<?> f23018b;

    /* JADX WARN: Multi-variable type inference failed */
    public mb(List<? extends qa> list) {
        fd.j0.i(list, "assets");
        this.f23017a = list;
    }

    public final HashMap a() {
        ra raVarA;
        int iF;
        HashMap map = new HashMap();
        for (qa qaVar : this.f23017a) {
            String strB = qaVar.b();
            fd.j0.h(strB, "asset.name");
            com.yandex.mobile.ads.nativeads.w<?> wVar = this.f23018b;
            if (wVar != null && (raVarA = wVar.a(qaVar)) != null && raVarA.b()) {
                HashMap map2 = new HashMap();
                ug1 ug1VarC = raVarA.c();
                if (ug1VarC != null) {
                    map2.put("width", Integer.valueOf(ug1VarC.b()));
                    map2.put("height", Integer.valueOf(ug1VarC.a()));
                }
                za0 za0Var = raVarA instanceof za0 ? (za0) raVarA : null;
                if (za0Var != null && (iF = za0Var.f()) != 0) {
                    map2.put("value_type", yc0.a(iF));
                }
                map.put(strB, map2);
            }
        }
        return map;
    }

    public final void a(com.yandex.mobile.ads.nativeads.w<?> wVar) {
        this.f23018b = wVar;
    }
}
