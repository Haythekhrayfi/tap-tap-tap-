package com.yandex.mobile.ads.mediation.rewarded;

import com.yandex.mobile.ads.rewarded.Reward;

/* JADX INFO: loaded from: classes3.dex */
final class MediatedReward implements Reward {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27632b;

    public MediatedReward(int i10, String str) {
        this.f27631a = i10;
        this.f27632b = str;
    }

    @Override // com.yandex.mobile.ads.rewarded.Reward
    public int getAmount() {
        return this.f27631a;
    }

    @Override // com.yandex.mobile.ads.rewarded.Reward
    public String getType() {
        return this.f27632b;
    }
}
