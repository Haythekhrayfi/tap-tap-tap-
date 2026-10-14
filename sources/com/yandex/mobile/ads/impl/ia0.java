package com.yandex.mobile.ads.impl;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ia0 extends o71 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f21651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f21652b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final i71[] f21653c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f21654d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[][][] f21655e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final i71 f21656f;

        public a(int[] iArr, i71[] i71VarArr, int[] iArr2, int[][][] iArr3, i71 i71Var) {
            this.f21652b = iArr;
            this.f21653c = i71VarArr;
            this.f21655e = iArr3;
            this.f21654d = iArr2;
            this.f21656f = i71Var;
            this.f21651a = iArr.length;
        }

        public final int a() {
            return this.f21651a;
        }

        public final int a(int i10) {
            return this.f21652b[i10];
        }

        public final int a(int i10, int i11) {
            int i12 = this.f21653c[i10].a(i11).f21329a;
            int[] iArr = new int[i12];
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                if (a(i10, i11, i15) == 4) {
                    iArr[i14] = i15;
                    i14++;
                }
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i14);
            int iMin = 16;
            int i16 = 0;
            String str = null;
            boolean z10 = false;
            while (i13 < iArrCopyOf.length) {
                String str2 = this.f21653c[i10].a(i11).a(iArrCopyOf[i13]).f27115l;
                int i17 = i16 + 1;
                if (i16 == 0) {
                    str = str2;
                } else {
                    z10 |= !da1.a(str, str2);
                }
                iMin = Math.min(iMin, this.f21655e[i10][i11][i13] & 24);
                i13++;
                i16 = i17;
            }
            return z10 ? Math.min(iMin, this.f21654d[i10]) : iMin;
        }

        public final int a(int i10, int i11, int i12) {
            return this.f21655e[i10][i11][i12] & 7;
        }

        public final i71 b() {
            return this.f21656f;
        }

        public final i71 b(int i10) {
            return this.f21653c[i10];
        }
    }

    public abstract Pair a(a aVar, int[][][] iArr, int[] iArr2) throws ns;

    @Override // com.yandex.mobile.ads.impl.o71
    public final p71 a(qv0[] qv0VarArr, i71 i71Var, nc0.b bVar, v61 v61Var) throws ns {
        boolean z10;
        int[] iArr;
        i71 i71Var2 = i71Var;
        boolean z11 = true;
        int[] iArr2 = new int[qv0VarArr.length + 1];
        int length = qv0VarArr.length + 1;
        h71[][] h71VarArr = new h71[length][];
        int[][][] iArr3 = new int[qv0VarArr.length + 1][][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i71Var2.f21619a;
            h71VarArr[i10] = new h71[i11];
            iArr3[i10] = new int[i11][];
        }
        int length2 = qv0VarArr.length;
        int[] iArr4 = new int[length2];
        for (int i12 = 0; i12 < length2; i12++) {
            iArr4[i12] = qv0VarArr[i12].f();
        }
        int i13 = 0;
        while (i13 < i71Var2.f21619a) {
            h71 h71VarA = i71Var2.a(i13);
            boolean z12 = h71VarA.f21331c == 5 ? z11 : false;
            int length3 = qv0VarArr.length;
            boolean z13 = z11;
            int i14 = 0;
            for (int i15 = 0; i15 < qv0VarArr.length; i15++) {
                qv0 qv0Var = qv0VarArr[i15];
                int iMax = 0;
                for (int i16 = 0; i16 < h71VarA.f21329a; i16++) {
                    iMax = Math.max(iMax, qv0Var.a(h71VarA.a(i16)) & 7);
                }
                boolean z14 = iArr2[i15] == 0;
                if (iMax > i14 || (iMax == i14 && z12 && !z13 && z14)) {
                    z13 = z14;
                    i14 = iMax;
                    length3 = i15;
                }
            }
            if (length3 == qv0VarArr.length) {
                iArr = new int[h71VarA.f21329a];
            } else {
                qv0 qv0Var2 = qv0VarArr[length3];
                int[] iArr5 = new int[h71VarA.f21329a];
                for (int i17 = 0; i17 < h71VarA.f21329a; i17++) {
                    iArr5[i17] = qv0Var2.a(h71VarA.a(i17));
                }
                iArr = iArr5;
            }
            int i18 = iArr2[length3];
            h71VarArr[length3][i18] = h71VarA;
            iArr3[length3][i18] = iArr;
            iArr2[length3] = i18 + 1;
            i13++;
            z11 = true;
            i71Var2 = i71Var;
        }
        boolean z15 = z11;
        i71[] i71VarArr = new i71[qv0VarArr.length];
        String[] strArr = new String[qv0VarArr.length];
        int[] iArr6 = new int[qv0VarArr.length];
        for (int i19 = 0; i19 < qv0VarArr.length; i19++) {
            int i20 = iArr2[i19];
            i71VarArr[i19] = new i71((h71[]) da1.a(i20, h71VarArr[i19]));
            iArr3[i19] = (int[][]) da1.a(i20, iArr3[i19]);
            strArr[i19] = qv0VarArr[i19].getName();
            iArr6[i19] = ((me) qv0VarArr[i19]).m();
        }
        a aVar = new a(iArr6, i71VarArr, iArr4, iArr3, new i71((h71[]) da1.a(iArr2[qv0VarArr.length], h71VarArr[qv0VarArr.length])));
        Pair pairA = a(aVar, iArr3, iArr4);
        l71[] l71VarArr = (l71[]) pairA.second;
        List[] listArr = new List[l71VarArr.length];
        for (int i21 = 0; i21 < l71VarArr.length; i21++) {
            l71 l71Var = l71VarArr[i21];
            listArr[i21] = l71Var != null ? com.yandex.mobile.ads.embedded.guava.collect.p.a(l71Var) : com.yandex.mobile.ads.embedded.guava.collect.p.i();
        }
        com.yandex.mobile.ads.embedded.guava.collect.p.a aVar2 = new com.yandex.mobile.ads.embedded.guava.collect.p.a();
        int i22 = 0;
        while (i22 < aVar.a()) {
            i71 i71VarB = aVar.b(i22);
            List list = listArr[i22];
            int i23 = 0;
            while (i23 < i71VarB.f21619a) {
                h71 h71VarA2 = i71VarB.a(i23);
                boolean z16 = aVar.a(i22, i23) != 0 ? z15 : false;
                int i24 = h71VarA2.f21329a;
                int[] iArr7 = new int[i24];
                boolean[] zArr = new boolean[i24];
                for (int i25 = 0; i25 < h71VarA2.f21329a; i25++) {
                    iArr7[i25] = aVar.a(i22, i23, i25);
                    int i26 = 0;
                    while (true) {
                        if (i26 >= list.size()) {
                            z10 = false;
                            break;
                        }
                        l71 l71Var2 = (l71) list.get(i26);
                        if (l71Var2.a().equals(h71VarA2) && l71Var2.c(i25) != -1) {
                            z10 = true;
                            break;
                        }
                        i26++;
                    }
                    zArr[i25] = z10;
                }
                aVar2.b(new e81.a(h71VarA2, z16, iArr7, zArr));
                i23++;
                z15 = true;
            }
            i22++;
            z15 = true;
        }
        i71 i71VarB2 = aVar.b();
        for (int i27 = 0; i27 < i71VarB2.f21619a; i27++) {
            h71 h71VarA3 = i71VarB2.a(i27);
            int[] iArr8 = new int[h71VarA3.f21329a];
            Arrays.fill(iArr8, 0);
            aVar2.b(new e81.a(h71VarA3, false, iArr8, new boolean[h71VarA3.f21329a]));
        }
        return new p71((rv0[]) pairA.first, (et[]) pairA.second, new e81(aVar2.a()), aVar);
    }

    @Override // com.yandex.mobile.ads.impl.o71
    public final void a(Object obj) {
    }
}
