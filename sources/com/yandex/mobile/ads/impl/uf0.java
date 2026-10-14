package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class uf0 implements ei {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kg0 f25605a;

    public uf0(kg0 kg0Var) {
        this.f25605a = kg0Var;
    }

    @Override // com.yandex.mobile.ads.impl.ei
    public final void a(m80 m80Var, fi fiVar) {
        this.f25605a.setClickListener(new tf0(m80Var, fiVar));
    }
}
