package oe;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Calendar;
import java.util.Objects;

/* JADX WARN: Unexpected interfaces in signature: [java.io.Serializable] */
/* JADX INFO: loaded from: classes3.dex */
public final class p extends oe.a<p> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ne.f f34276f = ne.f.B(1873, 1, 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne.f f34277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient q f34278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient int f34279e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34280a;

        static {
            int[] iArr = new int[re.a.values().length];
            f34280a = iArr;
            try {
                iArr[re.a.DAY_OF_YEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34280a[re.a.YEAR_OF_ERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34280a[re.a.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34280a[re.a.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34280a[re.a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34280a[re.a.ALIGNED_WEEK_OF_YEAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34280a[re.a.ERA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public p(ne.f fVar) {
        if (fVar.v(f34276f)) {
            throw new ne.a("Minimum supported date is January 1st Meiji 6");
        }
        q qVarG = q.g(fVar);
        this.f34278d = qVarG;
        this.f34279e = fVar.f33781c - (qVarG.f34284d.f33781c - 1);
        this.f34277c = fVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        q qVarG = q.g(this.f34277c);
        this.f34278d = qVarG;
        this.f34279e = this.f34277c.f33781c - (qVarG.f34284d.f33781c - 1);
    }

    private Object writeReplace() {
        return new u((byte) 1, this);
    }

    @Override // oe.a, oe.b, re.d
    /* JADX INFO: renamed from: b */
    public re.d j(long j10, re.l lVar) {
        return (p) super.j(j10, lVar);
    }

    @Override // oe.b, qe.b, re.d
    /* JADX INFO: renamed from: c */
    public re.d i(long j10, re.l lVar) {
        return (p) super.i(j10, lVar);
    }

    @Override // oe.b, qe.b, re.d
    /* JADX INFO: renamed from: e */
    public re.d o(re.f fVar) {
        return (p) o.f34271f.c(fVar.adjustInto(this));
    }

    @Override // oe.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return this.f34277c.equals(((p) obj).f34277c);
        }
        return false;
    }

    @Override // oe.a, oe.b
    public final c<p> f(ne.h hVar) {
        return new d(this, hVar);
    }

    @Override // re.e
    public long getLong(re.i iVar) {
        if (!(iVar instanceof re.a)) {
            return iVar.getFrom(this);
        }
        switch (a.f34280a[((re.a) iVar).ordinal()]) {
            case 1:
                return t();
            case 2:
                return this.f34279e;
            case 3:
            case 4:
            case 5:
            case 6:
                throw new re.m(ne.b.a("Unsupported field: ", iVar));
            case 7:
                return this.f34278d.f34283c;
            default:
                return this.f34277c.getLong(iVar);
        }
    }

    @Override // oe.b
    public h h() {
        return o.f34271f;
    }

    @Override // oe.b
    public int hashCode() {
        Objects.requireNonNull(o.f34271f);
        return (-688086063) ^ this.f34277c.hashCode();
    }

    @Override // oe.b
    public i i() {
        return this.f34278d;
    }

    @Override // oe.b, re.e
    public boolean isSupported(re.i iVar) {
        if (iVar == re.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || iVar == re.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || iVar == re.a.ALIGNED_WEEK_OF_MONTH || iVar == re.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return super.isSupported(iVar);
    }

    @Override // oe.b
    /* JADX INFO: renamed from: j */
    public b i(long j10, re.l lVar) {
        return (p) super.i(j10, lVar);
    }

    @Override // oe.a, oe.b
    /* JADX INFO: renamed from: k */
    public b j(long j10, re.l lVar) {
        return (p) super.j(j10, lVar);
    }

    @Override // oe.b
    public long l() {
        return this.f34277c.l();
    }

    @Override // oe.b
    /* JADX INFO: renamed from: m */
    public b o(re.f fVar) {
        return (p) o.f34271f.c(fVar.adjustInto(this));
    }

    @Override // oe.a
    /* JADX INFO: renamed from: o */
    public oe.a j(long j10, re.l lVar) {
        return (p) super.j(j10, lVar);
    }

    @Override // oe.a
    public oe.a p(long j10) {
        return u(this.f34277c.F(j10));
    }

    @Override // oe.a
    public oe.a q(long j10) {
        return u(this.f34277c.G(j10));
    }

    @Override // oe.a
    public oe.a r(long j10) {
        return u(this.f34277c.I(j10));
    }

    @Override // qe.c, re.e
    public re.n range(re.i iVar) {
        if (!(iVar instanceof re.a)) {
            return iVar.rangeRefinedBy(this);
        }
        if (!isSupported(iVar)) {
            throw new re.m(ne.b.a("Unsupported field: ", iVar));
        }
        re.a aVar = (re.a) iVar;
        int i10 = a.f34280a[aVar.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? o.f34271f.n(aVar) : s(1);
        }
        return s(6);
    }

    public final re.n s(int i10) {
        Calendar calendar = Calendar.getInstance(o.f34270e);
        calendar.set(0, this.f34278d.f34283c + 2);
        int i11 = this.f34279e;
        ne.f fVar = this.f34277c;
        calendar.set(i11, fVar.f33782d - 1, fVar.f33783e);
        return re.n.c(calendar.getActualMinimum(i10), calendar.getActualMaximum(i10));
    }

    public final long t() {
        return this.f34279e == 1 ? (this.f34277c.getDayOfYear() - this.f34278d.f34284d.getDayOfYear()) + 1 : this.f34277c.getDayOfYear();
    }

    public final p u(ne.f fVar) {
        return fVar.equals(this.f34277c) ? this : new p(fVar);
    }

    @Override // oe.b
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public p p(re.i iVar, long j10) {
        if (!(iVar instanceof re.a)) {
            return (p) iVar.adjustInto(this, j10);
        }
        re.a aVar = (re.a) iVar;
        if (getLong(aVar) == j10) {
            return this;
        }
        int[] iArr = a.f34280a;
        int i10 = iArr[aVar.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 7) {
            int iA = o.f34271f.n(aVar).a(j10, aVar);
            int i11 = iArr[aVar.ordinal()];
            if (i11 == 1) {
                return u(this.f34277c.F(((long) iA) - t()));
            }
            if (i11 == 2) {
                return w(this.f34278d, iA);
            }
            if (i11 == 7) {
                return w(q.h(iA), this.f34279e);
            }
        }
        return u(this.f34277c.p(iVar, j10));
    }

    public final p w(q qVar, int i10) {
        Objects.requireNonNull(o.f34271f);
        if (!(qVar instanceof q)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int i11 = (qVar.f34284d.f33781c + i10) - 1;
        re.n.c(1L, (qVar.f().f33781c - qVar.f34284d.f33781c) + 1).b(i10, re.a.YEAR_OF_ERA);
        return u(this.f34277c.N(i11));
    }
}
