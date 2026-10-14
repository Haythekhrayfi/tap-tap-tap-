package com.yandex.mobile.ads.impl;

import android.text.Layout;

/* JADX INFO: loaded from: classes3.dex */
final class z81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f27238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f27239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f27241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f27242e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f27248k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f27249l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Layout.Alignment f27252o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Layout.Alignment f27253p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private h61 f27255r;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f27243f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f27244g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f27245h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f27246i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f27247j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f27250m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f27251n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f27254q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f27256s = Float.MAX_VALUE;

    public final int a() {
        if (this.f27242e) {
            return this.f27241d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public final z81 a(Layout.Alignment alignment) {
        this.f27253p = alignment;
        return this;
    }

    public final z81 a(h61 h61Var) {
        this.f27255r = h61Var;
        return this;
    }

    public final z81 a(z81 z81Var) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (z81Var != null) {
            if (!this.f27240c && z81Var.f27240c) {
                b(z81Var.f27239b);
            }
            if (this.f27245h == -1) {
                this.f27245h = z81Var.f27245h;
            }
            if (this.f27246i == -1) {
                this.f27246i = z81Var.f27246i;
            }
            if (this.f27238a == null && (str = z81Var.f27238a) != null) {
                this.f27238a = str;
            }
            if (this.f27243f == -1) {
                this.f27243f = z81Var.f27243f;
            }
            if (this.f27244g == -1) {
                this.f27244g = z81Var.f27244g;
            }
            if (this.f27251n == -1) {
                this.f27251n = z81Var.f27251n;
            }
            if (this.f27252o == null && (alignment2 = z81Var.f27252o) != null) {
                this.f27252o = alignment2;
            }
            if (this.f27253p == null && (alignment = z81Var.f27253p) != null) {
                this.f27253p = alignment;
            }
            if (this.f27254q == -1) {
                this.f27254q = z81Var.f27254q;
            }
            if (this.f27247j == -1) {
                this.f27247j = z81Var.f27247j;
                this.f27248k = z81Var.f27248k;
            }
            if (this.f27255r == null) {
                this.f27255r = z81Var.f27255r;
            }
            if (this.f27256s == Float.MAX_VALUE) {
                this.f27256s = z81Var.f27256s;
            }
            if (!this.f27242e && z81Var.f27242e) {
                a(z81Var.f27241d);
            }
            if (this.f27250m == -1 && (i10 = z81Var.f27250m) != -1) {
                this.f27250m = i10;
            }
        }
        return this;
    }

    public final z81 a(String str) {
        this.f27238a = str;
        return this;
    }

    public final z81 a(boolean z10) {
        this.f27245h = z10 ? 1 : 0;
        return this;
    }

    public final void a(float f10) {
        this.f27248k = f10;
    }

    public final void a(int i10) {
        this.f27241d = i10;
        this.f27242e = true;
    }

    public final int b() {
        if (this.f27240c) {
            return this.f27239b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public final z81 b(float f10) {
        this.f27256s = f10;
        return this;
    }

    public final z81 b(Layout.Alignment alignment) {
        this.f27252o = alignment;
        return this;
    }

    public final z81 b(String str) {
        this.f27249l = str;
        return this;
    }

    public final z81 b(boolean z10) {
        this.f27246i = z10 ? 1 : 0;
        return this;
    }

    public final void b(int i10) {
        this.f27239b = i10;
        this.f27240c = true;
    }

    public final z81 c(boolean z10) {
        this.f27243f = z10 ? 1 : 0;
        return this;
    }

    public final String c() {
        return this.f27238a;
    }

    public final void c(int i10) {
        this.f27247j = i10;
    }

    public final float d() {
        return this.f27248k;
    }

    public final z81 d(int i10) {
        this.f27251n = i10;
        return this;
    }

    public final z81 d(boolean z10) {
        this.f27254q = z10 ? 1 : 0;
        return this;
    }

    public final int e() {
        return this.f27247j;
    }

    public final z81 e(int i10) {
        this.f27250m = i10;
        return this;
    }

    public final z81 e(boolean z10) {
        this.f27244g = z10 ? 1 : 0;
        return this;
    }

    public final String f() {
        return this.f27249l;
    }

    public final Layout.Alignment g() {
        return this.f27253p;
    }

    public final int h() {
        return this.f27251n;
    }

    public final int i() {
        return this.f27250m;
    }

    public final float j() {
        return this.f27256s;
    }

    public final int k() {
        int i10 = this.f27245h;
        if (i10 == -1 && this.f27246i == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f27246i == 1 ? 2 : 0);
    }

    public final Layout.Alignment l() {
        return this.f27252o;
    }

    public final boolean m() {
        return this.f27254q == 1;
    }

    public final h61 n() {
        return this.f27255r;
    }

    public final boolean o() {
        return this.f27242e;
    }

    public final boolean p() {
        return this.f27240c;
    }

    public final boolean q() {
        return this.f27243f == 1;
    }

    public final boolean r() {
        return this.f27244g == 1;
    }
}
