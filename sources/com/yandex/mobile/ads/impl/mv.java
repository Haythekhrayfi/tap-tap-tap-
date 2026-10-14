package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.metadata.flac.PictureFrame;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class mv {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public pv f23147a;

        public a(pv pvVar) {
            this.f23147a = pvVar;
        }
    }

    public static pv.a a(mp0 mp0Var) {
        mp0Var.f(1);
        int iW = mp0Var.w();
        long jD = ((long) mp0Var.d()) + ((long) iW);
        int i10 = iW / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            long jP = mp0Var.p();
            if (jP == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = jP;
            jArrCopyOf2[i11] = mp0Var.p();
            mp0Var.f(2);
        }
        mp0Var.f((int) (jD - ((long) mp0Var.d())));
        return new pv.a(jArrCopyOf, jArrCopyOf2);
    }

    public static boolean a(xn xnVar, a aVar) throws IOException {
        pv pvVarA;
        xnVar.c();
        lp0 lp0Var = new lp0(4, new byte[4]);
        xnVar.b(lp0Var.f22755a, 0, 4, false);
        boolean zF = lp0Var.f();
        int iB = lp0Var.b(7);
        int iB2 = lp0Var.b(24) + 4;
        if (iB == 0) {
            byte[] bArr = new byte[38];
            xnVar.a(bArr, 0, 38, false);
            pvVarA = new pv(4, bArr);
        } else {
            pv pvVar = aVar.f23147a;
            if (pvVar == null) {
                throw new IllegalArgumentException();
            }
            if (iB == 3) {
                mp0 mp0Var = new mp0(iB2);
                xnVar.a(mp0Var.c(), 0, iB2, false);
                pvVarA = pvVar.a(a(mp0Var));
            } else {
                if (iB != 4) {
                    if (iB == 6) {
                        mp0 mp0Var2 = new mp0(iB2);
                        xnVar.a(mp0Var2.c(), 0, iB2, false);
                        mp0Var2.f(4);
                        int iH = mp0Var2.h();
                        String strA = mp0Var2.a(mp0Var2.h(), qh.f24494a);
                        String strA2 = mp0Var2.a(mp0Var2.h(), qh.f24496c);
                        int iH2 = mp0Var2.h();
                        int iH3 = mp0Var2.h();
                        int iH4 = mp0Var2.h();
                        int iH5 = mp0Var2.h();
                        int iH6 = mp0Var2.h();
                        byte[] bArr2 = new byte[iH6];
                        mp0Var2.a(bArr2, 0, iH6);
                        pvVarA = pvVar.a(com.yandex.mobile.ads.embedded.guava.collect.p.a(new PictureFrame(iH, strA, strA2, iH2, iH3, iH4, iH5, bArr2)));
                    } else {
                        xnVar.a(iB2);
                    }
                    return zF;
                }
                mp0 mp0Var3 = new mp0(iB2);
                xnVar.a(mp0Var3.c(), 0, iB2, false);
                mp0Var3.f(4);
                pvVarA = pvVar.b(Arrays.asList(mi1.a(mp0Var3, false, false).f23090a));
            }
        }
        aVar.f23147a = pvVarA;
        return zF;
    }
}
