package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* JADX INFO: loaded from: classes3.dex */
public final class b8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sc1<VideoAd> f19143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c8 f19144b;

    public b8(sc1<VideoAd> sc1Var) {
        this.f19143a = sc1Var;
        this.f19144b = new c8(sc1Var.e());
    }

    public final a8 a() {
        int iA = new c41(this.f19144b).a(this.f19143a);
        o31 o31VarD = this.f19143a.d();
        if (a6.a(2, iA)) {
            return new n31(o31VarD);
        }
        return a6.a(3, iA) ? new mr() : new in();
    }
}
