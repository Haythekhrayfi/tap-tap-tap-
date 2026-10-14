package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class lo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f22740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f22742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f22743d;

    public lo() {
        this(1.0f, 2500, 1);
    }

    public lo(float f10, int i10, int i11) {
        this.f22740a = i10;
        this.f22742c = i11;
        this.f22743d = f10;
    }

    public final int a() {
        return this.f22741b;
    }

    public final void a(bi1 bi1Var) throws bi1 {
        int i10 = this.f22741b + 1;
        this.f22741b = i10;
        int i11 = this.f22740a;
        this.f22740a = i11 + ((int) (i11 * this.f22743d));
        if (!(i10 <= this.f22742c)) {
            throw bi1Var;
        }
    }

    public final int b() {
        return this.f22740a;
    }
}
