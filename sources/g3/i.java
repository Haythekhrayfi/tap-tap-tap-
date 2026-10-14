package g3;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class i<R> implements g3.g.a, Runnable, Comparable<i<?>>, c4.a.d {
    public d3.c A;
    public Object B;
    public com.bumptech.glide.load.a C;
    public e3.d<?> D;
    public volatile g3.g E;
    public volatile boolean F;
    public volatile boolean G;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f29822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o0.e<i<?>> f29823g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a3.e f29826j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d3.c f29827k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a3.g f29828l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public o f29829m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f29830n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f29831o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public k f29832p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public d3.e f29833q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b<R> f29834r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f29835s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public h f29836t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public g f29837u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f29838v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f29839w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f29840x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Thread f29841y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public d3.c f29842z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g3.h<R> f29819c = new g3.h<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Throwable> f29820d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c4.d f29821e = new c4.d.b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d<?> f29824h = new d<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f f29825i = new f();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f29844b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f29845c;

        static {
            int[] iArr = new int[com.bumptech.glide.load.c.values().length];
            f29845c = iArr;
            try {
                iArr[com.bumptech.glide.load.c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29845c[com.bumptech.glide.load.c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[h.values().length];
            f29844b = iArr2;
            try {
                iArr2[h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29844b[h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29844b[h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29844b[h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29844b[h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            f29843a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f29843a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f29843a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public interface b<R> {
    }

    public final class c<Z> implements j.a<Z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.bumptech.glide.load.a f29846a;

        public c(com.bumptech.glide.load.a aVar) {
            this.f29846a = aVar;
        }
    }

    public static class d<Z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public d3.c f29848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public d3.f<Z> f29849b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public t<Z> f29850c;
    }

    public interface e {
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f29851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f29852b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f29853c;

        public final boolean a(boolean z10) {
            return (this.f29853c || z10 || this.f29852b) && this.f29851a;
        }
    }

    public enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    public enum h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    public i(e eVar, o0.e<i<?>> eVar2) {
        this.f29822f = eVar;
        this.f29823g = eVar2;
    }

    @Override // g3.g.a
    public void a(d3.c cVar, Object obj, e3.d<?> dVar, com.bumptech.glide.load.a aVar, d3.c cVar2) {
        this.f29842z = cVar;
        this.B = obj;
        this.D = dVar;
        this.C = aVar;
        this.A = cVar2;
        if (Thread.currentThread() == this.f29841y) {
            g();
        } else {
            this.f29837u = g.DECODE_DATA;
            ((m) this.f29834r).i(this);
        }
    }

    public final <Data> u<R> b(e3.d<?> dVar, Data data, com.bumptech.glide.load.a aVar) throws q {
        if (data == null) {
            dVar.b();
            return null;
        }
        try {
            int i10 = b4.f.f3299b;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            u<R> uVarC = c(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                j("Decoded result " + uVarC, jElapsedRealtimeNanos, null);
            }
            return uVarC;
        } finally {
            dVar.b();
        }
    }

    public final <Data> u<R> c(Data data, com.bumptech.glide.load.a aVar) throws q {
        e3.e<Data> eVarB;
        s<Data, ?, R> sVarD = this.f29819c.d(data.getClass());
        d3.e eVar = this.f29833q;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z10 = aVar == com.bumptech.glide.load.a.RESOURCE_DISK_CACHE || this.f29819c.f29818r;
            d3.d<Boolean> dVar = o3.k.f33912h;
            Boolean bool = (Boolean) eVar.c(dVar);
            if (bool == null || (bool.booleanValue() && !z10)) {
                eVar = new d3.e();
                eVar.d(this.f29833q);
                eVar.f28638b.put(dVar, Boolean.valueOf(z10));
            }
        }
        d3.e eVar2 = eVar;
        e3.f fVar = this.f29826j.f38b.f50e;
        synchronized (fVar) {
            e3.e.a<?> aVar2 = fVar.f29005a.get(data.getClass());
            if (aVar2 == null) {
                for (e3.e.a<?> aVar3 : fVar.f29005a.values()) {
                    if (aVar3.a().isAssignableFrom(data.getClass())) {
                        aVar2 = aVar3;
                        break;
                    }
                }
            }
            if (aVar2 == null) {
                aVar2 = e3.f.f29004b;
            }
            eVarB = aVar2.b(data);
        }
        try {
            return sVarD.a(eVarB, eVar2, this.f29830n, this.f29831o, new c(aVar));
        } finally {
            eVarB.b();
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(i<?> iVar) {
        i<?> iVar2 = iVar;
        int iOrdinal = this.f29828l.ordinal() - iVar2.f29828l.ordinal();
        return iOrdinal == 0 ? this.f29835s - iVar2.f29835s : iOrdinal;
    }

    @Override // g3.g.a
    public void d() {
        this.f29837u = g.SWITCH_TO_SOURCE_SERVICE;
        ((m) this.f29834r).i(this);
    }

    @Override // g3.g.a
    public void e(d3.c cVar, Exception exc, e3.d<?> dVar, com.bumptech.glide.load.a aVar) {
        dVar.b();
        q qVar = new q("Fetching data failed", exc);
        Class<?> clsA = dVar.a();
        qVar.f29936d = cVar;
        qVar.f29937e = aVar;
        qVar.f29938f = clsA;
        this.f29820d.add(qVar);
        if (Thread.currentThread() == this.f29841y) {
            m();
        } else {
            this.f29837u = g.SWITCH_TO_SOURCE_SERVICE;
            ((m) this.f29834r).i(this);
        }
    }

    @Override // c4.a.d
    public c4.d f() {
        return this.f29821e;
    }

    public final void g() {
        t tVarB;
        boolean zA;
        if (Log.isLoggable("DecodeJob", 2)) {
            long j10 = this.f29838v;
            StringBuilder sbA = defpackage.a.a("data: ");
            sbA.append(this.B);
            sbA.append(", cache key: ");
            sbA.append(this.f29842z);
            sbA.append(", fetcher: ");
            sbA.append(this.D);
            j("Retrieved data", j10, sbA.toString());
        }
        t tVarC = null;
        try {
            tVarB = b(this.D, this.B, this.C);
        } catch (q e10) {
            d3.c cVar = this.A;
            com.bumptech.glide.load.a aVar = this.C;
            e10.f29936d = cVar;
            e10.f29937e = aVar;
            e10.f29938f = null;
            this.f29820d.add(e10);
            tVarB = null;
        }
        if (tVarB == null) {
            m();
            return;
        }
        com.bumptech.glide.load.a aVar2 = this.C;
        if (tVarB instanceof r) {
            ((r) tVarB).initialize();
        }
        if (this.f29824h.f29850c != null) {
            tVarC = t.c(tVarB);
            tVarB = tVarC;
        }
        p();
        m<?> mVar = (m) this.f29834r;
        synchronized (mVar) {
            mVar.f29903r = tVarB;
            mVar.f29904s = aVar2;
        }
        synchronized (mVar) {
            mVar.f29889d.a();
            if (mVar.f29910y) {
                mVar.f29903r.a();
                mVar.g();
            } else {
                if (mVar.f29888c.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (mVar.f29905t) {
                    throw new IllegalStateException("Already have resource");
                }
                m.c cVar2 = mVar.f29891f;
                u<?> uVar = mVar.f29903r;
                boolean z10 = mVar.f29899n;
                Objects.requireNonNull(cVar2);
                mVar.f29908w = new p<>(uVar, z10, true);
                mVar.f29905t = true;
                m.e eVar = mVar.f29888c;
                Objects.requireNonNull(eVar);
                ArrayList<m.d> arrayList = new ArrayList(eVar.f29917c);
                mVar.d(arrayList.size() + 1);
                ((l) mVar.f29892g).d(mVar, mVar.f29898m, mVar.f29908w);
                for (m.d dVar : arrayList) {
                    dVar.f29916b.execute(new m.b(dVar.f29915a));
                }
                mVar.c();
            }
        }
        this.f29836t = h.ENCODE;
        try {
            d<?> dVar2 = this.f29824h;
            if (dVar2.f29850c != null) {
                try {
                    ((l.c) this.f29822f).a().a(dVar2.f29848a, new g3.f(dVar2.f29849b, dVar2.f29850c, this.f29833q));
                    dVar2.f29850c.d();
                } catch (Throwable th) {
                    dVar2.f29850c.d();
                    throw th;
                }
            }
            if (tVarC != null) {
                tVarC.d();
            }
            f fVar = this.f29825i;
            synchronized (fVar) {
                fVar.f29852b = true;
                zA = fVar.a(false);
            }
            if (zA) {
                l();
            }
        } catch (Throwable th2) {
            if (tVarC != null) {
                tVarC.d();
            }
            throw th2;
        }
    }

    public final g3.g h() {
        int i10 = a.f29844b[this.f29836t.ordinal()];
        if (i10 == 1) {
            return new v(this.f29819c, this);
        }
        if (i10 == 2) {
            return new g3.d(this.f29819c, this);
        }
        if (i10 == 3) {
            return new y(this.f29819c, this);
        }
        if (i10 == 4) {
            return null;
        }
        StringBuilder sbA = defpackage.a.a("Unrecognized stage: ");
        sbA.append(this.f29836t);
        throw new IllegalStateException(sbA.toString());
    }

    public final h i(h hVar) {
        int i10 = a.f29844b[hVar.ordinal()];
        if (i10 == 1) {
            return this.f29832p.a() ? h.DATA_CACHE : i(h.DATA_CACHE);
        }
        if (i10 == 2) {
            return this.f29839w ? h.FINISHED : h.SOURCE;
        }
        if (i10 == 3 || i10 == 4) {
            return h.FINISHED;
        }
        if (i10 == 5) {
            return this.f29832p.b() ? h.RESOURCE_CACHE : i(h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + hVar);
    }

    public final void j(String str, long j10, String str2) {
        StringBuilder sbA = android.support.v4.media.c.a(str, " in ");
        sbA.append(b4.f.a(j10));
        sbA.append(", load key: ");
        sbA.append(this.f29829m);
        sbA.append(str2 != null ? i.f.a(", ", str2) : "");
        sbA.append(", thread: ");
        sbA.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sbA.toString());
    }

    public final void k() {
        boolean zA;
        p();
        q qVar = new q("Failed to load resource", new ArrayList(this.f29820d));
        m<?> mVar = (m) this.f29834r;
        synchronized (mVar) {
            mVar.f29906u = qVar;
        }
        synchronized (mVar) {
            mVar.f29889d.a();
            if (mVar.f29910y) {
                mVar.g();
            } else {
                if (mVar.f29888c.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (mVar.f29907v) {
                    throw new IllegalStateException("Already failed once");
                }
                mVar.f29907v = true;
                d3.c cVar = mVar.f29898m;
                m.e eVar = mVar.f29888c;
                Objects.requireNonNull(eVar);
                ArrayList<m.d> arrayList = new ArrayList(eVar.f29917c);
                mVar.d(arrayList.size() + 1);
                ((l) mVar.f29892g).d(mVar, cVar, null);
                for (m.d dVar : arrayList) {
                    dVar.f29916b.execute(new m.a(dVar.f29915a));
                }
                mVar.c();
            }
        }
        f fVar = this.f29825i;
        synchronized (fVar) {
            fVar.f29853c = true;
            zA = fVar.a(false);
        }
        if (zA) {
            l();
        }
    }

    public final void l() {
        f fVar = this.f29825i;
        synchronized (fVar) {
            fVar.f29852b = false;
            fVar.f29851a = false;
            fVar.f29853c = false;
        }
        d<?> dVar = this.f29824h;
        dVar.f29848a = null;
        dVar.f29849b = null;
        dVar.f29850c = null;
        g3.h<R> hVar = this.f29819c;
        hVar.f29803c = null;
        hVar.f29804d = null;
        hVar.f29814n = null;
        hVar.f29807g = null;
        hVar.f29811k = null;
        hVar.f29809i = null;
        hVar.f29815o = null;
        hVar.f29810j = null;
        hVar.f29816p = null;
        hVar.f29801a.clear();
        hVar.f29812l = false;
        hVar.f29802b.clear();
        hVar.f29813m = false;
        this.F = false;
        this.f29826j = null;
        this.f29827k = null;
        this.f29833q = null;
        this.f29828l = null;
        this.f29829m = null;
        this.f29834r = null;
        this.f29836t = null;
        this.E = null;
        this.f29841y = null;
        this.f29842z = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.f29838v = 0L;
        this.G = false;
        this.f29840x = null;
        this.f29820d.clear();
        this.f29823g.a(this);
    }

    public final void m() {
        this.f29841y = Thread.currentThread();
        int i10 = b4.f.f3299b;
        this.f29838v = SystemClock.elapsedRealtimeNanos();
        boolean zB = false;
        while (!this.G && this.E != null && !(zB = this.E.b())) {
            this.f29836t = i(this.f29836t);
            this.E = h();
            if (this.f29836t == h.SOURCE) {
                this.f29837u = g.SWITCH_TO_SOURCE_SERVICE;
                ((m) this.f29834r).i(this);
                return;
            }
        }
        if ((this.f29836t == h.FINISHED || this.G) && !zB) {
            k();
        }
    }

    public final void n() {
        int i10 = a.f29843a[this.f29837u.ordinal()];
        if (i10 == 1) {
            this.f29836t = i(h.INITIALIZE);
            this.E = h();
        } else if (i10 != 2) {
            if (i10 == 3) {
                g();
                return;
            } else {
                StringBuilder sbA = defpackage.a.a("Unrecognized run reason: ");
                sbA.append(this.f29837u);
                throw new IllegalStateException(sbA.toString());
            }
        }
        m();
    }

    public final void p() {
        Throwable th;
        this.f29821e.a();
        if (!this.F) {
            this.F = true;
            return;
        }
        if (this.f29820d.isEmpty()) {
            th = null;
        } else {
            List<Throwable> list = this.f29820d;
            th = list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    @Override // java.lang.Runnable
    public void run() {
        e3.d<?> dVar = this.D;
        try {
            try {
                if (this.G) {
                    k();
                    if (dVar != null) {
                        dVar.b();
                        return;
                    }
                    return;
                }
                n();
                if (dVar != null) {
                    dVar.b();
                }
            } catch (Throwable th) {
                if (dVar != null) {
                    dVar.b();
                }
                throw th;
            }
        } catch (g3.c e10) {
            throw e10;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.G + ", stage: " + this.f29836t, th2);
            }
            if (this.f29836t != h.ENCODE) {
                this.f29820d.add(th2);
                k();
            }
            if (!this.G) {
                throw th2;
            }
            throw th2;
        }
    }
}
