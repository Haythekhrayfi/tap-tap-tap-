package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<qa<?>> f22142a;

    public jt(List<qa<?>> list) {
        this.f22142a = list;
    }

    public final ArrayList a(com.yandex.mobile.ads.nativeads.w wVar) {
        ra raVarA;
        ArrayList arrayList = new ArrayList();
        for (qa<?> qaVar : this.f22142a) {
            if (!qaVar.f() && ((raVarA = wVar.a(qaVar)) == null || !raVarA.b())) {
                arrayList.add(qaVar.b());
            }
        }
        return arrayList;
    }
}
