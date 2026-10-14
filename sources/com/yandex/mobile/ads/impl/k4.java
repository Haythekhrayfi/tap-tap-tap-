package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* JADX INFO: loaded from: classes3.dex */
public final class k4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y2 f22244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q3 f22245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d4 f22246c;

    public k4(g6 g6Var, y2 y2Var) {
        this.f22244a = y2Var;
        this.f22245b = g6Var.a();
        this.f22246c = g6Var.c();
    }

    public final void a(VideoAd videoAd) {
        if (!(videoAd.getMediaFile() instanceof l50)) {
            x60.c("Unknown mediaFile received in prepareAd", new Object[0]);
            return;
        }
        l50 l50Var = (l50) videoAd.getMediaFile();
        n3 n3Var = new n3(this.f22244a.a(l50Var.a()), videoAd.getAdPodInfo().getAdPosition() - 1);
        this.f22245b.a(n3Var, videoAd);
        AdPlaybackState adPlaybackStateA = this.f22246c.a();
        if (adPlaybackStateA.isAdInErrorState(n3Var.a(), n3Var.b())) {
            return;
        }
        this.f22246c.a(adPlaybackStateA.withAdCount(n3Var.a(), videoAd.getAdPodInfo().getAdsCount()).withAdUri(n3Var.a(), n3Var.b(), Uri.parse(l50Var.getUrl())));
    }
}
