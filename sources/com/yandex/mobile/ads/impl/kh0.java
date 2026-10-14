package com.yandex.mobile.ads.impl;

import android.view.View;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class kh0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r50 f22410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l4 f22411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a50 f22412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final jh0 f22413d;

    public kh0(r50 r50Var, l4 l4Var, a50 a50Var, jh0 jh0Var) {
        this.f22410a = r50Var;
        this.f22411b = l4Var;
        this.f22412c = a50Var;
        this.f22413d = jh0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10 = !(this.f22410a.getVolume() == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        this.f22411b.a(this.f22412c.a(), z10);
        jh0 jh0Var = this.f22413d;
        if (jh0Var != null) {
            jh0Var.setMuted(z10);
        }
    }
}
