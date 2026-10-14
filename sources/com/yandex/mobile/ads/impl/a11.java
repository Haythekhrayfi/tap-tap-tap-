package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.model.reward.ServerSideReward;

/* JADX INFO: loaded from: classes3.dex */
public final class a11 implements iy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k6 f18759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ServerSideReward f18760b;

    public a11(Context context, k2 k2Var, ServerSideReward serverSideReward) {
        this.f18759a = new k6(context, k2Var);
        this.f18760b = serverSideReward;
    }

    @Override // com.yandex.mobile.ads.impl.iy0
    public final void a() {
        this.f18759a.a(this.f18760b.c());
    }
}
