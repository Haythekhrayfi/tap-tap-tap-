package com.yandex.mobile.ads.impl;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qx0<nz0> f27449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final di1 f27450b;

    public zz0() {
        this(0);
    }

    public /* synthetic */ zz0(int i10) {
        this(um0.a(), new di1());
    }

    public zz0(qx0<nz0> qx0Var, di1 di1Var) {
        fd.j0.i(qx0Var, "sdkConfigurationResponseParser");
        fd.j0.i(di1Var, "volleyMapper");
        this.f27449a = qx0Var;
        this.f27450b = di1Var;
    }

    public final Object a(wm0 wm0Var) {
        fd.j0.i(wm0Var, "networkResponse");
        Objects.requireNonNull(this.f27450b);
        return this.f27449a.a(di1.a(wm0Var));
    }
}
