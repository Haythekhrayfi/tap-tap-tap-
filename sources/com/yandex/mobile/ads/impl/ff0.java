package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ff0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f20682e = new a(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile ff0 f20683f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f20684a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f20685b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u0 f20686c = new u0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dq0 f20687d = new dq0();

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(int i10) {
            this();
        }

        public final ff0 a() {
            ff0 ff0Var = ff0.f20683f;
            if (ff0Var == null) {
                synchronized (this) {
                    ff0Var = ff0.f20683f;
                    if (ff0Var == null) {
                        ff0Var = new ff0();
                        ff0.f20683f = ff0Var;
                    }
                }
            }
            return ff0Var;
        }
    }

    public static final ff0 b() {
        return f20682e.a();
    }

    public final void a(Context context) throws n60 {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        if (this.f20685b) {
            synchronized (this.f20684a) {
                if (this.f20685b) {
                    if (u6.a(context)) {
                        this.f20686c.a(context);
                        Objects.requireNonNull(this.f20687d);
                        dq0.a(context);
                    }
                    this.f20685b = false;
                }
            }
        }
    }
}
