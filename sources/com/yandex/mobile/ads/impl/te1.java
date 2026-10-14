package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public final class te1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile com.yandex.mobile.ads.exo.offline.c f25349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f25350b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f25351c = 0;

    public static final class a {
        public static com.yandex.mobile.ads.exo.offline.c a(Context context, h41 h41Var, dg dgVar, tn.a aVar, ExecutorService executorService) {
            fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            fd.j0.i(h41Var, "databaseProvider");
            fd.j0.i(dgVar, "cache");
            fd.j0.i(aVar, "upstreamFactory");
            fd.j0.i(executorService, "executor");
            return new com.yandex.mobile.ads.exo.offline.c(context, h41Var, dgVar, aVar, executorService);
        }
    }

    private static com.yandex.mobile.ads.exo.offline.c a(Context context) {
        Context applicationContext = context.getApplicationContext();
        h41 h41Var = new h41(applicationContext);
        at atVarA = at.a();
        fd.j0.h(atVarA, "getInstance()");
        dg dgVarA = atVarA.a(applicationContext);
        fd.j0.h(dgVarA, "cacheProvider.getCache(appContext)");
        zk1 zk1Var = new zk1();
        fd.j0.h(applicationContext, "appContext");
        tn.a aVar = new tn.a(applicationContext, zk1Var.a(applicationContext));
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(4);
        fd.j0.h(executorServiceNewFixedThreadPool, "executor");
        return a.a(applicationContext, h41Var, dgVarA, aVar, executorServiceNewFixedThreadPool);
    }

    public static com.yandex.mobile.ads.exo.offline.c b(Context context) {
        com.yandex.mobile.ads.exo.offline.c cVarA;
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        com.yandex.mobile.ads.exo.offline.c cVar = f25349a;
        if (cVar != null) {
            return cVar;
        }
        synchronized (f25350b) {
            com.yandex.mobile.ads.exo.offline.c cVar2 = f25349a;
            if (cVar2 == null) {
                cVarA = a(context);
                f25349a = cVarA;
            } else {
                cVarA = cVar2;
            }
        }
        return cVarA;
    }
}
