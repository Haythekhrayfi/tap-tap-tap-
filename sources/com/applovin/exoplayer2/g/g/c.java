package com.applovin.exoplayer2.g.g;

import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.x;
import com.applovin.exoplayer2.l.y;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class c extends com.applovin.exoplayer2.g.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f6421a = new y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f6422b = new x();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ag f6423c;

    @Override // com.applovin.exoplayer2.g.g
    public com.applovin.exoplayer2.g.a a(com.applovin.exoplayer2.g.d dVar, ByteBuffer byteBuffer) {
        ag agVar = this.f6423c;
        if (agVar == null || dVar.f6336f != agVar.c()) {
            ag agVar2 = new ag(dVar.f4754d);
            this.f6423c = agVar2;
            agVar2.c(dVar.f4754d - dVar.f6336f);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f6421a.a(bArrArray, iLimit);
        this.f6422b.a(bArrArray, iLimit);
        this.f6422b.b(39);
        long jC = (((long) this.f6422b.c(1)) << 32) | ((long) this.f6422b.c(32));
        this.f6422b.b(20);
        int iC = this.f6422b.c(12);
        int iC2 = this.f6422b.c(8);
        com.applovin.exoplayer2.g.a.InterfaceC0092a eVar = null;
        this.f6421a.e(14);
        if (iC2 == 0) {
            eVar = new e();
        } else if (iC2 == 255) {
            eVar = a.a(this.f6421a, iC, jC);
        } else if (iC2 == 4) {
            eVar = f.a(this.f6421a);
        } else if (iC2 == 5) {
            eVar = d.a(this.f6421a, jC, this.f6423c);
        } else if (iC2 == 6) {
            eVar = g.a(this.f6421a, jC, this.f6423c);
        }
        return eVar == null ? new com.applovin.exoplayer2.g.a(new com.applovin.exoplayer2.g.a.InterfaceC0092a[0]) : new com.applovin.exoplayer2.g.a(eVar);
    }
}
