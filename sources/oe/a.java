package oe;

import fd.z;
import oe.b;

/* JADX WARN: Unexpected interfaces in signature: [re.f, java.io.Serializable] */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a<D extends b> extends b implements re.d {

    /* JADX INFO: renamed from: oe.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0381a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34232a;

        static {
            int[] iArr = new int[re.b.values().length];
            f34232a = iArr;
            try {
                iArr[re.b.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34232a[re.b.WEEKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34232a[re.b.MONTHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34232a[re.b.YEARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34232a[re.b.DECADES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34232a[re.b.CENTURIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34232a[re.b.MILLENNIA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // re.d
    public long d(re.d dVar, re.l lVar) {
        b bVarB = h().b(dVar);
        return lVar instanceof re.b ? ne.f.r(this).d(bVarB, lVar) : lVar.between(this, bVarB);
    }

    @Override // oe.b
    public c<?> f(ne.h hVar) {
        return new d(this, hVar);
    }

    @Override // oe.b
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public a<D> j(long j10, re.l lVar) {
        if (!(lVar instanceof re.b)) {
            return (a) h().c(lVar.addTo(this, j10));
        }
        switch (C0381a.f34232a[((re.b) lVar).ordinal()]) {
            case 1:
                return p(j10);
            case 2:
                return p(z.F(j10, 7));
            case 3:
                return q(j10);
            case 4:
                return r(j10);
            case 5:
                return r(z.F(j10, 10));
            case 6:
                return r(z.F(j10, 100));
            case 7:
                return r(z.F(j10, 1000));
            default:
                throw new ne.a(lVar + " not valid for chronology " + h().i());
        }
    }

    public abstract a<D> p(long j10);

    public abstract a<D> q(long j10);

    public abstract a<D> r(long j10);
}
