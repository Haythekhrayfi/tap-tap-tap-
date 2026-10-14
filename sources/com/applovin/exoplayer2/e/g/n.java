package com.applovin.exoplayer2.e.g;

import com.applovin.exoplayer2.l.ai;

/* JADX INFO: loaded from: classes.dex */
final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f5625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f5627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f5628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f5630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f5631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f5632h;

    public n(k kVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        com.applovin.exoplayer2.l.a.a(iArr.length == jArr2.length);
        com.applovin.exoplayer2.l.a.a(jArr.length == jArr2.length);
        com.applovin.exoplayer2.l.a.a(iArr2.length == jArr2.length);
        this.f5625a = kVar;
        this.f5627c = jArr;
        this.f5628d = iArr;
        this.f5629e = i10;
        this.f5630f = jArr2;
        this.f5631g = iArr2;
        this.f5632h = j10;
        this.f5626b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j10) {
        for (int iA = ai.a(this.f5630f, j10, true, false); iA >= 0; iA--) {
            if ((this.f5631g[iA] & 1) != 0) {
                return iA;
            }
        }
        return -1;
    }

    public int b(long j10) {
        for (int iB = ai.b(this.f5630f, j10, true, false); iB < this.f5630f.length; iB++) {
            if ((this.f5631g[iB] & 1) != 0) {
                return iB;
            }
        }
        return -1;
    }
}
