package com.applovin.exoplayer2.e.h;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.b.z;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.l;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class c implements com.applovin.exoplayer2.e.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f5654a = z.f4655k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j f5655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h f5656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f5657d;

    private static y a(y yVar) {
        yVar.d(0);
        return yVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.exoplayer2.e.h[] a() {
        return new com.applovin.exoplayer2.e.h[]{new c()};
    }

    private boolean b(com.applovin.exoplayer2.e.i iVar) throws IOException {
        h gVar;
        e eVar = new e();
        if (eVar.a(iVar, true) && (eVar.f5664b & 2) == 2) {
            int iMin = Math.min(eVar.f5671i, 8);
            y yVar = new y(iMin);
            iVar.d(yVar.d(), 0, iMin);
            if (b.a(a(yVar))) {
                gVar = new b();
            } else if (i.a(a(yVar))) {
                gVar = new i();
            } else if (g.a(a(yVar))) {
                gVar = new g();
            }
            this.f5656c = gVar;
            return true;
        }
        return false;
    }

    @Override // com.applovin.exoplayer2.e.h
    public int a(com.applovin.exoplayer2.e.i iVar, u uVar) throws IOException {
        com.applovin.exoplayer2.l.a.a(this.f5655b);
        if (this.f5656c == null) {
            if (!b(iVar)) {
                throw ai.b("Failed to determine bitstream type", null);
            }
            iVar.a();
        }
        if (!this.f5657d) {
            x xVarA = this.f5655b.a(0, 1);
            this.f5655b.a();
            this.f5656c.a(this.f5655b, xVarA);
            this.f5657d = true;
        }
        return this.f5656c.a(iVar, uVar);
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j10, long j11) {
        h hVar = this.f5656c;
        if (hVar != null) {
            hVar.a(j10, j11);
        }
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(j jVar) {
        this.f5655b = jVar;
    }

    @Override // com.applovin.exoplayer2.e.h
    public boolean a(com.applovin.exoplayer2.e.i iVar) throws IOException {
        try {
            return b(iVar);
        } catch (ai unused) {
            return false;
        }
    }

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
    }
}
