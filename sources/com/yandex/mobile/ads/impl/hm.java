package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class hm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21467a;

    public hm(Context context) {
        this.f21467a = context.getApplicationContext();
    }

    public final boolean a() {
        return (this.f21467a.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
