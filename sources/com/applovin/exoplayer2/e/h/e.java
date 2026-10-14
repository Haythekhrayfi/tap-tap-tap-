package com.applovin.exoplayer2.e.h;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.e.k;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f5665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f5666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f5667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f5668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5671i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f5672j = new int[255];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final y f5673k = new y(255);

    public void a() {
        this.f5663a = 0;
        this.f5664b = 0;
        this.f5665c = 0L;
        this.f5666d = 0L;
        this.f5667e = 0L;
        this.f5668f = 0L;
        this.f5669g = 0;
        this.f5670h = 0;
        this.f5671i = 0;
    }

    public boolean a(com.applovin.exoplayer2.e.i iVar) throws IOException {
        return a(iVar, -1L);
    }

    public boolean a(com.applovin.exoplayer2.e.i iVar, long j10) throws IOException {
        com.applovin.exoplayer2.l.a.a(iVar.c() == iVar.b());
        this.f5673k.a(4);
        while (true) {
            if ((j10 != -1 && iVar.c() + 4 >= j10) || !k.a(iVar, this.f5673k.d(), 0, 4, true)) {
                break;
            }
            this.f5673k.d(0);
            if (this.f5673k.o() == 1332176723) {
                iVar.a();
                return true;
            }
            iVar.b(1);
        }
        do {
            if (j10 != -1 && iVar.c() >= j10) {
                break;
            }
        } while (iVar.a(1) != -1);
        return false;
    }

    public boolean a(com.applovin.exoplayer2.e.i iVar, boolean z10) throws IOException {
        a();
        this.f5673k.a(27);
        if (!k.a(iVar, this.f5673k.d(), 0, 27, z10) || this.f5673k.o() != 1332176723) {
            return false;
        }
        int iH = this.f5673k.h();
        this.f5663a = iH;
        if (iH != 0) {
            if (z10) {
                return false;
            }
            throw ai.a("unsupported bit stream revision");
        }
        this.f5664b = this.f5673k.h();
        this.f5665c = this.f5673k.t();
        this.f5666d = this.f5673k.p();
        this.f5667e = this.f5673k.p();
        this.f5668f = this.f5673k.p();
        int iH2 = this.f5673k.h();
        this.f5669g = iH2;
        this.f5670h = iH2 + 27;
        this.f5673k.a(iH2);
        if (!k.a(iVar, this.f5673k.d(), 0, this.f5669g, z10)) {
            return false;
        }
        for (int i10 = 0; i10 < this.f5669g; i10++) {
            this.f5672j[i10] = this.f5673k.h();
            this.f5671i += this.f5672j[i10];
        }
        return true;
    }
}
