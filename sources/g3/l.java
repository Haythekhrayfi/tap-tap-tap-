package g3;

import android.os.SystemClock;
import android.util.Log;
import fd.j0;
import java.io.File;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class l implements n, i3.h.a, p.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f29863h = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1.c f29864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f29865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i3.h f29866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f29867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f29868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f29869f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g3.a f29870g;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i.e f29871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o0.e<i<?>> f29872b = c4.a.a(150, new C0268a());

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f29873c;

        /* JADX INFO: renamed from: g3.l$a$a, reason: collision with other inner class name */
        public class C0268a implements c4.a.b<i<?>> {
            public C0268a() {
            }

            @Override // c4.a.b
            public i<?> a() {
                a aVar = a.this;
                return new i<>(aVar.f29871a, aVar.f29872b);
            }
        }

        public a(i.e eVar) {
            this.f29871a = eVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <R> i<R> a(a3.e eVar, Object obj, o oVar, d3.c cVar, int i10, int i11, Class<?> cls, Class<R> cls2, a3.g gVar, k kVar, Map<Class<?>, d3.g<?>> map, boolean z10, boolean z11, boolean z12, d3.e eVar2, i.b<R> bVar) {
            i<R> iVar = (i) this.f29872b.b();
            Objects.requireNonNull(iVar, "Argument must not be null");
            int i12 = this.f29873c;
            this.f29873c = i12 + 1;
            h<R> hVar = iVar.f29819c;
            i.e eVar3 = iVar.f29822f;
            hVar.f29803c = eVar;
            hVar.f29804d = obj;
            hVar.f29814n = cVar;
            hVar.f29805e = i10;
            hVar.f29806f = i11;
            hVar.f29816p = kVar;
            hVar.f29807g = cls;
            hVar.f29808h = eVar3;
            hVar.f29811k = cls2;
            hVar.f29815o = gVar;
            hVar.f29809i = eVar2;
            hVar.f29810j = map;
            hVar.f29817q = z10;
            hVar.f29818r = z11;
            iVar.f29826j = eVar;
            iVar.f29827k = cVar;
            iVar.f29828l = gVar;
            iVar.f29829m = oVar;
            iVar.f29830n = i10;
            iVar.f29831o = i11;
            iVar.f29832p = kVar;
            iVar.f29839w = z12;
            iVar.f29833q = eVar2;
            iVar.f29834r = bVar;
            iVar.f29835s = i12;
            iVar.f29837u = i.g.INITIALIZE;
            iVar.f29840x = obj;
            return iVar;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j3.a f29875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j3.a f29876b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j3.a f29877c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final j3.a f29878d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final n f29879e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final o0.e<m<?>> f29880f = c4.a.a(150, new a());

        public class a implements c4.a.b<m<?>> {
            public a() {
            }

            @Override // c4.a.b
            public m<?> a() {
                b bVar = b.this;
                return new m<>(bVar.f29875a, bVar.f29876b, bVar.f29877c, bVar.f29878d, bVar.f29879e, bVar.f29880f);
            }
        }

        public b(j3.a aVar, j3.a aVar2, j3.a aVar3, j3.a aVar4, n nVar) {
            this.f29875a = aVar;
            this.f29876b = aVar2;
            this.f29877c = aVar3;
            this.f29878d = aVar4;
            this.f29879e = nVar;
        }
    }

    public static class c implements i.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i3.a.InterfaceC0309a f29882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile i3.a f29883b;

        public c(i3.a.InterfaceC0309a interfaceC0309a) {
            this.f29882a = interfaceC0309a;
        }

        public i3.a a() {
            if (this.f29883b == null) {
                synchronized (this) {
                    if (this.f29883b == null) {
                        i3.d dVar = (i3.d) this.f29882a;
                        File fileA = dVar.f31218b.a();
                        i3.e eVar = null;
                        if (fileA != null && (fileA.mkdirs() || (fileA.exists() && fileA.isDirectory()))) {
                            eVar = new i3.e(fileA, dVar.f31217a);
                        }
                        this.f29883b = eVar;
                    }
                    if (this.f29883b == null) {
                        this.f29883b = new i3.b();
                    }
                }
            }
            return this.f29883b;
        }
    }

    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m<?> f29884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x3.f f29885b;

        public d(x3.f fVar, m<?> mVar) {
            this.f29885b = fVar;
            this.f29884a = mVar;
        }
    }

    public l(i3.h hVar, i3.a.InterfaceC0309a interfaceC0309a, j3.a aVar, j3.a aVar2, j3.a aVar3, j3.a aVar4, boolean z10) {
        this.f29866c = hVar;
        c cVar = new c(interfaceC0309a);
        g3.a aVar5 = new g3.a(z10);
        this.f29870g = aVar5;
        synchronized (this) {
            synchronized (aVar5) {
                aVar5.f29781e = this;
            }
        }
        this.f29865b = new j0(3);
        this.f29864a = new j1.c();
        this.f29867d = new b(aVar, aVar2, aVar3, aVar4, this);
        this.f29869f = new a(cVar);
        this.f29868e = new x();
        ((i3.g) hVar).f31229d = this;
    }

    public static void c(String str, long j10, d3.c cVar) {
        StringBuilder sbA = android.support.v4.media.c.a(str, " in ");
        sbA.append(b4.f.a(j10));
        sbA.append("ms, key: ");
        sbA.append(cVar);
        Log.v("Engine", sbA.toString());
    }

    public synchronized <R> d a(a3.e eVar, Object obj, d3.c cVar, int i10, int i11, Class<?> cls, Class<R> cls2, a3.g gVar, k kVar, Map<Class<?>, d3.g<?>> map, boolean z10, boolean z11, d3.e eVar2, boolean z12, boolean z13, boolean z14, boolean z15, x3.f fVar, Executor executor) {
        long jElapsedRealtimeNanos;
        p<?> pVar;
        boolean z16 = f29863h;
        if (z16) {
            int i12 = b4.f.f3299b;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        long j10 = jElapsedRealtimeNanos;
        Objects.requireNonNull(this.f29865b);
        o oVar = new o(obj, cVar, i10, i11, map, cls, cls2, eVar2);
        if (z12) {
            g3.a aVar = this.f29870g;
            synchronized (aVar) {
                g3.a.b bVar = aVar.f29779c.get(oVar);
                if (bVar == null) {
                    pVar = null;
                } else {
                    pVar = bVar.get();
                    if (pVar == null) {
                        aVar.b(bVar);
                    }
                }
            }
            if (pVar != null) {
                pVar.c();
            }
        } else {
            pVar = null;
        }
        if (pVar != null) {
            ((x3.g) fVar).q(pVar, com.bumptech.glide.load.a.MEMORY_CACHE);
            if (z16) {
                c("Loaded resource from active resources", j10, oVar);
            }
            return null;
        }
        p<?> pVarB = b(oVar, z12);
        if (pVarB != null) {
            ((x3.g) fVar).q(pVarB, com.bumptech.glide.load.a.MEMORY_CACHE);
            if (z16) {
                c("Loaded resource from cache", j10, oVar);
            }
            return null;
        }
        j1.c cVar2 = this.f29864a;
        m mVar = (m) ((Map) (z15 ? cVar2.f31680b : cVar2.f31679a)).get(oVar);
        if (mVar != null) {
            mVar.a(fVar, executor);
            if (z16) {
                c("Added to existing load", j10, oVar);
            }
            return new d(fVar, mVar);
        }
        m<?> mVarB = this.f29867d.f29880f.b();
        Objects.requireNonNull(mVarB, "Argument must not be null");
        synchronized (mVarB) {
            mVarB.f29898m = oVar;
            mVarB.f29899n = z12;
            mVarB.f29900o = z13;
            mVarB.f29901p = z14;
            mVarB.f29902q = z15;
        }
        i<?> iVarA = this.f29869f.a(eVar, obj, oVar, cVar, i10, i11, cls, cls2, gVar, kVar, map, z10, z11, z15, eVar2, mVarB);
        j1.c cVar3 = this.f29864a;
        Objects.requireNonNull(cVar3);
        cVar3.c(mVarB.f29902q).put(oVar, mVarB);
        mVarB.a(fVar, executor);
        mVarB.j(iVarA);
        if (z16) {
            c("Started new load", j10, oVar);
        }
        return new d(fVar, mVarB);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p<?> b(d3.c cVar, boolean z10) {
        Object objRemove;
        p<?> pVar = null;
        if (!z10) {
            return null;
        }
        i3.g gVar = (i3.g) this.f29866c;
        synchronized (gVar) {
            objRemove = gVar.f3300a.remove(cVar);
            if (objRemove != null) {
                gVar.f3302c -= (long) gVar.b(objRemove);
            }
        }
        u uVar = (u) objRemove;
        if (uVar != null) {
            pVar = uVar instanceof p ? (p) uVar : new p<>(uVar, true, true);
        }
        if (pVar != null) {
            pVar.c();
            this.f29870g.a(cVar, pVar);
        }
        return pVar;
    }

    public synchronized void d(m<?> mVar, d3.c cVar, p<?> pVar) {
        if (pVar != null) {
            synchronized (pVar) {
                pVar.f29931g = cVar;
                pVar.f29930f = this;
            }
            if (pVar.f29927c) {
                this.f29870g.a(cVar, pVar);
            }
        }
        j1.c cVar2 = this.f29864a;
        Objects.requireNonNull(cVar2);
        Map<d3.c, m<?>> mapC = cVar2.c(mVar.f29902q);
        if (mVar.equals(mapC.get(cVar))) {
            mapC.remove(cVar);
        }
    }

    public synchronized void e(d3.c cVar, p<?> pVar) {
        g3.a aVar = this.f29870g;
        synchronized (aVar) {
            g3.a.b bVarRemove = aVar.f29779c.remove(cVar);
            if (bVarRemove != null) {
                bVarRemove.f29785c = null;
                bVarRemove.clear();
            }
        }
        if (pVar.f29927c) {
            ((i3.g) this.f29866c).d(cVar, pVar);
        } else {
            this.f29868e.a(pVar);
        }
    }
}
