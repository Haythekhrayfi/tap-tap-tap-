package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class pg0 {
    public static kg0 a(Context context, wa0 wa0Var, v20 v20Var, om0 om0Var) throws xi1 {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(wa0Var, "media");
        fd.j0.i(v20Var, "impressionEventsObservable");
        fd.j0.i(om0Var, "nativeWebViewController");
        kg0 kg0VarB = rg0.f24709c.a(context).b(wa0Var);
        if (kg0VarB == null) {
            try {
                kg0VarB = new kg0(context);
            } catch (Throwable unused) {
                throw new xi1();
            }
        }
        zf0 zf0VarI = kg0VarB.i();
        zf0VarI.a(v20Var);
        zf0VarI.a((hf0) om0Var);
        zf0VarI.a((wo0) om0Var);
        return kg0VarB;
    }
}
