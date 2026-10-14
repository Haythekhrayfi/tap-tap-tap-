package oe;

import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import org.threeten.bp.chrono.JapaneseEra;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends qe.a implements Serializable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q f34281f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicReference<JapaneseEra[]> f34282g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient ne.f f34284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient String f34285e;

    static {
        q qVar = new q(-1, ne.f.B(1868, 9, 8), "Meiji");
        f34281f = qVar;
        f34282g = new AtomicReference<>(new q[]{qVar, new q(0, ne.f.B(1912, 7, 30), "Taisho"), new q(1, ne.f.B(1926, 12, 25), "Showa"), new q(2, ne.f.B(1989, 1, 8), "Heisei"), new q(3, ne.f.B(2019, 5, 1), "Reiwa")});
    }

    public q(int i10, ne.f fVar, String str) {
        this.f34283c = i10;
        this.f34284d = fVar;
        this.f34285e = str;
    }

    public static q g(ne.f fVar) {
        if (fVar.v(f34281f.f34284d)) {
            throw new ne.a("Date too early: " + fVar);
        }
        q[] qVarArr = f34282g.get();
        for (int length = qVarArr.length - 1; length >= 0; length--) {
            q qVar = qVarArr[length];
            if (fVar.compareTo(qVar.f34284d) >= 0) {
                return qVar;
            }
        }
        return null;
    }

    public static q h(int i10) {
        q[] qVarArr = f34282g.get();
        if (i10 < f34281f.f34283c || i10 > qVarArr[qVarArr.length - 1].f34283c) {
            throw new ne.a("japaneseEra is invalid");
        }
        return qVarArr[i10 + 1];
    }

    public static q[] i() {
        q[] qVarArr = f34282g.get();
        return (q[]) Arrays.copyOf(qVarArr, qVarArr.length);
    }

    private Object readResolve() throws ObjectStreamException {
        try {
            return h(this.f34283c);
        } catch (ne.a e10) {
            InvalidObjectException invalidObjectException = new InvalidObjectException("Invalid era");
            invalidObjectException.initCause(e10);
            throw invalidObjectException;
        }
    }

    private Object writeReplace() {
        return new u((byte) 2, this);
    }

    public ne.f f() {
        int i10 = this.f34283c + 1;
        q[] qVarArrI = i();
        return i10 >= qVarArrI.length + (-1) ? ne.f.f33780g : qVarArrI[i10 + 1].f34284d.z(1L);
    }

    @Override // qe.c, re.e
    public re.n range(re.i iVar) {
        re.a aVar = re.a.ERA;
        return iVar == aVar ? o.f34271f.n(aVar) : super.range(iVar);
    }

    public String toString() {
        return this.f34285e;
    }
}
