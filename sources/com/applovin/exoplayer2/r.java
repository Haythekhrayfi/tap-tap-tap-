package com.applovin.exoplayer2;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
final class r extends d {
    private av A;
    private com.applovin.exoplayer2.h.z B;
    private boolean C;
    private an.a D;
    private ac E;
    private ac F;
    private al G;
    private int H;
    private int I;
    private long J;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.applovin.exoplayer2.j.k f7925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final an.a f7926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ar[] f7927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.applovin.exoplayer2.j.j f7928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.o f7929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final s.e f7930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final s f7931h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.p<an.b> f7932i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final CopyOnWriteArraySet<q.a> f7933j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ba.a f7934k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<a> f7935l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f7936m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.applovin.exoplayer2.h.r f7937n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final com.applovin.exoplayer2.a.a f7938o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Looper f7939p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.applovin.exoplayer2.k.d f7940q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final long f7941r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final long f7942s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.d f7943t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f7944u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f7945v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f7946w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f7947x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f7948y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f7949z;

    public static final class a implements ag {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f7950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ba f7951b;

        public a(Object obj, ba baVar) {
            this.f7950a = obj;
            this.f7951b = baVar;
        }

        @Override // com.applovin.exoplayer2.ag
        public Object a() {
            return this.f7950a;
        }

