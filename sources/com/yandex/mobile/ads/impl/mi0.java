package com.yandex.mobile.ads.impl;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class mi0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qa f23084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g2 f23085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.yandex.mobile.ads.nativeads.w f23086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wv f23087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ov0 f23088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final m80 f23089f;

    public mi0(wv wvVar, ov0 ov0Var, g2 g2Var, com.yandex.mobile.ads.nativeads.w wVar, qa qaVar, m80 m80Var) {
        this.f23084a = qaVar;
        this.f23085b = g2Var;
        this.f23086c = wVar;
        this.f23088e = ov0Var;
        this.f23089f = m80Var;
        this.f23087d = wvVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long jA = this.f23088e.a();
        m80 m80Var = this.f23089f;
        if (m80Var == null || jA < m80Var.b() || !this.f23084a.e()) {
            return;
        }
        this.f23087d.a();
        this.f23085b.a(view, this.f23084a, this.f23089f, this.f23086c);
    }
}
