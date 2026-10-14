package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b90 f23864a;

    public oo0(b90 b90Var) {
        fd.j0.i(b90Var, "localStorage");
        this.f23864a = b90Var;
    }

    public final String a() {
        return this.f23864a.b("YmadOmSdkJs");
    }

    public final void a(String str) {
        this.f23864a.putString("YmadOmSdkJs", str);
    }

    public final String b() {
        return this.f23864a.b("YmadOmSdkJsUrl");
    }

    public final void b(String str) {
        this.f23864a.putString("YmadOmSdkJsUrl", str);
    }
}
