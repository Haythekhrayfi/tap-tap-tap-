package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class z9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile u10 f27257a;

    public static final u10 a(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        if (f27257a == null) {
            int i10 = u10.f25529i;
            synchronized (u10.a.a()) {
                if (f27257a == null) {
                    Context applicationContext = context.getApplicationContext();
                    fd.j0.h(applicationContext, "context.applicationContext");
                    f27257a = new u10(applicationContext);
                }
            }
        }
        u10 u10Var = f27257a;
        fd.j0.f(u10Var);
        return u10Var;
    }
}
