package com.yandex.mobile.ads.impl;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class mg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lg1 f23072a;

    public mg1(lg1 lg1Var) {
        this.f23072a = lg1Var;
    }

    public final boolean a() {
        View view = this.f23072a.getView();
        return (view == null || eh1.d(view) || eh1.b(view) < 1) ? false : true;
    }
}
