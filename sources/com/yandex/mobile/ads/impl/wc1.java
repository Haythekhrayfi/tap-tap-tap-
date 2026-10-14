package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class wc1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f26251b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile wc1 f26252c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xw0 f26253a;

    private wc1(xw0 xw0Var) {
        this.f26253a = xw0Var;
    }

    public static wc1 a(Context context) {
        if (f26252c == null) {
            synchronized (f26251b) {
                if (f26252c == null) {
                    f26252c = new wc1(ik1.a(context, 1));
                }
            }
        }
        return f26252c;
    }

    public final void a(Context context, ac1 ac1Var, qa1 qa1Var, sj1 sj1Var) {
        this.f26253a.a(new ib1(context, ac1Var.k(), new gi1.b(sj1Var), ac1Var, new ak1(qa1Var)));
    }

    public final void a(Context context, k2 k2Var, ab1 ab1Var, Object obj, ta1 ta1Var) {
        this.f26253a.a(new bb1().a(context, k2Var, ab1Var, obj, ta1Var));
    }

    public final void a(Context context, k2 k2Var, wh1 wh1Var, Object obj, zh1 zh1Var) {
        this.f26253a.a(new yh1().a(context, k2Var, wh1Var, obj, zh1Var));
    }
}
