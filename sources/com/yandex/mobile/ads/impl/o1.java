package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m1 f23669a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1(Context context) {
        this(context, n1.a.a(context).c());
        int i10 = n1.f23194d;
    }

    public o1(Context context, m1 m1Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(m1Var, "adBlockerStateStorage");
        this.f23669a = m1Var;
    }

    public final void a(Boolean bool) {
        if (bool != null) {
            this.f23669a.a(new j1(System.currentTimeMillis(), bool.booleanValue()));
        }
    }
}
