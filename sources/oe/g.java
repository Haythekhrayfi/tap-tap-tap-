package oe;

import fd.z;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;
import oe.b;

/* JADX INFO: loaded from: classes3.dex */
public final class g<D extends b> extends f<D> implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d<D> f34237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ne.r f34238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ne.q f34239e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34240a;

        static {
            int[] iArr = new int[re.a.values().length];
            f34240a = iArr;
            try {
                iArr[re.a.INSTANT_SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34240a[re.a.OFFSET_SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public g(d<D> dVar, ne.r rVar, ne.q qVar) {
        z.B(dVar, "dateTime");
        this.f34237c = dVar;
        this.f34238d = rVar;
        this.f34239e = qVar;
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005f  */
    public static <R extends b> f<R> s(d<R> dVar, ne.q qVar, ne.r rVar) {
        z.B(dVar, "localDateTime");
        z.B(qVar, "zone");
        if (qVar instanceof ne.r) {
            return new g(dVar, (ne.r) qVar, qVar);
        }
        se.f fVarH = qVar.h();
        ne.g gVarR = ne.g.r(dVar);
        List<ne.r> listC = fVarH.c(gVarR);
        if (listC.size() == 1) {
            rVar = listC.get(0);
        } else if (listC.size() == 0) {
            se.d dVarB = fVarH.b(gVarR);
            dVar = dVar.t(dVar.f34233c, 0L, 0L, ne.d.c(dVarB.f35524e.f33835d - dVarB.f35523d.f33835d).f33772c, 0L);
            rVar = dVarB.f35524e;
        } else if (rVar == null || !listC.contains(rVar)) {
            rVar = listC.get(0);
        }
        z.B(rVar, "offset");
        return new g(dVar, rVar, qVar);
    }

    public static <R extends b> g<R> t(h hVar, ne.e eVar, ne.q qVar) {
        ne.r rVarA = qVar.h().a(eVar);
        z.B(rVarA, "offset");
        return new g<>((d) hVar.j(ne.g.v(eVar.f33775c, eVar.f33776d, rVarA)), rVarA, qVar);
    }

    private Object writeReplace() {
        return new u((byte) 13, this);
    }

    @Override // re.d
    public long d(re.d dVar, re.l lVar) {
        f<?> fVarM = l().h().m(dVar);
        if (!(lVar instanceof re.b)) {
            return lVar.between(this, fVarM);
        }
        return this.f34237c.d(fVarM.q(this.f34238d).m(), lVar);
    }

    @Override // oe.f
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && compareTo((f) obj) == 0;
    }

    @Override // oe.f
    public ne.r g() {
        return this.f34238d;
    }

    @Override // oe.f
    public ne.q h() {
        return this.f34239e;
    }

    @Override // oe.f
    public int hashCode() {
        return (this.f34237c.hashCode() ^ this.f34238d.f33835d) ^ Integer.rotateLeft(this.f34239e.hashCode(), 3);
    }

    @Override // re.e
    public boolean isSupported(re.i iVar) {
        return (iVar instanceof re.a) || (iVar != null && iVar.isSupportedBy(this));
    }

    @Override // oe.f, re.d
    public f<D> j(long j10, re.l lVar) {
        if (!(lVar instanceof re.b)) {
            return l().h().e(lVar.addTo(this, j10));
        }
        return l().h().e(this.f34237c.j(j10, lVar).adjustInto(this));
    }

    @Override // oe.f
    public c<D> m() {
        return this.f34237c;
    }

    @Override // oe.f, re.d
    public f<D> p(re.i iVar, long j10) {
        if (!(iVar instanceof re.a)) {
            return l().h().e(iVar.adjustInto(this, j10));
        }
        re.a aVar = (re.a) iVar;
        int i10 = a.f34240a[aVar.ordinal()];
        if (i10 == 1) {
            return j(j10 - k(), re.b.SECONDS);
        }
        if (i10 != 2) {
            return s(this.f34237c.p(iVar, j10), this.f34239e, this.f34238d);
        }
        return t(l().h(), this.f34237c.l(ne.r.n(aVar.checkValidIntValue(j10))), this.f34239e);
    }

    @Override // oe.f
    public f<D> q(ne.q qVar) {
        z.B(qVar, "zone");
        if (this.f34239e.equals(qVar)) {
            return this;
        }
        return t(l().h(), this.f34237c.l(this.f34238d), qVar);
    }

    @Override // oe.f
    public f<D> r(ne.q qVar) {
        return s(this.f34237c, qVar, this.f34238d);
    }

    @Override // oe.f
    public String toString() {
        String str = this.f34237c.toString() + this.f34238d.f33836e;
        if (this.f34238d == this.f34239e) {
            return str;
        }
        return str + '[' + this.f34239e.toString() + ']';
    }
}
