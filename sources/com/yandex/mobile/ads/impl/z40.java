package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* JADX INFO: loaded from: classes3.dex */
public final class z40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w50 f27216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sc1<VideoAd> f27217b;

    public z40(w50 w50Var, sc1<VideoAd> sc1Var) {
        fd.j0.i(w50Var, "adBreak");
        fd.j0.i(sc1Var, "videoAdInfo");
        this.f27216a = w50Var;
        this.f27217b = sc1Var;
    }

    public final String a() {
        int adPosition = this.f27217b.c().getAdPodInfo().getAdPosition();
        StringBuilder sbA = v60.a("yma_");
        sbA.append(this.f27216a);
        sbA.append("_position_");
        sbA.append(adPosition);
        return sbA.toString();
    }
}
