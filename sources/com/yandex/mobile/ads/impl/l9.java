package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class l9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i01 f22648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qz0 f22649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l1 f22650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f22651d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ l9(Context context) {
        i01 i01VarB = i01.b();
        fd.j0.h(i01VarB, "getInstance()");
        this(context, i01VarB, new qz0());
    }

    public l9(Context context, i01 i01Var, qz0 qz0Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(i01Var, "sdkSettings");
        fd.j0.i(qz0Var, "sdkConfigurationExpiredDateValidator");
        this.f22648a = i01Var;
        this.f22649b = qz0Var;
        this.f22650c = new l1(context);
        this.f22651d = context.getApplicationContext();
    }

    public final boolean a() {
        if (this.f22650c.a().b()) {
            nz0 nz0VarA = this.f22648a.a(this.f22651d);
            if (!((nz0VarA == null || !nz0VarA.u() || this.f22649b.a(nz0VarA)) ? false : true)) {
                return true;
            }
        }
        return false;
    }
}
