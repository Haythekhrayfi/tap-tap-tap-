package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class yi0 implements bn0<cj0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ww0<cj0> f26855a;

    public yi0(ww0<cj0> ww0Var) {
        this.f26855a = ww0Var;
    }

    @Override // com.yandex.mobile.ads.impl.bn0
    public final fi1 a(Context context, k2 k2Var) {
        return vm0.a(context, k2Var, new dj0(this.f26855a));
    }
}
