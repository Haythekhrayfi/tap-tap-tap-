package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class m6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t71 f22916a = new t71();

    public final lm0 a(qh0 qh0Var) {
        t71 t71Var = this.f22916a;
        ArrayList arrayListH = qh0Var.h();
        Objects.requireNonNull(t71Var);
        ArrayList arrayListA = t71.a(arrayListH, null);
        t71 t71Var2 = this.f22916a;
        ArrayList arrayListF = qh0Var.f();
        Objects.requireNonNull(t71Var2);
        return new lm0(qh0Var.b(), arrayListA, t71.a(arrayListF, null), qh0Var.a(), qh0Var.c());
    }
}
