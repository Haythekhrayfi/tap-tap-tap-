package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
final class k71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e71 f22282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f22284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f22285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f22287f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f22288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f22289h;

    public k71(e71 e71Var, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        pa.a(iArr.length == jArr2.length);
        pa.a(jArr.length == jArr2.length);
        pa.a(iArr2.length == jArr2.length);
        this.f22282a = e71Var;
        this.f22284c = jArr;
        this.f22285d = iArr;
        this.f22286e = i10;
        this.f22287f = jArr2;
        this.f22288g = iArr2;
        this.f22289h = j10;
        this.f22283b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j10) {
        for (int iA = da1.a(this.f22287f, j10, true); iA < this.f22287f.length; iA++) {
            if ((this.f22288g[iA] & 1) != 0) {
                return iA;
            }
        }
        return -1;
    }
}
