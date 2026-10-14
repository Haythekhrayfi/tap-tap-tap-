package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class yy0 implements xy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i01 f27160a;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ yy0() {
        i01 i01VarB = i01.b();
        fd.j0.h(i01VarB, "getInstance()");
        this(i01VarB);
    }

    public yy0(i01 i01Var) {
        fd.j0.i(i01Var, "sdkSettings");
        this.f27160a = i01Var;
    }

    @Override // com.yandex.mobile.ads.impl.xy0
    public final SSLSocketFactory a(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        nz0 nz0VarA = this.f27160a.a(context);
        xk1 xk1VarA = fm.a(context);
        if (nz0VarA != null && nz0VarA.M()) {
            return i80.a(xk1VarA);
        }
        if (!u6.a(21)) {
            return null;
        }
        int i10 = is0.f21813b;
        return is0.a.a();
    }
}
