package com.yandex.mobile.ads.impl;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class ng1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lg1 f23383a;

    public ng1(lg1 lg1Var) {
        this.f23383a = lg1Var;
    }

    public final boolean a() {
        View view = this.f23383a.getView();
        return (view == null || eh1.d(view) || !eh1.a(view, 50)) ? false : true;
    }
}
