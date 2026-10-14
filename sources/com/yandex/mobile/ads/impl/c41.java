package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class c41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c8 f19390a;

    public c41(c8 c8Var) {
        fd.j0.i(c8Var, "advertiserPresentController");
        this.f19390a = c8Var;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lcom/yandex/mobile/ads/impl/sc1<Lcom/yandex/mobile/ads/video/playback/model/VideoAd;>;)V */
    public final int a(sc1 sc1Var) {
        fd.j0.i(sc1Var, "videoAdInfo");
        if (sc1Var.d() != null) {
            return 2;
        }
        return this.f19390a.a() ? 3 : 1;
    }
}
