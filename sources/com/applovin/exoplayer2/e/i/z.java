package com.applovin.exoplayer2.e.i;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<com.applovin.exoplayer2.v> f6061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.exoplayer2.e.x[] f6062b;

    public z(List<com.applovin.exoplayer2.v> list) {
        this.f6061a = list;
        this.f6062b = new com.applovin.exoplayer2.e.x[list.size()];
    }

    public void a(long j10, com.applovin.exoplayer2.l.y yVar) {
        com.applovin.exoplayer2.e.b.a(j10, yVar, this.f6062b);
    }

    public void a(com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        for (int i10 = 0; i10 < this.f6062b.length; i10++) {
            dVar.a();
            com.applovin.exoplayer2.e.x xVarA = jVar.a(dVar.b(), 3);
            com.applovin.exoplayer2.v vVar = this.f6061a.get(i10);
            String str = vVar.f8198l;
            com.applovin.exoplayer2.l.a.a("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            String strC = vVar.f8187a;
            if (strC == null) {
                strC = dVar.c();
            }
            xVarA.a(new com.applovin.exoplayer2.v.a().a(strC).f(str).b(vVar.f8190d).c(vVar.f8189c).p(vVar.D).a(vVar.f8200n).a());
            this.f6062b[i10] = xVarA;
        }
    }
}
