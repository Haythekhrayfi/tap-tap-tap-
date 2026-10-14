package g3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class m<R> implements i.b<R>, c4.a.d {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final c f29887z = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f29888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c4.d f29889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o0.e<m<?>> f29890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f29891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f29892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j3.a f29893h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j3.a f29894i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j3.a f29895j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j3.a f29896k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicInteger f29897l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d3.c f29898m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f29899n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f29900o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f29901p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f29902q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public u<?> f29903r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public com.bumptech.glide.load.a f29904s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f29905t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public q f29906u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f29907v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p<?> f29908w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public i<R> f29909x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile boolean f29910y;

    public class a implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final x3.f f29911c;

        public a(x3.f fVar) {
            this.f29911c = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (m.this) {
                if (m.this.f29888c.f29917c.contains(new d(this.f29911c, b4.e.f3296b))) {
                    m mVar = m.this;
                    x3.f fVar = this.f29911c;
                    synchronized (mVar) {
                        try {
                            ((x3.g) fVar).o(mVar.f29906u);
                        } catch (Throwable th) {
                            throw new g3.c(th);
                        }
                    }
                }
                m.this.c();
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final x3.f f29913c;

        public b(x3.f fVar) {
            this.f29913c = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (m.this) {
                if (m.this.f29888c.f29917c.contains(new d(this.f29913c, b4.e.f3296b))) {
                    m.this.f29908w.c();
                    m mVar = m.this;
                    x3.f fVar = this.f29913c;
                    synchronized (mVar) {
                        try {
                            ((x3.g) fVar).q(mVar.f29908w, mVar.f29904s);
                        } catch (Throwable th) {
                            throw new g3.c(th);
                        }
                    }
                    m.this.h(this.f29913c);
                }
                m.this.c();
            }
        }
    }

    public static class c {
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x3.f f29915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f29916b;

        public d(x3.f fVar, Executor executor) {
            this.f29915a = fVar;
            this.f29916b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f29915a.equals(((d) obj).f29915a);
            }
            return false;
        }

        public int hashCode() {
            return this.f29915a.hashCode();
        }
    }

    public static final class e implements Iterable<d> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<d> f29917c = new ArrayList(2);

        public boolean isEmpty() {
            return this.f29917c.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator<d> iterator() {
            return this.f29917c.iterator();
        }
    }

    public m(j3.a aVar, j3.a aVar2, j3.a aVar3, j3.a aVar4, n nVar, o0.e<m<?>> eVar) {
        c cVar = f29887z;
        this.f29888c = new e();
        this.f29889d = new c4.d.b();
        this.f29897l = new AtomicInteger();
        this.f29893h = aVar;
        this.f29894i = aVar2;
        this.f29895j = aVar3;
        this.f29896k = aVar4;
        this.f29892g = nVar;
        this.f29890e = eVar;
        this.f29891f = cVar;
    }

    public synchronized void a(x3.f fVar, Executor executor) {
        Runnable aVar;
        this.f29889d.a();
        this.f29888c.f29917c.add(new d(fVar, executor));
        boolean z10 = true;
        if (this.f29905t) {
            d(1);
            aVar = new b(fVar);
        } else if (this.f29907v) {
            d(1);
            aVar = new a(fVar);
        } else {
            if (this.f29910y) {
                z10 = false;
            }
            u1.a.e(z10, "Cannot add callbacks to a cancelled EngineJob");
        }
        executor.execute(aVar);
    }

    public void b() {
        if (e()) {
            return;
        }
        this.f29910y = true;
        i<R> iVar = this.f29909x;
        iVar.G = true;
        g gVar = iVar.E;
        if (gVar != null) {
            gVar.cancel();
        }
        n nVar = this.f29892g;
        d3.c cVar = this.f29898m;
        l lVar = (l) nVar;
        synchronized (lVar) {
            j1.c cVar2 = lVar.f29864a;
            Objects.requireNonNull(cVar2);
            Map<d3.c, m<?>> mapC = cVar2.c(this.f29902q);
            if (equals(mapC.get(cVar))) {
                mapC.remove(cVar);
            }
        }
    }

    public synchronized void c() {
        this.f29889d.a();
        u1.a.e(e(), "Not yet complete!");
        int iDecrementAndGet = this.f29897l.decrementAndGet();
        u1.a.e(iDecrementAndGet >= 0, "Can't decrement below 0");
        if (iDecrementAndGet == 0) {
            p<?> pVar = this.f29908w;
            if (pVar != null) {
                pVar.d();
            }
            g();
        }
    }

    public synchronized void d(int i10) {
        p<?> pVar;
        u1.a.e(e(), "Not yet complete!");
        if (this.f29897l.getAndAdd(i10) == 0 && (pVar = this.f29908w) != null) {
            pVar.c();
        }
    }

    public final boolean e() {
        return this.f29907v || this.f29905t || this.f29910y;
    }

    @Override // c4.a.d
    public c4.d f() {
        return this.f29889d;
    }

    public final synchronized void g() {
        boolean zA;
        if (this.f29898m == null) {
            throw new IllegalArgumentException();
        }
        this.f29888c.f29917c.clear();
        this.f29898m = null;
        this.f29908w = null;
        this.f29903r = null;
        this.f29907v = false;
        this.f29910y = false;
        this.f29905t = false;
        i<R> iVar = this.f29909x;
        i.f fVar = iVar.f29825i;
        synchronized (fVar) {
            fVar.f29851a = true;
            zA = fVar.a(false);
        }
        if (zA) {
            iVar.l();
        }
        this.f29909x = null;
        this.f29906u = null;
        this.f29904s = null;
        this.f29890e.a(this);
    }

    public synchronized void h(x3.f fVar) {
        this.f29889d.a();
        this.f29888c.f29917c.remove(new d(fVar, b4.e.f3296b));
        if (this.f29888c.isEmpty()) {
            b();
            if ((this.f29905t || this.f29907v) && this.f29897l.get() == 0) {
                g();
            }
        }
    }

    public void i(i<?> iVar) {
        j3.a aVar;
        if (this.f29900o) {
            aVar = this.f29895j;
        } else {
            aVar = this.f29901p ? this.f29896k : this.f29894i;
        }
        aVar.f31701c.execute(iVar);
    }

    public synchronized void j(i<R> iVar) {
        j3.a aVar;
        this.f29909x = iVar;
        i.h hVarI = iVar.i(i.h.INITIALIZE);
        if (hVarI == i.h.RESOURCE_CACHE || hVarI == i.h.DATA_CACHE) {
            aVar = this.f29893h;
        } else if (this.f29900o) {
            aVar = this.f29895j;
        } else {
            aVar = this.f29901p ? this.f29896k : this.f29894i;
        }
        aVar.f31701c.execute(iVar);
    }
}
