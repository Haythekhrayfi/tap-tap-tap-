package pe;

import ch.qos.logback.core.CoreConstants;
import fd.z;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import ne.q;
import ne.r;
import okhttp3.internal.http2.Http2Connection;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final re.k<q> f34646f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Map<Character, re.i> f34647g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f34648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f34649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<f> f34650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f34651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34652e;

    public class a implements re.k<q> {
        @Override // re.k
        public q a(re.e eVar) {
            q qVar = (q) eVar.query(re.j.f35373a);
            if (qVar == null || (qVar instanceof r)) {
                return null;
            }
            return qVar;
        }
    }

    /* JADX INFO: renamed from: pe.b$b, reason: collision with other inner class name */
    public class C0387b extends pe.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ pe.k.b f34653b;

        public C0387b(b bVar, pe.k.b bVar2) {
            this.f34653b = bVar2;
        }

        @Override // pe.g
        public String a(re.i iVar, long j10, pe.l lVar, Locale locale) {
            return this.f34653b.a(j10, lVar);
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34654a;

        static {
            int[] iArr = new int[pe.j.values().length];
            f34654a = iArr;
            try {
                iArr[pe.j.EXCEEDS_PAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34654a[pe.j.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34654a[pe.j.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34654a[pe.j.NOT_NEGATIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class d implements f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final char f34655c;

        public d(char c10) {
            this.f34655c = c10;
        }

        @Override // pe.b.f
        public boolean print(pe.f fVar, StringBuilder sb2) {
            sb2.append(this.f34655c);
            return true;
        }

        public String toString() {
            if (this.f34655c == '\'') {
                return "''";
            }
            StringBuilder sbA = defpackage.a.a("'");
            sbA.append(this.f34655c);
            sbA.append("'");
            return sbA.toString();
        }
    }

    public static final class e implements f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f[] f34656c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f34657d;

        public e(List<f> list, boolean z10) {
            this.f34656c = (f[]) list.toArray(new f[list.size()]);
            this.f34657d = z10;
        }

        public e(f[] fVarArr, boolean z10) {
            this.f34656c = fVarArr;
            this.f34657d = z10;
        }

        @Override // pe.b.f
        public boolean print(pe.f fVar, StringBuilder sb2) {
            int length = sb2.length();
            if (this.f34657d) {
                fVar.f34684d++;
            }
            try {
                for (f fVar2 : this.f34656c) {
                    if (!fVar2.print(fVar, sb2)) {
                        sb2.setLength(length);
                        return true;
                    }
                }
                return true;
            } finally {
                if (this.f34657d) {
                    fVar.a();
                }
            }
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            if (this.f34656c != null) {
                sb2.append(this.f34657d ? "[" : "(");
                for (f fVar : this.f34656c) {
                    sb2.append(fVar);
                }
                sb2.append(this.f34657d ? "]" : ")");
            }
            return sb2.toString();
        }
    }

    public interface f {
        boolean print(pe.f fVar, StringBuilder sb2);
    }

    public static final class g implements f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final re.i f34658c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f34659d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f34660e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f34661f;

        public g(re.i iVar, int i10, int i11, boolean z10) {
            z.B(iVar, "field");
            re.n nVarRange = iVar.range();
            if (!(nVarRange.f35380c == nVarRange.f35381d && nVarRange.f35382e == nVarRange.f35383f)) {
                throw new IllegalArgumentException(ne.b.a("Field must have a fixed set of values: ", iVar));
            }
            if (i10 < 0 || i10 > 9) {
                throw new IllegalArgumentException(android.support.v4.media.a.a("Minimum width must be from 0 to 9 inclusive but was ", i10));
            }
            if (i11 < 1 || i11 > 9) {
                throw new IllegalArgumentException(android.support.v4.media.a.a("Maximum width must be from 1 to 9 inclusive but was ", i11));
            }
            if (i11 < i10) {
                throw new IllegalArgumentException(n1.c.a("Maximum width must exceed or equal the minimum width but ", i11, " < ", i10));
            }
            this.f34658c = iVar;
            this.f34659d = i10;
            this.f34660e = i11;
            this.f34661f = z10;
        }

        @Override // pe.b.f
        public boolean print(pe.f fVar, StringBuilder sb2) {
            Long lB = fVar.b(this.f34658c);
            if (lB == null) {
                return false;
            }
            pe.h hVar = fVar.f34683c;
            long jLongValue = lB.longValue();
            re.n nVarRange = this.f34658c.range();
            nVarRange.b(jLongValue, this.f34658c);
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(nVarRange.f35380c);
            BigDecimal bigDecimalDivide = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf).divide(BigDecimal.valueOf(nVarRange.f35383f).subtract(bigDecimalValueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
            BigDecimal bigDecimalStripTrailingZeros = bigDecimalDivide.compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : bigDecimalDivide.stripTrailingZeros();
            if (bigDecimalStripTrailingZeros.scale() != 0) {
                String strA = hVar.a(bigDecimalStripTrailingZeros.setScale(Math.min(Math.max(bigDecimalStripTrailingZeros.scale(), this.f34659d), this.f34660e), RoundingMode.FLOOR).toPlainString().substring(2));
                if (this.f34661f) {
                    sb2.append(hVar.f34691d);
                }
                sb2.append(strA);
                return true;
            }
            if (this.f34659d <= 0) {
                return true;
            }
            if (this.f34661f) {
                sb2.append(hVar.f34691d);
            }
            for (int i10 = 0; i10 < this.f34659d; i10++) {
                sb2.append(hVar.f34688a);
            }
            return true;
        }

        public String toString() {
            String str = this.f34661f ? ",DecimalPoint" : "";
            StringBuilder sbA = defpackage.a.a("Fraction(");
            sbA.append(this.f34658c);
            sbA.append(",");
            sbA.append(this.f34659d);
            sbA.append(",");
            sbA.append(this.f34660e);
            sbA.append(str);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class h implements f {
        public h(int i10) {
        }

        @Override // pe.b.f
        public boolean print(pe.f fVar, StringBuilder sb2) {
            int i10;
            Long lB = fVar.b(re.a.INSTANT_SECONDS);
            re.e eVar = fVar.f34681a;
            re.a aVar = re.a.NANO_OF_SECOND;
            Long lValueOf = eVar.isSupported(aVar) ? Long.valueOf(fVar.f34681a.getLong(aVar)) : 0L;
            if (lB == null) {
                return false;
            }
            long jLongValue = lB.longValue();
            int iCheckValidIntValue = aVar.checkValidIntValue(lValueOf.longValue());
            if (jLongValue >= -62167219200L) {
                long j10 = (jLongValue - 315569520000L) + 62167219200L;
                long jT = z.t(j10, 315569520000L) + 1;
                ne.g gVarV = ne.g.v(z.v(j10, 315569520000L) - 62167219200L, 0, r.f33832h);
                if (jT > 0) {
                    sb2.append('+');
                    sb2.append(jT);
                }
                sb2.append(gVarV);
                if (gVarV.f33789d.f33796e == 0) {
                    sb2.append(":00");
                }
            } else {
                long j11 = jLongValue + 62167219200L;
                long j12 = j11 / 315569520000L;
                long j13 = j11 % 315569520000L;
                ne.g gVarV2 = ne.g.v(j13 - 62167219200L, 0, r.f33832h);
                int length = sb2.length();
                sb2.append(gVarV2);
                if (gVarV2.f33789d.f33796e == 0) {
                    sb2.append(":00");
                }
                if (j12 < 0) {
                    if (gVarV2.f33788c.f33781c == -10000) {
                        sb2.replace(length, length + 2, Long.toString(j12 - 1));
                    } else if (j13 == 0) {
                        sb2.insert(length, j12);
                    } else {
                        sb2.insert(length + 1, Math.abs(j12));
                    }
                }
            }
            if (iCheckValidIntValue != 0) {
                sb2.append(CoreConstants.DOT);
                int i11 = 1000000;
                if (iCheckValidIntValue % 1000000 == 0) {
                    i10 = (iCheckValidIntValue / 1000000) + 1000;
                } else {
                    if (iCheckValidIntValue % 1000 == 0) {
                        iCheckValidIntValue /= 1000;
                    } else {
                        i11 = Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
                    }
                    i10 = iCheckValidIntValue + i11;
                }
                sb2.append(Integer.toString(i10).substring(1));
            }
            sb2.append('Z');
            return true;
        }

        public String toString() {
            return "Instant()";
        }
    }

    public static class i implements f {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int[] f34662h = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, Http2Connection.DEGRADED_PONG_TIMEOUT_NS};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final re.i f34663c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f34664d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f34665e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final pe.j f34666f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f34667g;

        public i(re.i iVar, int i10, int i11, pe.j jVar) {
            this.f34663c = iVar;
            this.f34664d = i10;
            this.f34665e = i11;
            this.f34666f = jVar;
            this.f34667g = 0;
        }

        public i(re.i iVar, int i10, int i11, pe.j jVar, int i12) {
            this.f34663c = iVar;
            this.f34664d = i10;
            this.f34665e = i11;
            this.f34666f = jVar;
            this.f34667g = i12;
        }

        public i a() {
            return this.f34667g == -1 ? this : new i(this.f34663c, this.f34664d, this.f34665e, this.f34666f, -1);
        }

        @Override // pe.b.f
        public boolean print(pe.f fVar, StringBuilder sb2) {
            char c10;
            int i10;
            Long lB = fVar.b(this.f34663c);
            if (lB == null) {
                return false;
            }
            long jLongValue = lB.longValue();
            pe.h hVar = fVar.f34683c;
            String string = jLongValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jLongValue));
            if (string.length() > this.f34665e) {
                StringBuilder sbA = defpackage.a.a("Field ");
                sbA.append(this.f34663c);
                sbA.append(" cannot be printed as the value ");
                sbA.append(jLongValue);
                sbA.append(" exceeds the maximum print width of ");
                sbA.append(this.f34665e);
                throw new ne.a(sbA.toString());
            }
            String strA = hVar.a(string);
            if (jLongValue >= 0) {
                int i11 = c.f34654a[this.f34666f.ordinal()];
                if (i11 == 1 ? !((i10 = this.f34664d) >= 19 || jLongValue < f34662h[i10]) : i11 == 2) {
                    c10 = hVar.f34689b;
                    sb2.append(c10);
                }
            } else {
                int i12 = c.f34654a[this.f34666f.ordinal()];
                if (i12 == 1 || i12 == 2 || i12 == 3) {
                    c10 = hVar.f34690c;
                    sb2.append(c10);
                } else if (i12 == 4) {
                    StringBuilder sbA2 = defpackage.a.a("Field ");
                    sbA2.append(this.f34663c);
                    sbA2.append(" cannot be printed as the value ");
                    sbA2.append(jLongValue);
                    sbA2.append(" cannot be negative according to the SignStyle");
                    throw new ne.a(sbA2.toString());
                }
            }
            for (int i13 = 0; i13 < this.f34664d - strA.length(); i13++) {
                sb2.append(hVar.f34688a);
            }
            sb2.append(strA);
            return true;
        }

        public String toString() {
            StringBuilder sbA;
            Object obj;
            int i10 = this.f34664d;
            if (i10 != 1 || this.f34665e != 19 || this.f34666f != pe.j.NORMAL) {
                if (i10 == this.f34665e && this.f34666f == pe.j.NOT_NEGATIVE) {
                    sbA = defpackage.a.a("Value(");
                    sbA.append(this.f34663c);
                    sbA.append(",");
                    sbA.append(this.f34664d);
                } else {
                    sbA = defpackage.a.a("Value(");
                    sbA.append(this.f34663c);
                    sbA.append(",");
                    sbA.append(this.f34664d);
                    sbA.append(",");
                    sbA.append(this.f34665e);
                    sbA.append(",");
                    obj = this.f34666f;
                }
                sbA.append(")");
                return sbA.toString();
            }
            sbA = defpackage.a.a("Value(");
            obj = this.f34663c;
            sbA.append(obj);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class j implements f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String[] f34668e = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final j f34669f = new j("Z", "+HH:MM:ss");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f34670c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f34671d;

        static {
            new j("0", "+HH:MM:ss");
        }

        public j(String str, String str2) {
            z.B(str, "noOffsetText");
            z.B(str2, "pattern");
            this.f34670c = str;
            int i10 = 0;
            while (true) {
                String[] strArr = f34668e;
                if (i10 >= strArr.length) {
                    throw new IllegalArgumentException(i.f.a("Invalid zone offset pattern: ", str2));
                }
                if (strArr[i10].equals(str2)) {
                    this.f34671d = i10;
                    return;
                }
                i10++;
            }
        }

        @Override // pe.b.f
        public boolean print(pe.f fVar, StringBuilder sb2) {
            Long lB = fVar.b(re.a.OFFSET_SECONDS);
            if (lB == null) {
                return false;
            }
            int I = z.I(lB.longValue());
            if (I == 0) {
                sb2.append(this.f34670c);
            } else {
                int iAbs = Math.abs((I / DateTimeConstants.SECONDS_PER_HOUR) % 100);
                int iAbs2 = Math.abs((I / 60) % 60);
                int iAbs3 = Math.abs(I % 60);
                int length = sb2.length();
                sb2.append(I < 0 ? "-" : "+");
                sb2.append((char) ((iAbs / 10) + 48));
                sb2.append((char) ((iAbs % 10) + 48));
                int i10 = this.f34671d;
                if (i10 >= 3 || (i10 >= 1 && iAbs2 > 0)) {
                    sb2.append(i10 % 2 == 0 ? ":" : "");
                    sb2.append((char) ((iAbs2 / 10) + 48));
                    sb2.append((char) ((iAbs2 % 10) + 48));
                    iAbs += iAbs2;
                    int i11 = this.f34671d;
                    if (i11 >= 7 || (i11 >= 5 && iAbs3 > 0)) {
                        sb2.append(i11 % 2 != 0 ? "" : ":");
                        sb2.append((char) ((iAbs3 / 10) + 48));
                        sb2.append((char) ((iAbs3 % 10) + 48));
                        iAbs += iAbs3;
                    }
                }
                if (iAbs == 0) {
                    sb2.setLength(length);
                    sb2.append(this.f34670c);
                }
            }
            return true;
        }

        public String toString() {
            return w0.a.a(defpackage.a.a("Offset("), f34668e[this.f34671d], ",'", this.f34670c.replace("'", "''"), "')");
        }
    }

    public enum k implements f {
        SENSITIVE,
        INSENSITIVE,
        STRICT,
        LENIENT;

        public int parse(pe.c cVar, CharSequence charSequence, int i10) {
            int iOrdinal = ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                throw null;
            }
            return i10;
        }

        @Override // pe.b.f
        public boolean print(pe.f fVar, StringBuilder sb2) {
            return true;
        }

        @Override // java.lang.Enum
        public String toString() {
            int iOrdinal = ordinal();
            if (iOrdinal == 0) {
                return "ParseCaseSensitive(true)";
            }
            if (iOrdinal == 1) {
                return "ParseCaseSensitive(false)";
            }
            if (iOrdinal == 2) {
                return "ParseStrict(true)";
            }
            if (iOrdinal == 3) {
                return "ParseStrict(false)";
            }
            throw new IllegalStateException("Unreachable");
        }
    }

    public static final class l implements f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f34672c;

        public l(String str) {
            this.f34672c = str;
        }

        @Override // pe.b.f
        public boolean print(pe.f fVar, StringBuilder sb2) {
            sb2.append(this.f34672c);
            return true;
        }

        public String toString() {
            return androidx.activity.j.a("'", this.f34672c.replace("'", "''"), "'");
        }
    }

    public static final class m implements f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final re.i f34673c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final pe.l f34674d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final pe.g f34675e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile i f34676f;

        public m(re.i iVar, pe.l lVar, pe.g gVar) {
            this.f34673c = iVar;
            this.f34674d = lVar;
            this.f34675e = gVar;
        }

        @Override // pe.b.f
        public boolean print(pe.f fVar, StringBuilder sb2) {
            Long lB = fVar.b(this.f34673c);
            if (lB == null) {
                return false;
            }
            String strA = this.f34675e.a(this.f34673c, lB.longValue(), this.f34674d, fVar.f34682b);
            if (strA != null) {
                sb2.append(strA);
                return true;
            }
            if (this.f34676f == null) {
                this.f34676f = new i(this.f34673c, 1, 19, pe.j.NORMAL);
            }
            return this.f34676f.print(fVar, sb2);
        }

        public String toString() {
            StringBuilder sbA;
            Object obj;
            if (this.f34674d == pe.l.FULL) {
                sbA = defpackage.a.a("Text(");
                obj = this.f34673c;
            } else {
                sbA = defpackage.a.a("Text(");
                sbA.append(this.f34673c);
                sbA.append(",");
                obj = this.f34674d;
            }
            return o0.c.a(sbA, obj, ")");
        }
    }

    public static final class n implements f {
        public n(re.k<q> kVar, String str) {
        }

        @Override // pe.b.f
        public boolean print(pe.f fVar, StringBuilder sb2) {
            Object objQuery = fVar.f34681a.query(b.f34646f);
            if (objQuery == null && fVar.f34684d == 0) {
                StringBuilder sbA = defpackage.a.a("Unable to extract value: ");
                sbA.append(fVar.f34681a.getClass());
                throw new ne.a(sbA.toString());
            }
            q qVar = (q) objQuery;
            if (qVar == null) {
                return false;
            }
            sb2.append(qVar.g());
            return true;
        }

        public String toString() {
            return "ZoneRegionId()";
        }
    }

    static {
        HashMap map = new HashMap();
        f34647g = map;
        map.put('G', re.a.ERA);
        map.put('y', re.a.YEAR_OF_ERA);
        map.put('u', re.a.YEAR);
        re.i iVar = re.c.f35365a;
        map.put('Q', iVar);
        map.put('q', iVar);
        re.a aVar = re.a.MONTH_OF_YEAR;
        map.put('M', aVar);
        map.put('L', aVar);
        map.put('D', re.a.DAY_OF_YEAR);
        map.put('d', re.a.DAY_OF_MONTH);
        map.put('F', re.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        re.a aVar2 = re.a.DAY_OF_WEEK;
        map.put('E', aVar2);
        map.put('c', aVar2);
        map.put('e', aVar2);
        map.put('a', re.a.AMPM_OF_DAY);
        map.put('H', re.a.HOUR_OF_DAY);
        map.put('k', re.a.CLOCK_HOUR_OF_DAY);
        map.put('K', re.a.HOUR_OF_AMPM);
        map.put('h', re.a.CLOCK_HOUR_OF_AMPM);
        map.put('m', re.a.MINUTE_OF_HOUR);
        map.put('s', re.a.SECOND_OF_MINUTE);
        re.a aVar3 = re.a.NANO_OF_SECOND;
        map.put('S', aVar3);
        map.put('A', re.a.MILLI_OF_DAY);
        map.put('n', aVar3);
        map.put('N', re.a.NANO_OF_DAY);
    }

    public b() {
        this.f34648a = this;
        this.f34650c = new ArrayList();
        this.f34652e = -1;
        this.f34649b = null;
        this.f34651d = false;
    }

    public b(b bVar, boolean z10) {
        this.f34648a = this;
        this.f34650c = new ArrayList();
        this.f34652e = -1;
        this.f34649b = bVar;
        this.f34651d = z10;
    }

    public b a(pe.a aVar) {
        e eVar = aVar.f34639a;
        if (eVar.f34657d) {
            eVar = new e(eVar.f34656c, false);
        }
        b(eVar);
        return this;
    }

    public final int b(f fVar) {
        z.B(fVar, "pp");
        b bVar = this.f34648a;
        Objects.requireNonNull(bVar);
        bVar.f34650c.add(fVar);
        b bVar2 = this.f34648a;
        bVar2.f34652e = -1;
        return bVar2.f34650c.size() - 1;
    }

    public b c(char c10) {
        b(new d(c10));
        return this;
    }

    public b d(String str) {
        if (str.length() > 0) {
            b(str.length() == 1 ? new d(str.charAt(0)) : new l(str));
        }
        return this;
    }

    public b e(re.i iVar, Map<Long, String> map) {
        z.B(iVar, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        pe.l lVar = pe.l.FULL;
        b(new m(iVar, lVar, new C0387b(this, new pe.k.b(Collections.singletonMap(lVar, linkedHashMap)))));
        return this;
    }

    public b f(re.i iVar, pe.l lVar) {
        z.B(iVar, "field");
        z.B(lVar, "textStyle");
        AtomicReference<pe.g> atomicReference = pe.g.f34685a;
        b(new m(iVar, lVar, pe.g.a.f34686a));
        return this;
    }

    public final b g(i iVar) {
        i iVarA;
        b bVar = this.f34648a;
        int i10 = bVar.f34652e;
        if (i10 < 0 || !(bVar.f34650c.get(i10) instanceof i)) {
            this.f34648a.f34652e = b(iVar);
        } else {
            b bVar2 = this.f34648a;
            int i11 = bVar2.f34652e;
            i iVar2 = (i) bVar2.f34650c.get(i11);
            int i12 = iVar.f34664d;
            int i13 = iVar.f34665e;
            if (i12 == i13 && iVar.f34666f == pe.j.NOT_NEGATIVE) {
                iVarA = new i(iVar2.f34663c, iVar2.f34664d, iVar2.f34665e, iVar2.f34666f, iVar2.f34667g + i13);
                b(iVar.a());
                this.f34648a.f34652e = i11;
            } else {
                iVarA = iVar2.a();
                this.f34648a.f34652e = b(iVar);
            }
            this.f34648a.f34650c.set(i11, iVarA);
        }
        return this;
    }

    public b h(re.i iVar, int i10) {
        z.B(iVar, "field");
        if (i10 < 1 || i10 > 19) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("The width must be from 1 to 19 inclusive but was ", i10));
        }
        g(new i(iVar, i10, i10, pe.j.NOT_NEGATIVE));
        return this;
    }

    public b i(re.i iVar, int i10, int i11, pe.j jVar) {
        if (i10 == i11 && jVar == pe.j.NOT_NEGATIVE) {
            h(iVar, i11);
            return this;
        }
        z.B(iVar, "field");
        z.B(jVar, "signStyle");
        if (i10 < 1 || i10 > 19) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("The minimum width must be from 1 to 19 inclusive but was ", i10));
        }
        if (i11 < 1 || i11 > 19) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("The maximum width must be from 1 to 19 inclusive but was ", i11));
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(n1.c.a("The maximum width must exceed or equal the minimum width but ", i11, " < ", i10));
        }
        g(new i(iVar, i10, i11, jVar));
        return this;
    }

    public b j() {
        b bVar = this.f34648a;
        if (bVar.f34649b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (bVar.f34650c.size() > 0) {
            b bVar2 = this.f34648a;
            e eVar = new e(bVar2.f34650c, bVar2.f34651d);
            this.f34648a = this.f34648a.f34649b;
            b(eVar);
        } else {
            this.f34648a = this.f34648a.f34649b;
        }
        return this;
    }

    public b k() {
        b bVar = this.f34648a;
        bVar.f34652e = -1;
        this.f34648a = new b(bVar, true);
        return this;
    }

    public pe.a l() {
        return m(Locale.getDefault());
    }

    public pe.a m(Locale locale) {
        z.B(locale, "locale");
        while (this.f34648a.f34649b != null) {
            j();
        }
        return new pe.a(new e(this.f34650c, false), locale, pe.h.f34687e, pe.i.SMART, null, null, null);
    }

    public pe.a n(pe.i iVar) {
        pe.a aVarL = l();
        Objects.requireNonNull(aVarL);
        z.B(iVar, "resolverStyle");
        return z.q(aVarL.f34642d, iVar) ? aVarL : new pe.a(aVarL.f34639a, aVarL.f34640b, aVarL.f34641c, iVar, aVarL.f34643e, aVarL.f34644f, aVarL.f34645g);
    }
}
