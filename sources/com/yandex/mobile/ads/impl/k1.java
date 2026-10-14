package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p1 f22221a;

    public /* synthetic */ k1(Context context) {
        this(context, new p1(context));
    }

    public k1(Context context, p1 p1Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(p1Var, "adBlockerStatusValidityDurationProvider");
        this.f22221a = p1Var;
    }

    public final boolean a(j1 j1Var) {
        fd.j0.i(j1Var, "adBlockerState");
        return j1Var.a() + this.f22221a.a() < t61.a();
    }
}
