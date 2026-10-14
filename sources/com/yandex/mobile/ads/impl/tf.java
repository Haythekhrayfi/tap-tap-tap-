package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f25352a;

    public void b() {
        this.f25352a = 0;
    }

    public final void b(int i10) {
        this.f25352a = i10 | this.f25352a;
    }

    public final void c() {
        this.f25352a &= Integer.MAX_VALUE;
    }

    public final boolean c(int i10) {
        return (this.f25352a & i10) == i10;
    }

    public final void d(int i10) {
        this.f25352a = i10;
    }

    public final boolean d() {
        return c(268435456);
    }

    public final boolean e() {
        return c(Integer.MIN_VALUE);
    }

    public final boolean f() {
        return c(4);
    }

    public final boolean g() {
        return c(1);
    }
}
