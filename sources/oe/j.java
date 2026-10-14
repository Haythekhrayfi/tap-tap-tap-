package oe;

import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends h implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f34243e = new j();

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map.put("en", new String[]{"BH", "HE"});
        map2.put("en", new String[]{"B.H.", "H.E."});
        map3.put("en", new String[]{"Before Hijrah", "Hijrah Era"});
    }

    private Object readResolve() {
        return f34243e;
    }

    @Override // oe.h
    public b b(re.e eVar) {
        return eVar instanceof k ? (k) eVar : new k(eVar.getLong(re.a.EPOCH_DAY));
    }

    @Override // oe.h
    public i f(int i10) {
        if (i10 == 0) {
            return l.BEFORE_AH;
        }
        if (i10 == 1) {
            return l.AH;
        }
        throw new ne.a("invalid Hijrah era");
    }

    @Override // oe.h
    public String h() {
        return "islamic-umalqura";
    }

    @Override // oe.h
    public String i() {
        return "Hijrah-umalqura";
    }

    @Override // oe.h
    public c<k> j(re.e eVar) {
        return super.j(eVar);
    }

    @Override // oe.h
    public f<k> l(ne.e eVar, ne.q qVar) {
        return g.t(this, eVar, qVar);
    }

    @Override // oe.h
    public f<k> m(re.e eVar) {
        return super.m(eVar);
    }
}
