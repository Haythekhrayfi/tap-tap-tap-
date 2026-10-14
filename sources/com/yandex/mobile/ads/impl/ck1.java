package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
final class ck1 implements s01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f19535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f19536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f19537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f19538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f19539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long[] f19540f;

    private ck1(long j10, int i10, long j11, long j12, long[] jArr) {
        this.f19535a = j10;
        this.f19536b = i10;
        this.f19537c = j11;
        this.f19540f = jArr;
        this.f19538d = j12;
        this.f19539e = j12 != -1 ? j10 + j12 : -1L;
    }

    public static ck1 a(long j10, long j11, rf0.a aVar, mp0 mp0Var) {
        int iX;
        int i10 = aVar.f24702g;
        int i11 = aVar.f24699d;
        int iH = mp0Var.h();
        if ((iH & 1) != 1 || (iX = mp0Var.x()) == 0) {
            return null;
        }
        long jA = da1.a(iX, ((long) i10) * 1000000, i11);
        if ((iH & 6) != 6) {
            return new ck1(j11, aVar.f24698c, jA, -1L, null);
        }
        long jV = mp0Var.v();
        long[] jArr = new long[100];
        for (int i12 = 0; i12 < 100; i12++) {
            jArr[i12] = mp0Var.t();
        }
        if (j10 != -1) {
            long j12 = j11 + jV;
            if (j10 != j12) {
                StringBuilder sbA = i2.a.a("XING data size mismatch: ", j10, ", ");
                sbA.append(j12);
                p90.d("XingSeeker", sbA.toString());
            }
        }
        return new ck1(j11, aVar.f24698c, jA, jV, jArr);
    }

    @Override // com.yandex.mobile.ads.impl.s01
    public final long a() {
        return this.f19539e;
    }

    @Override // com.yandex.mobile.ads.impl.s01
    public final long a(long j10) {
        long j11 = j10 - this.f19535a;
        if (!b() || j11 <= this.f19536b) {
            return 0L;
        }
        long[] jArr = (long[]) pa.b(this.f19540f);
        double d10 = (j11 * 256.0d) / this.f19538d;
        int iB = da1.b(jArr, (long) d10, true);
        long j12 = this.f19537c;
        long j13 = (((long) iB) * j12) / 100;
        long j14 = jArr[iB];
        int i10 = iB + 1;
        long j15 = (j12 * ((long) i10)) / 100;
        long j16 = iB == 99 ? 256L : jArr[i10];
        return Math.round((j14 == j16 ? 0.0d : (d10 - j14) / (j16 - j14)) * (j15 - j13)) + j13;
    }

    @Override // com.yandex.mobile.ads.impl.p01
    public final p01.a b(long j10) {
        if (!b()) {
            r01 r01Var = new r01(0L, this.f19535a + ((long) this.f19536b));
            return new p01.a(r01Var, r01Var);
        }
        long j11 = this.f19537c;
        int i10 = da1.f19803a;
        long jMax = Math.max(0L, Math.min(j10, j11));
        double d10 = (jMax * 100.0d) / this.f19537c;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i11 = (int) d10;
                long[] jArr = (long[]) pa.b(this.f19540f);
                double d12 = jArr[i11];
                d11 = d12 + (((i11 == 99 ? 256.0d : jArr[i11 + 1]) - d12) * (d10 - ((double) i11)));
            }
        }
        r01 r01Var2 = new r01(jMax, this.f19535a + Math.max(this.f19536b, Math.min(Math.round((d11 / 256.0d) * this.f19538d), this.f19538d - 1)));
        return new p01.a(r01Var2, r01Var2);
    }

    @Override // com.yandex.mobile.ads.impl.p01
    public final boolean b() {
        return this.f19540f != null;
    }

    @Override // com.yandex.mobile.ads.impl.p01
    public final long c() {
        return this.f19537c;
    }
}
