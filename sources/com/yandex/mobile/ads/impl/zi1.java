package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
final class zi1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f27342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c00 f27343d;

    public zi1(int i10, String str, c00 c00Var) {
        this.f27341b = i10;
        this.f27342c = str;
        this.f27343d = c00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((uz) this.f27343d).a(this.f27341b, this.f27342c);
    }
}
