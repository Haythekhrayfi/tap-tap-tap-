package com.yandex.mobile.ads.impl;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class q10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicLong f24297a = new AtomicLong();

    public static long a() {
        return f24297a.getAndIncrement();
    }
}
