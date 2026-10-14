package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.yandex.mobile.ads.impl.gh1.a;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class ot<T extends View & gh1.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f23896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f23897b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final mt f23898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final xo0 f23899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Runnable f23900e;

    public static class a<T extends View & gh1.a> implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<xo0> f23901b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<T> f23902c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Handler f23903d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final mt f23904e;

        public a(T t10, xo0 xo0Var, Handler handler, mt mtVar) {
            this.f23902c = new WeakReference<>(t10);
            this.f23901b = new WeakReference<>(xo0Var);
            this.f23903d = handler;
            this.f23904e = mtVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            T t10 = this.f23902c.get();
            xo0 xo0Var = this.f23901b.get();
            if (t10 == null || xo0Var == null) {
                return;
            }
            xo0Var.a(this.f23904e.a(t10));
            this.f23903d.postDelayed(this, 200L);
        }
    }

    public ot(T t10, mt mtVar, xo0 xo0Var) {
        this.f23896a = t10;
        this.f23898c = mtVar;
        this.f23899d = xo0Var;
    }

    public final void a() {
        if (this.f23900e == null) {
            a aVar = new a(this.f23896a, this.f23899d, this.f23897b, this.f23898c);
            this.f23900e = aVar;
            this.f23897b.post(aVar);
        }
    }

    public final void b() {
        this.f23897b.removeCallbacksAndMessages(null);
        this.f23900e = null;
    }
}
