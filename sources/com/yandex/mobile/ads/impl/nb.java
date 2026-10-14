package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class nb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<u40> f23313a;

    /* JADX WARN: Multi-variable type inference failed */
    public nb(List<? extends u40> list) {
        fd.j0.i(list, "assetViewConfigurators");
        this.f23313a = list;
    }

    public final void a(fc1 fc1Var) {
        fd.j0.i(fc1Var, "uiElements");
        Iterator<u40> it = this.f23313a.iterator();
        while (it.hasNext()) {
            it.next().a(fc1Var);
        }
    }
}
