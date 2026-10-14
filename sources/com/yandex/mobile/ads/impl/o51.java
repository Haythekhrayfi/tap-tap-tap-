package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class o51 implements p70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f23700a;

    public o51(kp0 kp0Var) {
        this.f23700a = a(kp0Var);
    }

    public static boolean a(kp0 kp0Var) {
        return kp0Var.isHardwareAccelerated();
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final String a() {
        return String.format("supports: {inlineVideo: %s}", Boolean.valueOf(this.f23700a));
    }
}
