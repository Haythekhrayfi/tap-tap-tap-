package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class q6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t71 f24321a = new t71();

    public final lm0 a(wh0 wh0Var) {
        cj0 cj0VarC = wh0Var.c();
        List<qa<?>> listB = cj0VarC.b();
        t71 t71Var = this.f24321a;
        List<g11> listH = cj0VarC.h();
        Objects.requireNonNull(t71Var);
        ArrayList arrayListA = t71.a(null, listH);
        t71 t71Var2 = this.f24321a;
        List<String> listF = cj0VarC.f();
        Objects.requireNonNull(t71Var2);
        return new lm0(listB, arrayListA, t71.a(null, listF), "ad_unit", null);
    }
}
