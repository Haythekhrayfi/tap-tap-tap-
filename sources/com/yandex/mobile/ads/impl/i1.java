package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l1 f21569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k1 f21570b;

    public /* synthetic */ i1(Context context) {
        this(context, new l1(context), new k1(context));
    }

    public i1(Context context, l1 l1Var, k1 k1Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(l1Var, "adBlockerStateProvider");
        fd.j0.i(k1Var, "adBlockerStateExpiredValidator");
        this.f21569a = l1Var;
        this.f21570b = k1Var;
    }

    public final boolean a() {
        return this.f21570b.a(this.f21569a.a());
    }
}
