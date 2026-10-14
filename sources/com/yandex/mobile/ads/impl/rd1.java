package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.AdPodInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class rd1 implements AdPodInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f24675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f24676b;

    public rd1(int i10, int i11) {
        this.f24676b = i10;
        this.f24675a = i11;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.AdPodInfo
    public final int getAdPosition() {
        return this.f24675a;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.AdPodInfo
    public final int getAdsCount() {
        return this.f24676b;
    }
}
