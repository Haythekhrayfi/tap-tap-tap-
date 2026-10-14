package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.SkipInfo;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* JADX INFO: loaded from: classes3.dex */
public final class h21 implements td1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g21 f21289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SkipInfo f21290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21291c;

    public h21(s40 s40Var, VideoAd videoAd) {
        this.f21290b = videoAd.getSkipInfo();
        this.f21289a = new g21(s40Var);
    }

    @Override // com.yandex.mobile.ads.impl.td1
    public final void a(long j10, long j11) {
        SkipInfo skipInfo;
        if (this.f21291c || (skipInfo = this.f21290b) == null) {
            return;
        }
        if (j11 < skipInfo.getSkipOffset()) {
            this.f21289a.a(this.f21290b.getSkipOffset(), j11);
        } else {
            this.f21289a.a();
            this.f21291c = true;
        }
    }
}
