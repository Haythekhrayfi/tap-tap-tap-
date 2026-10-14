package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* JADX INFO: loaded from: classes3.dex */
public final class z50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a60 f27223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bo f27224b;

    public z50(a60 a60Var, or0 or0Var) {
        this.f27223a = a60Var;
        this.f27224b = new bo(or0Var);
    }

    public final a50 a(sc1<VideoAd> sc1Var) {
        a50 a50VarA = this.f27223a.a(sc1Var);
        return a50VarA == null ? this.f27224b.a() : a50VarA;
    }
}
