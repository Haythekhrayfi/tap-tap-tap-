package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class cq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f19612a;

    public cq0(Context context) {
        this.f19612a = context.getApplicationContext();
    }

    private boolean a(String str) {
        try {
            return this.f19612a.checkCallingOrSelfPermission(str) == 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final boolean a() {
        return a("android.permission.ACCESS_COARSE_LOCATION");
    }

    public final boolean b() {
        return a("android.permission.ACCESS_FINE_LOCATION");
    }
}
