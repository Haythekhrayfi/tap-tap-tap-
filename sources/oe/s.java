package oe;

/* JADX WARN: Unexpected interfaces in signature: [java.io.Serializable] */
/* JADX INFO: loaded from: classes3.dex */
public final class s extends oe.a<s> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne.f f34288c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34289a;

        static {
            int[] iArr = new int[re.a.values().length];
            f34289a = iArr;
            try {
                iArr[re.a.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34289a[re.a.DAY_OF_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34289a[re.a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34289a[re.a.YEAR_OF_ERA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34289a[re.a.PROLEPTIC_MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34289a[re.a.YEAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34289a[re.a.ERA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public s(ne.f fVar) {
        this.f34288c = fVar;
    }

    private Object writeReplace() {
        return new u((byte) 5, this);
    }

    @Override // oe.a, oe.b, re.d
    /* JADX INFO: renamed from: b */
    public re.d j(long j10, re.l lVar) {
        return (s) super.j(j10, lVar);
    }

    @Override // oe.b, qe.b, re.d
    /* JADX INFO: renamed from: c */
    public re.d i(long j10, re.l lVar) {
        return (s) super.i(j10, lVar);
    }

    @Override // oe.b, qe.b, re.d
    /* JADX INFO: renamed from: e */
    public re.d o(re.f fVar) {
        return (s) r.f34286e.c(fVar.adjustInto(this));
    }

    @Override // oe.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            return this.f34288c.equals(((s) obj).f34288c);
        }
        return false;
    }

    @Override // oe.a, oe.b
    public final c<s> f(ne.h hVar) {
        return new d(this, hVar);
    }

    @Override // re.e
    public long getLong(re.i iVar) {
        if (!(iVar instanceof re.a)) {
            return iVar.getFrom(this);
        }
        int i10 = a.f34289a[((re.a) iVar).ordinal()];
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
            return this.f34288c.getLong(iVar);
        }
        return t() < 1 ? 0 : 1;
    }

    @Override // oe.b
    public h h() {
        return r.f34286e;
    }

    @Override // oe.b
    public int hashCode() {
        r rVar = r.f34286e;
        return (-1990173233) ^ this.f34288c.hashCode();
    }

    @Override // oe.b
    public i i() {
        return (t) super.i();
    }

    @Override // oe.b
    /* JADX INFO: renamed from: j */
    public b i(long j10, re.l lVar) {
        return (s) super.i(j10, lVar);
    }

    @Override // oe.a, oe.b
    /* JADX INFO: renamed from: k */
    public b j(long j10, re.l lVar) {
        return (s) super.j(j10, lVar);
    }

    @Override // oe.b
    public long l() {
        return this.f34288c.l();
    }

    @Override // oe.b
    /* JADX INFO: renamed from: m */
    public b o(re.f fVar) {
        return (s) r.f34286e.c(fVar.adjustInto(this));
    }

    @Override // oe.a
    /* JADX INFO: renamed from: o */
    public oe.a j(long j10, re.l lVar) {
        return (s) super.j(j10, lVar);
    }

    @Override // oe.a
    public oe.a p(long j10) {
        return u(this.f34288c.F(j10));
    }

    @Override // oe.a
    public oe.a q(long j10) {
        return u(this.f34288c.G(j10));
    }

    @Override // oe.a
    public oe.a r(long j10) {
        return u(this.f34288c.I(j10));
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
        int i10 = a.f34289a[aVar.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return this.f34288c.range(iVar);
        }
        if (i10 != 4) {
            return r.f34286e.n(aVar);
        }
        re.n nVarRange = re.a.YEAR.range();
        return re.n.c(1L, t() <= 0 ? (-nVarRange.f35380c) + 1 + 1911 : nVarRange.f35383f - 1911);
    }

    public final long s() {
        return ((((long) t()) * 12) + ((long) this.f34288c.f33782d)) - 1;
    }

    public final int t() {
        return this.f34288c.f33781c - 1911;
    }

    public final s u(ne.f fVar) {
        return fVar.equals(this.f34288c) ? this : new s(fVar);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:24:0x0072  */
    /* JADX WARN: Code duplicated, block: B:26:0x007f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0087  */
    /* JADX WARN: Code duplicated, block: B:29:0x008a  */
    @Override // oe.b
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public s p(re.i iVar, long j10) {
        int iA;
        int i10;
        int i11;
        if (!(iVar instanceof re.a)) {
            return (s) iVar.adjustInto(this, j10);
        }
        re.a aVar = (re.a) iVar;
        if (getLong(aVar) == j10) {
            return this;
        }
        int[] iArr = a.f34289a;
        int i12 = iArr[aVar.ordinal()];
        if (i12 == 4) {
            iA = r.f34286e.n(aVar).a(j10, aVar);
            i10 = iArr[aVar.ordinal()];
            if (i10 != 4) {
                ne.f fVar = this.f34288c;
                if (t() >= 1) {
                    i11 = iA + 1911;
                } else {
                    i11 = (1 - iA) + 1911;
                }
                return u(fVar.N(i11));
            }
            if (i10 != 6) {
                return u(this.f34288c.N(iA + 1911));
            }
            if (i10 == 7) {
                return u(this.f34288c.N((1 - t()) + 1911));
            }
        } else {
            if (i12 == 5) {
                r.f34286e.n(aVar).b(j10, aVar);
                return u(this.f34288c.G(j10 - s()));
            }
            if (i12 == 6 || i12 == 7) {
                iA = r.f34286e.n(aVar).a(j10, aVar);
                i10 = iArr[aVar.ordinal()];
                if (i10 != 4) {
                    ne.f fVar2 = this.f34288c;
                    if (t() >= 1) {
                        i11 = iA + 1911;
                    } else {
                        i11 = (1 - iA) + 1911;
                    }
                    return u(fVar2.N(i11));
                }
                if (i10 != 6) {
                    return u(this.f34288c.N(iA + 1911));
                }
                if (i10 == 7) {
                    return u(this.f34288c.N((1 - t()) + 1911));
                }
            }
        }
        return u(this.f34288c.p(iVar, j10));
    }
}
