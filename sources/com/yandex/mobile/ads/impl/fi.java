package com.yandex.mobile.ads.impl;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class fi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qa f20713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g2 f20714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.yandex.mobile.ads.nativeads.w f20715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ov0 f20716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wv f20717e;

    public fi(qa qaVar, g2 g2Var, com.yandex.mobile.ads.nativeads.w wVar, ov0 ov0Var, wv wvVar) {
        this.f20713a = qaVar;
        this.f20714b = g2Var;
        this.f20715c = wVar;
        this.f20716d = ov0Var;
        this.f20717e = wvVar;
    }

    public final View.OnClickListener a(m80 m80Var) {
        com.yandex.mobile.ads.nativeads.c cVarG = this.f20715c.g();
        qa qaVar = this.f20713a;
        g2 g2Var = this.f20714b;
        com.yandex.mobile.ads.nativeads.w wVar = this.f20715c;
        return cVarG.a(this.f20717e, this.f20716d, g2Var, wVar, qaVar, m80Var);
    }
}
