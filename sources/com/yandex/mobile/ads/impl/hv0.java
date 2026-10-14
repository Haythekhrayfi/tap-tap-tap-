package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
final class hv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gp f21514b = new gp();

    public hv0(Context context) {
        this.f21513a = context.getApplicationContext();
    }

    public final xb0 a() {
        return a6.a(3, this.f21514b.a(this.f21513a)) ? new xb0(1920, 1080, 6800) : new xb0(854, 480, 1000);
    }
}
