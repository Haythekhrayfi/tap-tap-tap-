package com.yandex.mobile.ads.impl;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class lk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bv0 f22718a;

    public lk() {
        this(TimeUnit.MINUTES);
    }

    public lk(bv0 bv0Var) {
        fd.j0.i(bv0Var, "delegate");
        this.f22718a = bv0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lk(TimeUnit timeUnit) {
        this(new bv0(c61.f19395h, timeUnit));
        fd.j0.i(timeUnit, "timeUnit");
    }

    public final bv0 a() {
        return this.f22718a;
    }
}
