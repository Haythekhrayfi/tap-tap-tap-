package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* JADX INFO: loaded from: classes3.dex */
public final class c3 implements dd1<VideoAd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l2 f19363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dm f19364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private w2 f19365c;

    public c3(l2 l2Var, dm dmVar) {
        fd.j0.i(l2Var, "adCreativePlaybackEventController");
        fd.j0.i(dmVar, "currentAdCreativePlaybackEventListener");
        this.f19363a = l2Var;
        this.f19364b = dmVar;
    }

    private final boolean l(sc1<VideoAd> sc1Var) {
        w2 w2Var = this.f19365c;
        return fd.j0.d(w2Var != null ? w2Var.b() : null, sc1Var);
    }

    @Override // com.yandex.mobile.ads.impl.dd1
    public final void a(sc1<VideoAd> sc1Var) {
        fd.j0.i(sc1Var, "videoAdInfo");
        this.f19363a.f(sc1Var.c());
        if (l(sc1Var)) {
            ((b3.a) this.f19364b).e();
        }
    }

    @Override // com.yandex.mobile.ads.impl.dd1
    public final void a(sc1<VideoAd> sc1Var, float f10) {
        fd.j0.i(sc1Var, "videoAdInfo");
        this.f19363a.a(sc1Var.c(), f10);
    }

    @Override // com.yandex.mobile.ads.impl.dd1
    public final void a(sc1<VideoAd> sc1Var, pd1 pd1Var) {
        fd.j0.i(sc1Var, "videoAdInfo");
        fd.j0.i(pd1Var, "videoAdPlayerError");
        this.f19363a.b(sc1Var.c());
        if (l(sc1Var)) {
            ((b3.a) this.f19364b).a(sc1Var);
        }
    }

    public final void a(w2 w2Var) {
        this.f19365c = w2Var;
    }

    @Override // com.yandex.mobile.ads.impl.dd1
    public final void b(sc1<VideoAd> sc1Var) {
        fd.j0.i(sc1Var, "videoAdInfo");
        this.f19363a.c(sc1Var.c());
        if (l(sc1Var)) {
            ((b3.a) this.f19364b).b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.dd1
    public final void c(sc1<VideoAd> sc1Var) {
        fd.j0.i(sc1Var, "videoAdInfo");
        this.f19363a.i(sc1Var.c());
    }

    @Override // com.yandex.mobile.ads.impl.dd1
    public final void d(sc1<VideoAd> sc1Var) {
        fd.j0.i(sc1Var, "videoAdInfo");
        this.f19363a.g(sc1Var.c());
        if (l(sc1Var)) {
            ((b3.a) this.f19364b).f();
        }
    }

    @Override // com.yandex.mobile.ads.impl.dd1
    public final void e(sc1<VideoAd> sc1Var) {
        fd.j0.i(sc1Var, "videoAdInfo");
        this.f19363a.d(sc1Var.c());
        if (l(sc1Var)) {
            ((b3.a) this.f19364b).c();
        }
    }

    @Override // com.yandex.mobile.ads.impl.dd1
    public final void f(sc1<VideoAd> sc1Var) {
        fd.j0.i(sc1Var, "videoAdInfo");
        this.f19363a.h(sc1Var.c());
        if (l(sc1Var)) {
            ((b3.a) this.f19364b).g();
        }
    }

    @Override // com.yandex.mobile.ads.impl.dd1
    public final void g(sc1<VideoAd> sc1Var) {
        e3 e3VarA;
        s50 s50VarA;
        fd.j0.i(sc1Var, "videoAdInfo");
        w2 w2Var = this.f19365c;
        if (w2Var != null && (e3VarA = w2Var.a(sc1Var)) != null && (s50VarA = e3VarA.a()) != null) {
            s50VarA.e();
        }
        this.f19363a.a();
    }

    @Override // com.yandex.mobile.ads.impl.dd1
    public final void h(sc1<VideoAd> sc1Var) {
        fd.j0.i(sc1Var, "videoAdInfo");
        this.f19363a.e(sc1Var.c());
        if (l(sc1Var)) {
            ((b3.a) this.f19364b).d();
        }
    }

    @Override // com.yandex.mobile.ads.impl.dd1
    public final void i(sc1<VideoAd> sc1Var) {
        fd.j0.i(sc1Var, "videoAdInfo");
        this.f19363a.a(sc1Var.c());
        if (l(sc1Var)) {
            ((b3.a) this.f19364b).a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.dd1
    public final void j(sc1<VideoAd> sc1Var) {
        fd.j0.i(sc1Var, "videoAdInfo");
    }

    @Override // com.yandex.mobile.ads.impl.dd1
    public final void k(sc1<VideoAd> sc1Var) {
        fd.j0.i(sc1Var, "videoAdInfo");
    }
}
