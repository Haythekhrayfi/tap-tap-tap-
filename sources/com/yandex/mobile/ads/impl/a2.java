package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q1 f18761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cg1 f18762b;

    public a2(Context context, q1 q1Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(q1Var, "adBreak");
        this.f18761a = q1Var;
        this.f18762b = new cg1(context);
    }

    public final void a() {
        this.f18762b.a(this.f18761a, "breakEnd");
    }

    public final void b() {
        this.f18762b.a(this.f18761a, "error");
    }

    public final void c() {
        this.f18762b.a(this.f18761a, "breakStart");
    }
}
