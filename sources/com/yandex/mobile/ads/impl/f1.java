package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;

/* JADX INFO: loaded from: classes3.dex */
public final class f1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f20478f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile f1 f20479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f20480h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xy f20481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i1 f20482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h1 f20483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f20484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f20485e;

    public static final class a {
        public static f1 a(Context context) {
            fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            if (f1.f20479g == null) {
                synchronized (f1.f20478f) {
                    if (f1.f20479g == null) {
                        f1.f20479g = new f1(context);
                    }
                }
            }
            f1 f1Var = f1.f20479g;
            fd.j0.f(f1Var);
            return f1Var;
        }
    }

    public final class b implements g1 {
        public b() {
        }

        @Override // com.yandex.mobile.ads.impl.g1
        public final void a() {
            Object obj = f1.f20478f;
            f1 f1Var = f1.this;
            synchronized (obj) {
                f1Var.f20484d = false;
            }
            f1.this.f20483c.a();
        }
    }

    public /* synthetic */ f1(Context context) {
        this(context, new xy(context), new i1(context), new h1());
    }

    public f1(Context context, xy xyVar, i1 i1Var, h1 h1Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(xyVar, "hostAccessAdBlockerDetectionController");
        fd.j0.i(i1Var, "adBlockerDetectorRequestPolicy");
        fd.j0.i(h1Var, "adBlockerDetectorListenerRegistry");
        this.f20481a = xyVar;
        this.f20482b = i1Var;
        this.f20483c = h1Var;
        this.f20485e = new b();
    }

    public final void a(g1 g1Var) {
        fd.j0.i(g1Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        synchronized (f20478f) {
            this.f20483c.b(g1Var);
        }
    }

    public final void b(g1 g1Var) {
        fd.j0.i(g1Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        if (!this.f20482b.a()) {
            g1Var.a();
            return;
        }
        boolean z10 = false;
        synchronized (f20478f) {
            if (!this.f20484d) {
                this.f20484d = true;
                z10 = true;
            }
            this.f20483c.a(g1Var);
        }
        if (z10) {
            this.f20481a.a(this.f20485e);
        }
    }
}
