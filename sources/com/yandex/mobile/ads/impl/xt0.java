package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class xt0 extends ze {

    public static final class a implements ze.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a71 f26619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final mp0 f26620b;

        private a(a71 a71Var) {
            this.f26619a = a71Var;
            this.f26620b = new mp0();
        }

        public /* synthetic */ a(a71 a71Var, int i10) {
            this(a71Var);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0090  */
        /* JADX WARN: Code duplicated, block: B:38:0x00d8  */
        @Override // com.yandex.mobile.ads.impl.ze.f
        public final ze.e a(xn xnVar, long j10) throws IOException {
            int iA;
            long jD;
            long position = xnVar.getPosition();
            int iMin = (int) Math.min(20000L, xnVar.a() - position);
            this.f26620b.c(iMin);
            xnVar.b(this.f26620b.c(), 0, iMin, false);
            mp0 mp0Var = this.f26620b;
            int iD = -1;
            int iD2 = -1;
            long j11 = -9223372036854775807L;
            while (mp0Var.a() >= 4) {
                if (xt0.a(mp0Var.d(), mp0Var.c()) != 442) {
                    mp0Var.f(1);
                } else {
                    mp0Var.f(4);
                    long jA = yt0.a(mp0Var);
                    if (jA != -9223372036854775807L) {
                        long jB = this.f26619a.b(jA);
                        if (jB > j10) {
                            if (j11 == -9223372036854775807L) {
                                return ze.e.a(jB, position);
                            }
                            jD = iD2;
                        } else if (100000 + jB > j10) {
                            jD = mp0Var.d();
                        } else {
                            iD2 = mp0Var.d();
                            j11 = jB;
                        }
                        return ze.e.a(position + jD);
                    }
                    int iE = mp0Var.e();
                    if (mp0Var.a() >= 10) {
                        mp0Var.f(9);
                        int iT = mp0Var.t() & 7;
                        if (mp0Var.a() >= iT) {
                            mp0Var.f(iT);
                            if (mp0Var.a() >= 4) {
                                if (xt0.a(mp0Var.d(), mp0Var.c()) != 443) {
                                    while (mp0Var.a() >= 4) {
                                        iA = xt0.a(mp0Var.d(), mp0Var.c());
                                        if (iA == 442) {
                                            break;
                                        }
                                        break;
                                    }
                                }
                                mp0Var.f(4);
                                int iZ = mp0Var.z();
                                if (mp0Var.a() < iZ) {
                                    mp0Var.e(iE);
                                    break;
                                }
                                mp0Var.f(iZ);
                                while (mp0Var.a() >= 4) {
                                    iA = xt0.a(mp0Var.d(), mp0Var.c());
                                    if (iA == 442 || iA == 441 || (iA >>> 8) != 1) {
                                        break;
                                    }
                                    mp0Var.f(4);
                                    if (mp0Var.a() < 2) {
                                        mp0Var.e(iE);
                                        break;
                                    }
                                    mp0Var.e(Math.min(mp0Var.e(), mp0Var.d() + mp0Var.z()));
                                }
                            } else {
                                mp0Var.e(iE);
                                break;
                            }
                        } else {
                            mp0Var.e(iE);
                            break;
                        }
                    } else {
                        mp0Var.e(iE);
                        break;
                    }
                    iD = mp0Var.d();
                }
            }
            return j11 != -9223372036854775807L ? ze.e.b(j11, position + ((long) iD)) : ze.e.f27309d;
        }

        @Override // com.yandex.mobile.ads.impl.ze.f
        public final void a() {
            mp0 mp0Var = this.f26620b;
            byte[] bArr = da1.f19808f;
            Objects.requireNonNull(mp0Var);
            mp0Var.a(bArr.length, bArr);
        }
    }

    public xt0(a71 a71Var, long j10, long j11) {
        super(new ze.b(), new a(a71Var, 0), j10, j10 + 1, 0L, j11, 188L, 1000);
    }

    public static int a(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }
}
