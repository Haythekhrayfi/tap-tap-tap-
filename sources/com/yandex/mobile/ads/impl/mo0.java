package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class mo0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f23119g = new a(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f23120h = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile mo0 f23121i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f23122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f23123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final lo0 f23124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io0 f23125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f23127f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(int i10) {
            this();
        }

        public final mo0 a(Context context) {
            fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            mo0 mo0Var = mo0.f23121i;
            if (mo0Var == null) {
                synchronized (this) {
                    mo0Var = mo0.f23121i;
                    if (mo0Var == null) {
                        mo0Var = new mo0(context, 0);
                        mo0.f23121i = mo0Var;
                    }
                }
            }
            return mo0Var;
        }
    }

    private mo0(Context context) {
        this.f23122a = new Object();
        this.f23123b = new Handler(Looper.getMainLooper());
        this.f23124c = new lo0(context);
        this.f23125d = new io0();
    }

    public /* synthetic */ mo0(Context context, int i10) {
        this(context);
    }

    public static final void a(mo0 mo0Var) {
        synchronized (mo0Var.f23122a) {
            mo0Var.f23127f = true;
        }
        synchronized (mo0Var.f23122a) {
            mo0Var.f23123b.removeCallbacksAndMessages(null);
            mo0Var.f23126e = false;
        }
        mo0Var.f23125d.b();
    }

    private final void b() {
        this.f23123b.postDelayed(new pp1(this), f23120h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(mo0 mo0Var) {
        fd.j0.i(mo0Var, "this$0");
        mo0Var.f23124c.a();
        synchronized (mo0Var.f23122a) {
            mo0Var.f23127f = true;
        }
        synchronized (mo0Var.f23122a) {
            mo0Var.f23123b.removeCallbacksAndMessages(null);
            mo0Var.f23126e = false;
        }
        mo0Var.f23125d.b();
    }

    public final void a(ho0 ho0Var) {
        fd.j0.i(ho0Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        synchronized (this.f23122a) {
            this.f23125d.b(ho0Var);
            if (!this.f23125d.a()) {
                this.f23124c.a();
            }
        }
    }

    public final void b(ho0 ho0Var) {
        boolean z10;
        boolean z11;
        fd.j0.i(ho0Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        synchronized (this.f23122a) {
            z10 = true;
            z11 = !this.f23127f;
            if (z11) {
                this.f23125d.a(ho0Var);
            }
        }
        if (!z11) {
            ho0Var.a();
            return;
        }
        synchronized (this.f23122a) {
            if (this.f23126e) {
                z10 = false;
            } else {
                this.f23126e = true;
            }
        }
        if (z10) {
            b();
            this.f23124c.a(new no0(this));
        }
    }
}
