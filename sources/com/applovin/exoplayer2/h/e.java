package com.applovin.exoplayer2.h;

import android.os.Handler;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class e<T> extends com.applovin.exoplayer2.h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<T, b<T>> f6541a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f6542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.applovin.exoplayer2.k.aa f6543c;

    public final class a implements com.applovin.exoplayer2.d.g, q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T f6545b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private q.a f6546c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private com.applovin.exoplayer2.d.g.a f6547d;

        public a(T t10) {
            this.f6546c = e.this.a((p.a) null);
            this.f6547d = e.this.b((p.a) null);
            this.f6545b = t10;
        }

        private m a(m mVar) {
            long jA = e.this.a(this.f6545b, mVar.f6606f);
            long jA2 = e.this.a(this.f6545b, mVar.f6607g);
            return (jA == mVar.f6606f && jA2 == mVar.f6607g) ? mVar : new m(mVar.f6601a, mVar.f6602b, mVar.f6603c, mVar.f6604d, mVar.f6605e, jA, jA2);
        }

        private boolean f(int i10, p.a aVar) {
            p.a aVarA;
            if (aVar != null) {
                aVarA = e.this.a(this.f6545b, aVar);
                if (aVarA == null) {
                    return false;
                }
            } else {
                aVarA = null;
            }
            int iA = e.this.a((Object) this.f6545b, i10);
            q.a aVar2 = this.f6546c;
            if (aVar2.f6613a != iA || !ai.a(aVar2.f6614b, aVarA)) {
                this.f6546c = e.this.a(iA, aVarA, 0L);
            }
            com.applovin.exoplayer2.d.g.a aVar3 = this.f6547d;
            if (aVar3.f5142a == iA && ai.a(aVar3.f5143b, aVarA)) {
                return true;
            }
            this.f6547d = e.this.a(iA, aVarA);
            return true;
        }

        @Override // com.applovin.exoplayer2.d.g
        public void a(int i10, p.a aVar) {
            if (f(i10, aVar)) {
                this.f6547d.a();
            }
        }

        @Override // com.applovin.exoplayer2.d.g
        public void a(int i10, p.a aVar, int i11) {
            if (f(i10, aVar)) {
                this.f6547d.a(i11);
            }
        }

        @Override // com.applovin.exoplayer2.h.q
        public void a(int i10, p.a aVar, j jVar, m mVar) {
            if (f(i10, aVar)) {
                this.f6546c.a(jVar, a(mVar));
            }
        }

        @Override // com.applovin.exoplayer2.h.q
        public void a(int i10, p.a aVar, j jVar, m mVar, IOException iOException, boolean z10) {
            if (f(i10, aVar)) {
                this.f6546c.a(jVar, a(mVar), iOException, z10);
            }
        }

        @Override // com.applovin.exoplayer2.h.q
        public void a(int i10, p.a aVar, m mVar) {
            if (f(i10, aVar)) {
                this.f6546c.a(a(mVar));
            }
        }

        @Override // com.applovin.exoplayer2.d.g
        public void a(int i10, p.a aVar, Exception exc) {
            if (f(i10, aVar)) {
                this.f6547d.a(exc);
            }
        }

        @Override // com.applovin.exoplayer2.d.g
        public void b(int i10, p.a aVar) {
            if (f(i10, aVar)) {
                this.f6547d.b();
            }
        }

        @Override // com.applovin.exoplayer2.h.q
        public void b(int i10, p.a aVar, j jVar, m mVar) {
            if (f(i10, aVar)) {
                this.f6546c.b(jVar, a(mVar));
            }
        }

        @Override // com.applovin.exoplayer2.d.g
        public void c(int i10, p.a aVar) {
            if (f(i10, aVar)) {
                this.f6547d.c();
            }
        }

        @Override // com.applovin.exoplayer2.h.q
        public void c(int i10, p.a aVar, j jVar, m mVar) {
            if (f(i10, aVar)) {
                this.f6546c.c(jVar, a(mVar));
            }
        }

        @Override // com.applovin.exoplayer2.d.g
        public void d(int i10, p.a aVar) {
            if (f(i10, aVar)) {
                this.f6547d.d();
            }
        }
    }

    public static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f6548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p.b f6549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e<T>.a f6550c;

        public b(p pVar, p.b bVar, e<T>.a aVar) {
            this.f6548a = pVar;
            this.f6549b = bVar;
            this.f6550c = aVar;
        }
    }

    public int a(T t10, int i10) {
        return i10;
    }

    public long a(T t10, long j10) {
        return j10;
    }

    public p.a a(T t10, p.a aVar) {
        return aVar;
    }

    @Override // com.applovin.exoplayer2.h.a
    public void a() {
        for (b<T> bVar : this.f6541a.values()) {
            bVar.f6548a.a(bVar.f6549b);
        }
    }

    @Override // com.applovin.exoplayer2.h.a
    public void a(com.applovin.exoplayer2.k.aa aaVar) {
        this.f6543c = aaVar;
        this.f6542b = ai.a();
    }

    public final void a(final T t10, p pVar) {
        com.applovin.exoplayer2.l.a.a(!this.f6541a.containsKey(t10));
        p.b bVar = new p.b() { // from class: com.applovin.exoplayer2.h.b0
            @Override // com.applovin.exoplayer2.h.p.b
            public final void onSourceInfoRefreshed(p pVar2, ba baVar) {
                this.f6515a.b(t10, pVar2, baVar);
            }
        };
        a aVar = new a(t10);
        this.f6541a.put(t10, new b<>(pVar, bVar, aVar));
        pVar.a((Handler) com.applovin.exoplayer2.l.a.b(this.f6542b), (q) aVar);
        pVar.a((Handler) com.applovin.exoplayer2.l.a.b(this.f6542b), (com.applovin.exoplayer2.d.g) aVar);
        pVar.a(bVar, this.f6543c);
        if (d()) {
            return;
        }
        pVar.b(bVar);
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public abstract void b(T t10, p pVar, ba baVar);

    @Override // com.applovin.exoplayer2.h.a
    public void b() {
        for (b<T> bVar : this.f6541a.values()) {
            bVar.f6548a.b(bVar.f6549b);
        }
    }

    @Override // com.applovin.exoplayer2.h.a
    public void c() {
        for (b<T> bVar : this.f6541a.values()) {
            bVar.f6548a.c(bVar.f6549b);
            bVar.f6548a.a((q) bVar.f6550c);
            bVar.f6548a.a((com.applovin.exoplayer2.d.g) bVar.f6550c);
        }
        this.f6541a.clear();
    }

    @Override // com.applovin.exoplayer2.h.p
    public void e() throws IOException {
        Iterator<b<T>> it = this.f6541a.values().iterator();
        while (it.hasNext()) {
            it.next().f6548a.e();
        }
    }
}
