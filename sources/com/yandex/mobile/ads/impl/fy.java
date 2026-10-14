package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class fy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gy f20912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.yandex.mobile.ads.core.identifiers.ad.gms.service.d f20913b;

    public fy(Context context) {
        this.f20912a = new gy(context);
        this.f20913b = new com.yandex.mobile.ads.core.identifiers.ad.gms.service.d(context);
    }

    public final f8 a() {
        f8 f8VarA = this.f20912a.a();
        return f8VarA == null ? this.f20913b.a() : f8VarA;
    }
}
