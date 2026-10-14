package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
final class uc implements sc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25596c;

    private uc(int i10, int i11, int i12) {
        this.f25594a = i10;
        this.f25595b = i11;
        this.f25596c = i12;
    }

    public static uc a(mp0 mp0Var) {
        int iK = mp0Var.k();
        mp0Var.f(8);
        int iK2 = mp0Var.k();
        int iK3 = mp0Var.k();
        mp0Var.f(4);
        mp0Var.k();
        mp0Var.f(12);
        return new uc(iK, iK2, iK3);
    }

    @Override // com.yandex.mobile.ads.impl.sc
    public final int getType() {
        return 1751742049;
    }
}
