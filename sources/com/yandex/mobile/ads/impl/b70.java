package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
final class b70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdResponse<?> f19133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q0 f19134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final uk f19135c;

    public b70(AdResponse<?> adResponse, q0 q0Var, uk ukVar) {
        this.f19133a = adResponse;
        this.f19134b = q0Var;
        this.f19135c = ukVar;
    }

    public final dj a(di0 di0Var, um umVar) {
        return new dj(this.f19133a, this.f19134b, new lh1(), this.f19135c, di0Var, umVar);
    }
}
