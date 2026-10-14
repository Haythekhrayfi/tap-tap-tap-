package ne;

import androidx.recyclerview.widget.RecyclerView;
import fd.z;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends qe.c implements re.d, re.f, Comparable<o>, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f33820d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f33821c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f33823b;

        static {
            int[] iArr = new int[re.b.values().length];
            f33823b = iArr;
            try {
                iArr[re.b.YEARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33823b[re.b.DECADES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33823b[re.b.CENTURIES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33823b[re.b.MILLENNIA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33823b[re.b.ERAS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[re.a.values().length];
            f33822a = iArr2;
            try {
                iArr2[re.a.YEAR_OF_ERA.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33822a[re.a.YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f33822a[re.a.ERA.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static {
        new pe.b().i(re.a.YEAR, 4, 10, pe.j.EXCEEDS_PAD).l();
    }

    public o(int i10) {
        this.f33821c = i10;
    }

    public static o f(re.e eVar) {
        if (eVar instanceof o) {
            return (o) eVar;
        }
        try {
            if (!oe.m.f34269e.equals(oe.h.g(eVar))) {
                eVar = f.r(eVar);
            }
            return g(eVar.get(re.a.YEAR));
        } catch (ne.a unused) {
            throw new ne.a("Unable to obtain Year from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
        }
    }

    public static o g(int i10) {
        re.a.YEAR.checkValidValue(i10);
        return new o(i10);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 67, this);
    }

    @Override // re.f
    public re.d adjustInto(re.d dVar) {
        if (oe.h.g(dVar).equals(oe.m.f34269e)) {
            return dVar.p(re.a.YEAR, this.f33821c);
        }
        throw new ne.a("Adjustment only supported on ISO date-time");
    }

    @Override // re.d
    /* JADX INFO: renamed from: c */
    public re.d i(long j10, re.l lVar) {
        return j10 == Long.MIN_VALUE ? k(RecyclerView.FOREVER_NS, lVar).k(1L, lVar) : k(-j10, lVar);
    }

    @Override // java.lang.Comparable
    public int compareTo(o oVar) {
        return this.f33821c - oVar.f33821c;
    }

    @Override // re.d
    public long d(re.d dVar, re.l lVar) {
        o oVarF = f(dVar);
        if (!(lVar instanceof re.b)) {
            return lVar.between(this, oVarF);
        }
        long j10 = ((long) oVarF.f33821c) - ((long) this.f33821c);
        int i10 = a.f33823b[((re.b) lVar).ordinal()];
        if (i10 == 1) {
            return j10;
        }
        if (i10 == 2) {
            return j10 / 10;
        }
        if (i10 == 3) {
            return j10 / 100;
        }
        if (i10 == 4) {
            return j10 / 1000;
        }
        if (i10 == 5) {
            re.a aVar = re.a.ERA;
            return oVarF.getLong(aVar) - getLong(aVar);
        }
        throw new re.m("Unsupported unit: " + lVar);
    }

    @Override // re.d
    /* JADX INFO: renamed from: e */
    public re.d o(re.f fVar) {
        return (o) fVar.adjustInto(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && this.f33821c == ((o) obj).f33821c;
    }

    @Override // qe.c, re.e
    public int get(re.i iVar) {
        return range(iVar).a(getLong(iVar), iVar);
    }

    @Override // re.e
    public long getLong(re.i iVar) {
        if (!(iVar instanceof re.a)) {
            return iVar.getFrom(this);
        }
        int i10 = a.f33822a[((re.a) iVar).ordinal()];
        if (i10 == 1) {
            int i11 = this.f33821c;
            if (i11 < 1) {
                i11 = 1 - i11;
            }
            return i11;
        }
        if (i10 == 2) {
            return this.f33821c;
        }
        if (i10 == 3) {
            return this.f33821c < 1 ? 0 : 1;
        }
        throw new re.m(b.a("Unsupported field: ", iVar));
    }

    @Override // re.d
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public o j(long j10, re.l lVar) {
        if (!(lVar instanceof re.b)) {
            return (o) lVar.addTo(this, j10);
        }
        int i10 = a.f33823b[((re.b) lVar).ordinal()];
        if (i10 == 1) {
            return i(j10);
        }
        if (i10 == 2) {
            return i(z.F(j10, 10));
        }
        if (i10 == 3) {
            return i(z.F(j10, 100));
        }
        if (i10 == 4) {
            return i(z.F(j10, 1000));
        }
        if (i10 == 5) {
            re.a aVar = re.a.ERA;
            return n(aVar, z.D(getLong(aVar), j10));
        }
        throw new re.m("Unsupported unit: " + lVar);
    }

    public int hashCode() {
        return this.f33821c;
    }

    public o i(long j10) {
        return j10 == 0 ? this : g(re.a.YEAR.checkValidIntValue(((long) this.f33821c) + j10));
    }

    @Override // re.e
    public boolean isSupported(re.i iVar) {
        if (iVar instanceof re.a) {
            return iVar == re.a.YEAR || iVar == re.a.YEAR_OF_ERA || iVar == re.a.ERA;
        }
        return iVar != null && iVar.isSupportedBy(this);
    }

    @Override // re.d
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public o p(re.i iVar, long j10) {
        if (!(iVar instanceof re.a)) {
            return (o) iVar.adjustInto(this, j10);
        }
        re.a aVar = (re.a) iVar;
        aVar.checkValidValue(j10);
        int i10 = a.f33822a[aVar.ordinal()];
        if (i10 == 1) {
            if (this.f33821c < 1) {
                j10 = 1 - j10;
            }
            return g((int) j10);
        }
        if (i10 == 2) {
            return g((int) j10);
        }
        if (i10 == 3) {
            return getLong(re.a.ERA) == j10 ? this : g(1 - this.f33821c);
        }
        throw new re.m(b.a("Unsupported field: ", iVar));
    }

    @Override // qe.c, re.e
    public <R> R query(re.k<R> kVar) {
        if (kVar == re.j.f35374b) {
            return (R) oe.m.f34269e;
        }
        if (kVar == re.j.f35375c) {
            return (R) re.b.YEARS;
        }
        if (kVar == re.j.f35378f || kVar == re.j.f35379g || kVar == re.j.f35376d || kVar == re.j.f35373a || kVar == re.j.f35377e) {
            return null;
        }
        return (R) super.query(kVar);
    }

    @Override // qe.c, re.e
    public re.n range(re.i iVar) {
        if (iVar == re.a.YEAR_OF_ERA) {
            return re.n.c(1L, this.f33821c <= 0 ? 1000000000L : 999999999L);
        }
        return super.range(iVar);
    }

    public String toString() {
        return Integer.toString(this.f33821c);
    }
}
