package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f6029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f6030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f6031e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ag f6027a = new ag(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f6032f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f6033g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f6034h = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f6028b = new com.applovin.exoplayer2.l.y();

    private int a(com.applovin.exoplayer2.e.i iVar) {
        this.f6028b.a(ai.f7600f);
        this.f6029c = true;
        iVar.a();
        return 0;
    }

    private int a(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static long a(com.applovin.exoplayer2.l.y yVar) {
        int iC = yVar.c();
        if (yVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        yVar.a(bArr, 0, 9);
        yVar.d(iC);
        if (a(bArr)) {
            return b(bArr);
        }
        return -9223372036854775807L;
    }

    private static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private int b(com.applovin.exoplayer2.e.i iVar, com.applovin.exoplayer2.e.u uVar) throws IOException {
        int iMin = (int) Math.min(20000L, iVar.d());
        long j10 = 0;
        if (iVar.c() != j10) {
            uVar.f6134a = j10;
            return 1;
        }
        this.f6028b.a(iMin);
        iVar.a();
        iVar.d(this.f6028b.d(), 0, iMin);
        this.f6032f = b(this.f6028b);
        this.f6030d = true;
        return 0;
    }

    private long b(com.applovin.exoplayer2.l.y yVar) {
        int iB = yVar.b();
        for (int iC = yVar.c(); iC < iB - 3; iC++) {
            if (a(yVar.d(), iC) == 442) {
                yVar.d(iC + 4);
                long jA = a(yVar);
                if (jA != -9223372036854775807L) {
                    return jA;
                }
            }
        }
        return -9223372036854775807L;
    }

    private static long b(byte[] bArr) {
        return (((((long) bArr[0]) & 56) >> 3) << 30) | ((((long) bArr[0]) & 3) << 28) | ((((long) bArr[1]) & 255) << 20) | (((((long) bArr[2]) & 248) >> 3) << 15) | ((((long) bArr[2]) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    private int c(com.applovin.exoplayer2.e.i iVar, com.applovin.exoplayer2.e.u uVar) throws IOException {
        long jD = iVar.d();
        int iMin = (int) Math.min(20000L, jD);
        long j10 = jD - ((long) iMin);
        if (iVar.c() != j10) {
            uVar.f6134a = j10;
            return 1;
        }
        this.f6028b.a(iMin);
        iVar.a();
        iVar.d(this.f6028b.d(), 0, iMin);
        this.f6033g = c(this.f6028b);
        this.f6031e = true;
        return 0;
    }

    private long c(com.applovin.exoplayer2.l.y yVar) {
        int iC = yVar.c();
        for (int iB = yVar.b() - 4; iB >= iC; iB--) {
            if (a(yVar.d(), iB) == 442) {
                yVar.d(iB + 4);
                long jA = a(yVar);
                if (jA != -9223372036854775807L) {
                    return jA;
                }
            }
        }
        return -9223372036854775807L;
    }

    public int a(com.applovin.exoplayer2.e.i iVar, com.applovin.exoplayer2.e.u uVar) throws IOException {
        if (!this.f6031e) {
            return c(iVar, uVar);
        }
        if (this.f6033g == -9223372036854775807L) {
            return a(iVar);
        }
        if (!this.f6030d) {
            return b(iVar, uVar);
        }
        long j10 = this.f6032f;
        if (j10 == -9223372036854775807L) {
            return a(iVar);
        }
        long jB = this.f6027a.b(this.f6033g) - this.f6027a.b(j10);
        this.f6034h = jB;
        if (jB < 0) {
            StringBuilder sbA = defpackage.a.a("Invalid duration: ");
            sbA.append(this.f6034h);
            sbA.append(". Using TIME_UNSET instead.");
            com.applovin.exoplayer2.l.q.c("PsDurationReader", sbA.toString());
            this.f6034h = -9223372036854775807L;
        }
        return a(iVar);
    }

    public boolean a() {
        return this.f6029c;
    }

    public ag b() {
        return this.f6027a;
    }

    public long c() {
        return this.f6034h;
    }
}
