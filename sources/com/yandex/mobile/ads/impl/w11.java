package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class w11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f26133a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26134b;

    public final void a(Runnable runnable) {
        synchronized (this.f26133a) {
            if (this.f26134b) {
                return;
            }
            this.f26134b = true;
            runnable.run();
        }
    }
}
