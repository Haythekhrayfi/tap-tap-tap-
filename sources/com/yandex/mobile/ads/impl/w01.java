package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class w01 {
    public static boolean a(Context context) {
        nz0 nz0VarA = i01.b().a(context);
        return nz0VarA != null && nz0VarA.G();
    }

    public static boolean b(Context context) {
        return !c(context);
    }

    public static boolean c(Context context) {
        nz0 nz0VarA = i01.b().a(context);
        return nz0VarA == null || !nz0VarA.W() || a(context);
    }
}
