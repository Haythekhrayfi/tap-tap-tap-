package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class um0 {
    public static cn0 a(Context context, k2 k2Var, kx0 kx0Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(k2Var, "adConfiguration");
        fd.j0.i(kx0Var, "responseBodyParser");
        return new cn0(k2Var, kx0Var);
    }

    public static yz0 a() {
        return new yz0();
    }
}
