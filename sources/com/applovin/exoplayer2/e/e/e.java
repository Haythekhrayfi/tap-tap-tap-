package com.applovin.exoplayer2.e.e;

import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f5408a = new y(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f5409b;

    private long b(i iVar) throws IOException {
        int i10 = 0;
        iVar.d(this.f5408a.d(), 0, 1);
        int i11 = this.f5408a.d()[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        iVar.d(this.f5408a.d(), 1, i13);
        while (i10 < i13) {
            i10++;
            i14 = (this.f5408a.d()[i10] & 255) + (i14 << 8);
        }
        this.f5409b = i13 + 1 + this.f5409b;
        return i14;
    }

    public boolean a(i iVar) throws IOException {
        long jD = iVar.d();
        long j10 = 1024;
        if (jD != -1 && jD <= 1024) {
            j10 = jD;
        }
        int i10 = (int) j10;
        iVar.d(this.f5408a.d(), 0, 4);
        long jO = this.f5408a.o();
        this.f5409b = 4;
        while (jO != 440786851) {
            int i11 = this.f5409b + 1;
            this.f5409b = i11;
            if (i11 == i10) {
                return false;
            }
            iVar.d(this.f5408a.d(), 0, 1);
            jO = ((jO << 8) & (-256)) | ((long) (this.f5408a.d()[0] & 255));
        }
        long jB = b(iVar);
        long j11 = this.f5409b;
        if (jB == Long.MIN_VALUE) {
            return false;
        }
        if (jD != -1 && j11 + jB >= jD) {
            return false;
        }
        while (true) {
            int i12 = this.f5409b;
            long j12 = j11 + jB;
            if (i12 >= j12) {
                return ((long) i12) == j12;
            }
            if (b(iVar) == Long.MIN_VALUE) {
                return false;
            }
            long jB2 = b(iVar);
            if (jB2 < 0 || jB2 > 2147483647L) {
                return false;
            }
            if (jB2 != 0) {
                int i13 = (int) jB2;
                iVar.c(i13);
                this.f5409b += i13;
            }
        }
    }
}
