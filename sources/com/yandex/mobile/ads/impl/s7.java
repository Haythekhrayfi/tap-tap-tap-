package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class s7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ds f24991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yo0 f24992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y f24993c = new y();

    public s7(ds dsVar, yo0 yo0Var) {
        this.f24991a = dsVar;
        this.f24992b = yo0Var;
    }

    public final void a(View view, k7 k7Var) {
        Objects.requireNonNull(this.f24993c);
        Context contextA = y.a(view);
        if (contextA == null || !t6.a(contextA)) {
            return;
        }
        v7 v7Var = null;
        try {
            v7Var = new v7(contextA);
        } catch (Throwable unused) {
        }
        if (v7Var != null) {
            new o7(new q7(contextA, v7Var).a(), v7Var, this.f24991a, this.f24992b).a(k7Var.b());
        }
    }
}
