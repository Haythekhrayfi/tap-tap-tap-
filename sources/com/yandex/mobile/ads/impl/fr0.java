package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.ad.error.InstreamAdPlayerError;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class fr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h6 f20848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i4 f20849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g7 f20850c = new g7();

    public fr0(h6 h6Var, i4 i4Var) {
        this.f20848a = h6Var;
        this.f20849b = i4Var;
    }

    public final void a(Exception exc) {
        InstreamAdPlayerError instreamAdPlayerError;
        pr0 pr0VarB = this.f20848a.b();
        if (pr0VarB == null) {
            return;
        }
        VideoAd videoAdB = pr0VarB.b();
        if (n40.f23216a.equals(this.f20848a.a(videoAdB))) {
            return;
        }
        if (exc != null) {
            Objects.requireNonNull(this.f20850c);
            instreamAdPlayerError = g7.c(exc);
        } else {
            instreamAdPlayerError = new InstreamAdPlayerError(InstreamAdPlayerError.Reason.UNKNOWN, new so());
        }
        this.f20849b.onError(videoAdB, instreamAdPlayerError);
    }
}
