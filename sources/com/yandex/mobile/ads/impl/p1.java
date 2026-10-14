package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class p1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f23944c = TimeUnit.HOURS.toMillis(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i01 f23945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f23946b;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ p1(Context context) {
        i01 i01VarB = i01.b();
        fd.j0.h(i01VarB, "getInstance()");
        this(context, i01VarB);
    }

    public p1(Context context, i01 i01Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(i01Var, "sdkSettings");
        this.f23945a = i01Var;
        Context applicationContext = context.getApplicationContext();
        fd.j0.h(applicationContext, "context.applicationContext");
        this.f23946b = applicationContext;
    }

    public final long a() {
        nz0 nz0VarA = this.f23945a.a(this.f23946b);
        Long lA = nz0VarA != null ? nz0VarA.a() : null;
        return lA != null ? lA.longValue() : f23944c;
    }
}
