package com.applovin.exoplayer2.h;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public interface z {

    public static class a implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Random f6730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f6731b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f6732c;

        public a(int i10) {
            this(i10, new Random());
        }

        private a(int i10, Random random) {
            this(a(i10, random), random);
        }

        private a(int[] iArr, Random random) {
            this.f6731b = iArr;
            this.f6730a = random;
            this.f6732c = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f6732c[iArr[i10]] = i10;
            }
        }

        private static int[] a(int i10, Random random) {
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                int iNextInt = random.nextInt(i12);
                iArr[i11] = iArr[iNextInt];
                iArr[iNextInt] = i11;
                i11 = i12;
            }
            return iArr;
        }

        @Override // com.applovin.exoplayer2.h.z
        public int a() {
            return this.f6731b.length;
        }

        @Override // com.applovin.exoplayer2.h.z
        public int a(int i10) {
            int i11 = this.f6732c[i10] + 1;
            int[] iArr = this.f6731b;
            if (i11 < iArr.length) {
                return iArr[i11];
            }
            return -1;
        }

        @Override // com.applovin.exoplayer2.h.z
        public z a(int i10, int i11) {
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int i12 = 0;
            int i13 = 0;
            while (i13 < i11) {
                iArr[i13] = this.f6730a.nextInt(this.f6731b.length + 1);
                int i14 = i13 + 1;
                int iNextInt = this.f6730a.nextInt(i14);
                iArr2[i13] = iArr2[iNextInt];
                iArr2[iNextInt] = i13 + i10;
                i13 = i14;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f6731b.length + i11];
            int i15 = 0;
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.f6731b;
                if (i12 >= iArr4.length + i11) {
                    return new a(iArr3, new Random(this.f6730a.nextLong()));
                }
                if (i15 >= i11 || i16 != iArr[i15]) {
                    int i17 = i16 + 1;
                    iArr3[i12] = iArr4[i16];
                    if (iArr3[i12] >= i10) {
                        iArr3[i12] = iArr3[i12] + i11;
                    }
                    i16 = i17;
                } else {
                    iArr3[i12] = iArr2[i15];
                    i15++;
                }
                i12++;
            }
        }

        @Override // com.applovin.exoplayer2.h.z
        public int b() {
            int[] iArr = this.f6731b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // com.applovin.exoplayer2.h.z
        public int b(int i10) {
            int i11 = this.f6732c[i10] - 1;
            if (i11 >= 0) {
                return this.f6731b[i11];
            }
            return -1;
        }

        @Override // com.applovin.exoplayer2.h.z
        public z b(int i10, int i11) {
            int i12 = i11 - i10;
            int[] iArr = new int[this.f6731b.length - i12];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int[] iArr2 = this.f6731b;
                if (i13 >= iArr2.length) {
                    return new a(iArr, new Random(this.f6730a.nextLong()));
                }
                if (iArr2[i13] < i10 || iArr2[i13] >= i11) {
                    iArr[i13 - i14] = iArr2[i13] >= i10 ? iArr2[i13] - i12 : iArr2[i13];
                } else {
                    i14++;
                }
                i13++;
            }
        }

        @Override // com.applovin.exoplayer2.h.z
        public int c() {
            int[] iArr = this.f6731b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // com.applovin.exoplayer2.h.z
        public z d() {
            return new a(0, new Random(this.f6730a.nextLong()));
        }
    }

    int a();

    int a(int i10);

    z a(int i10, int i11);

    int b();

    int b(int i10);

    z b(int i10, int i11);

    int c();

    z d();
}
