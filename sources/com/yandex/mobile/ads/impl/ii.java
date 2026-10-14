package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.model.reward.ClientSideReward;

/* JADX INFO: loaded from: classes3.dex */
public final class ii implements iy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wl1 f21715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ky0 f21716b;

    public ii(ClientSideReward clientSideReward, ky0 ky0Var) {
        this.f21716b = ky0Var;
        this.f21715a = new wl1(clientSideReward.c(), clientSideReward.d());
    }

    @Override // com.yandex.mobile.ads.impl.iy0
    public final void a() {
        this.f21716b.a(this.f21715a);
    }
}
