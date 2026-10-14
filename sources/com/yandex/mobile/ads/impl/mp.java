package com.yandex.mobile.ads.impl;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class mp implements p7.l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p7.l0[] f23130a;

    public mp(p7.l0... l0VarArr) {
        this.f23130a = l0VarArr;
    }

    @Override // p7.l0
    public final void bindView(View view, y9.i1 i1Var, i8.k kVar) {
    }

    @Override // p7.l0
    public View createView(y9.i1 i1Var, i8.k kVar) {
        String str = i1Var.f40541i;
        for (p7.l0 l0Var : this.f23130a) {
            if (l0Var.isCustomTypeSupported(str)) {
                return l0Var.createView(i1Var, kVar);
            }
        }
        return new View(kVar.getContext());
    }

    @Override // p7.l0
    public boolean isCustomTypeSupported(String str) {
        for (p7.l0 l0Var : this.f23130a) {
            if (l0Var.isCustomTypeSupported(str)) {
                return true;
            }
        }
        return false;
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
