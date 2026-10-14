package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class p81 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f24011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f24012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f24013f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f24008a = 112800;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a71 f24009b = new a71(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f24014g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f24015h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f24016i = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final mp0 f24010c = new mp0();

    public final int a(xn xnVar, cs0 cs0Var, int i10) throws IOException {
        boolean z10;
        if (i10 <= 0) {
            mp0 mp0Var = this.f24010c;
            byte[] bArr = da1.f19808f;
            Objects.requireNonNull(mp0Var);
            mp0Var.a(bArr.length, bArr);
        } else {
            long j10 = -9223372036854775807L;
            if (!this.f24013f) {
                long jA = xnVar.a();
                int iMin = (int) Math.min(this.f24008a, jA);
                long j11 = jA - ((long) iMin);
                if (xnVar.getPosition() != j11) {
                    cs0Var.f19623a = j11;
                    return 1;
                }
                this.f24010c.c(iMin);
                xnVar.c();
                xnVar.b(this.f24010c.c(), 0, iMin, false);
                mp0 mp0Var2 = this.f24010c;
                int iD = mp0Var2.d();
                int iE = mp0Var2.e();
                for (int i11 = iE - 188; i11 >= iD; i11--) {
                    byte[] bArrC = mp0Var2.c();
                    int i12 = -4;
                    int i13 = 0;
                    while (true) {
                        if (i12 > 4) {
                            z10 = false;
                            break;
                        }
                        int i14 = (i12 * 188) + i11;
                        if (i14 >= iD && i14 < iE && bArrC[i14] == 71) {
                            i13++;
                            if (i13 == 5) {
                                z10 = true;
                                break;
                            }
                        } else {
                            i13 = 0;
                        }
                        i12++;
                    }
                    if (z10) {
                        long jA2 = s81.a(i11, i10, mp0Var2);
                        if (jA2 != -9223372036854775807L) {
                            j10 = jA2;
                            break;
                        }
                    }
                }
                this.f24015h = j10;
                this.f24013f = true;
                return 0;
            }
            if (this.f24015h == -9223372036854775807L) {
                mp0 mp0Var3 = this.f24010c;
                byte[] bArr2 = da1.f19808f;
                Objects.requireNonNull(mp0Var3);
                mp0Var3.a(bArr2.length, bArr2);
            } else {
                if (!this.f24012e) {
                    int iMin2 = (int) Math.min(this.f24008a, xnVar.a());
                    long j12 = 0;
                    if (xnVar.getPosition() != j12) {
                        cs0Var.f19623a = j12;
                        return 1;
                    }
                    this.f24010c.c(iMin2);
                    xnVar.c();
                    xnVar.b(this.f24010c.c(), 0, iMin2, false);
                    mp0 mp0Var4 = this.f24010c;
                    int iE2 = mp0Var4.e();
                    for (int iD2 = mp0Var4.d(); iD2 < iE2; iD2++) {
                        if (mp0Var4.c()[iD2] == 71) {
                            long jA3 = s81.a(iD2, i10, mp0Var4);
                            if (jA3 != -9223372036854775807L) {
                                j10 = jA3;
                                break;
                            }
                        }
                    }
                    this.f24014g = j10;
                    this.f24012e = true;
                    return 0;
                }
                long j13 = this.f24014g;
                if (j13 == -9223372036854775807L) {
                    mp0 mp0Var5 = this.f24010c;
                    byte[] bArr3 = da1.f19808f;
                    Objects.requireNonNull(mp0Var5);
                    mp0Var5.a(bArr3.length, bArr3);
                } else {
                    long jB = this.f24009b.b(this.f24015h) - this.f24009b.b(j13);
                    this.f24016i = jB;
                    if (jB < 0) {
                        StringBuilder sbA = v60.a("Invalid duration: ");
                        sbA.append(this.f24016i);
                        sbA.append(". Using TIME_UNSET instead.");
                        p90.d("TsDurationReader", sbA.toString());
                        this.f24016i = -9223372036854775807L;
                    }
                    mp0 mp0Var6 = this.f24010c;
                    byte[] bArr4 = da1.f19808f;
                    Objects.requireNonNull(mp0Var6);
                    mp0Var6.a(bArr4.length, bArr4);
                }
            }
        }
        this.f24011d = true;
        xnVar.c();
        return 0;
    }

    public final long a() {
        return this.f24016i;
    }

    public final a71 b() {
        return this.f24009b;
    }

    public final boolean c() {
        return this.f24011d;
    }
}
