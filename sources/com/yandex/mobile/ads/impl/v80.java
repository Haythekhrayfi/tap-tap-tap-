package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class v80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicLong f25902a = new AtomicLong();

    public v80() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v80(long j10, pm pmVar, long j11) {
        this();
        Uri uri = pmVar.f24101a;
        Collections.emptyMap();
    }

    public static long a() {
        return f25902a.getAndIncrement();
    }
}
