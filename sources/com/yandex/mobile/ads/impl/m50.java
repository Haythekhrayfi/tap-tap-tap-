package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* JADX INFO: loaded from: classes3.dex */
public final class m50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w50 f22912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sc1<VideoAd> f22913c;

    public m50(Context context, w50 w50Var, sc1<VideoAd> sc1Var) {
        this.f22911a = context.getApplicationContext();
        this.f22912b = w50Var;
        this.f22913c = sc1Var;
    }

    public final yo0 a() {
        em emVarB = this.f22912b.b();
        i50 i50Var = new i50(this.f22911a, this.f22913c.a());
        return emVarB != null ? new c50(i50Var, this.f22913c.c(), emVarB) : new d50(this.f22911a, i50Var);
    }
}
