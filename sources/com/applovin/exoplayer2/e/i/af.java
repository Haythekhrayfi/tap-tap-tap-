package com.applovin.exoplayer2.e.i;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class af {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<com.applovin.exoplayer2.v> f5757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.exoplayer2.e.x[] f5758b;

    public af(List<com.applovin.exoplayer2.v> list) {
        this.f5757a = list;
        this.f5758b = new com.applovin.exoplayer2.e.x[list.size()];
    }

    public void a(long j10, com.applovin.exoplayer2.l.y yVar) {
        if (yVar.a() < 9) {
            return;
        }
        int iQ = yVar.q();
        int iQ2 = yVar.q();
        int iH = yVar.h();
        if (iQ == 434 && iQ2 == 1195456820 && iH == 3) {
            com.applovin.exoplayer2.e.b.b(j10, yVar, this.f5758b);
        }
    }

    public void a(com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        for (int i10 = 0; i10 < this.f5758b.length; i10++) {
            dVar.a();
            com.applovin.exoplayer2.e.x xVarA = jVar.a(dVar.b(), 3);
            com.applovin.exoplayer2.v vVar = this.f5757a.get(i10);
            String str = vVar.f8198l;
            com.applovin.exoplayer2.l.a.a("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            xVarA.a(new com.applovin.exoplayer2.v.a().a(dVar.c()).f(str).b(vVar.f8190d).c(vVar.f8189c).p(vVar.D).a(vVar.f8200n).a());
            this.f5758b[i10] = xVarA;
        }
    }
}
