package com.applovin.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.common.base.Supplier;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
final class s implements Handler.Callback, ah.d, ao.a, com.applovin.exoplayer2.h.n.a, com.applovin.exoplayer2.j.j.a, m.a {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private int E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private int J;
    private g K;
    private long L;
    private int M;
    private boolean N;
    private p O;
    private long P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ar[] f7952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<ar> f7953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final as[] f7954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.applovin.exoplayer2.j.j f7955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.applovin.exoplayer2.j.k f7956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final aa f7957f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.exoplayer2.k.d f7958g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.o f7959h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final HandlerThread f7960i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Looper f7961j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ba.c f7962k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ba.a f7963l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f7964m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f7965n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final m f7966o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ArrayList<c> f7967p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.d f7968q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final e f7969r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final af f7970s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ah f7971t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final z f7972u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final long f7973v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private av f7974w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private al f7975x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private d f7976y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f7977z;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<ah.c> f7979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.applovin.exoplayer2.h.z f7980b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f7981c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f7982d;

        private a(List<ah.c> list, com.applovin.exoplayer2.h.z zVar, int i10, long j10) {
            this.f7979a = list;
            this.f7980b = zVar;
            this.f7981c = i10;
            this.f7982d = j10;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f7985c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final com.applovin.exoplayer2.h.z f7986d;
    }

    public static final class c implements Comparable<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ao f7987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7988b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f7989c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f7990d;

