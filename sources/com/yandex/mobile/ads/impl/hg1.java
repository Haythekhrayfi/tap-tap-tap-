package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class hg1 {
    public static gg1 a(Context context, sc1 sc1Var, v1 v1Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(sc1Var, "videoAdInfo");
        fd.j0.i(v1Var, "adBreakPosition");
        cg1 cg1Var = new cg1(context);
        we1 we1Var = new we1(context);
        ek ekVar = new ek();
        nl nlVarA = sc1Var.a();
        fd.j0.h(nlVarA, "videoAdInfo.creative");
        ekVar.a(new wl(nlVarA, cg1Var, we1Var));
        ac1 ac1VarE = sc1Var.e();
        fd.j0.h(ac1VarE, "videoAdInfo.vastVideoAd");
        ekVar.a(new fe1(ac1VarE, cg1Var));
        tb1 tb1VarA = new ub1().a(context, sc1Var, v1Var, cg1Var);
        if (tb1VarA != null) {
            ekVar.a(tb1VarA);
        }
        return new gg1(ekVar);
    }
}
