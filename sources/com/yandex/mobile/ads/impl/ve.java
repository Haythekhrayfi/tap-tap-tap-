package com.yandex.mobile.ads.impl;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class ve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f25966a = new AtomicBoolean(false);

    public final boolean a() {
        return this.f25966a.get();
    }

    public final void b() {
        this.f25966a.set(true);
    }
}
