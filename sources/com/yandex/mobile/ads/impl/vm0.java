package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class vm0 {
    public static final ei1 a() {
        return new ei1(new di1(), new zm0());
    }

    public static final fi1 a(Context context, k2 k2Var, hi1 hi1Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(k2Var, "adConfiguration");
        fd.j0.i(hi1Var, "volleyResponseBodyParser");
        return new fi1(context, k2Var, hi1Var);
    }
}
