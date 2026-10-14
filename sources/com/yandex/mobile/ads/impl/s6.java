package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class s6 implements o91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sr f24987a = new sr();

    @Override // com.yandex.mobile.ads.impl.o91
    public final int a() {
        return 1;
    }

    @Override // com.yandex.mobile.ads.impl.o91
    public final String a(Context context, k2 k2Var, w01 w01Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(k2Var, "adConfiguration");
        fd.j0.i(w01Var, "sensitiveModeChecker");
        String strA = yu.a(context, k2Var, w01Var).a();
        fd.j0.h(strA, "configureFetchUrlBuilder…itiveModeChecker).build()");
        return this.f24987a.a(context, strA);
    }

    @Override // com.yandex.mobile.ads.impl.o91
    public final String a(k2 k2Var) {
        fd.j0.i(k2Var, "adConfiguration");
        return yu.a(k2Var);
    }
}
