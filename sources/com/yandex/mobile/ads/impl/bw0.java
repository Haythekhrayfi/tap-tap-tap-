package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class bw0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kg1 f19334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dw0 f19335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zv0 f19336c;

    public bw0(kg1 kg1Var, dw0 dw0Var, zv0 zv0Var) {
        this.f19334a = kg1Var;
        this.f19335b = dw0Var;
        this.f19336c = zv0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        em0 em0VarB = this.f19334a.b();
        if (em0VarB != null) {
            yv0 yv0VarB = em0VarB.a().b();
            Objects.requireNonNull(this.f19336c);
            yv0VarB.setBackground(null);
            yv0VarB.setVisibility(8);
            yv0VarB.a().setOnClickListener(null);
            this.f19335b.a();
        }
    }
}
