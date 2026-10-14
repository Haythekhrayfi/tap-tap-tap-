package ne;

import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import fd.z;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import okhttp3.internal.http2.Http2Connection;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends qe.c implements re.d, re.f, Comparable<h>, Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h f33791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f33792h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h[] f33793i = new h[24];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte f33794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte f33795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte f33796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f33797f;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f33799b;

        static {
            int[] iArr = new int[re.b.values().length];
            f33799b = iArr;
            try {
                iArr[re.b.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33799b[re.b.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33799b[re.b.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33799b[re.b.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33799b[re.b.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33799b[re.b.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33799b[re.b.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[re.a.values().length];
            f33798a = iArr2;
            try {
                iArr2[re.a.NANO_OF_SECOND.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f33798a[re.a.NANO_OF_DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f33798a[re.a.MICRO_OF_SECOND.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f33798a[re.a.MICRO_OF_DAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f33798a[re.a.MILLI_OF_SECOND.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f33798a[re.a.MILLI_OF_DAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f33798a[re.a.SECOND_OF_MINUTE.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f33798a[re.a.SECOND_OF_DAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f33798a[re.a.MINUTE_OF_HOUR.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f33798a[re.a.MINUTE_OF_DAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f33798a[re.a.HOUR_OF_AMPM.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f33798a[re.a.CLOCK_HOUR_OF_AMPM.ordinal()] = 12;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f33798a[re.a.HOUR_OF_DAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f33798a[re.a.CLOCK_HOUR_OF_DAY.ordinal()] = 14;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f33798a[re.a.AMPM_OF_DAY.ordinal()] = 15;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    static {
        int i10 = 0;
        while (true) {
            h[] hVarArr = f33793i;
            if (i10 >= hVarArr.length) {
                h hVar = hVarArr[0];
                h hVar2 = hVarArr[12];
                f33791g = hVarArr[0];
                f33792h = new h(23, 59, 59, 999999999);
                return;
            }
            hVarArr[i10] = new h(i10, 0, 0, 0);
            i10++;
        }
    }

    public h(int i10, int i11, int i12, int i13) {
        this.f33794c = (byte) i10;
        this.f33795d = (byte) i11;
        this.f33796e = (byte) i12;
        this.f33797f = i13;
    }

    public static h g(int i10, int i11, int i12, int i13) {
        return ((i11 | i12) | i13) == 0 ? f33793i[i10] : new h(i10, i11, i12, i13);
    }

    public static h h(re.e eVar) {
        h hVar = (h) eVar.query(re.j.f35379g);
        if (hVar != null) {
            return hVar;
        }
        throw new ne.a("Unable to obtain LocalTime from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
    }

    public static h j(long j10) {
        re.a.NANO_OF_DAY.checkValidValue(j10);
        int i10 = (int) (j10 / 3600000000000L);
        long j11 = j10 - (((long) i10) * 3600000000000L);
        int i11 = (int) (j11 / 60000000000L);
        long j12 = j11 - (((long) i11) * 60000000000L);
        int i12 = (int) (j12 / 1000000000);
        return g(i10, i11, i12, (int) (j12 - (((long) i12) * 1000000000)));
    }

    public static h p(DataInput dataInput) throws IOException {
        int i10;
        int i11;
        int i12 = dataInput.readByte();
        int i13 = 0;
        if (i12 < 0) {
            i12 = ~i12;
            i10 = 0;
            i11 = 0;
        } else {
            byte b10 = dataInput.readByte();
            if (b10 < 0) {
                int i14 = ~b10;
                i11 = 0;
                i13 = i14;
                i10 = 0;
            } else {
                byte b11 = dataInput.readByte();
                if (b11 < 0) {
                    i10 = ~b11;
                } else {
                    i13 = dataInput.readInt();
                    i10 = b11;
                }
                i11 = i13;
                i13 = b10;
            }
        }
        re.a.HOUR_OF_DAY.checkValidValue(i12);
        re.a.MINUTE_OF_HOUR.checkValidValue(i13);
        re.a.SECOND_OF_MINUTE.checkValidValue(i10);
        re.a.NANO_OF_SECOND.checkValidValue(i11);
        return g(i12, i13, i10, i11);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 5, this);
    }

    @Override // re.f
    public re.d adjustInto(re.d dVar) {
        return dVar.p(re.a.NANO_OF_DAY, q());
    }

    @Override // re.d
    /* JADX INFO: renamed from: c */
    public re.d i(long j10, re.l lVar) {
        return j10 == Long.MIN_VALUE ? k(RecyclerView.FOREVER_NS, lVar).k(1L, lVar) : k(-j10, lVar);
    }

    @Override // re.d
    public long d(re.d dVar, re.l lVar) {
        long j10;
        h hVarH = h(dVar);
        if (!(lVar instanceof re.b)) {
            return lVar.between(this, hVarH);
        }
        long jQ = hVarH.q() - q();
        switch (a.f33799b[((re.b) lVar).ordinal()]) {
            case 1:
                return jQ;
            case 2:
                j10 = 1000;
                break;
            case 3:
                j10 = 1000000;
                break;
            case 4:
                j10 = 1000000000;
                break;
            case 5:
                j10 = 60000000000L;
                break;
            case 6:
                j10 = 3600000000000L;
                break;
            case 7:
                j10 = 43200000000000L;
                break;
            default:
                throw new re.m("Unsupported unit: " + lVar);
        }
        return jQ / j10;
    }

    @Override // re.d
    /* JADX INFO: renamed from: e */
    public re.d o(re.f fVar) {
        boolean z10 = fVar instanceof h;
        re.f fVarAdjustInto = fVar;
        if (!z10) {
            fVarAdjustInto = fVar.adjustInto(this);
        }
        return (h) fVarAdjustInto;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f33794c == hVar.f33794c && this.f33795d == hVar.f33795d && this.f33796e == hVar.f33796e && this.f33797f == hVar.f33797f;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(h hVar) {
        int iJ = z.j(this.f33794c, hVar.f33794c);
        if (iJ != 0) {
            return iJ;
        }
        int iJ2 = z.j(this.f33795d, hVar.f33795d);
        if (iJ2 != 0) {
            return iJ2;
        }
        int iJ3 = z.j(this.f33796e, hVar.f33796e);
        return iJ3 == 0 ? z.j(this.f33797f, hVar.f33797f) : iJ3;
    }

    @Override // qe.c, re.e
    public int get(re.i iVar) {
        return iVar instanceof re.a ? i(iVar) : range(iVar).a(getLong(iVar), iVar);
    }

    @Override // re.e
    public long getLong(re.i iVar) {
        if (!(iVar instanceof re.a)) {
            return iVar.getFrom(this);
        }
        if (iVar == re.a.NANO_OF_DAY) {
            return q();
        }
        return iVar == re.a.MICRO_OF_DAY ? q() / 1000 : i(iVar);
    }

    public int hashCode() {
        long jQ = q();
        return (int) (jQ ^ (jQ >>> 32));
    }

    public final int i(re.i iVar) {
        switch (a.f33798a[((re.a) iVar).ordinal()]) {
            case 1:
                return this.f33797f;
            case 2:
                throw new ne.a(b.a("Field too large for an int: ", iVar));
            case 3:
                return this.f33797f / 1000;
            case 4:
                throw new ne.a(b.a("Field too large for an int: ", iVar));
            case 5:
                return this.f33797f / 1000000;
            case 6:
                return (int) (q() / 1000000);
            case 7:
                return this.f33796e;
            case 8:
                return r();
            case 9:
                return this.f33795d;
            case 10:
                return (this.f33794c * 60) + this.f33795d;
            case 11:
                return this.f33794c % 12;
            case 12:
                int i10 = this.f33794c % 12;
                if (i10 % 12 == 0) {
                    return 12;
                }
                return i10;
            case 13:
                return this.f33794c;
            case 14:
                byte b10 = this.f33794c;
                if (b10 == 0) {
                    return 24;
                }
                return b10;
            case 15:
                return this.f33794c / 12;
            default:
                throw new re.m(b.a("Unsupported field: ", iVar));
        }
    }

    @Override // re.e
    public boolean isSupported(re.i iVar) {
        if (iVar instanceof re.a) {
            return iVar.isTimeBased();
        }
        return iVar != null && iVar.isSupportedBy(this);
    }

    @Override // re.d
    public h j(long j10, re.l lVar) {
        if (!(lVar instanceof re.b)) {
            return (h) lVar.addTo(this, j10);
        }
        switch (a.f33799b[((re.b) lVar).ordinal()]) {
            case 1:
                return n(j10);
            case 2:
                return n((j10 % 86400000000L) * 1000);
            case 3:
                return n((j10 % 86400000) * 1000000);
            case 4:
                return o(j10);
            case 5:
                return m(j10);
            case 6:
                return l(j10);
            case 7:
                return l((j10 % 2) * 12);
            default:
                throw new re.m("Unsupported unit: " + lVar);
        }
    }

    public h l(long j10) {
        return j10 == 0 ? this : g(((((int) (j10 % 24)) + this.f33794c) + 24) % 24, this.f33795d, this.f33796e, this.f33797f);
    }

    public h m(long j10) {
        if (j10 == 0) {
            return this;
        }
        int i10 = (this.f33794c * 60) + this.f33795d;
        int i11 = ((((int) (j10 % 1440)) + i10) + DateTimeConstants.MINUTES_PER_DAY) % DateTimeConstants.MINUTES_PER_DAY;
        return i10 == i11 ? this : g(i11 / 60, i11 % 60, this.f33796e, this.f33797f);
    }

    public h n(long j10) {
        if (j10 == 0) {
            return this;
        }
        long jQ = q();
        long j11 = (((j10 % 86400000000000L) + jQ) + 86400000000000L) % 86400000000000L;
        return jQ == j11 ? this : g((int) (j11 / 3600000000000L), (int) ((j11 / 60000000000L) % 60), (int) ((j11 / 1000000000) % 60), (int) (j11 % 1000000000));
    }

    public h o(long j10) {
        if (j10 == 0) {
            return this;
        }
        int i10 = (this.f33795d * 60) + (this.f33794c * 3600) + this.f33796e;
        int i11 = ((((int) (j10 % 86400)) + i10) + DateTimeConstants.SECONDS_PER_DAY) % DateTimeConstants.SECONDS_PER_DAY;
        return i10 == i11 ? this : g(i11 / DateTimeConstants.SECONDS_PER_HOUR, (i11 / 60) % 60, i11 % 60, this.f33797f);
    }

    public long q() {
        return (((long) this.f33796e) * 1000000000) + (((long) this.f33795d) * 60000000000L) + (((long) this.f33794c) * 3600000000000L) + ((long) this.f33797f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qe.c, re.e
    public <R> R query(re.k<R> kVar) {
        if (kVar == re.j.f35375c) {
            return (R) re.b.NANOS;
        }
        if (kVar == re.j.f35379g) {
            return this;
        }
        if (kVar == re.j.f35374b || kVar == re.j.f35373a || kVar == re.j.f35376d || kVar == re.j.f35377e || kVar == re.j.f35378f) {
            return null;
        }
        return kVar.a(this);
    }

    public int r() {
        return (this.f33795d * 60) + (this.f33794c * 3600) + this.f33796e;
    }

    @Override // qe.c, re.e
    public re.n range(re.i iVar) {
        return super.range(iVar);
    }

    @Override // re.d
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public h p(re.i iVar, long j10) {
        if (!(iVar instanceof re.a)) {
            return (h) iVar.adjustInto(this, j10);
        }
        re.a aVar = (re.a) iVar;
        aVar.checkValidValue(j10);
        switch (a.f33798a[aVar.ordinal()]) {
            case 1:
                return u((int) j10);
            case 2:
                return j(j10);
            case 3:
                return u(((int) j10) * 1000);
            case 4:
                return j(j10 * 1000);
            case 5:
                return u(((int) j10) * 1000000);
            case 6:
                return j(j10 * 1000000);
            case 7:
                int i10 = (int) j10;
                if (this.f33796e == i10) {
                    return this;
                }
                re.a.SECOND_OF_MINUTE.checkValidValue(i10);
                return g(this.f33794c, this.f33795d, i10, this.f33797f);
            case 8:
                return o(j10 - ((long) r()));
            case 9:
                int i11 = (int) j10;
                if (this.f33795d == i11) {
                    return this;
                }
                re.a.MINUTE_OF_HOUR.checkValidValue(i11);
                return g(this.f33794c, i11, this.f33796e, this.f33797f);
            case 10:
                return m(j10 - ((long) ((this.f33794c * 60) + this.f33795d)));
            case 11:
                return l(j10 - ((long) (this.f33794c % 12)));
            case 12:
                if (j10 == 12) {
                    j10 = 0;
                }
                return l(j10 - ((long) (this.f33794c % 12)));
            case 13:
                return t((int) j10);
            case 14:
                if (j10 == 24) {
                    j10 = 0;
                }
                return t((int) j10);
            case 15:
                return l((j10 - ((long) (this.f33794c / 12))) * 12);
            default:
                throw new re.m(b.a("Unsupported field: ", iVar));
        }
    }

    public h t(int i10) {
        if (this.f33794c == i10) {
            return this;
        }
        re.a.HOUR_OF_DAY.checkValidValue(i10);
        return g(i10, this.f33795d, this.f33796e, this.f33797f);
    }

    public String toString() {
        int i10;
        StringBuilder sb2 = new StringBuilder(18);
        byte b10 = this.f33794c;
        byte b11 = this.f33795d;
        byte b12 = this.f33796e;
        int i11 = this.f33797f;
        sb2.append(b10 < 10 ? "0" : "");
        sb2.append((int) b10);
        sb2.append(b11 < 10 ? ":0" : ":");
        sb2.append((int) b11);
        if (b12 > 0 || i11 > 0) {
            sb2.append(b12 >= 10 ? ":" : ":0");
            sb2.append((int) b12);
            if (i11 > 0) {
                sb2.append(CoreConstants.DOT);
                int i12 = 1000000;
                if (i11 % 1000000 == 0) {
                    i10 = (i11 / 1000000) + 1000;
                } else {
                    if (i11 % 1000 == 0) {
                        i11 /= 1000;
                    } else {
                        i12 = Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
                    }
                    i10 = i11 + i12;
                }
                sb2.append(Integer.toString(i10).substring(1));
            }
        }
        return sb2.toString();
    }

    public h u(int i10) {
        if (this.f33797f == i10) {
            return this;
        }
        re.a.NANO_OF_SECOND.checkValidValue(i10);
        return g(this.f33794c, this.f33795d, this.f33796e, i10);
    }

    public void v(DataOutput dataOutput) throws IOException {
        byte b10;
        if (this.f33797f != 0) {
            dataOutput.writeByte(this.f33794c);
            dataOutput.writeByte(this.f33795d);
            dataOutput.writeByte(this.f33796e);
            dataOutput.writeInt(this.f33797f);
            return;
        }
        if (this.f33796e != 0) {
            dataOutput.writeByte(this.f33794c);
            dataOutput.writeByte(this.f33795d);
            b10 = this.f33796e;
        } else if (this.f33795d == 0) {
            b10 = this.f33794c;
        } else {
            dataOutput.writeByte(this.f33794c);
            b10 = this.f33795d;
        }
        dataOutput.writeByte(~b10);
    }
}
