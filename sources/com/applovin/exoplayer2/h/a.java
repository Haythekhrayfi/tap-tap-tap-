package com.applovin.exoplayer2.h;

import android.os.Handler;
import android.os.Looper;
import com.applovin.exoplayer2.ba;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<p.b> f6462a = new ArrayList<>(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet<p.b> f6463b = new HashSet<>(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q.a f6464c = new q.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.applovin.exoplayer2.d.g.a f6465d = new com.applovin.exoplayer2.d.g.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Looper f6466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ba f6467f;

    public final com.applovin.exoplayer2.d.g.a a(int i10, p.a aVar) {
        return this.f6465d.a(i10, aVar);
    }

    public final q.a a(int i10, p.a aVar, long j10) {
        return this.f6464c.a(i10, aVar, j10);
    }

    public final q.a a(p.a aVar) {
        return this.f6464c.a(0, aVar, 0L);
    }

    public void a() {
    }

    @Override // com.applovin.exoplayer2.h.p
    public final void a(Handler handler, com.applovin.exoplayer2.d.g gVar) {
        com.applovin.exoplayer2.l.a.b(handler);
        com.applovin.exoplayer2.l.a.b(gVar);
        this.f6465d.a(handler, gVar);
    }

    @Override // com.applovin.exoplayer2.h.p
    public final void a(Handler handler, q qVar) {
        com.applovin.exoplayer2.l.a.b(handler);
        com.applovin.exoplayer2.l.a.b(qVar);
        this.f6464c.a(handler, qVar);
    }

    public final void a(ba baVar) {
        this.f6467f = baVar;
        Iterator<p.b> it = this.f6462a.iterator();
        while (it.hasNext()) {
            it.next().onSourceInfoRefreshed(this, baVar);
        }
    }

    @Override // com.applovin.exoplayer2.h.p
    public final void a(com.applovin.exoplayer2.d.g gVar) {
        this.f6465d.a(gVar);
    }

    @Override // com.applovin.exoplayer2.h.p
    public final void a(p.b bVar) {
        com.applovin.exoplayer2.l.a.b(this.f6466e);
        boolean zIsEmpty = this.f6463b.isEmpty();
        this.f6463b.add(bVar);
        if (zIsEmpty) {
            a();
        }
    }

    @Override // com.applovin.exoplayer2.h.p
    public final void a(p.b bVar, com.applovin.exoplayer2.k.aa aaVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f6466e;
        com.applovin.exoplayer2.l.a.a(looper == null || looper == looperMyLooper);
        ba baVar = this.f6467f;
        this.f6462a.add(bVar);
        if (this.f6466e == null) {
            this.f6466e = looperMyLooper;
            this.f6463b.add(bVar);
            a(aaVar);
        } else if (baVar != null) {
            a(bVar);
            bVar.onSourceInfoRefreshed(this, baVar);
        }
    }

    @Override // com.applovin.exoplayer2.h.p
    public final void a(q qVar) {
        this.f6464c.a(qVar);
    }

    public abstract void a(com.applovin.exoplayer2.k.aa aaVar);

    public final com.applovin.exoplayer2.d.g.a b(p.a aVar) {
        return this.f6465d.a(0, aVar);
    }

    public void b() {
    }

    @Override // com.applovin.exoplayer2.h.p
    public final void b(p.b bVar) {
        boolean z10 = !this.f6463b.isEmpty();
        this.f6463b.remove(bVar);
        if (z10 && this.f6463b.isEmpty()) {
            b();
        }
    }

    public abstract void c();

    @Override // com.applovin.exoplayer2.h.p
    public final void c(p.b bVar) {
        this.f6462a.remove(bVar);
        if (!this.f6462a.isEmpty()) {
            b(bVar);
            return;
        }
        this.f6466e = null;
        this.f6467f = null;
        this.f6463b.clear();
        c();
    }

    public final boolean d() {
        return !this.f6463b.isEmpty();
    }
}
