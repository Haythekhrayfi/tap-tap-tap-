package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f24307a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f24308b = new HashMap();

    public final n3 a(VideoAd videoAd) {
        return (n3) this.f24307a.get(videoAd);
    }

    public final VideoAd a(n3 n3Var) {
        return (VideoAd) this.f24308b.get(n3Var);
    }

    public final void a(n3 n3Var, VideoAd videoAd) {
        this.f24307a.put(videoAd, n3Var);
        this.f24308b.put(n3Var, videoAd);
    }
}
