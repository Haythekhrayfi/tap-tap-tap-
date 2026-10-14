package com.yandex.mobile.ads.impl;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class t50 implements dd1<VideoAd>, g50.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dd1<VideoAd> f25279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f25280b;

    public t50(dd1<VideoAd> dd1Var) {
        fd.j0.i(dd1Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f25279a = dd1Var;
        this.f25280b = new AtomicInteger(2);
    }

    private final void l(sc1<VideoAd> sc1Var) {
        if (this.f25280b.decrementAndGet() == 0) {
            this.f25279a.e(sc1Var);
        }
    }

    public final void a() {
        this.f25280b.set(2);
    }

    @Override // com.yandex.mobile.ads.impl.dd1
    public final void a(sc1<VideoAd> sc1Var) {
        fd.j0.i(sc1Var, "videoAdInfo");
        this.f25279a.a(sc1Var);
    }

    @Override // com.yandex.mobile.ads.impl.dd1
    public final void a(sc1<VideoAd> sc1Var, float f10) {
        fd.j0.i(sc1Var, "videoAdInfo");
        this.f25279a.a(sc1Var, f10);
    }

    @Override // com.yandex.mobile.ads.impl.dd1
    public final void a(sc1<VideoAd> sc1Var, pd1 pd1Var) {
        fd.j0.i(sc1Var, "videoAdInfo");
        fd.j0.i(pd1Var, "videoAdPlayerError");
        this.f25279a.a(sc1Var, pd1Var);
    }

    @Override // com.yandex.mobile.ads.impl.dd1
    public final void b(sc1<VideoAd> sc1Var) {
        fd.j0.i(sc1Var, "videoAdInfo");
        this.f25279a.b(sc1Var);
    }

    @Override // com.yandex.mobile.ads.impl.dd1
    public final void c(sc1<VideoAd> sc1Var) {
        fd.j0.i(sc1Var, "videoAdInfo");
        this.f25279a.c(sc1Var);
    }

    @Override // com.yandex.mobile.ads.impl.dd1
    public final void d(sc1<VideoAd> sc1Var) {
        fd.j0.i(sc1Var, "videoAdInfo");
        this.f25279a.d(sc1Var);
    }

    @Override // com.yandex.mobile.ads.impl.dd1
    public final void e(sc1<VideoAd> sc1Var) {
        fd.j0.i(sc1Var, "videoAdInfo");
        l(sc1Var);
    }

    @Override // com.yandex.mobile.ads.impl.dd1
    public final void f(sc1<VideoAd> sc1Var) {
        fd.j0.i(sc1Var, "videoAdInfo");
        this.f25279a.f(sc1Var);
    }

    @Override // com.yandex.mobile.ads.impl.dd1
    public final void g(sc1<VideoAd> sc1Var) {
        fd.j0.i(sc1Var, "videoAdInfo");
        this.f25279a.g(sc1Var);
    }

    @Override // com.yandex.mobile.ads.impl.dd1
    public final void h(sc1<VideoAd> sc1Var) {
        fd.j0.i(sc1Var, "videoAdInfo");
        this.f25279a.h(sc1Var);
    }

    @Override // com.yandex.mobile.ads.impl.dd1
    public final void i(sc1<VideoAd> sc1Var) {
        fd.j0.i(sc1Var, "videoAdInfo");
        this.f25279a.i(sc1Var);
    }

    @Override // com.yandex.mobile.ads.impl.dd1
    public final void j(sc1<VideoAd> sc1Var) {
        fd.j0.i(sc1Var, "videoAdInfo");
        this.f25279a.j(sc1Var);
    }

    @Override // com.yandex.mobile.ads.impl.dd1
    public final void k(sc1<VideoAd> sc1Var) {
        fd.j0.i(sc1Var, "videoAdInfo");
        this.f25279a.k(sc1Var);
    }

    public final void m(sc1<VideoAd> sc1Var) {
        fd.j0.i(sc1Var, "videoAdInfo");
        l(sc1Var);
    }
}
