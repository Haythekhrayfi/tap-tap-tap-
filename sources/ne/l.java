package ne;

import androidx.recyclerview.widget.RecyclerView;
import fd.z;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends qe.c implements re.d, re.f, Comparable<l>, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f33809e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f33810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f33811d;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33812a;

        static {
            int[] iArr = new int[re.b.values().length];
            f33812a = iArr;
            try {
                iArr[re.b.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33812a[re.b.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33812a[re.b.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33812a[re.b.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33812a[re.b.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33812a[re.b.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33812a[re.b.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        h hVar = h.f33791g;
        r rVar = r.f33834j;
        Objects.requireNonNull(hVar);
        new l(hVar, rVar);
        h hVar2 = h.f33792h;
        r rVar2 = r.f33833i;
        Objects.requireNonNull(hVar2);
        new l(hVar2, rVar2);
    }

    public l(h hVar, r rVar) {
        z.B(hVar, "time");
        this.f33810c = hVar;
        z.B(rVar, "offset");
        this.f33811d = rVar;
    }

    public static l f(re.e eVar) {
        if (eVar instanceof l) {
            return (l) eVar;
        }
        try {
            return new l(h.h(eVar), r.k(eVar));
        } catch (ne.a unused) {
            throw new ne.a("Unable to obtain OffsetTime from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
        }
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 66, this);
    }

    @Override // re.d
    /* JADX INFO: renamed from: a */
    public re.d p(re.i iVar, long j10) {
        if (iVar instanceof re.a) {
            return iVar == re.a.OFFSET_SECONDS ? i(this.f33810c, r.n(((re.a) iVar).checkValidIntValue(j10))) : i(this.f33810c.n(iVar, j10), this.f33811d);
        }
        return (l) iVar.adjustInto(this, j10);
    }

    @Override // re.f
    public re.d adjustInto(re.d dVar) {
        return dVar.p(re.a.NANO_OF_DAY, this.f33810c.q()).p(re.a.OFFSET_SECONDS, this.f33811d.f33835d);
    }

    @Override // re.d
    /* JADX INFO: renamed from: c */
    public re.d i(long j10, re.l lVar) {
        return j10 == Long.MIN_VALUE ? k(RecyclerView.FOREVER_NS, lVar).k(1L, lVar) : k(-j10, lVar);
    }

    @Override // java.lang.Comparable
    public int compareTo(l lVar) {
        int iK;
        l lVar2 = lVar;
        return (this.f33811d.equals(lVar2.f33811d) || (iK = z.k(h(), lVar2.h())) == 0) ? this.f33810c.compareTo(lVar2.f33810c) : iK;
    }

    @Override // re.d
    public long d(re.d dVar, re.l lVar) {
        long j10;
        l lVarF = f(dVar);
        if (!(lVar instanceof re.b)) {
            return lVar.between(this, lVarF);
        }
        long jH = lVarF.h() - h();
        switch (a.f33812a[((re.b) lVar).ordinal()]) {
            case 1:
                return jH;
            case 2:
                j10 = 1000;
                break;
            case 3:
                j10 = 1000000;
                break;
            case 4:
                j10 = 1000000000;
                break;
            case 5:
                j10 = 60000000000L;
                break;
            case 6:
                j10 = 3600000000000L;
                break;
            case 7:
                j10 = 43200000000000L;
                break;
            default:
                throw new re.m("Unsupported unit: " + lVar);
        }
        return jH / j10;
    }

    @Override // re.d
    /* JADX INFO: renamed from: e */
    public re.d o(re.f fVar) {
        re.f fVarAdjustInto;
        if (fVar instanceof h) {
            return i((h) fVar, this.f33811d);
        }
        if (fVar instanceof r) {
            return i(this.f33810c, (r) fVar);
        }
        if (!(fVar instanceof l)) {
            fVarAdjustInto = fVar;
            fVarAdjustInto = fVar.adjustInto(this);
        }
        fVarAdjustInto = fVar;
        return (l) fVarAdjustInto;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f33810c.equals(lVar.f33810c) && this.f33811d.equals(lVar.f33811d);
    }

    @Override // re.d
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public l j(long j10, re.l lVar) {
        return lVar instanceof re.b ? i(this.f33810c.k(j10, lVar), this.f33811d) : (l) lVar.addTo(this, j10);
    }

    @Override // qe.c, re.e
    public int get(re.i iVar) {
        return range(iVar).a(getLong(iVar), iVar);
    }

    @Override // re.e
    public long getLong(re.i iVar) {
        if (iVar instanceof re.a) {
            return iVar == re.a.OFFSET_SECONDS ? this.f33811d.f33835d : this.f33810c.getLong(iVar);
        }
        return iVar.getFrom(this);
    }

    public final long h() {
        return this.f33810c.q() - (((long) this.f33811d.f33835d) * 1000000000);
    }

    public int hashCode() {
        return this.f33810c.hashCode() ^ this.f33811d.f33835d;
    }

    public final l i(h hVar, r rVar) {
        return (this.f33810c == hVar && this.f33811d.equals(rVar)) ? this : new l(hVar, rVar);
    }

    @Override // re.e
    public boolean isSupported(re.i iVar) {
        if (iVar instanceof re.a) {
            return iVar.isTimeBased() || iVar == re.a.OFFSET_SECONDS;
        }
        return iVar != null && iVar.isSupportedBy(this);
    }

    @Override // qe.c, re.e
    public <R> R query(re.k<R> kVar) {
        if (kVar == re.j.f35375c) {
            return (R) re.b.NANOS;
        }
        if (kVar == re.j.f35377e || kVar == re.j.f35376d) {
            return (R) this.f33811d;
        }
        if (kVar == re.j.f35379g) {
            return (R) this.f33810c;
        }
        if (kVar == re.j.f35374b || kVar == re.j.f35378f || kVar == re.j.f35373a) {
            return null;
        }
        return (R) super.query(kVar);
    }

    @Override // qe.c, re.e
    public re.n range(re.i iVar) {
        if (iVar instanceof re.a) {
            return iVar == re.a.OFFSET_SECONDS ? iVar.range() : this.f33810c.range(iVar);
        }
        return iVar.rangeRefinedBy(this);
    }

    public String toString() {
        return this.f33810c.toString() + this.f33811d.f33836e;
    }
}
