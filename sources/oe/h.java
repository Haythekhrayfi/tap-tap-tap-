package oe;

import fd.z;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h implements Comparable<h> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap<String, h> f34241c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap<String, h> f34242d = new ConcurrentHashMap<>();

    static {
        try {
            Locale.class.getMethod("getUnicodeLocaleType", String.class);
        } catch (Throwable unused) {
        }
    }

    public static h g(re.e eVar) {
        z.B(eVar, "temporal");
        h hVar = (h) eVar.query(re.j.f35374b);
        return hVar != null ? hVar : m.f34269e;
    }

    public static void k(h hVar) {
        f34241c.putIfAbsent(hVar.i(), hVar);
        String strH = hVar.h();
        if (strH != null) {
            f34242d.putIfAbsent(strH, hVar);
        }
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new u((byte) 11, this);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(h hVar) {
        return i().compareTo(hVar.i());
    }

    public abstract b b(re.e eVar);

    public <D extends b> D c(re.d dVar) {
        D d10 = (D) dVar;
        if (equals(d10.h())) {
            return d10;
        }
        StringBuilder sbA = defpackage.a.a("Chrono mismatch, expected: ");
        sbA.append(i());
        sbA.append(", actual: ");
        sbA.append(d10.h().i());
        throw new ClassCastException(sbA.toString());
    }

    public <D extends b> d<D> d(re.d dVar) {
        d<D> dVar2 = (d) dVar;
        if (equals(dVar2.f34233c.h())) {
            return dVar2;
        }
        StringBuilder sbA = defpackage.a.a("Chrono mismatch, required: ");
        sbA.append(i());
        sbA.append(", supplied: ");
        sbA.append(dVar2.f34233c.h().i());
        throw new ClassCastException(sbA.toString());
    }

    public <D extends b> g<D> e(re.d dVar) {
        g<D> gVar = (g) dVar;
        if (equals(gVar.l().h())) {
            return gVar;
        }
        StringBuilder sbA = defpackage.a.a("Chrono mismatch, required: ");
        sbA.append(i());
        sbA.append(", supplied: ");
        sbA.append(gVar.l().h().i());
        throw new ClassCastException(sbA.toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && compareTo((h) obj) == 0;
    }

    public abstract i f(int i10);

    public abstract String h();

    public int hashCode() {
        return getClass().hashCode() ^ i().hashCode();
    }

    public abstract String i();

    public c<?> j(re.e eVar) {
        try {
            return b(eVar).f(ne.h.h(eVar));
        } catch (ne.a e10) {
            StringBuilder sbA = defpackage.a.a("Unable to obtain ChronoLocalDateTime from TemporalAccessor: ");
            sbA.append(eVar.getClass());
            throw new ne.a(sbA.toString(), e10);
        }
    }

    public f<?> l(ne.e eVar, ne.q qVar) {
        return g.t(this, eVar, qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [oe.f, oe.f<?>] */
    public f<?> m(re.e eVar) {
        try {
            ne.q qVarF = ne.q.f(eVar);
            try {
                eVar = l(ne.e.h(eVar), qVarF);
                return eVar;
            } catch (ne.a unused) {
                return g.s(d(j(eVar)), qVarF, null);
            }
        } catch (ne.a e10) {
            StringBuilder sbA = defpackage.a.a("Unable to obtain ChronoZonedDateTime from TemporalAccessor: ");
            sbA.append(eVar.getClass());
            throw new ne.a(sbA.toString(), e10);
        }
    }

    public String toString() {
        return i();
    }
}
