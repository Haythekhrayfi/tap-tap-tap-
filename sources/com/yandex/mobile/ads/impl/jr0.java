package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* JADX INFO: loaded from: classes3.dex */
public final class jr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h6 f22129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j2 f22130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final se1 f22131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i4 f22132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f22133e = false;

    public jr0(h6 h6Var, j2 j2Var, se1 se1Var, i4 i4Var) {
        this.f22129a = h6Var;
        this.f22130b = j2Var;
        this.f22131c = se1Var;
        this.f22132d = i4Var;
    }

    public final void a(boolean z10, int i10) {
        pr0 pr0VarB = this.f22129a.b();
        if (pr0VarB == null) {
            return;
        }
        VideoAd videoAdB = pr0VarB.b();
        n3 n3VarA = pr0VarB.a();
        if (n40.f23216a.equals(this.f22129a.a(videoAdB))) {
            if (z10 && i10 == 2) {
                this.f22131c.c();
                return;
            }
            return;
        }
        if (i10 == 2) {
            this.f22133e = true;
            this.f22132d.onAdBufferingStarted(videoAdB);
        } else if (i10 == 3 && this.f22133e) {
            this.f22133e = false;
            this.f22132d.onAdBufferingFinished(videoAdB);
        } else if (i10 == 4) {
            this.f22130b.a(n3VarA, videoAdB);
        }
    }
}
