package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
final class ts implements Handler.Callback, hc0.a, o71.a, qc0.d, fo.a, hr0.a {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private int F;
    private boolean H;
    private boolean I;
    private boolean J;
    private int K;
    private g L;
    private long M;
    private int N;
    private boolean O;
    private ns P;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pv0[] f25448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<pv0> f25449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final qv0[] f25450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final o71 f25451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p71 f25452f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final t80 f25453g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ad f25454h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final my f25455i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final HandlerThread f25456j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Looper f25457k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final v61.d f25458l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final v61.b f25459m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f25460n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f25461o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final fo f25462p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ArrayList<c> f25463q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ki f25464r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final e f25465s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final lc0 f25466t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final qc0 f25467u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final s80 f25468v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final long f25469w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private q01 f25470x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private xq0 f25471y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private d f25472z;
    private boolean G = false;
    private long Q = -9223372036854775807L;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<qc0.c> f25473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final i11 f25474b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f25475c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f25476d;

        private a(int i10, long j10, i11 i11Var, ArrayList arrayList) {
            this.f25473a = arrayList;
            this.f25474b = i11Var;
            this.f25475c = i10;
            this.f25476d = j10;
        }

        public /* synthetic */ a(ArrayList arrayList, i11 i11Var, int i10, long j10) {
            this(i10, j10, i11Var, arrayList);
        }
    }

    public static class b {
    }

    public static final class c implements Comparable<c> {
        public c() {
            throw null;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            Objects.requireNonNull(cVar);
            return 0;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f25477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public xq0 f25478b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f25479c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f25480d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f25481e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f25482f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f25483g;

        public d(xq0 xq0Var) {
            this.f25478b = xq0Var;
        }

        public final void a(int i10) {
            this.f25477a |= i10 > 0;
            this.f25479c += i10;
        }

        public final void a(xq0 xq0Var) {
            this.f25477a |= this.f25478b != xq0Var;
            this.f25478b = xq0Var;
        }

        public final void b(int i10) {
            this.f25477a = true;
            this.f25482f = true;
            this.f25483g = i10;
        }

        public final void c(int i10) {
            if (this.f25480d && this.f25481e != 5) {
                pa.a(i10 == 5);
                return;
            }
            this.f25477a = true;
            this.f25480d = true;
            this.f25481e = i10;
        }
    }

    public interface e {
        void a(d dVar);
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final nc0.b f25484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f25485b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f25486c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f25487d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f25488e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f25489f;

        public f(nc0.b bVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f25484a = bVar;
            this.f25485b = j10;
            this.f25486c = j11;
            this.f25487d = z10;
            this.f25488e = z11;
            this.f25489f = z12;
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v61 f25490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f25491b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f25492c;

        public g(v61 v61Var, int i10, long j10) {
            this.f25490a = v61Var;
            this.f25491b = i10;
            this.f25492c = j10;
        }
    }

    public ts(pv0[] pv0VarArr, o71 o71Var, p71 p71Var, t80 t80Var, ad adVar, int i10, w8 w8Var, q01 q01Var, co coVar, long j10, boolean z10, Looper looper, q51 q51Var, e eVar, gr0 gr0Var) {
        this.f25465s = eVar;
        this.f25448b = pv0VarArr;
        this.f25451e = o71Var;
        this.f25452f = p71Var;
        this.f25453g = t80Var;
        this.f25454h = adVar;
        this.F = i10;
        this.f25470x = q01Var;
        this.f25468v = coVar;
        this.f25469w = j10;
        this.B = z10;
        this.f25464r = q51Var;
        this.f25460n = t80Var.e();
        this.f25461o = t80Var.a();
        xq0 xq0VarA = xq0.a(p71Var);
        this.f25471y = xq0VarA;
        this.f25472z = new d(xq0VarA);
        this.f25450d = new qv0[pv0VarArr.length];
        for (int i11 = 0; i11 < pv0VarArr.length; i11++) {
            pv0VarArr[i11].a(i11, gr0Var);
            this.f25450d[i11] = pv0VarArr[i11].n();
        }
        this.f25462p = new fo(this, q51Var);
        this.f25463q = new ArrayList<>();
        this.f25449c = com.yandex.mobile.ads.embedded.guava.collect.m0.a();
        this.f25458l = new v61.d();
        this.f25459m = new v61.b();
        o71Var.a(this, adVar);
        this.O = true;
        Handler handler = new Handler(looper);
        this.f25466t = new lc0(w8Var, handler);
        this.f25467u = new qc0(this, w8Var, handler, gr0Var);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f25456j = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f25457k = looper2;
        this.f25455i = q51Var.a(looper2, this);
    }

    private long a(nc0.b bVar, long j10, boolean z10, boolean z11) throws ns {
        long jSeekToUs;
        r();
        this.D = false;
        if (z11 || this.f25471y.f26593e == 3) {
            b(2);
        }
        ic0 ic0VarE = this.f25466t.e();
        ic0 ic0VarB = ic0VarE;
        while (ic0VarB != null && !bVar.equals(ic0VarB.f21683f.f22375a)) {
            ic0VarB = ic0VarB.b();
        }
        if (z10 || ic0VarE != ic0VarB || (ic0VarB != null && ic0VarB.d(j10) < 0)) {
            for (pv0 pv0Var : this.f25448b) {
                a(pv0Var);
            }
            if (ic0VarB != null) {
                while (this.f25466t.e() != ic0VarB) {
                    this.f25466t.a();
                }
                this.f25466t.a(ic0VarB);
                ic0VarB.h();
                a(new boolean[this.f25448b.length]);
            }
        }
        if (ic0VarB != null) {
            this.f25466t.a(ic0VarB);
            if (ic0VarB.f21681d) {
                ic0 ic0Var = ic0VarB;
                if (ic0Var.f21682e) {
                    jSeekToUs = ic0Var.f21678a.seekToUs(j10);
                    ic0Var.f21678a.discardBuffer(jSeekToUs - this.f25460n, this.f25461o);
                }
                a(jSeekToUs);
                f();
            } else {
                kc0 kc0Var = ic0VarB.f21683f;
                if (j10 != kc0Var.f22376b) {
                    kc0Var = new kc0(kc0Var.f22375a, j10, kc0Var.f22377c, kc0Var.f22378d, kc0Var.f22379e, kc0Var.f22380f, kc0Var.f22381g, kc0Var.f22382h, kc0Var.f22383i);
                }
                ic0VarB.f21683f = kc0Var;
            }
            jSeekToUs = j10;
            a(jSeekToUs);
            f();
        } else {
            this.f25466t.c();
            a(j10);
            jSeekToUs = j10;
        }
        a(false);
        this.f25455i.a(2);
        return jSeekToUs;
    }

    private long a(v61 v61Var, Object obj, long j10) {
        v61Var.a(v61Var.a(obj, this.f25459m).f25848c, this.f25458l, 0L);
        v61.d dVar = this.f25458l;
        if (dVar.f25866f != -9223372036854775807L && dVar.a()) {
            v61.d dVar2 = this.f25458l;
            if (dVar2.f25869i) {
                long j11 = dVar2.f25867g;
                int i10 = da1.f19803a;
                return da1.a((j11 == -9223372036854775807L ? System.currentTimeMillis() : j11 + SystemClock.elapsedRealtime()) - this.f25458l.f25866f) - (j10 + this.f25459m.f25850e);
            }
        }
        return -9223372036854775807L;
    }

    private Pair<nc0.b, Long> a(v61 v61Var) {
        long jB = 0;
        if (v61Var.c()) {
            return Pair.create(xq0.a(), 0L);
        }
        Pair<Object, Long> pairA = v61Var.a(this.f25458l, this.f25459m, v61Var.a(this.G), -9223372036854775807L);
        nc0.b bVarA = this.f25466t.a(v61Var, pairA.first, 0L);
        long jLongValue = ((Long) pairA.second).longValue();
        if (bVarA.a()) {
            v61Var.a(bVarA.f22012a, this.f25459m);
            if (bVarA.f22014c == this.f25459m.d(bVarA.f22013b)) {
                jB = this.f25459m.b();
            }
        } else {
            jB = jLongValue;
        }
        return Pair.create(bVarA, Long.valueOf(jB));
    }

    private static Pair a(v61 v61Var, g gVar, int i10, boolean z10, v61.d dVar, v61.b bVar) {
        v61 v61Var2;
        v61 v61Var3 = gVar.f25490a;
        if (v61Var.c()) {
            return null;
        }
        if (v61Var3.c()) {
            v61Var2 = v61Var3;
            v61Var2 = v61Var;
        }
        try {
            v61Var2 = v61Var3;
            Pair<Object, Long> pairA = v61Var2.a(dVar, bVar, gVar.f25491b, gVar.f25492c);
            if (v61Var.equals(v61Var2)) {
                return pairA;
            }
            if (v61Var.a(pairA.first) != -1) {
                return (v61Var2.a(pairA.first, bVar).f25851f && v61Var2.a(bVar.f25848c, dVar, 0L).f25875o == v61Var2.a(pairA.first)) ? v61Var.a(dVar, bVar, v61Var.a(pairA.first, bVar).f25848c, gVar.f25492c) : pairA;
            }
            Object objA = a(dVar, bVar, i10, z10, pairA.first, v61Var2, v61Var);
            if (objA != null) {
                return v61Var.a(dVar, bVar, v61Var.a(objA, bVar).f25848c, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00be  */
    private xq0 a(nc0.b bVar, long j10, long j11, long j12, boolean z10, int i10) {
        List<Metadata> listI;
        i71 i71Var;
        p71 p71Var;
        this.O = (!this.O && j10 == this.f25471y.f26606r && bVar.equals(this.f25471y.f26590b)) ? false : true;
        o();
        xq0 xq0Var = this.f25471y;
        i71 i71Var2 = xq0Var.f26596h;
        p71 p71Var2 = xq0Var.f26597i;
        List<Metadata> list = xq0Var.f26598j;
        if (this.f25467u.c()) {
            ic0 ic0VarE = this.f25466t.e();
            i71 i71VarE = ic0VarE == null ? i71.f21617d : ic0VarE.e();
            p71 p71VarF = ic0VarE == null ? this.f25452f : ic0VarE.f();
            et[] etVarArr = p71VarF.f24000c;
            com.yandex.mobile.ads.embedded.guava.collect.p.a aVar = new com.yandex.mobile.ads.embedded.guava.collect.p.a();
            boolean z11 = false;
            for (et etVar : etVarArr) {
                if (etVar != null) {
                    Metadata metadata = etVar.a(0).f27113j;
                    if (metadata == null) {
                        aVar.b(new Metadata(new Metadata.Entry[0]));
                    } else {
                        aVar.b(metadata);
                        z11 = true;
                    }
                }
            }
            com.yandex.mobile.ads.embedded.guava.collect.p pVarA = z11 ? aVar.a() : com.yandex.mobile.ads.embedded.guava.collect.p.i();
            if (ic0VarE != null) {
                kc0 kc0Var = ic0VarE.f21683f;
                long j13 = kc0Var.f22377c;
                if (j13 != j11) {
                    if (j11 != j13) {
                        kc0Var = new kc0(kc0Var.f22375a, kc0Var.f22376b, j11, kc0Var.f22378d, kc0Var.f22379e, kc0Var.f22380f, kc0Var.f22381g, kc0Var.f22382h, kc0Var.f22383i);
                    }
                    ic0VarE.f21683f = kc0Var;
                } else {
                    p71VarF = p71VarF;
                }
            } else {
                p71VarF = p71VarF;
            }
            i71Var = i71VarE;
            listI = pVarA;
            p71Var = p71VarF;
        } else if (bVar.equals(this.f25471y.f26590b)) {
            listI = list;
            i71Var = i71Var2;
            p71Var = p71Var2;
        } else {
            i71Var = i71.f21617d;
            p71Var = this.f25452f;
            listI = com.yandex.mobile.ads.embedded.guava.collect.p.i();
        }
        if (z10) {
            this.f25472z.c(i10);
        }
        xq0 xq0Var2 = this.f25471y;
        long j14 = xq0Var2.f26604p;
        ic0 ic0VarD = this.f25466t.d();
        return xq0Var2.a(bVar, j10, j11, j12, ic0VarD == null ? 0L : Math.max(0L, j14 - ic0VarD.c(this.M)), i71Var, p71Var, listI);
    }

    public static Object a(v61.d dVar, v61.b bVar, int i10, boolean z10, Object obj, v61 v61Var, v61 v61Var2) {
        int iA = v61Var.a(obj);
        int iA2 = v61Var.a();
        int iA3 = iA;
        int iA4 = -1;
        for (int i11 = 0; i11 < iA2 && iA4 == -1; i11++) {
            iA3 = v61Var.a(iA3, bVar, dVar, i10, z10);
            if (iA3 == -1) {
                break;
            }
            iA4 = v61Var2.a(v61Var.a(iA3));
        }
        if (iA4 == -1) {
            return null;
        }
        return v61Var2.a(iA4);
    }

    private void a(int i10) throws ns {
        this.F = i10;
        if (!this.f25466t.a(this.f25471y.f26589a, i10)) {
            b(true);
        }
        a(false);
    }

    private void a(int i10, int i11, i11 i11Var) throws Throwable {
        this.f25472z.a(1);
        a(this.f25467u.a(i10, i11, i11Var), false);
    }

    private void a(long j10) throws ns {
        ic0 ic0VarE = this.f25466t.e();
        long jD = ic0VarE == null ? j10 + 1000000000000L : ic0VarE.d(j10);
        this.M = jD;
        this.f25462p.a(jD);
        for (pv0 pv0Var : this.f25448b) {
            if (b(pv0Var)) {
                pv0Var.a(this.M);
            }
        }
        for (ic0 ic0VarE2 = this.f25466t.e(); ic0VarE2 != null; ic0VarE2 = ic0VarE2.b()) {
            for (et etVar : ic0VarE2.f().f24000c) {
                if (etVar != null) {
                    etVar.f();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(hr0 hr0Var) {
        try {
            synchronized (hr0Var) {
            }
            try {
                hr0Var.c().a(hr0Var.d(), hr0Var.b());
            } finally {
                hr0Var.a(true);
            }
        } catch (ns e10) {
            p90.a("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    private void a(i11 i11Var) throws Throwable {
        this.f25472z.a(1);
        a(this.f25467u.a(i11Var), false);
    }

    private void a(pv0 pv0Var) throws ns {
        if (pv0Var.c() != 0) {
            this.f25462p.a(pv0Var);
            if (pv0Var.c() == 2) {
                pv0Var.stop();
            }
            pv0Var.b();
            this.K--;
        }
    }

    private void a(a aVar) throws Throwable {
        this.f25472z.a(1);
        if (aVar.f25475c != -1) {
            this.L = new g(new vr0(aVar.f25473a, aVar.f25474b), aVar.f25475c, aVar.f25476d);
        }
        a(this.f25467u.a(aVar.f25473a, aVar.f25474b), false);
    }

    private void a(a aVar, int i10) throws Throwable {
        this.f25472z.a(1);
        qc0 qc0Var = this.f25467u;
        if (i10 == -1) {
            i10 = qc0Var.b();
        }
        a(qc0Var.a(i10, aVar.f25473a, aVar.f25474b), false);
    }

    private void a(b bVar) throws Throwable {
        this.f25472z.a(1);
        qc0 qc0Var = this.f25467u;
        Objects.requireNonNull(bVar);
        a(qc0Var.d(), false);
    }

    private void a(g gVar) throws Throwable {
        long j10;
        long j11;
        nc0.b bVar;
        boolean z10;
        long j12;
        long j13;
        long j14;
        xq0 xq0Var;
        int i10;
        this.f25472z.a(1);
        Pair pairA = a(this.f25471y.f26589a, gVar, this.F, this.G, this.f25458l, this.f25459m);
        if (pairA == null) {
            Pair<nc0.b, Long> pairA2 = a(this.f25471y.f26589a);
            bVar = (nc0.b) pairA2.first;
            long jLongValue = ((Long) pairA2.second).longValue();
            z10 = !this.f25471y.f26589a.c();
            j10 = jLongValue;
            j11 = -9223372036854775807L;
        } else {
            Object obj = pairA.first;
            long jLongValue2 = ((Long) pairA.second).longValue();
            long j15 = gVar.f25492c == -9223372036854775807L ? -9223372036854775807L : jLongValue2;
            nc0.b bVarA = this.f25466t.a(this.f25471y.f26589a, obj, jLongValue2);
            if (bVarA.a()) {
                this.f25471y.f26589a.a(bVarA.f22012a, this.f25459m);
                jLongValue2 = this.f25459m.d(bVarA.f22013b) == bVarA.f22014c ? this.f25459m.b() : 0L;
            } else if (gVar.f25492c != -9223372036854775807L) {
                j10 = jLongValue2;
                j11 = j15;
                bVar = bVarA;
                z10 = false;
            }
            j10 = jLongValue2;
            j11 = j15;
            bVar = bVarA;
            z10 = true;
        }
        try {
            if (!this.f25471y.f26589a.c()) {
                if (pairA == null) {
                    if (this.f25471y.f26593e != 1) {
                        b(4);
                    }
                    a(false, true, false, true);
                } else {
                    if (bVar.equals(this.f25471y.f26590b)) {
                        ic0 ic0VarE = this.f25466t.e();
                        long jA = (ic0VarE == null || !ic0VarE.f21681d || j10 == 0) ? j10 : ic0VarE.f21678a.a(j10, this.f25470x);
                        if (da1.b(jA) == da1.b(this.f25471y.f26606r) && ((i10 = (xq0Var = this.f25471y).f26593e) == 2 || i10 == 3)) {
                            j14 = xq0Var.f26606r;
                        } else {
                            j13 = jA;
                        }
                    } else {
                        j13 = j10;
                    }
                    long jA2 = a(bVar, j13, this.f25466t.e() != this.f25466t.f(), this.f25471y.f26593e == 4);
                    boolean z11 = z10 | (j10 != jA2);
                    try {
                        xq0 xq0Var2 = this.f25471y;
                        v61 v61Var = xq0Var2.f26589a;
                        a(v61Var, bVar, v61Var, xq0Var2.f26590b, j11);
                        z10 = z11;
                        j14 = jA2;
                    } catch (Throwable th) {
                        th = th;
                        z10 = z11;
                        j12 = jA2;
                        this.f25471y = a(bVar, j12, j11, j12, z10, 2);
                        throw th;
                    }
                }
                this.f25471y = a(bVar, j14, j11, j14, z10, 2);
            }
            this.L = gVar;
            j14 = j10;
            this.f25471y = a(bVar, j14, j11, j14, z10, 2);
        } catch (Throwable th2) {
            th = th2;
            j12 = j10;
        }
    }

    private void a(v61 v61Var, nc0.b bVar, v61 v61Var2, nc0.b bVar2, long j10) {
        if (!a(v61Var, bVar)) {
            zq0 zq0Var = bVar.a() ? zq0.f27397d : this.f25471y.f26602n;
            if (this.f25462p.getPlaybackParameters().equals(zq0Var)) {
                return;
            }
            this.f25462p.a(zq0Var);
            return;
        }
        v61Var.a(v61Var.a(bVar.f22012a, this.f25459m).f25848c, this.f25458l, 0L);
        s80 s80Var = this.f25468v;
        bc0.e eVar = this.f25458l.f25871k;
        int i10 = da1.f19803a;
        ((co) s80Var).a(eVar);
        if (j10 != -9223372036854775807L) {
            ((co) this.f25468v).a(a(v61Var, bVar.f22012a, j10));
            return;
        }
        if (da1.a(v61Var2.c() ? null : v61Var2.a(v61Var2.a(bVar2.f22012a, this.f25459m).f25848c, this.f25458l, 0L).f25861a, this.f25458l.f25861a)) {
            return;
        }
        ((co) this.f25468v).a(-9223372036854775807L);
    }

    private void a(v61 v61Var, v61 v61Var2) {
        if (v61Var.c() && v61Var2.c()) {
            return;
        }
        int size = this.f25463q.size() - 1;
        if (size < 0) {
            Collections.sort(this.f25463q);
        } else {
            Objects.requireNonNull(this.f25463q.get(size));
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:162:0x0320  */
    /* JADX WARN: Code duplicated, block: B:178:0x0365  */
    /* JADX WARN: Code duplicated, block: B:179:0x0367  */
    /* JADX WARN: Code duplicated, block: B:184:0x037b  */
    /* JADX WARN: Code duplicated, block: B:186:0x0385 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:192:0x0398  */
    /* JADX WARN: Code duplicated, block: B:196:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:200:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:210:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:213:0x0401  */
    /* JADX WARN: Code duplicated, block: B:215:0x0409  */
    /* JADX WARN: Code duplicated, block: B:217:0x0413 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:223:0x0426  */
    /* JADX WARN: Code duplicated, block: B:227:0x0434  */
    /* JADX WARN: Code duplicated, block: B:231:0x045e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v14 */
    /* JADX WARN: Type inference failed for: r18v15 */
    /* JADX WARN: Type inference failed for: r18v17 */
    /* JADX WARN: Type inference failed for: r18v18 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v20 */
    /* JADX WARN: Type inference failed for: r18v21 */
    /* JADX WARN: Type inference failed for: r18v22 */
    /* JADX WARN: Type inference failed for: r18v23 */
    /* JADX WARN: Type inference failed for: r18v24 */
    /* JADX WARN: Type inference failed for: r18v25 */
    /* JADX WARN: Type inference failed for: r18v26 */
    /* JADX WARN: Type inference failed for: r18v27 */
    /* JADX WARN: Type inference failed for: r18v28 */
    /* JADX WARN: Type inference failed for: r18v29 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v30 */
    /* JADX WARN: Type inference failed for: r18v31 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r22v10 */
    /* JADX WARN: Type inference failed for: r22v11 */
    /* JADX WARN: Type inference failed for: r22v15 */
    /* JADX WARN: Type inference failed for: r22v16 */
    /* JADX WARN: Type inference failed for: r22v17 */
    /* JADX WARN: Type inference failed for: r22v18 */
    /* JADX WARN: Type inference failed for: r22v19 */
    /* JADX WARN: Type inference failed for: r22v21 */
    /* JADX WARN: Type inference failed for: r22v22 */
    /* JADX WARN: Type inference failed for: r22v23 */
    /* JADX WARN: Type inference failed for: r22v25 */
    /* JADX WARN: Type inference failed for: r22v26 */
    /* JADX WARN: Type inference failed for: r22v27 */
    /* JADX WARN: Type inference failed for: r22v28 */
    /* JADX WARN: Type inference failed for: r22v29 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v30 */
    /* JADX WARN: Type inference failed for: r22v31 */
    /* JADX WARN: Type inference failed for: r22v32 */
    /* JADX WARN: Type inference failed for: r22v33 */
    /* JADX WARN: Type inference failed for: r22v34 */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r22v7 */
    /* JADX WARN: Type inference failed for: r22v8 */
    /* JADX WARN: Type inference failed for: r22v9 */
    /* JADX WARN: Type inference failed for: r37v0, types: [com.yandex.mobile.ads.impl.ts] */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean] */
    private void a(v61 v61Var, boolean z10) throws Throwable {
        nc0.b bVar;
        Object obj;
        long j10;
        boolean z11;
        int iA;
        Object obj2;
        int i10;
        boolean z12;
        boolean z13;
        boolean z14;
        long j11;
        long j12;
        long jB;
        ?? r22;
        long j13;
        f fVar;
        int i11;
        boolean z15;
        ?? r18;
        g gVar;
        long j14;
        ?? r19;
        ?? r23;
        g gVar2;
        Object obj3;
        ?? r24;
        ?? r110;
        boolean z16;
        boolean z17;
        char c10;
        ?? r25;
        ?? r111;
        boolean z18;
        char c11;
        boolean z19;
        ?? r26;
        ?? r112;
        long j15;
        Object obj4;
        ?? r27;
        ?? r113;
        boolean z20;
        char c12;
        xq0 xq0Var = this.f25471y;
        g gVar3 = this.L;
        lc0 lc0Var = this.f25466t;
        int i12 = this.F;
        boolean z21 = this.G;
        v61.d dVar = this.f25458l;
        v61.b bVar2 = this.f25459m;
        if (v61Var.c()) {
            nc0.b bVarA = xq0.a();
            fVar = new f(bVarA, 0L, -9223372036854775807L, false, true, false);
            r18 = bVarA;
        } else {
            nc0.b bVar3 = xq0Var.f26590b;
            Object obj5 = bVar3.f22012a;
            v61 v61Var2 = xq0Var.f26589a;
            boolean zC = v61Var2.c();
            boolean z22 = zC || v61Var2.a(bVar3.f22012a, bVar2).f25851f;
            long jLongValue = (xq0Var.f26590b.a() || z22) ? xq0Var.f26591c : xq0Var.f26606r;
            if (gVar3 != null) {
                Pair pairA = a(v61Var, gVar3, i12, z21, dVar, bVar2);
                if (pairA == null) {
                    iA = v61Var.a(z21);
                    jLongValue = jLongValue;
                    obj2 = obj5;
                    bVar = bVar3;
                    i10 = -1;
                    j10 = 0;
                    z12 = false;
                    z13 = true;
                    z14 = false;
                } else {
                    if (gVar3.f25492c == -9223372036854775807L) {
                        iA = v61Var.a(pairA.first, bVar2).f25848c;
                        jLongValue = jLongValue;
                        obj2 = obj5;
                        z15 = false;
                    } else {
                        Object obj6 = pairA.first;
                        jLongValue = ((Long) pairA.second).longValue();
                        obj2 = obj6;
                        z15 = true;
                        iA = -1;
                    }
                    z14 = z15;
                    bVar = bVar3;
                    if (xq0Var.f26593e == 4) {
                        i10 = -1;
                        j10 = 0;
                        z12 = true;
                    } else {
                        i10 = -1;
                        j10 = 0;
                        z12 = false;
                    }
                    z13 = false;
                }
            } else {
                bVar = bVar3;
                if (xq0Var.f26589a.c()) {
                    iA = v61Var.a(z21);
                    obj2 = obj5;
                } else {
                    if (v61Var.a(obj5) == -1) {
                        obj = obj5;
                        Object objA = a(dVar, bVar2, i12, z21, obj5, xq0Var.f26589a, v61Var);
                        if (objA == null) {
                            iA = v61Var.a(z21);
                            z11 = true;
                        } else {
                            iA = v61Var.a(objA, bVar2).f25848c;
                            z11 = false;
                        }
                        j10 = 0;
                    } else {
                        obj = obj5;
                        if (jLongValue == -9223372036854775807L) {
                            iA = v61Var.a(obj, bVar2).f25848c;
                            obj2 = obj;
                        } else if (z22) {
                            bVar = bVar;
                            xq0Var.f26589a.a(bVar.f22012a, bVar2);
                            j10 = 0;
                            if (xq0Var.f26589a.a(bVar2.f25848c, dVar, 0L).f25875o == xq0Var.f26589a.a(bVar.f22012a)) {
                                j11 = jLongValue + bVar2.f25850e;
                                Pair<Object, Long> pairA2 = v61Var.a(dVar, bVar2, v61Var.a(obj, bVar2).f25848c, j11);
                                Object obj7 = pairA2.first;
                                jLongValue = ((Long) pairA2.second).longValue();
                                obj2 = obj7;
                            } else {
                                obj2 = obj;
                                jLongValue = jLongValue;
                            }
                            i10 = -1;
                            iA = -1;
                            z12 = false;
                            z13 = false;
                            z14 = true;
                        } else {
                            bVar = bVar;
                            j10 = 0;
                            z11 = false;
                            iA = -1;
                        }
                    }
                    z13 = z11;
                    obj2 = obj;
                    jLongValue = jLongValue;
                    i10 = -1;
                    z12 = false;
                    z14 = false;
                }
                bVar = bVar;
                i10 = -1;
                j10 = 0;
                z12 = false;
                z13 = false;
                z14 = false;
            }
            if (iA != i10) {
                r22 = -9223372036854775807;
                Pair<Object, Long> pairA3 = v61Var.a(dVar, bVar2, iA, -9223372036854775807L);
                Object obj8 = pairA3.first;
                long jLongValue2 = ((Long) pairA3.second).longValue();
                obj2 = obj8;
                jB = jLongValue2;
                j12 = -9223372036854775807L;
            } else {
                j12 = jLongValue;
                jB = j12;
                r22 = j11;
            }
            nc0.b bVarA2 = lc0Var.a(v61Var, obj2, jB);
            int i13 = bVarA2.f22016e;
            boolean z23 = bVar.f22012a.equals(obj2) && !bVar.a() && !bVarA2.a() && (i13 == -1 || ((i11 = bVar.f22016e) != -1 && i13 >= i11));
            v61.b bVarA3 = v61Var.a(obj2, bVar2);
            boolean z24 = !z22 && jLongValue == j12 && bVar.f22012a.equals(bVarA2.f22012a) && (!(bVar.a() && bVarA3.f(bVar.f22013b)) ? !(bVarA2.a() && bVarA3.f(bVarA2.f22013b)) : bVarA3.b(bVar.f22013b, bVar.f22014c) == 4 || bVarA3.b(bVar.f22013b, bVar.f22014c) == 2);
            if (z23 || z24) {
                bVarA2 = bVar;
            }
            if (bVarA2.a()) {
                if (bVarA2.equals(bVar)) {
                    jB = xq0Var.f26606r;
                } else {
                    v61Var.a(bVarA2.f22012a, bVar2);
                    if (bVarA2.f22014c == bVar2.d(bVarA2.f22013b)) {
                        jB = bVar2.b();
                    } else {
                        j13 = j10;
                    }
                }
                j13 = jB;
            } else {
                j13 = jB;
            }
            fVar = new f(bVarA2, j13, j12, z12, z13, z14);
            r18 = zC;
        }
        f fVar2 = fVar;
        nc0.b bVar4 = fVar2.f25484a;
        long j16 = fVar2.f25486c;
        boolean z25 = fVar2.f25487d;
        long jA = fVar2.f25485b;
        boolean z26 = (this.f25471y.f26590b.equals(bVar4) && jA == this.f25471y.f26606r) ? false : true;
        try {
            if (fVar2.f25488e) {
                z17 = true;
                if (this.f25471y.f26593e != 1) {
                    c10 = 4;
                    try {
                        b(4);
                    } catch (Throwable th) {
                        th = th;
                        r23 = 1;
                        r19 = 4;
                        gVar = null;
                        j14 = -9223372036854775807L;
                        xq0 xq0Var2 = this.f25471y;
                        v61 v61Var3 = xq0Var2.f26589a;
                        nc0.b bVar5 = xq0Var2.f26590b;
                        if (fVar2.f25489f) {
                            j14 = jA;
                        }
                        gVar2 = gVar;
                        a(v61Var, bVar4, v61Var3, bVar5, j14);
                        if (z26) {
                            xq0 xq0Var3 = this.f25471y;
                            obj3 = xq0Var3.f26590b.f22012a;
                            v61 v61Var4 = xq0Var3.f26589a;
                            if (z26) {
                                r24 = r23;
                                r24 = 0;
                            } else {
                                r24 = r23;
                                r24 = 0;
                            }
                            r24 = r23;
                            long j17 = this.f25471y.f26592d;
                            r110 = r19;
                            if (v61Var.a(obj3) != -1) {
                                r110 = 3;
                            }
                            this.f25471y = a(bVar4, jA, j16, j17, r24, r110 == true ? 1 : 0);
                        } else {
                            xq0 xq0Var4 = this.f25471y;
                            obj3 = xq0Var4.f26590b.f22012a;
                            v61 v61Var5 = xq0Var4.f26589a;
                            if (z26) {
                                r24 = r23;
                                r24 = 0;
                            } else {
                                r24 = r23;
                                r24 = 0;
                            }
                            r24 = r23;
                            long j18 = this.f25471y.f26592d;
                            r110 = r19;
                            if (v61Var.a(obj3) != -1) {
                                r110 = 3;
                            }
                            this.f25471y = a(bVar4, jA, j16, j18, r24, r110 == true ? 1 : 0);
                        }
                        o();
                        a(v61Var, this.f25471y.f26589a);
                        this.f25471y = this.f25471y.a(v61Var);
                        if (!v61Var.c()) {
                            this.L = gVar2;
                        }
                        a(false);
                        throw th;
                    }
                } else {
                    c10 = 4;
                }
                z16 = false;
                try {
                    a(false, false, false, true);
                } catch (Throwable th2) {
                    th = th2;
                    r23 = 1;
                    r19 = c10;
                    gVar = null;
                    j14 = -9223372036854775807L;
                    xq0 xq0Var5 = this.f25471y;
                    v61 v61Var6 = xq0Var5.f26589a;
                    nc0.b bVar6 = xq0Var5.f26590b;
                    if (fVar2.f25489f) {
                        j14 = jA;
                    }
                    gVar2 = gVar;
                    a(v61Var, bVar4, v61Var6, bVar6, j14);
                    if (z26) {
                        xq0 xq0Var6 = this.f25471y;
                        obj3 = xq0Var6.f26590b.f22012a;
                        v61 v61Var7 = xq0Var6.f26589a;
                        if (z26) {
                            r24 = r23;
                            r24 = 0;
                        } else {
                            r24 = r23;
                            r24 = 0;
                        }
                        r24 = r23;
                        long j19 = this.f25471y.f26592d;
                        r110 = r19;
                        if (v61Var.a(obj3) != -1) {
                            r110 = 3;
                        }
                        this.f25471y = a(bVar4, jA, j16, j19, r24, r110 == true ? 1 : 0);
                    } else {
                        xq0 xq0Var7 = this.f25471y;
                        obj3 = xq0Var7.f26590b.f22012a;
                        v61 v61Var8 = xq0Var7.f26589a;
                        if (z26) {
                            r24 = r23;
                            r24 = 0;
                        } else {
                            r24 = r23;
                            r24 = 0;
                        }
                        r24 = r23;
                        long j110 = this.f25471y.f26592d;
                        r110 = r19;
                        if (v61Var.a(obj3) != -1) {
                            r110 = 3;
                        }
                        this.f25471y = a(bVar4, jA, j16, j110, r24, r110 == true ? 1 : 0);
                    }
                    o();
                    a(v61Var, this.f25471y.f26589a);
                    this.f25471y = this.f25471y.a(v61Var);
                    if (!v61Var.c()) {
                        this.L = gVar2;
                    }
                    a(false);
                    throw th;
                }
            } else {
                z16 = false;
                z17 = true;
                c10 = 4;
            }
            try {
                if (z26) {
                    z19 = z16;
                    z20 = z17;
                    c12 = c10;
                    if (!v61Var.c()) {
                        try {
                            r18 = c12;
                            r22 = z20;
                            for (ic0 ic0VarE = this.f25466t.e(); ic0VarE != null; ic0VarE = ic0VarE.b()) {
                                if (ic0VarE.f21683f.f22375a.equals(bVar4)) {
                                    kc0 kc0VarA = this.f25466t.a(v61Var, ic0VarE.f21683f);
                                    ic0VarE.f21683f = kc0VarA;
                                    hc0 hc0Var = ic0VarE.f21678a;
                                    if (hc0Var instanceof ji) {
                                        long j20 = kc0VarA.f22378d;
                                        j14 = -9223372036854775807L;
                                        if (j20 == -9223372036854775807L) {
                                            j20 = Long.MIN_VALUE;
                                        }
                                        try {
                                            ((ji) hc0Var).a(j20);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            gVar = null;
                                            r19 = c12;
                                            r23 = z20;
                                            xq0 xq0Var8 = this.f25471y;
                                            v61 v61Var9 = xq0Var8.f26589a;
                                            nc0.b bVar7 = xq0Var8.f26590b;
                                            if (fVar2.f25489f) {
                                                j14 = jA;
                                            }
                                            gVar2 = gVar;
                                            a(v61Var, bVar4, v61Var9, bVar7, j14);
                                            if (z26) {
                                                xq0 xq0Var9 = this.f25471y;
                                                obj3 = xq0Var9.f26590b.f22012a;
                                                v61 v61Var10 = xq0Var9.f26589a;
                                                if (z26) {
                                                    r24 = r23;
                                                    r24 = 0;
                                                } else {
                                                    r24 = r23;
                                                    r24 = 0;
                                                }
                                                r24 = r23;
                                                long j111 = this.f25471y.f26592d;
                                                r110 = r19;
                                                if (v61Var.a(obj3) != -1) {
                                                    r110 = 3;
                                                }
                                                this.f25471y = a(bVar4, jA, j16, j111, r24, r110 == true ? 1 : 0);
                                            } else {
                                                xq0 xq0Var10 = this.f25471y;
                                                obj3 = xq0Var10.f26590b.f22012a;
                                                v61 v61Var11 = xq0Var10.f26589a;
                                                if (z26) {
                                                    r24 = r23;
                                                    r24 = 0;
                                                } else {
                                                    r24 = r23;
                                                    r24 = 0;
                                                }
                                                r24 = r23;
                                                long j112 = this.f25471y.f26592d;
                                                r110 = r19;
                                                if (v61Var.a(obj3) != -1) {
                                                    r110 = 3;
                                                }
                                                this.f25471y = a(bVar4, jA, j16, j112, r24, r110 == true ? 1 : 0);
                                            }
                                            o();
                                            a(v61Var, this.f25471y.f26589a);
                                            this.f25471y = this.f25471y.a(v61Var);
                                            if (!v61Var.c()) {
                                                this.L = gVar2;
                                            }
                                            a(false);
                                            throw th;
                                        }
                                    }
                                }
                            }
                            j14 = -9223372036854775807L;
                            jA = a(bVar4, jA, this.f25466t.e() != this.f25466t.f() ? z20 ? 1 : 0 : z19, z25);
                            r112 = c12;
                            r26 = z20;
                        } catch (Throwable th4) {
                            th = th4;
                            j14 = -9223372036854775807L;
                        }
                    }
                    xq0 xq0Var11 = this.f25471y;
                    v61 v61Var12 = xq0Var11.f26589a;
                    nc0.b bVar8 = xq0Var11.f26590b;
                    if (fVar2.f25489f) {
                        j15 = jA;
                    } else {
                        j15 = j14;
                    }
                    a(v61Var, bVar4, v61Var12, bVar8, j15);
                    if (z26 || j16 != this.f25471y.f26591c) {
                        xq0 xq0Var12 = this.f25471y;
                        obj4 = xq0Var12.f26590b.f22012a;
                        v61 v61Var13 = xq0Var12.f26589a;
                        if (z26 || !z10 || v61Var13.c() || v61Var13.a(obj4, this.f25459m).f25851f) {
                            r27 = r26;
                            r27 = z19;
                        }
                        r27 = r26;
                        long j21 = this.f25471y.f26592d;
                        r113 = r112;
                        if (v61Var.a(obj4) != -1) {
                            r113 = 3;
                        }
                        this.f25471y = a(bVar4, jA, j16, j21, r27, r113 == true ? 1 : 0);
                    }
                    o();
                    a(v61Var, this.f25471y.f26589a);
                    this.f25471y = this.f25471y.a(v61Var);
                    if (!v61Var.c()) {
                        this.L = null;
                    }
                    a(z19);
                }
                try {
                    try {
                        r18 = 4;
                        r18 = 4;
                        r22 = 1;
                        r22 = 1;
                        z19 = z16;
                        if (!this.f25466t.a(v61Var, this.M, c())) {
                            b(z19);
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        c11 = 4;
                        z18 = true;
                        gVar = null;
                        r111 = c11;
                        r25 = z18;
                        j14 = -9223372036854775807L;
                        r19 = r111;
                        r23 = r25;
                        xq0 xq0Var13 = this.f25471y;
                        v61 v61Var14 = xq0Var13.f26589a;
                        nc0.b bVar9 = xq0Var13.f26590b;
                        if (fVar2.f25489f) {
                            j14 = jA;
                        }
                        gVar2 = gVar;
                        a(v61Var, bVar4, v61Var14, bVar9, j14);
                        if (z26 || j16 != this.f25471y.f26591c) {
                            xq0 xq0Var14 = this.f25471y;
                            obj3 = xq0Var14.f26590b.f22012a;
                            v61 v61Var15 = xq0Var14.f26589a;
                            if (z26 || !z10 || v61Var15.c() || v61Var15.a(obj3, this.f25459m).f25851f) {
                                r24 = r23;
                                r24 = 0;
                            }
                            r24 = r23;
                            long j113 = this.f25471y.f26592d;
                            r110 = r19;
                            if (v61Var.a(obj3) != -1) {
                                r110 = 3;
                            }
                            this.f25471y = a(bVar4, jA, j16, j113, r24, r110 == true ? 1 : 0);
                        }
                        o();
                        a(v61Var, this.f25471y.f26589a);
                        this.f25471y = this.f25471y.a(v61Var);
                        if (!v61Var.c()) {
                            this.L = gVar2;
                        }
                        a(false);
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    z18 = z17;
                    c11 = c10;
                }
                r18 = c12;
                r22 = z20;
                j14 = -9223372036854775807L;
                r112 = r18;
                r26 = r22;
                xq0 xq0Var15 = this.f25471y;
                v61 v61Var16 = xq0Var15.f26589a;
                nc0.b bVar10 = xq0Var15.f26590b;
                if (fVar2.f25489f) {
                    j15 = jA;
                } else {
                    j15 = j14;
                }
                a(v61Var, bVar4, v61Var16, bVar10, j15);
                if (z26) {
                    xq0 xq0Var16 = this.f25471y;
                    obj4 = xq0Var16.f26590b.f22012a;
                    v61 v61Var17 = xq0Var16.f26589a;
                    if (z26) {
                        r27 = r26;
                        r27 = z19;
                    } else {
                        r27 = r26;
                        r27 = z19;
                    }
                    r27 = r26;
                    long j22 = this.f25471y.f26592d;
                    r113 = r112;
                    if (v61Var.a(obj4) != -1) {
                        r113 = 3;
                    }
                    this.f25471y = a(bVar4, jA, j16, j22, r27, r113 == true ? 1 : 0);
                } else {
                    xq0 xq0Var17 = this.f25471y;
                    obj4 = xq0Var17.f26590b.f22012a;
                    v61 v61Var18 = xq0Var17.f26589a;
                    if (z26) {
                        r27 = r26;
                        r27 = z19;
                    } else {
                        r27 = r26;
                        r27 = z19;
                    }
                    r27 = r26;
                    long j23 = this.f25471y.f26592d;
                    r113 = r112;
                    if (v61Var.a(obj4) != -1) {
                        r113 = 3;
                    }
                    this.f25471y = a(bVar4, jA, j16, j23, r27, r113 == true ? 1 : 0);
                }
                o();
                a(v61Var, this.f25471y.f26589a);
                this.f25471y = this.f25471y.a(v61Var);
                if (!v61Var.c()) {
                    this.L = null;
                }
                a(z19);
            } catch (Throwable th7) {
                th = th7;
                gVar = null;
                r111 = r18;
                r25 = r22;
            }
        } catch (Throwable th8) {
            th = th8;
            gVar = null;
            j14 = -9223372036854775807L;
            r19 = 4;
            r23 = 1;
        }
    }

    private void a(zq0 zq0Var, float f10, boolean z10, boolean z11) throws ns {
        int i10;
        ts tsVar = this;
        if (z10) {
            if (z11) {
                tsVar.f25472z.a(1);
            }
            xq0 xq0Var = tsVar.f25471y;
            tsVar = this;
            tsVar.f25471y = new xq0(xq0Var.f26589a, xq0Var.f26590b, xq0Var.f26591c, xq0Var.f26592d, xq0Var.f26593e, xq0Var.f26594f, xq0Var.f26595g, xq0Var.f26596h, xq0Var.f26597i, xq0Var.f26598j, xq0Var.f26599k, xq0Var.f26600l, xq0Var.f26601m, zq0Var, xq0Var.f26604p, xq0Var.f26605q, xq0Var.f26606r, xq0Var.f26603o);
        }
        float f11 = zq0Var.f27398a;
        ic0 ic0VarE = tsVar.f25466t.e();
        while (true) {
            i10 = 0;
            if (ic0VarE == null) {
                break;
            }
            et[] etVarArr = ic0VarE.f().f24000c;
            int length = etVarArr.length;
            while (i10 < length) {
                et etVar = etVarArr[i10];
                if (etVar != null) {
                    etVar.a(f11);
                }
                i10++;
            }
            ic0VarE = ic0VarE.b();
        }
        pv0[] pv0VarArr = tsVar.f25448b;
        int length2 = pv0VarArr.length;
        while (i10 < length2) {
            pv0 pv0Var = pv0VarArr[i10];
            if (pv0Var != null) {
                pv0Var.a(f10, zq0Var.f27398a);
            }
            i10++;
        }
    }

    private void a(IOException iOException, int i10) {
        ns nsVarA = ns.a(iOException, i10);
        ic0 ic0VarE = this.f25466t.e();
        if (ic0VarE != null) {
            nsVarA = nsVarA.a(ic0VarE.f21683f.f22375a);
        }
        p90.a("ExoPlayerImplInternal", "Playback error", nsVarA);
        a(false, false);
        this.f25471y = this.f25471y.a(nsVarA);
    }

    private void a(boolean z10) {
        long j10;
        ic0 ic0VarD = this.f25466t.d();
        nc0.b bVar = ic0VarD == null ? this.f25471y.f26590b : ic0VarD.f21683f.f22375a;
        boolean z11 = !this.f25471y.f26599k.equals(bVar);
        if (z11) {
            this.f25471y = this.f25471y.a(bVar);
        }
        xq0 xq0Var = this.f25471y;
        if (ic0VarD == null) {
            j10 = xq0Var.f26606r;
        } else if (ic0VarD.f21681d) {
            long bufferedPositionUs = ic0VarD.f21682e ? ic0VarD.f21678a.getBufferedPositionUs() : Long.MIN_VALUE;
            j10 = bufferedPositionUs == Long.MIN_VALUE ? ic0VarD.f21683f.f22379e : bufferedPositionUs;
        } else {
            j10 = ic0VarD.f21683f.f22376b;
        }
        xq0Var.f26604p = j10;
        xq0 xq0Var2 = this.f25471y;
        long j11 = xq0Var2.f26604p;
        ic0 ic0VarD2 = this.f25466t.d();
        xq0Var2.f26605q = ic0VarD2 != null ? Math.max(0L, j11 - ic0VarD2.c(this.M)) : 0L;
        if ((z11 || z10) && ic0VarD != null && ic0VarD.f21681d) {
            this.f25453g.a(this.f25448b, ic0VarD.f().f24000c);
        }
    }

    private void a(boolean z10, int i10, boolean z11, int i11) throws ns {
        this.f25472z.a(z11 ? 1 : 0);
        this.f25472z.b(i11);
        xq0 xq0Var = this.f25471y;
        this.f25471y = new xq0(xq0Var.f26589a, xq0Var.f26590b, xq0Var.f26591c, xq0Var.f26592d, xq0Var.f26593e, xq0Var.f26594f, xq0Var.f26595g, xq0Var.f26596h, xq0Var.f26597i, xq0Var.f26598j, xq0Var.f26599k, z10, i10, xq0Var.f26602n, xq0Var.f26604p, xq0Var.f26605q, xq0Var.f26606r, xq0Var.f26603o);
        this.D = false;
        for (ic0 ic0VarE = this.f25466t.e(); ic0VarE != null; ic0VarE = ic0VarE.b()) {
            for (et etVar : ic0VarE.f().f24000c) {
                if (etVar != null) {
                    etVar.a(z10);
                }
            }
        }
        if (!p()) {
            r();
            t();
            return;
        }
        int i12 = this.f25471y.f26593e;
        if (i12 == 3) {
            this.D = false;
            this.f25462p.a();
            for (pv0 pv0Var : this.f25448b) {
                if (b(pv0Var)) {
                    pv0Var.start();
                }
            }
        } else if (i12 != 2) {
            return;
        }
        this.f25455i.a(2);
    }

    private void a(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.H != z10) {
            this.H = z10;
            if (!z10) {
                for (pv0 pv0Var : this.f25448b) {
                    if (!b(pv0Var) && this.f25449c.remove(pv0Var)) {
                        pv0Var.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private void a(boolean z10, boolean z11) {
        a(z10 || !this.H, false, true, false);
        this.f25472z.a(z11 ? 1 : 0);
        this.f25453g.d();
        b(1);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0089  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b5 A[PHI: r4 r5 r8
  0x00b5: PHI (r4v3 com.yandex.mobile.ads.impl.nc0$b) = (r4v2 com.yandex.mobile.ads.impl.nc0$b), (r4v7 com.yandex.mobile.ads.impl.nc0$b) binds: [B:36:0x008d, B:38:0x00b2] A[DONT_GENERATE, DONT_INLINE]
  0x00b5: PHI (r5v2 long) = (r5v1 long), (r5v4 long) binds: [B:36:0x008d, B:38:0x00b2] A[DONT_GENERATE, DONT_INLINE]
  0x00b5: PHI (r8v2 long) = (r8v1 long), (r8v4 long) binds: [B:36:0x008d, B:38:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    private void a(boolean z10, boolean z11, boolean z12, boolean z13) {
        long j10;
        boolean z14;
        this.f25455i.c();
        this.P = null;
        this.D = false;
        this.f25462p.b();
        this.M = 1000000000000L;
        for (pv0 pv0Var : this.f25448b) {
            try {
                a(pv0Var);
            } catch (ns | RuntimeException e10) {
                p90.a("ExoPlayerImplInternal", "Disable failed.", e10);
            }
        }
        if (z10) {
            for (pv0 pv0Var2 : this.f25448b) {
                if (this.f25449c.remove(pv0Var2)) {
                    try {
                        pv0Var2.reset();
                    } catch (RuntimeException e11) {
                        p90.a("ExoPlayerImplInternal", "Reset failed.", e11);
                    }
                }
            }
        }
        this.K = 0;
        xq0 xq0Var = this.f25471y;
        nc0.b bVar = xq0Var.f26590b;
        long jLongValue = xq0Var.f26606r;
        if (this.f25471y.f26590b.a()) {
            j10 = this.f25471y.f26591c;
        } else {
            xq0 xq0Var2 = this.f25471y;
            v61.b bVar2 = this.f25459m;
            nc0.b bVar3 = xq0Var2.f26590b;
            v61 v61Var = xq0Var2.f26589a;
            if (v61Var.c() || v61Var.a(bVar3.f22012a, bVar2).f25851f) {
                j10 = this.f25471y.f26591c;
            } else {
                j10 = this.f25471y.f26606r;
            }
        }
        if (z11) {
            this.L = null;
            Pair<nc0.b, Long> pairA = a(this.f25471y.f26589a);
            bVar = (nc0.b) pairA.first;
            jLongValue = ((Long) pairA.second).longValue();
            j10 = -9223372036854775807L;
            z14 = bVar.equals(this.f25471y.f26590b) ? false : true;
        }
        nc0.b bVar4 = bVar;
        long j11 = jLongValue;
        long j12 = j10;
        this.f25466t.c();
        this.E = false;
        xq0 xq0Var3 = this.f25471y;
        v61 v61Var2 = xq0Var3.f26589a;
        int i10 = xq0Var3.f26593e;
        ns nsVar = z13 ? null : xq0Var3.f26594f;
        i71 i71Var = z14 ? i71.f21617d : xq0Var3.f26596h;
        p71 p71Var = z14 ? this.f25452f : xq0Var3.f26597i;
        List listI = z14 ? com.yandex.mobile.ads.embedded.guava.collect.p.i() : xq0Var3.f26598j;
        xq0 xq0Var4 = this.f25471y;
        this.f25471y = new xq0(v61Var2, bVar4, j12, j11, i10, nsVar, false, i71Var, p71Var, listI, bVar4, xq0Var4.f26600l, xq0Var4.f26601m, xq0Var4.f26602n, j11, 0L, j11, false);
        if (z12) {
            this.f25467u.e();
        }
    }

    private void a(boolean[] zArr) throws ns {
        ic0 ic0VarF = this.f25466t.f();
        p71 p71VarF = ic0VarF.f();
        for (int i10 = 0; i10 < this.f25448b.length; i10++) {
            if (!p71VarF.a(i10) && this.f25449c.remove(this.f25448b[i10])) {
                this.f25448b[i10].reset();
            }
        }
        for (int i11 = 0; i11 < this.f25448b.length; i11++) {
            if (p71VarF.a(i11)) {
                boolean z10 = zArr[i11];
                pv0 pv0Var = this.f25448b[i11];
                if (!b(pv0Var)) {
                    ic0 ic0VarF2 = this.f25466t.f();
                    boolean z11 = ic0VarF2 == this.f25466t.e();
                    p71 p71VarF2 = ic0VarF2.f();
                    rv0 rv0Var = p71VarF2.f23999b[i11];
                    et etVar = p71VarF2.f24000c[i11];
                    int length = etVar != null ? etVar.length() : 0;
                    yv[] yvVarArr = new yv[length];
                    for (int i12 = 0; i12 < length; i12++) {
                        yvVarArr[i12] = etVar.a(i12);
                    }
                    boolean z12 = p() && this.f25471y.f26593e == 3;
                    boolean z13 = !z10 && z12;
                    this.K++;
                    this.f25449c.add(pv0Var);
                    pv0Var.a(rv0Var, yvVarArr, ic0VarF2.f21680c[i11], this.M, z13, z11, ic0VarF2.d(), ic0VarF2.c());
                    pv0Var.a(11, new ss(this));
                    this.f25462p.b(pv0Var);
                    if (z12) {
                        pv0Var.start();
                    }
                }
            }
        }
        ic0VarF.f21684g = true;
    }

    private boolean a(v61 v61Var, nc0.b bVar) {
        if (bVar.a() || v61Var.c()) {
            return false;
        }
        v61Var.a(v61Var.a(bVar.f22012a, this.f25459m).f25848c, this.f25458l, 0L);
        if (!this.f25458l.a()) {
            return false;
        }
        v61.d dVar = this.f25458l;
        return dVar.f25869i && dVar.f25866f != -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:170:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:254:0x0413  */
    /* JADX WARN: Code duplicated, block: B:26:0x0095  */
    /* JADX WARN: Code duplicated, block: B:322:0x0520  */
    /* JADX WARN: Code duplicated, block: B:324:0x052d  */
    /* JADX WARN: Code duplicated, block: B:326:0x0535  */
    /* JADX WARN: Code duplicated, block: B:328:0x053f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:330:0x0543  */
    /* JADX WARN: Code duplicated, block: B:359:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:363:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:377:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:384:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:387:0x0602  */
    /* JADX WARN: Code duplicated, block: B:424:0x0546 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0411, code lost:
    
        if (p() == false) goto L254;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36, types: [int] */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47, types: [int] */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [int] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b() throws java.io.IOException, com.yandex.mobile.ads.impl.ns {
        /*
            Method dump skipped, instruction units count: 1665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ts.b():void");
    }

    private void b(int i10) {
        xq0 xq0Var = this.f25471y;
        if (xq0Var.f26593e != i10) {
            if (i10 != 2) {
                this.Q = -9223372036854775807L;
            }
            this.f25471y = xq0Var.a(i10);
        }
    }

    private void b(hc0 hc0Var) {
        if (this.f25466t.a(hc0Var)) {
            this.f25466t.a(this.M);
            f();
        }
    }

    private void b(zq0 zq0Var) throws ns {
        this.f25462p.a(zq0Var);
        zq0 playbackParameters = this.f25462p.getPlaybackParameters();
        a(playbackParameters, playbackParameters.f27398a, true, true);
    }

    private void b(boolean z10) throws ns {
        nc0.b bVar = this.f25466t.e().f21683f.f22375a;
        long jA = a(bVar, this.f25471y.f26606r, true, false);
        if (jA != this.f25471y.f26606r) {
            xq0 xq0Var = this.f25471y;
            this.f25471y = a(bVar, jA, xq0Var.f26591c, xq0Var.f26592d, z10, 5);
        }
    }

    private static boolean b(pv0 pv0Var) {
        return pv0Var.c() != 0;
    }

    private long c() {
        ic0 ic0VarF = this.f25466t.f();
        if (ic0VarF == null) {
            return 0L;
        }
        long jC = ic0VarF.c();
        if (!ic0VarF.f21681d) {
            return jC;
        }
        int i10 = 0;
        while (true) {
            pv0[] pv0VarArr = this.f25448b;
            if (i10 >= pv0VarArr.length) {
                return jC;
            }
            if (b(pv0VarArr[i10]) && this.f25448b[i10].g() == ic0VarF.f21680c[i10]) {
                long j10 = this.f25448b[i10].j();
                if (j10 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jC = Math.max(j10, jC);
            }
            i10++;
        }
    }

    private void c(hc0 hc0Var) throws ns {
        if (this.f25466t.a(hc0Var)) {
            ic0 ic0VarD = this.f25466t.d();
            ic0VarD.a(this.f25462p.getPlaybackParameters().f27398a, this.f25471y.f26589a);
            this.f25453g.a(this.f25448b, ic0VarD.f().f24000c);
            if (ic0VarD == this.f25466t.e()) {
                a(ic0VarD.f21683f.f22376b);
                a(new boolean[this.f25448b.length]);
                xq0 xq0Var = this.f25471y;
                nc0.b bVar = xq0Var.f26590b;
                long j10 = ic0VarD.f21683f.f22376b;
                this.f25471y = a(bVar, j10, xq0Var.f26591c, j10, false, 5);
            }
            f();
        }
    }

    private void c(hr0 hr0Var) {
        Looper looperA = hr0Var.a();
        if (looperA.getThread().isAlive()) {
            this.f25464r.a(looperA, null).a(new do1(this, hr0Var));
        } else {
            p90.d("TAG", "Trying to send message on a dead thread.");
            hr0Var.a(false);
        }
    }

    private void c(boolean z10) {
        if (z10 == this.J) {
            return;
        }
        this.J = z10;
        if (z10 || !this.f25471y.f26603o) {
            return;
        }
        this.f25455i.a(2);
    }

    private void d(boolean z10) throws ns {
        this.B = z10;
        o();
        if (!this.C || this.f25466t.f() == this.f25466t.e()) {
            return;
        }
        b(true);
        a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean e() {
        return Boolean.valueOf(this.A);
    }

    private void e(boolean z10) throws ns {
        this.G = z10;
        if (!this.f25466t.a(this.f25471y.f26589a, z10)) {
            b(true);
        }
        a(false);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    private void f() {
        boolean z10;
        ic0 ic0VarD = this.f25466t.d();
        boolean zA = false;
        if (ic0VarD != null) {
            if ((!ic0VarD.f21681d ? 0L : ic0VarD.f21678a.getNextLoadPositionUs()) == Long.MIN_VALUE) {
                z10 = false;
            } else {
                z10 = true;
            }
        } else {
            z10 = false;
        }
        if (z10) {
            ic0 ic0VarD2 = this.f25466t.d();
            long nextLoadPositionUs = !ic0VarD2.f21681d ? 0L : ic0VarD2.f21678a.getNextLoadPositionUs();
            ic0 ic0VarD3 = this.f25466t.d();
            long jMax = ic0VarD3 != null ? Math.max(0L, nextLoadPositionUs - ic0VarD3.c(this.M)) : 0L;
            if (ic0VarD2 != this.f25466t.e()) {
                long j10 = ic0VarD2.f21683f.f22376b;
            }
            zA = this.f25453g.a(jMax, this.f25462p.getPlaybackParameters().f27398a);
        }
        this.E = zA;
        if (zA) {
            this.f25466t.d().a(this.M);
        }
        s();
    }

    private void g() throws Throwable {
        a(this.f25467u.a(), true);
    }

    private void j() {
        this.f25472z.a(1);
        a(false, false, false, true);
        this.f25453g.f();
        b(this.f25471y.f26589a.c() ? 4 : 2);
        this.f25467u.a(this.f25454h.a());
        this.f25455i.a(2);
    }

    private void l() {
        a(true, false, true, false);
        this.f25453g.b();
        b(1);
        this.f25456j.quit();
        synchronized (this) {
            this.A = true;
            notifyAll();
        }
    }

    private boolean m() throws ns {
        ic0 ic0VarF = this.f25466t.f();
        p71 p71VarF = ic0VarF.f();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            pv0[] pv0VarArr = this.f25448b;
            if (i10 >= pv0VarArr.length) {
                return !z10;
            }
            pv0 pv0Var = pv0VarArr[i10];
            if (b(pv0Var)) {
                boolean z11 = pv0Var.g() != ic0VarF.f21680c[i10];
                if (!p71VarF.a(i10) || z11) {
                    if (!pv0Var.k()) {
                        et etVar = p71VarF.f24000c[i10];
                        int length = etVar != null ? etVar.length() : 0;
                        yv[] yvVarArr = new yv[length];
                        for (int i11 = 0; i11 < length; i11++) {
                            yvVarArr[i11] = etVar.a(i11);
                        }
                        pv0Var.a(yvVarArr, ic0VarF.f21680c[i10], ic0VarF.d(), ic0VarF.c());
                    } else if (pv0Var.a()) {
                        a(pv0Var);
                    } else {
                        z10 = true;
                    }
                }
            }
            i10++;
        }
    }

    private void n() throws ns {
        boolean z10;
        float f10 = this.f25462p.getPlaybackParameters().f27398a;
        ic0 ic0VarF = this.f25466t.f();
        boolean z11 = true;
        for (ic0 ic0VarE = this.f25466t.e(); ic0VarE != null && ic0VarE.f21681d; ic0VarE = ic0VarE.b()) {
            p71 p71VarB = ic0VarE.b(f10, this.f25471y.f26589a);
            p71 p71VarF = ic0VarE.f();
            if (p71VarF == null || p71VarF.f24000c.length != p71VarB.f24000c.length) {
                z10 = false;
                break;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= p71VarB.f24000c.length) {
                    z10 = true;
                    break;
                }
                if (!(da1.a(p71VarB.f23999b[i10], p71VarF.f23999b[i10]) && da1.a(p71VarB.f24000c[i10], p71VarF.f24000c[i10]))) {
                    z10 = false;
                    break;
                }
                i10++;
            }
            if (!z10) {
                lc0 lc0Var = this.f25466t;
                if (z11) {
                    ic0 ic0VarE2 = lc0Var.e();
                    boolean zA = this.f25466t.a(ic0VarE2);
                    boolean[] zArr = new boolean[this.f25448b.length];
                    long jA = ic0VarE2.a(p71VarB, this.f25471y.f26606r, zA, zArr);
                    xq0 xq0Var = this.f25471y;
                    boolean z12 = (xq0Var.f26593e == 4 || jA == xq0Var.f26606r) ? false : true;
                    xq0 xq0Var2 = this.f25471y;
                    this.f25471y = a(xq0Var2.f26590b, jA, xq0Var2.f26591c, xq0Var2.f26592d, z12, 5);
                    if (z12) {
                        a(jA);
                    }
                    boolean[] zArr2 = new boolean[this.f25448b.length];
                    int i11 = 0;
                    while (true) {
                        pv0[] pv0VarArr = this.f25448b;
                        if (i11 >= pv0VarArr.length) {
                            break;
                        }
                        pv0 pv0Var = pv0VarArr[i11];
                        boolean zB = b(pv0Var);
                        zArr2[i11] = zB;
                        fz0 fz0Var = ic0VarE2.f21680c[i11];
                        if (zB) {
                            if (fz0Var != pv0Var.g()) {
                                a(pv0Var);
                            } else if (zArr[i11]) {
                                pv0Var.a(this.M);
                            }
                        }
                        i11++;
                    }
                    a(zArr2);
                } else {
                    lc0Var.a(ic0VarE);
                    if (ic0VarE.f21681d) {
                        ic0VarE.a(p71VarB, Math.max(ic0VarE.f21683f.f22376b, ic0VarE.c(this.M)));
                    }
                }
                a(true);
                if (this.f25471y.f26593e != 4) {
                    f();
                    t();
                    this.f25455i.a(2);
                    return;
                }
                return;
            }
            if (ic0VarE == ic0VarF) {
                z11 = false;
            }
        }
    }

    private void o() {
        ic0 ic0VarE = this.f25466t.e();
        this.C = ic0VarE != null && ic0VarE.f21683f.f22382h && this.B;
    }

    private boolean p() {
        xq0 xq0Var = this.f25471y;
        return xq0Var.f26600l && xq0Var.f26601m == 0;
    }

    private void r() throws ns {
        this.f25462p.b();
        for (pv0 pv0Var : this.f25448b) {
            if (b(pv0Var) && pv0Var.c() == 2) {
                pv0Var.stop();
            }
        }
    }

    private void s() {
        ic0 ic0VarD = this.f25466t.d();
        boolean z10 = this.E || (ic0VarD != null && ic0VarD.f21678a.isLoading());
        xq0 xq0Var = this.f25471y;
        if (z10 != xq0Var.f26595g) {
            this.f25471y = new xq0(xq0Var.f26589a, xq0Var.f26590b, xq0Var.f26591c, xq0Var.f26592d, xq0Var.f26593e, xq0Var.f26594f, z10, xq0Var.f26596h, xq0Var.f26597i, xq0Var.f26598j, xq0Var.f26599k, xq0Var.f26600l, xq0Var.f26601m, xq0Var.f26602n, xq0Var.f26604p, xq0Var.f26605q, xq0Var.f26606r, xq0Var.f26603o);
        }
    }

    private void t() throws ns {
        ts tsVar;
        ts tsVar2;
        c cVar;
        long j10;
        ic0 ic0VarE = this.f25466t.e();
        if (ic0VarE == null) {
            return;
        }
        long discontinuity = ic0VarE.f21681d ? ic0VarE.f21678a.readDiscontinuity() : -9223372036854775807L;
        if (discontinuity != -9223372036854775807L) {
            a(discontinuity);
            if (discontinuity != this.f25471y.f26606r) {
                xq0 xq0Var = this.f25471y;
                this.f25471y = a(xq0Var.f26590b, discontinuity, xq0Var.f26591c, discontinuity, true, 5);
            }
            tsVar = this;
        } else {
            long jA = this.f25462p.a(ic0VarE != this.f25466t.f());
            this.M = jA;
            long jC = ic0VarE.c(jA);
            long j11 = this.f25471y.f26606r;
            if (this.f25463q.isEmpty() || this.f25471y.f26590b.a()) {
                tsVar = this;
            } else {
                if (this.O) {
                    j11--;
                    this.O = false;
                }
                xq0 xq0Var2 = this.f25471y;
                int iA = xq0Var2.f26589a.a(xq0Var2.f26590b.f22012a);
                int iMin = Math.min(this.N, this.f25463q.size());
                if (iMin > 0) {
                    cVar = this.f25463q.get(iMin - 1);
                    tsVar2 = this;
                    tsVar = tsVar2;
                } else {
                    tsVar2 = this;
                    cVar = null;
                    tsVar = this;
                }
                while (cVar != null && (iA < 0 || (iA == 0 && 0 > j11))) {
                    iMin--;
                    if (iMin > 0) {
                        cVar = tsVar2.f25463q.get(iMin - 1);
                    } else {
                        tsVar2 = tsVar2;
                        cVar = null;
                        tsVar = tsVar;
                    }
                }
                if (iMin < tsVar2.f25463q.size()) {
                    tsVar2.f25463q.get(iMin);
                }
                tsVar2.N = iMin;
            }
            tsVar.f25471y.f26606r = jC;
        }
        ic0 ic0VarD = tsVar.f25466t.d();
        xq0 xq0Var3 = tsVar.f25471y;
        if (ic0VarD.f21681d) {
            long bufferedPositionUs = ic0VarD.f21682e ? ic0VarD.f21678a.getBufferedPositionUs() : Long.MIN_VALUE;
            j10 = bufferedPositionUs == Long.MIN_VALUE ? ic0VarD.f21683f.f22379e : bufferedPositionUs;
        } else {
            j10 = ic0VarD.f21683f.f22376b;
        }
        xq0Var3.f26604p = j10;
        xq0 xq0Var4 = tsVar.f25471y;
        long j12 = xq0Var4.f26604p;
        ic0 ic0VarD2 = tsVar.f25466t.d();
        xq0Var4.f26605q = ic0VarD2 == null ? 0L : Math.max(0L, j12 - ic0VarD2.c(tsVar.M));
        xq0 xq0Var5 = tsVar.f25471y;
        if (xq0Var5.f26600l && xq0Var5.f26593e == 3 && tsVar.a(xq0Var5.f26589a, xq0Var5.f26590b)) {
            xq0 xq0Var6 = tsVar.f25471y;
            if (xq0Var6.f26602n.f27398a == 1.0f) {
                s80 s80Var = tsVar.f25468v;
                long jA2 = tsVar.a(xq0Var6.f26589a, xq0Var6.f26590b.f22012a, xq0Var6.f26606r);
                long j13 = tsVar.f25471y.f26604p;
                ic0 ic0VarD3 = tsVar.f25466t.d();
                float fA = ((co) s80Var).a(jA2, ic0VarD3 != null ? Math.max(0L, j13 - ic0VarD3.c(tsVar.M)) : 0L);
                if (tsVar.f25462p.getPlaybackParameters().f27398a != fA) {
                    tsVar.f25462p.a(new zq0(fA, tsVar.f25471y.f26602n.f27399b));
                    tsVar.a(tsVar.f25471y.f26602n, tsVar.f25462p.getPlaybackParameters().f27398a, false, false);
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.o71.a
    public final void a() {
        this.f25455i.a(10);
    }

    public final void a(int i10, long j10, i11 i11Var, ArrayList arrayList) {
        this.f25455i.a(17, new a(arrayList, i11Var, i10, j10)).a();
    }

    @Override // com.yandex.mobile.ads.impl.hc0.a
    public final void a(hc0 hc0Var) {
        this.f25455i.a(8, hc0Var).a();
    }

    @Override // com.yandex.mobile.ads.impl.y01.a
    public final void a(y01 y01Var) {
        this.f25455i.a(9, (hc0) y01Var).a();
    }

    public final void a(zq0 zq0Var) {
        this.f25455i.a(16, zq0Var).a();
    }

    public final void a(boolean z10, int i10) {
        this.f25455i.a(z10 ? 1 : 0, i10).a();
    }

    public final synchronized void b(hr0 hr0Var) {
        if (!this.A && this.f25456j.isAlive()) {
            this.f25455i.a(14, hr0Var).a();
            return;
        }
        p90.d("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        hr0Var.a(false);
    }

    public final Looper d() {
        return this.f25457k;
    }

    public final void h() {
        this.f25455i.a(22);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        ns e10;
        ic0 ic0VarF;
        IOException iOException;
        int i10 = 1000;
        try {
            switch (message.what) {
                case 0:
                    j();
                    break;
                case 1:
                    a(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    b();
                    break;
                case 3:
                    a((g) message.obj);
                    break;
                case 4:
                    b((zq0) message.obj);
                    break;
                case 5:
                    this.f25470x = (q01) message.obj;
                    break;
                case 6:
                    a(false, true);
                    break;
                case 7:
                    l();
                    return true;
                case 8:
                    c((hc0) message.obj);
                    break;
                case 9:
                    b((hc0) message.obj);
                    break;
                case 10:
                    n();
                    break;
                case 11:
                    a(message.arg1);
                    break;
                case 12:
                    e(message.arg1 != 0);
                    break;
                case 13:
                    a(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    hr0 hr0Var = (hr0) message.obj;
                    Objects.requireNonNull(hr0Var);
                    if (hr0Var.a() != this.f25457k) {
                        this.f25455i.a(15, hr0Var).a();
                    } else {
                        synchronized (hr0Var) {
                        }
                        try {
                            hr0Var.c().a(hr0Var.d(), hr0Var.b());
                            hr0Var.a(true);
                            int i11 = this.f25471y.f26593e;
                            if (i11 == 3 || i11 == 2) {
                                this.f25455i.a(2);
                            }
                        } catch (Throwable th) {
                            hr0Var.a(true);
                            throw th;
                        }
                    }
                    break;
                case 15:
                    c((hr0) message.obj);
                    break;
                case 16:
                    zq0 zq0Var = (zq0) message.obj;
                    a(zq0Var, zq0Var.f27398a, true, false);
                    break;
                case 17:
                    a((a) message.obj);
                    break;
                case 18:
                    a((a) message.obj, message.arg1);
                    break;
                case 19:
                    a((b) message.obj);
                    break;
                case 20:
                    a(message.arg1, message.arg2, (i11) message.obj);
                    break;
                case 21:
                    a((i11) message.obj);
                    break;
                case 22:
                    g();
                    break;
                case 23:
                    d(message.arg1 != 0);
                    break;
                case 24:
                    c(message.arg1 == 1);
                    break;
                case 25:
                    b(true);
                    break;
                default:
                    return false;
            }
        } catch (com.yandex.mobile.ads.exo.drm.e.a e11) {
            i10 = e11.f18493a;
            iOException = e11;
            iOException = e;
            a(iOException, i10);
        } catch (mm e12) {
            i10 = e12.f23111a;
            iOException = e12;
            iOException = e;
            a(iOException, i10);
        } catch (ns e13) {
            e10 = e13;
            if (e10.f23533c == 1 && (ic0VarF = this.f25466t.f()) != null) {
                e10 = e10.a(ic0VarF.f21683f.f22375a);
            }
            if (e10.f23539i && this.P == null) {
                p90.b("ExoPlayerImplInternal", "Recoverable renderer error", e10);
                this.P = e10;
                my myVar = this.f25455i;
                myVar.a(myVar.a(25, e10));
            } else {
                ns nsVar = this.P;
                if (nsVar != null) {
                    nsVar.addSuppressed(e10);
                    e10 = this.P;
                }
                p90.a("ExoPlayerImplInternal", "Playback error", e10);
                a(true, false);
                this.f25471y = this.f25471y.a(e10);
            }
        } catch (qp0 e14) {
            int i12 = e14.f24555b;
            if (i12 == 1) {
                if (e14.f24554a) {
                    i10 = 3001;
                    iOException = e14;
                } else {
                    i10 = AuthApiStatusCodes.AUTH_API_SERVER_ERROR;
                    iOException = e14;
                }
            } else if (i12 == 4) {
                if (e14.f24554a) {
                    iOException = e14;
                    i10 = AuthApiStatusCodes.AUTH_API_CLIENT_ERROR;
                    iOException = e14;
                } else {
                    iOException = e14;
                    i10 = AuthApiStatusCodes.AUTH_TOKEN_ERROR;
                    iOException = e14;
                }
            }
            iOException = e14;
            a(iOException, i10);
        } catch (IOException e15) {
            i10 = 2000;
            iOException = e15;
            iOException = e14;
            a(iOException, i10);
        } catch (RuntimeException e16) {
            e10 = ns.a(e16, ((e16 instanceof IllegalStateException) || (e16 instanceof IllegalArgumentException)) ? 1004 : 1000);
            p90.a("ExoPlayerImplInternal", "Playback error", e10);
            a(true, false);
            this.f25471y = this.f25471y.a(e10);
        }
        this.f25472z.a(this.f25471y);
        if (this.f25472z.f25477a) {
            this.f25465s.a(this.f25472z);
            this.f25472z = new d(this.f25471y);
        }
        return true;
    }

    public final void i() {
        this.f25455i.b(0).a();
    }

    public final synchronized boolean k() {
        boolean z10;
        if (!this.A && this.f25456j.isAlive()) {
            this.f25455i.a(7);
            long jC = this.f25469w;
            synchronized (this) {
                long jC2 = this.f25464r.c() + jC;
                boolean z11 = false;
                while (!e().booleanValue() && jC > 0) {
                    try {
                        this.f25464r.b();
                        wait(jC);
                    } catch (InterruptedException unused) {
                        z11 = true;
                    }
                    jC = jC2 - this.f25464r.c();
                }
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                z10 = this.A;
            }
            return z10;
        }
        return true;
    }

    public final void q() {
        this.f25455i.b(6).a();
    }
}
