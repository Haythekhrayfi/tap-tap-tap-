package com.yandex.mobile.ads.impl;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class d31 implements n<c31> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h11 f19748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l31 f19749b;

    public d31(h11 h11Var, l31 l31Var) {
        this.f19748a = h11Var;
        this.f19749b = l31Var;
    }

    @Override // com.yandex.mobile.ads.impl.n
    public final void a(View view, m mVar) {
        c31 c31Var = (c31) mVar;
        this.f19748a.a(c31Var.b());
        this.f19749b.a(view, c31Var);
    }
}
