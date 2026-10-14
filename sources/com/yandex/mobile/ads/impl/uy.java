package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class uy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<byte[]> f25757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f25759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25760d;

    private uy(List list, int i10, float f10, String str) {
        this.f25757a = list;
        this.f25758b = i10;
        this.f25759c = f10;
        this.f25760d = str;
    }

    public static uy a(mp0 mp0Var) throws qp0 {
        try {
            mp0Var.f(21);
            int iT = mp0Var.t() & 3;
            int iT2 = mp0Var.t();
            int iD = mp0Var.d();
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < iT2; i12++) {
                mp0Var.f(1);
                int iZ = mp0Var.z();
                for (int i13 = 0; i13 < iZ; i13++) {
                    int iZ2 = mp0Var.z();
                    i11 += iZ2 + 4;
                    mp0Var.f(iZ2);
                }
            }
            mp0Var.e(iD);
            byte[] bArr = new byte[i11];
            float f10 = 1.0f;
            String strA = null;
            int i14 = 0;
            int i15 = 0;
            while (i14 < iT2) {
                int iT3 = mp0Var.t() & 127;
                int iZ3 = mp0Var.z();
                int i16 = i10;
                while (i16 < iZ3) {
                    int iZ4 = mp0Var.z();
                    System.arraycopy(oh0.f23795a, i10, bArr, i15, 4);
                    int i17 = i15 + 4;
                    System.arraycopy(mp0Var.c(), mp0Var.d(), bArr, i17, iZ4);
                    if (iT3 == 33 && i16 == 0) {
                        oh0.a aVarA = oh0.a(bArr, i17, i17 + iZ4);
                        float f11 = aVarA.f23805g;
                        strA = mj.a(aVarA.f23799a, aVarA.f23800b, aVarA.f23801c, aVarA.f23802d, aVarA.f23803e, aVarA.f23804f);
                        f10 = f11;
                    }
                    i15 = i17 + iZ4;
                    mp0Var.f(iZ4);
                    i16++;
                    iT2 = iT2;
                    i10 = 0;
                }
                i14++;
                i10 = 0;
            }
            return new uy(i11 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iT + 1, f10, strA);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw qp0.a("Error parsing HEVC config", e10);
        }
    }
}
