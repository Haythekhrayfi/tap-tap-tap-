package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.BuildConfigFieldProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class l01 {
    public static boolean a(nz0 nz0Var) {
        fd.j0.i(nz0Var, "sdkConfiguration");
        return !fd.j0.d(BuildConfigFieldProvider.getVersion(), nz0Var.r());
    }
}
