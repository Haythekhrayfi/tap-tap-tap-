package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class q90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f24371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f24372b;

    public q90() {
        this(0);
    }

    public q90(int i10) {
        this.f24372b = new long[32];
    }

    public final int a() {
        return this.f24371a;
    }

    public final long a(int i10) {
        if (i10 >= 0 && i10 < this.f24371a) {
            return this.f24372b[i10];
        }
        StringBuilder sbA = androidx.appcompat.widget.r0.a("Invalid index ", i10, ", size is ");
        sbA.append(this.f24371a);
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    public final void a(long j10) {
        int i10 = this.f24371a;
        long[] jArr = this.f24372b;
        if (i10 == jArr.length) {
            this.f24372b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f24372b;
        int i11 = this.f24371a;
        this.f24371a = i11 + 1;
        jArr2[i11] = j10;
    }

    public final long[] b() {
        return Arrays.copyOf(this.f24372b, this.f24371a);
    }
}
