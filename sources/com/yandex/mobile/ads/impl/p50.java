package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.SkipInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class p50 implements SkipInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f23983a;

    public p50(long j10) {
        this.f23983a = j10;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.SkipInfo
    public final long getSkipOffset() {
        return this.f23983a;
    }
}
