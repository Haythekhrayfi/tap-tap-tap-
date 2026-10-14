package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.rewarded.Reward;

/* JADX INFO: loaded from: classes3.dex */
public final class wl1 implements Reward {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26317b;

    public wl1(int i10, String str) {
        this.f26316a = i10;
        this.f26317b = str;
    }

    @Override // com.yandex.mobile.ads.rewarded.Reward
    public final int getAmount() {
        return this.f26316a;
    }

    @Override // com.yandex.mobile.ads.rewarded.Reward
    public final String getType() {
        return this.f26317b;
    }
}
