package com.applovin.exoplayer2.e.i;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ad.a> f5836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.exoplayer2.e.x[] f5837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f5839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f5840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f5841f = -9223372036854775807L;

    public i(List<ad.a> list) {
        this.f5836a = list;
        this.f5837b = new com.applovin.exoplayer2.e.x[list.size()];
    }

    private boolean a(com.applovin.exoplayer2.l.y yVar, int i10) {
        if (yVar.a() == 0) {
            return false;
        }
        if (yVar.h() != i10) {
            this.f5838c = false;
        }
        this.f5839d--;
        return this.f5838c;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a() {
        this.f5838c = false;
        this.f5841f = -9223372036854775807L;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f5838c = true;
        if (j10 != -9223372036854775807L) {
            this.f5841f = j10;
        }
        this.f5840e = 0;
        this.f5839d = 2;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        for (int i10 = 0; i10 < this.f5837b.length; i10++) {
            ad.a aVar = this.f5836a.get(i10);
            dVar.a();
            com.applovin.exoplayer2.e.x xVarA = jVar.a(dVar.b(), 3);
            xVarA.a(new com.applovin.exoplayer2.v.a().a(dVar.c()).f("application/dvbsubs").a(Collections.singletonList(aVar.f5747c)).c(aVar.f5745a).a());
            this.f5837b[i10] = xVarA;
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.l.y yVar) {
        if (this.f5838c) {
            if (this.f5839d != 2 || a(yVar, 32)) {
                if (this.f5839d != 1 || a(yVar, 0)) {
                    int iC = yVar.c();
                    int iA = yVar.a();
                    for (com.applovin.exoplayer2.e.x xVar : this.f5837b) {
                        yVar.d(iC);
                        xVar.a(yVar, iA);
                    }
                    this.f5840e += iA;
                }
            }
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void b() {
        if (this.f5838c) {
            if (this.f5841f != -9223372036854775807L) {
                for (com.applovin.exoplayer2.e.x xVar : this.f5837b) {
                    xVar.a(this.f5841f, 1, this.f5840e, 0, null);
                }
            }
            this.f5838c = false;
        }
    }
}
