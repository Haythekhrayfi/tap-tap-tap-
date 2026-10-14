package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class ub1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final so0 f25593a = new so0();

    public final tb1 a(Context context, sc1<?> sc1Var, v1 v1Var, cg1 cg1Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(sc1Var, "videoAdInfo");
        fd.j0.i(v1Var, "adBreakPosition");
        fd.j0.i(cg1Var, "videoEventTracker");
        if (this.f25593a.b(context)) {
            return new tb1(context, sc1Var, v1Var, cg1Var);
        }
        return null;
    }
}
