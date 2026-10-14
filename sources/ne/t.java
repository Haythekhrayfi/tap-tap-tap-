package ne;

import androidx.recyclerview.widget.RecyclerView;
import fd.z;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.util.List;

/* JADX WARN: Unexpected interfaces in signature: [java.io.Serializable] */
/* JADX INFO: loaded from: classes3.dex */
public final class t extends oe.f<f> implements re.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f33840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f33841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f33842e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33843a;

        static {
            int[] iArr = new int[re.a.values().length];
            f33843a = iArr;
            try {
                iArr[re.a.INSTANT_SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33843a[re.a.OFFSET_SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public t(g gVar, r rVar, q qVar) {
        this.f33840c = gVar;
        this.f33841d = rVar;
        this.f33842e = qVar;
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static t s(long j10, int i10, q qVar) {
        r rVarA = qVar.h().a(e.k(j10, i10));
        return new t(g.v(j10, i10, rVarA), rVarA, qVar);
    }

    public static t t(re.e eVar) {
        if (eVar instanceof t) {
            return (t) eVar;
        }
        try {
            q qVarF = q.f(eVar);
            re.a aVar = re.a.INSTANT_SECONDS;
            if (eVar.isSupported(aVar)) {
                try {
                    return s(eVar.getLong(aVar), eVar.get(re.a.NANO_OF_SECOND), qVarF);
                } catch (ne.a unused) {
                }
            }
            return v(g.r(eVar), qVarF, null);
        } catch (ne.a unused2) {
            throw new ne.a("Unable to obtain ZonedDateTime from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
        }
    }

    public static t v(g gVar, q qVar, r rVar) {
        r rVar2;
        z.B(gVar, "localDateTime");
        z.B(qVar, "zone");
        if (qVar instanceof r) {
            return new t(gVar, (r) qVar, qVar);
        }
        se.f fVarH = qVar.h();
        List<r> listC = fVarH.c(gVar);
        if (listC.size() != 1) {
            if (listC.size() == 0) {
                se.d dVarB = fVarH.b(gVar);
                gVar = gVar.z(d.c(dVarB.f35524e.f33835d - dVarB.f35523d.f33835d).f33772c);
                rVar = dVarB.f35524e;
            } else if (rVar == null || !listC.contains(rVar)) {
                rVar2 = listC.get(0);
                z.B(rVar2, "offset");
            }
            return new t(gVar, rVar, qVar);
        }
        rVar2 = listC.get(0);
        rVar = rVar2;
        return new t(gVar, rVar, qVar);
    }

    private Object writeReplace() {
        return new n((byte) 6, this);
    }

    @Override // oe.f
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public t p(re.i iVar, long j10) {
        if (!(iVar instanceof re.a)) {
            return (t) iVar.adjustInto(this, j10);
        }
        re.a aVar = (re.a) iVar;
        int i10 = a.f33843a[aVar.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? x(this.f33840c.a(iVar, j10)) : y(r.n(aVar.checkValidIntValue(j10)));
        }
        return s(j10, this.f33840c.f33789d.f33797f, this.f33842e);
    }

    @Override // oe.f
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public t q(q qVar) {
        z.B(qVar, "zone");
        return this.f33842e.equals(qVar) ? this : s(this.f33840c.k(this.f33841d), this.f33840c.f33789d.f33797f, qVar);
    }

    @Override // re.d
    public long d(re.d dVar, re.l lVar) {
        t tVarT = t(dVar);
        if (!(lVar instanceof re.b)) {
            return lVar.between(this, tVarT);
        }
        t tVarQ = tVarT.q(this.f33842e);
        return lVar.isDateBased() ? this.f33840c.d(tVarQ.f33840c, lVar) : new k(this.f33840c, this.f33841d).d(new k(tVarQ.f33840c, tVarQ.f33841d), lVar);
    }

    @Override // oe.f
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f33840c.equals(tVar.f33840c) && this.f33841d.equals(tVar.f33841d) && this.f33842e.equals(tVar.f33842e);
    }

    @Override // oe.f
    public r g() {
        return this.f33841d;
    }

    @Override // oe.f, qe.c, re.e
    public int get(re.i iVar) {
        if (!(iVar instanceof re.a)) {
            return super.get(iVar);
        }
        int i10 = a.f33843a[((re.a) iVar).ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? this.f33840c.get(iVar) : this.f33841d.f33835d;
        }
        throw new ne.a(b.a("Field too large for an int: ", iVar));
    }

    @Override // oe.f, re.e
    public long getLong(re.i iVar) {
        if (!(iVar instanceof re.a)) {
            return iVar.getFrom(this);
        }
        int i10 = a.f33843a[((re.a) iVar).ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? this.f33840c.getLong(iVar) : this.f33841d.f33835d;
        }
        return k();
    }

    @Override // oe.f
    public q h() {
        return this.f33842e;
    }

    @Override // oe.f
    public int hashCode() {
        return (this.f33840c.hashCode() ^ this.f33841d.f33835d) ^ Integer.rotateLeft(this.f33842e.hashCode(), 3);
    }

    @Override // re.e
    public boolean isSupported(re.i iVar) {
        return (iVar instanceof re.a) || (iVar != null && iVar.isSupportedBy(this));
    }

    @Override // oe.f
    public oe.b l() {
        return this.f33840c.f33788c;
    }

    @Override // oe.f
    public oe.c m() {
        return this.f33840c;
    }

    @Override // oe.f
    public h n() {
        return this.f33840c.f33789d;
    }

    @Override // oe.f, qe.c, re.e
    public <R> R query(re.k<R> kVar) {
        return kVar == re.j.f35378f ? (R) this.f33840c.f33788c : (R) super.query(kVar);
    }

    @Override // oe.f
    public oe.f r(q qVar) {
        z.B(qVar, "zone");
        return this.f33842e.equals(qVar) ? this : v(this.f33840c, qVar, this.f33841d);
    }

    @Override // oe.f, qe.c, re.e
    public re.n range(re.i iVar) {
        if (iVar instanceof re.a) {
            return (iVar == re.a.INSTANT_SECONDS || iVar == re.a.OFFSET_SECONDS) ? iVar.range() : this.f33840c.range(iVar);
        }
        return iVar.rangeRefinedBy(this);
    }

    @Override // oe.f
    public String toString() {
        String str = this.f33840c.toString() + this.f33841d.f33836e;
        if (this.f33841d == this.f33842e) {
            return str;
        }
        return str + '[' + this.f33842e.toString() + ']';
    }

    @Override // oe.f
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public t i(long j10, re.l lVar) {
        return j10 == Long.MIN_VALUE ? k(RecyclerView.FOREVER_NS, lVar).k(1L, lVar) : k(-j10, lVar);
    }

    @Override // oe.f
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public t j(long j10, re.l lVar) {
        if (!(lVar instanceof re.b)) {
            return (t) lVar.addTo(this, j10);
        }
        if (lVar.isDateBased()) {
            return x(this.f33840c.b(j10, lVar));
        }
        g gVarB = this.f33840c.b(j10, lVar);
        r rVar = this.f33841d;
        q qVar = this.f33842e;
        z.B(gVarB, "localDateTime");
        z.B(rVar, "offset");
        z.B(qVar, "zone");
        return s(gVarB.k(rVar), gVarB.f33789d.f33797f, qVar);
    }

    public final t x(g gVar) {
        return v(gVar, this.f33842e, this.f33841d);
    }

    public final t y(r rVar) {
        return (rVar.equals(this.f33841d) || !this.f33842e.h().e(this.f33840c, rVar)) ? this : new t(this.f33840c, rVar, this.f33842e);
    }

    @Override // oe.f
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public t o(re.f fVar) {
        if (fVar instanceof f) {
            return v(g.u((f) fVar, this.f33840c.f33789d), this.f33842e, this.f33841d);
        }
        if (fVar instanceof h) {
            return v(g.u(this.f33840c.f33788c, (h) fVar), this.f33842e, this.f33841d);
        }
        if (fVar instanceof g) {
            return x((g) fVar);
        }
        if (!(fVar instanceof e)) {
            return fVar instanceof r ? y((r) fVar) : (t) fVar.adjustInto(this);
        }
        e eVar = (e) fVar;
        return s(eVar.f33775c, eVar.f33776d, this.f33842e);
    }
}
