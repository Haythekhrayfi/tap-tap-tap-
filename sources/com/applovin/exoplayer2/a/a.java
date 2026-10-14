package com.applovin.exoplayer2.a;

import android.os.Looper;
import android.util.SparseArray;
import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.ak;
import com.applovin.exoplayer2.am;
import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.h.ad;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a implements an.d, com.applovin.exoplayer2.b.g, com.applovin.exoplayer2.d.g, com.applovin.exoplayer2.h.q, com.applovin.exoplayer2.k.d.a, com.applovin.exoplayer2.m.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.d f3913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ba.a f3914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ba.c f3915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0069a f3916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SparseArray<b.a> f3917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.applovin.exoplayer2.l.p<b> f3918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private an f3919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.applovin.exoplayer2.l.o f3920h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f3921i;

    /* JADX INFO: renamed from: com.applovin.exoplayer2.a.a$a, reason: collision with other inner class name */
    public static final class C0069a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ba.a f3922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.applovin.exoplayer2.common.a.s<com.applovin.exoplayer2.h.p.a> f3923b = com.applovin.exoplayer2.common.a.s.g();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.applovin.exoplayer2.common.a.u<com.applovin.exoplayer2.h.p.a, ba> f3924c = com.applovin.exoplayer2.common.a.u.a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private com.applovin.exoplayer2.h.p.a f3925d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private com.applovin.exoplayer2.h.p.a f3926e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private com.applovin.exoplayer2.h.p.a f3927f;

        public C0069a(ba.a aVar) {
            this.f3922a = aVar;
        }

        private static com.applovin.exoplayer2.h.p.a a(an anVar, com.applovin.exoplayer2.common.a.s<com.applovin.exoplayer2.h.p.a> sVar, com.applovin.exoplayer2.h.p.a aVar, ba.a aVar2) {
            ba baVarS = anVar.S();
            int iF = anVar.F();
            Object objA = baVarS.d() ? null : baVarS.a(iF);
            int iB = (anVar.K() || baVarS.d()) ? -1 : baVarS.a(iF, aVar2).b(com.applovin.exoplayer2.h.b(anVar.I()) - aVar2.c());
            for (int i10 = 0; i10 < sVar.size(); i10++) {
                com.applovin.exoplayer2.h.p.a aVar3 = sVar.get(i10);
                if (a(aVar3, objA, anVar.K(), anVar.L(), anVar.M(), iB)) {
                    return aVar3;
                }
            }
            if (sVar.isEmpty() && aVar != null) {
                if (a(aVar, objA, anVar.K(), anVar.L(), anVar.M(), iB)) {
                    return aVar;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0056  */
        private void a(ba baVar) {
            com.applovin.exoplayer2.common.a.u.a<com.applovin.exoplayer2.h.p.a, ba> aVarB = com.applovin.exoplayer2.common.a.u.b();
            if (this.f3923b.isEmpty()) {
                a(aVarB, this.f3926e, baVar);
                if (!Objects.equal(this.f3927f, this.f3926e)) {
                    a(aVarB, this.f3927f, baVar);
                }
                if (!Objects.equal(this.f3925d, this.f3926e) && !Objects.equal(this.f3925d, this.f3927f)) {
                    a(aVarB, this.f3925d, baVar);
                }
            } else {
                for (int i10 = 0; i10 < this.f3923b.size(); i10++) {
                    a(aVarB, this.f3923b.get(i10), baVar);
                }
                if (!this.f3923b.contains(this.f3925d)) {
                    a(aVarB, this.f3925d, baVar);
                }
            }
            this.f3924c = aVarB.a();
        }

        private void a(com.applovin.exoplayer2.common.a.u.a<com.applovin.exoplayer2.h.p.a, ba> aVar, com.applovin.exoplayer2.h.p.a aVar2, ba baVar) {
            if (aVar2 == null) {
                return;
            }
            if (baVar.c(aVar2.f6608a) == -1 && (baVar = this.f3924c.get(aVar2)) == null) {
                return;
            }
            aVar.a(aVar2, baVar);
        }

        private static boolean a(com.applovin.exoplayer2.h.p.a aVar, Object obj, boolean z10, int i10, int i11, int i12) {
            if (aVar.f6608a.equals(obj)) {
                return (z10 && aVar.f6609b == i10 && aVar.f6610c == i11) || (!z10 && aVar.f6609b == -1 && aVar.f6612e == i12);
            }
            return false;
        }

        public ba a(com.applovin.exoplayer2.h.p.a aVar) {
            return this.f3924c.get(aVar);
        }

        public com.applovin.exoplayer2.h.p.a a() {
            return this.f3925d;
        }

        public void a(an anVar) {
            this.f3925d = a(anVar, this.f3923b, this.f3926e, this.f3922a);
        }

        public void a(List<com.applovin.exoplayer2.h.p.a> list, com.applovin.exoplayer2.h.p.a aVar, an anVar) {
            this.f3923b = com.applovin.exoplayer2.common.a.s.a((Collection) list);
            if (!list.isEmpty()) {
                this.f3926e = list.get(0);
                this.f3927f = (com.applovin.exoplayer2.h.p.a) com.applovin.exoplayer2.l.a.b(aVar);
            }
            if (this.f3925d == null) {
                this.f3925d = a(anVar, this.f3923b, this.f3926e, this.f3922a);
            }
            a(anVar.S());
        }

        public com.applovin.exoplayer2.h.p.a b() {
            return this.f3926e;
        }

        public void b(an anVar) {
            this.f3925d = a(anVar, this.f3923b, this.f3926e, this.f3922a);
            a(anVar.S());
        }

        public com.applovin.exoplayer2.h.p.a c() {
            return this.f3927f;
        }

        public com.applovin.exoplayer2.h.p.a d() {
            if (this.f3923b.isEmpty()) {
                return null;
            }
            return (com.applovin.exoplayer2.h.p.a) com.applovin.exoplayer2.common.a.x.c(this.f3923b);
        }
    }

    public a(com.applovin.exoplayer2.l.d dVar) {
        this.f3913a = (com.applovin.exoplayer2.l.d) com.applovin.exoplayer2.l.a.b(dVar);
        this.f3918f = new com.applovin.exoplayer2.l.p<>(ai.c(), dVar, p.f3988d);
        ba.a aVar = new ba.a();
        this.f3914b = aVar;
        this.f3915c = new ba.c();
        this.f3916d = new C0069a(aVar);
        this.f3917e = new SparseArray<>();
    }

    private b.a a(com.applovin.exoplayer2.h.p.a aVar) {
        com.applovin.exoplayer2.l.a.b(this.f3919g);
        ba baVarA = aVar == null ? null : this.f3916d.a(aVar);
        if (aVar != null && baVarA != null) {
            return a(baVarA, baVarA.a(aVar.f6608a, this.f3914b).f4678c, aVar);
        }
        int iG = this.f3919g.G();
        ba baVarS = this.f3919g.S();
        if (!(iG < baVarS.b())) {
            baVarS = ba.f4673a;
        }
        return a(baVarS, iG, (com.applovin.exoplayer2.h.p.a) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(b.a aVar, int i10, b bVar) {
        bVar.c(aVar);
        bVar.f(aVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(b.a aVar, int i10, an.e eVar, an.e eVar2, b bVar) {
        bVar.d(aVar, i10);
        bVar.a(aVar, eVar, eVar2, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(b.a aVar, com.applovin.exoplayer2.c.e eVar, b bVar) {
        bVar.d(aVar, eVar);
        bVar.b(aVar, 2, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(b.a aVar, com.applovin.exoplayer2.m.o oVar, b bVar) {
        bVar.a(aVar, oVar);
        bVar.a(aVar, oVar.f7880b, oVar.f7881c, oVar.f7882d, oVar.f7883e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(b.a aVar, com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.c.h hVar, b bVar) {
        bVar.b(aVar, vVar);
        bVar.b(aVar, vVar, hVar);
        bVar.a(aVar, 2, vVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(b.a aVar, String str, long j10, long j11, b bVar) {
        bVar.b(aVar, str, j10);
        bVar.b(aVar, str, j11, j10);
        bVar.a(aVar, 2, str, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(b bVar, com.applovin.exoplayer2.l.m mVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(an anVar, b bVar, com.applovin.exoplayer2.l.m mVar) {
        bVar.a(anVar, new b.C0070b(mVar, this.f3917e));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(b.a aVar, com.applovin.exoplayer2.c.e eVar, b bVar) {
        bVar.c(aVar, eVar);
        bVar.a(aVar, 2, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(b.a aVar, com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.c.h hVar, b bVar) {
        bVar.a(aVar, vVar);
        bVar.a(aVar, vVar, hVar);
        bVar.a(aVar, 1, vVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(b.a aVar, String str, long j10, long j11, b bVar) {
        bVar.a(aVar, str, j10);
        bVar.a(aVar, str, j11, j10);
        bVar.a(aVar, 1, str, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(b.a aVar, com.applovin.exoplayer2.c.e eVar, b bVar) {
        bVar.b(aVar, eVar);
        bVar.b(aVar, 1, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(b.a aVar, boolean z10, b bVar) {
        bVar.d(aVar, z10);
        bVar.c(aVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(b.a aVar, com.applovin.exoplayer2.c.e eVar, b bVar) {
        bVar.a(aVar, eVar);
        bVar.a(aVar, 1, eVar);
    }

    private b.a f() {
        return a(this.f3916d.b());
    }

    private b.a f(int i10, com.applovin.exoplayer2.h.p.a aVar) {
        com.applovin.exoplayer2.l.a.b(this.f3919g);
        if (aVar != null) {
            return this.f3916d.a(aVar) != null ? a(aVar) : a(ba.f4673a, i10, aVar);
        }
        ba baVarS = this.f3919g.S();
        if (!(i10 < baVarS.b())) {
            baVarS = ba.f4673a;
        }
        return a(baVarS, i10, (com.applovin.exoplayer2.h.p.a) null);
    }

    private b.a g() {
        return a(this.f3916d.c());
    }

    private b.a h() {
        return a(this.f3916d.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        this.f3918f.b();
    }

    public final b.a a(ba baVar, int i10, com.applovin.exoplayer2.h.p.a aVar) {
        long jN;
        com.applovin.exoplayer2.h.p.a aVar2 = baVar.d() ? null : aVar;
        long jA = this.f3913a.a();
        boolean z10 = baVar.equals(this.f3919g.S()) && i10 == this.f3919g.G();
        long jA2 = 0;
        if (aVar2 == null || !aVar2.a()) {
            if (z10) {
                jN = this.f3919g.N();
            } else if (!baVar.d()) {
                jA2 = baVar.a(i10, this.f3915c).a();
            }
            return new b.a(jA, baVar, i10, aVar2, jN, this.f3919g.S(), this.f3919g.G(), this.f3916d.a(), this.f3919g.I(), this.f3919g.J());
        }
        if (z10 && this.f3919g.L() == aVar2.f6609b && this.f3919g.M() == aVar2.f6610c) {
            jA2 = this.f3919g.I();
        }
        jN = jA2;
        return new b.a(jA, baVar, i10, aVar2, jN, this.f3919g.S(), this.f3919g.G(), this.f3916d.a(), this.f3919g.I(), this.f3919g.J());
    }

    @Override // com.applovin.exoplayer2.an.d
    public final void a(float f10) {
        b.a aVarG = g();
        a(aVarG, 1019, new i(aVarG, f10));
    }

    @Override // com.applovin.exoplayer2.an.d
    public void a(int i10, int i11) {
        b.a aVarG = g();
        a(aVarG, 1029, new j(aVarG, i10, i11));
    }

    @Override // com.applovin.exoplayer2.m.n
    public final void a(int i10, long j10) {
        b.a aVarF = f();
        a(aVarF, 1023, new n(aVarF, i10, j10));
    }

    @Override // com.applovin.exoplayer2.b.g
    public final void a(int i10, long j10, long j11) {
        b.a aVarG = g();
        a(aVarG, 1012, new q(aVarG, i10, j10, j11, 1));
    }

    @Override // com.applovin.exoplayer2.d.g
    public final void a(int i10, com.applovin.exoplayer2.h.p.a aVar) {
        b.a aVarF = f(i10, aVar);
        a(aVarF, 1031, new c(aVarF, 2));
    }

    @Override // com.applovin.exoplayer2.d.g
    public final void a(int i10, com.applovin.exoplayer2.h.p.a aVar, int i11) {
        b.a aVarF = f(i10, aVar);
        a(aVarF, 1030, new o(aVarF, i11, 1));
    }

    @Override // com.applovin.exoplayer2.h.q
    public final void a(int i10, com.applovin.exoplayer2.h.p.a aVar, com.applovin.exoplayer2.h.j jVar, com.applovin.exoplayer2.h.m mVar) {
        b.a aVarF = f(i10, aVar);
        a(aVarF, 1000, new s(aVarF, jVar, mVar, 0));
    }

    @Override // com.applovin.exoplayer2.h.q
    public final void a(int i10, com.applovin.exoplayer2.h.p.a aVar, com.applovin.exoplayer2.h.j jVar, com.applovin.exoplayer2.h.m mVar, IOException iOException, boolean z10) {
        b.a aVarF = f(i10, aVar);
        a(aVarF, 1003, new l(aVarF, jVar, mVar, iOException, z10));
    }

    @Override // com.applovin.exoplayer2.h.q
    public final void a(int i10, com.applovin.exoplayer2.h.p.a aVar, com.applovin.exoplayer2.h.m mVar) {
        b.a aVarF = f(i10, aVar);
        a(aVarF, 1004, new e(aVarF, mVar));
    }

    @Override // com.applovin.exoplayer2.d.g
    public final void a(int i10, com.applovin.exoplayer2.h.p.a aVar, Exception exc) {
        b.a aVarF = f(i10, aVar);
        a(aVarF, 1032, new u(aVarF, exc, 2));
    }

    @Override // com.applovin.exoplayer2.b.g
    public final void a(long j10) {
        b.a aVarG = g();
        a(aVarG, 1011, new m(aVarG, j10));
    }

    @Override // com.applovin.exoplayer2.m.n
    public final void a(long j10, int i10) {
        b.a aVarF = f();
        a(aVarF, 1026, new n(aVarF, j10, i10));
    }

    public final void a(b.a aVar, int i10, com.applovin.exoplayer2.l.p.a<b> aVar2) {
        this.f3917e.put(i10, aVar);
        this.f3918f.b(i10, aVar2);
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public final void a(ab abVar, int i10) {
        b.a aVarE = e();
        a(aVarE, 1, new g(aVarE, abVar, i10));
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public void a(ac acVar) {
        b.a aVarE = e();
        a(aVarE, 14, new e(aVarE, acVar));
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public final void a(ak akVar) {
        com.applovin.exoplayer2.h.o oVar;
        b.a aVarA = (!(akVar instanceof com.applovin.exoplayer2.p) || (oVar = ((com.applovin.exoplayer2.p) akVar).f7923f) == null) ? null : a(new com.applovin.exoplayer2.h.p.a(oVar));
        if (aVarA == null) {
            aVarA = e();
        }
        a(aVarA, 10, new e(aVarA, akVar));
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public final void a(am amVar) {
        b.a aVarE = e();
        a(aVarE, 12, new e(aVarE, amVar));
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public void a(an.a aVar) {
        b.a aVarE = e();
        a(aVarE, 13, new e(aVarE, aVar));
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public final void a(an.e eVar, an.e eVar2, int i10) {
        if (i10 == 1) {
            this.f3921i = false;
        }
        this.f3916d.a((an) com.applovin.exoplayer2.l.a.b(this.f3919g));
        b.a aVarE = e();
        a(aVarE, 11, new k(aVarE, i10, eVar, eVar2));
    }

    public void a(an anVar, Looper looper) {
        com.applovin.exoplayer2.l.a.b(this.f3919g == null || this.f3916d.f3923b.isEmpty());
        this.f3919g = (an) com.applovin.exoplayer2.l.a.b(anVar);
        this.f3920h = this.f3913a.a(looper, null);
        this.f3918f = this.f3918f.a(looper, new e(this, anVar));
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public final void a(ba baVar, int i10) {
        this.f3916d.b((an) com.applovin.exoplayer2.l.a.b(this.f3919g));
        b.a aVarE = e();
        a(aVarE, 0, new o(aVarE, i10, 4));
    }

    @Override // com.applovin.exoplayer2.m.n
    public final void a(com.applovin.exoplayer2.c.e eVar) {
        b.a aVarG = g();
        a(aVarG, 1020, new r(aVarG, eVar, 0));
    }

    @Override // com.applovin.exoplayer2.an.d
    public final void a(com.applovin.exoplayer2.g.a aVar) {
        b.a aVarE = e();
        a(aVarE, 1007, new e(aVarE, aVar));
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public final void a(ad adVar, com.applovin.exoplayer2.j.h hVar) {
        b.a aVarE = e();
        a(aVarE, 2, new f(aVarE, adVar, hVar));
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.m.n
    public final void a(com.applovin.exoplayer2.m.o oVar) {
        b.a aVarG = g();
        a(aVarG, 1028, new e(aVarG, oVar));
    }

    @Override // com.applovin.exoplayer2.m.n
    public final void a(com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.c.h hVar) {
        b.a aVarG = g();
        a(aVarG, 1022, new t(aVarG, vVar, hVar, 0));
    }

    @Override // com.applovin.exoplayer2.m.n
    public final void a(Exception exc) {
        b.a aVarG = g();
        a(aVarG, 1038, new u(aVarG, exc, 0));
    }

    @Override // com.applovin.exoplayer2.m.n
    public final void a(Object obj, long j10) {
        b.a aVarG = g();
        a(aVarG, 1027, new h(aVarG, obj, j10));
    }

    @Override // com.applovin.exoplayer2.m.n
    public final void a(String str) {
        b.a aVarG = g();
        a(aVarG, 1024, new v(aVarG, str, 1));
    }

    @Override // com.applovin.exoplayer2.m.n
    public final void a(String str, long j10, long j11) {
        b.a aVarG = g();
        a(aVarG, 1021, new w(aVarG, str, j11, j10, 1));
    }

    public final void a(List<com.applovin.exoplayer2.h.p.a> list, com.applovin.exoplayer2.h.p.a aVar) {
        this.f3916d.a(list, aVar, (an) com.applovin.exoplayer2.l.a.b(this.f3919g));
    }

    @Override // com.applovin.exoplayer2.an.b
    public final void a(boolean z10, int i10) {
        b.a aVarE = e();
        a(aVarE, -1, new d(aVarE, z10, i10, 1));
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.b.g
    public final void a_(boolean z10) {
        b.a aVarG = g();
        a(aVarG, 1017, new x(aVarG, z10, 3));
    }

    @Override // com.applovin.exoplayer2.an.b
    public final void b() {
        b.a aVarE = e();
        a(aVarE, -1, new c(aVarE, 6));
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public final void b(int i10) {
        b.a aVarE = e();
        a(aVarE, 4, new o(aVarE, i10, 3));
    }

    @Override // com.applovin.exoplayer2.k.d.a
    public final void b(int i10, long j10, long j11) {
        b.a aVarH = h();
        a(aVarH, 1006, new q(aVarH, i10, j10, j11, 0));
    }

    @Override // com.applovin.exoplayer2.d.g
    public final void b(int i10, com.applovin.exoplayer2.h.p.a aVar) {
        b.a aVarF = f(i10, aVar);
        a(aVarF, 1033, new c(aVarF, 4));
    }

    @Override // com.applovin.exoplayer2.h.q
    public final void b(int i10, com.applovin.exoplayer2.h.p.a aVar, com.applovin.exoplayer2.h.j jVar, com.applovin.exoplayer2.h.m mVar) {
        b.a aVarF = f(i10, aVar);
        a(aVarF, 1001, new s(aVarF, jVar, mVar, 2));
    }

    @Override // com.applovin.exoplayer2.m.n
    public final void b(com.applovin.exoplayer2.c.e eVar) {
        b.a aVarF = f();
        a(aVarF, 1025, new r(aVarF, eVar, 1));
    }

    @Override // com.applovin.exoplayer2.b.g
    public final void b(com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.c.h hVar) {
        b.a aVarG = g();
        a(aVarG, 1010, new t(aVarG, vVar, hVar, 1));
    }

    @Override // com.applovin.exoplayer2.b.g
    public final void b(Exception exc) {
        b.a aVarG = g();
        a(aVarG, 1018, new u(aVarG, exc, 3));
    }

    @Override // com.applovin.exoplayer2.b.g
    public final void b(String str) {
        b.a aVarG = g();
        a(aVarG, 1013, new v(aVarG, str, 0));
    }

    @Override // com.applovin.exoplayer2.b.g
    public final void b(String str, long j10, long j11) {
        b.a aVarG = g();
        a(aVarG, 1009, new w(aVarG, str, j11, j10, 0));
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public final void b(boolean z10, int i10) {
        b.a aVarE = e();
        a(aVarE, 5, new d(aVarE, z10, i10, 0));
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public final void b_(boolean z10) {
        b.a aVarE = e();
        a(aVarE, 3, new x(aVarE, z10, 1));
    }

    public void c() {
        b.a aVarE = e();
        this.f3917e.put(1036, aVarE);
        a(aVarE, 1036, new c(aVarE, 0));
        ((com.applovin.exoplayer2.l.o) com.applovin.exoplayer2.l.a.a(this.f3920h)).a((Runnable) new androidx.activity.c(this));
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public final void c(int i10) {
        b.a aVarE = e();
        a(aVarE, 6, new o(aVarE, i10, 0));
    }

    @Override // com.applovin.exoplayer2.d.g
    public final void c(int i10, com.applovin.exoplayer2.h.p.a aVar) {
        b.a aVarF = f(i10, aVar);
        a(aVarF, 1034, new c(aVarF, 1));
    }

    @Override // com.applovin.exoplayer2.h.q
    public final void c(int i10, com.applovin.exoplayer2.h.p.a aVar, com.applovin.exoplayer2.h.j jVar, com.applovin.exoplayer2.h.m mVar) {
        b.a aVarF = f(i10, aVar);
        a(aVarF, 1002, new s(aVarF, jVar, mVar, 1));
    }

    @Override // com.applovin.exoplayer2.b.g
    public final void c(com.applovin.exoplayer2.c.e eVar) {
        b.a aVarG = g();
        a(aVarG, 1008, new r(aVarG, eVar, 2));
    }

    @Override // com.applovin.exoplayer2.b.g
    public final void c(Exception exc) {
        b.a aVarG = g();
        a(aVarG, 1037, new u(aVarG, exc, 1));
    }

    public final void d() {
        if (this.f3921i) {
            return;
        }
        b.a aVarE = e();
        this.f3921i = true;
        a(aVarE, -1, new c(aVarE, 5));
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public final void d(int i10) {
        b.a aVarE = e();
        a(aVarE, 8, new o(aVarE, i10, 2));
    }

    @Override // com.applovin.exoplayer2.d.g
    public final void d(int i10, com.applovin.exoplayer2.h.p.a aVar) {
        b.a aVarF = f(i10, aVar);
        a(aVarF, 1035, new c(aVarF, 3));
    }

    @Override // com.applovin.exoplayer2.b.g
    public final void d(com.applovin.exoplayer2.c.e eVar) {
        b.a aVarF = f();
        a(aVarF, 1014, new r(aVarF, eVar, 3));
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public void d(boolean z10) {
        b.a aVarE = e();
        a(aVarE, 7, new x(aVarE, z10, 2));
    }

    public final b.a e() {
        return a(this.f3916d.a());
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public final void e(boolean z10) {
        b.a aVarE = e();
        a(aVarE, 9, new x(aVarE, z10, 0));
    }
}
