package com.yandex.mobile.ads.impl;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ei1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final di1 f20256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ym0 f20257b;

    public ei1(di1 di1Var, ym0 ym0Var) {
        fd.j0.i(di1Var, "volleyMapper");
        fd.j0.i(ym0Var, "networkResponseDecoder");
        this.f20256a = di1Var;
        this.f20257b = ym0Var;
    }

    public final String a(wm0 wm0Var) {
        fd.j0.i(wm0Var, "networkResponse");
        Objects.requireNonNull(this.f20256a);
        return this.f20257b.a(di1.a(wm0Var));
    }
}
