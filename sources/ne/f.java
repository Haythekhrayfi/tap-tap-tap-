package ne;

import androidx.recyclerview.widget.RecyclerView;
import fd.z;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends oe.b implements Serializable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f33779f = B(-999999999, 1, 1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f33780g = B(999999999, 12, 31);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f33781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final short f33782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final short f33783e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f33785b;

        static {
            int[] iArr = new int[re.b.values().length];
            f33785b = iArr;
            try {
                iArr[re.b.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33785b[re.b.WEEKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33785b[re.b.MONTHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33785b[re.b.YEARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33785b[re.b.DECADES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33785b[re.b.CENTURIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33785b[re.b.MILLENNIA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f33785b[re.b.ERAS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[re.a.values().length];
            f33784a = iArr2;
            try {
                iArr2[re.a.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f33784a[re.a.DAY_OF_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f33784a[re.a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f33784a[re.a.YEAR_OF_ERA.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f33784a[re.a.DAY_OF_WEEK.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f33784a[re.a.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f33784a[re.a.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f33784a[re.a.EPOCH_DAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f33784a[re.a.ALIGNED_WEEK_OF_YEAR.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f33784a[re.a.MONTH_OF_YEAR.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f33784a[re.a.PROLEPTIC_MONTH.ordinal()] = 11;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f33784a[re.a.YEAR.ordinal()] = 12;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f33784a[re.a.ERA.ordinal()] = 13;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    public f(int i10, int i11, int i12) {
        this.f33781c = i10;
        this.f33782d = (short) i11;
        this.f33783e = (short) i12;
    }

    public static f B(int i10, int i11, int i12) {
        re.a.YEAR.checkValidValue(i10);
        re.a.MONTH_OF_YEAR.checkValidValue(i11);
        re.a.DAY_OF_MONTH.checkValidValue(i12);
        return p(i10, i.of(i11), i12);
    }

    public static f C(int i10, i iVar, int i11) {
        re.a.YEAR.checkValidValue(i10);
        z.B(iVar, "month");
        re.a.DAY_OF_MONTH.checkValidValue(i11);
        return p(i10, iVar, i11);
    }

    public static f D(long j10) {
        long j11;
        re.a.EPOCH_DAY.checkValidValue(j10);
        long j12 = (j10 + 719528) - 60;
        if (j12 < 0) {
            long j13 = ((j12 + 1) / 146097) - 1;
            j11 = j13 * 400;
            j12 += (-j13) * 146097;
        } else {
            j11 = 0;
        }
        long j14 = ((j12 * 400) + 591) / 146097;
        long j15 = j12 - ((j14 / 400) + (((j14 / 4) + (j14 * 365)) - (j14 / 100)));
        if (j15 < 0) {
            j14--;
            j15 = j12 - ((j14 / 400) + (((j14 / 4) + (365 * j14)) - (j14 / 100)));
        }
        int i10 = (int) j15;
        int i11 = ((i10 * 5) + 2) / 153;
        return new f(re.a.YEAR.checkValidIntValue(j14 + j11 + ((long) (i11 / 10))), ((i11 + 2) % 12) + 1, (i10 - (((i11 * 306) + 5) / 10)) + 1);
    }

    public static f J(int i10, int i11, int i12) {
        int i13;
        if (i11 != 2) {
            if (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) {
                i13 = 30;
            }
            return B(i10, i11, i12);
        }
        i13 = oe.m.f34269e.n((long) i10) ? 29 : 28;
        i12 = Math.min(i12, i13);
        return B(i10, i11, i12);
    }

    public static f p(int i10, i iVar, int i11) {
        if (i11 <= 28 || i11 <= iVar.length(oe.m.f34269e.n(i10))) {
            return new f(i10, iVar.getValue(), i11);
        }
        if (i11 == 29) {
            throw new ne.a(android.support.v4.media.j.a("Invalid date 'February 29' as '", i10, "' is not a leap year"));
        }
        StringBuilder sbA = defpackage.a.a("Invalid date '");
        sbA.append(iVar.name());
        sbA.append(" ");
        sbA.append(i11);
        sbA.append("'");
        throw new ne.a(sbA.toString());
    }

    public static f r(re.e eVar) {
        f fVar = (f) eVar.query(re.j.f35378f);
        if (fVar != null) {
            return fVar;
        }
        throw new ne.a("Unable to obtain LocalDate from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 3, this);
    }

    public final long A(f fVar) {
        return (((fVar.u() * 32) + ((long) fVar.f33783e)) - ((u() * 32) + ((long) this.f33783e))) / 32;
    }

    @Override // oe.b
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public f j(long j10, re.l lVar) {
        if (!(lVar instanceof re.b)) {
            return (f) lVar.addTo(this, j10);
        }
        switch (a.f33785b[((re.b) lVar).ordinal()]) {
            case 1:
                return F(j10);
            case 2:
                return H(j10);
            case 3:
                return G(j10);
            case 4:
                return I(j10);
            case 5:
                return I(z.F(j10, 10));
            case 6:
                return I(z.F(j10, 100));
            case 7:
                return I(z.F(j10, 1000));
            case 8:
                re.a aVar = re.a.ERA;
                return p(aVar, z.D(getLong(aVar), j10));
            default:
                throw new re.m("Unsupported unit: " + lVar);
        }
    }

    public f F(long j10) {
        return j10 == 0 ? this : D(z.D(l(), j10));
    }

    public f G(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = (((long) this.f33781c) * 12) + ((long) (this.f33782d - 1)) + j10;
        return J(re.a.YEAR.checkValidIntValue(z.t(j11, 12L)), z.u(j11, 12) + 1, this.f33783e);
    }

    public f H(long j10) {
        return F(z.F(j10, 7));
    }

    public f I(long j10) {
        return j10 == 0 ? this : J(re.a.YEAR.checkValidIntValue(((long) this.f33781c) + j10), this.f33782d, this.f33783e);
    }

    @Override // oe.b
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public f o(re.f fVar) {
        return fVar instanceof f ? (f) fVar : (f) fVar.adjustInto(this);
    }

    @Override // oe.b
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public f p(re.i iVar, long j10) {
        if (!(iVar instanceof re.a)) {
            return (f) iVar.adjustInto(this, j10);
        }
        re.a aVar = (re.a) iVar;
        aVar.checkValidValue(j10);
        switch (a.f33784a[aVar.ordinal()]) {
            case 1:
                int i10 = (int) j10;
                return this.f33783e == i10 ? this : B(this.f33781c, this.f33782d, i10);
            case 2:
                return M((int) j10);
            case 3:
                return H(j10 - getLong(re.a.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (this.f33781c < 1) {
                    j10 = 1 - j10;
                }
                return N((int) j10);
            case 5:
                return F(j10 - ((long) t().getValue()));
            case 6:
                return F(j10 - getLong(re.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return F(j10 - getLong(re.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return D(j10);
            case 9:
                return H(j10 - getLong(re.a.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i11 = (int) j10;
                if (this.f33782d == i11) {
                    return this;
                }
                re.a.MONTH_OF_YEAR.checkValidValue(i11);
                return J(this.f33781c, i11, this.f33783e);
            case 11:
                return G(j10 - getLong(re.a.PROLEPTIC_MONTH));
            case 12:
                return N((int) j10);
            case 13:
                return getLong(re.a.ERA) == j10 ? this : N(1 - this.f33781c);
            default:
                throw new re.m(b.a("Unsupported field: ", iVar));
        }
    }

    public f M(int i10) {
        if (getDayOfYear() == i10) {
            return this;
        }
        int i11 = this.f33781c;
        long j10 = i11;
        re.a.YEAR.checkValidValue(j10);
        re.a.DAY_OF_YEAR.checkValidValue(i10);
        boolean zN = oe.m.f34269e.n(j10);
        if (i10 == 366 && !zN) {
            throw new ne.a(android.support.v4.media.j.a("Invalid date 'DayOfYear 366' as '", i11, "' is not a leap year"));
        }
        i iVarOf = i.of(((i10 - 1) / 31) + 1);
        if (i10 > (iVarOf.length(zN) + iVarOf.firstDayOfYear(zN)) - 1) {
            iVarOf = iVarOf.plus(1L);
        }
        return p(i11, iVarOf, (i10 - iVarOf.firstDayOfYear(zN)) + 1);
    }

    public f N(int i10) {
        if (this.f33781c == i10) {
            return this;
        }
        re.a.YEAR.checkValidValue(i10);
        return J(i10, this.f33782d, this.f33783e);
    }

    @Override // oe.b, re.f
    public re.d adjustInto(re.d dVar) {
        return super.adjustInto(dVar);
    }

    @Override // re.d
    public long d(re.d dVar, re.l lVar) {
        long jQ;
        long j10;
        f fVarR = r(dVar);
        if (!(lVar instanceof re.b)) {
            return lVar.between(this, fVarR);
        }
        switch (a.f33785b[((re.b) lVar).ordinal()]) {
            case 1:
                return q(fVarR);
            case 2:
                jQ = q(fVarR);
                j10 = 7;
                break;
            case 3:
                return A(fVarR);
            case 4:
                jQ = A(fVarR);
                j10 = 12;
                break;
            case 5:
                jQ = A(fVarR);
                j10 = 120;
                break;
            case 6:
                jQ = A(fVarR);
                j10 = 1200;
                break;
            case 7:
                jQ = A(fVarR);
                j10 = 12000;
                break;
            case 8:
                re.a aVar = re.a.ERA;
                return fVarR.getLong(aVar) - getLong(aVar);
            default:
                throw new re.m("Unsupported unit: " + lVar);
        }
        return jQ / j10;
    }

    @Override // oe.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && o((f) obj) == 0;
    }

    @Override // oe.b
    public oe.c f(h hVar) {
        return g.u(this, hVar);
    }

    @Override // oe.b
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compareTo(oe.b bVar) {
        return bVar instanceof f ? o((f) bVar) : super.compareTo(bVar);
    }

    @Override // qe.c, re.e
    public int get(re.i iVar) {
        return iVar instanceof re.a ? s(iVar) : range(iVar).a(getLong(iVar), iVar);
    }

    public int getDayOfYear() {
        return (i.of(this.f33782d).firstDayOfYear(w()) + this.f33783e) - 1;
    }

    @Override // re.e
    public long getLong(re.i iVar) {
        if (!(iVar instanceof re.a)) {
            return iVar.getFrom(this);
        }
        if (iVar == re.a.EPOCH_DAY) {
            return l();
        }
        return iVar == re.a.PROLEPTIC_MONTH ? u() : s(iVar);
    }

    @Override // oe.b
    public oe.h h() {
        return oe.m.f34269e;
    }

    @Override // oe.b
    public int hashCode() {
        int i10 = this.f33781c;
        return (((i10 << 11) + (this.f33782d << 6)) + this.f33783e) ^ (i10 & (-2048));
    }

    @Override // oe.b
    public oe.i i() {
        return super.i();
    }

    @Override // oe.b, re.e
    public boolean isSupported(re.i iVar) {
        return super.isSupported(iVar);
    }

    @Override // oe.b
    public long l() {
        long j10;
        long j11 = this.f33781c;
        long j12 = this.f33782d;
        long j13 = (365 * j11) + 0;
        if (j11 >= 0) {
            j10 = ((j11 + 399) / 400) + (((3 + j11) / 4) - ((99 + j11) / 100)) + j13;
        } else {
            j10 = j13 - ((j11 / (-400)) + ((j11 / (-4)) - (j11 / (-100))));
        }
        long j14 = (((367 * j12) - 362) / 12) + j10 + ((long) (this.f33783e - 1));
        if (j12 > 2) {
            j14--;
            if (!w()) {
                j14--;
            }
        }
        return j14 - 719528;
    }

    public int o(f fVar) {
        int i10 = this.f33781c - fVar.f33781c;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f33782d - fVar.f33782d;
        return i11 == 0 ? this.f33783e - fVar.f33783e : i11;
    }

    public long q(f fVar) {
        return fVar.l() - l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oe.b, qe.c, re.e
    public <R> R query(re.k<R> kVar) {
        return kVar == re.j.f35378f ? this : (R) super.query(kVar);
    }

    @Override // qe.c, re.e
    public re.n range(re.i iVar) {
        int iX;
        if (!(iVar instanceof re.a)) {
            return iVar.rangeRefinedBy(this);
        }
        re.a aVar = (re.a) iVar;
        if (!aVar.isDateBased()) {
            throw new re.m(b.a("Unsupported field: ", iVar));
        }
        int i10 = a.f33784a[aVar.ordinal()];
        if (i10 == 1) {
            iX = x();
        } else {
            if (i10 != 2) {
                if (i10 == 3) {
                    return re.n.c(1L, (i.of(this.f33782d) != i.FEBRUARY || w()) ? 5L : 4L);
                }
                if (i10 != 4) {
                    return iVar.range();
                }
                return re.n.c(1L, this.f33781c <= 0 ? 1000000000L : 999999999L);
            }
            iX = w() ? 366 : 365;
        }
        return re.n.c(1L, iX);
    }

    public final int s(re.i iVar) {
        switch (a.f33784a[((re.a) iVar).ordinal()]) {
            case 1:
                return this.f33783e;
            case 2:
                return getDayOfYear();
            case 3:
                return androidx.appcompat.widget.a.a(this.f33783e, 1, 7, 1);
            case 4:
                int i10 = this.f33781c;
                return i10 >= 1 ? i10 : 1 - i10;
            case 5:
                return t().getValue();
            case 6:
                return ((this.f33783e - 1) % 7) + 1;
            case 7:
                return ((getDayOfYear() - 1) % 7) + 1;
            case 8:
                throw new ne.a(b.a("Field too large for an int: ", iVar));
            case 9:
                return ((getDayOfYear() - 1) / 7) + 1;
            case 10:
                return this.f33782d;
            case 11:
                throw new ne.a(b.a("Field too large for an int: ", iVar));
            case 12:
                return this.f33781c;
            case 13:
                return this.f33781c >= 1 ? 1 : 0;
            default:
                throw new re.m(b.a("Unsupported field: ", iVar));
        }
    }

    public c t() {
        return c.of(z.u(l() + 3, 7) + 1);
    }

    @Override // oe.b
    public String toString() {
        int i10;
        int i11 = this.f33781c;
        short s10 = this.f33782d;
        short s11 = this.f33783e;
        int iAbs = Math.abs(i11);
        StringBuilder sb2 = new StringBuilder(10);
        if (iAbs < 1000) {
            if (i11 < 0) {
                sb2.append(i11 - 10000);
                i10 = 1;
            } else {
                sb2.append(i11 + 10000);
                i10 = 0;
            }
            sb2.deleteCharAt(i10);
        } else {
            if (i11 > 9999) {
                sb2.append('+');
            }
            sb2.append(i11);
        }
        sb2.append(s10 < 10 ? "-0" : "-");
        sb2.append((int) s10);
        sb2.append(s11 >= 10 ? "-" : "-0");
        sb2.append((int) s11);
        return sb2.toString();
    }

    public final long u() {
        return (((long) this.f33781c) * 12) + ((long) (this.f33782d - 1));
    }

    public boolean v(oe.b bVar) {
        if (bVar instanceof f) {
            return o((f) bVar) < 0;
        }
        return l() < bVar.l();
    }

    public boolean w() {
        return oe.m.f34269e.n(this.f33781c);
    }

    public int x() {
        short s10 = this.f33782d;
        if (s10 != 2) {
            return (s10 == 4 || s10 == 6 || s10 == 9 || s10 == 11) ? 30 : 31;
        }
        return w() ? 29 : 28;
    }

    @Override // oe.b
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public f i(long j10, re.l lVar) {
        return j10 == Long.MIN_VALUE ? j(RecyclerView.FOREVER_NS, lVar).j(1L, lVar) : j(-j10, lVar);
    }

    public f z(long j10) {
        return j10 == Long.MIN_VALUE ? F(RecyclerView.FOREVER_NS).F(1L) : F(-j10);
    }
}
