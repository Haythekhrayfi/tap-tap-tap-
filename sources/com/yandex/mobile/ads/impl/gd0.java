package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.nativeads.MediaView;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public final class gd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k2 f21009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zg1 f21010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final yg1 f21011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f21012d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gd0(Context context, k2 k2Var) {
        this(k2Var, new zg1(context), new yg1(context));
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(k2Var, "adConfiguration");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ gd0(k2 k2Var, zg1 zg1Var, yg1 yg1Var) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        fd.j0.h(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor()");
        this(k2Var, zg1Var, yg1Var, executorServiceNewSingleThreadExecutor);
    }

    public gd0(k2 k2Var, zg1 zg1Var, yg1 yg1Var, Executor executor) {
        fd.j0.i(k2Var, "adConfiguration");
        fd.j0.i(zg1Var, "viewSizeInfoStorage");
        fd.j0.i(yg1Var, "viewSizeInfoReporter");
        fd.j0.i(executor, "executor");
        this.f21009a = k2Var;
        this.f21010b = zg1Var;
        this.f21011c = yg1Var;
        this.f21012d = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(gd0 gd0Var, bh1 bh1Var, wg1 wg1Var) {
        fd.j0.i(gd0Var, "this$0");
        fd.j0.i(bh1Var, "$viewSizeKey");
        fd.j0.i(wg1Var, "$viewSizeInfo");
        gd0Var.f21010b.a(bh1Var, wg1Var);
        gd0Var.f21011c.a(wg1Var, gd0Var.f21009a);
    }

    public final void a(MediaView mediaView, String str) {
        fd.j0.i(mediaView, "view");
        fd.j0.i(str, "mediaType");
        String strC = this.f21009a.c();
        if (strC != null) {
            int iL = this.f21009a.l();
            wg1 wg1VarA = ah1.a(mediaView, str);
            this.f21012d.execute(new ap1(this, new bh1(iL, strC), wg1VarA));
        }
    }
}
