package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m1 f22594a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(Context context) {
        this(context, n1.a.a(context).c());
        int i10 = n1.f23194d;
    }

    public l1(Context context, m1 m1Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(m1Var, "adBlockerStateStorage");
        this.f22594a = m1Var;
    }

    public final j1 a() {
        return this.f22594a.a();
    }
}
