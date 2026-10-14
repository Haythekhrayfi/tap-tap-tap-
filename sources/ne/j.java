package ne;

import androidx.appcompat.widget.r0;
import ch.qos.logback.core.CoreConstants;
import fd.z;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;

/* JADX WARN: Unexpected interfaces in signature: [java.io.Serializable] */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends qe.c implements re.e, re.f, Comparable<j> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f33801e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f33802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f33803d;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33804a;

        static {
            int[] iArr = new int[re.a.values().length];
            f33804a = iArr;
            try {
                iArr[re.a.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33804a[re.a.MONTH_OF_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        pe.b bVar = new pe.b();
        bVar.d("--");
        bVar.h(re.a.MONTH_OF_YEAR, 2);
        bVar.c(CoreConstants.DASH_CHAR);
        bVar.h(re.a.DAY_OF_MONTH, 2);
        bVar.l();
    }

    public j(int i10, int i11) {
        this.f33802c = i10;
        this.f33803d = i11;
    }

    public static j f(int i10, int i11) {
        i iVarOf = i.of(i10);
        z.B(iVarOf, "month");
        re.a.DAY_OF_MONTH.checkValidValue(i11);
        if (i11 <= iVarOf.maxLength()) {
            return new j(iVarOf.getValue(), i11);
        }
        StringBuilder sbA = r0.a("Illegal value for DayOfMonth field, value ", i11, " is not valid for month ");
        sbA.append(iVarOf.name());
        throw new ne.a(sbA.toString());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 64, this);
    }

    @Override // re.f
    public re.d adjustInto(re.d dVar) {
        if (!oe.h.g(dVar).equals(oe.m.f34269e)) {
            throw new ne.a("Adjustment only supported on ISO date-time");
        }
        re.d dVarN = dVar.p(re.a.MONTH_OF_YEAR, this.f33802c);
        re.a aVar = re.a.DAY_OF_MONTH;
        return dVarN.p(aVar, Math.min(dVarN.range(aVar).f35383f, this.f33803d));
    }

    @Override // java.lang.Comparable
    public int compareTo(j jVar) {
        j jVar2 = jVar;
        int i10 = this.f33802c - jVar2.f33802c;
        return i10 == 0 ? this.f33803d - jVar2.f33803d : i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f33802c == jVar.f33802c && this.f33803d == jVar.f33803d;
    }

    @Override // qe.c, re.e
    public int get(re.i iVar) {
        return range(iVar).a(getLong(iVar), iVar);
    }

    @Override // re.e
    public long getLong(re.i iVar) {
        int i10;
        if (!(iVar instanceof re.a)) {
            return iVar.getFrom(this);
        }
        int i11 = a.f33804a[((re.a) iVar).ordinal()];
        if (i11 == 1) {
            i10 = this.f33803d;
        } else {
            if (i11 != 2) {
                throw new re.m(b.a("Unsupported field: ", iVar));
            }
            i10 = this.f33802c;
        }
        return i10;
    }

    public int hashCode() {
        return (this.f33802c << 6) + this.f33803d;
    }

    @Override // re.e
    public boolean isSupported(re.i iVar) {
        if (iVar instanceof re.a) {
            return iVar == re.a.MONTH_OF_YEAR || iVar == re.a.DAY_OF_MONTH;
        }
        return iVar != null && iVar.isSupportedBy(this);
    }

    @Override // qe.c, re.e
    public <R> R query(re.k<R> kVar) {
        return kVar == re.j.f35374b ? (R) oe.m.f34269e : (R) super.query(kVar);
    }

    @Override // qe.c, re.e
    public re.n range(re.i iVar) {
        if (iVar == re.a.MONTH_OF_YEAR) {
            return iVar.range();
        }
        return iVar == re.a.DAY_OF_MONTH ? re.n.d(1L, i.of(this.f33802c).minLength(), i.of(this.f33802c).maxLength()) : super.range(iVar);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(10);
        sb2.append("--");
        sb2.append(this.f33802c < 10 ? "0" : "");
        sb2.append(this.f33802c);
        sb2.append(this.f33803d < 10 ? "-0" : "-");
        sb2.append(this.f33803d);
        return sb2.toString();
    }
}
