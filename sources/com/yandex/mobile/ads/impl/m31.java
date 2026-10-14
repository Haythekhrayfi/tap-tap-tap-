package com.yandex.mobile.ads.impl;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class m31 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o31 f22895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v91 f22896b = new v91();

    public m31(o31 o31Var) {
        this.f22895a = o31Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f22896b.a(view.getContext(), this.f22895a.a());
    }
}
