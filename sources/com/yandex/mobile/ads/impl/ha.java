package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class ha extends nx<ha> {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final rt0 f21346u;

    public /* synthetic */ ha(Context context, AdResponse adResponse, k2 k2Var, pw pwVar) {
        this(context, adResponse, k2Var, pwVar, new rt0(), new iw(), new pz());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(Context context, AdResponse<String> adResponse, k2 k2Var, pw<ha> pwVar, rt0 rt0Var, iw iwVar, pz pzVar) {
        super(context, adResponse, k2Var, rt0Var, iwVar, pwVar);
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(adResponse, "adResponse");
        fd.j0.i(k2Var, "adConfiguration");
        fd.j0.i(pwVar, "fullScreenController");
        fd.j0.i(rt0Var, "proxyFullScreenShowEventListener");
        fd.j0.i(iwVar, "adVisibilityValidator");
        fd.j0.i(pzVar, "htmlAdResponseReportManager");
        this.f21346u = rt0Var;
        pzVar.a(adResponse);
    }

    public final void a(yw ywVar) {
        fd.j0.i(ywVar, "showEventListener");
        this.f21346u.a(ywVar);
    }

    @Override // com.yandex.mobile.ads.impl.nx
    public final nx n() {
        return this;
    }
}
