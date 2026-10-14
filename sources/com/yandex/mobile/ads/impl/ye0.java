package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public final class ye0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExecutorService f26790b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f26789a = new com.applovin.exoplayer2.b.g0(new Handler(Looper.getMainLooper()), 3);

    public final ExecutorService a() {
        return this.f26790b;
    }

    public final Executor b() {
        return this.f26789a;
    }
}
