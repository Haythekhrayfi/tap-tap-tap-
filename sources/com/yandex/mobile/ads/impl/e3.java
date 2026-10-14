package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* JADX INFO: loaded from: classes3.dex */
public final class e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sc1<VideoAd> f20051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s50 f20052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final de1 f20053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final eg1 f20054d;

    public e3(sc1 sc1Var, s50 s50Var, g20 g20Var, de1 de1Var, gg1 gg1Var) {
        fd.j0.i(sc1Var, "videoAdInfo");
        fd.j0.i(s50Var, "playbackController");
        fd.j0.i(g20Var, "imageProvider");
        fd.j0.i(de1Var, "statusController");
        fd.j0.i(gg1Var, "videoTracker");
        this.f20051a = sc1Var;
        this.f20052b = s50Var;
        this.f20053c = de1Var;
        this.f20054d = gg1Var;
    }

    public final s50 a() {
        return this.f20052b;
    }

    public final de1 b() {
        return this.f20053c;
    }

    public final sc1<VideoAd> c() {
        return this.f20051a;
    }

    public final eg1 d() {
        return this.f20054d;
    }
}
