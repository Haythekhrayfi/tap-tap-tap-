package com.yandex.mobile.ads.impl;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class ph0 implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24062a;

    public ph0(String str) {
        this.f24062a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f24062a);
    }
}
