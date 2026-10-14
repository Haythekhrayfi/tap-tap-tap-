package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.ad.InstreamAdView;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class y50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a60 f26704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.yandex.mobile.ads.instream.player.ad.a f26705b = new com.yandex.mobile.ads.instream.player.ad.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u30 f26706c;

    public y50(a60 a60Var, r50 r50Var) {
        this.f26704a = a60Var;
        this.f26706c = new u30(r50Var);
    }

    public final void a(sc1<VideoAd> sc1Var, InstreamAdView instreamAdView, a50 a50Var) {
        Objects.requireNonNull(this.f26705b);
        fc1 fc1VarA = com.yandex.mobile.ads.instream.player.ad.a.a(instreamAdView);
        if (fc1VarA != null) {
            this.f26704a.a(sc1Var, new a50.a().b(this.f26706c.a(fc1VarA, a50Var).d()).a(a50Var.a()).a());
        }
    }

    public final void b(sc1<VideoAd> sc1Var, InstreamAdView instreamAdView, a50 a50Var) {
        Objects.requireNonNull(this.f26705b);
        fc1 fc1VarA = com.yandex.mobile.ads.instream.player.ad.a.a(instreamAdView);
        if (fc1VarA != null) {
            this.f26704a.a(sc1Var, this.f26706c.a(fc1VarA, a50Var));
        }
    }
}
