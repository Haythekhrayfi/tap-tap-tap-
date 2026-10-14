package com.applovin.exoplayer2.j;

import com.applovin.exoplayer2.as;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.h.ad;
import com.applovin.exoplayer2.h.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f7303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.applovin.exoplayer2.k.d f7304b;

    public interface a {
    }

    public abstract k a(as[] asVarArr, ad adVar, p.a aVar, ba baVar) throws com.applovin.exoplayer2.p;

    public final void a(a aVar, com.applovin.exoplayer2.k.d dVar) {
        this.f7303a = aVar;
        this.f7304b = dVar;
    }

    public abstract void a(Object obj);

    public boolean a() {
        return false;
    }

    public final com.applovin.exoplayer2.k.d d() {
        return (com.applovin.exoplayer2.k.d) com.applovin.exoplayer2.l.a.b(this.f7304b);
    }
}
