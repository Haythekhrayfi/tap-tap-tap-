package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class va {
    public static ua a(Context context, sc1 sc1Var, w50 w50Var, eg1 eg1Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(sc1Var, "videoAdInfo");
        fd.j0.i(w50Var, "adBreak");
        fd.j0.i(eg1Var, "videoTracker");
        yo0 yo0VarA = new m50(context, w50Var, sc1Var).a();
        fd.j0.h(yo0VarA, "instreamClickHandlerProvider.openUrlHandler");
        return new ua(sc1Var, yo0VarA, eg1Var);
    }
}
