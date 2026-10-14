package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.metrica.IReporter;

/* JADX INFO: loaded from: classes3.dex */
public final class qe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile pe0 f24464a;

    private static pe0 a(Context context) {
        w01 w01Var = new w01();
        i01 i01VarB = i01.b();
        fd.j0.h(i01VarB, "getInstance()");
        kw0 kw0Var = new kw0(w01Var, i01VarB);
        IReporter iReporterA = new ca(kw0Var).a(context);
        new oz0(iReporterA, kw0Var).a();
        return new pe0(iReporterA);
    }

    public static final iw0 b(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        if (f24464a == null) {
            int i10 = pe0.f24047c;
            synchronized (pe0.a.a()) {
                if (f24464a == null) {
                    Context applicationContext = context.getApplicationContext();
                    fd.j0.h(applicationContext, "applicationContext");
                    f24464a = a(applicationContext);
                }
            }
        }
        pe0 pe0Var = f24464a;
        if (pe0Var != null) {
            return pe0Var;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
