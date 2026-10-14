package com.applovin.impl.b.a;

import com.applovin.impl.sdk.o;
import com.applovin.sdk.AppLovinSdkConfiguration;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static List<d> a(o oVar) {
        if (!oVar.aa().b()) {
            return null;
        }
        boolean zC = oVar.C();
        Boolean bool = (Boolean) oVar.b(com.applovin.impl.sdk.c.d.f10400r, Boolean.FALSE);
        if (!zC || bool.booleanValue()) {
            return c(oVar);
        }
        return null;
    }

    public static List<d> a(o oVar, boolean z10) {
        if (!oVar.aa().b()) {
            return null;
        }
        Boolean boolA = com.applovin.impl.b.a.a().a(o.au());
        if (boolA != null && boolA.booleanValue()) {
            return null;
        }
        if (z10) {
            return j.c(oVar);
        }
        boolean zC = oVar.C();
        com.applovin.impl.sdk.c.d<Boolean> dVar = com.applovin.impl.sdk.c.d.f10400r;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = (Boolean) oVar.b(dVar, bool);
        Boolean bool3 = (Boolean) oVar.b(com.applovin.impl.sdk.c.d.f10399q, bool);
        if (!zC) {
            return b(oVar);
        }
        if (bool3.booleanValue() || bool2.booleanValue()) {
            return b(oVar);
        }
        if (oVar.D() || oVar.aD().getConsentDialogState() != AppLovinSdkConfiguration.ConsentDialogState.APPLIES) {
            return null;
        }
        return j.c(oVar);
    }

    private static List<d> b(o oVar) {
        if (AppLovinSdkConfiguration.ConsentDialogState.APPLIES == oVar.aD().getConsentDialogState()) {
            return j.c(oVar);
        }
        return oVar.aa().e() != null ? j.b(oVar) : j.a(oVar);
    }

    private static List<d> c(o oVar) {
        return oVar.aa().e() != null ? j.b(oVar) : j.a(oVar);
    }
}
