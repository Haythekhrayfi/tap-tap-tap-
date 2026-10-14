package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class jv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f22162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f22163b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t4 f22164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f22165d;

    public final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t4 f22166b;

        public a(t4 t4Var) {
            this.f22166b = t4Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (jv0.this.f22165d) {
                return;
            }
            if (this.f22166b.a()) {
                jv0.this.f22165d = true;
                ((mv0) jv0.this.f22162a).a();
            } else {
                jv0 jv0Var = jv0.this;
                jv0Var.f22163b.postDelayed(jv0Var.new a(this.f22166b), 300L);
            }
        }
    }

    public interface b {
    }

    public jv0(t4 t4Var, b bVar) {
        this.f22162a = bVar;
        this.f22164c = t4Var;
    }

    public final void a() {
        this.f22163b.post(new a(this.f22164c));
    }

    public final void b() {
        this.f22163b.removeCallbacksAndMessages(null);
    }
}
