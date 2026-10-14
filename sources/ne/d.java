package ne;

import ch.qos.logback.core.CoreConstants;
import fd.z;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Comparable<d>, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f33771e = new d(0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f33772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f33773d;

    static {
        BigInteger.valueOf(1000000000L);
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);
    }

    public d(long j10, int i10) {
        this.f33772c = j10;
        this.f33773d = i10;
    }

    public static d a(long j10, int i10) {
        return (((long) i10) | j10) == 0 ? f33771e : new d(j10, i10);
    }

    public static d b(long j10) {
        long j11 = j10 / 1000000000;
        int i10 = (int) (j10 % 1000000000);
        if (i10 < 0) {
            i10 += Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
            j11--;
        }
        return a(j11, i10);
    }

    public static d c(long j10) {
        return a(j10, 0);
    }

    public static d d(long j10, long j11) {
        return a(z.D(j10, z.t(j11, 1000000000L)), z.u(j11, Http2Connection.DEGRADED_PONG_TIMEOUT_NS));
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 1, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(d dVar) {
        d dVar2 = dVar;
        int iK = z.k(this.f33772c, dVar2.f33772c);
        return iK != 0 ? iK : this.f33773d - dVar2.f33773d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f33772c == dVar.f33772c && this.f33773d == dVar.f33773d;
    }

    public int hashCode() {
        long j10 = this.f33772c;
        return (this.f33773d * 51) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        if (this == f33771e) {
            return "PT0S";
        }
        long j10 = this.f33772c;
        long j11 = j10 / 3600;
        int i10 = (int) ((j10 % 3600) / 60);
        int i11 = (int) (j10 % 60);
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("PT");
        if (j11 != 0) {
            sb2.append(j11);
            sb2.append('H');
        }
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('M');
        }
        if (i11 == 0 && this.f33773d == 0 && sb2.length() > 2) {
            return sb2.toString();
        }
        if (i11 >= 0 || this.f33773d <= 0) {
            sb2.append(i11);
        } else if (i11 == -1) {
            sb2.append("-0");
        } else {
            sb2.append(i11 + 1);
        }
        if (this.f33773d > 0) {
            int length = sb2.length();
            sb2.append(i11 < 0 ? 2000000000 - this.f33773d : this.f33773d + Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
            while (sb2.charAt(sb2.length() - 1) == '0') {
                sb2.setLength(sb2.length() - 1);
            }
            sb2.setCharAt(length, CoreConstants.DOT);
        }
        sb2.append('S');
        return sb2.toString();
    }
}
