package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class kg1 extends og1<em0, zb1> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final am0 f22406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final hg1 f22407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ig1 f22408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private gg1 f22409e;

    public kg1(em0 em0Var, bf1 bf1Var, k2 k2Var, AdResponse adResponse, v20 v20Var, pl0 pl0Var, zj0 zj0Var) {
        super(em0Var);
        Context context = em0Var.getContext();
        this.f22407c = new hg1();
        this.f22406b = new am0(context, this, bf1Var, k2Var, adResponse, v20Var, pl0Var, zj0Var);
        ig1 ig1Var = new ig1();
        this.f22408d = ig1Var;
        v20Var.a(ig1Var);
    }

    @Override // com.yandex.mobile.ads.impl.og1
    public final void a() {
        gg1 gg1Var = this.f22409e;
        if (gg1Var != null) {
            gg1Var.k();
        }
        this.f22408d.a(null);
    }

    @Override // com.yandex.mobile.ads.impl.og1
    public final void a(View view) {
        em0 em0Var = (em0) view;
        this.f22406b.a(em0Var);
        super.a(em0Var);
    }

    @Override // com.yandex.mobile.ads.impl.og1
    public final void a(qa qaVar, rg1 rg1Var, zb1 zb1Var) {
        zb1 zb1Var2 = zb1Var;
        em0 em0VarB = b();
        if (em0VarB != null) {
            rg1Var.a(em0VarB, qaVar);
            if (zb1Var2 == null || this.f22409e == null) {
                return;
            }
            sc1<vl0> sc1VarA = zb1Var2.a();
            rg1Var.a(qaVar, new oe1(em0VarB, sc1VarA.a()));
            this.f22406b.a(em0VarB, sc1VarA);
        }
    }

    @Override // com.yandex.mobile.ads.impl.og1
    public final /* bridge */ /* synthetic */ boolean a(View view, zb1 zb1Var) {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.og1
    public final void b(View view, zb1 zb1Var) {
        em0 em0Var = (em0) view;
        sc1<vl0> sc1VarA = zb1Var.a();
        hg1 hg1Var = this.f22407c;
        Context context = em0Var.getContext();
        v1 v1Var = v1.f25770d;
        Objects.requireNonNull(hg1Var);
        gg1 gg1VarA = hg1.a(context, sc1VarA, v1Var);
        this.f22409e = gg1VarA;
        this.f22408d.a(gg1VarA);
        this.f22406b.a(em0Var, sc1VarA, this.f22409e);
    }
}
