package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer;

/* JADX INFO: loaded from: classes3.dex */
public final class z90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f27258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w50 f27259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x1 f27260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final da0 f27261d;

    public z90(Context context, w50 w50Var, x1 x1Var, da0 da0Var) {
        this.f27258a = context.getApplicationContext();
        this.f27259b = w50Var;
        this.f27260c = x1Var;
        this.f27261d = da0Var;
    }

    public final y90 a(InstreamAdPlayer instreamAdPlayer) {
        return new y90(this.f27258a, this.f27259b, new d40(instreamAdPlayer), this.f27260c, this.f27261d);
    }
}
