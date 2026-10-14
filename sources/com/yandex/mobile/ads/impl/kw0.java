package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class kw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w01 f22525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i01 f22526b;

    public kw0(w01 w01Var, i01 i01Var) {
        fd.j0.i(w01Var, "sensitiveModeChecker");
        fd.j0.i(i01Var, "consentProvider");
        this.f22525a = w01Var;
        this.f22526b = i01Var;
    }

    public final boolean a(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        Objects.requireNonNull(this.f22525a);
        return w01.b(context) && this.f22526b.f();
    }

    public final boolean b(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        Objects.requireNonNull(this.f22525a);
        return w01.b(context);
    }
}
