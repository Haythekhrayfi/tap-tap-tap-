package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class a70 {
    public static z60 a(Context context, w3 w3Var, pz pzVar, e70 e70Var, ww wwVar) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(w3Var, "adLoadingPhasesManager");
        fd.j0.i(pzVar, "htmlAdResponseReportManager");
        fd.j0.i(e70Var, "adContentFactory");
        fd.j0.i(wwVar, "loadEventListener");
        return new z60(context, w3Var, pzVar, e70Var, wwVar);
    }
}
