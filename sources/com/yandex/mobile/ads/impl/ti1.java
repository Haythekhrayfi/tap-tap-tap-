package com.yandex.mobile.ads.impl;

import android.util.Pair;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class ti1 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f25369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f25370b;

        private a(int i10, long j10) {
            this.f25369a = i10;
            this.f25370b = j10;
        }

        public static a a(xn xnVar, mp0 mp0Var) throws IOException {
            xnVar.b(mp0Var.c(), 0, 8, false);
            mp0Var.e(0);
            return new a(mp0Var.h(), mp0Var.n());
        }
    }

    private static a a(int i10, xn xnVar, mp0 mp0Var) throws IOException {
        while (true) {
            a aVarA = a.a(xnVar, mp0Var);
            if (aVarA.f25369a == i10) {
                return aVarA;
            }
            StringBuilder sbA = v60.a("Ignoring unknown WAV chunk: ");
            sbA.append(aVarA.f25369a);
            p90.d("WavHeaderReader", sbA.toString());
            long j10 = aVarA.f25370b + 8;
            if (j10 > 2147483647L) {
                StringBuilder sbA2 = v60.a("Chunk is too large (~2GB+) to skip; id: ");
                sbA2.append(aVarA.f25369a);
                throw qp0.a(sbA2.toString());
            }
            xnVar.a((int) j10);
        }
    }

    public static boolean a(xn xnVar) throws IOException {
        mp0 mp0Var = new mp0(8);
        int i10 = a.a(xnVar, mp0Var).f25369a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        xnVar.b(mp0Var.c(), 0, 4, false);
        mp0Var.e(0);
        int iH = mp0Var.h();
        if (iH == 1463899717) {
            return true;
        }
        p90.b("WavHeaderReader", "Unsupported form type: " + iH);
        return false;
    }

    public static si1 b(xn xnVar) throws IOException {
        byte[] bArr;
        mp0 mp0Var = new mp0(16);
        a aVarA = a(1718449184, xnVar, mp0Var);
        pa.b(aVarA.f25370b >= 16);
        xnVar.b(mp0Var.c(), 0, 16, false);
        mp0Var.e(0);
        int iO = mp0Var.o();
        int iO2 = mp0Var.o();
        int iK = mp0Var.k();
        if (iK < 0) {
            throw new IllegalStateException(u60.a("Top bit not zero: ", iK));
        }
        int iK2 = mp0Var.k();
        if (iK2 < 0) {
            throw new IllegalStateException(u60.a("Top bit not zero: ", iK2));
        }
        int iO3 = mp0Var.o();
        int iO4 = mp0Var.o();
        int i10 = ((int) aVarA.f25370b) - 16;
        if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            xnVar.b(bArr2, 0, i10, false);
            bArr = bArr2;
        } else {
            bArr = da1.f19808f;
        }
        xnVar.a((int) (xnVar.e() - xnVar.getPosition()));
        return new si1(iO, iO2, iK, iO3, iO4, bArr);
    }

    public static Pair c(xn xnVar) throws IOException {
        xnVar.c();
        a aVarA = a(1684108385, xnVar, new mp0(8));
        xnVar.a(8);
        return Pair.create(Long.valueOf(xnVar.getPosition()), Long.valueOf(aVarA.f25370b));
    }
}
