package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class xc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f26490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f26491b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zc1 f26492c;

    public xc1(Context context, w3 w3Var) {
        this.f26490a = context.getApplicationContext();
        this.f26492c = new zc1(context, w3Var);
    }

    public final void a(ab1 ab1Var, xa1 xa1Var) {
        this.f26492c.a(ab1Var, this.f26491b, new db1(this.f26490a, xa1Var));
    }

    public final void a(wh1 wh1Var, k40 k40Var) {
        this.f26492c.a(wh1Var, this.f26491b, k40Var);
    }
}
