package com.applovin.exoplayer2.e.g;

import com.applovin.exoplayer2.l.ai;

/* JADX INFO: loaded from: classes.dex */
final class d {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f5502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f5503b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f5504c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long[] f5505d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f5506e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f5507f;

        private a(long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
            this.f5502a = jArr;
            this.f5503b = iArr;
            this.f5504c = i10;
            this.f5505d = jArr2;
            this.f5506e = iArr2;
            this.f5507f = j10;
        }
    }

    public static a a(int i10, long[] jArr, int[] iArr, long j10) {
        int i11 = 8192 / i10;
        int iA = 0;
        for (int i12 : iArr) {
            iA += ai.a(i12, i11);
        }
        long[] jArr2 = new long[iA];
        int[] iArr2 = new int[iA];
        long[] jArr3 = new long[iA];
        int[] iArr3 = new int[iA];
        int i13 = 0;
        int i14 = 0;
        int iMax = 0;
        for (int i15 = 0; i15 < iArr.length; i15++) {
            int i16 = iArr[i15];
            long j11 = jArr[i15];
            while (i16 > 0) {
                int iMin = Math.min(i11, i16);
                jArr2[i14] = j11;
                iArr2[i14] = i10 * iMin;
                iMax = Math.max(iMax, iArr2[i14]);
                jArr3[i14] = ((long) i13) * j10;
                iArr3[i14] = 1;
                j11 += (long) iArr2[i14];
                i13 += iMin;
                i16 -= iMin;
                i14++;
            }
        }
        return new a(jArr2, iArr2, iMax, jArr3, iArr3, j10 * ((long) i13));
    }
}
