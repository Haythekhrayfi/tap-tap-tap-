package com.applovin.exoplayer2.e.e;

import com.applovin.exoplayer2.e.i;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long[] f5410a = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f5411b = new byte[8];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f5412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f5413d;

    public static int a(int i10) {
        long j10;
        int i11 = 0;
        do {
            long[] jArr = f5410a;
            if (i11 >= jArr.length) {
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
            j10 &= ~f5410a[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (((long) bArr[i11]) & 255);
        }
        return j10;
    }

    public long a(i iVar, boolean z10, boolean z11, int i10) throws IOException {
        if (this.f5412c == 0) {
            if (!iVar.a(this.f5411b, 0, 1, z10)) {
                return -1L;
            }
            int iA = a(this.f5411b[0] & 255);
            this.f5413d = iA;
            if (iA == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f5412c = 1;
        }
        int i11 = this.f5413d;
        if (i11 > i10) {
            this.f5412c = 0;
            return -2L;
        }
        if (i11 != 1) {
            iVar.b(this.f5411b, 1, i11 - 1);
        }
        this.f5412c = 0;
        return a(this.f5411b, this.f5413d, z11);
    }

    public void a() {
        this.f5412c = 0;
        this.f5413d = 0;
    }

    public int b() {
        return this.f5413d;
    }
}
