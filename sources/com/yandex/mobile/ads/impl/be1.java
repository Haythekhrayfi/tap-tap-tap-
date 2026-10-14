package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class be1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rf1 f19250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f19251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f19252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f19253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f19254e;

    public interface a {
        void a();
    }

    public final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (be1.this.f19253d || !be1.this.f19250a.a()) {
                be1.this.f19252c.postDelayed(this, 200L);
                return;
            }
            be1.this.f19251b.a();
            be1.this.f19253d = true;
            be1.this.b();
        }
    }

    public be1(rf1 rf1Var, a aVar) {
        fd.j0.i(rf1Var, "renderValidator");
        fd.j0.i(aVar, "renderingStartListener");
        this.f19250a = rf1Var;
        this.f19251b = aVar;
        this.f19252c = new Handler(Looper.getMainLooper());
    }

    public final void a() {
        if (this.f19254e || this.f19253d) {
            return;
        }
        this.f19254e = true;
        this.f19252c.post(new b());
    }

    public final void b() {
        this.f19252c.removeCallbacksAndMessages(null);
        this.f19254e = false;
    }
}
