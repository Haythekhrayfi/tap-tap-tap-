package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import com.yandex.mobile.ads.video.playback.view.VideoAdControlsContainer;

/* JADX INFO: loaded from: classes3.dex */
public final class y40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z40 f26693a;

    public y40(w50 w50Var, sc1<VideoAd> sc1Var) {
        fd.j0.i(w50Var, "instreamVideoAdBreak");
        fd.j0.i(sc1Var, "videoAdInfo");
        this.f26693a = new z40(w50Var, sc1Var);
    }

    public final void a(fc1 fc1Var) {
        fd.j0.i(fc1Var, "uiElements");
        VideoAdControlsContainer videoAdControlsContainerA = fc1Var.a();
        fd.j0.h(videoAdControlsContainerA, "uiElements.adControlsContainer");
        videoAdControlsContainerA.setTag(this.f26693a.a());
    }
}
