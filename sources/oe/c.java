package oe;

import fd.z;
import oe.b;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Comparable<oe.c<?>>] */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c<D extends b> extends qe.b implements re.d, re.f {
    public re.d adjustInto(re.d dVar) {
        return dVar.p(re.a.EPOCH_DAY, m().l()).p(re.a.NANO_OF_DAY, n().q());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && compareTo((c) obj) == 0;
    }

    public abstract f<D> f(ne.q qVar);

    @Override // 
    /* JADX INFO: renamed from: g */
    public int compareTo(c<?> cVar) {
        int iCompareTo = m().compareTo(cVar.m());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = n().compareTo(cVar.n());
        return iCompareTo2 == 0 ? h().compareTo(cVar.h()) : iCompareTo2;
    }

    public h h() {
        return m().h();
    }

    public int hashCode() {
        return m().hashCode() ^ n().hashCode();
    }

    @Override // qe.b, re.d
    public c<D> i(long j10, re.l lVar) {
        return m().h().d(super.i(j10, lVar));
    }

    @Override // re.d
    public abstract c<D> j(long j10, re.l lVar);

    public long k(ne.r rVar) {
        z.B(rVar, "offset");
        return ((m().l() * 86400) + ((long) n().r())) - ((long) rVar.f33835d);
    }

    public ne.e l(ne.r rVar) {
        return ne.e.k(k(rVar), n().f33797f);
    }

    public abstract D m();

    public abstract ne.h n();

    @Override // qe.b, re.d
    public c<D> o(re.f fVar) {
        return m().h().d(fVar.adjustInto(this));
    }

    @Override // re.d
    public abstract c<D> p(re.i iVar, long j10);

    @Override // qe.c, re.e
    public <R> R query(re.k<R> kVar) {
        if (kVar == re.j.f35374b) {
            return (R) h();
        }
        if (kVar == re.j.f35375c) {
            return (R) re.b.NANOS;
        }
        if (kVar == re.j.f35378f) {
            return (R) ne.f.D(m().l());
        }
        if (kVar == re.j.f35379g) {
            return (R) n();
        }
        if (kVar == re.j.f35376d || kVar == re.j.f35373a || kVar == re.j.f35377e) {
            return null;
        }
        return (R) super.query(kVar);
    }

    public String toString() {
        return m().toString() + 'T' + n().toString();
    }
}
