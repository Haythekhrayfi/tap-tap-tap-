package com.applovin.exoplayer2;

import android.os.Handler;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
final class af {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ba.a f4188a = new ba.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ba.c f4189b = new ba.c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.exoplayer2.a.a f4190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f4191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f4192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f4193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f4194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ad f4195h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ad f4196i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ad f4197j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f4198k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Object f4199l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f4200m;

    public af(com.applovin.exoplayer2.a.a aVar, Handler handler) {
        this.f4190c = aVar;
        this.f4191d = handler;
    }

    private long a(ba baVar, Object obj) {
        int iC;
        int i10 = baVar.a(obj, this.f4188a).f4678c;
        Object obj2 = this.f4199l;
        if (obj2 != null && (iC = baVar.c(obj2)) != -1 && baVar.a(iC, this.f4188a).f4678c == i10) {
            return this.f4200m;
        }
        ad adVarG = this.f4195h;
        while (adVarG != null) {
            if (adVarG.f4165b.equals(obj)) {
                return adVarG.f4169f.f4179a.f6611d;
            }
            adVarG = adVarG.g();
        }
        adVarG = this.f4195h;
        while (adVarG != null) {
            int iC2 = baVar.c(adVarG.f4165b);
            if (iC2 != -1 && baVar.a(iC2, this.f4188a).f4678c == i10) {
                return adVarG.f4169f.f4179a.f6611d;
            }
            adVarG = adVarG.g();
        }
        long j10 = this.f4192e;
        this.f4192e = 1 + j10;
        if (this.f4195h == null) {
            this.f4199l = obj;
            this.f4200m = j10;
        }
        return j10;
    }

    private long a(ba baVar, Object obj, int i10) {
        baVar.a(obj, this.f4188a);
        long jA = this.f4188a.a(i10);
        return jA == Long.MIN_VALUE ? this.f4188a.f4679d : this.f4188a.f(i10) + jA;
    }

    private ae a(al alVar) {
        return a(alVar.f4232a, alVar.f4233b, alVar.f4234c, alVar.f4250s);
    }

    private ae a(ba baVar, ad adVar, long j10) {
        long j11;
        ae aeVar = adVar.f4169f;
        long jA = (adVar.a() + aeVar.f4183e) - j10;
        if (aeVar.f4185g) {
            long j12 = 0;
            int iA = baVar.a(baVar.c(aeVar.f4179a.f6608a), this.f4188a, this.f4189b, this.f4193f, this.f4194g);
            if (iA == -1) {
                return null;
            }
            int i10 = baVar.a(iA, this.f4188a, true).f4678c;
            Object obj = this.f4188a.f4677b;
            long j13 = aeVar.f4179a.f6611d;
            if (baVar.a(i10, this.f4189b).f4705p == iA) {
                Pair<Object, Long> pairA = baVar.a(this.f4189b, this.f4188a, i10, -9223372036854775807L, Math.max(0L, jA));
                if (pairA == null) {
                    return null;
                }
                obj = pairA.first;
                long jLongValue = ((Long) pairA.second).longValue();
                ad adVarG = adVar.g();
                if (adVarG == null || !adVarG.f4165b.equals(obj)) {
                    j13 = this.f4192e;
                    this.f4192e = 1 + j13;
                } else {
                    j13 = adVarG.f4169f.f4179a.f6611d;
                }
                j11 = jLongValue;
                j12 = -9223372036854775807L;
            } else {
                j11 = 0;
            }
            return a(baVar, a(baVar, obj, j11, j13, this.f4188a), j12, j11);
        }
        com.applovin.exoplayer2.h.p.a aVar = aeVar.f4179a;
        baVar.a(aVar.f6608a, this.f4188a);
        if (!aVar.a()) {
            int iB = this.f4188a.b(aVar.f6612e);
            if (iB != this.f4188a.d(aVar.f6612e)) {
                return a(baVar, aVar.f6608a, aVar.f6612e, iB, aeVar.f4183e, aVar.f6611d);
            }
            return a(baVar, aVar.f6608a, a(baVar, aVar.f6608a, aVar.f6612e), aeVar.f4183e, aVar.f6611d);
        }
        int i11 = aVar.f6609b;
        int iD = this.f4188a.d(i11);
        if (iD == -1) {
            return null;
        }
        int iA2 = this.f4188a.a(i11, aVar.f6610c);
        if (iA2 < iD) {
            return a(baVar, aVar.f6608a, i11, iA2, aeVar.f4181c, aVar.f6611d);
        }
        long jLongValue2 = aeVar.f4181c;
        if (jLongValue2 == -9223372036854775807L) {
            ba.c cVar = this.f4189b;
            ba.a aVar2 = this.f4188a;
            Pair<Object, Long> pairA2 = baVar.a(cVar, aVar2, aVar2.f4678c, -9223372036854775807L, Math.max(0L, jA));
            if (pairA2 == null) {
                return null;
            }
            jLongValue2 = ((Long) pairA2.second).longValue();
        }
        return a(baVar, aVar.f6608a, Math.max(a(baVar, aVar.f6608a, aVar.f6609b), jLongValue2), aeVar.f4181c, aVar.f6611d);
    }

