package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public final class w60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zg1 f26185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yg1 f26186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f26187c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w60(Context context) {
        this(new zg1(context), new yg1(context));
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ w60(zg1 zg1Var, yg1 yg1Var) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        fd.j0.h(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor()");
        this(zg1Var, yg1Var, executorServiceNewSingleThreadExecutor);
    }

    public w60(zg1 zg1Var, yg1 yg1Var, Executor executor) {
        fd.j0.i(zg1Var, "viewSizeInfoStorage");
        fd.j0.i(yg1Var, "viewSizeInfoReporter");
        fd.j0.i(executor, "executor");
        this.f26185a = zg1Var;
        this.f26186b = yg1Var;
        this.f26187c = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(w60 w60Var, bh1 bh1Var, wg1 wg1Var, k2 k2Var) {
        fd.j0.i(w60Var, "this$0");
        fd.j0.i(bh1Var, "$viewSizeKey");
        fd.j0.i(wg1Var, "$viewSizeInfo");
        fd.j0.i(k2Var, "$adConfiguration");
        w60Var.f26185a.a(bh1Var, wg1Var);
        w60Var.f26186b.a(wg1Var, k2Var);
    }

    public final void a(k2 k2Var, com.yandex.mobile.ads.banner.g gVar) {
        String strC;
        fd.j0.i(k2Var, "adConfiguration");
        if (gVar == null || (strC = k2Var.c()) == null) {
            return;
        }
        int iL = k2Var.l();
        this.f26187c.execute(new io1(this, new bh1(iL, strC), ah1.a(gVar), k2Var));
    }
}
