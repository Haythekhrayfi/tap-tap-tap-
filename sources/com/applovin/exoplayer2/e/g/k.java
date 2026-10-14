package com.applovin.exoplayer2.e.g;

import com.applovin.exoplayer2.v;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v f5595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long[] f5597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long[] f5598i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f5599j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final l[] f5600k;

    public k(int i10, int i11, long j10, long j11, long j12, v vVar, int i12, l[] lVarArr, int i13, long[] jArr, long[] jArr2) {
        this.f5590a = i10;
        this.f5591b = i11;
        this.f5592c = j10;
        this.f5593d = j11;
        this.f5594e = j12;
        this.f5595f = vVar;
        this.f5596g = i12;
        this.f5600k = lVarArr;
        this.f5599j = i13;
        this.f5597h = jArr;
        this.f5598i = jArr2;
    }

    public l a(int i10) {
        l[] lVarArr = this.f5600k;
        if (lVarArr == null) {
            return null;
        }
        return lVarArr[i10];
    }
}
