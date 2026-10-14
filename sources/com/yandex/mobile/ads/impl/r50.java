package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener;
import com.yandex.mobile.ads.instream.player.ad.error.InstreamAdPlayerError;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class r50 implements nd1<VideoAd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d40 f24602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final VideoAd f24603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f24604c;

    public static class a implements InstreamAdPlayerListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q50 f24605a = new q50();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final qd1 f24606b;

        public a(cd1 cd1Var) {
            this.f24606b = cd1Var;
        }

        @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
        public final void onAdBufferingFinished(VideoAd videoAd) {
            qd1 qd1Var = this.f24606b;
            videoAd.getMediaFile();
            qd1Var.a();
        }

        @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
        public final void onAdBufferingStarted(VideoAd videoAd) {
            qd1 qd1Var = this.f24606b;
            videoAd.getMediaFile();
            qd1Var.b();
        }

        @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
        public final void onAdCompleted(VideoAd videoAd) {
            qd1 qd1Var = this.f24606b;
            videoAd.getMediaFile();
            qd1Var.d();
        }

        @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
        public final void onAdPaused(VideoAd videoAd) {
            qd1 qd1Var = this.f24606b;
            videoAd.getMediaFile();
            qd1Var.i();
        }

        @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
        public final void onAdPrepared(VideoAd videoAd) {
            qd1 qd1Var = this.f24606b;
            videoAd.getMediaFile();
            qd1Var.h();
        }

        @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
        public final void onAdResumed(VideoAd videoAd) {
            qd1 qd1Var = this.f24606b;
            videoAd.getMediaFile();
            qd1Var.f();
        }

        @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
        public final void onAdSkipped(VideoAd videoAd) {
            qd1 qd1Var = this.f24606b;
            videoAd.getMediaFile();
            qd1Var.g();
        }

        @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
        public final void onAdStarted(VideoAd videoAd) {
            qd1 qd1Var = this.f24606b;
            videoAd.getMediaFile();
            qd1Var.c();
        }

        @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
        public final void onAdStopped(VideoAd videoAd) {
            qd1 qd1Var = this.f24606b;
            videoAd.getMediaFile();
            qd1Var.e();
        }

        @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
        public final void onError(VideoAd videoAd, InstreamAdPlayerError instreamAdPlayerError) {
            qd1 qd1Var = this.f24606b;
            videoAd.getMediaFile();
            Objects.requireNonNull(this.f24605a);
            qd1Var.a(q50.a(instreamAdPlayerError));
        }

        @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
        public final void onVolumeChanged(VideoAd videoAd, float f10) {
            qd1 qd1Var = this.f24606b;
            videoAd.getMediaFile();
            qd1Var.onVolumeChanged(f10);
        }
    }

    public r50(VideoAd videoAd, d40 d40Var) {
        this.f24603b = videoAd;
        this.f24602a = d40Var;
    }

    @Override // com.yandex.mobile.ads.impl.nd1
    public final void a() {
        this.f24602a.e(this.f24603b);
    }

    public final void a(float f10) {
        this.f24602a.a(this.f24603b, f10);
    }

    @Override // com.yandex.mobile.ads.impl.nd1
    public final void a(cd1 cd1Var) {
        a aVar = this.f24604c;
        if (aVar != null) {
            this.f24602a.b(this.f24603b, aVar);
            this.f24604c = null;
        }
        if (cd1Var != null) {
            a aVar2 = new a(cd1Var);
            this.f24604c = aVar2;
            this.f24602a.a(this.f24603b, aVar2);
        }
    }

    @Override // com.yandex.mobile.ads.impl.nd1
    public final void a(sc1<VideoAd> sc1Var) {
        this.f24602a.g(sc1Var.c());
    }

    @Override // com.yandex.mobile.ads.impl.nd1
    public final void b() {
        this.f24602a.k(this.f24603b);
    }

    @Override // com.yandex.mobile.ads.impl.nd1
    public final void c() {
        this.f24602a.i(this.f24603b);
    }

    @Override // com.yandex.mobile.ads.impl.nd1
    public final long d() {
        return this.f24602a.a(this.f24603b);
    }

    @Override // com.yandex.mobile.ads.impl.nd1
    public final void e() {
        this.f24602a.f(this.f24603b);
    }

    public final void f() {
        this.f24602a.h(this.f24603b);
    }

    public final void g() {
        this.f24602a.j(this.f24603b);
    }

    @Override // com.yandex.mobile.ads.impl.nd1
    public final long getAdPosition() {
        return this.f24602a.b(this.f24603b);
    }

    @Override // com.yandex.mobile.ads.impl.nd1
    public final float getVolume() {
        return this.f24602a.c(this.f24603b);
    }

    @Override // com.yandex.mobile.ads.impl.nd1
    public final boolean isPlayingAd() {
        return this.f24602a.d(this.f24603b);
    }
}
