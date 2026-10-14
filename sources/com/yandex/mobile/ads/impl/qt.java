package com.yandex.mobile.ads.impl;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<pt> f24565a;

    public qt(nc1 nc1Var) {
        this.f24565a = nc1Var.a();
    }

    public final boolean a() {
        for (pt ptVar : this.f24565a) {
            if (ptVar.a().equals("ad_system") && ptVar.b().equals("adfox")) {
                return true;
            }
        }
        return false;
    }
}
