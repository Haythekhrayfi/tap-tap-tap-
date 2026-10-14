package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class ma1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long[] f23013d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f23014a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23016c;

    public static int a(int i10) {
        long j10;
        int i11 = 0;
        do {
            long[] jArr = f23013d;
            if (i11 >= 8) {
                return -1;
            }
            j10 = jArr[i11] & ((long) i10);
            i11++;
        } while (j10 == 0);
        return i11;
    }

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j10 = ((long) bArr[0]) & 255;
        if (z10) {
            j10 &= ~f23013d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (((long) bArr[i11]) & 255);
        }
        return j10;
    }

    public final int a() {
        return this.f23016c;
    }

    public final long a(xn xnVar, boolean z10, boolean z11, int i10) throws IOException {
        if (this.f23015b == 0) {
            if (!xnVar.a(this.f23014a, 0, 1, z10)) {
                return -1L;
            }
            int iA = a(this.f23014a[0] & 255);
            this.f23016c = iA;
            if (iA == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f23015b = 1;
        }
        int i11 = this.f23016c;
        if (i11 > i10) {
            this.f23015b = 0;
            return -2L;
        }
        if (i11 != 1) {
            xnVar.a(this.f23014a, 1, i11 - 1, false);
        }
        this.f23015b = 0;
        return a(this.f23014a, this.f23016c, z11);
    }

    public final void b() {
        this.f23015b = 0;
        this.f23016c = 0;
    }
}
