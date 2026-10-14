package com.yandex.mobile.ads.impl;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class qg1 implements ei {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f24493a;

    public qg1(View view) {
        this.f24493a = view;
    }

    @Override // com.yandex.mobile.ads.impl.ei
    public final void a(m80 m80Var, fi fiVar) {
        ij0 ij0Var = new ij0(this.f24493a.getContext(), fiVar.a(m80Var));
        this.f24493a.setOnTouchListener(ij0Var);
        this.f24493a.setOnClickListener(ij0Var);
    }
}
