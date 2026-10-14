package com.yandex.mobile.ads.impl;

import android.app.Dialog;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class o7 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f23706f = TimeUnit.SECONDS.toMillis(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v7 f23707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Dialog f23708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f23709c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ds f23710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final yo0 f23711e;

    public class a implements y7 {
        private a() {
        }

        public /* synthetic */ a(o7 o7Var, int i10) {
            this();
        }
    }

    public class b implements Runnable {
        private b() {
        }

        public /* synthetic */ b(o7 o7Var, int i10) {
            this();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (o7.this.f23708b.getOwnerActivity() == null || o7.this.f23708b.getOwnerActivity().isFinishing()) {
                return;
            }
            o7.this.f23708b.dismiss();
        }
    }

    public o7(Dialog dialog, v7 v7Var, ds dsVar, yo0 yo0Var) {
        this.f23707a = v7Var;
        this.f23708b = dialog;
        this.f23710d = dsVar;
        this.f23711e = yo0Var;
    }

    public static void c(o7 o7Var) {
        o7Var.f23709c.removeCallbacksAndMessages(null);
    }

    public final void a(String str) {
        int i10 = 0;
        this.f23707a.setAdtuneWebViewListener(new a(this, i10));
        this.f23707a.loadUrl(str);
        this.f23709c.postDelayed(new b(this, i10), f23706f);
        this.f23708b.show();
    }
}
