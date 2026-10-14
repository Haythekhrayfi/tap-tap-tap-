package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class sh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j71 f25103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f25104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f25105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f25106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f25107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f25108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f25109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f25110h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f25111i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f25112j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long[] f25113k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int[] f25114l;

    public sh(int i10, int i11, long j10, int i12, j71 j71Var) {
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        pa.a(z10);
        this.f25106d = j10;
        this.f25107e = i12;
        this.f25103a = j71Var;
        this.f25104b = a(i10, i11 == 2 ? 1667497984 : 1651965952);
        this.f25105c = i11 == 2 ? a(i10, 1650720768) : -1;
        this.f25113k = new long[512];
        this.f25114l = new int[512];
    }

    private static int a(int i10, int i11) {
        return (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48) | i11;
    }

    public final void a() {
        this.f25113k = Arrays.copyOf(this.f25113k, this.f25112j);
        this.f25114l = Arrays.copyOf(this.f25114l, this.f25112j);
    }

    public final void a(long j10) {
        if (this.f25112j == this.f25114l.length) {
            long[] jArr = this.f25113k;
            this.f25113k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f25114l;
            this.f25114l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f25113k;
        int i10 = this.f25112j;
        jArr2[i10] = j10;
        this.f25114l[i10] = this.f25111i;
        this.f25112j = i10 + 1;
    }

    public final boolean a(int i10) {
        return this.f25104b == i10 || this.f25105c == i10;
    }

    public final boolean a(xn xnVar) throws IOException {
        int i10 = this.f25109g;
        int iB = i10 - this.f25103a.b(xnVar, i10, false);
        this.f25109g = iB;
        boolean z10 = iB == 0;
        if (z10) {
            if (this.f25108f > 0) {
                j71 j71Var = this.f25103a;
                int i11 = this.f25110h;
                j71Var.a((this.f25106d * ((long) i11)) / ((long) this.f25107e), Arrays.binarySearch(this.f25114l, i11) >= 0 ? 1 : 0, this.f25108f, 0, null);
            }
            this.f25110h++;
        }
        return z10;
    }

    public final p01.a b(long j10) {
        long j11 = 1;
        int i10 = (int) (j10 / ((this.f25106d * j11) / ((long) this.f25107e)));
        int iA = da1.a(this.f25114l, i10, true, true);
        int[] iArr = this.f25114l;
        int i11 = iArr[iA];
        if (i11 == i10) {
            r01 r01Var = new r01(((this.f25106d * j11) / ((long) this.f25107e)) * ((long) i11), this.f25113k[iA]);
            return new p01.a(r01Var, r01Var);
        }
        long j12 = i11;
        long j13 = (this.f25106d * j11) / ((long) this.f25107e);
        long[] jArr = this.f25113k;
        r01 r01Var2 = new r01(j12 * j13, jArr[iA]);
        int i12 = iA + 1;
        return i12 < jArr.length ? new p01.a(r01Var2, new r01(j13 * ((long) iArr[i12]), jArr[i12])) : new p01.a(r01Var2, r01Var2);
    }

    public final void b() {
        this.f25111i++;
    }

    public final void b(int i10) {
        this.f25108f = i10;
        this.f25109g = i10;
    }

    public final void c(long j10) {
        int i10;
        if (this.f25112j == 0) {
            i10 = 0;
        } else {
            i10 = this.f25114l[da1.b(this.f25113k, j10, true)];
        }
        this.f25110h = i10;
    }
}
