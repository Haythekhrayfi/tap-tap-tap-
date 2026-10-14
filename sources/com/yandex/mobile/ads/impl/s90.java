package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class s90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f25001a = new Handler(Looper.getMainLooper());

    public final void a() {
        this.f25001a.removeCallbacksAndMessages(null);
    }

    public final void a(tk1.a aVar) {
        fd.j0.i(aVar, "runnable");
        this.f25001a.postDelayed(aVar, 50L);
    }

    public final void a(Runnable runnable) {
        fd.j0.i(runnable, "runnable");
        this.f25001a.post(runnable);
    }
}
