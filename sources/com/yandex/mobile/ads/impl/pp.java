package com.yandex.mobile.ads.impl;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class pp implements p7.l0 {
    @Override // p7.l0
    public final void bindView(View view, y9.i1 i1Var, i8.k kVar) {
    }

    @Override // p7.l0
    public final View createView(y9.i1 i1Var, i8.k kVar) {
        return new mu0(kVar.getContext());
    }

    @Override // p7.l0
    public final boolean isCustomTypeSupported(String str) {
        return "rating".equals(str);
    }

    @Override // p7.l0
    public /* bridge */ /* synthetic */ p7.y0.d preload(y9.i1 i1Var, p7.y0.a aVar) {
        super.preload(i1Var, aVar);
        return p7.z0.f34622b;
    }

    @Override // p7.l0
    public final void release(View view, y9.i1 i1Var) {
    }
}
