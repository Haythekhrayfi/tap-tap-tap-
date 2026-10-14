package ne;

import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import fd.z;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends qe.c implements re.d, re.f, Comparable<p>, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f33824e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f33825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f33826d;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f33828b;

        static {
            int[] iArr = new int[re.b.values().length];
            f33828b = iArr;
            try {
                iArr[re.b.MONTHS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33828b[re.b.YEARS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33828b[re.b.DECADES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33828b[re.b.CENTURIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33828b[re.b.MILLENNIA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33828b[re.b.ERAS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[re.a.values().length];
            f33827a = iArr2;
            try {
                iArr2[re.a.MONTH_OF_YEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f33827a[re.a.PROLEPTIC_MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f33827a[re.a.YEAR_OF_ERA.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f33827a[re.a.YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f33827a[re.a.ERA.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    static {
        pe.b bVarI = new pe.b().i(re.a.YEAR, 4, 10, pe.j.EXCEEDS_PAD);
        bVarI.c(CoreConstants.DASH_CHAR);
        bVarI.h(re.a.MONTH_OF_YEAR, 2);
        bVarI.l();
    }

    public p(int i10, int i11) {
        this.f33825c = i10;
        this.f33826d = i11;
    }

    public static p f(re.e eVar) {
        if (eVar instanceof p) {
            return (p) eVar;
        }
        try {
            if (!oe.m.f34269e.equals(oe.h.g(eVar))) {
                eVar = f.r(eVar);
            }
            re.a aVar = re.a.YEAR;
            int i10 = eVar.get(aVar);
            re.a aVar2 = re.a.MONTH_OF_YEAR;
            int i11 = eVar.get(aVar2);
            aVar.checkValidValue(i10);
            aVar2.checkValidValue(i11);
            return new p(i10, i11);
        } catch (ne.a unused) {
            throw new ne.a("Unable to obtain YearMonth from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
        }
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 68, this);
    }

    @Override // re.f
    public re.d adjustInto(re.d dVar) {
        if (oe.h.g(dVar).equals(oe.m.f34269e)) {
            return dVar.p(re.a.PROLEPTIC_MONTH, g());
        }
        throw new ne.a("Adjustment only supported on ISO date-time");
    }

    @Override // re.d
    /* JADX INFO: renamed from: c */
    public re.d i(long j10, re.l lVar) {
        return j10 == Long.MIN_VALUE ? k(RecyclerView.FOREVER_NS, lVar).k(1L, lVar) : k(-j10, lVar);
    }

    @Override // java.lang.Comparable
    public int compareTo(p pVar) {
        p pVar2 = pVar;
        int i10 = this.f33825c - pVar2.f33825c;
        return i10 == 0 ? this.f33826d - pVar2.f33826d : i10;
    }

    @Override // re.d
    public long d(re.d dVar, re.l lVar) {
        p pVarF = f(dVar);
        if (!(lVar instanceof re.b)) {
            return lVar.between(this, pVarF);
        }
        long jG = pVarF.g() - g();
        switch (a.f33828b[((re.b) lVar).ordinal()]) {
            case 1:
                return jG;
            case 2:
                return jG / 12;
            case 3:
                return jG / 120;
            case 4:
                return jG / 1200;
            case 5:
                return jG / 12000;
            case 6:
                re.a aVar = re.a.ERA;
                return pVarF.getLong(aVar) - getLong(aVar);
            default:
                throw new re.m("Unsupported unit: " + lVar);
        }
    }

    @Override // re.d
    /* JADX INFO: renamed from: e */
    public re.d o(re.f fVar) {
        return (p) fVar.adjustInto(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f33825c == pVar.f33825c && this.f33826d == pVar.f33826d;
    }

    public final long g() {
        return (((long) this.f33825c) * 12) + ((long) (this.f33826d - 1));
    }

    @Override // qe.c, re.e
    public int get(re.i iVar) {
        return range(iVar).a(getLong(iVar), iVar);
    }

    @Override // re.e
    public long getLong(re.i iVar) {
        int i10;
        if (!(iVar instanceof re.a)) {
            return iVar.getFrom(this);
        }
        int i11 = a.f33827a[((re.a) iVar).ordinal()];
        if (i11 == 1) {
            i10 = this.f33826d;
        } else {
            if (i11 == 2) {
                return g();
            }
            if (i11 == 3) {
                int i12 = this.f33825c;
                if (i12 < 1) {
                    i12 = 1 - i12;
                }
                return i12;
            }
            if (i11 != 4) {
                if (i11 == 5) {
                    return this.f33825c < 1 ? 0 : 1;
                }
                throw new re.m(b.a("Unsupported field: ", iVar));
            }
            i10 = this.f33825c;
        }
        return i10;
    }

    @Override // re.d
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public p j(long j10, re.l lVar) {
        if (!(lVar instanceof re.b)) {
            return (p) lVar.addTo(this, j10);
        }
        switch (a.f33828b[((re.b) lVar).ordinal()]) {
            case 1:
                return i(j10);
            case 2:
                return j(j10);
            case 3:
                return j(z.F(j10, 10));
            case 4:
                return j(z.F(j10, 100));
            case 5:
                return j(z.F(j10, 1000));
            case 6:
                re.a aVar = re.a.ERA;
                return n(aVar, z.D(getLong(aVar), j10));
            default:
                throw new re.m("Unsupported unit: " + lVar);
        }
    }

    public int hashCode() {
        return this.f33825c ^ (this.f33826d << 27);
    }

    public p i(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = (((long) this.f33825c) * 12) + ((long) (this.f33826d - 1)) + j10;
        return k(re.a.YEAR.checkValidIntValue(z.t(j11, 12L)), z.u(j11, 12) + 1);
    }

    @Override // re.e
    public boolean isSupported(re.i iVar) {
        if (iVar instanceof re.a) {
            return iVar == re.a.YEAR || iVar == re.a.MONTH_OF_YEAR || iVar == re.a.PROLEPTIC_MONTH || iVar == re.a.YEAR_OF_ERA || iVar == re.a.ERA;
        }
        return iVar != null && iVar.isSupportedBy(this);
    }

    public p j(long j10) {
        return j10 == 0 ? this : k(re.a.YEAR.checkValidIntValue(((long) this.f33825c) + j10), this.f33826d);
    }

    public final p k(int i10, int i11) {
        return (this.f33825c == i10 && this.f33826d == i11) ? this : new p(i10, i11);
    }

    @Override // re.d
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public p p(re.i iVar, long j10) {
        if (!(iVar instanceof re.a)) {
            return (p) iVar.adjustInto(this, j10);
        }
        re.a aVar = (re.a) iVar;
        aVar.checkValidValue(j10);
        int i10 = a.f33827a[aVar.ordinal()];
        if (i10 == 1) {
            int i11 = (int) j10;
            re.a.MONTH_OF_YEAR.checkValidValue(i11);
            return k(this.f33825c, i11);
        }
        if (i10 == 2) {
            return i(j10 - getLong(re.a.PROLEPTIC_MONTH));
        }
        if (i10 == 3) {
            if (this.f33825c < 1) {
                j10 = 1 - j10;
            }
            return m((int) j10);
        }
        if (i10 == 4) {
            return m((int) j10);
        }
        if (i10 == 5) {
            return getLong(re.a.ERA) == j10 ? this : m(1 - this.f33825c);
        }
        throw new re.m(b.a("Unsupported field: ", iVar));
    }

    public p m(int i10) {
        re.a.YEAR.checkValidValue(i10);
        return k(i10, this.f33826d);
    }

    @Override // qe.c, re.e
    public <R> R query(re.k<R> kVar) {
        if (kVar == re.j.f35374b) {
            return (R) oe.m.f34269e;
        }
        if (kVar == re.j.f35375c) {
            return (R) re.b.MONTHS;
        }
        if (kVar == re.j.f35378f || kVar == re.j.f35379g || kVar == re.j.f35376d || kVar == re.j.f35373a || kVar == re.j.f35377e) {
            return null;
        }
        return (R) super.query(kVar);
    }

    @Override // qe.c, re.e
    public re.n range(re.i iVar) {
        if (iVar == re.a.YEAR_OF_ERA) {
            return re.n.c(1L, this.f33825c <= 0 ? 1000000000L : 999999999L);
        }
        return super.range(iVar);
    }

    public String toString() {
        int i10;
        int iAbs = Math.abs(this.f33825c);
        StringBuilder sb2 = new StringBuilder(9);
        if (iAbs < 1000) {
            int i11 = this.f33825c;
            if (i11 < 0) {
                sb2.append(i11 - 10000);
                i10 = 1;
            } else {
                sb2.append(i11 + 10000);
                i10 = 0;
            }
            sb2.deleteCharAt(i10);
        } else {
            sb2.append(this.f33825c);
        }
        sb2.append(this.f33826d < 10 ? "-0" : "-");
        sb2.append(this.f33826d);
        return sb2.toString();
    }
}