    private ae a(ba baVar, com.applovin.exoplayer2.h.p.a aVar, long j10, long j11) {
        baVar.a(aVar.f6608a, this.f4188a);
        boolean zA = aVar.a();
        Object obj = aVar.f6608a;
        return zA ? a(baVar, obj, aVar.f6609b, aVar.f6610c, j10, aVar.f6611d) : a(baVar, obj, j11, j10, aVar.f6611d);
    }

    private ae a(ba baVar, Object obj, int i10, int i11, long j10, long j11) {
        com.applovin.exoplayer2.h.p.a aVar = new com.applovin.exoplayer2.h.p.a(obj, i10, i11, j11);
        long jB = baVar.a(aVar.f6608a, this.f4188a).b(aVar.f6609b, aVar.f6610c);
        long jF = i11 == this.f4188a.b(i10) ? this.f4188a.f() : 0L;
        return new ae(aVar, (jB == -9223372036854775807L || jF < jB) ? jF : Math.max(0L, jB - 1), j10, -9223372036854775807L, jB, this.f4188a.e(aVar.f6609b), false, false, false);
    }

    private ae a(ba baVar, Object obj, long j10, long j11, long j12) {
        long jMax = j10;
        baVar.a(obj, this.f4188a);
        int iB = this.f4188a.b(jMax);
        com.applovin.exoplayer2.h.p.a aVar = new com.applovin.exoplayer2.h.p.a(obj, j12, iB);
        boolean zA = a(aVar);
        boolean zA2 = a(baVar, aVar);
        boolean zA3 = a(baVar, aVar, zA);
        boolean z10 = iB != -1 && this.f4188a.e(iB);
        long jA = iB != -1 ? this.f4188a.a(iB) : -9223372036854775807L;
        long j13 = (jA == -9223372036854775807L || jA == Long.MIN_VALUE) ? this.f4188a.f4679d : jA;
        if (j13 != -9223372036854775807L && jMax >= j13) {
            jMax = Math.max(0L, j13 - 1);
        }
        return new ae(aVar, jMax, j11, jA, j13, z10, zA, zA2, zA3);
    }

