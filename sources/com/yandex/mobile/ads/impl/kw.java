package com.yandex.mobile.ads.impl;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class kw implements wo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<uk> f22523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private x91 f22524b;

    public final void a(uk ukVar) {
        this.f22523a = new WeakReference<>(ukVar);
    }

    public final void a(x91 x91Var) {
        this.f22524b = x91Var;
    }

    @Override // com.yandex.mobile.ads.impl.wo0
    public final void a(boolean z10) {
        x91 x91Var = this.f22524b;
        if (x91Var != null) {
            x91Var.a(z10);
        }
    }

    @Override // com.yandex.mobile.ads.impl.wo0
    public final void c() {
        WeakReference<uk> weakReference = this.f22523a;
        uk ukVar = weakReference != null ? weakReference.get() : null;
        if (ukVar != null) {
            ukVar.e();
        }
    }
}
