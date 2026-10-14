package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class v5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f25841a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25842b = 1;

    public final int a() {
        int i10;
        synchronized (this.f25841a) {
            i10 = this.f25842b;
        }
        return i10;
    }

    public final void a(int i10) {
        synchronized (this.f25841a) {
            this.f25842b = i10;
        }
    }
}
