package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class o81 extends ze {

    public static final class a implements ze.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a71 f23726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final mp0 f23727b = new mp0();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f23728c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f23729d;

        public a(int i10, a71 a71Var, int i11) {
            this.f23728c = i10;
            this.f23726a = a71Var;
            this.f23729d = i11;
        }

        @Override // com.yandex.mobile.ads.impl.ze.f
        public final ze.e a(xn xnVar, long j10) throws IOException {
            long j11;
            long position = xnVar.getPosition();
            int iMin = (int) Math.min(this.f23729d, xnVar.a() - position);
            this.f23727b.c(iMin);
            xnVar.b(this.f23727b.c(), 0, iMin, false);
            mp0 mp0Var = this.f23727b;
            int iE = mp0Var.e();
            long j12 = -1;
            long j13 = -1;
            long j14 = -9223372036854775807L;
            while (mp0Var.a() >= 188) {
                byte[] bArrC = mp0Var.c();
                int iD = mp0Var.d();
                while (iD < iE && bArrC[iD] != 71) {
                    iD++;
                }
                int i10 = iD + 188;
                if (i10 > iE) {
                    break;
                }
                long jA = s81.a(iD, this.f23728c, mp0Var);
                if (jA != -9223372036854775807L) {
                    long jB = this.f23726a.b(jA);
                    if (jB > j10) {
                        if (j14 == -9223372036854775807L) {
                            return ze.e.a(jB, position);
                        }
                        j11 = position + j13;
                    } else if (100000 + jB > j10) {
                        j11 = position + ((long) iD);
                    } else {
                        j14 = jB;
                        j13 = iD;
                    }
                    return ze.e.a(j11);
                }
                mp0Var.e(i10);
                j12 = i10;
            }
            return j14 != -9223372036854775807L ? ze.e.b(j14, position + j12) : ze.e.f27309d;
        }

        @Override // com.yandex.mobile.ads.impl.ze.f
        public final void a() {
            mp0 mp0Var = this.f23727b;
            byte[] bArr = da1.f19808f;
            Objects.requireNonNull(mp0Var);
            mp0Var.a(bArr.length, bArr);
        }
    }

    public o81(a71 a71Var, long j10, long j11, int i10, int i11) {
        super(new ze.b(), new a(i10, a71Var, i11), j10, j10 + 1, 0L, j11, 188L, 940);
    }
}
