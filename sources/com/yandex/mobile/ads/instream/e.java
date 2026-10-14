package com.yandex.mobile.ads.instream;

import com.yandex.mobile.ads.impl.kf1;
import com.yandex.mobile.ads.impl.or0;
import com.yandex.mobile.ads.impl.yf1;
import com.yandex.mobile.ads.instream.player.content.VideoPlayer;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements or0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VideoPlayer f27494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yf1 f27495b = new yf1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kf1 f27496c = new kf1();

    public e(VideoPlayer videoPlayer) {
        this.f27494a = videoPlayer;
    }

    public final yf1 a() {
        return this.f27495b;
    }

    public final void a(d dVar) {
        this.f27496c.a(dVar);
    }

    public final long b() {
        return this.f27494a.getVideoDuration();
    }

    public final long c() {
        return this.f27494a.getVideoPosition();
    }

    public final void d() {
        this.f27494a.pauseVideo();
    }

    public final void e() {
        this.f27494a.prepareVideo();
    }

    public final void f() {
        this.f27494a.resumeVideo();
    }

    public final void g() {
        this.f27494a.setVideoPlayerListener(this.f27496c);
    }

    @Override // com.yandex.mobile.ads.impl.or0
    public final float getVolume() {
        return this.f27494a.getVolume();
    }

    public final void h() {
        this.f27494a.setVideoPlayerListener(null);
        this.f27496c.a();
    }
}
