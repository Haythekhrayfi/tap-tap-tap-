package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class rh implements p01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f24714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f24715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f24716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f24717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f24718f;

    public rh(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f24714b = iArr;
        this.f24715c = jArr;
        this.f24716d = jArr2;
        this.f24717e = jArr3;
        int length = iArr.length;
        this.f24713a = length;
        if (length <= 0) {
            this.f24718f = 0L;
        } else {
            int i10 = length - 1;
            this.f24718f = jArr2[i10] + jArr3[i10];
        }
    }

    @Override // com.yandex.mobile.ads.impl.p01
    public final p01.a b(long j10) {
        int iB = da1.b(this.f24717e, j10, true);
        long[] jArr = this.f24717e;
        long j11 = jArr[iB];
        long[] jArr2 = this.f24715c;
        r01 r01Var = new r01(j11, jArr2[iB]);
        if (j11 >= j10 || iB == this.f24713a - 1) {
            return new p01.a(r01Var, r01Var);
        }
        int i10 = iB + 1;
        return new p01.a(r01Var, new r01(jArr[i10], jArr2[i10]));
    }

    @Override // com.yandex.mobile.ads.impl.p01
    public final boolean b() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.p01
    public final long c() {
        return this.f24718f;
    }

    public final String toString() {
        StringBuilder sbA = v60.a("ChunkIndex(length=");
        sbA.append(this.f24713a);
        sbA.append(", sizes=");
        sbA.append(Arrays.toString(this.f24714b));
        sbA.append(", offsets=");
        sbA.append(Arrays.toString(this.f24715c));
        sbA.append(", timeUs=");
        sbA.append(Arrays.toString(this.f24717e));
        sbA.append(", durationsUs=");
        sbA.append(Arrays.toString(this.f24716d));
        sbA.append(")");
        return sbA.toString();
    }
}
