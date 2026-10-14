package com.android.billingclient.api;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements ThreadFactory {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ThreadFactory f3757c = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicInteger f3758d = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f3757c.newThread(runnable);
        threadNewThread.setName("PlayBillingLibrary-" + this.f3758d.getAndIncrement());
        return threadNewThread;
    }
}
