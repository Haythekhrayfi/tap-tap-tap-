package com.yandex.mobile.ads.impl;

import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes3.dex */
public final class e11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f20028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f20029b = new int[10];

    public final int a() {
        if ((this.f20028a & 2) != 0) {
            return this.f20029b[1];
        }
        return -1;
    }

    public final int a(int i10) {
        return this.f20029b[i10];
    }

    public final void a(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f20029b;
            if (i10 >= iArr.length) {
                return;
            }
            this.f20028a = (1 << i10) | this.f20028a;
            iArr[i10] = i11;
        }
    }

    public final void a(e11 e11Var) {
        fd.j0.i(e11Var, "other");
        for (int i10 = 0; i10 < 10; i10++) {
            if (e11Var.c(i10)) {
                a(i10, e11Var.f20029b[i10]);
            }
        }
    }

    public final int b() {
        return (this.f20028a & 128) != 0 ? this.f20029b[7] : Settings.DEFAULT_INITIAL_WINDOW_SIZE;
    }

    public final int b(int i10) {
        return (this.f20028a & 32) != 0 ? this.f20029b[5] : i10;
    }

    public final int c() {
        if ((this.f20028a & 16) != 0) {
            return this.f20029b[4];
        }
        return Integer.MAX_VALUE;
    }

    public final boolean c(int i10) {
        return ((1 << i10) & this.f20028a) != 0;
    }

    public final int d() {
        return Integer.bitCount(this.f20028a);
    }
}
