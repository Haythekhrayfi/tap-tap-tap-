package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ek0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dk0 f20265a = new dk0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m6 f20266b = new m6();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.yandex.mobile.ads.nativeads.i f20267c = new com.yandex.mobile.ads.nativeads.i();

    public final ArrayList a(Context context, wh0 wh0Var, g20 g20Var, pi0 pi0Var, vv vvVar) {
        ArrayList arrayList = new ArrayList();
        List<qh0> listD = wh0Var.c().d();
        km0 km0VarD = pi0Var.d();
        for (qh0 qh0Var : listD) {
            jm0 jm0VarA = km0VarD.a(qh0Var);
            com.yandex.mobile.ads.nativeads.r rVar = new com.yandex.mobile.ads.nativeads.r(context, qh0Var, g20Var, jm0VarA);
            lm0 lm0VarA = this.f20266b.a(qh0Var);
            Objects.requireNonNull(this.f20267c);
            com.yandex.mobile.ads.nativeads.a aVarA = com.yandex.mobile.ads.nativeads.i.a(context, wh0Var, lm0VarA, jm0VarA, pi0Var, vvVar, qh0Var);
            Objects.requireNonNull(this.f20265a);
            arrayList.add(dk0.a().a(context, qh0Var, rVar, g20Var, aVarA));
        }
        return arrayList;
    }
}
