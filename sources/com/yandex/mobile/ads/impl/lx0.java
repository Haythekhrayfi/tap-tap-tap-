package com.yandex.mobile.ads.impl;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class lx0<T> implements kx0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hi1<T> f22808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final di1 f22809b;

    public /* synthetic */ lx0(hi1 hi1Var) {
        this(hi1Var, new di1());
    }

    public lx0(hi1<T> hi1Var, di1 di1Var) {
        fd.j0.i(hi1Var, "responseBodyParser");
        fd.j0.i(di1Var, "volleyMapper");
        this.f22808a = hi1Var;
        this.f22809b = di1Var;
    }

    @Override // com.yandex.mobile.ads.impl.kx0
    public final T a(fx0 fx0Var) {
        fd.j0.i(fx0Var, "networkResponse");
        Objects.requireNonNull(this.f22809b);
        return this.f22808a.a(di1.a(fx0Var));
    }
}
