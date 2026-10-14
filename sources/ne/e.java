package ne;

import androidx.recyclerview.widget.RecyclerView;
import fd.z;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import okhttp3.internal.http2.Http2Connection;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends qe.c implements re.d, re.f, Comparable<e>, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f33774e = new e(0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f33775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f33776d;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f33778b;

        static {
            int[] iArr = new int[re.b.values().length];
            f33778b = iArr;
            try {
                iArr[re.b.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33778b[re.b.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33778b[re.b.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33778b[re.b.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33778b[re.b.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33778b[re.b.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33778b[re.b.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f33778b[re.b.DAYS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[re.a.values().length];
            f33777a = iArr2;
            try {
                iArr2[re.a.NANO_OF_SECOND.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f33777a[re.a.MICRO_OF_SECOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f33777a[re.a.MILLI_OF_SECOND.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f33777a[re.a.INSTANT_SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        k(-31557014167219200L, 0L);
        k(31556889864403199L, 999999999L);
    }

    public e(long j10, int i10) {
        this.f33775c = j10;
        this.f33776d = i10;
    }

    public static e g(long j10, int i10) {
        if ((((long) i10) | j10) == 0) {
            return f33774e;
        }
        if (j10 < -31557014167219200L || j10 > 31556889864403199L) {
            throw new ne.a("Instant exceeds minimum or maximum instant");
        }
        return new e(j10, i10);
    }

    public static e h(re.e eVar) {
        try {
            return k(eVar.getLong(re.a.INSTANT_SECONDS), eVar.get(re.a.NANO_OF_SECOND));
        } catch (ne.a e10) {
            throw new ne.a("Unable to obtain Instant from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName(), e10);
        }
    }

    public static e j(long j10) {
        return g(z.t(j10, 1000L), z.u(j10, 1000) * 1000000);
    }

    public static e k(long j10, long j11) {
        return g(z.D(j10, z.t(j11, 1000000000L)), z.u(j11, Http2Connection.DEGRADED_PONG_TIMEOUT_NS));
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 2, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        if (r3 != r2.f33776d) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (r3 != r2.f33776d) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        r4 = r2.f33775c;
     */
    @Override // re.d
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public re.d p(re.i r3, long r4) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof re.a
            if (r0 == 0) goto L5c
            r0 = r3
            re.a r0 = (re.a) r0
            r0.checkValidValue(r4)
            int[] r1 = ne.e.a.f33777a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L4b
            r1 = 2
            if (r0 == r1) goto L3d
            r1 = 3
            if (r0 == r1) goto L33
            r1 = 4
            if (r0 != r1) goto L27
            long r0 = r2.f33775c
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 == 0) goto L5a
            int r3 = r2.f33776d
            goto L46
        L27:
            re.m r4 = new re.m
            java.lang.String r5 = "Unsupported field: "
            java.lang.String r3 = ne.b.a(r5, r3)
            r4.<init>(r3)
            throw r4
        L33:
            int r3 = (int) r4
            r4 = 1000000(0xf4240, float:1.401298E-39)
            int r3 = r3 * r4
            int r4 = r2.f33776d
            if (r3 == r4) goto L5a
            goto L44
        L3d:
            int r3 = (int) r4
            int r3 = r3 * 1000
            int r4 = r2.f33776d
            if (r3 == r4) goto L5a
        L44:
            long r4 = r2.f33775c
        L46:
            ne.e r3 = g(r4, r3)
            goto L62
        L4b:
            int r3 = r2.f33776d
            long r0 = (long) r3
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 == 0) goto L5a
            long r0 = r2.f33775c
            int r3 = (int) r4
            ne.e r3 = g(r0, r3)
            goto L62
        L5a:
            r3 = r2
            goto L62
        L5c:
            re.d r3 = r3.adjustInto(r2, r4)
            ne.e r3 = (ne.e) r3
        L62:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ne.e.p(re.i, long):re.d");
    }

    @Override // re.f
    public re.d adjustInto(re.d dVar) {
        return dVar.p(re.a.INSTANT_SECONDS, this.f33775c).p(re.a.NANO_OF_SECOND, this.f33776d);
    }

    @Override // re.d
    /* JADX INFO: renamed from: c */
    public re.d i(long j10, re.l lVar) {
        return j10 == Long.MIN_VALUE ? b(RecyclerView.FOREVER_NS, lVar).b(1L, lVar) : b(-j10, lVar);
    }

    @Override // re.d
    public long d(re.d dVar, re.l lVar) {
        e eVarH = h(dVar);
        if (!(lVar instanceof re.b)) {
            return lVar.between(this, eVarH);
        }
        switch (a.f33778b[((re.b) lVar).ordinal()]) {
            case 1:
                return i(eVarH);
            case 2:
                return i(eVarH) / 1000;
            case 3:
                return z.H(eVarH.p(), p());
            case 4:
                return o(eVarH);
            case 5:
                return o(eVarH) / 60;
            case 6:
                return o(eVarH) / 3600;
            case 7:
                return o(eVarH) / 43200;
            case 8:
                return o(eVarH) / 86400;
            default:
                throw new re.m("Unsupported unit: " + lVar);
        }
    }

    @Override // re.d
    /* JADX INFO: renamed from: e */
    public re.d o(re.f fVar) {
        return (e) fVar.adjustInto(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f33775c == eVar.f33775c && this.f33776d == eVar.f33776d;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(e eVar) {
        int iK = z.k(this.f33775c, eVar.f33775c);
        return iK != 0 ? iK : this.f33776d - eVar.f33776d;
    }

    @Override // qe.c, re.e
    public int get(re.i iVar) {
        if (!(iVar instanceof re.a)) {
            return super.range(iVar).a(iVar.getFrom(this), iVar);
        }
        int i10 = a.f33777a[((re.a) iVar).ordinal()];
        if (i10 == 1) {
            return this.f33776d;
        }
        if (i10 == 2) {
            return this.f33776d / 1000;
        }
        if (i10 == 3) {
            return this.f33776d / 1000000;
        }
        throw new re.m(b.a("Unsupported field: ", iVar));
    }

    @Override // re.e
    public long getLong(re.i iVar) {
        int i10;
        if (!(iVar instanceof re.a)) {
            return iVar.getFrom(this);
        }
        int i11 = a.f33777a[((re.a) iVar).ordinal()];
        if (i11 == 1) {
            i10 = this.f33776d;
        } else if (i11 == 2) {
            i10 = this.f33776d / 1000;
        } else {
            if (i11 != 3) {
                if (i11 == 4) {
                    return this.f33775c;
                }
                throw new re.m(b.a("Unsupported field: ", iVar));
            }
            i10 = this.f33776d / 1000000;
        }
        return i10;
    }

    public int hashCode() {
        long j10 = this.f33775c;
        return (this.f33776d * 51) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final long i(e eVar) {
        return z.D(z.F(z.H(eVar.f33775c, this.f33775c), Http2Connection.DEGRADED_PONG_TIMEOUT_NS), eVar.f33776d - this.f33776d);
    }

    @Override // re.e
    public boolean isSupported(re.i iVar) {
        if (iVar instanceof re.a) {
            return iVar == re.a.INSTANT_SECONDS || iVar == re.a.NANO_OF_SECOND || iVar == re.a.MICRO_OF_SECOND || iVar == re.a.MILLI_OF_SECOND;
        }
        return iVar != null && iVar.isSupportedBy(this);
    }

    public final e l(long j10, long j11) {
        if ((j10 | j11) == 0) {
            return this;
        }
        return k(z.D(z.D(this.f33775c, j10), j11 / 1000000000), ((long) this.f33776d) + (j11 % 1000000000));
    }

    @Override // re.d
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public e j(long j10, re.l lVar) {
        if (!(lVar instanceof re.b)) {
            return (e) lVar.addTo(this, j10);
        }
        switch (a.f33778b[((re.b) lVar).ordinal()]) {
            case 1:
                return l(0L, j10);
            case 2:
                return l(j10 / 1000000, (j10 % 1000000) * 1000);
            case 3:
                return l(j10 / 1000, (j10 % 1000) * 1000000);
            case 4:
                return l(j10, 0L);
            case 5:
                return n(z.F(j10, 60));
            case 6:
                return n(z.F(j10, DateTimeConstants.SECONDS_PER_HOUR));
            case 7:
                return n(z.F(j10, 43200));
            case 8:
                return n(z.F(j10, DateTimeConstants.SECONDS_PER_DAY));
            default:
                throw new re.m("Unsupported unit: " + lVar);
        }
    }

    public e n(long j10) {
        return l(j10, 0L);
    }

    public final long o(e eVar) {
        long jH = z.H(eVar.f33775c, this.f33775c);
        long j10 = eVar.f33776d - this.f33776d;
        if (jH <= 0 || j10 >= 0) {
            return (jH >= 0 || j10 <= 0) ? jH : jH + 1;
        }
        return jH - 1;
    }

    public long p() {
        long j10 = this.f33775c;
        return j10 >= 0 ? z.D(z.G(j10, 1000L), this.f33776d / 1000000) : z.H(z.G(j10 + 1, 1000L), 1000 - ((long) (this.f33776d / 1000000)));
    }

    @Override // qe.c, re.e
    public <R> R query(re.k<R> kVar) {
        if (kVar == re.j.f35375c) {
            return (R) re.b.NANOS;
        }
        if (kVar == re.j.f35378f || kVar == re.j.f35379g || kVar == re.j.f35374b || kVar == re.j.f35373a || kVar == re.j.f35376d || kVar == re.j.f35377e) {
            return null;
        }
        return kVar.a(this);
    }

    @Override // qe.c, re.e
    public re.n range(re.i iVar) {
        return super.range(iVar);
    }

    public String toString() {
        return pe.a.f34638h.a(this);
    }
}
