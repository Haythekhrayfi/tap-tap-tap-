package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
final class kb1 implements s01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f22368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f22369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f22370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f22371d;

    private kb1(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f22368a = jArr;
        this.f22369b = jArr2;
        this.f22370c = j10;
        this.f22371d = j11;
    }

    public static kb1 a(long j10, long j11, rf0.a aVar, mp0 mp0Var) {
        int iT;
        mp0Var.f(10);
        int iH = mp0Var.h();
        if (iH <= 0) {
            return null;
        }
        int i10 = aVar.f24699d;
        long jA = da1.a(iH, 1000000 * ((long) (i10 >= 32000 ? 1152 : 576)), i10);
        int iZ = mp0Var.z();
        int iZ2 = mp0Var.z();
        int iZ3 = mp0Var.z();
        mp0Var.f(2);
        long j12 = j11 + ((long) aVar.f24698c);
        long[] jArr = new long[iZ];
        long[] jArr2 = new long[iZ];
        long j13 = j11;
        for (int i11 = 0; i11 < iZ; i11++) {
            jArr[i11] = (((long) i11) * jA) / ((long) iZ);
            jArr2[i11] = Math.max(j13, j12);
            if (iZ3 == 1) {
                iT = mp0Var.t();
            } else if (iZ3 == 2) {
                iT = mp0Var.z();
            } else if (iZ3 == 3) {
                iT = mp0Var.w();
            } else {
                if (iZ3 != 4) {
                    return null;
                }
                iT = mp0Var.x();
            }
            j13 += ((long) iT) * ((long) iZ2);
        }
        if (j10 != -1 && j10 != j13) {
            StringBuilder sbA = i2.a.a("VBRI data size mismatch: ", j10, ", ");
            sbA.append(j13);
            p90.d("VbriSeeker", sbA.toString());
        }
        return new kb1(jArr, jArr2, jA, j13);
    }

    @Override // com.yandex.mobile.ads.impl.s01
    public final long a() {
        return this.f22371d;
    }

    @Override // com.yandex.mobile.ads.impl.s01
    public final long a(long j10) {
        return this.f22368a[da1.b(this.f22369b, j10, true)];
    }

    @Override // com.yandex.mobile.ads.impl.p01
    public final p01.a b(long j10) {
        int iB = da1.b(this.f22368a, j10, true);
        long[] jArr = this.f22368a;
        long j11 = jArr[iB];
        long[] jArr2 = this.f22369b;
        r01 r01Var = new r01(j11, jArr2[iB]);
        if (j11 >= j10 || iB == jArr.length - 1) {
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
        return this.f22370c;
    }
}
