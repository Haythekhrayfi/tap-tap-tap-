package com.applovin.exoplayer2.d;

import android.net.Uri;
import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.common.a.ax;
import com.applovin.exoplayer2.l.ai;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f5127a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ab.d f5128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h f5129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.applovin.exoplayer2.k.t.b f5130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f5131e;

    private h a(ab.d dVar) {
        com.applovin.exoplayer2.k.t.b bVarA = this.f5130d;
        if (bVarA == null) {
            bVarA = new com.applovin.exoplayer2.k.q.a().a(this.f5131e);
        }
        Uri uri = dVar.f4077b;
        p pVar = new p(uri == null ? null : uri.toString(), dVar.f4081f, bVarA);
        ax<Map.Entry<String, String>> it = dVar.f4078c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            pVar.a(next.getKey(), next.getValue());
        }
        c cVarA = new c.a().a(dVar.f4076a, o.f5160a).a(dVar.f4079d).b(dVar.f4080e).a(com.applovin.exoplayer2.common.b.c.a(dVar.f4082g)).a(pVar);
        cVarA.a(0, dVar.a());
        return cVarA;
    }

    @Override // com.applovin.exoplayer2.d.i
    public h a(ab abVar) {
        h hVar;
        com.applovin.exoplayer2.l.a.b(abVar.f4048c);
        ab.d dVar = abVar.f4048c.f4106c;
        if (dVar == null || ai.f7595a < 18) {
            return h.f5147b;
        }
        synchronized (this.f5127a) {
            if (!ai.a(dVar, this.f5128b)) {
                this.f5128b = dVar;
                this.f5129c = a(dVar);
            }
            hVar = (h) com.applovin.exoplayer2.l.a.b(this.f5129c);
        }
        return hVar;
    }
}
