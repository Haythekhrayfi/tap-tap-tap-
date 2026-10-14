package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class ey0 {
    public static dy0 a(Context context, ww wwVar, w3 w3Var, pz pzVar, cy0 cy0Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(wwVar, "loadEventListener");
        fd.j0.i(w3Var, "adLoadingPhasesManager");
        fd.j0.i(pzVar, "htmlAdResponseReportManager");
        fd.j0.i(cy0Var, "rewardedAdContentControllerFactory");
        return new dy0(context, wwVar, w3Var, pzVar, cy0Var);
    }
}
