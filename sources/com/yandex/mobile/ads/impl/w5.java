package com.yandex.mobile.ads.impl;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w5 {
    public static em1 a(x5 x5Var, y5 y5Var) {
        if (vo0.a()) {
            return new em1(x5Var, y5Var);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public abstract void a();

    public abstract void a(View view);

    public abstract void a(View view, gw gwVar, String str);

    public abstract void b();
}