        public c(ao aoVar) {
            this.f7987a = aoVar;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            Object obj = this.f7990d;
            if ((obj == null) != (cVar.f7990d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i10 = this.f7988b - cVar.f7988b;
            return i10 != 0 ? i10 : com.applovin.exoplayer2.l.ai.a(this.f7989c, cVar.f7989c);
        }

        public void a(int i10, long j10, Object obj) {
            this.f7988b = i10;
            this.f7989c = j10;
            this.f7990d = obj;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public al f7991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7992b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f7993c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f7994d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f7995e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f7996f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f7997g;

        public d(al alVar) {
            this.f7991a = alVar;
        }

        public void a(int i10) {
            this.f7997g |= i10 > 0;
            this.f7992b += i10;
        }

        public void a(al alVar) {
            this.f7997g |= this.f7991a != alVar;
            this.f7991a = alVar;
        }

        public void b(int i10) {
            if (this.f7993c && this.f7994d != 5) {
                com.applovin.exoplayer2.l.a.a(i10 == 5);
                return;
            }
            this.f7997g = true;
            this.f7993c = true;
            this.f7994d = i10;
        }

        public void c(int i10) {
            this.f7997g = true;
            this.f7995e = true;
            this.f7996f = i10;
        }
    }

    public interface e {
        void onPlaybackInfoUpdate(d dVar);
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.applovin.exoplayer2.h.p.a f7998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f7999b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f8000c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f8001d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f8002e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f8003f;

        public f(com.applovin.exoplayer2.h.p.a aVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f7998a = aVar;
            this.f7999b = j10;
            this.f8000c = j11;
            this.f8001d = z10;
            this.f8002e = z11;
            this.f8003f = z12;
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ba f8004a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8005b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f8006c;

        public g(ba baVar, int i10, long j10) {
            this.f8004a = baVar;
            this.f8005b = i10;
            this.f8006c = j10;
        }
    }

    public s(ar[] arVarArr, com.applovin.exoplayer2.j.j jVar, com.applovin.exoplayer2.j.k kVar, aa aaVar, com.applovin.exoplayer2.k.d dVar, int i10, boolean z10, com.applovin.exoplayer2.a.a aVar, av avVar, z zVar, long j10, boolean z11, Looper looper, com.applovin.exoplayer2.l.d dVar2, e eVar) {
        this.f7969r = eVar;
        this.f7952a = arVarArr;
        this.f7955d = jVar;
        this.f7956e = kVar;
        this.f7957f = aaVar;
        this.f7958g = dVar;
        this.E = i10;
        this.F = z10;
        this.f7974w = avVar;
        this.f7972u = zVar;
        this.f7973v = j10;
        this.P = j10;
        this.A = z11;
        this.f7968q = dVar2;
        this.f7964m = aaVar.e();
        this.f7965n = aaVar.f();
        al alVarA = al.a(kVar);
        this.f7975x = alVarA;
        this.f7976y = new d(alVarA);
        this.f7954c = new as[arVarArr.length];
        for (int i11 = 0; i11 < arVarArr.length; i11++) {
            arVarArr[i11].a(i11);
            this.f7954c[i11] = arVarArr[i11].b();
        }
        this.f7966o = new m(this, dVar2);
        this.f7967p = new ArrayList<>();
        this.f7953b = com.applovin.exoplayer2.common.a.aq.b();
        this.f7962k = new ba.c();
        this.f7963l = new ba.a();
        jVar.a(this, dVar);
        this.N = true;
        Handler handler = new Handler(looper);
        this.f7970s = new af(aVar, handler);
        this.f7971t = new ah(this, aVar, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f7960i = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f7961j = looper2;
        this.f7959h = dVar2.a(looper2, this);
    }

    private void A() {
        ad adVarC = this.f7970s.c();
        this.B = adVarC != null && adVarC.f4169f.f4186h && this.A;
    }

    private boolean B() {
        ad adVarC;
        ad adVarG;
        return J() && !this.B && (adVarC = this.f7970s.c()) != null && (adVarG = adVarC.g()) != null && this.L >= adVarG.b() && adVarG.f4170g;
    }

    private boolean C() {
        ad adVarD = this.f7970s.d();
        if (!adVarD.f4167d) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ar[] arVarArr = this.f7952a;
            if (i10 >= arVarArr.length) {
                return true;
            }
            ar arVar = arVarArr[i10];
            com.applovin.exoplayer2.h.x xVar = adVarD.f4166c[i10];
            if (arVar.f() != xVar || (xVar != null && !arVar.g() && !a(arVar, adVarD))) {
                return false;
            }
            i10++;
        }
    }

    private void D() {
        boolean zE = E();
        this.D = zE;
        if (zE) {
            this.f7970s.b().e(this.L);
        }
        G();
    }

    private boolean E() {
        if (!F()) {
            return false;
        }
        ad adVarB = this.f7970s.b();
        return this.f7957f.a(adVarB == this.f7970s.c() ? adVarB.b(this.L) : adVarB.b(this.L) - adVarB.f4169f.f4180b, d(adVarB.e()), this.f7966o.d().f4253b);
    }

    private boolean F() {
        ad adVarB = this.f7970s.b();
        return (adVarB == null || adVarB.e() == Long.MIN_VALUE) ? false : true;
    }

    private void G() {
        ad adVarB = this.f7970s.b();
        boolean z10 = this.D || (adVarB != null && adVarB.f4164a.f());
        al alVar = this.f7975x;
        if (z10 != alVar.f4238g) {
            this.f7975x = alVar.a(z10);
        }
    }

    private void H() throws p {
        a(new boolean[this.f7952a.length]);
    }

    private long I() {
        return d(this.f7975x.f4248q);
    }

    private boolean J() {
        al alVar = this.f7975x;
        return alVar.f4243l && alVar.f4244m == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean K() {
        return Boolean.valueOf(this.f7977z);
    }

    private long a(ba baVar, Object obj, long j10) {
        baVar.a(baVar.a(obj, this.f7963l).f4678c, this.f7962k);
        ba.c cVar = this.f7962k;
        if (cVar.f4696g != -9223372036854775807L && cVar.e()) {
            ba.c cVar2 = this.f7962k;
            if (cVar2.f4699j) {
                return h.b(cVar2.d() - this.f7962k.f4696g) - (this.f7963l.c() + j10);
            }
        }
        return -9223372036854775807L;
    }

    private long a(com.applovin.exoplayer2.h.p.a aVar, long j10, boolean z10) throws p {
        return a(aVar, j10, this.f7970s.c() != this.f7970s.d(), z10);
    }

    private long a(com.applovin.exoplayer2.h.p.a aVar, long j10, boolean z10, boolean z11) throws p {
        j();
        this.C = false;
        if (z11 || this.f7975x.f4236e == 3) {
            b(2);
        }
        ad adVarC = this.f7970s.c();
        ad adVarG = adVarC;
        while (adVarG != null && !aVar.equals(adVarG.f4169f.f4179a)) {
            adVarG = adVarG.g();
        }
        if (z10 || adVarC != adVarG || (adVarG != null && adVarG.a(j10) < 0)) {
            for (ar arVar : this.f7952a) {
                b(arVar);
            }
            if (adVarG != null) {
                while (this.f7970s.c() != adVarG) {
                    this.f7970s.f();
                }
                this.f7970s.a(adVarG);
                adVarG.c(0L);
                H();
            }
        }
        af afVar = this.f7970s;
        if (adVarG != null) {
            afVar.a(adVarG);
            if (!adVarG.f4167d) {
                adVarG.f4169f = adVarG.f4169f.a(j10);
            } else if (adVarG.f4168e) {
                long jB = adVarG.f4164a.b(j10);
                adVarG.f4164a.a(jB - this.f7964m, this.f7965n);
                j10 = jB;
            }
            b(j10);
            D();
        } else {
            afVar.g();
            b(j10);
        }
        h(false);
        this.f7959h.c(2);
        return j10;
    }

    private Pair<com.applovin.exoplayer2.h.p.a, Long> a(ba baVar) {
        if (baVar.d()) {
            return Pair.create(al.a(), 0L);
        }
        Pair<Object, Long> pairA = baVar.a(this.f7962k, this.f7963l, baVar.b(this.F), -9223372036854775807L);
        com.applovin.exoplayer2.h.p.a aVarA = this.f7970s.a(baVar, pairA.first, 0L);
        long jLongValue = ((Long) pairA.second).longValue();
        if (aVarA.a()) {
            baVar.a(aVarA.f6608a, this.f7963l);
            jLongValue = aVarA.f6610c == this.f7963l.b(aVarA.f6609b) ? this.f7963l.f() : 0L;
        }
        return Pair.create(aVarA, Long.valueOf(jLongValue));
    }

    private static Pair<Object, Long> a(ba baVar, g gVar, boolean z10, int i10, boolean z11, ba.c cVar, ba.a aVar) {
        Object objA;
        ba baVar2 = gVar.f8004a;
        if (baVar.d()) {
            return null;
        }
        ba baVar3 = baVar2.d() ? baVar : baVar2;
        try {
            Pair<Object, Long> pairA = baVar3.a(cVar, aVar, gVar.f8005b, gVar.f8006c);
            if (baVar.equals(baVar3)) {
                return pairA;
            }
            if (baVar.c(pairA.first) != -1) {
                return (baVar3.a(pairA.first, aVar).f4681f && baVar3.a(aVar.f4678c, cVar).f4705p == baVar3.c(pairA.first)) ? baVar.a(cVar, aVar, baVar.a(pairA.first, aVar).f4678c, gVar.f8006c) : pairA;
            }
            if (z10 && (objA = a(cVar, aVar, i10, z11, pairA.first, baVar3, baVar)) != null) {
                return baVar.a(cVar, aVar, baVar.a(objA, aVar).f4678c, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    private al a(com.applovin.exoplayer2.h.p.a aVar, long j10, long j11, long j12, boolean z10, int i10) {
        List<com.applovin.exoplayer2.g.a> listG;
        com.applovin.exoplayer2.h.ad adVar;
        com.applovin.exoplayer2.j.k kVar;
        this.N = (!this.N && j10 == this.f7975x.f4250s && aVar.equals(this.f7975x.f4233b)) ? false : true;
        A();
        al alVar = this.f7975x;
        com.applovin.exoplayer2.h.ad adVar2 = alVar.f4239h;
        com.applovin.exoplayer2.j.k kVar2 = alVar.f4240i;
        List<com.applovin.exoplayer2.g.a> list = alVar.f4241j;
        if (this.f7971t.a()) {
            ad adVarC = this.f7970s.c();
            com.applovin.exoplayer2.h.ad adVarH = adVarC == null ? com.applovin.exoplayer2.h.ad.f6509a : adVarC.h();
            com.applovin.exoplayer2.j.k kVarI = adVarC == null ? this.f7956e : adVarC.i();
            com.applovin.exoplayer2.common.a.s<com.applovin.exoplayer2.g.a> sVarA = a(kVarI.f7307c);
            if (adVarC != null) {
                ae aeVar = adVarC.f4169f;
                if (aeVar.f4181c != j11) {
                    adVarC.f4169f = aeVar.b(j11);
                }
            }
            adVar = adVarH;
            kVar = kVarI;
            listG = sVarA;
        } else if (aVar.equals(this.f7975x.f4233b)) {
            listG = list;
            adVar = adVar2;
            kVar = kVar2;
        } else {
            adVar = com.applovin.exoplayer2.h.ad.f6509a;
            kVar = this.f7956e;
            listG = com.applovin.exoplayer2.common.a.s.g();
        }
        if (z10) {
            this.f7976y.b(i10);
        }
        return this.f7975x.a(aVar, j10, j11, j12, I(), adVar, kVar, listG);
    }

    private com.applovin.exoplayer2.common.a.s<com.applovin.exoplayer2.g.a> a(com.applovin.exoplayer2.j.d[] dVarArr) {
        com.applovin.exoplayer2.common.a.s.a aVar = new com.applovin.exoplayer2.common.a.s.a();
        boolean z10 = false;
        for (com.applovin.exoplayer2.j.d dVar : dVarArr) {
            if (dVar != null) {
                com.applovin.exoplayer2.g.a aVar2 = dVar.a(0).f8196j;
                if (aVar2 == null) {
                    aVar.a(new com.applovin.exoplayer2.g.a(new com.applovin.exoplayer2.g.a.InterfaceC0092a[0]));
                } else {
                    aVar.a(aVar2);
                    z10 = true;
                }
            }
        }
        return z10 ? aVar.a() : com.applovin.exoplayer2.common.a.s.g();
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0157  */
    /* JADX WARN: Code duplicated, block: B:51:0x0175  */
    /* JADX WARN: Code duplicated, block: B:60:0x018d  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:89:0x01de  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:95:0x01fb  */
    private static f a(ba baVar, al alVar, g gVar, af afVar, int i10, boolean z10, ba.c cVar, ba.a aVar) {
        com.applovin.exoplayer2.h.p.a aVar2;
        int i11;
        com.applovin.exoplayer2.h.p.a aVar3;
        int i12;
        long jLongValue;
        boolean z11;
        boolean z12;
        boolean z13;
        int iB;
        int iB2;
        boolean z14;
        long j10;
        com.applovin.exoplayer2.h.p.a aVarA;
        boolean z15;
        boolean zEquals;
        boolean z16;
        int i13;
        int iB3;
        boolean z17;
        boolean z18;
        boolean z19;
        if (baVar.d()) {
            return new f(al.a(), 0L, -9223372036854775807L, false, true, false);
        }
        com.applovin.exoplayer2.h.p.a aVar4 = alVar.f4233b;
        Object obj = aVar4.f6608a;
        boolean zA = a(alVar, aVar);
        long j11 = (alVar.f4233b.a() || zA) ? alVar.f4234c : alVar.f4250s;
        boolean z20 = false;
        if (gVar != null) {
            aVar2 = aVar4;
            i11 = -1;
            Pair<Object, Long> pairA = a(baVar, gVar, true, i10, z10, cVar, aVar);
            if (pairA == null) {
                iB3 = baVar.b(z10);
                jLongValue = j11;
                z17 = false;
                z18 = false;
                z19 = true;
            } else {
                if (gVar.f8006c == -9223372036854775807L) {
                    iB3 = baVar.a(pairA.first, aVar).f4678c;
                    jLongValue = j11;
                    z17 = false;
                } else {
                    obj = pairA.first;
                    jLongValue = ((Long) pairA.second).longValue();
                    iB3 = -1;
                    z17 = true;
                }
                z18 = alVar.f4236e == 4;
                z19 = false;
            }
            z13 = z17;
            z11 = z18;
            z12 = z19;
            i12 = iB3;
        } else {
            aVar2 = aVar4;
            i11 = -1;
            if (!alVar.f4232a.d()) {
                if (baVar.c(obj) == -1) {
                    Object objA = a(cVar, aVar, i10, z10, obj, alVar.f4232a, baVar);
                    if (objA == null) {
                        iB2 = baVar.b(z10);
                        z14 = true;
                    } else {
                        iB2 = baVar.a(objA, aVar).f4678c;
                        z14 = false;
                    }
                    i12 = iB2;
                    z12 = z14;
                    jLongValue = j11;
                    z11 = false;
                    z13 = false;
                } else if (j11 == -9223372036854775807L) {
                    iB = baVar.a(obj, aVar).f4678c;
                } else if (zA) {
                    aVar3 = aVar2;
                    alVar.f4232a.a(aVar3.f6608a, aVar);
                    if (alVar.f4232a.a(aVar.f4678c, cVar).f4705p == alVar.f4232a.c(aVar3.f6608a)) {
                        Pair<Object, Long> pairA2 = baVar.a(cVar, aVar, baVar.a(obj, aVar).f4678c, aVar.c() + j11);
                        obj = pairA2.first;
                        jLongValue = ((Long) pairA2.second).longValue();
                    } else {
                        jLongValue = j11;
                    }
                    i12 = -1;
                    z11 = false;
                    z12 = false;
                    z13 = true;
                } else {
                    aVar3 = aVar2;
                    i12 = -1;
                    jLongValue = j11;
                    z11 = false;
                    z12 = false;
                    z13 = false;
                }
                if (i12 != i11) {
                    Pair<Object, Long> pairA3 = baVar.a(cVar, aVar, i12, -9223372036854775807L);
                    obj = pairA3.first;
                    jLongValue = ((Long) pairA3.second).longValue();
                    j10 = -9223372036854775807L;
                } else {
                    j10 = jLongValue;
                }
                aVarA = afVar.a(baVar, obj, jLongValue);
                if (aVarA.f6612e != i11 || ((i13 = aVar3.f6612e) != i11 && aVarA.f6609b >= i13)) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zEquals = aVar3.f6608a.equals(obj);
                if (zEquals || aVar3.a() || aVarA.a() || !z15) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                baVar.a(obj, aVar);
                if (zEquals && !zA && j11 == j10 && ((aVarA.a() && aVar.e(aVarA.f6609b)) || (aVar3.a() && aVar.e(aVar3.f6609b)))) {
                    z20 = true;
                }
                if (z16 || z20) {
                    aVarA = aVar3;
                }
                if (aVarA.a()) {
                    if (aVarA.equals(aVar3)) {
                        jLongValue = alVar.f4250s;
                    } else {
                        baVar.a(aVarA.f6608a, aVar);
                        if (aVarA.f6610c == aVar.b(aVarA.f6609b)) {
                            jLongValue = aVar.f();
                        } else {
                            jLongValue = 0;
                        }
                    }
                }
                return new f(aVarA, jLongValue, j10, z11, z12, z13);
            }
            iB = baVar.b(z10);
            i12 = iB;
            jLongValue = j11;
            z11 = false;
            z12 = false;
            z13 = false;
        }
        aVar3 = aVar2;
        if (i12 != i11) {
            Pair<Object, Long> pairA4 = baVar.a(cVar, aVar, i12, -9223372036854775807L);
            obj = pairA4.first;
            jLongValue = ((Long) pairA4.second).longValue();
            j10 = -9223372036854775807L;
        } else {
            j10 = jLongValue;
        }
        aVarA = afVar.a(baVar, obj, jLongValue);
        if (aVarA.f6612e != i11) {
            z15 = true;
        } else {
            z15 = true;
        }
        zEquals = aVar3.f6608a.equals(obj);
        if (zEquals) {
            z16 = false;
        } else {
            z16 = false;
        }
        baVar.a(obj, aVar);
        if (zEquals) {
            z20 = true;
        }
        if (z16) {
            aVarA = aVar3;
        } else {
            aVarA = aVar3;
        }
        if (aVarA.a()) {
            if (aVarA.equals(aVar3)) {
                jLongValue = alVar.f4250s;
            } else {
                baVar.a(aVarA.f6608a, aVar);
                if (aVarA.f6610c == aVar.b(aVarA.f6609b)) {
                    jLongValue = aVar.f();
                } else {
                    jLongValue = 0;
                }
            }
        }
        return new f(aVarA, jLongValue, j10, z11, z12, z13);
    }

    public static Object a(ba.c cVar, ba.a aVar, int i10, boolean z10, Object obj, ba baVar, ba baVar2) {
        int iC = baVar.c(obj);
        int iC2 = baVar.c();
        int iA = iC;
        int iC3 = -1;
        for (int i11 = 0; i11 < iC2 && iC3 == -1; i11++) {
            iA = baVar.a(iA, aVar, cVar, i10, z10);
            if (iA == -1) {
                break;
            }
            iC3 = baVar2.c(baVar.a(iA));
        }
        if (iC3 == -1) {
            return null;
        }
        return baVar2.a(iC3);
    }

    private void a(float f10) {
        for (ad adVarC = this.f7970s.c(); adVarC != null; adVarC = adVarC.g()) {
            for (com.applovin.exoplayer2.j.d dVar : adVarC.i().f7307c) {
                if (dVar != null) {
                    dVar.a(f10);
                }
            }
        }
    }

    private void a(int i10, boolean z10) throws p {
        ar arVar = this.f7952a[i10];
        if (c(arVar)) {
            return;
        }
        ad adVarD = this.f7970s.d();
        boolean z11 = adVarD == this.f7970s.c();
        com.applovin.exoplayer2.j.k kVarI = adVarD.i();
        at atVar = kVarI.f7306b[i10];
        v[] vVarArrA = a(kVarI.f7307c[i10]);
        boolean z12 = J() && this.f7975x.f4236e == 3;
        boolean z13 = !z10 && z12;
        this.J++;
        this.f7953b.add(arVar);
        arVar.a(atVar, vVarArrA, adVarD.f4166c[i10], this.L, z13, z11, adVarD.b(), adVarD.a());
        arVar.a(11, new ar.a() { // from class: com.applovin.exoplayer2.s.1
            @Override // com.applovin.exoplayer2.ar.a
            public void a() {
                s.this.f7959h.c(2);
            }

            @Override // com.applovin.exoplayer2.ar.a
            public void a(long j10) {
                if (j10 >= 2000) {
                    s.this.H = true;
                }
            }
        });
        this.f7966o.a(arVar);
        if (z12) {
            arVar.e();
        }
    }

    private void a(long j10, long j11) {
        this.f7959h.d(2);
        this.f7959h.a(2, j10 + j11);
    }

    private void a(am amVar, float f10, boolean z10, boolean z11) throws p {
        if (z10) {
            if (z11) {
                this.f7976y.a(1);
            }
            this.f7975x = this.f7975x.a(amVar);
        }
        a(amVar.f4253b);
        for (ar arVar : this.f7952a) {
            if (arVar != null) {
                arVar.a(f10, amVar.f4253b);
            }
        }
    }

    private void a(am amVar, boolean z10) throws p {
        a(amVar, amVar.f4253b, true, z10);
    }

    private void a(ar arVar) throws p {
        if (arVar.d_() == 2) {
            arVar.l();
        }
    }

    private void a(ar arVar, long j10) {
        arVar.i();
        if (arVar instanceof com.applovin.exoplayer2.i.m) {
            ((com.applovin.exoplayer2.i.m) arVar).c(j10);
        }
    }

    private void a(av avVar) {
        this.f7974w = avVar;
    }

    private void a(ba baVar, ba baVar2) {
        if (baVar.d() && baVar2.d()) {
            return;
        }
        for (int size = this.f7967p.size() - 1; size >= 0; size--) {
            if (!a(this.f7967p.get(size), baVar, baVar2, this.E, this.F, this.f7962k, this.f7963l)) {
                this.f7967p.get(size).f7987a.a(false);
                this.f7967p.remove(size);
            }
        }
        Collections.sort(this.f7967p);
    }

    private void a(ba baVar, com.applovin.exoplayer2.h.p.a aVar, ba baVar2, com.applovin.exoplayer2.h.p.a aVar2, long j10) {
        if (baVar.d() || !a(baVar, aVar)) {
            float f10 = this.f7966o.d().f4253b;
            am amVar = this.f7975x.f4245n;
            if (f10 != amVar.f4253b) {
                this.f7966o.a(amVar);
                return;
            }
            return;
        }
        baVar.a(baVar.a(aVar.f6608a, this.f7963l).f4678c, this.f7962k);
        this.f7972u.a((ab.e) com.applovin.exoplayer2.l.ai.a(this.f7962k.f4701l));
        if (j10 != -9223372036854775807L) {
            this.f7972u.a(a(baVar, aVar.f6608a, j10));
            return;
        }
        if (com.applovin.exoplayer2.l.ai.a(baVar2.d() ? null : baVar2.a(baVar2.a(aVar2.f6608a, this.f7963l).f4678c, this.f7962k).f4691b, this.f7962k.f4691b)) {
            return;
        }
        this.f7972u.a(-9223372036854775807L);
    }

    private static void a(ba baVar, c cVar, ba.c cVar2, ba.a aVar) {
        int i10 = baVar.a(baVar.a(cVar.f7990d, aVar).f4678c, cVar2).f4706q;
        Object obj = baVar.a(i10, aVar, true).f4677b;
        long j10 = aVar.f4679d;
        cVar.a(i10, j10 != -9223372036854775807L ? j10 - 1 : RecyclerView.FOREVER_NS, obj);
    }

    private void a(ba baVar, boolean z10) throws Throwable {
        int i10;
        int i11;
        boolean z11;
        f fVarA = a(baVar, this.f7975x, this.K, this.f7970s, this.E, this.F, this.f7962k, this.f7963l);
        com.applovin.exoplayer2.h.p.a aVar = fVarA.f7998a;
        long j10 = fVarA.f8000c;
        boolean z12 = fVarA.f8001d;
        long jA = fVarA.f7999b;
        boolean z13 = (this.f7975x.f4233b.equals(aVar) && jA == this.f7975x.f4250s) ? false : true;
        g gVar = null;
        try {
            if (fVarA.f8002e) {
                if (this.f7975x.f4236e != 1) {
                    b(4);
                }
                a(false, false, false, true);
            }
            try {
                if (z13) {
                    i11 = 4;
                    z11 = false;
                    if (!baVar.d()) {
                        for (ad adVarC = this.f7970s.c(); adVarC != null; adVarC = adVarC.g()) {
                            if (adVarC.f4169f.f4179a.equals(aVar)) {
                                adVarC.f4169f = this.f7970s.a(baVar, adVarC.f4169f);
                                adVarC.j();
                            }
                        }
                        jA = a(aVar, jA, z12);
                    }
                } else {
                    try {
                        i11 = 4;
                        z11 = false;
                        if (!this.f7970s.a(baVar, this.L, t())) {
                            f(false);
                        }
                    } catch (Throwable th) {
                        th = th;
                        i10 = 4;
                        al alVar = this.f7975x;
                        g gVar2 = gVar;
                        a(baVar, aVar, alVar.f4232a, alVar.f4233b, fVarA.f8003f ? jA : -9223372036854775807L);
                        if (z13 || j10 != this.f7975x.f4234c) {
                            al alVar2 = this.f7975x;
                            Object obj = alVar2.f4233b.f6608a;
                            ba baVar2 = alVar2.f4232a;
                            this.f7975x = a(aVar, jA, j10, this.f7975x.f4235d, z13 && z10 && !baVar2.d() && !baVar2.a(obj, this.f7963l).f4681f, baVar.c(obj) == -1 ? i10 : 3);
                        }
                        A();
                        a(baVar, this.f7975x.f4232a);
                        this.f7975x = this.f7975x.a(baVar);
                        if (!baVar.d()) {
                            this.K = gVar2;
                        }
                        h(false);
                        throw th;
                    }
                }
                al alVar3 = this.f7975x;
                a(baVar, aVar, alVar3.f4232a, alVar3.f4233b, fVarA.f8003f ? jA : -9223372036854775807L);
                if (z13 || j10 != this.f7975x.f4234c) {
                    al alVar4 = this.f7975x;
                    Object obj2 = alVar4.f4233b.f6608a;
                    ba baVar3 = alVar4.f4232a;
                    this.f7975x = a(aVar, jA, j10, this.f7975x.f4235d, (!z13 || !z10 || baVar3.d() || baVar3.a(obj2, this.f7963l).f4681f) ? z11 : true, baVar.c(obj2) == -1 ? i11 : 3);
                }
                A();
                a(baVar, this.f7975x.f4232a);
                this.f7975x = this.f7975x.a(baVar);
                if (!baVar.d()) {
                    this.K = null;
                }
                h(z11);
            } catch (Throwable th2) {
                th = th2;
                gVar = null;
            }
        } catch (Throwable th3) {
            th = th3;
            i10 = 4;
        }
    }

    private synchronized void a(Supplier<Boolean> supplier, long j10) {
        long jA = this.f7968q.a() + j10;
        boolean z10 = false;
        while (!supplier.get().booleanValue() && j10 > 0) {
            try {
                this.f7968q.c();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j10 = jA - this.f7968q.a();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private void a(com.applovin.exoplayer2.h.ad adVar, com.applovin.exoplayer2.j.k kVar) {
        this.f7957f.a(this.f7952a, adVar, kVar.f7307c);
    }

    private void a(com.applovin.exoplayer2.h.z zVar) throws Throwable {
        this.f7976y.a(1);
        a(this.f7971t.a(zVar), false);
    }

    private void a(a aVar) throws Throwable {
        this.f7976y.a(1);
        if (aVar.f7981c != -1) {
            this.K = new g(new ap(aVar.f7979a, aVar.f7980b), aVar.f7981c, aVar.f7982d);
        }
        a(this.f7971t.a(aVar.f7979a, aVar.f7980b), false);
    }

    private void a(a aVar, int i10) throws Throwable {
        this.f7976y.a(1);
        ah ahVar = this.f7971t;
        if (i10 == -1) {
            i10 = ahVar.b();
        }
        a(ahVar.a(i10, aVar.f7979a, aVar.f7980b), false);
    }

    private void a(b bVar) throws Throwable {
        this.f7976y.a(1);
        a(this.f7971t.a(bVar.f7983a, bVar.f7984b, bVar.f7985c, bVar.f7986d), false);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00ac A[Catch: all -> 0x0148, TryCatch #1 {all -> 0x0148, blocks: (B:22:0x00a2, B:24:0x00ac, B:27:0x00b2, B:29:0x00b8, B:30:0x00bb, B:32:0x00c1, B:34:0x00cb, B:36:0x00d3, B:40:0x00db, B:42:0x00e5, B:44:0x00f5, B:48:0x00ff, B:52:0x0111, B:56:0x011a), top: B:74:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00af  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b2 A[Catch: all -> 0x0148, TryCatch #1 {all -> 0x0148, blocks: (B:22:0x00a2, B:24:0x00ac, B:27:0x00b2, B:29:0x00b8, B:30:0x00bb, B:32:0x00c1, B:34:0x00cb, B:36:0x00d3, B:40:0x00db, B:42:0x00e5, B:44:0x00f5, B:48:0x00ff, B:52:0x0111, B:56:0x011a), top: B:74:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b8 A[Catch: all -> 0x0148, TryCatch #1 {all -> 0x0148, blocks: (B:22:0x00a2, B:24:0x00ac, B:27:0x00b2, B:29:0x00b8, B:30:0x00bb, B:32:0x00c1, B:34:0x00cb, B:36:0x00d3, B:40:0x00db, B:42:0x00e5, B:44:0x00f5, B:48:0x00ff, B:52:0x0111, B:56:0x011a), top: B:74:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c1 A[Catch: all -> 0x0148, TryCatch #1 {all -> 0x0148, blocks: (B:22:0x00a2, B:24:0x00ac, B:27:0x00b2, B:29:0x00b8, B:30:0x00bb, B:32:0x00c1, B:34:0x00cb, B:36:0x00d3, B:40:0x00db, B:42:0x00e5, B:44:0x00f5, B:48:0x00ff, B:52:0x0111, B:56:0x011a), top: B:74:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00cb A[Catch: all -> 0x0148, TryCatch #1 {all -> 0x0148, blocks: (B:22:0x00a2, B:24:0x00ac, B:27:0x00b2, B:29:0x00b8, B:30:0x00bb, B:32:0x00c1, B:34:0x00cb, B:36:0x00d3, B:40:0x00db, B:42:0x00e5, B:44:0x00f5, B:48:0x00ff, B:52:0x0111, B:56:0x011a), top: B:74:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:51:0x0110  */
    /* JADX WARN: Code duplicated, block: B:54:0x0117  */
    /* JADX WARN: Code duplicated, block: B:55:0x0119  */
    /* JADX WARN: Code duplicated, block: B:60:0x0123  */
    private void a(g gVar) throws Throwable {
        long jLongValue;
        long j10;
        boolean z10;
        com.applovin.exoplayer2.h.p.a aVar;
        long jF;
        long j11;
        long j12;
        long jA;
        boolean z11;
        long jA2;
        boolean z12;
        long j13;
        ad adVarC;
        al alVar;
        int i10;
        this.f7976y.a(1);
        Pair<Object, Long> pairA = a(this.f7975x.f4232a, gVar, true, this.E, this.F, this.f7962k, this.f7963l);
        try {
            if (pairA != null) {
                Object obj = pairA.first;
                jLongValue = ((Long) pairA.second).longValue();
                long j14 = gVar.f8006c == -9223372036854775807L ? -9223372036854775807L : jLongValue;
                com.applovin.exoplayer2.h.p.a aVarA = this.f7970s.a(this.f7975x.f4232a, obj, jLongValue);
                if (aVarA.a()) {
                    this.f7975x.f4232a.a(aVarA.f6608a, this.f7963l);
                    jF = this.f7963l.b(aVarA.f6609b) == aVarA.f6610c ? this.f7963l.f() : 0L;
                    j11 = j14;
                    aVar = aVarA;
                    z10 = true;
                } else {
                    j10 = j14;
                    z10 = gVar.f8006c == -9223372036854775807L;
                    aVar = aVarA;
                }
                if (this.f7975x.f4232a.d()) {
                    if (pairA == null) {
                        if (this.f7975x.f4236e != 1) {
                            b(4);
                        }
                        a(false, true, false, true);
                    } else {
                        if (aVar.equals(this.f7975x.f4233b)) {
                            adVarC = this.f7970s.c();
                            if (adVarC == null && adVarC.f4167d && jF != 0) {
                                jA = adVarC.f4164a.a(jF, this.f7974w);
                            } else {
                                jA = jF;
                            }
                            if (h.a(jA) == h.a(this.f7975x.f4250s) && ((i10 = (alVar = this.f7975x).f4236e) == 2 || i10 == 3)) {
                                long j15 = alVar.f4250s;
                                this.f7975x = a(aVar, j15, j11, j15, z10, 2);
                                return;
                            }
                        } else {
                            jA = jF;
                        }
                        if (this.f7975x.f4236e == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        jA2 = a(aVar, jA, z11);
                        z12 = (jF != jA2) | z10;
                        try {
                            al alVar2 = this.f7975x;
                            ba baVar = alVar2.f4232a;
                            a(baVar, aVar, baVar, alVar2.f4233b, j11);
                            z10 = z12;
                            j13 = jA2;
                        } catch (Throwable th) {
                            th = th;
                            z10 = z12;
                            j12 = jA2;
                            this.f7975x = a(aVar, j12, j11, j12, z10, 2);
                            throw th;
                        }
                    }
                    this.f7975x = a(aVar, j13, j11, j13, z10, 2);
                    return;
                }
                this.K = gVar;
                j13 = jF;
                this.f7975x = a(aVar, j13, j11, j13, z10, 2);
                return;
            }
            Pair<com.applovin.exoplayer2.h.p.a, Long> pairA2 = a(this.f7975x.f4232a);
            aVar = (com.applovin.exoplayer2.h.p.a) pairA2.first;
            jLongValue = ((Long) pairA2.second).longValue();
            z10 = !this.f7975x.f4232a.d();
            j10 = -9223372036854775807L;
            if (this.f7975x.f4232a.d()) {
                if (pairA == null) {
                    if (this.f7975x.f4236e != 1) {
                        b(4);
                    }
                    a(false, true, false, true);
                } else {
                    if (aVar.equals(this.f7975x.f4233b)) {
                        adVarC = this.f7970s.c();
                        if (adVarC == null) {
                            jA = jF;
                        } else {
                            jA = jF;
                        }
                        if (h.a(jA) == h.a(this.f7975x.f4250s)) {
                            long j16 = alVar.f4250s;
                            this.f7975x = a(aVar, j16, j11, j16, z10, 2);
                            return;
                        }
                    } else {
                        jA = jF;
                    }
                    if (this.f7975x.f4236e == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    jA2 = a(aVar, jA, z11);
                    z12 = (jF != jA2) | z10;
                    al alVar3 = this.f7975x;
                    ba baVar2 = alVar3.f4232a;
                    a(baVar2, aVar, baVar2, alVar3.f4233b, j11);
                    z10 = z12;
                    j13 = jA2;
                }
                this.f7975x = a(aVar, j13, j11, j13, z10, 2);
                return;
            }
            this.K = gVar;
            j13 = jF;
            this.f7975x = a(aVar, j13, j11, j13, z10, 2);
            return;
        } catch (Throwable th2) {
            th = th2;
            j12 = jF;
        }
        jF = jLongValue;
        j11 = j10;
    }

    private void a(IOException iOException, int i10) {
        p pVarA = p.a(iOException, i10);
        ad adVarC = this.f7970s.c();
        if (adVarC != null) {
            pVarA = pVarA.a(adVarC.f4169f.f4179a);
        }
        com.applovin.exoplayer2.l.q.c("ExoPlayerImplInternal", "Playback error", pVarA);
        a(false, false);
        this.f7975x = this.f7975x.a(pVarA);
    }

    private void a(boolean z10, int i10, boolean z11, int i11) throws p {
        this.f7976y.a(z11 ? 1 : 0);
        this.f7976y.c(i11);
        this.f7975x = this.f7975x.a(z10, i10);
        this.C = false;
        b(z10);
        if (!J()) {
            j();
            l();
            return;
        }
        int i12 = this.f7975x.f4236e;
        if (i12 == 3) {
            i();
        } else if (i12 != 2) {
            return;
        }
        this.f7959h.c(2);
    }

    private void a(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.G != z10) {
            this.G = z10;
            if (!z10) {
                for (ar arVar : this.f7952a) {
                    if (!c(arVar) && this.f7953b.remove(arVar)) {
                        arVar.n();
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
        a(z10 || !this.G, false, true, false);
        this.f7976y.a(z11 ? 1 : 0);
        this.f7957f.b();
        b(1);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009f A[PHI: r4 r5 r7
  0x009f: PHI (r4v3 com.applovin.exoplayer2.h.p$a) = (r4v2 com.applovin.exoplayer2.h.p$a), (r4v9 com.applovin.exoplayer2.h.p$a) binds: [B:30:0x0076, B:32:0x009b] A[DONT_GENERATE, DONT_INLINE]
  0x009f: PHI (r5v2 long) = (r5v1 long), (r5v5 long) binds: [B:30:0x0076, B:32:0x009b] A[DONT_GENERATE, DONT_INLINE]
  0x009f: PHI (r7v3 long) = (r7v2 long), (r7v5 long) binds: [B:30:0x0076, B:32:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    private void a(boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        this.f7959h.d(2);
        this.O = null;
        this.C = false;
        this.f7966o.b();
        this.L = 0L;
        for (ar arVar : this.f7952a) {
            try {
                b(arVar);
            } catch (p | RuntimeException e10) {
                com.applovin.exoplayer2.l.q.c("ExoPlayerImplInternal", "Disable failed.", e10);
            }
        }
        if (z10) {
            for (ar arVar2 : this.f7952a) {
                if (this.f7953b.remove(arVar2)) {
                    try {
                        arVar2.n();
                    } catch (RuntimeException e11) {
                        com.applovin.exoplayer2.l.q.c("ExoPlayerImplInternal", "Reset failed.", e11);
                    }
                }
            }
        }
        this.J = 0;
        al alVar = this.f7975x;
        com.applovin.exoplayer2.h.p.a aVar = alVar.f4233b;
        long jLongValue = alVar.f4250s;
        long j10 = (this.f7975x.f4233b.a() || a(this.f7975x, this.f7963l)) ? this.f7975x.f4234c : this.f7975x.f4250s;
        if (z11) {
            this.K = null;
            Pair<com.applovin.exoplayer2.h.p.a, Long> pairA = a(this.f7975x.f4232a);
            aVar = (com.applovin.exoplayer2.h.p.a) pairA.first;
            jLongValue = ((Long) pairA.second).longValue();
            j10 = -9223372036854775807L;
            if (aVar.equals(this.f7975x.f4233b)) {
                z14 = false;
            } else {
                z14 = true;
            }
        } else {
            z14 = false;
        }
        com.applovin.exoplayer2.h.p.a aVar2 = aVar;
        long j11 = jLongValue;
        this.f7970s.g();
        this.D = false;
        al alVar2 = this.f7975x;
        ba baVar = alVar2.f4232a;
        int i10 = alVar2.f4236e;
        p pVar = z13 ? null : alVar2.f4237f;
        com.applovin.exoplayer2.h.ad adVar = z14 ? com.applovin.exoplayer2.h.ad.f6509a : alVar2.f4239h;
        com.applovin.exoplayer2.j.k kVar = z14 ? this.f7956e : alVar2.f4240i;
        List listG = z14 ? com.applovin.exoplayer2.common.a.s.g() : alVar2.f4241j;
        al alVar3 = this.f7975x;
        this.f7975x = new al(baVar, aVar2, j10, j11, i10, pVar, false, adVar, kVar, listG, aVar2, alVar3.f4243l, alVar3.f4244m, alVar3.f4245n, j11, 0L, j11, this.I, false);
        if (z12) {
            this.f7971t.c();
        }
    }

    private void a(boolean[] zArr) throws p {
        ad adVarD = this.f7970s.d();
        com.applovin.exoplayer2.j.k kVarI = adVarD.i();
        for (int i10 = 0; i10 < this.f7952a.length; i10++) {
            if (!kVarI.a(i10) && this.f7953b.remove(this.f7952a[i10])) {
                this.f7952a[i10].n();
            }
        }
        for (int i11 = 0; i11 < this.f7952a.length; i11++) {
            if (kVarI.a(i11)) {
                a(i11, zArr[i11]);
            }
        }
        adVarD.f4170g = true;
    }

    private static boolean a(al alVar, ba.a aVar) {
        com.applovin.exoplayer2.h.p.a aVar2 = alVar.f4233b;
        ba baVar = alVar.f4232a;
        return baVar.d() || baVar.a(aVar2.f6608a, aVar).f4681f;
    }

    private boolean a(ar arVar, ad adVar) {
        ad adVarG = adVar.g();
        return adVar.f4169f.f4184f && adVarG.f4167d && ((arVar instanceof com.applovin.exoplayer2.i.m) || arVar.h() >= adVarG.b());
    }

    private boolean a(ba baVar, com.applovin.exoplayer2.h.p.a aVar) {
        if (aVar.a() || baVar.d()) {
            return false;
        }
        baVar.a(baVar.a(aVar.f6608a, this.f7963l).f4678c, this.f7962k);
        if (!this.f7962k.e()) {
            return false;
        }
        ba.c cVar = this.f7962k;
        return cVar.f4699j && cVar.f4696g != -9223372036854775807L;
    }

    private static boolean a(c cVar, ba baVar, ba baVar2, int i10, boolean z10, ba.c cVar2, ba.a aVar) {
        Object obj = cVar.f7990d;
        if (obj == null) {
            Pair<Object, Long> pairA = a(baVar, new g(cVar.f7987a.a(), cVar.f7987a.g(), cVar.f7987a.f() == Long.MIN_VALUE ? -9223372036854775807L : h.b(cVar.f7987a.f())), false, i10, z10, cVar2, aVar);
            if (pairA == null) {
                return false;
            }
            cVar.a(baVar.c(pairA.first), ((Long) pairA.second).longValue(), pairA.first);
            if (cVar.f7987a.f() == Long.MIN_VALUE) {
                a(baVar, cVar, cVar2, aVar);
            }
            return true;
        }
        int iC = baVar.c(obj);
        if (iC == -1) {
            return false;
        }
        if (cVar.f7987a.f() == Long.MIN_VALUE) {
            a(baVar, cVar, cVar2, aVar);
            return true;
        }
        cVar.f7988b = iC;
        baVar2.a(cVar.f7990d, aVar);
        if (aVar.f4681f && baVar2.a(aVar.f4678c, cVar2).f4705p == baVar2.c(cVar.f7990d)) {
            Pair<Object, Long> pairA2 = baVar.a(cVar2, aVar, baVar.a(cVar.f7990d, aVar).f4678c, aVar.c() + cVar.f7989c);
            cVar.a(baVar.c(pairA2.first), ((Long) pairA2.second).longValue(), pairA2.first);
        }
        return true;
    }

    private static v[] a(com.applovin.exoplayer2.j.d dVar) {
        int iE = dVar != null ? dVar.e() : 0;
        v[] vVarArr = new v[iE];
        for (int i10 = 0; i10 < iE; i10++) {
            vVarArr[i10] = dVar.a(i10);
        }
        return vVarArr;
    }

    private void b(int i10) {
        al alVar = this.f7975x;
        if (alVar.f4236e != i10) {
            this.f7975x = alVar.a(i10);
        }
    }

    private void b(int i10, int i11, com.applovin.exoplayer2.h.z zVar) throws Throwable {
        this.f7976y.a(1);
        a(this.f7971t.a(i10, i11, zVar), false);
    }

    private void b(long j10) throws p {
        ad adVarC = this.f7970s.c();
        if (adVarC != null) {
            j10 = adVarC.a(j10);
        }
        this.L = j10;
        this.f7966o.a(j10);
        for (ar arVar : this.f7952a) {
            if (c(arVar)) {
                arVar.a(this.L);
            }
        }
        r();
    }

    private void b(am amVar) throws p {
        this.f7966o.a(amVar);
        a(this.f7966o.d(), true);
    }

    private void b(ao aoVar) throws p {
        if (aoVar.f() == -9223372036854775807L) {
            c(aoVar);
            return;
        }
        if (this.f7975x.f4232a.d()) {
            this.f7967p.add(new c(aoVar));
            return;
        }
        c cVar = new c(aoVar);
        ba baVar = this.f7975x.f4232a;
        if (!a(cVar, baVar, baVar, this.E, this.F, this.f7962k, this.f7963l)) {
            aoVar.a(false);
        } else {
            this.f7967p.add(cVar);
            Collections.sort(this.f7967p);
        }
    }

    private void b(ar arVar) throws p {
        if (c(arVar)) {
            this.f7966o.b(arVar);
            a(arVar);
            arVar.m();
            this.J--;
        }
    }

    private void b(boolean z10) {
        for (ad adVarC = this.f7970s.c(); adVarC != null; adVarC = adVarC.g()) {
            for (com.applovin.exoplayer2.j.d dVar : adVarC.i().f7307c) {
                if (dVar != null) {
                    dVar.a(z10);
                }
            }
        }
    }

    private boolean b(long j10, long j11) {
        if (this.I && this.H) {
            return false;
        }
        a(j10, j11);
        return true;
    }

    private void c(int i10) throws p {
        this.E = i10;
        if (!this.f7970s.a(this.f7975x.f4232a, i10)) {
            f(true);
        }
        h(false);
    }

    private void c(long j10) {
        for (ar arVar : this.f7952a) {
            if (arVar.f() != null) {
                a(arVar, j10);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0044 A[LOOP:0: B:14:0x0045->B:13:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:15:0x0047  */
    /* JADX WARN: Code duplicated, block: B:17:0x004b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x0039 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0055 -> B:12:0x0039). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0084 -> B:25:0x0060). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private void c(long r8, long r10) throws com.applovin.exoplayer2.p {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.s.c(long, long):void");
    }

    private void c(ao aoVar) throws p {
        if (aoVar.e() != this.f7961j) {
            this.f7959h.a(15, aoVar).a();
            return;
        }
        e(aoVar);
        int i10 = this.f7975x.f4236e;
        if (i10 == 3 || i10 == 2) {
            this.f7959h.c(2);
        }
    }

    private void c(com.applovin.exoplayer2.h.n nVar) throws p {
        if (this.f7970s.a(nVar)) {
            ad adVarB = this.f7970s.b();
            adVarB.a(this.f7966o.d().f4253b, this.f7975x.f4232a);
            a(adVarB.h(), adVarB.i());
            if (adVarB == this.f7970s.c()) {
                b(adVarB.f4169f.f4180b);
                H();
                al alVar = this.f7975x;
                com.applovin.exoplayer2.h.p.a aVar = alVar.f4233b;
                long j10 = adVarB.f4169f.f4180b;
                this.f7975x = a(aVar, j10, alVar.f4234c, j10, false, 5);
            }
            D();
        }
    }

    private void c(boolean z10) throws p {
        this.A = z10;
        A();
        if (!this.B || this.f7970s.d() == this.f7970s.c()) {
            return;
        }
        f(true);
        h(false);
    }

    private static boolean c(ar arVar) {
        return arVar.d_() != 0;
    }

    private long d(long j10) {
        ad adVarB = this.f7970s.b();
        if (adVarB == null) {
            return 0L;
        }
        return Math.max(0L, j10 - adVarB.b(this.L));
    }

    private void d(ao aoVar) {
        Looper looperE = aoVar.e();
        if (looperE.getThread().isAlive()) {
            this.f7968q.a(looperE, null).a((Runnable) new n0(this, aoVar));
        } else {
            com.applovin.exoplayer2.l.q.c("TAG", "Trying to send message on a dead thread.");
            aoVar.a(false);
        }
    }

    private void d(com.applovin.exoplayer2.h.n nVar) {
        if (this.f7970s.a(nVar)) {
            this.f7970s.a(this.L);
            D();
        }
    }

    private void d(boolean z10) {
        if (z10 == this.I) {
            return;
        }
        this.I = z10;
        al alVar = this.f7975x;
        int i10 = alVar.f4236e;
        if (z10 || i10 == 4 || i10 == 1) {
            this.f7975x = alVar.b(z10);
        } else {
            this.f7959h.c(2);
        }
    }

    private void e(ao aoVar) throws p {
        if (aoVar.j()) {
            return;
        }
        try {
            aoVar.b().a(aoVar.c(), aoVar.d());
        } finally {
            aoVar.a(true);
        }
    }

    private void e(boolean z10) throws p {
        this.F = z10;
        if (!this.f7970s.a(this.f7975x.f4232a, z10)) {
            f(true);
        }
        h(false);
    }

    private void f() {
        this.f7976y.a(this.f7975x);
        if (this.f7976y.f7997g) {
            this.f7969r.onPlaybackInfoUpdate(this.f7976y);
            this.f7976y = new d(this.f7975x);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(ao aoVar) {
        try {
            e(aoVar);
        } catch (p e10) {
            com.applovin.exoplayer2.l.q.c("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    private void f(boolean z10) throws p {
        com.applovin.exoplayer2.h.p.a aVar = this.f7970s.c().f4169f.f4179a;
        long jA = a(aVar, this.f7975x.f4250s, true, false);
        if (jA != this.f7975x.f4250s) {
            al alVar = this.f7975x;
            this.f7975x = a(aVar, jA, alVar.f4234c, alVar.f4235d, z10, 5);
        }
    }

    private void g() {
        this.f7976y.a(1);
        a(false, false, false, true);
        this.f7957f.a();
        b(this.f7975x.f4232a.d() ? 4 : 2);
        this.f7971t.a(this.f7958g.a());
        this.f7959h.c(2);
    }

    private boolean g(boolean z10) {
        if (this.J == 0) {
            return s();
        }
        if (!z10) {
            return false;
        }
        al alVar = this.f7975x;
        if (!alVar.f4238g) {
            return true;
        }
        long jB = a(alVar.f4232a, this.f7970s.c().f4169f.f4179a) ? this.f7972u.b() : -9223372036854775807L;
        ad adVarB = this.f7970s.b();
        return (adVarB.c() && adVarB.f4169f.f4187i) || (adVarB.f4169f.f4179a.a() && !adVarB.f4167d) || this.f7957f.a(I(), this.f7966o.d().f4253b, this.C, jB);
    }

    private void h() throws Throwable {
        a(this.f7971t.d(), true);
    }

    private void h(boolean z10) {
        ad adVarB = this.f7970s.b();
        com.applovin.exoplayer2.h.p.a aVar = adVarB == null ? this.f7975x.f4233b : adVarB.f4169f.f4179a;
        boolean z11 = !this.f7975x.f4242k.equals(aVar);
        if (z11) {
            this.f7975x = this.f7975x.a(aVar);
        }
        al alVar = this.f7975x;
        alVar.f4248q = adVarB == null ? alVar.f4250s : adVarB.d();
        this.f7975x.f4249r = I();
        if ((z11 || z10) && adVarB != null && adVarB.f4167d) {
            a(adVarB.h(), adVarB.i());
        }
    }

    private void i() throws p {
        this.C = false;
        this.f7966o.a();
        for (ar arVar : this.f7952a) {
            if (c(arVar)) {
                arVar.e();
            }
        }
    }

    private void j() throws p {
        this.f7966o.b();
        for (ar arVar : this.f7952a) {
            if (c(arVar)) {
                a(arVar);
            }
        }
    }

    private void k() throws p {
        f(true);
    }

    private void l() throws p {
        ad adVarC = this.f7970s.c();
        if (adVarC == null) {
            return;
        }
        long jC = adVarC.f4167d ? adVarC.f4164a.c() : -9223372036854775807L;
        if (jC != -9223372036854775807L) {
            b(jC);
            if (jC != this.f7975x.f4250s) {
                al alVar = this.f7975x;
                this.f7975x = a(alVar.f4233b, jC, alVar.f4234c, jC, true, 5);
            }
        } else {
            long jA = this.f7966o.a(adVarC != this.f7970s.d());
            this.L = jA;
            long jB = adVarC.b(jA);
            c(this.f7975x.f4250s, jB);
            this.f7975x.f4250s = jB;
        }
        this.f7975x.f4248q = this.f7970s.b().d();
        this.f7975x.f4249r = I();
        al alVar2 = this.f7975x;
        if (alVar2.f4243l && alVar2.f4236e == 3 && a(alVar2.f4232a, alVar2.f4233b) && this.f7975x.f4245n.f4253b == 1.0f) {
            float fA = this.f7972u.a(o(), I());
            if (this.f7966o.d().f4253b != fA) {
                this.f7966o.a(this.f7975x.f4245n.a(fA));
                a(this.f7975x.f4245n, this.f7966o.d().f4253b, false, false);
            }
        }
    }

    private void m() {
        for (ad adVarC = this.f7970s.c(); adVarC != null; adVarC = adVarC.g()) {
            for (com.applovin.exoplayer2.j.d dVar : adVarC.i().f7307c) {
                if (dVar != null) {
                    dVar.h();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0183  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:127:0x01be  */
    /* JADX WARN: Code duplicated, block: B:136:0x015d A[EDGE_INSN: B:136:0x015d->B:100:0x015d BREAK  A[LOOP:1: B:92:0x0138->B:99:0x015a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0137  */
    /* JADX WARN: Code duplicated, block: B:94:0x013d  */
    private void n() throws IOException, p {
        boolean z10;
        boolean z11;
        boolean z12;
        al alVar;
        int i10;
        boolean z13;
        al alVar2;
        int i11;
        ar[] arVarArr;
        al alVar3;
        long jB = this.f7968q.b();
        u();
        int i12 = this.f7975x.f4236e;
        if (i12 == 1 || i12 == 4) {
            this.f7959h.d(2);
            return;
        }
        ad adVarC = this.f7970s.c();
        if (adVarC == null) {
            a(jB, 10L);
            return;
        }
        com.applovin.exoplayer2.l.ah.a("doSomeWork");
        l();
        if (adVarC.f4167d) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            adVarC.f4164a.a(this.f7975x.f4250s - this.f7964m, this.f7965n);
            z10 = true;
            z11 = true;
            int i13 = 0;
            while (true) {
                ar[] arVarArr2 = this.f7952a;
                if (i13 >= arVarArr2.length) {
                    break;
                }
                ar arVar = arVarArr2[i13];
                if (c(arVar)) {
                    arVar.a(this.L, jElapsedRealtime);
                    z10 = z10 && arVar.A();
                    boolean z14 = adVarC.f4166c[i13] != arVar.f();
                    boolean z15 = z14 || (!z14 && arVar.g()) || arVar.z() || arVar.A();
                    z11 = z11 && z15;
                    if (!z15) {
                        arVar.k();
                    }
                }
                i13++;
            }
        } else {
            adVarC.f4164a.e_();
            z10 = true;
            z11 = true;
        }
        long j10 = adVarC.f4169f.f4183e;
        boolean z16 = z10 && adVarC.f4167d && (j10 == -9223372036854775807L || j10 <= this.f7975x.f4250s);
        if (z16 && this.B) {
            this.B = false;
            a(false, this.f7975x.f4244m, false, 5);
        }
        if (!z16 || !adVarC.f4169f.f4187i) {
            if (this.f7975x.f4236e == 2 && g(z11)) {
                b(3);
                this.O = null;
                if (J()) {
                    i();
                }
            } else if (this.f7975x.f4236e == 3 && (this.J != 0 ? !z11 : !s())) {
                this.C = J();
                b(2);
                if (this.C) {
                    m();
                    this.f7972u.a();
                }
            }
            if (this.f7975x.f4236e == 2) {
                i11 = 0;
                while (true) {
                    arVarArr = this.f7952a;
                    if (i11 < arVarArr.length) {
                        break;
                    }
                    if (!c(arVarArr[i11]) && this.f7952a[i11].f() == adVarC.f4166c[i11]) {
                        this.f7952a[i11].k();
                    }
                    i11++;
                }
                alVar3 = this.f7975x;
                if (!alVar3.f4238g && alVar3.f4249r < 500000 && F()) {
                    throw new IllegalStateException("Playback stuck buffering and not loading");
                }
            }
            z12 = this.I;
            alVar = this.f7975x;
            if (z12 != alVar.f4246o) {
                this.f7975x = alVar.b(z12);
            }
            if ((J() || this.f7975x.f4236e != 3) && (i10 = this.f7975x.f4236e) != 2) {
                if (this.J != 0 || i10 == 4) {
                    this.f7959h.d(2);
                } else {
                    a(jB, 1000L);
                }
                z13 = false;
            } else {
                z13 = !b(jB, 10L);
            }
            alVar2 = this.f7975x;
            if (alVar2.f4247p != z13) {
                this.f7975x = alVar2.c(z13);
            }
            this.H = false;
            com.applovin.exoplayer2.l.ah.a();
        }
        b(4);
        j();
        if (this.f7975x.f4236e == 2) {
            i11 = 0;
            while (true) {
                arVarArr = this.f7952a;
                if (i11 < arVarArr.length) {
                    break;
                    break;
                } else {
                    if (!c(arVarArr[i11])) {
                    }
                    i11++;
                }
            }
            alVar3 = this.f7975x;
            if (!alVar3.f4238g) {
                throw new IllegalStateException("Playback stuck buffering and not loading");
            }
        }
        z12 = this.I;
        alVar = this.f7975x;
        if (z12 != alVar.f4246o) {
            this.f7975x = alVar.b(z12);
        }
        if (J()) {
            if (this.J != 0) {
                this.f7959h.d(2);
            } else {
                this.f7959h.d(2);
            }
            z13 = false;
        } else {
            if (this.J != 0) {
                this.f7959h.d(2);
            } else {
                this.f7959h.d(2);
            }
            z13 = false;
        }
        alVar2 = this.f7975x;
        if (alVar2.f4247p != z13) {
            this.f7975x = alVar2.c(z13);
        }
        this.H = false;
        com.applovin.exoplayer2.l.ah.a();
    }

    private long o() {
        al alVar = this.f7975x;
        return a(alVar.f4232a, alVar.f4233b.f6608a, alVar.f4250s);
    }

    private void p() {
        a(true, false, true, false);
        this.f7957f.c();
        b(1);
        this.f7960i.quit();
        synchronized (this) {
            this.f7977z = true;
            notifyAll();
        }
    }

    private void q() throws p {
        float f10 = this.f7966o.d().f4253b;
        ad adVarD = this.f7970s.d();
        boolean z10 = true;
        for (ad adVarC = this.f7970s.c(); adVarC != null && adVarC.f4167d; adVarC = adVarC.g()) {
            com.applovin.exoplayer2.j.k kVarB = adVarC.b(f10, this.f7975x.f4232a);
            if (!kVarB.a(adVarC.i())) {
                af afVar = this.f7970s;
                if (z10) {
                    ad adVarC2 = afVar.c();
                    boolean zA = this.f7970s.a(adVarC2);
                    boolean[] zArr = new boolean[this.f7952a.length];
                    long jA = adVarC2.a(kVarB, this.f7975x.f4250s, zA, zArr);
                    al alVar = this.f7975x;
                    boolean z11 = (alVar.f4236e == 4 || jA == alVar.f4250s) ? false : true;
                    al alVar2 = this.f7975x;
                    this.f7975x = a(alVar2.f4233b, jA, alVar2.f4234c, alVar2.f4235d, z11, 5);
                    if (z11) {
                        b(jA);
                    }
                    boolean[] zArr2 = new boolean[this.f7952a.length];
                    int i10 = 0;
                    while (true) {
                        ar[] arVarArr = this.f7952a;
                        if (i10 >= arVarArr.length) {
                            break;
                        }
                        ar arVar = arVarArr[i10];
                        zArr2[i10] = c(arVar);
                        com.applovin.exoplayer2.h.x xVar = adVarC2.f4166c[i10];
                        if (zArr2[i10]) {
                            if (xVar != arVar.f()) {
                                b(arVar);
                            } else if (zArr[i10]) {
                                arVar.a(this.L);
                            }
                        }
                        i10++;
                    }
                    a(zArr2);
                } else {
                    afVar.a(adVarC);
                    if (adVarC.f4167d) {
                        adVarC.a(kVarB, Math.max(adVarC.f4169f.f4180b, adVarC.b(this.L)), false);
                    }
                }
                h(true);
                if (this.f7975x.f4236e != 4) {
                    D();
                    l();
                    this.f7959h.c(2);
                    return;
                }
                return;
            }
            if (adVarC == adVarD) {
                z10 = false;
            }
        }
    }

    private void r() {
        for (ad adVarC = this.f7970s.c(); adVarC != null; adVarC = adVarC.g()) {
            for (com.applovin.exoplayer2.j.d dVar : adVarC.i().f7307c) {
                if (dVar != null) {
                    dVar.g();
                }
            }
        }
    }

    private boolean s() {
        ad adVarC = this.f7970s.c();
        long j10 = adVarC.f4169f.f4183e;
        return adVarC.f4167d && (j10 == -9223372036854775807L || this.f7975x.f4250s < j10 || !J());
    }

    private long t() {
        ad adVarD = this.f7970s.d();
        if (adVarD == null) {
            return 0L;
        }
        long jA = adVarD.a();
        if (!adVarD.f4167d) {
            return jA;
        }
        int i10 = 0;
        while (true) {
            ar[] arVarArr = this.f7952a;
            if (i10 >= arVarArr.length) {
                return jA;
            }
            if (c(arVarArr[i10]) && this.f7952a[i10].f() == adVarD.f4166c[i10]) {
                long jH = this.f7952a[i10].h();
                if (jH == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jA = Math.max(jH, jA);
            }
            i10++;
        }
    }

    private void u() throws IOException, p {
        if (this.f7975x.f4232a.d() || !this.f7971t.a()) {
            return;
        }
        v();
        w();
        x();
        z();
    }

    private void v() throws p {
        ae aeVarA;
        this.f7970s.a(this.L);
        if (this.f7970s.a() && (aeVarA = this.f7970s.a(this.L, this.f7975x)) != null) {
            ad adVarA = this.f7970s.a(this.f7954c, this.f7955d, this.f7957f.d(), this.f7971t, aeVarA, this.f7956e);
            adVarA.f4164a.a(this, aeVarA.f4180b);
            if (this.f7970s.c() == adVarA) {
                b(adVarA.b());
            }
            h(false);
        }
        if (!this.D) {
            D();
        } else {
            this.D = F();
            G();
        }
    }

    private void w() {
        ad adVarD = this.f7970s.d();
        if (adVarD == null) {
            return;
        }
        int i10 = 0;
        if (adVarD.g() != null && !this.B) {
            if (C()) {
                if (adVarD.g().f4167d || this.L >= adVarD.g().b()) {
                    com.applovin.exoplayer2.j.k kVarI = adVarD.i();
                    ad adVarE = this.f7970s.e();
                    com.applovin.exoplayer2.j.k kVarI2 = adVarE.i();
                    if (adVarE.f4167d && adVarE.f4164a.c() != -9223372036854775807L) {
                        c(adVarE.b());
                        return;
                    }
                    for (int i11 = 0; i11 < this.f7952a.length; i11++) {
                        boolean zA = kVarI.a(i11);
                        boolean zA2 = kVarI2.a(i11);
                        if (zA && !this.f7952a[i11].j()) {
                            boolean z10 = this.f7954c[i11].a() == -2;
                            at atVar = kVarI.f7306b[i11];
                            at atVar2 = kVarI2.f7306b[i11];
                            if (!zA2 || !atVar2.equals(atVar) || z10) {
                                a(this.f7952a[i11], adVarE.b());
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!adVarD.f4169f.f4187i && !this.B) {
            return;
        }
        while (true) {
            ar[] arVarArr = this.f7952a;
            if (i10 >= arVarArr.length) {
                return;
            }
            ar arVar = arVarArr[i10];
            com.applovin.exoplayer2.h.x xVar = adVarD.f4166c[i10];
            if (xVar != null && arVar.f() == xVar && arVar.g()) {
                long j10 = adVarD.f4169f.f4183e;
                a(arVar, (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? -9223372036854775807L : adVarD.a() + adVarD.f4169f.f4183e);
            }
            i10++;
        }
    }

    private void x() throws p {
        ad adVarD = this.f7970s.d();
        if (adVarD == null || this.f7970s.c() == adVarD || adVarD.f4170g || !y()) {
            return;
        }
        H();
    }

    private boolean y() throws p {
        ad adVarD = this.f7970s.d();
        com.applovin.exoplayer2.j.k kVarI = adVarD.i();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            ar[] arVarArr = this.f7952a;
            if (i10 >= arVarArr.length) {
                return !z10;
            }
            ar arVar = arVarArr[i10];
            if (c(arVar)) {
                boolean z11 = arVar.f() != adVarD.f4166c[i10];
                if (!kVarI.a(i10) || z11) {
                    if (!arVar.j()) {
                        arVar.a(a(kVarI.f7307c[i10]), adVarD.f4166c[i10], adVarD.b(), adVarD.a());
                    } else if (arVar.A()) {
                        b(arVar);
                    } else {
                        z10 = true;
                    }
                }
            }
            i10++;
        }
    }

    private void z() throws p {
        boolean z10 = false;
        while (B()) {
            if (z10) {
                f();
            }
            ad adVarC = this.f7970s.c();
            ad adVarF = this.f7970s.f();
            ae aeVar = adVarF.f4169f;
            com.applovin.exoplayer2.h.p.a aVar = aeVar.f4179a;
            long j10 = aeVar.f4180b;
            al alVarA = a(aVar, j10, aeVar.f4181c, j10, true, 0);
            this.f7975x = alVarA;
            ba baVar = alVarA.f4232a;
            a(baVar, adVarF.f4169f.f4179a, baVar, adVarC.f4169f.f4179a, -9223372036854775807L);
            A();
            l();
            z10 = true;
        }
    }

    public void a() {
        this.f7959h.b(0).a();
    }

    public void a(int i10) {
        this.f7959h.a(11, i10, 0).a();
    }

    public void a(int i10, int i11, com.applovin.exoplayer2.h.z zVar) {
        this.f7959h.a(20, i10, i11, zVar).a();
    }

    public void a(long j10) {
        this.P = j10;
    }

    @Override // com.applovin.exoplayer2.m.a
    public void a(am amVar) {
        this.f7959h.a(16, amVar).a();
    }

    @Override // com.applovin.exoplayer2.ao.a
    public synchronized void a(ao aoVar) {
        if (!this.f7977z && this.f7960i.isAlive()) {
            this.f7959h.a(14, aoVar).a();
            return;
        }
        com.applovin.exoplayer2.l.q.c("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        aoVar.a(false);
    }

    public void a(ba baVar, int i10, long j10) {
        this.f7959h.a(3, new g(baVar, i10, j10)).a();
    }

    @Override // com.applovin.exoplayer2.h.n.a
    public void a(com.applovin.exoplayer2.h.n nVar) {
        this.f7959h.a(8, nVar).a();
    }

    public void a(List<ah.c> list, int i10, long j10, com.applovin.exoplayer2.h.z zVar) {
        this.f7959h.a(17, new a(list, zVar, i10, j10)).a();
    }

    public void a(boolean z10) {
        this.f7959h.a(12, z10 ? 1 : 0, 0).a();
    }

    public void a(boolean z10, int i10) {
        this.f7959h.a(1, z10 ? 1 : 0, i10).a();
    }

    public void b() {
        this.f7959h.b(6).a();
    }

    @Override // com.applovin.exoplayer2.h.y.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(com.applovin.exoplayer2.h.n nVar) {
        this.f7959h.a(9, nVar).a();
    }

    public synchronized boolean c() {
        if (!this.f7977z && this.f7960i.isAlive()) {
            this.f7959h.c(7);
            a(new Supplier() { // from class: com.applovin.exoplayer2.o0
                @Override // com.applovin.exoplayer2.common.base.Supplier
                public final Object get() {
                    return this.f7916c.K();
                }
            }, this.f7973v);
            return this.f7977z;
        }
        return true;
    }

    public Looper d() {
        return this.f7961j;
    }

    @Override // com.applovin.exoplayer2.ah.d
    public void e() {
        this.f7959h.c(22);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        p e10;
        int i10;
        ad adVarD;
        IOException iOException;
        int i11;
        int i12 = 1000;
        try {
            switch (message.what) {
                case 0:
                    g();
                    break;
                case 1:
                    a(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    n();
                    break;
                case 3:
                    a((g) message.obj);
                    break;
                case 4:
                    b((am) message.obj);
                    break;
                case 5:
                    a((av) message.obj);
                    break;
                case 6:
                    a(false, true);
                    break;
                case 7:
                    p();
                    return true;
                case 8:
                    c((com.applovin.exoplayer2.h.n) message.obj);
                    break;
                case 9:
                    d((com.applovin.exoplayer2.h.n) message.obj);
                    break;
                case 10:
                    q();
                    break;
                case 11:
                    c(message.arg1);
                    break;
                case 12:
                    e(message.arg1 != 0);
                    break;
                case 13:
                    a(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    b((ao) message.obj);
                    break;
                case 15:
                    d((ao) message.obj);
                    break;
                case 16:
                    a((am) message.obj, false);
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
                    b(message.arg1, message.arg2, (com.applovin.exoplayer2.h.z) message.obj);
                    break;
                case 21:
                    a((com.applovin.exoplayer2.h.z) message.obj);
                    break;
                case 22:
                    h();
                    break;
                case 23:
                    c(message.arg1 != 0);
                    break;
                case 24:
                    d(message.arg1 == 1);
                    break;
                case 25:
                    k();
                    break;
                default:
                    return false;
            }
        } catch (ai e11) {
            int i13 = e11.f4225b;
            if (i13 == 1) {
                i11 = e11.f4224a ? 3001 : AuthApiStatusCodes.AUTH_API_SERVER_ERROR;
            } else {
                if (i13 == 4) {
                    i11 = e11.f4224a ? AuthApiStatusCodes.AUTH_API_CLIENT_ERROR : AuthApiStatusCodes.AUTH_TOKEN_ERROR;
                }
                a(e11, i12);
            }
            i12 = i11;
            a(e11, i12);
        } catch (com.applovin.exoplayer2.d.f.a e12) {
            i10 = e12.f5141a;
            iOException = e12;
            a(iOException, i10);
        } catch (com.applovin.exoplayer2.h.b e13) {
            i10 = 1002;
            iOException = e13;
            a(iOException, i10);
        } catch (com.applovin.exoplayer2.k.j e14) {
            i10 = e14.f7385a;
            iOException = e14;
            a(iOException, i10);
        } catch (p e15) {
            e10 = e15;
            if (e10.f7918a == 1 && (adVarD = this.f7970s.d()) != null) {
                e10 = e10.a(adVarD.f4169f.f4179a);
            }
            if (e10.f7924g && this.O == null) {
                com.applovin.exoplayer2.l.q.b("ExoPlayerImplInternal", "Recoverable renderer error", e10);
                this.O = e10;
                com.applovin.exoplayer2.l.o oVar = this.f7959h;
                oVar.a(oVar.a(25, e10));
            } else {
                p pVar = this.O;
                if (pVar != null) {
                    pVar.addSuppressed(e10);
                    e10 = this.O;
                }
                com.applovin.exoplayer2.l.q.c("ExoPlayerImplInternal", "Playback error", e10);
                a(true, false);
                this.f7975x = this.f7975x.a(e10);
            }
        } catch (IOException e16) {
            i10 = 2000;
            iOException = e16;
            a(iOException, i10);
        } catch (RuntimeException e17) {
            e10 = p.a(e17, ((e17 instanceof IllegalStateException) || (e17 instanceof IllegalArgumentException)) ? 1004 : 1000);
            com.applovin.exoplayer2.l.q.c("ExoPlayerImplInternal", "Playback error", e10);
            a(true, false);
            this.f7975x = this.f7975x.a(e10);
        }
        f();
        return true;
    }
}
