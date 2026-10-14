package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class z7 implements t7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f27227b;

    public z7(String str, Runnable runnable) {
        this.f27226a = str;
        this.f27227b = runnable;
    }

    @Override // com.yandex.mobile.ads.impl.t7
    public final void a() {
        this.f27227b.run();
    }

    @Override // com.yandex.mobile.ads.impl.t7
    public final boolean a(String str, String str2) {
        return "mobileads".equals(str) && this.f27226a.equals(str2);
    }
}
