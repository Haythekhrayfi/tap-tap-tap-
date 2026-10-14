package com.yandex.mobile.ads.impl;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class vv implements wv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<wv> f26088a;

    @Override // com.yandex.mobile.ads.impl.wv
    public final void a() {
        wv wvVar;
        WeakReference<wv> weakReference = this.f26088a;
        if (weakReference == null || (wvVar = weakReference.get()) == null) {
            return;
        }
        wvVar.a();
    }

    public final void a(wv wvVar) {
        this.f26088a = new WeakReference<>(wvVar);
    }
}
