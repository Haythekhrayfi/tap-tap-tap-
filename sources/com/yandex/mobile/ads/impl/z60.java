package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class z60 extends vw<d70> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z60(Context context, w3 w3Var, pz pzVar, e70 e70Var, ww<d70> wwVar) {
        super(context, l6.f22628c, wwVar, w3Var, e70Var, pzVar);
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(w3Var, "adLoadingPhasesManager");
        fd.j0.i(pzVar, "htmlAdResponseReportManager");
        fd.j0.i(e70Var, "interstitialContentControllerFactory");
        fd.j0.i(wwVar, "loadEventListener");
    }

    @Override // com.yandex.mobile.ads.impl.vw
    public final pw<d70> a(qw qwVar) {
        fd.j0.i(qwVar, "controllerFactory");
        pw<d70> pwVarA = qwVar.a(this);
        fd.j0.h(pwVarA, "controllerFactory.create…erstitialController(this)");
        return pwVarA;
    }
}
