package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
final class ig implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mw0 f21703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jg f21704c;

    public ig(jg jgVar, mw0 mw0Var) {
        this.f21704c = jgVar;
        this.f21703b = mw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f21704c.f22037c.put(this.f21703b);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
