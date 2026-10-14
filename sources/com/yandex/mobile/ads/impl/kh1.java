package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class kh1 implements p70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f22414a;

    public kh1(boolean z10) {
        this.f22414a = a(z10);
    }

    public static boolean a(boolean z10) {
        return z10;
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final String a() {
        return String.format("viewable: %s", Boolean.valueOf(this.f22414a));
    }
}
