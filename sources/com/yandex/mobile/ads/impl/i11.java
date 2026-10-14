package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public interface i11 {

    public static class a implements i11 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Random f21573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f21574b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f21575c;

        public a() {
            this(new Random());
        }

        private a(Random random) {
            this(a(random), random);
        }

        private a(int[] iArr, Random random) {
            this.f21574b = iArr;
            this.f21573a = random;
            this.f21575c = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f21575c[iArr[i10]] = i10;
            }
        }

        private static int[] a(Random random) {
            return new int[0];
        }

        @Override // com.yandex.mobile.ads.impl.i11
        public final int a() {
            return this.f21574b.length;
        }

        @Override // com.yandex.mobile.ads.impl.i11
        public final int a(int i10) {
            int i11 = this.f21575c[i10] + 1;
            int[] iArr = this.f21574b;
            if (i11 < iArr.length) {
                return iArr[i11];
            }
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.i11
        public final int b() {
            int[] iArr = this.f21574b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.i11
        public final a b(int i10) {
            int[] iArr = new int[i10];
            int[] iArr2 = new int[i10];
            int i11 = 0;
            int i12 = 0;
            while (i12 < i10) {
                iArr[i12] = this.f21573a.nextInt(this.f21574b.length + 1);
                int i13 = i12 + 1;
                int iNextInt = this.f21573a.nextInt(i13);
                iArr2[i12] = iArr2[iNextInt];
                iArr2[iNextInt] = i12 + 0;
                i12 = i13;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f21574b.length + i10];
            int i14 = 0;
            int i15 = 0;
            while (true) {
                int[] iArr4 = this.f21574b;
                if (i11 >= iArr4.length + i10) {
                    return new a(iArr3, new Random(this.f21573a.nextLong()));
                }
                if (i14 >= i10 || i15 != iArr[i14]) {
                    int i16 = i15 + 1;
                    int i17 = iArr4[i15];
                    iArr3[i11] = i17;
                    if (i17 >= 0) {
                        iArr3[i11] = i17 + i10;
                    }
                    i15 = i16;
                } else {
                    iArr3[i11] = iArr2[i14];
                    i14++;
                }
                i11++;
            }
        }

        @Override // com.yandex.mobile.ads.impl.i11
        public final int c() {
            int[] iArr = this.f21574b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.i11
        public final a c(int i10) {
            int i11 = i10 + 0;
            int[] iArr = new int[this.f21574b.length - i11];
            int i12 = 0;
            int i13 = 0;
            while (true) {
                int[] iArr2 = this.f21574b;
                if (i12 >= iArr2.length) {
                    return new a(iArr, new Random(this.f21573a.nextLong()));
                }
                int i14 = iArr2[i12];
                if (i14 < 0 || i14 >= i10) {
                    int i15 = i12 - i13;
                    if (i14 >= 0) {
                        i14 -= i11;
                    }
                    iArr[i15] = i14;
                } else {
                    i13++;
                }
                i12++;
            }
        }

        @Override // com.yandex.mobile.ads.impl.i11
        public final int d(int i10) {
            int i11 = this.f21575c[i10] - 1;
            if (i11 >= 0) {
                return this.f21574b[i11];
            }
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.i11
        public final a d() {
            return new a(new int[0], new Random(this.f21573a.nextLong()));
        }
    }

    int a();

    int a(int i10);

    int b();

    a b(int i10);

    int c();

    a c(int i10);

    int d(int i10);

    a d();
}
