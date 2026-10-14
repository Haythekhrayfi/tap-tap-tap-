package ne;

import androidx.recyclerview.widget.RecyclerView;
import fd.z;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.util.Objects;
import org.joda.time.DateTimeConstants;

/* JADX WARN: Unexpected interfaces in signature: [re.f, java.io.Serializable] */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends oe.c<f> implements re.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f33786e = u(f.f33779f, h.f33791g);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f33787f = u(f.f33780g, h.f33792h);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f33788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f33789d;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33790a;

        static {
            int[] iArr = new int[re.b.values().length];
            f33790a = iArr;
            try {
                iArr[re.b.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33790a[re.b.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33790a[re.b.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33790a[re.b.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33790a[re.b.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33790a[re.b.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33790a[re.b.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public g(f fVar, h hVar) {
        this.f33788c = fVar;
        this.f33789d = hVar;
    }

    public static g B(DataInput dataInput) throws IOException {
        f fVar = f.f33779f;
        return u(f.B(dataInput.readInt(), dataInput.readByte(), dataInput.readByte()), h.p(dataInput));
    }

    public static g r(re.e eVar) {
        if (eVar instanceof g) {
            return (g) eVar;
        }
        if (eVar instanceof t) {
            return ((t) eVar).f33840c;
        }
        try {
            return new g(f.r(eVar), h.h(eVar));
        } catch (ne.a unused) {
            throw new ne.a("Unable to obtain LocalDateTime from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
        }
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static g u(f fVar, h hVar) {
        z.B(fVar, "date");
        z.B(hVar, "time");
        return new g(fVar, hVar);
    }

    public static g v(long j10, int i10, r rVar) {
        z.B(rVar, "offset");
        long j11 = j10 + ((long) rVar.f33835d);
        long jT = z.t(j11, 86400L);
        int iU = z.u(j11, DateTimeConstants.SECONDS_PER_DAY);
        f fVarD = f.D(jT);
        long j12 = iU;
        h hVar = h.f33791g;
        re.a.SECOND_OF_DAY.checkValidValue(j12);
        re.a.NANO_OF_SECOND.checkValidValue(i10);
        int i11 = (int) (j12 / 3600);
        long j13 = j12 - ((long) (i11 * DateTimeConstants.SECONDS_PER_HOUR));
        int i12 = (int) (j13 / 60);
        return new g(fVarD, h.g(i11, i12, (int) (j13 - ((long) (i12 * 60))), i10));
    }

    private Object writeReplace() {
        return new n((byte) 4, this);
    }

    public final g A(f fVar, long j10, long j11, long j12, long j13, int i10) {
        h hVarJ;
        f fVarF = fVar;
        if ((j10 | j11 | j12 | j13) == 0) {
            hVarJ = this.f33789d;
        } else {
            long j14 = i10;
            long jQ = this.f33789d.q();
            long j15 = ((((j10 % 24) * 3600000000000L) + ((j11 % 1440) * 60000000000L) + ((j12 % 86400) * 1000000000) + (j13 % 86400000000000L)) * j14) + jQ;
            long jT = z.t(j15, 86400000000000L) + (((j10 / 24) + (j11 / 1440) + (j12 / 86400) + (j13 / 86400000000000L)) * j14);
            long jV = z.v(j15, 86400000000000L);
            hVarJ = jV == jQ ? this.f33789d : h.j(jV);
            fVarF = fVarF.F(jT);
        }
        return C(fVarF, hVarJ);
    }

    public final g C(f fVar, h hVar) {
        return (this.f33788c == fVar && this.f33789d == hVar) ? this : new g(fVar, hVar);
    }

    @Override // oe.c
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public g o(re.f fVar) {
        if (fVar instanceof f) {
            return C((f) fVar, this.f33789d);
        }
        if (fVar instanceof h) {
            return C(this.f33788c, (h) fVar);
        }
        return fVar instanceof g ? (g) fVar : (g) fVar.adjustInto(this);
    }

    @Override // oe.c
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public g p(re.i iVar, long j10) {
        if (iVar instanceof re.a) {
            return iVar.isTimeBased() ? C(this.f33788c, this.f33789d.n(iVar, j10)) : C(this.f33788c.p(iVar, j10), this.f33789d);
        }
        return (g) iVar.adjustInto(this, j10);
    }

    public void F(DataOutput dataOutput) throws IOException {
        f fVar = this.f33788c;
        dataOutput.writeInt(fVar.f33781c);
        dataOutput.writeByte(fVar.f33782d);
        dataOutput.writeByte(fVar.f33783e);
        this.f33789d.v(dataOutput);
    }

    @Override // oe.c, re.f
    public re.d adjustInto(re.d dVar) {
        return super.adjustInto(dVar);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0109  */
    /* JADX WARN: Code duplicated, block: B:51:0x0111  */
    /* JADX WARN: Code duplicated, block: B:53:0x011b  */
    /* JADX WARN: Code duplicated, block: B:55:0x011e  */
    @Override // re.d
    public long d(re.d dVar, re.l lVar) {
        g gVarR = r(dVar);
        if (!(lVar instanceof re.b)) {
            return lVar.between(this, gVarR);
        }
        re.b bVar = (re.b) lVar;
        if (!bVar.isTimeBased()) {
            f fVarF = gVarR.f33788c;
            f fVar = this.f33788c;
            Objects.requireNonNull(fVarF);
            if (!(fVar instanceof f) ? fVarF.l() <= fVar.l() : fVarF.o(fVar) <= 0) {
                if (gVarR.f33789d.compareTo(this.f33789d) < 0) {
                    fVarF = fVarF.z(1L);
                } else if (fVarF.v(this.f33788c)) {
                    if (gVarR.f33789d.compareTo(this.f33789d) > 0) {
                        fVarF = fVarF.F(1L);
                    }
                }
            } else if (fVarF.v(this.f33788c)) {
                if (gVarR.f33789d.compareTo(this.f33789d) > 0) {
                    fVarF = fVarF.F(1L);
                }
            }
            return this.f33788c.d(fVarF, lVar);
        }
        long jQ = this.f33788c.q(gVarR.f33788c);
        long jQ2 = gVarR.f33789d.q() - this.f33789d.q();
        if (jQ > 0 && jQ2 < 0) {
            jQ--;
            jQ2 += 86400000000000L;
        } else if (jQ < 0 && jQ2 > 0) {
            jQ++;
            jQ2 -= 86400000000000L;
        }
        switch (a.f33790a[bVar.ordinal()]) {
            case 1:
                return z.D(z.G(jQ, 86400000000000L), jQ2);
            case 2:
                return z.D(z.G(jQ, 86400000000L), jQ2 / 1000);
            case 3:
                return z.D(z.G(jQ, 86400000L), jQ2 / 1000000);
            case 4:
                return z.D(z.F(jQ, DateTimeConstants.SECONDS_PER_DAY), jQ2 / 1000000000);
            case 5:
                return z.D(z.F(jQ, DateTimeConstants.MINUTES_PER_DAY), jQ2 / 60000000000L);
            case 6:
                return z.D(z.F(jQ, 24), jQ2 / 3600000000000L);
            case 7:
                return z.D(z.F(jQ, 2), jQ2 / 43200000000000L);
            default:
                throw new re.m("Unsupported unit: " + lVar);
        }
    }

    @Override // oe.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f33788c.equals(gVar.f33788c) && this.f33789d.equals(gVar.f33789d);
    }

    @Override // oe.c
    public oe.f f(q qVar) {
        return t.v(this, qVar, null);
    }

    @Override // oe.c
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compareTo(oe.c<?> cVar) {
        return cVar instanceof g ? q((g) cVar) : super.compareTo(cVar);
    }

    @Override // qe.c, re.e
    public int get(re.i iVar) {
        if (iVar instanceof re.a) {
            return iVar.isTimeBased() ? this.f33789d.get(iVar) : this.f33788c.get(iVar);
        }
        return range(iVar).a(getLong(iVar), iVar);
    }

    @Override // re.e
    public long getLong(re.i iVar) {
        if (iVar instanceof re.a) {
            return iVar.isTimeBased() ? this.f33789d.getLong(iVar) : this.f33788c.getLong(iVar);
        }
        return iVar.getFrom(this);
    }

    @Override // oe.c
    public int hashCode() {
        return this.f33788c.hashCode() ^ this.f33789d.hashCode();
    }

    @Override // re.e
    public boolean isSupported(re.i iVar) {
        if (iVar instanceof re.a) {
            return iVar.isDateBased() || iVar.isTimeBased();
        }
        return iVar != null && iVar.isSupportedBy(this);
    }

    @Override // oe.c
    public oe.b m() {
        return this.f33788c;
    }

    @Override // oe.c
    public h n() {
        return this.f33789d;
    }

    public final int q(g gVar) {
        int iO = this.f33788c.o(gVar.f33788c);
        return iO == 0 ? this.f33789d.compareTo(gVar.f33789d) : iO;
    }

    @Override // oe.c, qe.c, re.e
    public <R> R query(re.k<R> kVar) {
        return kVar == re.j.f35378f ? (R) this.f33788c : (R) super.query(kVar);
    }

    @Override // qe.c, re.e
    public re.n range(re.i iVar) {
        if (iVar instanceof re.a) {
            return iVar.isTimeBased() ? this.f33789d.range(iVar) : this.f33788c.range(iVar);
        }
        return iVar.rangeRefinedBy(this);
    }

    public boolean s(oe.c<?> cVar) {
        if (cVar instanceof g) {
            return q((g) cVar) < 0;
        }
        long jL = m().l();
        long jL2 = cVar.m().l();
        return jL < jL2 || (jL == jL2 && n().q() < cVar.n().q());
    }

    @Override // oe.c
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public g i(long j10, re.l lVar) {
        return j10 == Long.MIN_VALUE ? b(RecyclerView.FOREVER_NS, lVar).b(1L, lVar) : b(-j10, lVar);
    }

    @Override // oe.c
    public String toString() {
        return this.f33788c.toString() + 'T' + this.f33789d.toString();
    }

    @Override // oe.c
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public g j(long j10, re.l lVar) {
        if (!(lVar instanceof re.b)) {
            return (g) lVar.addTo(this, j10);
        }
        switch (a.f33790a[((re.b) lVar).ordinal()]) {
            case 1:
                return y(j10);
            case 2:
                return x(j10 / 86400000000L).y((j10 % 86400000000L) * 1000);
            case 3:
                return x(j10 / 86400000).y((j10 % 86400000) * 1000000);
            case 4:
                return z(j10);
            case 5:
                return A(this.f33788c, 0L, j10, 0L, 0L, 1);
            case 6:
                return A(this.f33788c, j10, 0L, 0L, 0L, 1);
            case 7:
                g gVarX = x(j10 / 256);
                return gVarX.A(gVarX.f33788c, (j10 % 256) * 12, 0L, 0L, 0L, 1);
            default:
                return C(this.f33788c.j(j10, lVar), this.f33789d);
        }
    }

    public g x(long j10) {
        return C(this.f33788c.F(j10), this.f33789d);
    }

    public g y(long j10) {
        return A(this.f33788c, 0L, 0L, 0L, j10, 1);
    }

    public g z(long j10) {
        return A(this.f33788c, 0L, 0L, j10, 0L, 1);
    }
}
