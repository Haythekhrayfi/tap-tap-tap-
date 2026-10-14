package com.yandex.mobile.ads.impl;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class if0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicBoolean f21702a = new AtomicBoolean(false);

    public static final void a() {
        if (f21702a.compareAndSet(false, true)) {
            o60.b("Yandex Mobile Ads 5.10.0 initialized successfully", new Object[0]);
        }
    }
}
