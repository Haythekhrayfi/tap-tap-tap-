package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class a60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f18802a = new HashMap();

    public final a50 a(sc1<VideoAd> sc1Var) {
        return (a50) this.f18802a.get(sc1Var);
    }

    public final void a(sc1<VideoAd> sc1Var, a50 a50Var) {
        this.f18802a.put(sc1Var, a50Var);
    }
}
