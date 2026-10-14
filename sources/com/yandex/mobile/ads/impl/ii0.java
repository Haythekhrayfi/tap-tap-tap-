package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class ii0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k2 f21717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.yandex.mobile.ads.nativeads.j f21718b = new com.yandex.mobile.ads.nativeads.j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final yh0 f21719c = new yh0();

    public ii0(k2 k2Var) {
        this.f21717a = k2Var;
    }

    public final void a(Context context, wh0 wh0Var, g20 g20Var, pi0 pi0Var, fi0 fi0Var) {
        wk0 wk0VarM = this.f21717a.m();
        Objects.requireNonNull(this.f21719c);
        xh0 xh0VarA = yh0.a(wk0VarM);
        if (xh0VarA != null) {
            xh0VarA.a(context, wh0Var, g20Var, this.f21718b, pi0Var, fi0Var);
        } else {
            fi0Var.a(v4.f25818a);
        }
    }
}
