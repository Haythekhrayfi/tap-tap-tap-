package com.applovin.exoplayer2.e.i;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class a implements com.applovin.exoplayer2.e.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.applovin.exoplayer2.e.l f5701a = com.applovin.exoplayer2.a.p.f4003s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f5702b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f5703c = new com.applovin.exoplayer2.l.y(2786);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f5704d;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.exoplayer2.e.h[] a() {
        return new com.applovin.exoplayer2.e.h[]{new a()};
    }

    @Override // com.applovin.exoplayer2.e.h
    public int a(com.applovin.exoplayer2.e.i iVar, com.applovin.exoplayer2.e.u uVar) throws IOException {
        int iA = iVar.a(this.f5703c.d(), 0, 2786);
        if (iA == -1) {
            return -1;
        }
        this.f5703c.d(0);
        this.f5703c.c(iA);
        if (!this.f5704d) {
            this.f5702b.a(0L, 4);
            this.f5704d = true;
        }
        this.f5702b.a(this.f5703c);
        return 0;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j10, long j11) {
        this.f5704d = false;
        this.f5702b.a();
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(com.applovin.exoplayer2.e.j jVar) {
        this.f5702b.a(jVar, new ad.d(0, 1));
        jVar.a();
        jVar.a(new com.applovin.exoplayer2.e.v.b(-9223372036854775807L));
    }

    @Override // com.applovin.exoplayer2.e.h
    public boolean a(com.applovin.exoplayer2.e.i iVar) throws IOException {
        com.applovin.exoplayer2.l.y yVar = new com.applovin.exoplayer2.l.y(10);
        int i10 = 0;
        while (true) {
            iVar.d(yVar.d(), 0, 10);
            yVar.d(0);
            if (yVar.m() != 4801587) {
                break;
            }
            yVar.e(3);
            int iV = yVar.v();
            i10 += iV + 10;
            iVar.c(iV);
        }
        iVar.a();
        iVar.c(i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            iVar.d(yVar.d(), 0, 6);
            yVar.d(0);
            if (yVar.i() != 2935) {
                iVar.a();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                iVar.c(i12);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int iA = com.applovin.exoplayer2.b.b.a(yVar.d());
                if (iA == -1) {
                    return false;
                }
                iVar.c(iA - 6);
            }
        }
    }

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
    }
}
