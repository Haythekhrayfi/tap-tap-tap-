package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class sd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final de1 f25047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f25048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f25049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f25050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f25051e;

    public interface a {
        void b();
    }

    public final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (sd1.this.f25050d || !sd1.this.f25047a.a(ce1.f19478c)) {
                sd1.this.f25049c.postDelayed(this, 200L);
                return;
            }
            sd1.this.f25048b.b();
            sd1.this.f25050d = true;
            sd1.this.b();
        }
    }

    public sd1(de1 de1Var, a aVar) {
        fd.j0.i(de1Var, "statusController");
        fd.j0.i(aVar, "preparedListener");
        this.f25047a = de1Var;
        this.f25048b = aVar;
        this.f25049c = new Handler(Looper.getMainLooper());
    }

    public final void a() {
        if (this.f25051e || this.f25050d) {
            return;
        }
        this.f25051e = true;
        this.f25049c.post(new b());
    }

    public final void b() {
        this.f25049c.removeCallbacksAndMessages(null);
        this.f25051e = false;
    }
}
