package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class cp0 implements zo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f19605a;

    public cp0(int i10) {
        this.f19605a = i10;
    }

    @Override // com.yandex.mobile.ads.impl.zo
    public final boolean a(Context context) {
        return this.f19605a == context.getResources().getConfiguration().orientation;
    }
}
