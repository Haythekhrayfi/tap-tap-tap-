package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public class ge implements vz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kp0 f21013a;

    public ge(kp0 kp0Var) {
        this.f21013a = kp0Var;
        kp0Var.setId(2);
    }

    public void a(b00 b00Var) {
        this.f21013a.setHtmlWebViewListener(b00Var);
    }

    @Override // com.yandex.mobile.ads.impl.vz
    public void a(String str) {
        this.f21013a.a(str);
    }

    @Override // com.yandex.mobile.ads.impl.vz
    public void invalidate() {
        this.f21013a.e();
    }
}
