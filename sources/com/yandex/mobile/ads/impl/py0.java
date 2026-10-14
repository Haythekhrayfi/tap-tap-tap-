package com.yandex.mobile.ads.impl;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class py0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f24280a = new LinkedHashSet();

    public final synchronized void a(oy0 oy0Var) {
        fd.j0.i(oy0Var, "route");
        this.f24280a.remove(oy0Var);
    }

    public final synchronized void b(oy0 oy0Var) {
        fd.j0.i(oy0Var, "failedRoute");
        this.f24280a.add(oy0Var);
    }

    public final synchronized boolean c(oy0 oy0Var) {
        fd.j0.i(oy0Var, "route");
        return this.f24280a.contains(oy0Var);
    }
}
