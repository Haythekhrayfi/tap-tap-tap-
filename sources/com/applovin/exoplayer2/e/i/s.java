package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.ai;

/* JADX INFO: loaded from: classes.dex */
public final class s implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.exoplayer2.v f6010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ag f6011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.applovin.exoplayer2.e.x f6012c;

    public s(String str) {
        this.f6010a = new com.applovin.exoplayer2.v.a().f(str).a();
    }

    private void a() {
        com.applovin.exoplayer2.l.a.a(this.f6011b);
        ai.a(this.f6012c);
    }

    @Override // com.applovin.exoplayer2.e.i.x
    public void a(ag agVar, com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        this.f6011b = agVar;
        dVar.a();
        com.applovin.exoplayer2.e.x xVarA = jVar.a(dVar.b(), 5);
        this.f6012c = xVarA;
        xVarA.a(this.f6010a);
    }

    @Override // com.applovin.exoplayer2.e.i.x
    public void a(com.applovin.exoplayer2.l.y yVar) {
        a();
        long jB = this.f6011b.b();
        long jC = this.f6011b.c();
        if (jB == -9223372036854775807L || jC == -9223372036854775807L) {
            return;
        }
        com.applovin.exoplayer2.v vVar = this.f6010a;
        if (jC != vVar.f8202p) {
            com.applovin.exoplayer2.v vVarA = vVar.a().a(jC).a();
            this.f6010a = vVarA;
            this.f6012c.a(vVarA);
        }
        int iA = yVar.a();
        this.f6012c.a(yVar, iA);
        this.f6012c.a(jB, 1, iA, 0, null);
    }
}
