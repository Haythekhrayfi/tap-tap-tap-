package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBinder;
import com.yandex.mobile.ads.instream.player.content.VideoPlayer;

/* JADX INFO: loaded from: classes3.dex */
public final class f60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InstreamAdBinder f20558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e60 f20559b;

    public f60(InstreamAdBinder instreamAdBinder) {
        fd.j0.i(instreamAdBinder, "instreamAdBinder");
        this.f20558a = instreamAdBinder;
        this.f20559b = e60.f20079c.a();
    }

    public final void a(VideoPlayer videoPlayer) {
        fd.j0.i(videoPlayer, "player");
        InstreamAdBinder instreamAdBinderA = this.f20559b.a(videoPlayer);
        if (fd.j0.d(this.f20558a, instreamAdBinderA)) {
            return;
        }
        if (instreamAdBinderA != null) {
            instreamAdBinderA.invalidateVideoPlayer();
        }
        this.f20559b.a(videoPlayer, this.f20558a);
    }

    public final void b(VideoPlayer videoPlayer) {
        fd.j0.i(videoPlayer, "player");
        this.f20559b.b(videoPlayer);
    }
}
