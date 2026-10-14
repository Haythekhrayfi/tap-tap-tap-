package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* JADX INFO: loaded from: classes3.dex */
public final class j40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h21 f21946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zs0 f21947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k60 f21948c;

    public j40(VideoAd videoAd, i60 i60Var, r50 r50Var, s40 s40Var, de1 de1Var) {
        fd.j0.i(videoAd, "videoAd");
        fd.j0.i(i60Var, "videoViewProvider");
        fd.j0.i(r50Var, "videoAdPlayer");
        fd.j0.i(s40Var, "adViewsHolderManager");
        fd.j0.i(de1Var, "adStatusController");
        this.f21946a = new h21(s40Var, videoAd);
        this.f21947b = new zs0(s40Var);
        this.f21948c = new k60(r50Var, i60Var, de1Var);
    }

    public final void a(ud1 ud1Var) {
        fd.j0.i(ud1Var, "progressEventsObservable");
        ud1Var.a(this.f21946a, this.f21947b, this.f21948c);
    }
}
