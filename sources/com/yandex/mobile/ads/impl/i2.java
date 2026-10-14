package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v0 f21576a;

    public i2(a1 a1Var) {
        fd.j0.i(a1Var, "adActivityListener");
        this.f21576a = a1Var;
    }

    public final d1 a(AdResponse<?> adResponse, fy0 fy0Var) {
        fd.j0.i(adResponse, "adResponse");
        fd.j0.i(fy0Var, "closeVerificationController");
        return adResponse.n() == l6.f22629d ? new vx0(this.f21576a, fy0Var) : new y60();
    }
}
