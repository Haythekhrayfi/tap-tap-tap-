package o6;

import androidx.recyclerview.widget.o;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.ActionConst;
import com.google.gson.internal.p;
import com.google.gson.n;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class a implements Closeable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final char[] f33967r = ")]}'\n".toCharArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Reader f33968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f33969d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final char[] f33970e = new char[1024];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f33971f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f33972g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f33973h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f33974i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f33975j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f33976k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f33977l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f33978m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f33979n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f33980o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String[] f33981p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int[] f33982q;

    /* JADX INFO: renamed from: o6.a$a, reason: collision with other inner class name */
    public static class C0374a extends p {
        @Override // com.google.gson.internal.p
        public void a(a aVar) throws IOException {
            int i10;
            if (aVar instanceof com.google.gson.internal.bind.a) {
                com.google.gson.internal.bind.a aVar2 = (com.google.gson.internal.bind.a) aVar;
                aVar2.g0(b.NAME);
                Map.Entry entry = (Map.Entry) ((Iterator) aVar2.h0()).next();
                aVar2.j0(entry.getValue());
                aVar2.j0(new n((String) entry.getKey()));
                return;
            }
            int iE = aVar.f33975j;
            if (iE == 0) {
                iE = aVar.e();
            }
            if (iE == 13) {
                i10 = 9;
            } else if (iE == 12) {
                i10 = 8;
            } else {
                if (iE != 14) {
                    StringBuilder sbA = defpackage.a.a("Expected a name but was ");
                    sbA.append(aVar.V());
                    sbA.append(aVar.m());
                    throw new IllegalStateException(sbA.toString());
                }
                i10 = 10;
            }
            aVar.f33975j = i10;
        }
    }

    static {
        p.f12866a = new C0374a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f33979n = iArr;
        this.f33980o = 0;
        this.f33980o = 0 + 1;
        iArr[0] = 6;
        this.f33981p = new String[32];
        this.f33982q = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f33968c = reader;
    }

    public long C() throws IOException {
        String strP;
        int iE = this.f33975j;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 15) {
            this.f33975j = 0;
            int[] iArr = this.f33982q;
            int i10 = this.f33980o - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f33976k;
        }
        if (iE == 16) {
            this.f33978m = new String(this.f33970e, this.f33971f, this.f33977l);
            this.f33971f += this.f33977l;
        } else {
            if (iE != 8 && iE != 9 && iE != 10) {
                StringBuilder sbA = defpackage.a.a("Expected a long but was ");
                sbA.append(V());
                sbA.append(m());
                throw new IllegalStateException(sbA.toString());
            }
            if (iE == 10) {
                strP = T();
            } else {
                strP = P(iE == 8 ? CoreConstants.SINGLE_QUOTE_CHAR : CoreConstants.DOUBLE_QUOTE_CHAR);
            }
            this.f33978m = strP;
            try {
                long j10 = Long.parseLong(this.f33978m);
                this.f33975j = 0;
                int[] iArr2 = this.f33982q;
                int i11 = this.f33980o - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j10;
            } catch (NumberFormatException unused) {
            }
        }
        this.f33975j = 11;
        double d10 = Double.parseDouble(this.f33978m);
        long j11 = (long) d10;
        if (j11 != d10) {
            StringBuilder sbA2 = defpackage.a.a("Expected a long but was ");
            sbA2.append(this.f33978m);
            sbA2.append(m());
            throw new NumberFormatException(sbA2.toString());
        }
        this.f33978m = null;
        this.f33975j = 0;
        int[] iArr3 = this.f33982q;
        int i12 = this.f33980o - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return j11;
    }

    public String J() throws IOException {
        char c10;
        String strP;
        int iE = this.f33975j;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 14) {
            strP = T();
        } else {
            if (iE == 12) {
                c10 = CoreConstants.SINGLE_QUOTE_CHAR;
            } else {
                if (iE != 13) {
                    StringBuilder sbA = defpackage.a.a("Expected a name but was ");
                    sbA.append(V());
                    sbA.append(m());
                    throw new IllegalStateException(sbA.toString());
                }
                c10 = CoreConstants.DOUBLE_QUOTE_CHAR;
            }
            strP = P(c10);
        }
        this.f33975j = 0;
        this.f33981p[this.f33980o - 1] = strP;
        return strP;
    }

    public final int K(boolean z10) throws IOException {
        boolean z11;
        int i10;
        char c10;
        char[] cArr = this.f33970e;
        while (true) {
            int i11 = this.f33971f;
            while (true) {
                int i12 = this.f33972g;
                while (true) {
                    z11 = true;
                    if (i11 == i12) {
                        this.f33971f = i11;
                        if (!i(1)) {
                            if (!z10) {
                                return -1;
                            }
                            StringBuilder sbA = defpackage.a.a("End of input");
                            sbA.append(m());
                            throw new EOFException(sbA.toString());
                        }
                        i11 = this.f33971f;
                        i12 = this.f33972g;
                    }
                    i10 = i11 + 1;
                    c10 = cArr[i11];
                    if (c10 == '\n') {
                        this.f33973h++;
                        this.f33974i = i10;
                    } else if (c10 == ' ' || c10 == '\r' || c10 == '\t') {
                    }
                    i11 = i10;
                }
                if (c10 != '/') {
                    this.f33971f = i10;
                    if (c10 != '#') {
                        return c10;
                    }
                    c();
                    break;
                }
                this.f33971f = i10;
                if (i10 == i12) {
                    this.f33971f = i10 - 1;
                    boolean zI = i(2);
                    this.f33971f++;
                    if (!zI) {
                        return c10;
                    }
                }
                c();
                int i13 = this.f33971f;
                char c11 = cArr[i13];
                if (c11 != '*') {
                    if (c11 == '/') {
                        this.f33971f = i13 + 1;
                        break;
                    }
                    return c10;
                }
                this.f33971f = i13 + 1;
                while (true) {
                    int i14 = 0;
                    if (this.f33971f + 2 > this.f33972g && !i(2)) {
                        z11 = false;
                        break;
                    }
                    char[] cArr2 = this.f33970e;
                    int i15 = this.f33971f;
                    if (cArr2[i15] != '\n') {
                        while (true) {
                            if (i14 >= 2) {
                                break;
                            }
                            if (this.f33970e[this.f33971f + i14] != "*/".charAt(i14)) {
                                break;
                            }
                            i14++;
                        }
                    } else {
                        this.f33973h++;
                        this.f33974i = i15 + 1;
                    }
                    this.f33971f++;
                }
                if (!z11) {
                    f0("Unterminated comment");
                    throw null;
                }
                i11 = this.f33971f + 2;
            }
            d0();
        }
    }

    public void O() throws IOException {
        int iE = this.f33975j;
        if (iE == 0) {
            iE = e();
        }
        if (iE != 7) {
            StringBuilder sbA = defpackage.a.a("Expected null but was ");
            sbA.append(V());
            sbA.append(m());
            throw new IllegalStateException(sbA.toString());
        }
        this.f33975j = 0;
        int[] iArr = this.f33982q;
        int i10 = this.f33980o - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    public final String P(char c10) throws IOException {
        char[] cArr = this.f33970e;
        StringBuilder sb2 = null;
        while (true) {
            int i10 = this.f33971f;
            int i11 = this.f33972g;
            while (true) {
                if (i10 >= i11) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max((i10 - i10) * 2, 16));
                    }
                    sb2.append(cArr, i10, i10 - i10);
                    this.f33971f = i10;
                    if (i(1)) {
                        break;
                    }
                    f0("Unterminated string");
                    throw null;
                }
                int i12 = i10 + 1;
                char c11 = cArr[i10];
                if (c11 == c10) {
                    this.f33971f = i12;
                    int i13 = (i12 - i10) - 1;
                    if (sb2 == null) {
                        return new String(cArr, i10, i13);
                    }
                    sb2.append(cArr, i10, i13);
                    return sb2.toString();
                }
                if (c11 == '\\') {
                    this.f33971f = i12;
                    int i14 = (i12 - i10) - 1;
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max((i14 + 1) * 2, 16));
                    }
                    sb2.append(cArr, i10, i14);
                    sb2.append(b0());
                    break;
                }
                if (c11 == '\n') {
                    this.f33973h++;
                    this.f33974i = i12;
                }
                i10 = i12;
            }
        }
    }

    public String R() throws IOException {
        String str;
        char c10;
        int iE = this.f33975j;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 10) {
            str = T();
        } else {
            if (iE == 8) {
                c10 = CoreConstants.SINGLE_QUOTE_CHAR;
            } else if (iE == 9) {
                c10 = CoreConstants.DOUBLE_QUOTE_CHAR;
            } else if (iE == 11) {
                str = this.f33978m;
                this.f33978m = null;
            } else if (iE == 15) {
                str = Long.toString(this.f33976k);
            } else {
                if (iE != 16) {
                    StringBuilder sbA = defpackage.a.a("Expected a string but was ");
                    sbA.append(V());
                    sbA.append(m());
                    throw new IllegalStateException(sbA.toString());
                }
                str = new String(this.f33970e, this.f33971f, this.f33977l);
                this.f33971f += this.f33977l;
            }
            str = P(c10);
        }
        this.f33975j = 0;
        int[] iArr = this.f33982q;
        int i10 = this.f33980o - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    public final String T() throws IOException {
        String string;
        int i10 = 0;
        StringBuilder sb2 = null;
        while (true) {
            int i11 = 0;
            while (true) {
                int i12 = this.f33971f;
                if (i12 + i11 < this.f33972g) {
                    char c10 = this.f33970e[i12 + i11];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        if (c10 != '#') {
                            if (c10 != ',') {
                                if (c10 != '/' && c10 != '=') {
                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                        if (c10 != ';') {
                                            switch (c10) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i11++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        c();
                    }
                    i10 = i11;
                } else if (i11 >= this.f33970e.length) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i11, 16));
                    }
                    sb2.append(this.f33970e, this.f33971f, i11);
                    this.f33971f += i11;
                    if (!i(1)) {
                    }
                } else if (!i(i11 + 1)) {
                    i10 = i11;
                }
                if (sb2 == null) {
                    string = new String(this.f33970e, this.f33971f, i10);
                } else {
                    sb2.append(this.f33970e, this.f33971f, i10);
                    string = sb2.toString();
                }
                this.f33971f += i10;
                return string;
            }
        }
    }

    public b V() throws IOException {
        int iE = this.f33975j;
        if (iE == 0) {
            iE = e();
        }
        switch (iE) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void Y(int i10) {
        int i11 = this.f33980o;
        int[] iArr = this.f33979n;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[i11 * 2];
            int[] iArr3 = new int[i11 * 2];
            String[] strArr = new String[i11 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            System.arraycopy(this.f33982q, 0, iArr3, 0, this.f33980o);
            System.arraycopy(this.f33981p, 0, strArr, 0, this.f33980o);
            this.f33979n = iArr2;
            this.f33982q = iArr3;
            this.f33981p = strArr;
        }
        int[] iArr4 = this.f33979n;
        int i12 = this.f33980o;
        this.f33980o = i12 + 1;
        iArr4[i12] = i10;
    }

    public void a() throws IOException {
        int iE = this.f33975j;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 3) {
            Y(1);
            this.f33982q[this.f33980o - 1] = 0;
            this.f33975j = 0;
        } else {
            StringBuilder sbA = defpackage.a.a("Expected BEGIN_ARRAY but was ");
            sbA.append(V());
            sbA.append(m());
            throw new IllegalStateException(sbA.toString());
        }
    }

    public void b() throws IOException {
        int iE = this.f33975j;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 1) {
            Y(3);
            this.f33975j = 0;
        } else {
            StringBuilder sbA = defpackage.a.a("Expected BEGIN_OBJECT but was ");
            sbA.append(V());
            sbA.append(m());
            throw new IllegalStateException(sbA.toString());
        }
    }

    public final char b0() throws IOException {
        int i10;
        int i11;
        if (this.f33971f == this.f33972g && !i(1)) {
            f0("Unterminated escape sequence");
            throw null;
        }
        char[] cArr = this.f33970e;
        int i12 = this.f33971f;
        int i13 = i12 + 1;
        this.f33971f = i13;
        char c10 = cArr[i12];
        if (c10 == '\n') {
            this.f33973h++;
            this.f33974i = i13;
        } else if (c10 != '\"' && c10 != '\'' && c10 != '/' && c10 != '\\') {
            if (c10 == 'b') {
                return '\b';
            }
            if (c10 == 'f') {
                return '\f';
            }
            if (c10 == 'n') {
                return '\n';
            }
            if (c10 == 'r') {
                return '\r';
            }
            if (c10 == 't') {
                return '\t';
            }
            if (c10 != 'u') {
                f0("Invalid escape sequence");
                throw null;
            }
            if (i13 + 4 > this.f33972g && !i(4)) {
                f0("Unterminated escape sequence");
                throw null;
            }
            char c11 = 0;
            int i14 = this.f33971f;
            int i15 = i14 + 4;
            while (i14 < i15) {
                char c12 = this.f33970e[i14];
                char c13 = (char) (c11 << 4);
                if (c12 < '0' || c12 > '9') {
                    if (c12 >= 'a' && c12 <= 'f') {
                        i10 = c12 - 'a';
                    } else {
                        if (c12 < 'A' || c12 > 'F') {
                            StringBuilder sbA = defpackage.a.a("\\u");
                            sbA.append(new String(this.f33970e, this.f33971f, 4));
                            throw new NumberFormatException(sbA.toString());
                        }
                        i10 = c12 - 'A';
                    }
                    i11 = i10 + 10;
                } else {
                    i11 = c12 - '0';
                }
                c11 = (char) (i11 + c13);
                i14++;
            }
            this.f33971f += 4;
            return c11;
        }
        return c10;
    }

    public final void c() throws IOException {
        if (this.f33969d) {
            return;
        }
        f0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public final void c0(char c10) throws IOException {
        char[] cArr = this.f33970e;
        while (true) {
            int i10 = this.f33971f;
            int i11 = this.f33972g;
            while (true) {
                if (i10 >= i11) {
                    this.f33971f = i10;
                    if (i(1)) {
                        break;
                    }
                    f0("Unterminated string");
                    throw null;
                }
                int i12 = i10 + 1;
                char c11 = cArr[i10];
                if (c11 == c10) {
                    this.f33971f = i12;
                    return;
                }
                if (c11 == '\\') {
                    this.f33971f = i12;
                    b0();
                    break;
                } else {
                    if (c11 == '\n') {
                        this.f33973h++;
                        this.f33974i = i12;
                    }
                    i10 = i12;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f33975j = 0;
        this.f33979n[0] = 8;
        this.f33980o = 1;
        this.f33968c.close();
    }

    public final void d0() throws IOException {
        char c10;
        do {
            if (this.f33971f >= this.f33972g && !i(1)) {
                return;
            }
            char[] cArr = this.f33970e;
            int i10 = this.f33971f;
            int i11 = i10 + 1;
            this.f33971f = i11;
            c10 = cArr[i10];
            if (c10 == '\n') {
                this.f33973h++;
                this.f33974i = i11;
                return;
            }
        } while (c10 != '\r');
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0174 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:109:0x0175  */
    /* JADX WARN: Code duplicated, block: B:112:0x0187  */
    /* JADX WARN: Code duplicated, block: B:115:0x018d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0199  */
    /* JADX WARN: Code duplicated, block: B:119:0x019d A[PHI: r2 r3
  0x019d: PHI (r2v38 int) = (r2v37 int), (r2v43 int) binds: [B:111:0x0185, B:118:0x0199] A[DONT_GENERATE, DONT_INLINE]
  0x019d: PHI (r3v7 int) = (r3v6 int), (r3v8 int) binds: [B:111:0x0185, B:118:0x0199] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:121:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:165:0x0214 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:176:0x0233 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:177:0x0235  */
    /* JADX WARN: Code duplicated, block: B:192:0x0257  */
    /* JADX WARN: Code duplicated, block: B:194:0x025c  */
    /* JADX WARN: Code duplicated, block: B:197:0x0261  */
    /* JADX WARN: Code duplicated, block: B:199:0x0265  */
    /* JADX WARN: Code duplicated, block: B:203:0x026f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:204:0x0270  */
    /* JADX WARN: Code duplicated, block: B:206:0x027c  */
    /* JADX WARN: Code duplicated, block: B:207:0x0283  */
    /* JADX WARN: Code duplicated, block: B:265:0x018a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x018a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    public int e() throws IOException {
        ?? r10;
        int i10;
        int i11;
        String str;
        String str2;
        int i12;
        char c10;
        char[] cArr;
        int i13;
        int i14;
        int i15;
        char c11;
        char c12;
        int i16;
        char c13;
        int i17;
        int i18;
        int i19;
        int[] iArr = this.f33979n;
        int i20 = this.f33980o;
        int i21 = iArr[i20 - 1];
        boolean z10 = true;
        if (i21 == 1) {
            iArr[i20 - 1] = 2;
        } else {
            if (i21 != 2) {
                if (i21 == 3 || i21 == 5) {
                    iArr[i20 - 1] = 4;
                    if (i21 == 5) {
                        int iK = K(true);
                        if (iK != 44) {
                            if (iK != 59) {
                                if (iK == 125) {
                                    this.f33975j = 2;
                                    return 2;
                                }
                                f0("Unterminated object");
                                throw null;
                            }
                            c();
                        }
                        r10 = 1;
                    } else {
                        r10 = 1;
                    }
                    int iK2 = K(r10);
                    if (iK2 == 34) {
                        i10 = 13;
                    } else if (iK2 == 39) {
                        c();
                        i10 = 12;
                    } else {
                        if (iK2 == 125) {
                            if (i21 != 5) {
                                this.f33975j = 2;
                                return 2;
                            }
                            f0("Expected name");
                            throw null;
                        }
                        c();
                        this.f33971f -= r10;
                        if (!l((char) iK2)) {
                            f0("Expected name");
                            throw null;
                        }
                        i10 = 14;
                    }
                } else if (i21 == 4) {
                    iArr[i20 - 1] = 5;
                    int iK3 = K(true);
                    if (iK3 != 58) {
                        if (iK3 != 61) {
                            f0("Expected ':'");
                            throw null;
                        }
                        c();
                        if (this.f33971f < this.f33972g || i(1)) {
                            char[] cArr2 = this.f33970e;
                            int i22 = this.f33971f;
                            if (cArr2[i22] == '>') {
                                this.f33971f = i22 + 1;
                            }
                        }
                    }
                } else if (i21 == 6) {
                    if (this.f33969d) {
                        K(true);
                        int i23 = this.f33971f - 1;
                        this.f33971f = i23;
                        char[] cArr3 = f33967r;
                        if (i23 + cArr3.length <= this.f33972g || i(cArr3.length)) {
                            int i24 = 0;
                            while (true) {
                                char[] cArr4 = f33967r;
                                if (i24 >= cArr4.length) {
                                    this.f33971f += cArr4.length;
                                    break;
                                }
                                if (this.f33970e[this.f33971f + i24] != cArr4[i24]) {
                                    break;
                                }
                                i24++;
                            }
                        }
                    }
                    this.f33979n[this.f33980o - 1] = 7;
                } else if (i21 == 7) {
                    if (K(false) == -1) {
                        i10 = 17;
                    } else {
                        c();
                        this.f33971f--;
                    }
                } else if (i21 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                this.f33975j = i10;
                return i10;
            }
            int iK4 = K(true);
            if (iK4 != 44) {
                if (iK4 != 59) {
                    if (iK4 == 93) {
                        this.f33975j = 4;
                        return 4;
                    }
                    f0("Unterminated array");
                    throw null;
                }
                c();
            }
        }
        int iK5 = K(true);
        if (iK5 == 34) {
            i10 = 9;
        } else if (iK5 != 39) {
            if (iK5 == 44 || iK5 == 59) {
                i11 = 1;
            } else {
                if (iK5 == 91) {
                    this.f33975j = 3;
                    return 3;
                }
                if (iK5 == 93) {
                    i11 = 1;
                    if (i21 == 1) {
                        this.f33975j = 4;
                        return 4;
                    }
                } else if (iK5 != 123) {
                    int i25 = this.f33971f - 1;
                    this.f33971f = i25;
                    char c14 = this.f33970e[i25];
                    if (c14 == 't' || c14 == 'T') {
                        str = "true";
                        str2 = "TRUE";
                        i12 = 5;
                    } else if (c14 == 'f' || c14 == 'F') {
                        str = "false";
                        str2 = "FALSE";
                        i12 = 6;
                    } else {
                        if (c14 != 'n' && c14 != 'N') {
                            i12 = 0;
                            break;
                        }
                        str = "null";
                        str2 = ActionConst.NULL;
                        i12 = 7;
                        if (i12 != 0) {
                            return i12;
                        }
                        cArr = this.f33970e;
                        i13 = this.f33971f;
                        i14 = this.f33972g;
                        boolean z11 = true;
                        i15 = 0;
                        c11 = 0;
                        boolean z12 = false;
                        long j10 = 0;
                        while (true) {
                            if (i13 + i15 != i14) {
                                c12 = cArr[i13 + i15];
                                if (c12 == '+') {
                                    if (c12 != 'E' || c12 == 'e') {
                                        i16 = i15;
                                        if (c11 != 2 || c11 == 4) {
                                            c11 = 5;
                                            i15 = i16 + 1;
                                            z10 = true;
                                        }
                                    } else if (c12 == '-') {
                                        i16 = i15;
                                        c13 = 6;
                                        if (c11 == 0) {
                                            c11 = 1;
                                            z12 = true;
                                        } else {
                                            if (c11 != 5) {
                                            }
                                            c11 = c13;
                                        }
                                        i15 = i16 + 1;
                                        z10 = true;
                                    } else if (c12 == '.') {
                                        i16 = i15;
                                        if (c11 == 2) {
                                            c13 = 3;
                                            c11 = c13;
                                            i15 = i16 + 1;
                                            z10 = true;
                                        }
                                    } else if (c12 >= '0' && c12 <= '9') {
                                        if (c11 == z10 || c11 == 0) {
                                            i17 = i15;
                                            j10 = -(c12 - '0');
                                            c11 = 2;
                                        } else if (c11 != 2) {
                                            i17 = i15;
                                            if (c11 == 3) {
                                                c11 = 4;
                                            } else if (c11 == 5 || c11 == 6) {
                                                c11 = 7;
                                            }
                                        } else if (j10 != 0) {
                                            i17 = i15;
                                            long j11 = (10 * j10) - ((long) (c12 - '0'));
                                            z11 &= j10 > -922337203685477580L || (j10 == -922337203685477580L && j11 < j10);
                                            j10 = j11;
                                        }
                                        i16 = i17;
                                        i15 = i16 + 1;
                                        z10 = true;
                                    } else if (!l(c12)) {
                                        if (c11 != 2 && z11 && ((j10 != Long.MIN_VALUE || z12) && (j10 != 0 || !z12))) {
                                            if (!z12) {
                                                j10 = -j10;
                                            }
                                            this.f33976k = j10;
                                            this.f33971f += i15;
                                            i19 = 15;
                                        } else if (c11 != 2 || c11 == 4 || c11 == 7) {
                                            this.f33977l = i15;
                                            i19 = 16;
                                        }
                                        i18 = i19;
                                        this.f33975j = i18;
                                    }
                                    if (i18 != 0) {
                                        return i18;
                                    }
                                    if (!l(this.f33970e[this.f33971f])) {
                                        f0("Expected value");
                                        throw null;
                                    }
                                    c();
                                    i10 = 10;
                                } else {
                                    i16 = i15;
                                    if (c11 == 5) {
                                        c13 = 6;
                                        c11 = c13;
                                        i15 = i16 + 1;
                                        z10 = true;
                                    }
                                }
                            } else if (i15 != cArr.length) {
                                if (!i(i15 + 1)) {
                                    i13 = this.f33971f;
                                    i14 = this.f33972g;
                                    c12 = cArr[i13 + i15];
                                    if (c12 == '+') {
                                        i16 = i15;
                                        if (c11 == 5) {
                                            c13 = 6;
                                            c11 = c13;
                                            i15 = i16 + 1;
                                            z10 = true;
                                        }
                                    } else if (c12 != 'E') {
                                        i16 = i15;
                                        if (c11 != 2) {
                                        }
                                        c11 = 5;
                                        i15 = i16 + 1;
                                        z10 = true;
                                    } else {
                                        i16 = i15;
                                        if (c11 != 2) {
                                        }
                                        c11 = 5;
                                        i15 = i16 + 1;
                                        z10 = true;
                                    }
                                }
                                if (c11 != 2) {
                                    if (c11 != 2) {
                                    }
                                    this.f33977l = i15;
                                    i19 = 16;
                                } else {
                                    if (c11 != 2) {
                                    }
                                    this.f33977l = i15;
                                    i19 = 16;
                                }
                                i18 = i19;
                                this.f33975j = i18;
                                if (i18 != 0) {
                                    return i18;
                                }
                                if (!l(this.f33970e[this.f33971f])) {
                                    f0("Expected value");
                                    throw null;
                                }
                                c();
                                i10 = 10;
                            }
                            i18 = 0;
                            if (i18 != 0) {
                                return i18;
                            }
                            if (!l(this.f33970e[this.f33971f])) {
                                f0("Expected value");
                                throw null;
                            }
                            c();
                            i10 = 10;
                        }
                    }
                    int length = str.length();
                    int i26 = 1;
                    while (true) {
                        if (i26 >= length) {
                            if ((this.f33971f + length >= this.f33972g && !i(length + 1)) || !l(this.f33970e[this.f33971f + length])) {
                                this.f33971f += length;
                                this.f33975j = i12;
                                break;
                            }
                            break;
                        }
                        if ((this.f33971f + i26 < this.f33972g || i(i26 + 1)) && ((c10 = this.f33970e[this.f33971f + i26]) == str.charAt(i26) || c10 == str2.charAt(i26))) {
                            i26++;
                        }
                        i12 = 0;
                        break;
                    }
                    if (i12 != 0) {
                        return i12;
                    }
                    cArr = this.f33970e;
                    i13 = this.f33971f;
                    i14 = this.f33972g;
                    boolean z13 = true;
                    i15 = 0;
                    c11 = 0;
                    boolean z14 = false;
                    long j12 = 0;
                    while (true) {
                        if (i13 + i15 != i14) {
                            c12 = cArr[i13 + i15];
                            if (c12 == '+') {
                                i16 = i15;
                                if (c11 == 5) {
                                    c13 = 6;
                                    c11 = c13;
                                    i15 = i16 + 1;
                                    z10 = true;
                                }
                            } else if (c12 != 'E') {
                                i16 = i15;
                                if (c11 != 2) {
                                }
                                c11 = 5;
                                i15 = i16 + 1;
                                z10 = true;
                            } else {
                                i16 = i15;
                                if (c11 != 2) {
                                }
                                c11 = 5;
                                i15 = i16 + 1;
                                z10 = true;
                            }
                        } else if (i15 != cArr.length) {
                            if (!i(i15 + 1)) {
                                i13 = this.f33971f;
                                i14 = this.f33972g;
                                c12 = cArr[i13 + i15];
                                if (c12 == '+') {
                                    i16 = i15;
                                    if (c11 == 5) {
                                        c13 = 6;
                                        c11 = c13;
                                        i15 = i16 + 1;
                                        z10 = true;
                                    }
                                } else if (c12 != 'E') {
                                    i16 = i15;
                                    if (c11 != 2) {
                                    }
                                    c11 = 5;
                                    i15 = i16 + 1;
                                    z10 = true;
                                } else {
                                    i16 = i15;
                                    if (c11 != 2) {
                                    }
                                    c11 = 5;
                                    i15 = i16 + 1;
                                    z10 = true;
                                }
                            }
                            if (c11 != 2) {
                                if (c11 != 2) {
                                }
                                this.f33977l = i15;
                                i19 = 16;
                            } else {
                                if (c11 != 2) {
                                }
                                this.f33977l = i15;
                                i19 = 16;
                            }
                            i18 = i19;
                            this.f33975j = i18;
                            if (i18 != 0) {
                                return i18;
                            }
                            if (!l(this.f33970e[this.f33971f])) {
                                f0("Expected value");
                                throw null;
                            }
                            c();
                            i10 = 10;
                        }
                        i18 = 0;
                        if (i18 != 0) {
                            return i18;
                        }
                        if (!l(this.f33970e[this.f33971f])) {
                            f0("Expected value");
                            throw null;
                        }
                        c();
                        i10 = 10;
                    }
                } else {
                    i10 = 1;
                }
            }
            if (i21 != i11 && i21 != 2) {
                f0("Unexpected value");
                throw null;
            }
            c();
            this.f33971f -= i11;
            i10 = 7;
        } else {
            c();
            i10 = 8;
        }
        this.f33975j = i10;
        return i10;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:61:0x0093. Please report as an issue. */
    public void e0() throws IOException {
        char c10;
        int i10 = 0;
        do {
            int iE = this.f33975j;
            if (iE == 0) {
                iE = e();
            }
            if (iE == 3) {
                Y(1);
            } else {
                if (iE == 1) {
                    Y(3);
                } else if (iE == 4 || iE == 2) {
                    this.f33980o--;
                    i10--;
                } else if (iE == 14 || iE == 10) {
                    while (true) {
                        int i11 = 0;
                        while (true) {
                            int i12 = this.f33971f + i11;
                            if (i12 < this.f33972g) {
                                char c11 = this.f33970e[i12];
                                if (c11 != '\t' && c11 != '\n' && c11 != '\f' && c11 != '\r' && c11 != ' ') {
                                    if (c11 != '#') {
                                        if (c11 != ',') {
                                            if (c11 != '/' && c11 != '=') {
                                                if (c11 != '{' && c11 != '}' && c11 != ':') {
                                                    if (c11 != ';') {
                                                        switch (c11) {
                                                            case '[':
                                                            case ']':
                                                                break;
                                                            case '\\':
                                                                break;
                                                            default:
                                                                i11++;
                                                                break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    c();
                                }
                                this.f33971f += i11;
                            } else {
                                this.f33971f = i12;
                                if (!i(1)) {
                                }
                            }
                        }
                    }
                } else {
                    if (iE == 8 || iE == 12) {
                        c10 = CoreConstants.SINGLE_QUOTE_CHAR;
                    } else if (iE == 9 || iE == 13) {
                        c10 = CoreConstants.DOUBLE_QUOTE_CHAR;
                    } else if (iE == 16) {
                        this.f33971f += this.f33977l;
                    }
                    c0(c10);
                }
                this.f33975j = 0;
            }
            i10++;
            this.f33975j = 0;
        } while (i10 != 0);
        int[] iArr = this.f33982q;
        int i13 = this.f33980o;
        int i14 = i13 - 1;
        iArr[i14] = iArr[i14] + 1;
        this.f33981p[i13 - 1] = "null";
    }

    public final IOException f0(String str) throws IOException {
        StringBuilder sbA = defpackage.a.a(str);
        sbA.append(m());
        throw new d(sbA.toString());
    }

    public void g() throws IOException {
        int iE = this.f33975j;
        if (iE == 0) {
            iE = e();
        }
        if (iE != 4) {
            StringBuilder sbA = defpackage.a.a("Expected END_ARRAY but was ");
            sbA.append(V());
            sbA.append(m());
            throw new IllegalStateException(sbA.toString());
        }
        int i10 = this.f33980o - 1;
        this.f33980o = i10;
        int[] iArr = this.f33982q;
        int i11 = i10 - 1;
        iArr[i11] = iArr[i11] + 1;
        this.f33975j = 0;
    }

    public void h() throws IOException {
        int iE = this.f33975j;
        if (iE == 0) {
            iE = e();
        }
        if (iE != 2) {
            StringBuilder sbA = defpackage.a.a("Expected END_OBJECT but was ");
            sbA.append(V());
            sbA.append(m());
            throw new IllegalStateException(sbA.toString());
        }
        int i10 = this.f33980o - 1;
        this.f33980o = i10;
        this.f33981p[i10] = null;
        int[] iArr = this.f33982q;
        int i11 = i10 - 1;
        iArr[i11] = iArr[i11] + 1;
        this.f33975j = 0;
    }

    public final boolean i(int i10) throws IOException {
        int i11;
        int i12;
        char[] cArr = this.f33970e;
        int i13 = this.f33974i;
        int i14 = this.f33971f;
        this.f33974i = i13 - i14;
        int i15 = this.f33972g;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f33972g = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f33972g = 0;
        }
        this.f33971f = 0;
        do {
            Reader reader = this.f33968c;
            int i17 = this.f33972g;
            int i18 = reader.read(cArr, i17, cArr.length - i17);
            if (i18 == -1) {
                return false;
            }
            i11 = this.f33972g + i18;
            this.f33972g = i11;
            if (this.f33973h == 0 && (i12 = this.f33974i) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f33971f++;
                this.f33974i = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    public String j() {
        StringBuilder sbA = o2.b.a(CoreConstants.DOLLAR);
        int i10 = this.f33980o;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f33979n[i11];
            if (i12 == 1 || i12 == 2) {
                sbA.append('[');
                sbA.append(this.f33982q[i11]);
                sbA.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sbA.append(CoreConstants.DOT);
                String[] strArr = this.f33981p;
                if (strArr[i11] != null) {
                    sbA.append(strArr[i11]);
                }
            }
        }
        return sbA.toString();
    }

    public boolean k() throws IOException {
        int iE = this.f33975j;
        if (iE == 0) {
            iE = e();
        }
        return (iE == 2 || iE == 4) ? false : true;
    }

    public final boolean l(char c10) throws IOException {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        c();
        return false;
    }

    public String m() {
        StringBuilder sbA = o.a(" at line ", this.f33973h + 1, " column ", (this.f33971f - this.f33974i) + 1, " path ");
        sbA.append(j());
        return sbA.toString();
    }

    public boolean n() throws IOException {
        int iE = this.f33975j;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 5) {
            this.f33975j = 0;
            int[] iArr = this.f33982q;
            int i10 = this.f33980o - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iE != 6) {
            StringBuilder sbA = defpackage.a.a("Expected a boolean but was ");
            sbA.append(V());
            sbA.append(m());
            throw new IllegalStateException(sbA.toString());
        }
        this.f33975j = 0;
        int[] iArr2 = this.f33982q;
        int i11 = this.f33980o - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return false;
    }

    public double p() throws IOException {
        String strP;
        int iE = this.f33975j;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 15) {
            this.f33975j = 0;
            int[] iArr = this.f33982q;
            int i10 = this.f33980o - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f33976k;
        }
        if (iE == 16) {
            this.f33978m = new String(this.f33970e, this.f33971f, this.f33977l);
            this.f33971f += this.f33977l;
        } else {
            if (iE == 8 || iE == 9) {
                strP = P(iE == 8 ? CoreConstants.SINGLE_QUOTE_CHAR : CoreConstants.DOUBLE_QUOTE_CHAR);
            } else if (iE == 10) {
                strP = T();
            } else if (iE != 11) {
                StringBuilder sbA = defpackage.a.a("Expected a double but was ");
                sbA.append(V());
                sbA.append(m());
                throw new IllegalStateException(sbA.toString());
            }
            this.f33978m = strP;
        }
        this.f33975j = 11;
        double d10 = Double.parseDouble(this.f33978m);
        if (!this.f33969d && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new d("JSON forbids NaN and infinities: " + d10 + m());
        }
        this.f33978m = null;
        this.f33975j = 0;
        int[] iArr2 = this.f33982q;
        int i11 = this.f33980o - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return d10;
    }

    public int q() throws IOException {
        String strP;
        int iE = this.f33975j;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 15) {
            long j10 = this.f33976k;
            int i10 = (int) j10;
            if (j10 != i10) {
                StringBuilder sbA = defpackage.a.a("Expected an int but was ");
                sbA.append(this.f33976k);
                sbA.append(m());
                throw new NumberFormatException(sbA.toString());
            }
            this.f33975j = 0;
            int[] iArr = this.f33982q;
            int i11 = this.f33980o - 1;
            iArr[i11] = iArr[i11] + 1;
            return i10;
        }
        if (iE == 16) {
            this.f33978m = new String(this.f33970e, this.f33971f, this.f33977l);
            this.f33971f += this.f33977l;
        } else {
            if (iE != 8 && iE != 9 && iE != 10) {
                StringBuilder sbA2 = defpackage.a.a("Expected an int but was ");
                sbA2.append(V());
                sbA2.append(m());
                throw new IllegalStateException(sbA2.toString());
            }
            if (iE == 10) {
                strP = T();
            } else {
                strP = P(iE == 8 ? CoreConstants.SINGLE_QUOTE_CHAR : CoreConstants.DOUBLE_QUOTE_CHAR);
            }
            this.f33978m = strP;
            try {
                int i12 = Integer.parseInt(this.f33978m);
                this.f33975j = 0;
                int[] iArr2 = this.f33982q;
                int i13 = this.f33980o - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        }
        this.f33975j = 11;
        double d10 = Double.parseDouble(this.f33978m);
        int i14 = (int) d10;
        if (i14 != d10) {
            StringBuilder sbA3 = defpackage.a.a("Expected an int but was ");
            sbA3.append(this.f33978m);
            sbA3.append(m());
            throw new NumberFormatException(sbA3.toString());
        }
        this.f33978m = null;
        this.f33975j = 0;
        int[] iArr3 = this.f33982q;
        int i15 = this.f33980o - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return i14;
    }

    public String toString() {
        return getClass().getSimpleName() + m();
    }
}
