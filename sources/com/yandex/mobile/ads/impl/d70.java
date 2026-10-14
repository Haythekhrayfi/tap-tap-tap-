package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class d70 extends nx<d70> {
    public /* synthetic */ d70(Context context, AdResponse adResponse, k2 k2Var, pw pwVar, tt0 tt0Var) {
        this(context, adResponse, k2Var, pwVar, tt0Var, new pz(), new iw());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d70(Context context, AdResponse adResponse, k2 k2Var, pw pwVar, tt0 tt0Var, pz pzVar, iw iwVar) {
        super(context, adResponse, k2Var, tt0Var, iwVar, pwVar);
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(adResponse, "adResponse");
        fd.j0.i(k2Var, "adConfiguration");
        fd.j0.i(pwVar, "fullScreenController");
        fd.j0.i(tt0Var, "fullScreenShowEventListener");
        fd.j0.i(pzVar, "htmlAdResponseReportManager");
        fd.j0.i(iwVar, "fullScreenAdVisibilityValidator");
        pzVar.a(adResponse);
    }

    @Override // com.yandex.mobile.ads.impl.nx
    public final nx n() {
        return this;
    }
}
