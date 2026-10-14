package com.yandex.mobile.ads.impl;

import com.yandex.metrica.IReporter;

/* JADX INFO: loaded from: classes3.dex */
public final class oz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pz0 f23934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sz0 f23935b;

    public oz0(IReporter iReporter, kw0 kw0Var) {
        fd.j0.i(kw0Var, "reporterPolicyConfigurator");
        pz0 pz0Var = new pz0(new t9(), iReporter, kw0Var);
        sz0 sz0VarA = sz0.a();
        fd.j0.h(sz0VarA, "getInstance()");
        this(kw0Var, pz0Var, sz0VarA);
    }

    public oz0(kw0 kw0Var, pz0 pz0Var, sz0 sz0Var) {
        fd.j0.i(kw0Var, "reporterPolicyConfigurator");
        fd.j0.i(pz0Var, "sdkConfigurationChangeListener");
        fd.j0.i(sz0Var, "sdkConfigurationProvider");
        this.f23934a = pz0Var;
        this.f23935b = sz0Var;
    }

    public final void a() {
        this.f23935b.a(this.f23934a);
    }
}
