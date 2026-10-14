package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class ai {
    public static zh a(sc1 sc1Var, Context context, w50 w50Var, eg1 eg1Var, dc1 dc1Var, qa qaVar) {
        fd.j0.i(sc1Var, "videoAdInfo");
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(w50Var, "adBreak");
        fd.j0.i(eg1Var, "videoTracker");
        fd.j0.i(dc1Var, "playbackListener");
        d60 d60Var = new d60(new ol());
        nl nlVarA = sc1Var.a();
        fd.j0.h(nlVarA, "videoAdInfo.creative");
        return new zh(context, w50Var, sc1Var, eg1Var, dc1Var, d60Var.a(nlVarA, qaVar != null ? qaVar.b() : null));
    }
}
