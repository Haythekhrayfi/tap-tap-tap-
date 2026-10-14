package com.applovin.exoplayer2.h;

import android.net.Uri;
import com.applovin.exoplayer2.l.ai;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.e.l f6517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.applovin.exoplayer2.e.h f6518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.applovin.exoplayer2.e.i f6519c;

    public c(com.applovin.exoplayer2.e.l lVar) {
        this.f6517a = lVar;
    }

    @Override // com.applovin.exoplayer2.h.s
    public int a(com.applovin.exoplayer2.e.u uVar) throws IOException {
        return ((com.applovin.exoplayer2.e.h) com.applovin.exoplayer2.l.a.b(this.f6518b)).a((com.applovin.exoplayer2.e.i) com.applovin.exoplayer2.l.a.b(this.f6519c), uVar);
    }

    @Override // com.applovin.exoplayer2.h.s
    public void a() {
        com.applovin.exoplayer2.e.h hVar = this.f6518b;
        if (hVar != null) {
            hVar.c();
            this.f6518b = null;
        }
        this.f6519c = null;
    }

    @Override // com.applovin.exoplayer2.h.s
    public void a(long j10, long j11) {
        ((com.applovin.exoplayer2.e.h) com.applovin.exoplayer2.l.a.b(this.f6518b)).a(j10, j11);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    @Override // com.applovin.exoplayer2.h.s
    public void a(com.applovin.exoplayer2.k.g gVar, Uri uri, Map<String, List<String>> map, long j10, long j11, com.applovin.exoplayer2.e.j jVar) throws IOException {
        com.applovin.exoplayer2.e.e eVar = new com.applovin.exoplayer2.e.e(gVar, j10, j11);
        this.f6519c = eVar;
        if (this.f6518b != null) {
            return;
        }
        com.applovin.exoplayer2.e.h[] hVarArrA = this.f6517a.a(uri, map);
        if (hVarArrA.length == 1) {
            this.f6518b = hVarArrA[0];
        } else {
            for (com.applovin.exoplayer2.e.h hVar : hVarArrA) {
                try {
                    if (hVar.a(eVar)) {
                        this.f6518b = hVar;
                        com.applovin.exoplayer2.l.a.b(true);
                        eVar.a();
                        break;
                    } else {
                        boolean z10 = this.f6518b != null || eVar.c() == j10;
                        com.applovin.exoplayer2.l.a.b(z10);
                        eVar.a();
                    }
                } catch (EOFException unused) {
                    if (this.f6518b != null || eVar.c() == j10) {
                    }
                } catch (Throwable th) {
                    com.applovin.exoplayer2.l.a.b(this.f6518b != null || eVar.c() == j10);
                    eVar.a();
                    throw th;
                }
                com.applovin.exoplayer2.l.a.b(z10);
                eVar.a();
            }
            if (this.f6518b == null) {
                throw new ae(androidx.activity.k.a(defpackage.a.a("None of the available extractors ("), ai.b(hVarArrA), ") could read the stream."), (Uri) com.applovin.exoplayer2.l.a.b(uri));
            }
        }
        this.f6518b.a(jVar);
    }

    @Override // com.applovin.exoplayer2.h.s
    public void b() {
        com.applovin.exoplayer2.e.h hVar = this.f6518b;
        if (hVar instanceof com.applovin.exoplayer2.e.f.d) {
            ((com.applovin.exoplayer2.e.f.d) hVar).a();
        }
    }

    @Override // com.applovin.exoplayer2.h.s
    public long c() {
        com.applovin.exoplayer2.e.i iVar = this.f6519c;
        if (iVar != null) {
            return iVar.c();
        }
        return -1L;
    }
}
