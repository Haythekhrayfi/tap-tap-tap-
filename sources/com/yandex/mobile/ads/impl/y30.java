package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class y30 implements fw0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final uc1 f26691a;

    public y30(VideoAd videoAd) {
        fd.j0.i(videoAd, "videoAd");
        this.f26691a = new uc1(videoAd);
    }

    @Override // com.yandex.mobile.ads.impl.fw0.a
    public final Map<String, Object> a() {
        gw0 gw0Var = new gw0(new LinkedHashMap());
        gw0Var.b(this.f26691a.a(), "product_type");
        Map<String, Object> mapA = gw0Var.a();
        fd.j0.h(mapA, "reportDataWrapper.reportData");
        return mapA;
    }
}
