package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class pd0 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.yandex.mobile.ads.mediation.base.b f24041a = new com.yandex.mobile.ads.mediation.base.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hd0 f24042b;

    public pd0(hd0 hd0Var) {
        this.f24042b = hd0Var;
    }

    @Override // com.yandex.mobile.ads.impl.b1
    public final Map<String, Object> a() {
        gw0 gw0Var = new gw0(new HashMap());
        hd0 hd0Var = this.f24042b;
        if (hd0Var != null) {
            ce0 ce0VarB = hd0Var.b();
            com.yandex.mobile.ads.mediation.base.a aVarA = this.f24042b.a();
            gw0Var.b(ce0VarB.c(), "adapter");
            gw0Var.b(ce0VarB.g(), "adapter_parameters");
            Objects.requireNonNull(this.f24041a);
            gw0Var.a(new HashMap(com.yandex.mobile.ads.mediation.base.b.a(aVarA)));
        }
        return gw0Var.a();
    }
}
