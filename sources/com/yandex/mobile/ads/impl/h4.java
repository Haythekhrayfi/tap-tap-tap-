package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;

/* JADX INFO: loaded from: classes3.dex */
public final class h4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h6 f21300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d4 f21301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final lr0 f21302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final nr0 f21303d;

    public interface a {
        void a();
    }

    public h4(g6 g6Var, kr0 kr0Var) {
        this.f21300a = g6Var.b();
        this.f21301b = g6Var.c();
        this.f21302c = kr0Var.d();
        this.f21303d = kr0Var.e();
    }

    public final void a(n3 n3Var, int i10, a aVar) {
        int iA = n3Var.a();
        int iB = n3Var.b();
        AdPlaybackState adPlaybackStateA = this.f21301b.a();
        if (adPlaybackStateA.isAdInErrorState(iA, iB)) {
            return;
        }
        if (a6.a(2, i10)) {
            int i11 = adPlaybackStateA.getAdGroup(iA).count;
            while (iB < i11) {
                adPlaybackStateA = adPlaybackStateA.withSkippedAd(iA, iB).withAdResumePositionUs(0L);
                iB++;
            }
        } else {
            adPlaybackStateA = adPlaybackStateA.withSkippedAd(iA, iB).withAdResumePositionUs(0L);
        }
        this.f21301b.a(adPlaybackStateA);
        this.f21303d.b();
        aVar.a();
        if (this.f21302c.c()) {
            return;
        }
        this.f21300a.a((pr0) null);
    }
}
