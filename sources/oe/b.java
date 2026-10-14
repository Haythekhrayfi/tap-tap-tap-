package oe;

import fd.z;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Comparable<oe.b>] */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends qe.b implements re.d, re.f {
    public re.d adjustInto(re.d dVar) {
        return dVar.p(re.a.EPOCH_DAY, l());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && compareTo((b) obj) == 0;
    }

    public c<?> f(ne.h hVar) {
        return new d(this, hVar);
    }

    @Override // 
    /* JADX INFO: renamed from: g */
    public int compareTo(b bVar) {
        int iK = z.k(l(), bVar.l());
        return iK == 0 ? h().compareTo(bVar.h()) : iK;
    }

    public abstract h h();

    public int hashCode() {
        long jL = l();
        return ((int) (jL ^ (jL >>> 32))) ^ h().hashCode();
    }

    public i i() {
        return h().f(get(re.a.ERA));
    }

    @Override // re.e
    public boolean isSupported(re.i iVar) {
        if (iVar instanceof re.a) {
            return iVar.isDateBased();
        }
        return iVar != null && iVar.isSupportedBy(this);
    }

    @Override // qe.b, re.d
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public b i(long j10, re.l lVar) {
        return h().c(super.i(j10, lVar));
    }

    @Override // re.d
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public abstract b j(long j10, re.l lVar);

    public long l() {
        return getLong(re.a.EPOCH_DAY);
    }

    @Override // qe.b, re.d
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public b o(re.f fVar) {
        return h().c(fVar.adjustInto(this));
    }

    @Override // re.d
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public abstract b p(re.i iVar, long j10);

    @Override // qe.c, re.e
    public <R> R query(re.k<R> kVar) {
        if (kVar == re.j.f35374b) {
            return (R) h();
        }
        if (kVar == re.j.f35375c) {
            return (R) re.b.DAYS;
        }
        if (kVar == re.j.f35378f) {
            return (R) ne.f.D(l());
        }
        if (kVar == re.j.f35379g || kVar == re.j.f35376d || kVar == re.j.f35373a || kVar == re.j.f35377e) {
            return null;
        }
        return (R) super.query(kVar);
    }

    public String toString() {
        long j10 = getLong(re.a.YEAR_OF_ERA);
        long j11 = getLong(re.a.MONTH_OF_YEAR);
        long j12 = getLong(re.a.DAY_OF_MONTH);
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(h().i());
        sb2.append(" ");
        sb2.append(i());
        sb2.append(" ");
        sb2.append(j10);
        sb2.append(j11 < 10 ? "-0" : "-");
        sb2.append(j11);
        sb2.append(j12 >= 10 ? "-" : "-0");
        sb2.append(j12);
        return sb2.toString();
    }
}
