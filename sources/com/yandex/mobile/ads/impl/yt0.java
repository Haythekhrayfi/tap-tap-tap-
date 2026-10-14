package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class yt0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f27002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f27003e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a71 f26999a = new a71(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f27004f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f27005g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f27006h = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mp0 f27000b = new mp0();

    public static long a(mp0 mp0Var) {
        int iD = mp0Var.d();
        if (mp0Var.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        boolean z10 = false;
        mp0Var.a(bArr, 0, 9);
        mp0Var.e(iD);
        byte b10 = bArr[0];
        if ((b10 & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
            z10 = true;
        }
        if (!z10) {
            return -9223372036854775807L;
        }
        long j10 = b10;
        long j11 = ((j10 & 3) << 28) | (((56 & j10) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20);
        long j12 = bArr[2];
        return j11 | (((j12 & 248) >> 3) << 15) | ((j12 & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    public final int a(xn xnVar, cs0 cs0Var) throws IOException {
        long j10 = -9223372036854775807L;
        if (!this.f27003e) {
            long jA = xnVar.a();
            int iMin = (int) Math.min(20000L, jA);
            long j11 = jA - ((long) iMin);
            if (xnVar.getPosition() != j11) {
                cs0Var.f19623a = j11;
                return 1;
            }
            this.f27000b.c(iMin);
            xnVar.c();
            xnVar.b(this.f27000b.c(), 0, iMin, false);
            mp0 mp0Var = this.f27000b;
            int iD = mp0Var.d();
            for (int iE = mp0Var.e() - 4; iE >= iD; iE--) {
                byte[] bArrC = mp0Var.c();
                if (((bArrC[iE + 3] & 255) | ((bArrC[iE] & 255) << 24) | ((bArrC[iE + 1] & 255) << 16) | ((bArrC[iE + 2] & 255) << 8)) == 442) {
                    mp0Var.e(iE + 4);
                    long jA2 = a(mp0Var);
                    if (jA2 != -9223372036854775807L) {
                        j10 = jA2;
                        break;
                    }
                }
            }
            this.f27005g = j10;
            this.f27003e = true;
            return 0;
        }
        if (this.f27005g == -9223372036854775807L) {
            mp0 mp0Var2 = this.f27000b;
            byte[] bArr = da1.f19808f;
            Objects.requireNonNull(mp0Var2);
            mp0Var2.a(bArr.length, bArr);
        } else {
            if (!this.f27002d) {
                int iMin2 = (int) Math.min(20000L, xnVar.a());
                long j12 = 0;
                if (xnVar.getPosition() != j12) {
                    cs0Var.f19623a = j12;
                    return 1;
                }
                this.f27000b.c(iMin2);
                xnVar.c();
                xnVar.b(this.f27000b.c(), 0, iMin2, false);
                mp0 mp0Var3 = this.f27000b;
                int iD2 = mp0Var3.d();
                int iE2 = mp0Var3.e();
                while (iD2 < iE2 - 3) {
                    byte[] bArrC2 = mp0Var3.c();
                    int i10 = iD2 + 1;
                    if (((bArrC2[iD2 + 3] & 255) | ((bArrC2[iD2] & 255) << 24) | ((bArrC2[i10] & 255) << 16) | ((bArrC2[iD2 + 2] & 255) << 8)) == 442) {
                        mp0Var3.e(iD2 + 4);
                        long jA3 = a(mp0Var3);
                        if (jA3 != -9223372036854775807L) {
                            j10 = jA3;
                            break;
                        }
                    }
                    iD2 = i10;
                }
                this.f27004f = j10;
                this.f27002d = true;
                return 0;
            }
            long j13 = this.f27004f;
            if (j13 == -9223372036854775807L) {
                mp0 mp0Var4 = this.f27000b;
                byte[] bArr2 = da1.f19808f;
                Objects.requireNonNull(mp0Var4);
                mp0Var4.a(bArr2.length, bArr2);
            } else {
                long jB = this.f26999a.b(this.f27005g) - this.f26999a.b(j13);
                this.f27006h = jB;
                if (jB < 0) {
                    StringBuilder sbA = v60.a("Invalid duration: ");
                    sbA.append(this.f27006h);
                    sbA.append(". Using TIME_UNSET instead.");
                    p90.d("PsDurationReader", sbA.toString());
                    this.f27006h = -9223372036854775807L;
                }
                mp0 mp0Var5 = this.f27000b;
                byte[] bArr3 = da1.f19808f;
                Objects.requireNonNull(mp0Var5);
                mp0Var5.a(bArr3.length, bArr3);
            }
        }
        this.f27001c = true;
        xnVar.c();
        return 0;
    }

    public final long a() {
        return this.f27006h;
    }

    public final a71 b() {
        return this.f26999a;
    }

    public final boolean c() {
        return this.f27001c;
    }
}
