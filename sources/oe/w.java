package oe;

/* JADX WARN: Unexpected interfaces in signature: [java.io.Serializable] */
/* JADX INFO: loaded from: classes3.dex */
public final class w extends oe.a<w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne.f f34294c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34295a;

        static {
            int[] iArr = new int[re.a.values().length];
            f34295a = iArr;
            try {
                iArr[re.a.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34295a[re.a.DAY_OF_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34295a[re.a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34295a[re.a.YEAR_OF_ERA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34295a[re.a.PROLEPTIC_MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34295a[re.a.YEAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34295a[re.a.ERA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public w(ne.f fVar) {
        this.f34294c = fVar;
    }

    private Object writeReplace() {
        return new u((byte) 7, this);
    }

    @Override // oe.a, oe.b, re.d
    /* JADX INFO: renamed from: b */
    public re.d j(long j10, re.l lVar) {
        return (w) super.j(j10, lVar);
    }

    @Override // oe.b, qe.b, re.d
    /* JADX INFO: renamed from: c */
    public re.d i(long j10, re.l lVar) {
        return (w) super.i(j10, lVar);
    }

    @Override // oe.b, qe.b, re.d
    /* JADX INFO: renamed from: e */
    public re.d o(re.f fVar) {
        return (w) v.f34292e.c(fVar.adjustInto(this));
    }

    @Override // oe.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            return this.f34294c.equals(((w) obj).f34294c);
        }
        return false;
    }

    @Override // oe.a, oe.b
    public final c<w> f(ne.h hVar) {
        return new d(this, hVar);
    }

    @Override // re.e
    public long getLong(re.i iVar) {
        if (!(iVar instanceof re.a)) {
            return iVar.getFrom(this);
        }
        int i10 = a.f34295a[((re.a) iVar).ordinal()];
        if (i10 == 4) {
            int iT = t();
            if (iT < 1) {
                iT = 1 - iT;
            }
            return iT;
        }
        if (i10 == 5) {
            return s();
        }
        if (i10 == 6) {
            return t();
        }
        if (i10 != 7) {
            return this.f34294c.getLong(iVar);
        }
        return t() < 1 ? 0 : 1;
    }

    @Override // oe.b
    public h h() {
        return v.f34292e;
    }

    @Override // oe.b
    public int hashCode() {
        v vVar = v.f34292e;
        return 146118545 ^ this.f34294c.hashCode();
    }

    @Override // oe.b
    public i i() {
        return (x) super.i();
    }

    @Override // oe.b
    /* JADX INFO: renamed from: j */
    public b i(long j10, re.l lVar) {
        return (w) super.i(j10, lVar);
    }

    @Override // oe.a, oe.b
    /* JADX INFO: renamed from: k */
    public b j(long j10, re.l lVar) {
        return (w) super.j(j10, lVar);
    }

    @Override // oe.b
    public long l() {
        return this.f34294c.l();
    }

    @Override // oe.b
    /* JADX INFO: renamed from: m */
    public b o(re.f fVar) {
        return (w) v.f34292e.c(fVar.adjustInto(this));
    }

    @Override // oe.a
    /* JADX INFO: renamed from: o */
    public oe.a j(long j10, re.l lVar) {
        return (w) super.j(j10, lVar);
    }

    @Override // oe.a
    public oe.a p(long j10) {
        return u(this.f34294c.F(j10));
    }

    @Override // oe.a
    public oe.a q(long j10) {
        return u(this.f34294c.G(j10));
    }

    @Override // oe.a
    public oe.a r(long j10) {
        return u(this.f34294c.I(j10));
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
        int i10 = a.f34295a[aVar.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return this.f34294c.range(iVar);
        }
        if (i10 != 4) {
            return v.f34292e.n(aVar);
        }
        re.n nVarRange = re.a.YEAR.range();
        return re.n.c(1L, t() <= 0 ? (-(nVarRange.f35380c + 543)) + 1 : 543 + nVarRange.f35383f);
    }

    public final long s() {
        return ((((long) t()) * 12) + ((long) this.f34294c.f33782d)) - 1;
    }

    public final int t() {
        return this.f34294c.f33781c + 543;
    }

    public final w u(ne.f fVar) {
        return fVar.equals(this.f34294c) ? this : new w(fVar);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:24:0x0072  */
    /* JADX WARN: Code duplicated, block: B:26:0x007f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0088  */
    @Override // oe.b
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public w p(re.i iVar, long j10) {
        int iA;
        int i10;
        if (!(iVar instanceof re.a)) {
            return (w) iVar.adjustInto(this, j10);
        }
        re.a aVar = (re.a) iVar;
        if (getLong(aVar) == j10) {
            return this;
        }
        int[] iArr = a.f34295a;
        int i11 = iArr[aVar.ordinal()];
        if (i11 == 4) {
            iA = v.f34292e.n(aVar).a(j10, aVar);
            i10 = iArr[aVar.ordinal()];
            if (i10 != 4) {
                ne.f fVar = this.f34294c;
                if (t() < 1) {
                    iA = 1 - iA;
                }
                return u(fVar.N(iA - 543));
            }
            if (i10 != 6) {
                return u(this.f34294c.N(iA - 543));
            }
            if (i10 == 7) {
                return u(this.f34294c.N((1 - t()) - 543));
            }
        } else {
            if (i11 == 5) {
                v.f34292e.n(aVar).b(j10, aVar);
                return u(this.f34294c.G(j10 - s()));
            }
            if (i11 == 6 || i11 == 7) {
                iA = v.f34292e.n(aVar).a(j10, aVar);
                i10 = iArr[aVar.ordinal()];
                if (i10 != 4) {
                    ne.f fVar2 = this.f34294c;
                    if (t() < 1) {
                        iA = 1 - iA;
                    }
                    return u(fVar2.N(iA - 543));
                }
                if (i10 != 6) {
                    return u(this.f34294c.N(iA - 543));
                }
                if (i10 == 7) {
                    return u(this.f34294c.N((1 - t()) - 543));
                }
            }
        }
        return u(this.f34294c.p(iVar, j10));
    }
}
