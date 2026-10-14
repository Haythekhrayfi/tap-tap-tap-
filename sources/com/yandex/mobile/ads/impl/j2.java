package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h6 f21921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d4 f21922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i4 f21923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final cf f21924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ys f21925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final nr0 f21926f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final lr0 f21927g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f4 f21928h = new f4();

    public j2(cf cfVar, g6 g6Var, kr0 kr0Var, i4 i4Var) {
        this.f21924d = cfVar;
        this.f21921a = g6Var.b();
        this.f21922b = g6Var.c();
        this.f21925e = kr0Var.c();
        this.f21927g = kr0Var.d();
        this.f21926f = kr0Var.e();
        this.f21923c = i4Var;
    }

    public final void a(n3 n3Var, VideoAd videoAd) {
        if (!this.f21924d.b()) {
            x60.f("Ad completed callback after release or without playing data", new Object[0]);
            return;
        }
        if (n40.f23216a.equals(this.f21921a.a(videoAd))) {
            AdPlaybackState adPlaybackStateA = this.f21922b.a();
            if (adPlaybackStateA.isAdInErrorState(n3Var.a(), n3Var.b())) {
                x60.c("Invalid state. Ad already skipped.", new Object[0]);
                return;
            }
            this.f21921a.a(videoAd, n40.f23220e);
            this.f21922b.a(adPlaybackStateA.withSkippedAd(n3Var.a(), n3Var.b()));
            return;
        }
        if (!this.f21925e.b()) {
            x60.c("Player were null on ad completion", new Object[0]);
            return;
        }
        int iA = n3Var.a();
        int iB = n3Var.b();
        AdPlaybackState adPlaybackStateA2 = this.f21922b.a();
        boolean zIsAdInErrorState = adPlaybackStateA2.isAdInErrorState(iA, iB);
        Objects.requireNonNull(this.f21928h);
        boolean zA = f4.a(adPlaybackStateA2, iA, iB);
        if (zIsAdInErrorState || zA) {
            x60.c("Invalid state. Ad already skipped or in error state.", new Object[0]);
        } else {
            this.f21921a.a(videoAd, n40.f23222g);
            this.f21922b.a(adPlaybackStateA2.withPlayedAd(iA, iB).withAdResumePositionUs(0L));
            if (!this.f21927g.c()) {
                this.f21921a.a((pr0) null);
            }
        }
        this.f21926f.b();
        this.f21923c.onAdCompleted(videoAd);
    }
}
