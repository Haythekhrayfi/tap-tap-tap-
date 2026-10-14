package ne;

import androidx.recyclerview.widget.RecyclerView;
import fd.z;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.util.Objects;

/* JADX WARN: Unexpected interfaces in signature: [java.io.Serializable] */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends qe.b implements re.d, re.f, Comparable<k> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f33805e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f33806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f33807d;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33808a;

        static {
            int[] iArr = new int[re.a.values().length];
            f33808a = iArr;
            try {
                iArr[re.a.INSTANT_SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33808a[re.a.OFFSET_SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        g gVar = g.f33786e;
        r rVar = r.f33834j;
        Objects.requireNonNull(gVar);
        new k(gVar, rVar);
        g gVar2 = g.f33787f;
        r rVar2 = r.f33833i;
        Objects.requireNonNull(gVar2);
        new k(gVar2, rVar2);
    }

    public k(g gVar, r rVar) {
        z.B(gVar, "dateTime");
        this.f33806c = gVar;
        z.B(rVar, "offset");
        this.f33807d = rVar;
    }

    public static k f(re.e eVar) {
        if (eVar instanceof k) {
            return (k) eVar;
        }
        try {
            r rVarK = r.k(eVar);
            try {
                return new k(g.r(eVar), rVarK);
            } catch (ne.a unused) {
                return h(e.h(eVar), rVarK);
            }
        } catch (ne.a unused2) {
            throw new ne.a("Unable to obtain OffsetDateTime from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
        }
    }

    public static k h(e eVar, q qVar) {
        z.B(eVar, "instant");
        z.B(qVar, "zone");
        r rVar = ((se.f.a) qVar.h()).f35535c;
        return new k(g.v(eVar.f33775c, eVar.f33776d, rVar), rVar);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 69, this);
    }

    @Override // re.d
    /* JADX INFO: renamed from: a */
    public re.d p(re.i iVar, long j10) {
        g gVarA;
        r rVarN;
        if (!(iVar instanceof re.a)) {
            return (k) iVar.adjustInto(this, j10);
        }
        re.a aVar = (re.a) iVar;
        int i10 = a.f33808a[aVar.ordinal()];
        if (i10 == 1) {
            return h(e.k(j10, g()), this.f33807d);
        }
        if (i10 != 2) {
            gVarA = this.f33806c.a(iVar, j10);
            rVarN = this.f33807d;
        } else {
            gVarA = this.f33806c;
            rVarN = r.n(aVar.checkValidIntValue(j10));
        }
        return k(gVarA, rVarN);
    }

    @Override // re.f
    public re.d adjustInto(re.d dVar) {
        return dVar.p(re.a.EPOCH_DAY, this.f33806c.f33788c.l()).p(re.a.NANO_OF_DAY, this.f33806c.f33789d.q()).p(re.a.OFFSET_SECONDS, this.f33807d.f33835d);
    }

    @Override // qe.b, re.d
    /* JADX INFO: renamed from: c */
    public re.d i(long j10, re.l lVar) {
        return j10 == Long.MIN_VALUE ? k(RecyclerView.FOREVER_NS, lVar).k(1L, lVar) : k(-j10, lVar);
    }

    @Override // java.lang.Comparable
    public int compareTo(k kVar) {
        g gVar;
        g gVar2;
        k kVar2 = kVar;
        if (this.f33807d.equals(kVar2.f33807d)) {
            gVar = this.f33806c;
            gVar2 = kVar2.f33806c;
        } else {
            int iK = z.k(j(), kVar2.j());
            if (iK != 0) {
                return iK;
            }
            gVar = this.f33806c;
            int i10 = gVar.f33789d.f33797f;
            gVar2 = kVar2.f33806c;
            int i11 = i10 - gVar2.f33789d.f33797f;
            if (i11 != 0) {
                return i11;
            }
        }
        return gVar.compareTo(gVar2);
    }

    @Override // re.d
    public long d(re.d dVar, re.l lVar) {
        k kVarF = f(dVar);
        if (!(lVar instanceof re.b)) {
            return lVar.between(this, kVarF);
        }
        r rVar = this.f33807d;
        if (!rVar.equals(kVarF.f33807d)) {
            kVarF = new k(kVarF.f33806c.z(rVar.f33835d - kVarF.f33807d.f33835d), rVar);
        }
        return this.f33806c.d(kVarF.f33806c, lVar);
    }

    @Override // qe.b, re.d
    /* JADX INFO: renamed from: e */
    public re.d o(re.f fVar) {
        re.f fVarAdjustInto;
        if ((fVar instanceof f) || (fVar instanceof h) || (fVar instanceof g)) {
            return k(this.f33806c.e(fVar), this.f33807d);
        }
        if (fVar instanceof e) {
            return h((e) fVar, this.f33807d);
        }
        if (fVar instanceof r) {
            return k(this.f33806c, (r) fVar);
        }
        if (!(fVar instanceof k)) {
            fVarAdjustInto = fVar;
            fVarAdjustInto = fVar.adjustInto(this);
        }
        fVarAdjustInto = fVar;
        return (k) fVarAdjustInto;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f33806c.equals(kVar.f33806c) && this.f33807d.equals(kVar.f33807d);
    }

    public int g() {
        return this.f33806c.f33789d.f33797f;
    }

    @Override // qe.c, re.e
    public int get(re.i iVar) {
        if (!(iVar instanceof re.a)) {
            return range(iVar).a(getLong(iVar), iVar);
        }
        int i10 = a.f33808a[((re.a) iVar).ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? this.f33806c.get(iVar) : this.f33807d.f33835d;
        }
        throw new ne.a(b.a("Field too large for an int: ", iVar));
    }

    @Override // re.e
    public long getLong(re.i iVar) {
        if (!(iVar instanceof re.a)) {
            return iVar.getFrom(this);
        }
        int i10 = a.f33808a[((re.a) iVar).ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? this.f33806c.getLong(iVar) : this.f33807d.f33835d;
        }
        return j();
    }

    public int hashCode() {
        return this.f33806c.hashCode() ^ this.f33807d.f33835d;
    }

    @Override // re.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public k j(long j10, re.l lVar) {
        return lVar instanceof re.b ? k(this.f33806c.b(j10, lVar), this.f33807d) : (k) lVar.addTo(this, j10);
    }

    @Override // re.e
    public boolean isSupported(re.i iVar) {
        return (iVar instanceof re.a) || (iVar != null && iVar.isSupportedBy(this));
    }

    public long j() {
        return this.f33806c.k(this.f33807d);
    }

    public final k k(g gVar, r rVar) {
        return (this.f33806c == gVar && this.f33807d.equals(rVar)) ? this : new k(gVar, rVar);
    }

    @Override // qe.c, re.e
    public <R> R query(re.k<R> kVar) {
        if (kVar == re.j.f35374b) {
            return (R) oe.m.f34269e;
        }
        if (kVar == re.j.f35375c) {
            return (R) re.b.NANOS;
        }
        if (kVar == re.j.f35377e || kVar == re.j.f35376d) {
            return (R) this.f33807d;
        }
        if (kVar == re.j.f35378f) {
            return (R) this.f33806c.f33788c;
        }
        if (kVar == re.j.f35379g) {
            return (R) this.f33806c.f33789d;
        }
        if (kVar == re.j.f35373a) {
            return null;
        }
        return (R) super.query(kVar);
    }

    @Override // qe.c, re.e
    public re.n range(re.i iVar) {
        if (iVar instanceof re.a) {
            return (iVar == re.a.INSTANT_SECONDS || iVar == re.a.OFFSET_SECONDS) ? iVar.range() : this.f33806c.range(iVar);
        }
        return iVar.rangeRefinedBy(this);
    }

    public String toString() {
        return this.f33806c.toString() + this.f33807d.f33836e;
    }
}
