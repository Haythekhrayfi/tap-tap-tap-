package se;

import ch.qos.logback.core.CoreConstants;
import com.applovin.exoplayer2.common.base.Ascii;
import fd.z;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import java.util.Objects;
import ne.r;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne.i f35525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte f35526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ne.c f35527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ne.h f35528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f35529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f35530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r f35531i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r f35532j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final r f35533k;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35534a;

        static {
            int[] iArr = new int[b.values().length];
            f35534a = iArr;
            try {
                iArr[b.UTC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35534a[b.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum b {
        UTC,
        WALL,
        STANDARD;

        public ne.g createDateTime(ne.g gVar, r rVar, r rVar2) {
            long j10;
            int i10 = a.f35534a[ordinal()];
            if (i10 == 1) {
                j10 = rVar2.f33835d - r.f33832h.f33835d;
            } else {
                if (i10 != 2) {
                    return gVar;
                }
                j10 = rVar2.f33835d - rVar.f33835d;
            }
            return gVar.z(j10);
        }
    }

    public e(ne.i iVar, int i10, ne.c cVar, ne.h hVar, int i11, b bVar, r rVar, r rVar2, r rVar3) {
        this.f35525c = iVar;
        this.f35526d = (byte) i10;
        this.f35527e = cVar;
        this.f35528f = hVar;
        this.f35529g = i11;
        this.f35530h = bVar;
        this.f35531i = rVar;
        this.f35532j = rVar2;
        this.f35533k = rVar3;
    }

    public static e a(DataInput dataInput) throws IOException {
        r rVarN;
        r rVarN2;
        int i10 = dataInput.readInt();
        ne.i iVarOf = ne.i.of(i10 >>> 28);
        int i11 = ((264241152 & i10) >>> 22) - 32;
        int i12 = (3670016 & i10) >>> 19;
        ne.c cVarOf = i12 == 0 ? null : ne.c.of(i12);
        int i13 = (507904 & i10) >>> 14;
        b bVar = b.values()[(i10 & 12288) >>> 12];
        int i14 = (i10 & 4080) >>> 4;
        int i15 = (i10 & 12) >>> 2;
        int i16 = i10 & 3;
        int i17 = i13 == 31 ? dataInput.readInt() : i13 * DateTimeConstants.SECONDS_PER_HOUR;
        r rVarN3 = r.n(i14 == 255 ? dataInput.readInt() : (i14 - 128) * 900);
        if (i15 == 3) {
            rVarN = r.n(dataInput.readInt());
        } else {
            rVarN = r.n((i15 * 1800) + rVarN3.f33835d);
        }
        r rVar = rVarN;
        if (i16 == 3) {
            rVarN2 = r.n(dataInput.readInt());
        } else {
            rVarN2 = r.n((i16 * 1800) + rVarN3.f33835d);
        }
        if (i11 < -28 || i11 > 31 || i11 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        long j10 = ((i17 % DateTimeConstants.SECONDS_PER_DAY) + DateTimeConstants.SECONDS_PER_DAY) % DateTimeConstants.SECONDS_PER_DAY;
        ne.h hVar = ne.h.f33791g;
        re.a.SECOND_OF_DAY.checkValidValue(j10);
        int i18 = (int) (j10 / 3600);
        long j11 = j10 - ((long) (i18 * DateTimeConstants.SECONDS_PER_HOUR));
        int i19 = (int) (j11 / 60);
        return new e(iVarOf, i11, cVarOf, ne.h.g(i18, i19, (int) (j11 - ((long) (i19 * 60))), 0), i17 >= 0 ? i17 / DateTimeConstants.SECONDS_PER_DAY : ((i17 + 1) / DateTimeConstants.SECONDS_PER_DAY) - 1, bVar, rVarN3, rVar, rVarN2);
    }

    private Object writeReplace() {
        return new se.a((byte) 3, this);
    }

    public void b(DataOutput dataOutput) throws IOException {
        byte b10;
        int iR = (this.f35529g * DateTimeConstants.SECONDS_PER_DAY) + this.f35528f.r();
        int i10 = this.f35531i.f33835d;
        int i11 = this.f35532j.f33835d - i10;
        int i12 = this.f35533k.f33835d - i10;
        if (iR % DateTimeConstants.SECONDS_PER_HOUR != 0 || iR > 86400) {
            b10 = 31;
        } else {
            b10 = iR == 86400 ? Ascii.CAN : this.f35528f.f33794c;
        }
        int i13 = i10 % 900 == 0 ? (i10 / 900) + 128 : 255;
        int i14 = (i11 == 0 || i11 == 1800 || i11 == 3600) ? i11 / 1800 : 3;
        int i15 = (i12 == 0 || i12 == 1800 || i12 == 3600) ? i12 / 1800 : 3;
        ne.c cVar = this.f35527e;
        dataOutput.writeInt((this.f35525c.getValue() << 28) + ((this.f35526d + 32) << 22) + ((cVar == null ? 0 : cVar.getValue()) << 19) + (b10 << 14) + (this.f35530h.ordinal() << 12) + (i13 << 4) + (i14 << 2) + i15);
        if (b10 == 31) {
            dataOutput.writeInt(iR);
        }
        if (i13 == 255) {
            dataOutput.writeInt(i10);
        }
        if (i14 == 3) {
            dataOutput.writeInt(this.f35532j.f33835d);
        }
        if (i15 == 3) {
            dataOutput.writeInt(this.f35533k.f33835d);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f35525c == eVar.f35525c && this.f35526d == eVar.f35526d && this.f35527e == eVar.f35527e && this.f35530h == eVar.f35530h && this.f35529g == eVar.f35529g && this.f35528f.equals(eVar.f35528f) && this.f35531i.equals(eVar.f35531i) && this.f35532j.equals(eVar.f35532j) && this.f35533k.equals(eVar.f35533k);
    }

    public int hashCode() {
        int iR = ((this.f35528f.r() + this.f35529g) << 15) + (this.f35525c.ordinal() << 11) + ((this.f35526d + 32) << 5);
        ne.c cVar = this.f35527e;
        return ((this.f35531i.f33835d ^ (this.f35530h.ordinal() + (iR + ((cVar == null ? 7 : cVar.ordinal()) << 2)))) ^ this.f35532j.f33835d) ^ this.f35533k.f33835d;
    }

    public String toString() {
        String str;
        StringBuilder sbA = defpackage.a.a("TransitionRule[");
        r rVar = this.f35532j;
        r rVar2 = this.f35533k;
        Objects.requireNonNull(rVar);
        sbA.append(rVar2.f33835d - rVar.f33835d > 0 ? "Gap " : "Overlap ");
        sbA.append(this.f35532j);
        sbA.append(" to ");
        sbA.append(this.f35533k);
        sbA.append(", ");
        ne.c cVar = this.f35527e;
        if (cVar != null) {
            byte b10 = this.f35526d;
            sbA.append(cVar.name());
            if (b10 == -1) {
                str = " on or before last day of ";
            } else if (b10 < 0) {
                sbA.append(" on or before last day minus ");
                sbA.append((-this.f35526d) - 1);
                str = " of ";
            } else {
                sbA.append(" on or after ");
                sbA.append(this.f35525c.name());
                sbA.append(' ');
                sbA.append((int) this.f35526d);
            }
            sbA.append(str);
            sbA.append(this.f35525c.name());
        } else {
            sbA.append(this.f35525c.name());
            sbA.append(' ');
            sbA.append((int) this.f35526d);
        }
        sbA.append(" at ");
        if (this.f35529g == 0) {
            sbA.append(this.f35528f);
        } else {
            long jR = (this.f35529g * 24 * 60) + (this.f35528f.r() / 60);
            long jT = z.t(jR, 60L);
            if (jT < 10) {
                sbA.append(0);
            }
            sbA.append(jT);
            sbA.append(CoreConstants.COLON_CHAR);
            long jU = z.u(jR, 60);
            if (jU < 10) {
                sbA.append(0);
            }
            sbA.append(jU);
        }
        sbA.append(" ");
        sbA.append(this.f35530h);
        sbA.append(", standard offset ");
        sbA.append(this.f35531i);
        sbA.append(']');
        return sbA.toString();
    }
}
