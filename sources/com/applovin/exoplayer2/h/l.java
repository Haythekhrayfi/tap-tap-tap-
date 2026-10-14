package com.applovin.exoplayer2.h;

import android.util.Pair;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.l.ai;

/* JADX INFO: loaded from: classes.dex */
public final class l extends e<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f6588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f6589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ba.c f6590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ba.a f6591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f6592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private k f6593f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f6594g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f6595h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f6596i;

    public static final class a extends h {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Object f6597d = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Object f6598e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Object f6599f;

        private a(ba baVar, Object obj, Object obj2) {
            super(baVar);
            this.f6598e = obj;
            this.f6599f = obj2;
        }

        public static a a(com.applovin.exoplayer2.ab abVar) {
            return new a(new b(abVar), ba.c.f4687a, f6597d);
        }

        public static a a(ba baVar, Object obj, Object obj2) {
            return new a(baVar, obj, obj2);
        }

        @Override // com.applovin.exoplayer2.h.h, com.applovin.exoplayer2.ba
        public ba.a a(int i10, ba.a aVar, boolean z10) {
            this.f6565c.a(i10, aVar, z10);
            if (ai.a(aVar.f4677b, this.f6599f) && z10) {
                aVar.f4677b = f6597d;
            }
            return aVar;
        }

        @Override // com.applovin.exoplayer2.h.h, com.applovin.exoplayer2.ba
        public ba.c a(int i10, ba.c cVar, long j10) {
            this.f6565c.a(i10, cVar, j10);
            if (ai.a(cVar.f4691b, this.f6598e)) {
                cVar.f4691b = ba.c.f4687a;
            }
            return cVar;
        }

        public a a(ba baVar) {
            return new a(baVar, this.f6598e, this.f6599f);
        }

        @Override // com.applovin.exoplayer2.h.h, com.applovin.exoplayer2.ba
        public Object a(int i10) {
            Object objA = this.f6565c.a(i10);
            return ai.a(objA, this.f6599f) ? f6597d : objA;
        }

        @Override // com.applovin.exoplayer2.h.h, com.applovin.exoplayer2.ba
        public int c(Object obj) {
            Object obj2;
            ba baVar = this.f6565c;
            if (f6597d.equals(obj) && (obj2 = this.f6599f) != null) {
                obj = obj2;
            }
            return baVar.c(obj);
        }
    }

    public static final class b extends ba {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.applovin.exoplayer2.ab f6600c;

        public b(com.applovin.exoplayer2.ab abVar) {
            this.f6600c = abVar;
        }

        @Override // com.applovin.exoplayer2.ba
        public ba.a a(int i10, ba.a aVar, boolean z10) {
            aVar.a(z10 ? 0 : null, z10 ? a.f6597d : null, 0, -9223372036854775807L, 0L, com.applovin.exoplayer2.h.a.a.f6468a, true);
            return aVar;
        }

        @Override // com.applovin.exoplayer2.ba
        public ba.c a(int i10, ba.c cVar, long j10) {
            cVar.a(ba.c.f4687a, this.f6600c, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            cVar.f4702m = true;
            return cVar;
        }

        @Override // com.applovin.exoplayer2.ba
        public Object a(int i10) {
            return a.f6597d;
        }

        @Override // com.applovin.exoplayer2.ba
        public int b() {
            return 1;
        }

        @Override // com.applovin.exoplayer2.ba
        public int c() {
            return 1;
        }

        @Override // com.applovin.exoplayer2.ba
        public int c(Object obj) {
            return obj == a.f6597d ? 0 : -1;
        }
    }

    public l(p pVar, boolean z10) {
        this.f6588a = pVar;
        this.f6589b = z10 && pVar.i();
        this.f6590c = new ba.c();
        this.f6591d = new ba.a();
        ba baVarH = pVar.h();
        if (baVarH == null) {
            this.f6592e = a.a(pVar.g());
        } else {
            this.f6592e = a.a(baVarH, (Object) null, (Object) null);
            this.f6596i = true;
        }
    }

    private Object a(Object obj) {
        return (this.f6592e.f6599f == null || !obj.equals(a.f6597d)) ? obj : this.f6592e.f6599f;
    }

    private void a(long j10) {
        k kVar = this.f6593f;
        int iC = this.f6592e.c(kVar.f6579a.f6608a);
        if (iC == -1) {
            return;
        }
        long j11 = this.f6592e.a(iC, this.f6591d).f4679d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        kVar.d(j10);
    }

    private Object b(Object obj) {
        return (this.f6592e.f6599f == null || !this.f6592e.f6599f.equals(obj)) ? obj : a.f6597d;
    }

    @Override // com.applovin.exoplayer2.h.p
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public k b(p.a aVar, com.applovin.exoplayer2.k.b bVar, long j10) {
        k kVar = new k(aVar, bVar, j10);
        kVar.a(this.f6588a);
        if (this.f6595h) {
            kVar.a(aVar.a(a(aVar.f6608a)));
        } else {
            this.f6593f = kVar;
            if (!this.f6594g) {
                this.f6594g = true;
                a((Object) null, this.f6588a);
            }
        }
        return kVar;
    }

    @Override // com.applovin.exoplayer2.h.e
    public p.a a(Void r10, p.a aVar) {
        return aVar.a(b(aVar.f6608a));
    }

    @Override // com.applovin.exoplayer2.h.p
    public void a(n nVar) {
        ((k) nVar).i();
        if (nVar == this.f6593f) {
            this.f6593f = null;
        }
    }

    @Override // com.applovin.exoplayer2.h.e, com.applovin.exoplayer2.h.a
    public void a(com.applovin.exoplayer2.k.aa aaVar) {
        super.a(aaVar);
        if (this.f6589b) {
            return;
        }
        this.f6594g = true;
        a((Object) null, this.f6588a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // com.applovin.exoplayer2.h.e
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void b(Void r13, p pVar, ba baVar) {
        long j10;
        p.a aVarA;
        if (this.f6595h) {
            this.f6592e = this.f6592e.a(baVar);
            k kVar = this.f6593f;
            if (kVar != null) {
                a(kVar.h());
            }
        } else {
            if (!baVar.d()) {
                baVar.a(0, this.f6590c);
                long jB = this.f6590c.b();
                Object obj = this.f6590c.f4691b;
                k kVar2 = this.f6593f;
                if (kVar2 != null) {
                    long jG = kVar2.g();
                    this.f6592e.a(this.f6593f.f6579a.f6608a, this.f6591d);
                    long jC = this.f6591d.c() + jG;
                    if (jC != this.f6592e.a(0, this.f6590c).b()) {
                        j10 = jC;
                    } else {
                        j10 = jB;
                    }
                } else {
                    j10 = jB;
                }
                Pair<Object, Long> pairA = baVar.a(this.f6590c, this.f6591d, 0, j10);
                Object obj2 = pairA.first;
                long jLongValue = ((Long) pairA.second).longValue();
                this.f6592e = this.f6596i ? this.f6592e.a(baVar) : a.a(baVar, obj, obj2);
                k kVar3 = this.f6593f;
                if (kVar3 != null) {
                    a(jLongValue);
                    p.a aVar = kVar3.f6579a;
                    aVarA = aVar.a(a(aVar.f6608a));
                }
                this.f6596i = true;
                this.f6595h = true;
                a((ba) this.f6592e);
                if (aVarA != null) {
                    ((k) com.applovin.exoplayer2.l.a.b(this.f6593f)).a(aVarA);
                }
            }
            this.f6592e = this.f6596i ? this.f6592e.a(baVar) : a.a(baVar, ba.c.f4687a, a.f6597d);
        }
        aVarA = null;
        this.f6596i = true;
        this.f6595h = true;
        a((ba) this.f6592e);
        if (aVarA != null) {
            ((k) com.applovin.exoplayer2.l.a.b(this.f6593f)).a(aVarA);
        }
    }

    @Override // com.applovin.exoplayer2.h.e, com.applovin.exoplayer2.h.a
    public void c() {
        this.f6595h = false;
        this.f6594g = false;
        super.c();
    }

    @Override // com.applovin.exoplayer2.h.e, com.applovin.exoplayer2.h.p
    public void e() {
    }

    public ba f() {
        return this.f6592e;
    }

    @Override // com.applovin.exoplayer2.h.p
    public com.applovin.exoplayer2.ab g() {
        return this.f6588a.g();
    }
}
