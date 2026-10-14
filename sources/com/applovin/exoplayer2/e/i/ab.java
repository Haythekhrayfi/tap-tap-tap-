package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class ab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5709a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f5712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f5713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f5714f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ag f5710b = new ag(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f5715g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f5716h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f5717i = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f5711c = new com.applovin.exoplayer2.l.y();

    public ab(int i10) {
        this.f5709a = i10;
    }

    private int a(com.applovin.exoplayer2.e.i iVar) {
        this.f5711c.a(ai.f7600f);
        this.f5712d = true;
        iVar.a();
        return 0;
    }

    private long a(com.applovin.exoplayer2.l.y yVar, int i10) {
        int iB = yVar.b();
        for (int iC = yVar.c(); iC < iB; iC++) {
            if (yVar.d()[iC] == 71) {
                long jA = ae.a(yVar, iC, i10);
                if (jA != -9223372036854775807L) {
                    return jA;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int b(com.applovin.exoplayer2.e.i iVar, com.applovin.exoplayer2.e.u uVar, int i10) throws IOException {
        int iMin = (int) Math.min(this.f5709a, iVar.d());
        long j10 = 0;
        if (iVar.c() != j10) {
            uVar.f6134a = j10;
            return 1;
        }
        this.f5711c.a(iMin);
        iVar.a();
        iVar.d(this.f5711c.d(), 0, iMin);
        this.f5715g = a(this.f5711c, i10);
        this.f5713e = true;
        return 0;
    }

    private long b(com.applovin.exoplayer2.l.y yVar, int i10) {
        int iC = yVar.c();
        int iB = yVar.b();
        for (int i11 = iB - 188; i11 >= iC; i11--) {
            if (ae.a(yVar.d(), iC, iB, i11)) {
                long jA = ae.a(yVar, i11, i10);
                if (jA != -9223372036854775807L) {
                    return jA;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int c(com.applovin.exoplayer2.e.i iVar, com.applovin.exoplayer2.e.u uVar, int i10) throws IOException {
        long jD = iVar.d();
        int iMin = (int) Math.min(this.f5709a, jD);
        long j10 = jD - ((long) iMin);
        if (iVar.c() != j10) {
            uVar.f6134a = j10;
            return 1;
        }
        this.f5711c.a(iMin);
        iVar.a();
        iVar.d(this.f5711c.d(), 0, iMin);
        this.f5716h = b(this.f5711c, i10);
        this.f5714f = true;
        return 0;
    }

    public int a(com.applovin.exoplayer2.e.i iVar, com.applovin.exoplayer2.e.u uVar, int i10) throws IOException {
        if (i10 <= 0) {
            return a(iVar);
        }
        if (!this.f5714f) {
            return c(iVar, uVar, i10);
        }
        if (this.f5716h == -9223372036854775807L) {
            return a(iVar);
        }
        if (!this.f5713e) {
            return b(iVar, uVar, i10);
        }
        long j10 = this.f5715g;
        if (j10 == -9223372036854775807L) {
            return a(iVar);
        }
        long jB = this.f5710b.b(this.f5716h) - this.f5710b.b(j10);
        this.f5717i = jB;
        if (jB < 0) {
            StringBuilder sbA = defpackage.a.a("Invalid duration: ");
            sbA.append(this.f5717i);
            sbA.append(". Using TIME_UNSET instead.");
            com.applovin.exoplayer2.l.q.c("TsDurationReader", sbA.toString());
            this.f5717i = -9223372036854775807L;
        }
        return a(iVar);
    }

    public boolean a() {
        return this.f5712d;
    }

    public long b() {
        return this.f5717i;
    }

    public ag c() {
        return this.f5710b;
    }
}
