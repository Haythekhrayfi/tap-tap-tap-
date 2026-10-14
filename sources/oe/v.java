package oe;

import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends h implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v f34292e = new v();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34293a;

        static {
            int[] iArr = new int[re.a.values().length];
            f34293a = iArr;
            try {
                iArr[re.a.PROLEPTIC_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34293a[re.a.YEAR_OF_ERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34293a[re.a.YEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map.put("en", new String[]{"BB", "BE"});
        map.put("th", new String[]{"BB", "BE"});
        map2.put("en", new String[]{"B.B.", "B.E."});
        map2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        map3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        map3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    private Object readResolve() {
        return f34292e;
    }

    @Override // oe.h
    public b b(re.e eVar) {
        return eVar instanceof w ? (w) eVar : new w(ne.f.r(eVar));
    }

    @Override // oe.h
    public i f(int i10) {
        return x.of(i10);
    }

    @Override // oe.h
    public String h() {
        return "buddhist";
    }

    @Override // oe.h
    public String i() {
        return "ThaiBuddhist";
    }

    @Override // oe.h
    public c<w> j(re.e eVar) {
        return super.j(eVar);
    }

    @Override // oe.h
    public f<w> l(ne.e eVar, ne.q qVar) {
        return g.t(this, eVar, qVar);
    }

    @Override // oe.h
    public f<w> m(re.e eVar) {
        return super.m(eVar);
    }

    public re.n n(re.a aVar) {
        int i10 = a.f34293a[aVar.ordinal()];
        if (i10 == 1) {
            re.n nVarRange = re.a.PROLEPTIC_MONTH.range();
            return re.n.c(nVarRange.f35380c + 6516, nVarRange.f35383f + 6516);
        }
        if (i10 == 2) {
            re.n nVarRange2 = re.a.YEAR.range();
            return re.n.d(1L, 1 + (-(nVarRange2.f35380c + 543)), nVarRange2.f35383f + 543);
        }
        if (i10 != 3) {
            return aVar.range();
        }
        re.n nVarRange3 = re.a.YEAR.range();
        return re.n.c(nVarRange3.f35380c + 543, nVarRange3.f35383f + 543);
    }
}
