package com.applovin.exoplayer2;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends ba {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f3910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.applovin.exoplayer2.h.z f3911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f3912e;

    public a(boolean z10, com.applovin.exoplayer2.h.z zVar) {
        this.f3912e = z10;
        this.f3911d = zVar;
        this.f3910c = zVar.a();
    }

    private int a(int i10, boolean z10) {
        if (z10) {
            return this.f3911d.a(i10);
        }
        if (i10 < this.f3910c - 1) {
            return i10 + 1;
        }
        return -1;
    }

    public static Object a(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object a(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    private int b(int i10, boolean z10) {
        if (z10) {
            return this.f3911d.b(i10);
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    public static Object b(Object obj) {
        return ((Pair) obj).second;
    }

    @Override // com.applovin.exoplayer2.ba
    public int a(int i10, int i11, boolean z10) {
        if (this.f3912e) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int iC = c(i10);
        int iF = f(iC);
        int iA = d(iC).a(i10 - iF, i11 != 2 ? i11 : 0, z10);
        if (iA != -1) {
            return iF + iA;
        }
        int iA2 = a(iC, z10);
        while (iA2 != -1 && d(iA2).d()) {
            iA2 = a(iA2, z10);
        }
        if (iA2 != -1) {
            return d(iA2).b(z10) + f(iA2);
        }
        if (i11 == 2) {
            return b(z10);
        }
        return -1;
    }

    @Override // com.applovin.exoplayer2.ba
    public int a(boolean z10) {
        int i10 = this.f3910c;
        if (i10 == 0) {
            return -1;
        }
        if (this.f3912e) {
            z10 = false;
        }
        int iB = z10 ? this.f3911d.b() : i10 - 1;
        while (d(iB).d()) {
            iB = b(iB, z10);
            if (iB == -1) {
                return -1;
            }
        }
        return d(iB).a(z10) + f(iB);
    }

    @Override // com.applovin.exoplayer2.ba
    public final ba.a a(int i10, ba.a aVar, boolean z10) {
        int iB = b(i10);
        int iF = f(iB);
        d(iB).a(i10 - e(iB), aVar, z10);
        aVar.f4678c += iF;
        if (z10) {
            aVar.f4677b = a(g(iB), com.applovin.exoplayer2.l.a.b(aVar.f4677b));
        }
        return aVar;
    }

    @Override // com.applovin.exoplayer2.ba
    public final ba.a a(Object obj, ba.a aVar) {
        Object objA = a(obj);
        Object objB = b(obj);
        int iD = d(objA);
        int iF = f(iD);
        d(iD).a(objB, aVar);
        aVar.f4678c += iF;
        aVar.f4677b = obj;
        return aVar;
    }

    @Override // com.applovin.exoplayer2.ba
    public final ba.c a(int i10, ba.c cVar, long j10) {
        int iC = c(i10);
        int iF = f(iC);
        int iE = e(iC);
        d(iC).a(i10 - iF, cVar, j10);
        Object objG = g(iC);
        if (!ba.c.f4687a.equals(cVar.f4691b)) {
            objG = a(objG, cVar.f4691b);
        }
        cVar.f4691b = objG;
        cVar.f4705p += iE;
        cVar.f4706q += iE;
        return cVar;
    }

    @Override // com.applovin.exoplayer2.ba
    public final Object a(int i10) {
        int iB = b(i10);
        return a(g(iB), d(iB).a(i10 - e(iB)));
    }

    public abstract int b(int i10);

    @Override // com.applovin.exoplayer2.ba
    public int b(int i10, int i11, boolean z10) {
        if (this.f3912e) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int iC = c(i10);
        int iF = f(iC);
        int iB = d(iC).b(i10 - iF, i11 != 2 ? i11 : 0, z10);
        if (iB != -1) {
            return iF + iB;
        }
        int iB2 = b(iC, z10);
        while (iB2 != -1 && d(iB2).d()) {
            iB2 = b(iB2, z10);
        }
        if (iB2 != -1) {
            return d(iB2).a(z10) + f(iB2);
        }
        if (i11 == 2) {
            return a(z10);
        }
        return -1;
    }

    @Override // com.applovin.exoplayer2.ba
    public int b(boolean z10) {
        if (this.f3910c == 0) {
            return -1;
        }
        if (this.f3912e) {
            z10 = false;
        }
        int iC = z10 ? this.f3911d.c() : 0;
        while (d(iC).d()) {
            iC = a(iC, z10);
            if (iC == -1) {
                return -1;
            }
        }
        return d(iC).b(z10) + f(iC);
    }

    public abstract int c(int i10);

    @Override // com.applovin.exoplayer2.ba
    public final int c(Object obj) {
        int iC;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object objA = a(obj);
        Object objB = b(obj);
        int iD = d(objA);
        if (iD == -1 || (iC = d(iD).c(objB)) == -1) {
            return -1;
        }
        return e(iD) + iC;
    }

    public abstract int d(Object obj);

    public abstract ba d(int i10);

    public abstract int e(int i10);

    public abstract int f(int i10);

    public abstract Object g(int i10);
}
