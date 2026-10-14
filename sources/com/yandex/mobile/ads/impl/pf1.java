package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class pf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f24052a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.yandex.mobile.ads.instream.e f24053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private dt0 f24054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f24055d;

    public class a implements Runnable {
        private a() {
        }

        public /* synthetic */ a(pf1 pf1Var, int i10) {
            this();
        }

        @Override // java.lang.Runnable
        public final void run() {
            long jC = pf1.this.f24053b.c();
            if (pf1.this.f24054c != null) {
                ((sr0) pf1.this.f24054c).a(jC);
            }
            if (pf1.this.f24055d) {
                pf1.this.f24052a.postDelayed(this, 200L);
            }
        }
    }

    public pf1(com.yandex.mobile.ads.instream.e eVar) {
        this.f24053b = eVar;
    }

    public final void a() {
        if (this.f24055d) {
            return;
        }
        this.f24055d = true;
        this.f24052a.post(new a(this, 0));
    }

    public final void a(dt0 dt0Var) {
        this.f24054c = dt0Var;
    }

    public final void b() {
        if (this.f24055d) {
            this.f24052a.removeCallbacksAndMessages(null);
            this.f24055d = false;
        }
    }
}
