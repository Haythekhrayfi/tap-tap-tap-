package com.applovin.exoplayer2;

import android.os.Handler;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class ah {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f4204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.applovin.exoplayer2.h.q.a f4205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.applovin.exoplayer2.d.g.a f4206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<c, b> f4207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set<c> f4208h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f4210j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.applovin.exoplayer2.k.aa f4211k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.applovin.exoplayer2.h.z f4209i = new com.applovin.exoplayer2.h.z.a(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IdentityHashMap<com.applovin.exoplayer2.h.n, c> f4202b = new IdentityHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Object, c> f4203c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<c> f4201a = new ArrayList();

    public final class a implements com.applovin.exoplayer2.d.g, com.applovin.exoplayer2.h.q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f4213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.applovin.exoplayer2.h.q.a f4214c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private com.applovin.exoplayer2.d.g.a f4215d;

        public a(c cVar) {
            this.f4214c = ah.this.f4205e;
            this.f4215d = ah.this.f4206f;
            this.f4213b = cVar;
        }

        private boolean f(int i10, com.applovin.exoplayer2.h.p.a aVar) {
            com.applovin.exoplayer2.h.p.a aVarB;
            if (aVar != null) {
                aVarB = ah.b(this.f4213b, aVar);
                if (aVarB == null) {
                    return false;
                }
            } else {
                aVarB = null;
            }
            int iB = ah.b(this.f4213b, i10);
            com.applovin.exoplayer2.h.q.a aVar2 = this.f4214c;
            if (aVar2.f6613a != iB || !com.applovin.exoplayer2.l.ai.a(aVar2.f6614b, aVarB)) {
                this.f4214c = ah.this.f4205e.a(iB, aVarB, 0L);
            }
            com.applovin.exoplayer2.d.g.a aVar3 = this.f4215d;
            if (aVar3.f5142a == iB && com.applovin.exoplayer2.l.ai.a(aVar3.f5143b, aVarB)) {
                return true;
            }
            this.f4215d = ah.this.f4206f.a(iB, aVarB);
            return true;
        }

        @Override // com.applovin.exoplayer2.d.g
        public void a(int i10, com.applovin.exoplayer2.h.p.a aVar) {
            if (f(i10, aVar)) {
                this.f4215d.a();
            }
        }

        @Override // com.applovin.exoplayer2.d.g
        public void a(int i10, com.applovin.exoplayer2.h.p.a aVar, int i11) {
            if (f(i10, aVar)) {
                this.f4215d.a(i11);
            }
        }

        @Override // com.applovin.exoplayer2.h.q
        public void a(int i10, com.applovin.exoplayer2.h.p.a aVar, com.applovin.exoplayer2.h.j jVar, com.applovin.exoplayer2.h.m mVar) {
            if (f(i10, aVar)) {
                this.f4214c.a(jVar, mVar);
            }
        }

        @Override // com.applovin.exoplayer2.h.q
        public void a(int i10, com.applovin.exoplayer2.h.p.a aVar, com.applovin.exoplayer2.h.j jVar, com.applovin.exoplayer2.h.m mVar, IOException iOException, boolean z10) {
            if (f(i10, aVar)) {
                this.f4214c.a(jVar, mVar, iOException, z10);
            }
        }

        @Override // com.applovin.exoplayer2.h.q
        public void a(int i10, com.applovin.exoplayer2.h.p.a aVar, com.applovin.exoplayer2.h.m mVar) {
            if (f(i10, aVar)) {
                this.f4214c.a(mVar);
            }
        }

        @Override // com.applovin.exoplayer2.d.g
        public void a(int i10, com.applovin.exoplayer2.h.p.a aVar, Exception exc) {
            if (f(i10, aVar)) {
                this.f4215d.a(exc);
            }
        }

        @Override // com.applovin.exoplayer2.d.g
        public void b(int i10, com.applovin.exoplayer2.h.p.a aVar) {
            if (f(i10, aVar)) {
                this.f4215d.b();
            }
        }

        @Override // com.applovin.exoplayer2.h.q
        public void b(int i10, com.applovin.exoplayer2.h.p.a aVar, com.applovin.exoplayer2.h.j jVar, com.applovin.exoplayer2.h.m mVar) {
            if (f(i10, aVar)) {
                this.f4214c.b(jVar, mVar);
            }
        }

        @Override // com.applovin.exoplayer2.d.g
        public void c(int i10, com.applovin.exoplayer2.h.p.a aVar) {
            if (f(i10, aVar)) {
                this.f4215d.c();
            }
        }

        @Override // com.applovin.exoplayer2.h.q
        public void c(int i10, com.applovin.exoplayer2.h.p.a aVar, com.applovin.exoplayer2.h.j jVar, com.applovin.exoplayer2.h.m mVar) {
            if (f(i10, aVar)) {
                this.f4214c.c(jVar, mVar);
            }
        }

        @Override // com.applovin.exoplayer2.d.g
        public void d(int i10, com.applovin.exoplayer2.h.p.a aVar) {
            if (f(i10, aVar)) {
                this.f4215d.d();
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.applovin.exoplayer2.h.p f4216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.applovin.exoplayer2.h.p.b f4217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f4218c;

        public b(com.applovin.exoplayer2.h.p pVar, com.applovin.exoplayer2.h.p.b bVar, a aVar) {
            this.f4216a = pVar;
            this.f4217b = bVar;
            this.f4218c = aVar;
        }
    }

    public static final class c implements ag {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.applovin.exoplayer2.h.l f4219a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f4222d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f4223e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<com.applovin.exoplayer2.h.p.a> f4221c = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f4220b = new Object();

        public c(com.applovin.exoplayer2.h.p pVar, boolean z10) {
            this.f4219a = new com.applovin.exoplayer2.h.l(pVar, z10);
        }

        @Override // com.applovin.exoplayer2.ag
        public Object a() {
            return this.f4220b;
        }

        public void a(int i10) {
            this.f4222d = i10;
            this.f4223e = false;
            this.f4221c.clear();
        }

        @Override // com.applovin.exoplayer2.ag
        public ba b() {
            return this.f4219a.f();
        }
    }

    public interface d {
        void e();
    }

    public ah(d dVar, com.applovin.exoplayer2.a.a aVar, Handler handler) {
        this.f4204d = dVar;
        com.applovin.exoplayer2.h.q.a aVar2 = new com.applovin.exoplayer2.h.q.a();
        this.f4205e = aVar2;
        com.applovin.exoplayer2.d.g.a aVar3 = new com.applovin.exoplayer2.d.g.a();
        this.f4206f = aVar3;
        this.f4207g = new HashMap<>();
        this.f4208h = new HashSet();
        if (aVar != null) {
            aVar2.a(handler, aVar);
            aVar3.a(handler, aVar);
        }
    }

    private static Object a(c cVar, Object obj) {
        return com.applovin.exoplayer2.a.a(cVar.f4220b, obj);
    }

    private static Object a(Object obj) {
        return com.applovin.exoplayer2.a.a(obj);
    }

    private void a(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            c cVarRemove = this.f4201a.remove(i12);
            this.f4203c.remove(cVarRemove.f4220b);
            b(i12, -cVarRemove.f4219a.f().b());
            cVarRemove.f4223e = true;
            if (this.f4210j) {
                d(cVarRemove);
            }
        }
    }

    private void a(c cVar) {
        this.f4208h.add(cVar);
        b bVar = this.f4207g.get(cVar);
        if (bVar != null) {
            bVar.f4216a.a(bVar.f4217b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.exoplayer2.h.p pVar, ba baVar) {
        this.f4204d.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(c cVar, int i10) {
        return i10 + cVar.f4222d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.applovin.exoplayer2.h.p.a b(c cVar, com.applovin.exoplayer2.h.p.a aVar) {
        for (int i10 = 0; i10 < cVar.f4221c.size(); i10++) {
            if (cVar.f4221c.get(i10).f6611d == aVar.f6611d) {
                return aVar.a(a(cVar, aVar.f6608a));
            }
        }
        return null;
    }

    private static Object b(Object obj) {
        return com.applovin.exoplayer2.a.b(obj);
    }

    private void b(int i10, int i11) {
        while (i10 < this.f4201a.size()) {
            this.f4201a.get(i10).f4222d += i11;
            i10++;
        }
    }

    private void b(c cVar) {
        b bVar = this.f4207g.get(cVar);
        if (bVar != null) {
            bVar.f4216a.b(bVar.f4217b);
        }
    }

    private void c(c cVar) {
        com.applovin.exoplayer2.h.l lVar = cVar.f4219a;
        com.applovin.exoplayer2.h.p.b bVar = new com.applovin.exoplayer2.h.p.b() { // from class: com.applovin.exoplayer2.b0
            @Override // com.applovin.exoplayer2.h.p.b
            public final void onSourceInfoRefreshed(com.applovin.exoplayer2.h.p pVar, ba baVar) {
                this.f4672a.a(pVar, baVar);
            }
        };
        a aVar = new a(cVar);
        this.f4207g.put(cVar, new b(lVar, bVar, aVar));
        lVar.a(com.applovin.exoplayer2.l.ai.b(), (com.applovin.exoplayer2.h.q) aVar);
        lVar.a(com.applovin.exoplayer2.l.ai.b(), (com.applovin.exoplayer2.d.g) aVar);
        lVar.a(bVar, this.f4211k);
    }

    private void d(c cVar) {
        if (cVar.f4223e && cVar.f4221c.isEmpty()) {
            b bVar = (b) com.applovin.exoplayer2.l.a.b(this.f4207g.remove(cVar));
            bVar.f4216a.c(bVar.f4217b);
            bVar.f4216a.a((com.applovin.exoplayer2.h.q) bVar.f4218c);
            bVar.f4216a.a((com.applovin.exoplayer2.d.g) bVar.f4218c);
            this.f4208h.remove(cVar);
        }
    }

    private void e() {
        Iterator<c> it = this.f4208h.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.f4221c.isEmpty()) {
                b(next);
                it.remove();
            }
        }
    }

    public ba a(int i10, int i11, int i12, com.applovin.exoplayer2.h.z zVar) {
        com.applovin.exoplayer2.l.a.a(i10 >= 0 && i10 <= i11 && i11 <= b() && i12 >= 0);
        this.f4209i = zVar;
        if (i10 == i11 || i10 == i12) {
            return d();
        }
        int iMin = Math.min(i10, i12);
        int iMax = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
        int iB = this.f4201a.get(iMin).f4222d;
        com.applovin.exoplayer2.l.ai.a(this.f4201a, i10, i11, i12);
        while (iMin <= iMax) {
            c cVar = this.f4201a.get(iMin);
            cVar.f4222d = iB;
            iB += cVar.f4219a.f().b();
            iMin++;
        }
        return d();
    }

    public ba a(int i10, int i11, com.applovin.exoplayer2.h.z zVar) {
        com.applovin.exoplayer2.l.a.a(i10 >= 0 && i10 <= i11 && i11 <= b());
        this.f4209i = zVar;
        a(i10, i11);
        return d();
    }

    public ba a(int i10, List<c> list, com.applovin.exoplayer2.h.z zVar) {
        if (!list.isEmpty()) {
            this.f4209i = zVar;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                c cVar = list.get(i11 - i10);
                if (i11 > 0) {
                    c cVar2 = this.f4201a.get(i11 - 1);
                    cVar.a(cVar2.f4219a.f().b() + cVar2.f4222d);
                } else {
                    cVar.a(0);
                }
                b(i11, cVar.f4219a.f().b());
                this.f4201a.add(i11, cVar);
                this.f4203c.put(cVar.f4220b, cVar);
                if (this.f4210j) {
                    c(cVar);
                    if (this.f4202b.isEmpty()) {
                        this.f4208h.add(cVar);
                    } else {
                        b(cVar);
                    }
                }
            }
        }
        return d();
    }

    public ba a(com.applovin.exoplayer2.h.z zVar) {
        int iB = b();
        if (zVar.a() != iB) {
            zVar = zVar.d().a(0, iB);
        }
        this.f4209i = zVar;
        return d();
    }

    public ba a(List<c> list, com.applovin.exoplayer2.h.z zVar) {
        a(0, this.f4201a.size());
        return a(this.f4201a.size(), list, zVar);
    }

    public com.applovin.exoplayer2.h.n a(com.applovin.exoplayer2.h.p.a aVar, com.applovin.exoplayer2.k.b bVar, long j10) {
        Object objA = a(aVar.f6608a);
        com.applovin.exoplayer2.h.p.a aVarA = aVar.a(b(aVar.f6608a));
        c cVar = (c) com.applovin.exoplayer2.l.a.b(this.f4203c.get(objA));
        a(cVar);
        cVar.f4221c.add(aVarA);
        com.applovin.exoplayer2.h.k kVarA = cVar.f4219a.b(aVarA, bVar, j10);
        this.f4202b.put(kVarA, cVar);
        e();
        return kVarA;
    }

    public void a(com.applovin.exoplayer2.h.n nVar) {
        c cVar = (c) com.applovin.exoplayer2.l.a.b(this.f4202b.remove(nVar));
        cVar.f4219a.a(nVar);
        cVar.f4221c.remove(((com.applovin.exoplayer2.h.k) nVar).f6579a);
        if (!this.f4202b.isEmpty()) {
            e();
        }
        d(cVar);
    }

    public void a(com.applovin.exoplayer2.k.aa aaVar) {
        com.applovin.exoplayer2.l.a.b(!this.f4210j);
        this.f4211k = aaVar;
        for (int i10 = 0; i10 < this.f4201a.size(); i10++) {
            c cVar = this.f4201a.get(i10);
            c(cVar);
            this.f4208h.add(cVar);
        }
        this.f4210j = true;
    }

    public boolean a() {
        return this.f4210j;
    }

    public int b() {
        return this.f4201a.size();
    }

    public void c() {
        for (b bVar : this.f4207g.values()) {
            try {
                bVar.f4216a.c(bVar.f4217b);
            } catch (RuntimeException e10) {
                com.applovin.exoplayer2.l.q.c("MediaSourceList", "Failed to release child source.", e10);
            }
            bVar.f4216a.a((com.applovin.exoplayer2.h.q) bVar.f4218c);
            bVar.f4216a.a((com.applovin.exoplayer2.d.g) bVar.f4218c);
        }
        this.f4207g.clear();
        this.f4208h.clear();
        this.f4210j = false;
    }

    public ba d() {
        if (this.f4201a.isEmpty()) {
            return ba.f4673a;
        }
        int iB = 0;
        for (int i10 = 0; i10 < this.f4201a.size(); i10++) {
            c cVar = this.f4201a.get(i10);
            cVar.f4222d = iB;
            iB += cVar.f4219a.f().b();
        }
        return new ap(this.f4201a, this.f4209i);
    }
}
