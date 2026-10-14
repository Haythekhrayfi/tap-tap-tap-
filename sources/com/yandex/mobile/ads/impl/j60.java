package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.AdPodInfo;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* JADX INFO: loaded from: classes3.dex */
public final class j60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final de1 f21952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w50 f21953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sc1<VideoAd> f21954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o50 f21955d;

    public j60(de1 de1Var, w50 w50Var, sc1<VideoAd> sc1Var) {
        fd.j0.i(de1Var, "statusController");
        fd.j0.i(w50Var, "adBreak");
        fd.j0.i(sc1Var, "videoAdInfo");
        this.f21952a = de1Var;
        this.f21953b = w50Var;
        this.f21954c = sc1Var;
        this.f21955d = o50.a();
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0020  */
    public final boolean a() {
        ce1 ce1Var;
        AdPodInfo adPodInfo = this.f21954c.c().getAdPodInfo();
        fd.j0.h(adPodInfo, "videoAdInfo.playbackInfo.adPodInfo");
        if (!this.f21955d.b() || adPodInfo.getAdPosition() <= 1) {
            if ((r3 = (r1 = this.f21953b.getType()).hashCode()) != -1183812830) {
                if (adPodInfo.getAdPosition() == 1) {
                    ce1Var = ce1.f19479d;
                }
            } else if (adPodInfo.getAdPosition() == 1) {
                ce1Var = ce1.f19479d;
            }
            ce1Var = ce1.f19477b;
        } else {
            ce1Var = ce1.f19479d;
        }
        return this.f21952a.a(ce1Var);
    }
}
