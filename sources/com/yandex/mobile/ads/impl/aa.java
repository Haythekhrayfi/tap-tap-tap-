package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class aa {
    public static boolean a(w9 w9Var) {
        fd.j0.i(w9Var, "appMetricaIdentifiers");
        return a(w9Var.c()) && a(w9Var.a()) && a(w9Var.b());
    }

    private static boolean a(String str) {
        return !(str == null || str.length() == 0);
    }
}
