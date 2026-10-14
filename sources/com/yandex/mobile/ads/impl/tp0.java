package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.model.MediationData;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class tp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final up0 f25431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference<ae> f25432b;

    public tp0(ae aeVar, MediationData mediationData, w3 w3Var) {
        this.f25432b = new WeakReference<>(aeVar);
        this.f25431a = new up0(new vp0(z6.a(w3Var.b()), mediationData));
    }

    public final void a() {
        ae aeVar = this.f25432b.get();
        if (aeVar == null || aeVar.k()) {
            return;
        }
        aeVar.a(this.f25431a);
    }
}
