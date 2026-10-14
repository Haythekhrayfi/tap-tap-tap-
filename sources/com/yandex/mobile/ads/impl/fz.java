package com.yandex.mobile.ads.impl;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class fz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dz f20918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i01 f20919b;

    public /* synthetic */ fz() {
        zn znVar = new zn();
        i01 i01VarB = i01.b();
        fd.j0.h(i01VarB, "getInstance()");
        this(znVar, i01VarB);
    }

    public fz(dz dzVar, i01 i01Var) {
        fd.j0.i(dzVar, "defaultHostAccessChecker");
        fd.j0.i(i01Var, "sdkSettings");
        this.f20918a = dzVar;
        this.f20919b = i01Var;
    }

    public final dz a() {
        Objects.requireNonNull(this.f20919b);
        i01.a();
        return this.f20918a;
    }
}
