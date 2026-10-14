package oe;

import fd.z;
import oe.b;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Comparable<oe.f<?>>] */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f<D extends b> extends qe.b implements re.d {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34236a;

        static {
            int[] iArr = new int[re.a.values().length];
            f34236a = iArr;
            try {
                iArr[re.a.INSTANT_SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34236a[re.a.OFFSET_SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && compareTo((f) obj) == 0;
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(f<?> fVar) {
        int iK = z.k(k(), fVar.k());
        if (iK != 0) {
            return iK;
        }
        int i10 = n().f33797f - fVar.n().f33797f;
        if (i10 != 0) {
            return i10;
        }
        int iCompareTo = m().compareTo(fVar.m());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = h().g().compareTo(fVar.h().g());
        return iCompareTo2 == 0 ? l().h().compareTo(fVar.l().h()) : iCompareTo2;
    }

    public abstract ne.r g();

    @Override // qe.c, re.e
    public int get(re.i iVar) {
        if (!(iVar instanceof re.a)) {
            return range(iVar).a(getLong(iVar), iVar);
        }
        int i10 = a.f34236a[((re.a) iVar).ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? m().get(iVar) : g().f33835d;
        }
        throw new re.m(ne.b.a("Field too large for an int: ", iVar));
    }

    @Override // re.e
    public long getLong(re.i iVar) {
        if (!(iVar instanceof re.a)) {
            return iVar.getFrom(this);
        }
        int i10 = a.f34236a[((re.a) iVar).ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? m().getLong(iVar) : g().f33835d;
        }
        return k();
    }

    public abstract ne.q h();

    public int hashCode() {
        return (m().hashCode() ^ g().f33835d) ^ Integer.rotateLeft(h().hashCode(), 3);
    }

    @Override // qe.b, re.d
    public f<D> i(long j10, re.l lVar) {
        return l().h().e(super.i(j10, lVar));
    }

    @Override // re.d
    public abstract f<D> j(long j10, re.l lVar);

    public long k() {
        return ((l().l() * 86400) + ((long) n().r())) - ((long) g().f33835d);
    }

    public D l() {
        return (D) m().m();
    }

    public abstract c<D> m();

    public ne.h n() {
        return m().n();
    }

    @Override // qe.b, re.d
    public f<D> o(re.f fVar) {
        return l().h().e(fVar.adjustInto(this));
    }

    @Override // re.d
    public abstract f<D> p(re.i iVar, long j10);

    public abstract f<D> q(ne.q qVar);

    @Override // qe.c, re.e
    public <R> R query(re.k<R> kVar) {
        if (kVar == re.j.f35373a || kVar == re.j.f35376d) {
            return (R) h();
        }
        if (kVar == re.j.f35374b) {
            return (R) l().h();
        }
        if (kVar == re.j.f35375c) {
            return (R) re.b.NANOS;
        }
        if (kVar == re.j.f35377e) {
            return (R) g();
        }
        if (kVar == re.j.f35378f) {
            return (R) ne.f.D(l().l());
        }
        return kVar == re.j.f35379g ? (R) n() : (R) super.query(kVar);
    }

    public abstract f<D> r(ne.q qVar);

    @Override // qe.c, re.e
    public re.n range(re.i iVar) {
        if (iVar instanceof re.a) {
            return (iVar == re.a.INSTANT_SECONDS || iVar == re.a.OFFSET_SECONDS) ? iVar.range() : m().range(iVar);
        }
        return iVar.rangeRefinedBy(this);
    }

    public String toString() {
        String str = m().toString() + g().f33836e;
        if (g() == h()) {
            return str;
        }
        return str + '[' + h().toString() + ']';
    }
}