    private static com.applovin.exoplayer2.h.p.a a(ba baVar, Object obj, long j10, long j11, ba.a aVar) {
        baVar.a(obj, aVar);
        int iA = aVar.a(j10);
        return iA == -1 ? new com.applovin.exoplayer2.h.p.a(obj, j11, aVar.b(j10)) : new com.applovin.exoplayer2.h.p.a(obj, iA, aVar.b(iA), j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.exoplayer2.common.a.s.a aVar, com.applovin.exoplayer2.h.p.a aVar2) {
        this.f4190c.a(aVar.a(), aVar2);
    }

    private boolean a(long j10, long j11) {
        return j10 == -9223372036854775807L || j10 == j11;
    }

    private boolean a(ae aeVar, ae aeVar2) {
        return aeVar.f4180b == aeVar2.f4180b && aeVar.f4179a.equals(aeVar2.f4179a);
    }

    private boolean a(ba baVar) {
        ad adVarG = this.f4195h;
        if (adVarG == null) {
            return true;
        }
        int iC = baVar.c(adVarG.f4165b);
        while (true) {
            iC = baVar.a(iC, this.f4188a, this.f4189b, this.f4193f, this.f4194g);
            while (adVarG.g() != null && !adVarG.f4169f.f4185g) {
                adVarG = adVarG.g();
            }
            ad adVarG2 = adVarG.g();
            if (iC == -1 || adVarG2 == null || baVar.c(adVarG2.f4165b) != iC) {
                break;
            }
            adVarG = adVarG2;
        }
        boolean zA = a(adVarG);
        adVarG.f4169f = a(baVar, adVarG.f4169f);
        return !zA;
    }

    private boolean a(ba baVar, com.applovin.exoplayer2.h.p.a aVar) {
        if (a(aVar)) {
            return baVar.a(baVar.a(aVar.f6608a, this.f4188a).f4678c, this.f4189b).f4706q == baVar.c(aVar.f6608a);
        }
        return false;
    }

    private boolean a(ba baVar, com.applovin.exoplayer2.h.p.a aVar, boolean z10) {
        int iC = baVar.c(aVar.f6608a);
        return !baVar.a(baVar.a(iC, this.f4188a).f4678c, this.f4189b).f4699j && baVar.b(iC, this.f4188a, this.f4189b, this.f4193f, this.f4194g) && z10;
    }

    private boolean a(com.applovin.exoplayer2.h.p.a aVar) {
        return !aVar.a() && aVar.f6612e == -1;
    }

    private void h() {
        if (this.f4190c != null) {
            final com.applovin.exoplayer2.common.a.s.a aVarI = com.applovin.exoplayer2.common.a.s.i();
            for (ad adVarG = this.f4195h; adVarG != null; adVarG = adVarG.g()) {
                aVarI.a(adVarG.f4169f.f4179a);
            }
            ad adVar = this.f4196i;
            final com.applovin.exoplayer2.h.p.a aVar = adVar == null ? null : adVar.f4169f.f4179a;
            this.f4191d.post(new Runnable() { // from class: com.applovin.exoplayer2.a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4042c.a(aVarI, aVar);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public ad a(as[] asVarArr, com.applovin.exoplayer2.j.j jVar, com.applovin.exoplayer2.k.b bVar, ah ahVar, ae aeVar, com.applovin.exoplayer2.j.k kVar) {
        long jA;
        ad adVar = this.f4197j;
        if (adVar != null) {
            jA = (adVar.a() + this.f4197j.f4169f.f4183e) - aeVar.f4180b;
        } else if (aeVar.f4179a.a()) {
            jA = aeVar.f4181c;
            if (jA == -9223372036854775807L) {
                jA = 0;
            }
        } else {
            jA = 0;
        }
        ad adVar2 = new ad(asVarArr, jA, jVar, bVar, ahVar, aeVar, kVar);
        ad adVar3 = this.f4197j;
        if (adVar3 != null) {
            adVar3.a(adVar2);
        } else {
            this.f4195h = adVar2;
            this.f4196i = adVar2;
        }
        this.f4199l = null;
        this.f4197j = adVar2;
        this.f4198k++;
        h();
        return adVar2;
    }

    public ae a(long j10, al alVar) {
        ad adVar = this.f4197j;
        return adVar == null ? a(alVar) : a(alVar.f4232a, adVar, j10);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    /* JADX WARN: Code duplicated, block: B:29:0x007a  */
    public ae a(ba baVar, ae aeVar) {
        long jA;
        long j10;
        int i10;
        boolean zE;
        int i11;
        com.applovin.exoplayer2.h.p.a aVar = aeVar.f4179a;
        boolean zA = a(aVar);
        boolean zA2 = a(baVar, aVar);
        boolean zA3 = a(baVar, aVar, zA);
        baVar.a(aeVar.f4179a.f6608a, this.f4188a);
        long jA2 = (aVar.a() || (i11 = aVar.f6612e) == -1) ? -9223372036854775807L : this.f4188a.a(i11);
        if (!aVar.a()) {
            if (jA2 == -9223372036854775807L || jA2 == Long.MIN_VALUE) {
                jA = this.f4188a.a();
            } else {
                j10 = jA2;
            }
            if (aVar.a()) {
                zE = this.f4188a.e(aVar.f6609b);
            } else {
                i10 = aVar.f6612e;
                if (i10 == -1 && this.f4188a.e(i10)) {
                    zE = true;
                } else {
                    zE = false;
                }
            }
            return new ae(aVar, aeVar.f4180b, aeVar.f4181c, jA2, j10, zE, zA, zA2, zA3);
        }
        jA = this.f4188a.b(aVar.f6609b, aVar.f6610c);
        j10 = jA;
        if (aVar.a()) {
            zE = this.f4188a.e(aVar.f6609b);
        } else {
            i10 = aVar.f6612e;
            if (i10 == -1) {
                zE = false;
            } else {
                zE = false;
            }
        }
        return new ae(aVar, aeVar.f4180b, aeVar.f4181c, jA2, j10, zE, zA, zA2, zA3);
    }

    public com.applovin.exoplayer2.h.p.a a(ba baVar, Object obj, long j10) {
        return a(baVar, obj, j10, a(baVar, obj), this.f4188a);
    }

    public void a(long j10) {
        ad adVar = this.f4197j;
        if (adVar != null) {
            adVar.d(j10);
        }
    }

    public boolean a() {
        ad adVar = this.f4197j;
        return adVar == null || (!adVar.f4169f.f4187i && adVar.c() && this.f4197j.f4169f.f4183e != -9223372036854775807L && this.f4198k < 100);
    }

    public boolean a(ad adVar) {
        boolean z10 = false;
        com.applovin.exoplayer2.l.a.b(adVar != null);
        if (adVar.equals(this.f4197j)) {
            return false;
        }
        this.f4197j = adVar;
        while (adVar.g() != null) {
            adVar = adVar.g();
            if (adVar == this.f4196i) {
                this.f4196i = this.f4195h;
                z10 = true;
            }
            adVar.f();
            this.f4198k--;
        }
        this.f4197j.a((ad) null);
        h();
        return z10;
    }

    public boolean a(ba baVar, int i10) {
        this.f4193f = i10;
        return a(baVar);
    }

    public boolean a(ba baVar, long j10, long j11) {
        ae aeVarA;
        ad adVarG = this.f4195h;
        ad adVar = null;
        while (adVarG != null) {
            ae aeVar = adVarG.f4169f;
            if (adVar != null) {
                ae aeVarA2 = a(baVar, adVar, j10);
                if (aeVarA2 != null && a(aeVar, aeVarA2)) {
                    aeVarA = aeVarA2;
                }
                return !a(adVar);
            }
            aeVarA = a(baVar, aeVar);
            adVarG.f4169f = aeVarA.b(aeVar.f4181c);
            if (!a(aeVar.f4183e, aeVarA.f4183e)) {
                adVarG.j();
                long j12 = aeVarA.f4183e;
                return (a(adVarG) || (adVarG == this.f4196i && !adVarG.f4169f.f4184f && ((j11 > Long.MIN_VALUE ? 1 : (j11 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j11 > ((j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1)) == 0 ? RecyclerView.FOREVER_NS : adVarG.a(j12)) ? 1 : (j11 == ((j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1)) == 0 ? RecyclerView.FOREVER_NS : adVarG.a(j12)) ? 0 : -1)) >= 0))) ? false : true;
            }
            adVar = adVarG;
            adVarG = adVarG.g();
        }
        return true;
    }

    public boolean a(ba baVar, boolean z10) {
        this.f4194g = z10;
        return a(baVar);
    }

    public boolean a(com.applovin.exoplayer2.h.n nVar) {
        ad adVar = this.f4197j;
        return adVar != null && adVar.f4164a == nVar;
    }

    public ad b() {
        return this.f4197j;
    }

    public ad c() {
        return this.f4195h;
    }

    public ad d() {
        return this.f4196i;
    }

    public ad e() {
        ad adVar = this.f4196i;
        com.applovin.exoplayer2.l.a.b((adVar == null || adVar.g() == null) ? false : true);
        this.f4196i = this.f4196i.g();
        h();
        return this.f4196i;
    }

    public ad f() {
        ad adVar = this.f4195h;
        if (adVar == null) {
            return null;
        }
        if (adVar == this.f4196i) {
            this.f4196i = adVar.g();
        }
        this.f4195h.f();
        int i10 = this.f4198k - 1;
        this.f4198k = i10;
        if (i10 == 0) {
            this.f4197j = null;
            ad adVar2 = this.f4195h;
            this.f4199l = adVar2.f4165b;
            this.f4200m = adVar2.f4169f.f4179a.f6611d;
        }
        this.f4195h = this.f4195h.g();
        h();
        return this.f4195h;
    }

    public void g() {
        if (this.f4198k == 0) {
            return;
        }
        ad adVarG = (ad) com.applovin.exoplayer2.l.a.a(this.f4195h);
        this.f4199l = adVarG.f4165b;
        this.f4200m = adVarG.f4169f.f4179a.f6611d;
        while (adVarG != null) {
            adVarG.f();
            adVarG = adVarG.g();
        }
        this.f4195h = null;
        this.f4197j = null;
        this.f4196i = null;
        this.f4198k = 0;
        h();
    }
}
