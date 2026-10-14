package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes3.dex */
public final class oe1 implements ei {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final em0 f23780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nl f23781b;

    public oe1(em0 em0Var, nl nlVar) {
        this.f23780a = em0Var;
        this.f23781b = nlVar;
    }

    @Override // com.yandex.mobile.ads.impl.ei
    @SuppressLint({"ClickableViewAccessibility"})
    public final void a(m80 m80Var, fi fiVar) {
        xh xhVar = new xh(this.f23780a.getContext(), new ne1(m80Var, fiVar, this.f23781b));
        this.f23780a.setOnTouchListener(xhVar);
        this.f23780a.setOnClickListener(xhVar);
    }
}
