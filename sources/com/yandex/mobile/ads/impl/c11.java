package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class c11 implements b11 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b90 f19360b;

    public c11(b90 b90Var) {
        fd.j0.i(b90Var, "localStorage");
        this.f19360b = b90Var;
    }

    @Override // com.yandex.mobile.ads.impl.b11
    public final String a() {
        return this.f19360b.b("SessionData");
    }

    @Override // com.yandex.mobile.ads.impl.b11
    public final void a(String str) {
        this.f19360b.putString("SessionData", str);
    }
}
