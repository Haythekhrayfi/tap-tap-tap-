package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class am0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final le1 f18991a = new le1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final il0 f18992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final yl0 f18993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zj0 f18994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private xl0 f18995e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private yj0 f18996f;

    public am0(Context context, kg1 kg1Var, bf1 bf1Var, k2 k2Var, AdResponse adResponse, ze1 ze1Var, pl0 pl0Var, zj0 zj0Var) {
        this.f18993c = new yl0(kg1Var, bf1Var, k2Var, adResponse, ze1Var, pl0Var);
        this.f18992b = new il0(context, adResponse, k2Var);
        this.f18994d = zj0Var;
    }

    public final void a(em0 em0Var) {
        xl0 xl0Var = this.f18995e;
        if (xl0Var != null) {
            xl0Var.b(em0Var);
        }
        yj0 yj0Var = this.f18996f;
        if (yj0Var != null) {
            this.f18994d.b(yj0Var);
            this.f18996f = null;
        }
        em0Var.setOnAttachStateChangeListener(null);
    }

    public final void a(em0 em0Var, sc1<vl0> sc1Var) {
        Objects.requireNonNull(this.f18991a);
        vl0 vl0VarC = sc1Var.c();
        em0Var.setAspectRatio(vl0VarC.getAdHeight() != 0 ? vl0VarC.getAdWidth() / vl0VarC.getAdHeight() : 1.7777778f);
        xl0 xl0Var = this.f18995e;
        if (xl0Var != null) {
            xl0Var.a();
        }
    }

    public final void a(em0 em0Var, sc1<vl0> sc1Var, eg1 eg1Var) {
        ft ftVarA = this.f18992b.a(sc1Var);
        xl0 xl0VarA = this.f18993c.a(em0Var.getContext(), ftVarA, sc1Var, eg1Var);
        this.f18995e = xl0VarA;
        xl0VarA.a(em0Var);
        yj0 yj0Var = new yj0(ftVarA);
        this.f18996f = yj0Var;
        this.f18994d.a(yj0Var);
        em0Var.setOnAttachStateChangeListener(new ml0(ftVarA, em0Var));
    }
}
