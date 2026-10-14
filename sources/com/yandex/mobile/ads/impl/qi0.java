package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class qi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dk0 f24514a = new dk0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.yandex.mobile.ads.nativeads.i f24515b = new com.yandex.mobile.ads.nativeads.i();

    public final com.yandex.mobile.ads.nativeads.h a(Context context, wh0 wh0Var, g20 g20Var, com.yandex.mobile.ads.nativeads.j jVar, pi0 pi0Var, qh0 qh0Var) {
        if (qh0Var == null) {
            return null;
        }
        Objects.requireNonNull(this.f24514a);
        ck0 ck0VarA = dk0.a();
        jm0 jm0VarA = pi0Var.d().a(qh0Var);
        vv vvVar = new vv();
        lm0 lm0VarA = jVar.a(wh0Var, qh0Var);
        Objects.requireNonNull(this.f24515b);
        return ck0VarA.a(context, qh0Var, new com.yandex.mobile.ads.nativeads.r(context, qh0Var, g20Var, jm0VarA), g20Var, com.yandex.mobile.ads.nativeads.i.a(context, wh0Var, lm0VarA, jm0VarA, pi0Var, vvVar, qh0Var));
    }
}
