package com.yandex.metrica.impl.ob;

import android.os.Handler;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class RunnableC1795m1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<Handler> f16869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference<J> f16870b;

    public RunnableC1795m1(Handler handler, J j10) {
        this.f16869a = new WeakReference<>(handler);
        this.f16870b = new WeakReference<>(j10);
    }

    @Override // java.lang.Runnable
    public void run() {
        Handler handler = this.f16869a.get();
        J j10 = this.f16870b.get();
        if (handler == null || j10 == null || !j10.e()) {
            return;
        }
        C1770l1.a(handler, j10, this);
    }
}
