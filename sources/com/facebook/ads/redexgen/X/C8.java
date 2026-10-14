package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C8 {
    public static C7 A00(int i10, long[] jArr, int[] iArr, long j10) {
        int chunkSamplesRemaining = 8192 / i10;
        int iA04 = 0;
        for (int i11 : iArr) {
            iA04 += C0930Hv.A04(i11, chunkSamplesRemaining);
        }
        long[] jArr2 = new long[iA04];
        int[] iArr2 = new int[iA04];
        int originalSampleIndex = 0;
        long[] timestamps = new long[iA04];
        int[] flags = new int[iA04];
        int i12 = 0;
        int bufferSampleCount = 0;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int rechunkedSampleCount = iArr[i13];
            long j11 = jArr[i13];
            while (rechunkedSampleCount > 0) {
                int iMin = Math.min(chunkSamplesRemaining, rechunkedSampleCount);
                jArr2[bufferSampleCount] = j11;
                iArr2[bufferSampleCount] = i10 * iMin;
                originalSampleIndex = Math.max(originalSampleIndex, iArr2[bufferSampleCount]);
                timestamps[bufferSampleCount] = ((long) i12) * j10;
                flags[bufferSampleCount] = 1;
                j11 += (long) iArr2[bufferSampleCount];
                i12 += iMin;
                rechunkedSampleCount -= iMin;
                bufferSampleCount++;
            }
        }
        return new C7(jArr2, iArr2, originalSampleIndex, timestamps, flags, j10 * ((long) i12));
    }
}
