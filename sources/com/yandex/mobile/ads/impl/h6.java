package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class h6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f21310a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private pr0 f21311b;

    public final n40 a(VideoAd videoAd) {
        n40 n40Var = (n40) this.f21310a.get(videoAd);
        return n40Var != null ? n40Var : n40.f23216a;
    }

    public final void a() {
        this.f21310a.clear();
    }

    public final void a(pr0 pr0Var) {
        this.f21311b = pr0Var;
    }

    public final void a(VideoAd videoAd, n40 n40Var) {
        this.f21310a.put(videoAd, n40Var);
    }

    public final pr0 b() {
        return this.f21311b;
    }

    public final boolean c() {
        Collection collectionValues = this.f21310a.values();
        return collectionValues.contains(n40.f23218c) || collectionValues.contains(n40.f23219d);
    }
}
