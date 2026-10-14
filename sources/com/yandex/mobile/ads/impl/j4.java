package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.util.Assertions;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* JADX INFO: loaded from: classes3.dex */
public final class j4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h6 f21939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q3 f21940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i4 f21941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final lr0 f21942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final er0 f21943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h4 f21944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final o50 f21945g = o50.a();

    public j4(g6 g6Var, kr0 kr0Var, i4 i4Var) {
        this.f21939a = g6Var.b();
        this.f21940b = g6Var.a();
        this.f21942d = kr0Var.d();
        this.f21943e = kr0Var.b();
        this.f21941c = i4Var;
        this.f21944f = new h4(g6Var, kr0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(VideoAd videoAd) {
        this.f21941c.onAdSkipped(videoAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(VideoAd videoAd) {
        this.f21941c.onAdStopped(videoAd);
    }

    public final void c(VideoAd videoAd) {
        if (n40.f23218c.equals(this.f21939a.a(videoAd))) {
            this.f21939a.a(videoAd, n40.f23219d);
            pr0 pr0VarB = this.f21939a.b();
            Assertions.checkState(videoAd.equals(pr0VarB != null ? pr0VarB.b() : null));
            this.f21942d.a(false);
            this.f21943e.a();
            this.f21941c.onAdPaused(videoAd);
        }
    }

    public final void d(VideoAd videoAd) {
        n40 n40VarA = this.f21939a.a(videoAd);
        if (n40.f23216a.equals(n40VarA) || n40.f23217b.equals(n40VarA)) {
            this.f21939a.a(videoAd, n40.f23218c);
            this.f21939a.a(new pr0((n3) Assertions.checkNotNull(this.f21940b.a(videoAd)), videoAd));
            this.f21941c.onAdStarted(videoAd);
        } else if (n40.f23219d.equals(n40VarA)) {
            pr0 pr0VarB = this.f21939a.b();
            Assertions.checkState(videoAd.equals(pr0VarB != null ? pr0VarB.b() : null));
            this.f21939a.a(videoAd, n40.f23218c);
            this.f21941c.onAdResumed(videoAd);
        }
    }

    public final void e(VideoAd videoAd) {
        if (n40.f23219d.equals(this.f21939a.a(videoAd))) {
            this.f21939a.a(videoAd, n40.f23218c);
            pr0 pr0VarB = this.f21939a.b();
            Assertions.checkState(videoAd.equals(pr0VarB != null ? pr0VarB.b() : null));
            this.f21942d.a(true);
            this.f21943e.b();
            this.f21941c.onAdResumed(videoAd);
        }
    }

    public final void f(VideoAd videoAd) {
        n3 n3VarA;
        int i10 = 1;
        int i11 = this.f21945g.d() ? 2 : 1;
        ko1 ko1Var = new ko1(this, videoAd, i10);
        n40 n40VarA = this.f21939a.a(videoAd);
        n40 n40Var = n40.f23216a;
        if (n40Var.equals(n40VarA)) {
            n3VarA = this.f21940b.a(videoAd);
            if (n3VarA == null) {
                return;
            }
        } else {
            this.f21939a.a(videoAd, n40Var);
            pr0 pr0VarB = this.f21939a.b();
            if (pr0VarB == null) {
                x60.c("StopAd without playing data", new Object[0]);
                return;
            }
            n3VarA = pr0VarB.a();
        }
        this.f21944f.a(n3VarA, i11, ko1Var);
    }

    public final void g(VideoAd videoAd) {
        n3 n3VarA;
        ko1 ko1Var = new ko1(this, videoAd, 0);
        n40 n40VarA = this.f21939a.a(videoAd);
        n40 n40Var = n40.f23216a;
        if (n40Var.equals(n40VarA)) {
            n3VarA = this.f21940b.a(videoAd);
            if (n3VarA == null) {
                return;
            }
        } else {
            this.f21939a.a(videoAd, n40Var);
            pr0 pr0VarB = this.f21939a.b();
            if (pr0VarB == null) {
                x60.c("StopAd without playing data", new Object[0]);
                return;
            }
            n3VarA = pr0VarB.a();
        }
        this.f21944f.a(n3VarA, 1, ko1Var);
    }
}
