package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class mg0 extends og1<kg0, wa0> {
    public mg0(kg0 kg0Var) {
        super(kg0Var);
    }

    @Override // com.yandex.mobile.ads.impl.og1
    public final void a(View view) {
        super.a((kg0) view);
    }

    @Override // com.yandex.mobile.ads.impl.og1
    public final void a(qa qaVar, rg1 rg1Var, wa0 wa0Var) {
        kg0 kg0VarB = b();
        if (kg0VarB != null) {
            rg1Var.a(kg0VarB, qaVar);
            rg1Var.a(qaVar, new uf0(kg0VarB));
        }
    }

    @Override // com.yandex.mobile.ads.impl.og1
    public final /* bridge */ /* synthetic */ boolean a(View view, wa0 wa0Var) {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.og1
    public final void b(View view, wa0 wa0Var) {
        kg0 kg0Var = (kg0) view;
        wa0 wa0Var2 = wa0Var;
        String strB = wa0Var2.b();
        if (TextUtils.isEmpty(strB)) {
            return;
        }
        kg0Var.setAspectRatio(wa0Var2.a());
        kg0Var.b(strB);
    }
}
