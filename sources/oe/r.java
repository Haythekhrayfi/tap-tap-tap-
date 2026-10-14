package oe;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends h implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r f34286e = new r();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34287a;

        static {
            int[] iArr = new int[re.a.values().length];
            f34287a = iArr;
            try {
                iArr[re.a.PROLEPTIC_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34287a[re.a.YEAR_OF_ERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34287a[re.a.YEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private Object readResolve() {
        return f34286e;
    }

    @Override // oe.h
    public b b(re.e eVar) {
        return eVar instanceof s ? (s) eVar : new s(ne.f.r(eVar));
    }

    @Override // oe.h
    public i f(int i10) {
        return t.of(i10);
    }

    @Override // oe.h
    public String h() {
        return "roc";
    }

    @Override // oe.h
    public String i() {
        return "Minguo";
    }

    @Override // oe.h
    public c<s> j(re.e eVar) {
        return super.j(eVar);
    }

    @Override // oe.h
    public f<s> l(ne.e eVar, ne.q qVar) {
        return g.t(this, eVar, qVar);
    }

    @Override // oe.h
    public f<s> m(re.e eVar) {
        return super.m(eVar);
    }

    public re.n n(re.a aVar) {
        int i10 = a.f34287a[aVar.ordinal()];
        if (i10 == 1) {
            re.n nVarRange = re.a.PROLEPTIC_MONTH.range();
            return re.n.c(nVarRange.f35380c - 22932, nVarRange.f35383f - 22932);
        }
        if (i10 == 2) {
            re.n nVarRange2 = re.a.YEAR.range();
            return re.n.d(1L, nVarRange2.f35383f - 1911, (-nVarRange2.f35380c) + 1 + 1911);
        }
        if (i10 != 3) {
            return aVar.range();
        }
        re.n nVarRange3 = re.a.YEAR.range();
        return re.n.c(nVarRange3.f35380c - 1911, nVarRange3.f35383f - 1911);
    }
}
