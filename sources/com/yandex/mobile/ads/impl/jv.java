package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class jv extends ze {

    public static final class a implements ze.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final pv f22159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f22160b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final lv.a f22161c;

        private a(int i10, pv pvVar) {
            this.f22159a = pvVar;
            this.f22160b = i10;
            this.f22161c = new lv.a();
        }

        public /* synthetic */ a(pv pvVar, int i10) {
            this(i10, pvVar);
        }

        private long a(xn xnVar) throws IOException {
            boolean zA;
            while (xnVar.e() < xnVar.a() - 6) {
                pv pvVar = this.f22159a;
                int i10 = this.f22160b;
                lv.a aVar = this.f22161c;
                long jE = xnVar.e();
                int i11 = 2;
                byte[] bArr = new byte[2];
                xnVar.b(bArr, 0, 2, false);
                if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
                    xnVar.c();
                    xnVar.a(false, (int) (jE - xnVar.getPosition()));
                    zA = false;
                } else {
                    mp0 mp0Var = new mp0(16);
                    System.arraycopy(bArr, 0, mp0Var.c(), 0, 2);
                    byte[] bArrC = mp0Var.c();
                    int i12 = 0;
                    for (int i13 = 14; i12 < i13; i13 = 14) {
                        int iB = xnVar.b(bArrC, i11 + i12, 14 - i12);
                        if (iB == -1) {
                            break;
                        }
                        i12 += iB;
                        i11 = 2;
                    }
                    mp0Var.d(i12);
                    xnVar.c();
                    xnVar.a(false, (int) (jE - xnVar.getPosition()));
                    zA = lv.a(mp0Var, pvVar, i10, aVar);
                }
                if (zA) {
                    break;
                }
                xnVar.a(false, 1);
            }
            if (xnVar.e() < xnVar.a() - 6) {
                return this.f22161c.f22795a;
            }
            xnVar.a(false, (int) (xnVar.a() - xnVar.e()));
            return this.f22159a.f24261j;
        }

        @Override // com.yandex.mobile.ads.impl.ze.f
        public final ze.e a(xn xnVar, long j10) throws IOException {
            long position = xnVar.getPosition();
            long jA = a(xnVar);
            long jE = xnVar.e();
            xnVar.a(false, Math.max(6, this.f22159a.f24254c));
            long jA2 = a(xnVar);
            long jE2 = xnVar.e();
            if (jA > j10 || jA2 <= j10) {
                return jA2 <= j10 ? ze.e.b(jA2, jE2) : ze.e.a(jA, position);
            }
            return ze.e.a(jE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv(pv pvVar, int i10, long j10, long j11) {
        super(new ho1(pvVar), new a(pvVar, i10), pvVar.b(), pvVar.f24261j, j10, j11, pvVar.a(), Math.max(6, pvVar.f24254c));
        Objects.requireNonNull(pvVar);
    }
}
