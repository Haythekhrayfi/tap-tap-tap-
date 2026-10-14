package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class jc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w01 f22011a;

    public jc(w01 w01Var) {
        fd.j0.i(w01Var, "sensitiveModeChecker");
        this.f22011a = w01Var;
    }

    public final boolean a(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        Objects.requireNonNull(this.f22011a);
        boolean zC = w01.c(context);
        nz0 nz0VarA = i01.b().a(context);
        return (zC || nz0VarA == null || !nz0VarA.v()) ? false : true;
    }
}
