package com.yandex.mobile.ads.impl;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class dg0 implements b00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yf0 f19859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b00 f19860b;

    public dg0(yf0 yf0Var, b00 b00Var) {
        this.f19859a = yf0Var;
        this.f19860b = b00Var;
    }

    @Override // com.yandex.mobile.ads.impl.b00
    public final void a(kp0 kp0Var, Map map) {
        this.f19859a.a(kp0Var, map);
    }

    @Override // com.yandex.mobile.ads.impl.b00
    public final void a(t2 t2Var) {
        this.f19860b.a(t2Var);
    }

    @Override // com.yandex.mobile.ads.impl.b00
    public final void a(String str) {
        this.f19859a.b(str);
    }

    @Override // com.yandex.mobile.ads.impl.b00
    public final void a(boolean z10) {
        this.f19859a.a(z10);
    }
}
