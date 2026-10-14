package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class yf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f26839a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26840b = 1;

    public final int a() {
        int i10;
        synchronized (this.f26839a) {
            i10 = this.f26840b;
        }
        return i10;
    }

    public final void a(int i10) {
        synchronized (this.f26839a) {
            this.f26840b = i10;
        }
    }
}
