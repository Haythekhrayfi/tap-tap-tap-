package com.yandex.mobile.ads.impl;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class ne1 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m80 f23343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fi f23344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nl f23345c;

    public ne1(m80 m80Var, fi fiVar, nl nlVar) {
        this.f23343a = m80Var;
        this.f23344b = fiVar;
        this.f23345c = nlVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        m80 m80Var;
        if (this.f23345c != null) {
            m80Var = new m80(this.f23343a.a(), this.f23343a.c(), this.f23343a.d(), this.f23345c.b(), this.f23343a.b());
        } else {
            m80Var = this.f23343a;
        }
        this.f23344b.a(m80Var).onClick(view);
    }
}
