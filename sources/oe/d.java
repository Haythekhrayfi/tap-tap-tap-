package oe;

import fd.z;
import oe.b;
import org.joda.time.DateTimeConstants;

/* JADX WARN: Unexpected interfaces in signature: [re.f, java.io.Serializable] */
/* JADX INFO: loaded from: classes3.dex */
public final class d<D extends b> extends c<D> implements re.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D f34233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ne.h f34234d;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34235a;

        static {
            int[] iArr = new int[re.b.values().length];
            f34235a = iArr;
            try {
                iArr[re.b.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34235a[re.b.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34235a[re.b.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34235a[re.b.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34235a[re.b.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34235a[re.b.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34235a[re.b.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public d(D d10, ne.h hVar) {
        z.B(d10, "date");
        z.B(hVar, "time");
        this.f34233c = d10;
        this.f34234d = hVar;
    }

    private Object writeReplace() {
        return new u((byte) 12, this);
    }

    @Override // re.d
    public long d(re.d dVar, re.l lVar) {
        long j10;
        int i10;
        c<?> cVarJ = this.f34233c.h().j(dVar);
        if (!(lVar instanceof re.b)) {
            return lVar.between(this, cVarJ);
        }
        re.b bVar = (re.b) lVar;
        if (!bVar.isTimeBased()) {
            b bVarM = cVarJ.m();
            if (cVarJ.n().compareTo(this.f34234d) < 0) {
                bVarM = bVarM.i(1L, re.b.DAYS);
            }
            return this.f34233c.d(bVarM, lVar);
        }
        re.a aVar = re.a.EPOCH_DAY;
        long jG = cVarJ.getLong(aVar) - this.f34233c.getLong(aVar);
        switch (a.f34235a[bVar.ordinal()]) {
            case 1:
                j10 = 86400000000000L;
                jG = z.G(jG, j10);
                return z.D(jG, this.f34234d.d(cVarJ.n(), lVar));
            case 2:
                j10 = 86400000000L;
                jG = z.G(jG, j10);
                return z.D(jG, this.f34234d.d(cVarJ.n(), lVar));
            case 3:
                j10 = 86400000;
                jG = z.G(jG, j10);
                return z.D(jG, this.f34234d.d(cVarJ.n(), lVar));
            case 4:
                i10 = DateTimeConstants.SECONDS_PER_DAY;
                break;
            case 5:
                i10 = DateTimeConstants.MINUTES_PER_DAY;
                break;
            case 6:
                i10 = 24;
                break;
            case 7:
                i10 = 2;
                break;
            default:
                return z.D(jG, this.f34234d.d(cVarJ.n(), lVar));
        }
        jG = z.F(jG, i10);
        return z.D(jG, this.f34234d.d(cVarJ.n(), lVar));
    }

    @Override // oe.c
    public f<D> f(ne.q qVar) {
        return g.s(this, qVar, null);
    }

    @Override // qe.c, re.e
    public int get(re.i iVar) {
        if (iVar instanceof re.a) {
            return iVar.isTimeBased() ? this.f34234d.get(iVar) : this.f34233c.get(iVar);
        }
        return range(iVar).a(getLong(iVar), iVar);
    }

    @Override // re.e
    public long getLong(re.i iVar) {
        if (iVar instanceof re.a) {
            return iVar.isTimeBased() ? this.f34234d.getLong(iVar) : this.f34233c.getLong(iVar);
        }
        return iVar.getFrom(this);
    }

    @Override // re.e
    public boolean isSupported(re.i iVar) {
        if (iVar instanceof re.a) {
            return iVar.isDateBased() || iVar.isTimeBased();
        }
        return iVar != null && iVar.isSupportedBy(this);
    }

    @Override // oe.c
    public D m() {
        return this.f34233c;
    }

    @Override // oe.c
    public ne.h n() {
        return this.f34234d;
    }

    @Override // oe.c
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public d<D> j(long j10, re.l lVar) {
        if (!(lVar instanceof re.b)) {
            return this.f34233c.h().d(lVar.addTo(this, j10));
        }
        switch (a.f34235a[((re.b) lVar).ordinal()]) {
            case 1:
                return s(j10);
            case 2:
                return r(j10 / 86400000000L).s((j10 % 86400000000L) * 1000);
            case 3:
                return r(j10 / 86400000).s((j10 % 86400000) * 1000000);
            case 4:
                return t(this.f34233c, 0L, 0L, j10, 0L);
            case 5:
                return t(this.f34233c, 0L, j10, 0L, 0L);
            case 6:
                return t(this.f34233c, j10, 0L, 0L, 0L);
            case 7:
                d<D> dVarR = r(j10 / 256);
                return dVarR.t(dVarR.f34233c, (j10 % 256) * 12, 0L, 0L, 0L);
            default:
                return u(this.f34233c.j(j10, lVar), this.f34234d);
        }
    }

    public final d<D> r(long j10) {
        return u(this.f34233c.j(j10, re.b.DAYS), this.f34234d);
    }

    @Override // qe.c, re.e
    public re.n range(re.i iVar) {
        if (iVar instanceof re.a) {
            return iVar.isTimeBased() ? this.f34234d.range(iVar) : this.f34233c.range(iVar);
        }
        return iVar.rangeRefinedBy(this);
    }

    public final d<D> s(long j10) {
        return t(this.f34233c, 0L, 0L, 0L, j10);
    }

    public final d<D> t(D d10, long j10, long j11, long j12, long j13) {
        ne.h hVarJ;
        b bVarK = d10;
        if ((j10 | j11 | j12 | j13) == 0) {
            hVarJ = this.f34234d;
        } else {
            long j14 = j10 / 24;
            long j15 = ((j10 % 24) * 3600000000000L) + ((j11 % 1440) * 60000000000L) + ((j12 % 86400) * 1000000000) + (j13 % 86400000000000L);
            long jQ = this.f34234d.q();
            long j16 = j15 + jQ;
            long jT = z.t(j16, 86400000000000L) + j14 + (j11 / 1440) + (j12 / 86400) + (j13 / 86400000000000L);
            long jV = z.v(j16, 86400000000000L);
            hVarJ = jV == jQ ? this.f34234d : ne.h.j(jV);
            bVarK = bVarK.j(jT, re.b.DAYS);
        }
        return u(bVarK, hVarJ);
    }

    public final d<D> u(re.d dVar, ne.h hVar) {
        D d10 = this.f34233c;
        return (d10 == dVar && this.f34234d == hVar) ? this : new d<>(d10.h().c(dVar), hVar);
    }

    @Override // oe.c
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public d<D> o(re.f fVar) {
        if (fVar instanceof b) {
            return u((b) fVar, this.f34234d);
        }
        if (fVar instanceof ne.h) {
            return u(this.f34233c, (ne.h) fVar);
        }
        return fVar instanceof d ? this.f34233c.h().d((d) fVar) : this.f34233c.h().d((d) fVar.adjustInto(this));
    }

    @Override // oe.c
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public d<D> p(re.i iVar, long j10) {
        if (iVar instanceof re.a) {
            return iVar.isTimeBased() ? u(this.f34233c, this.f34234d.n(iVar, j10)) : u(this.f34233c.p(iVar, j10), this.f34234d);
        }
        return this.f34233c.h().d(iVar.adjustInto(this, j10));
    }
}