        @Override // com.applovin.exoplayer2.ag
        public ba b() {
            return this.f7951b;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public r(ar[] arVarArr, com.applovin.exoplayer2.j.j jVar, com.applovin.exoplayer2.h.r rVar, aa aaVar, com.applovin.exoplayer2.k.d dVar, com.applovin.exoplayer2.a.a aVar, boolean z10, av avVar, long j10, long j11, z zVar, long j12, boolean z11, com.applovin.exoplayer2.l.d dVar2, Looper looper, an anVar, an.a aVar2) {
        StringBuilder sbA = defpackage.a.a("Init ");
        sbA.append(Integer.toHexString(System.identityHashCode(this)));
        sbA.append(" [");
        sbA.append("ExoPlayerLib/2.15.1");
        sbA.append("] [");
        sbA.append(com.applovin.exoplayer2.l.ai.f7599e);
        sbA.append("]");
        com.applovin.exoplayer2.l.q.b("ExoPlayerImpl", sbA.toString());
        int i10 = 1;
        com.applovin.exoplayer2.l.a.b(arVarArr.length > 0);
        this.f7927d = (ar[]) com.applovin.exoplayer2.l.a.b(arVarArr);
        this.f7928e = (com.applovin.exoplayer2.j.j) com.applovin.exoplayer2.l.a.b(jVar);
        this.f7937n = rVar;
        this.f7940q = dVar;
        this.f7938o = aVar;
        this.f7936m = z10;
        this.A = avVar;
        this.f7941r = j10;
        this.f7942s = j11;
        this.C = z11;
        this.f7939p = looper;
        this.f7943t = dVar2;
        this.f7944u = 0;
        an anVar2 = anVar != null ? anVar : this;
        this.f7932i = new com.applovin.exoplayer2.l.p<>(looper, dVar2, new l0(anVar2));
        this.f7933j = new CopyOnWriteArraySet<>();
        this.f7935l = new ArrayList();
        this.B = new com.applovin.exoplayer2.h.z.a(0);
        com.applovin.exoplayer2.j.k kVar = new com.applovin.exoplayer2.j.k(new at[arVarArr.length], new com.applovin.exoplayer2.j.d[arVarArr.length], null);
        this.f7925b = kVar;
        this.f7934k = new ba.a();
        an.a aVarA = new an.a.C0071a().a(1, 2, 12, 13, 14, 15, 16, 17, 18, 19).a(28, jVar.a()).a(aVar2).a();
        this.f7926c = aVarA;
        this.D = new an.a.C0071a().a(aVarA).a(3).a(9).a();
        ac acVar = ac.f4112a;
        this.E = acVar;
        this.F = acVar;
        this.H = -1;
        this.f7929f = dVar2.a(looper, null);
        m0 m0Var = new m0(this, i10);
        this.f7930g = m0Var;
        this.G = al.a(kVar);
        if (aVar != null) {
            aVar.a(anVar2, looper);
            a((an.d) aVar);
            dVar.a(new Handler(looper), aVar);
        }
        this.f7931h = new s(arVarArr, jVar, kVar, aaVar, dVar, this.f7944u, this.f7945v, aVar, avVar, zVar, j12, z11, looper, dVar2, m0Var);
    }

    private int W() {
        if (this.G.f4232a.d()) {
            return this.H;
        }
        al alVar = this.G;
        return alVar.f4232a.a(alVar.f4233b.f6608a, this.f7934k).f4678c;
    }

    private void X() {
        an.a aVar = this.D;
        an.a aVarA = a(this.f7926c);
        this.D = aVarA;
        if (aVarA.equals(aVar)) {
            return;
        }
        this.f7932i.a(13, new m0(this, 2));
    }

    private ba Y() {
        return new ap(this.f7935l, this.B);
    }

    private long a(al alVar) {
        if (alVar.f4232a.d()) {
            return h.b(this.J);
        }
        return alVar.f4233b.a() ? alVar.f4250s : a(alVar.f4232a, alVar.f4233b, alVar.f4250s);
    }

    private long a(ba baVar, com.applovin.exoplayer2.h.p.a aVar, long j10) {
        baVar.a(aVar.f6608a, this.f7934k);
        return this.f7934k.c() + j10;
    }

    private Pair<Boolean, Integer> a(al alVar, al alVar2, boolean z10, int i10, boolean z11) {
        ba baVar = alVar2.f4232a;
        ba baVar2 = alVar.f4232a;
        if (baVar2.d() && baVar.d()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i11 = 3;
        if (baVar2.d() != baVar.d()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (baVar.a(baVar.a(alVar2.f4233b.f6608a, this.f7934k).f4678c, this.f5050a).f4691b.equals(baVar2.a(baVar2.a(alVar.f4233b.f6608a, this.f7934k).f4678c, this.f5050a).f4691b)) {
            return (z10 && i10 == 0 && alVar2.f4233b.f6611d < alVar.f4233b.f6611d) ? new Pair<>(Boolean.TRUE, 0) : new Pair<>(Boolean.FALSE, -1);
        }
        if (z10 && i10 == 0) {
            i11 = 1;
        } else if (z10 && i10 == 1) {
            i11 = 2;
        } else if (!z11) {
            throw new IllegalStateException();
        }
        return new Pair<>(Boolean.TRUE, Integer.valueOf(i11));
    }

    private Pair<Object, Long> a(ba baVar, int i10, long j10) {
        if (baVar.d()) {
            this.H = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.J = j10;
            this.I = 0;
            return null;
        }
        if (i10 == -1 || i10 >= baVar.b()) {
            i10 = baVar.b(this.f7945v);
            j10 = baVar.a(i10, this.f5050a).a();
        }
        return baVar.a(this.f5050a, this.f7934k, i10, h.b(j10));
    }

    private Pair<Object, Long> a(ba baVar, ba baVar2) {
        long jN = N();
        if (baVar.d() || baVar2.d()) {
            boolean z10 = !baVar.d() && baVar2.d();
            int iW = z10 ? -1 : W();
            if (z10) {
                jN = -9223372036854775807L;
            }
            return a(baVar2, iW, jN);
        }
        Pair<Object, Long> pairA = baVar.a(this.f5050a, this.f7934k, G(), h.b(jN));
        Object obj = ((Pair) com.applovin.exoplayer2.l.ai.a(pairA)).first;
        if (baVar2.c(obj) != -1) {
            return pairA;
        }
        Object objA = s.a(this.f5050a, this.f7934k, this.f7944u, this.f7945v, obj, baVar, baVar2);
        if (objA == null) {
            return a(baVar2, -1, -9223372036854775807L);
        }
        baVar2.a(objA, this.f7934k);
        int i10 = this.f7934k.f4678c;
        return a(baVar2, i10, baVar2.a(i10, this.f5050a).a());
    }

    private al a(int i10, int i11) {
        boolean z10 = false;
        com.applovin.exoplayer2.l.a.a(i10 >= 0 && i11 >= i10 && i11 <= this.f7935l.size());
        int iG = G();
        ba baVarS = S();
        int size = this.f7935l.size();
        this.f7946w++;
        b(i10, i11);
        ba baVarY = Y();
        al alVarA = a(this.G, baVarY, a(baVarS, baVarY));
        int i12 = alVarA.f4236e;
        if (i12 != 1 && i12 != 4 && i10 < i11 && i11 == size && iG >= alVarA.f4232a.b()) {
            z10 = true;
        }
        if (z10) {
            alVarA = alVarA.a(4);
        }
        this.f7931h.a(i10, i11, this.B);
        return alVarA;
    }

    private al a(al alVar, ba baVar, Pair<Object, Long> pair) {
        long jB;
        com.applovin.exoplayer2.l.a.a(baVar.d() || pair != null);
        ba baVar2 = alVar.f4232a;
        al alVarA = alVar.a(baVar);
        if (baVar.d()) {
            com.applovin.exoplayer2.h.p.a aVarA = al.a();
            long jB2 = h.b(this.J);
            al alVarA2 = alVarA.a(aVarA, jB2, jB2, jB2, 0L, com.applovin.exoplayer2.h.ad.f6509a, this.f7925b, com.applovin.exoplayer2.common.a.s.g()).a(aVarA);
            alVarA2.f4248q = alVarA2.f4250s;
            return alVarA2;
        }
        Object obj = alVarA.f4233b.f6608a;
        boolean z10 = !obj.equals(((Pair) com.applovin.exoplayer2.l.ai.a(pair)).first);
        com.applovin.exoplayer2.h.p.a aVar = z10 ? new com.applovin.exoplayer2.h.p.a(pair.first) : alVarA.f4233b;
        long jLongValue = ((Long) pair.second).longValue();
        long jB3 = h.b(N());
        if (!baVar2.d()) {
            jB3 -= baVar2.a(obj, this.f7934k).c();
        }
        if (z10 || jLongValue < jB3) {
            com.applovin.exoplayer2.l.a.b(!aVar.a());
            al alVarA3 = alVarA.a(aVar, jLongValue, jLongValue, jLongValue, 0L, z10 ? com.applovin.exoplayer2.h.ad.f6509a : alVarA.f4239h, z10 ? this.f7925b : alVarA.f4240i, z10 ? com.applovin.exoplayer2.common.a.s.g() : alVarA.f4241j).a(aVar);
            alVarA3.f4248q = jLongValue;
            return alVarA3;
        }
        if (jLongValue == jB3) {
            int iC = baVar.c(alVarA.f4242k.f6608a);
            if (iC == -1 || baVar.a(iC, this.f7934k).f4678c != baVar.a(aVar.f6608a, this.f7934k).f4678c) {
                baVar.a(aVar.f6608a, this.f7934k);
                jB = aVar.a() ? this.f7934k.b(aVar.f6609b, aVar.f6610c) : this.f7934k.f4679d;
                alVarA = alVarA.a(aVar, alVarA.f4250s, alVarA.f4250s, alVarA.f4235d, jB - alVarA.f4250s, alVarA.f4239h, alVarA.f4240i, alVarA.f4241j).a(aVar);
            }
            return alVarA;
        }
        com.applovin.exoplayer2.l.a.b(!aVar.a());
        long jMax = Math.max(0L, alVarA.f4249r - (jLongValue - jB3));
        jB = alVarA.f4248q;
        if (alVarA.f4242k.equals(alVarA.f4233b)) {
            jB = jLongValue + jMax;
        }
        alVarA = alVarA.a(aVar, jLongValue, jLongValue, jLongValue, jMax, alVarA.f4239h, alVarA.f4240i, alVarA.f4241j);
        alVarA.f4248q = jB;
        return alVarA;
    }

    private an.e a(int i10, al alVar, int i11) {
        int i12;
        int iC;
        Object obj;
        ab abVar;
        Object obj2;
        long jB;
        long jB2;
        ba.a aVar = new ba.a();
        if (alVar.f4232a.d()) {
            i12 = i11;
            iC = -1;
            obj = null;
            abVar = null;
            obj2 = null;
        } else {
            Object obj3 = alVar.f4233b.f6608a;
            alVar.f4232a.a(obj3, aVar);
            int i13 = aVar.f4678c;
            i12 = i13;
            obj2 = obj3;
            iC = alVar.f4232a.c(obj3);
            obj = alVar.f4232a.a(i13, this.f5050a).f4691b;
            abVar = this.f5050a.f4693d;
        }
        if (i10 == 0) {
            jB = aVar.f4680e + aVar.f4679d;
            if (alVar.f4233b.a()) {
                com.applovin.exoplayer2.h.p.a aVar2 = alVar.f4233b;
                jB = aVar.b(aVar2.f6609b, aVar2.f6610c);
                jB2 = b(alVar);
            } else {
                if (alVar.f4233b.f6612e != -1 && this.G.f4233b.a()) {
                    jB = b(this.G);
                }
                jB2 = jB;
            }
        } else if (alVar.f4233b.a()) {
            jB = alVar.f4250s;
            jB2 = b(alVar);
        } else {
            jB = aVar.f4680e + alVar.f4250s;
            jB2 = jB;
        }
        long jA = h.a(jB);
        long jA2 = h.a(jB2);
        com.applovin.exoplayer2.h.p.a aVar3 = alVar.f4233b;
        return new an.e(obj, i12, abVar, obj2, iC, jA, jA2, aVar3.f6609b, aVar3.f6610c);
    }

    private List<ah.c> a(int i10, List<com.applovin.exoplayer2.h.p> list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            ah.c cVar = new ah.c(list.get(i11), this.f7936m);
            arrayList.add(cVar);
            this.f7935l.add(i11 + i10, new a(cVar.f4220b, cVar.f4219a.f()));
        }
        this.B = this.B.a(i10, arrayList.size());
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(int i10, an.e eVar, an.e eVar2, an.b bVar) {
        bVar.e(i10);
        bVar.a(eVar, eVar2, i10);
    }

    private void a(final al alVar, int i10, int i11, boolean z10, boolean z11, final int i12, long j10, int i13) {
        al alVar2 = this.G;
        this.G = alVar;
        final int i14 = 1;
        Pair<Boolean, Integer> pairA = a(alVar, alVar2, z11, i12, !alVar2.f4232a.equals(alVar.f4232a));
        boolean zBooleanValue = ((Boolean) pairA.first).booleanValue();
        int iIntValue = ((Integer) pairA.second).intValue();
        ac acVarA = this.E;
        ab abVar = null;
        if (zBooleanValue) {
            if (!alVar.f4232a.d()) {
                abVar = alVar.f4232a.a(alVar.f4232a.a(alVar.f4233b.f6608a, this.f7934k).f4678c, this.f5050a).f4693d;
            }
            acVarA = abVar != null ? abVar.f4050e : ac.f4112a;
        }
        if (!alVar2.f4241j.equals(alVar.f4241j)) {
            acVarA = acVarA.a().a(alVar.f4241j).a();
        }
        boolean z12 = !acVarA.equals(this.E);
        this.E = acVarA;
        final int i15 = 0;
        if (!alVar2.f4232a.equals(alVar.f4232a)) {
            this.f7932i.a(0, new f0(alVar, i10, i15));
        }
        if (z11) {
            final an.e eVarA = a(i12, alVar2, i13);
            final an.e eVarC = c(j10);
            this.f7932i.a(11, new com.applovin.exoplayer2.l.p.a() { // from class: com.applovin.exoplayer2.h0
                @Override // com.applovin.exoplayer2.l.p.a
                public final void invoke(Object obj) {
                    r.a(i12, eVarA, eVarC, (an.b) obj);
                }
            });
        }
        if (zBooleanValue) {
            this.f7932i.a(1, new f0(abVar, iIntValue));
        }
        final int i16 = 4;
        final int i17 = 3;
        if (alVar2.f4237f != alVar.f4237f) {
            this.f7932i.a(10, new com.applovin.exoplayer2.l.p.a(alVar, i17) { // from class: com.applovin.exoplayer2.e0

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f6172c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ al f6173d;

                /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
                {
                    this.f6172c = i17;
                    switch (i17) {
                    }
                }

                @Override // com.applovin.exoplayer2.l.p.a
                public final void invoke(Object obj) {
                    switch (this.f6172c) {
                        case 0:
                            r.c(this.f6173d, (an.b) obj);
                            break;
                        case 1:
                            r.b(this.f6173d, (an.b) obj);
                            break;
                        case 2:
                            r.a(this.f6173d, (an.b) obj);
                            break;
                        case 3:
                            r.h(this.f6173d, (an.b) obj);
                            break;
                        case 4:
                            r.g(this.f6173d, (an.b) obj);
                            break;
                        case 5:
                            r.f(this.f6173d, (an.b) obj);
                            break;
                        case 6:
                            r.e(this.f6173d, (an.b) obj);
                            break;
                        default:
                            r.d(this.f6173d, (an.b) obj);
                            break;
                    }
                }
            });
            if (alVar.f4237f != null) {
                this.f7932i.a(10, new com.applovin.exoplayer2.l.p.a(alVar, i16) { // from class: com.applovin.exoplayer2.e0

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ int f6172c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ al f6173d;

                    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
                    {
                        this.f6172c = i16;
                        switch (i16) {
                        }
                    }

                    @Override // com.applovin.exoplayer2.l.p.a
                    public final void invoke(Object obj) {
                        switch (this.f6172c) {
                            case 0:
                                r.c(this.f6173d, (an.b) obj);
                                break;
                            case 1:
                                r.b(this.f6173d, (an.b) obj);
                                break;
                            case 2:
                                r.a(this.f6173d, (an.b) obj);
                                break;
                            case 3:
                                r.h(this.f6173d, (an.b) obj);
                                break;
                            case 4:
                                r.g(this.f6173d, (an.b) obj);
                                break;
                            case 5:
                                r.f(this.f6173d, (an.b) obj);
                                break;
                            case 6:
                                r.e(this.f6173d, (an.b) obj);
                                break;
                            default:
                                r.d(this.f6173d, (an.b) obj);
                                break;
                        }
                    }
                });
            }
        }
        com.applovin.exoplayer2.j.k kVar = alVar2.f4240i;
        com.applovin.exoplayer2.j.k kVar2 = alVar.f4240i;
        final int i18 = 2;
        if (kVar != kVar2) {
            this.f7928e.a(kVar2.f7308d);
            final com.applovin.exoplayer2.j.h hVar = new com.applovin.exoplayer2.j.h(alVar.f4240i.f7307c);
            this.f7932i.a(2, new com.applovin.exoplayer2.l.p.a() { // from class: com.applovin.exoplayer2.i0
                @Override // com.applovin.exoplayer2.l.p.a
                public final void invoke(Object obj) {
                    r.a(alVar, hVar, (an.b) obj);
                }
            });
        }
        if (z12) {
            this.f7932i.a(14, new l0(this.E));
        }
        final int i19 = 5;
        if (alVar2.f4238g != alVar.f4238g) {
            this.f7932i.a(3, new com.applovin.exoplayer2.l.p.a(alVar, i19) { // from class: com.applovin.exoplayer2.e0

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f6172c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ al f6173d;

                /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
                {
                    this.f6172c = i19;
                    switch (i19) {
                    }
                }

                @Override // com.applovin.exoplayer2.l.p.a
                public final void invoke(Object obj) {
                    switch (this.f6172c) {
                        case 0:
                            r.c(this.f6173d, (an.b) obj);
                            break;
                        case 1:
                            r.b(this.f6173d, (an.b) obj);
                            break;
                        case 2:
                            r.a(this.f6173d, (an.b) obj);
                            break;
                        case 3:
                            r.h(this.f6173d, (an.b) obj);
                            break;
                        case 4:
                            r.g(this.f6173d, (an.b) obj);
                            break;
                        case 5:
                            r.f(this.f6173d, (an.b) obj);
                            break;
                        case 6:
                            r.e(this.f6173d, (an.b) obj);
                            break;
                        default:
                            r.d(this.f6173d, (an.b) obj);
                            break;
                    }
                }
            });
        }
        final int i20 = 6;
        if (alVar2.f4236e != alVar.f4236e || alVar2.f4243l != alVar.f4243l) {
            this.f7932i.a(-1, new com.applovin.exoplayer2.l.p.a(alVar, i20) { // from class: com.applovin.exoplayer2.e0

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f6172c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ al f6173d;

                /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
                {
                    this.f6172c = i20;
                    switch (i20) {
                    }
                }

                @Override // com.applovin.exoplayer2.l.p.a
                public final void invoke(Object obj) {
                    switch (this.f6172c) {
                        case 0:
                            r.c(this.f6173d, (an.b) obj);
                            break;
                        case 1:
                            r.b(this.f6173d, (an.b) obj);
                            break;
                        case 2:
                            r.a(this.f6173d, (an.b) obj);
                            break;
                        case 3:
                            r.h(this.f6173d, (an.b) obj);
                            break;
                        case 4:
                            r.g(this.f6173d, (an.b) obj);
                            break;
                        case 5:
                            r.f(this.f6173d, (an.b) obj);
                            break;
                        case 6:
                            r.e(this.f6173d, (an.b) obj);
                            break;
                        default:
                            r.d(this.f6173d, (an.b) obj);
                            break;
                    }
                }
            });
        }
        final int i21 = 7;
        if (alVar2.f4236e != alVar.f4236e) {
            this.f7932i.a(4, new com.applovin.exoplayer2.l.p.a(alVar, i21) { // from class: com.applovin.exoplayer2.e0

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f6172c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ al f6173d;

                /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
                {
                    this.f6172c = i21;
                    switch (i21) {
                    }
                }

                @Override // com.applovin.exoplayer2.l.p.a
                public final void invoke(Object obj) {
                    switch (this.f6172c) {
                        case 0:
                            r.c(this.f6173d, (an.b) obj);
                            break;
                        case 1:
                            r.b(this.f6173d, (an.b) obj);
                            break;
                        case 2:
                            r.a(this.f6173d, (an.b) obj);
                            break;
                        case 3:
                            r.h(this.f6173d, (an.b) obj);
                            break;
                        case 4:
                            r.g(this.f6173d, (an.b) obj);
                            break;
                        case 5:
                            r.f(this.f6173d, (an.b) obj);
                            break;
                        case 6:
                            r.e(this.f6173d, (an.b) obj);
                            break;
                        default:
                            r.d(this.f6173d, (an.b) obj);
                            break;
                    }
                }
            });
        }
        if (alVar2.f4243l != alVar.f4243l) {
            this.f7932i.a(5, new f0(alVar, i11, i14));
        }
        if (alVar2.f4244m != alVar.f4244m) {
            this.f7932i.a(6, new com.applovin.exoplayer2.l.p.a(alVar, i15) { // from class: com.applovin.exoplayer2.e0

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f6172c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ al f6173d;

                /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
                {
                    this.f6172c = i15;
                    switch (i15) {
                    }
                }

                @Override // com.applovin.exoplayer2.l.p.a
                public final void invoke(Object obj) {
                    switch (this.f6172c) {
                        case 0:
                            r.c(this.f6173d, (an.b) obj);
                            break;
                        case 1:
                            r.b(this.f6173d, (an.b) obj);
                            break;
                        case 2:
                            r.a(this.f6173d, (an.b) obj);
                            break;
                        case 3:
                            r.h(this.f6173d, (an.b) obj);
                            break;
                        case 4:
                            r.g(this.f6173d, (an.b) obj);
                            break;
                        case 5:
                            r.f(this.f6173d, (an.b) obj);
                            break;
                        case 6:
                            r.e(this.f6173d, (an.b) obj);
                            break;
                        default:
                            r.d(this.f6173d, (an.b) obj);
                            break;
                    }
                }
            });
        }
        if (c(alVar2) != c(alVar)) {
            this.f7932i.a(7, new com.applovin.exoplayer2.l.p.a(alVar, i14) { // from class: com.applovin.exoplayer2.e0

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f6172c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ al f6173d;

                /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
                {
                    this.f6172c = i14;
                    switch (i14) {
                    }
                }

                @Override // com.applovin.exoplayer2.l.p.a
                public final void invoke(Object obj) {
                    switch (this.f6172c) {
                        case 0:
                            r.c(this.f6173d, (an.b) obj);
                            break;
                        case 1:
                            r.b(this.f6173d, (an.b) obj);
                            break;
                        case 2:
                            r.a(this.f6173d, (an.b) obj);
                            break;
                        case 3:
                            r.h(this.f6173d, (an.b) obj);
                            break;
                        case 4:
                            r.g(this.f6173d, (an.b) obj);
                            break;
                        case 5:
                            r.f(this.f6173d, (an.b) obj);
                            break;
                        case 6:
                            r.e(this.f6173d, (an.b) obj);
                            break;
                        default:
                            r.d(this.f6173d, (an.b) obj);
                            break;
                    }
                }
            });
        }
        if (!alVar2.f4245n.equals(alVar.f4245n)) {
            this.f7932i.a(12, new com.applovin.exoplayer2.l.p.a(alVar, i18) { // from class: com.applovin.exoplayer2.e0

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f6172c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ al f6173d;

                /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
                {
                    this.f6172c = i18;
                    switch (i18) {
                    }
                }

                @Override // com.applovin.exoplayer2.l.p.a
                public final void invoke(Object obj) {
                    switch (this.f6172c) {
                        case 0:
                            r.c(this.f6173d, (an.b) obj);
                            break;
                        case 1:
                            r.b(this.f6173d, (an.b) obj);
                            break;
                        case 2:
                            r.a(this.f6173d, (an.b) obj);
                            break;
                        case 3:
                            r.h(this.f6173d, (an.b) obj);
                            break;
                        case 4:
                            r.g(this.f6173d, (an.b) obj);
                            break;
                        case 5:
                            r.f(this.f6173d, (an.b) obj);
                            break;
                        case 6:
                            r.e(this.f6173d, (an.b) obj);
                            break;
                        default:
                            r.d(this.f6173d, (an.b) obj);
                            break;
                    }
                }
            });
        }
        if (z10) {
            this.f7932i.a(-1, com.applovin.exoplayer2.a.p.C);
        }
        X();
        this.f7932i.a();
        if (alVar2.f4246o != alVar.f4246o) {
            Iterator<q.a> it = this.f7933j.iterator();
            while (it.hasNext()) {
                it.next().a(alVar.f4246o);
            }
        }
        if (alVar2.f4247p != alVar.f4247p) {
            Iterator<q.a> it2 = this.f7933j.iterator();
            while (it2.hasNext()) {
                it2.next().b(alVar.f4247p);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(al alVar, int i10, an.b bVar) {
        bVar.b(alVar.f4243l, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(al alVar, an.b bVar) {
        bVar.a(alVar.f4245n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(al alVar, com.applovin.exoplayer2.j.h hVar, an.b bVar) {
        bVar.a(alVar.f4239h, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(an anVar, an.b bVar, com.applovin.exoplayer2.l.m mVar) {
        bVar.a(anVar, new an.c(mVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void c(s.d dVar) {
        long j10;
        boolean z10;
        long jA;
        int i10 = this.f7946w - dVar.f7992b;
        this.f7946w = i10;
        boolean z11 = true;
        if (dVar.f7993c) {
            this.f7947x = dVar.f7994d;
            this.f7948y = true;
        }
        if (dVar.f7995e) {
            this.f7949z = dVar.f7996f;
        }
        if (i10 == 0) {
            ba baVar = dVar.f7991a.f4232a;
            if (!this.G.f4232a.d() && baVar.d()) {
                this.H = -1;
                this.J = 0L;
                this.I = 0;
            }
            if (!baVar.d()) {
                List<ba> listA = ((ap) baVar).a();
                com.applovin.exoplayer2.l.a.b(listA.size() == this.f7935l.size());
                for (int i11 = 0; i11 < listA.size(); i11++) {
                    this.f7935l.get(i11).f7951b = listA.get(i11);
                }
            }
            if (this.f7948y) {
                if (dVar.f7991a.f4233b.equals(this.G.f4233b) && dVar.f7991a.f4235d == this.G.f4250s) {
                    z11 = false;
                }
                if (z11) {
                    if (baVar.d() || dVar.f7991a.f4233b.a()) {
                        jA = dVar.f7991a.f4235d;
                    } else {
                        al alVar = dVar.f7991a;
                        jA = a(baVar, alVar.f4233b, alVar.f4235d);
                    }
                    j10 = jA;
                } else {
                    j10 = -9223372036854775807L;
                }
                z10 = z11;
            } else {
                j10 = -9223372036854775807L;
                z10 = false;
            }
            this.f7948y = false;
            a(dVar.f7991a, 1, this.f7949z, false, z10, this.f7947x, j10, -1);
        }
    }

    private void a(List<com.applovin.exoplayer2.h.p> list, int i10, long j10, boolean z10) {
        int iB;
        long j11;
        int iW = W();
        long jI = I();
        this.f7946w++;
        if (!this.f7935l.isEmpty()) {
            b(0, this.f7935l.size());
        }
        List<ah.c> listA = a(0, list);
        ba baVarY = Y();
        if (!baVarY.d() && i10 >= baVarY.b()) {
            throw new y(baVarY, i10, j10);
        }
        if (z10) {
            j11 = -9223372036854775807L;
            iB = baVarY.b(this.f7945v);
        } else if (i10 == -1) {
            iB = iW;
            j11 = jI;
        } else {
            iB = i10;
            j11 = j10;
        }
        al alVarA = a(this.G, baVarY, a(baVarY, iB, j11));
        int i11 = alVarA.f4236e;
        if (iB != -1 && i11 != 1) {
            i11 = (baVarY.d() || iB >= baVarY.b()) ? 4 : 2;
        }
        al alVarA2 = alVarA.a(i11);
        this.f7931h.a(listA, iB, h.b(j11), this.B);
        a(alVarA2, 0, 1, false, (this.G.f4233b.f6608a.equals(alVarA2.f4233b.f6608a) || this.G.f4232a.d()) ? false : true, 4, a(alVarA2), -1);
    }

    private static long b(al alVar) {
        ba.c cVar = new ba.c();
        ba.a aVar = new ba.a();
        alVar.f4232a.a(alVar.f4233b.f6608a, aVar);
        return alVar.f4234c == -9223372036854775807L ? alVar.f4232a.a(aVar.f4678c, cVar).b() : aVar.c() + alVar.f4234c;
    }

    private void b(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            this.f7935l.remove(i12);
        }
        this.B = this.B.b(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(al alVar, int i10, an.b bVar) {
        bVar.a(alVar.f4232a, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(al alVar, an.b bVar) {
        bVar.d(c(alVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(s.d dVar) {
        this.f7929f.a((Runnable) new n0(this, dVar));
    }

    private an.e c(long j10) {
        int iC;
        ab abVar;
        Object obj;
        int iG = G();
        Object obj2 = null;
        if (this.G.f4232a.d()) {
            iC = -1;
            abVar = null;
            obj = null;
        } else {
            al alVar = this.G;
            Object obj3 = alVar.f4233b.f6608a;
            alVar.f4232a.a(obj3, this.f7934k);
            iC = this.G.f4232a.c(obj3);
            obj = obj3;
            obj2 = this.G.f4232a.a(iG, this.f5050a).f4691b;
            abVar = this.f5050a.f4693d;
        }
        long jA = h.a(j10);
        long jA2 = this.G.f4233b.a() ? h.a(b(this.G)) : jA;
        com.applovin.exoplayer2.h.p.a aVar = this.G.f4233b;
        return new an.e(obj2, iG, abVar, obj, iC, jA, jA2, aVar.f6609b, aVar.f6610c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(al alVar, an.b bVar) {
        bVar.c(alVar.f4244m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(an.b bVar) {
        bVar.a(this.D);
    }

    private static boolean c(al alVar) {
        return alVar.f4236e == 3 && alVar.f4243l && alVar.f4244m == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(al alVar, an.b bVar) {
        bVar.b(alVar.f4236e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(an.b bVar) {
        bVar.a(this.E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(al alVar, an.b bVar) {
        bVar.a(alVar.f4243l, alVar.f4236e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(an.b bVar) {
        bVar.a(p.a(new u(1), 1003));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(al alVar, an.b bVar) {
        bVar.c(alVar.f4238g);
        bVar.b_(alVar.f4238g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(al alVar, an.b bVar) {
        bVar.a(alVar.f4237f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(al alVar, an.b bVar) {
        bVar.b(alVar.f4237f);
    }

    @Override // com.applovin.exoplayer2.an
    public long A() {
        return this.f7941r;
    }

    @Override // com.applovin.exoplayer2.an
    public long B() {
        return this.f7942s;
    }

    @Override // com.applovin.exoplayer2.an
    public long C() {
        return 3000L;
    }

    @Override // com.applovin.exoplayer2.an
    public am D() {
        return this.G.f4245n;
    }

    public void E() {
        StringBuilder sbA = defpackage.a.a("Release ");
        sbA.append(Integer.toHexString(System.identityHashCode(this)));
        sbA.append(" [");
        sbA.append("ExoPlayerLib/2.15.1");
        sbA.append("] [");
        sbA.append(com.applovin.exoplayer2.l.ai.f7599e);
        sbA.append("] [");
        sbA.append(t.a());
        sbA.append("]");
        com.applovin.exoplayer2.l.q.b("ExoPlayerImpl", sbA.toString());
        if (!this.f7931h.c()) {
            this.f7932i.b(10, k0.f7553d);
        }
        this.f7932i.b();
        this.f7929f.a((Object) null);
        com.applovin.exoplayer2.a.a aVar = this.f7938o;
        if (aVar != null) {
            this.f7940q.a(aVar);
        }
        al alVarA = this.G.a(1);
        this.G = alVarA;
        al alVarA2 = alVarA.a(alVarA.f4233b);
        this.G = alVarA2;
        alVarA2.f4248q = alVarA2.f4250s;
        this.G.f4249r = 0L;
    }

    @Override // com.applovin.exoplayer2.an
    public int F() {
        if (this.G.f4232a.d()) {
            return this.I;
        }
        al alVar = this.G;
        return alVar.f4232a.c(alVar.f4233b.f6608a);
    }

    @Override // com.applovin.exoplayer2.an
    public int G() {
        int iW = W();
        if (iW == -1) {
            return 0;
        }
        return iW;
    }

    @Override // com.applovin.exoplayer2.an
    public long H() {
        if (!K()) {
            return p();
        }
        al alVar = this.G;
        com.applovin.exoplayer2.h.p.a aVar = alVar.f4233b;
        alVar.f4232a.a(aVar.f6608a, this.f7934k);
        return h.a(this.f7934k.b(aVar.f6609b, aVar.f6610c));
    }

    @Override // com.applovin.exoplayer2.an
    public long I() {
        return h.a(a(this.G));
    }

    @Override // com.applovin.exoplayer2.an
    public long J() {
        return h.a(this.G.f4249r);
    }

    @Override // com.applovin.exoplayer2.an
    public boolean K() {
        return this.G.f4233b.a();
    }

    @Override // com.applovin.exoplayer2.an
    public int L() {
        if (K()) {
            return this.G.f4233b.f6609b;
        }
        return -1;
    }

    @Override // com.applovin.exoplayer2.an
    public int M() {
        if (K()) {
            return this.G.f4233b.f6610c;
        }
        return -1;
    }

    @Override // com.applovin.exoplayer2.an
    public long N() {
        if (!K()) {
            return I();
        }
        al alVar = this.G;
        alVar.f4232a.a(alVar.f4233b.f6608a, this.f7934k);
        al alVar2 = this.G;
        return alVar2.f4234c == -9223372036854775807L ? alVar2.f4232a.a(G(), this.f5050a).a() : this.f7934k.b() + h.a(this.G.f4234c);
    }

    @Override // com.applovin.exoplayer2.an
    public long O() {
        if (this.G.f4232a.d()) {
            return this.J;
        }
        al alVar = this.G;
        if (alVar.f4242k.f6611d != alVar.f4233b.f6611d) {
            return alVar.f4232a.a(G(), this.f5050a).c();
        }
        long j10 = alVar.f4248q;
        if (this.G.f4242k.a()) {
            al alVar2 = this.G;
            ba.a aVarA = alVar2.f4232a.a(alVar2.f4242k.f6608a, this.f7934k);
            long jA = aVarA.a(this.G.f4242k.f6609b);
            j10 = jA == Long.MIN_VALUE ? aVarA.f4679d : jA;
        }
        al alVar3 = this.G;
        return h.a(a(alVar3.f4232a, alVar3.f4242k, j10));
    }

    @Override // com.applovin.exoplayer2.an
    public com.applovin.exoplayer2.h.ad P() {
        return this.G.f4239h;
    }

    @Override // com.applovin.exoplayer2.an
    public com.applovin.exoplayer2.j.h Q() {
        return new com.applovin.exoplayer2.j.h(this.G.f4240i.f7307c);
    }

    @Override // com.applovin.exoplayer2.an
    public ac R() {
        return this.E;
    }

    @Override // com.applovin.exoplayer2.an
    public ba S() {
        return this.G.f4232a;
    }

    @Override // com.applovin.exoplayer2.an
    public com.applovin.exoplayer2.m.o T() {
        return com.applovin.exoplayer2.m.o.f7878a;
    }

    @Override // com.applovin.exoplayer2.an
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public com.applovin.exoplayer2.common.a.s<com.applovin.exoplayer2.i.a> V() {
        return com.applovin.exoplayer2.common.a.s.g();
    }

    public ao a(ao.b bVar) {
        return new ao(this.f7931h, bVar, this.G.f4232a, G(), this.f7943t, this.f7931h.d());
    }

    @Override // com.applovin.exoplayer2.an
    public void a(int i10, long j10) {
        ba baVar = this.G.f4232a;
        if (i10 < 0 || (!baVar.d() && i10 >= baVar.b())) {
            throw new y(baVar, i10, j10);
        }
        this.f7946w++;
        if (K()) {
            com.applovin.exoplayer2.l.q.c("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            s.d dVar = new s.d(this.G);
            dVar.a(1);
            this.f7930g.onPlaybackInfoUpdate(dVar);
            return;
        }
        int i11 = t() != 1 ? 2 : 1;
        int iG = G();
        al alVarA = a(this.G.a(i11), baVar, a(baVar, i10, j10));
        this.f7931h.a(baVar, i10, h.b(j10));
        a(alVarA, 0, 1, true, true, 1, a(alVarA), iG);
    }

    @Override // com.applovin.exoplayer2.an
    public void a(SurfaceView surfaceView) {
    }

    @Override // com.applovin.exoplayer2.an
    public void a(TextureView textureView) {
    }

    public void a(an.b bVar) {
        this.f7932i.a(bVar);
    }

    @Override // com.applovin.exoplayer2.an
    public void a(an.d dVar) {
        a((an.b) dVar);
    }

    public void a(com.applovin.exoplayer2.g.a aVar) {
        ac acVarA = this.E.a().a(aVar).a();
        if (acVarA.equals(this.E)) {
            return;
        }
        this.E = acVarA;
        this.f7932i.b(14, new m0(this, 0));
    }

    public void a(com.applovin.exoplayer2.h.p pVar) {
        a(Collections.singletonList(pVar));
    }

    public void a(q.a aVar) {
        this.f7933j.add(aVar);
    }

    public void a(List<com.applovin.exoplayer2.h.p> list) {
        a(list, true);
    }

    public void a(List<com.applovin.exoplayer2.h.p> list, boolean z10) {
        a(list, -1, -9223372036854775807L, z10);
    }

    @Override // com.applovin.exoplayer2.an
    public void a(boolean z10) {
        a(z10, 0, 1);
    }

    public void a(boolean z10, int i10, int i11) {
        al alVar = this.G;
        if (alVar.f4243l == z10 && alVar.f4244m == i10) {
            return;
        }
        this.f7946w++;
        al alVarA = alVar.a(z10, i10);
        this.f7931h.a(z10, i10);
        a(alVarA, 0, i11, false, false, 5, -9223372036854775807L, -1);
    }

    public void a(boolean z10, p pVar) {
        al alVarA;
        if (z10) {
            alVarA = a(0, this.f7935l.size()).a((p) null);
        } else {
            al alVar = this.G;
            alVarA = alVar.a(alVar.f4233b);
            alVarA.f4248q = alVarA.f4250s;
            alVarA.f4249r = 0L;
        }
        al alVarA2 = alVarA.a(1);
        if (pVar != null) {
            alVarA2 = alVarA2.a(pVar);
        }
        al alVar2 = alVarA2;
        this.f7946w++;
        this.f7931h.b();
        a(alVar2, 0, 1, false, alVar2.f4232a.d() && !this.G.f4232a.d(), 4, a(alVar2), -1);
    }

    public void b(long j10) {
        this.f7931h.a(j10);
    }

    @Override // com.applovin.exoplayer2.an
    public void b(SurfaceView surfaceView) {
    }

    @Override // com.applovin.exoplayer2.an
    public void b(TextureView textureView) {
    }

    public void b(an.b bVar) {
        this.f7932i.b(bVar);
    }

    @Override // com.applovin.exoplayer2.an
    public void b(an.d dVar) {
        b((an.b) dVar);
    }

    @Override // com.applovin.exoplayer2.an
    public void b(final boolean z10) {
        if (this.f7945v != z10) {
            this.f7945v = z10;
            this.f7931h.a(z10);
            this.f7932i.a(9, new com.applovin.exoplayer2.l.p.a() { // from class: com.applovin.exoplayer2.j0
                @Override // com.applovin.exoplayer2.l.p.a
                public final void invoke(Object obj) {
                    ((an.b) obj).e(z10);
                }
            });
            X();
            this.f7932i.a();
        }
    }

    @Override // com.applovin.exoplayer2.an
    public void c(final int i10) {
        if (this.f7944u != i10) {
            this.f7944u = i10;
            this.f7931h.a(i10);
            this.f7932i.a(8, new com.applovin.exoplayer2.l.p.a() { // from class: com.applovin.exoplayer2.g0
                @Override // com.applovin.exoplayer2.l.p.a
                public final void invoke(Object obj) {
                    ((an.b) obj).d(i10);
                }
            });
            X();
            this.f7932i.a();
        }
    }

    public boolean q() {
        return this.G.f4247p;
    }

    @Override // com.applovin.exoplayer2.an
    public Looper r() {
        return this.f7939p;
    }

    @Override // com.applovin.exoplayer2.an
    public an.a s() {
        return this.D;
    }

    @Override // com.applovin.exoplayer2.an
    public int t() {
        return this.G.f4236e;
    }

    @Override // com.applovin.exoplayer2.an
    public int u() {
        return this.G.f4244m;
    }

    @Override // com.applovin.exoplayer2.an, com.applovin.exoplayer2.q
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public p e() {
        return this.G.f4237f;
    }

    @Override // com.applovin.exoplayer2.an
    public void w() {
        al alVar = this.G;
        if (alVar.f4236e != 1) {
            return;
        }
        al alVarA = alVar.a((p) null);
        al alVarA2 = alVarA.a(alVarA.f4232a.d() ? 4 : 2);
        this.f7946w++;
        this.f7931h.a();
        a(alVarA2, 1, 1, false, false, 5, -9223372036854775807L, -1);
    }

    @Override // com.applovin.exoplayer2.an
    public boolean x() {
        return this.G.f4243l;
    }

    @Override // com.applovin.exoplayer2.an
    public int y() {
        return this.f7944u;
    }

    @Override // com.applovin.exoplayer2.an
    public boolean z() {
        return this.f7945v;
    }
}
