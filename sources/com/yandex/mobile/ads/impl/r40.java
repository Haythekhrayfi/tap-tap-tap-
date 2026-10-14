package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.ad.InstreamAdView;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<InstreamAdView> f24595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<qc1> f24596b;

    public r40(InstreamAdView instreamAdView, List<qc1> list) {
        this.f24595a = new WeakReference<>(instreamAdView);
        this.f24596b = list;
    }

    public final List<qc1> a() {
        return this.f24596b;
    }

    public final InstreamAdView b() {
        return this.f24595a.get();
    }
}
