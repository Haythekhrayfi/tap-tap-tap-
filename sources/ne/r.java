package ne;

import fd.z;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.joda.time.DateTimeConstants;

/* JADX WARN: Unexpected interfaces in signature: [java.io.Serializable] */
/* JADX INFO: loaded from: classes3.dex */
public final class r extends q implements re.e, re.f, Comparable<r> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ConcurrentMap<Integer, r> f33830f = new ConcurrentHashMap(16, 0.75f, 4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ConcurrentMap<String, r> f33831g = new ConcurrentHashMap(16, 0.75f, 4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final r f33832h = n(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final r f33833i = n(-64800);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final r f33834j = n(64800);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f33835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient String f33836e;

    public r(int i10) {
        String string;
        this.f33835d = i10;
        if (i10 == 0) {
            string = "Z";
        } else {
            int iAbs = Math.abs(i10);
            StringBuilder sb2 = new StringBuilder();
            int i11 = iAbs / DateTimeConstants.SECONDS_PER_HOUR;
            int i12 = (iAbs / 60) % 60;
            sb2.append(i10 < 0 ? "-" : "+");
            sb2.append(i11 < 10 ? "0" : "");
            sb2.append(i11);
            sb2.append(i12 < 10 ? ":0" : ":");
            sb2.append(i12);
            int i13 = iAbs % 60;
            if (i13 != 0) {
                sb2.append(i13 >= 10 ? ":" : ":0");
                sb2.append(i13);
            }
            string = sb2.toString();
        }
        this.f33836e = string;
    }

    public static r k(re.e eVar) {
        r rVar = (r) eVar.query(re.j.f35377e);
        if (rVar != null) {
            return rVar;
        }
        throw new a("Unable to obtain ZoneOffset from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    public static r l(String str) {
        int iO;
        int iO2;
        int iO3;
        char cCharAt;
        z.B(str, "offsetId");
        r rVar = (r) ((ConcurrentHashMap) f33831g).get(str);
        if (rVar != null) {
            return rVar;
        }
        int length = str.length();
        if (length != 2) {
            if (length != 3) {
                if (length == 5) {
                    iO = o(str, 1, false);
                    iO2 = o(str, 3, false);
                } else if (length == 6) {
                    iO = o(str, 1, false);
                    iO2 = o(str, 4, true);
                } else if (length == 7) {
                    iO = o(str, 1, false);
                    iO2 = o(str, 3, false);
                    iO3 = o(str, 5, false);
                } else {
                    if (length != 9) {
                        throw new a(i.f.a("Invalid ID for ZoneOffset, invalid format: ", str));
                    }
                    iO = o(str, 1, false);
                    iO2 = o(str, 4, true);
                    iO3 = o(str, 7, true);
                }
                iO3 = 0;
            }
            cCharAt = str.charAt(0);
            if (cCharAt != '+' || cCharAt == '-') {
                return cCharAt == '-' ? m(-iO, -iO2, -iO3) : m(iO, iO2, iO3);
            }
            throw new a(i.f.a("Invalid ID for ZoneOffset, plus/minus not found when expected: ", str));
        }
        str = str.charAt(0) + "0" + str.charAt(1);
        iO = o(str, 1, false);
        iO2 = 0;
        iO3 = 0;
        cCharAt = str.charAt(0);
        if (cCharAt != '+') {
        }
        if (cCharAt == '-') {
        }
    }

    public static r m(int i10, int i11, int i12) {
        if (i10 < -18 || i10 > 18) {
            throw new a(android.support.v4.media.j.a("Zone offset hours not in valid range: value ", i10, " is not in the range -18 to 18"));
        }
        if (i10 > 0) {
            if (i11 < 0 || i12 < 0) {
                throw new a("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i10 < 0) {
            if (i11 > 0 || i12 > 0) {
                throw new a("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i11 > 0 && i12 < 0) || (i11 < 0 && i12 > 0)) {
            throw new a("Zone offset minutes and seconds must have the same sign");
        }
        if (Math.abs(i11) > 59) {
            StringBuilder sbA = defpackage.a.a("Zone offset minutes not in valid range: abs(value) ");
            sbA.append(Math.abs(i11));
            sbA.append(" is not in the range 0 to 59");
            throw new a(sbA.toString());
        }
        if (Math.abs(i12) > 59) {
            StringBuilder sbA2 = defpackage.a.a("Zone offset seconds not in valid range: abs(value) ");
            sbA2.append(Math.abs(i12));
            sbA2.append(" is not in the range 0 to 59");
            throw new a(sbA2.toString());
        }
        if (Math.abs(i10) == 18 && (Math.abs(i11) > 0 || Math.abs(i12) > 0)) {
            throw new a("Zone offset not in valid range: -18:00 to +18:00");
        }
        return n((i11 * 60) + (i10 * DateTimeConstants.SECONDS_PER_HOUR) + i12);
    }

    public static r n(int i10) {
        if (Math.abs(i10) > 64800) {
            throw new a("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i10 % 900 != 0) {
            return new r(i10);
        }
        Integer numValueOf = Integer.valueOf(i10);
        ConcurrentMap<Integer, r> concurrentMap = f33830f;
        r rVar = concurrentMap.get(numValueOf);
        if (rVar != null) {
            return rVar;
        }
        concurrentMap.putIfAbsent(numValueOf, new r(i10));
        r rVar2 = concurrentMap.get(numValueOf);
        f33831g.putIfAbsent(rVar2.f33836e, rVar2);
        return rVar2;
    }

    public static int o(CharSequence charSequence, int i10, boolean z10) {
        if (z10 && charSequence.charAt(i10 - 1) != ':') {
            throw new a("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) charSequence));
        }
        char cCharAt = charSequence.charAt(i10);
        char cCharAt2 = charSequence.charAt(i10 + 1);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
        }
        throw new a("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) charSequence));
    }

    public static r p(DataInput dataInput) throws IOException {
        byte b10 = dataInput.readByte();
        return b10 == 127 ? n(dataInput.readInt()) : n(b10 * 900);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 8, this);
    }

    @Override // re.f
    public re.d adjustInto(re.d dVar) {
        return dVar.p(re.a.OFFSET_SECONDS, this.f33835d);
    }

    @Override // java.lang.Comparable
    public int compareTo(r rVar) {
        return rVar.f33835d - this.f33835d;
    }

    @Override // ne.q
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.f33835d == ((r) obj).f33835d;
    }

    @Override // ne.q
    public String g() {
        return this.f33836e;
    }

    @Override // re.e
    public int get(re.i iVar) {
        if (iVar == re.a.OFFSET_SECONDS) {
            return this.f33835d;
        }
        if (iVar instanceof re.a) {
            throw new re.m(b.a("Unsupported field: ", iVar));
        }
        return range(iVar).a(getLong(iVar), iVar);
    }

    @Override // re.e
    public long getLong(re.i iVar) {
        if (iVar == re.a.OFFSET_SECONDS) {
            return this.f33835d;
        }
        if (iVar instanceof re.a) {
            throw new a(b.a("Unsupported field: ", iVar));
        }
        return iVar.getFrom(this);
    }

    @Override // ne.q
    public se.f h() {
        z.B(this, "offset");
        return new se.f.a(this);
    }

    @Override // ne.q
    public int hashCode() {
        return this.f33835d;
    }

    @Override // re.e
    public boolean isSupported(re.i iVar) {
        if (iVar instanceof re.a) {
            return iVar == re.a.OFFSET_SECONDS;
        }
        return iVar != null && iVar.isSupportedBy(this);
    }

    @Override // ne.q
    public void j(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(8);
        q(dataOutput);
    }

    public void q(DataOutput dataOutput) throws IOException {
        int i10 = this.f33835d;
        int i11 = i10 % 900 == 0 ? i10 / 900 : 127;
        dataOutput.writeByte(i11);
        if (i11 == 127) {
            dataOutput.writeInt(i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // re.e
    public <R> R query(re.k<R> kVar) {
        if (kVar == re.j.f35377e || kVar == re.j.f35376d) {
            return this;
        }
        if (kVar == re.j.f35378f || kVar == re.j.f35379g || kVar == re.j.f35375c || kVar == re.j.f35374b || kVar == re.j.f35373a) {
            return null;
        }
        return kVar.a(this);
    }

    @Override // re.e
    public re.n range(re.i iVar) {
        if (iVar == re.a.OFFSET_SECONDS) {
            return iVar.range();
        }
        if (iVar instanceof re.a) {
            throw new re.m(b.a("Unsupported field: ", iVar));
        }
        return iVar.rangeRefinedBy(this);
    }

    @Override // ne.q
    public String toString() {
        return this.f33836e;
    }
}
