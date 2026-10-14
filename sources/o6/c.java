package o6;

import ch.qos.logback.core.CoreConstants;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class c implements Closeable, Flushable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f33983l = new String[128];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f33984m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Writer f33985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f33986d = new int[32];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f33987e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f33988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f33989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f33990h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f33991i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f33992j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f33993k;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f33983l[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f33983l;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f33984m = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        m(6);
        this.f33989g = ":";
        this.f33993k = true;
        Objects.requireNonNull(writer, "out == null");
        this.f33985c = writer;
    }

    public c C(Boolean bool) throws IOException {
        if (bool == null) {
            return k();
        }
        P();
        a();
        this.f33985c.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c J(Number number) throws IOException {
        if (number == null) {
            return k();
        }
        P();
        String string = number.toString();
        if (this.f33990h || !(string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            a();
            this.f33985c.append((CharSequence) string);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public c K(String str) throws IOException {
        if (str == null) {
            return k();
        }
        P();
        a();
        p(str);
        return this;
    }

    public c O(boolean z10) throws IOException {
        P();
        a();
        this.f33985c.write(z10 ? "true" : "false");
        return this;
    }

    public final void P() throws IOException {
        if (this.f33992j != null) {
            int iL = l();
            if (iL == 5) {
                this.f33985c.write(44);
            } else if (iL != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            j();
            n(4);
            p(this.f33992j);
            this.f33992j = null;
        }
    }

    public final void a() throws IOException {
        int iL = l();
        if (iL == 1) {
            n(2);
        } else {
            if (iL != 2) {
                if (iL == 4) {
                    this.f33985c.append((CharSequence) this.f33989g);
                    n(5);
                    return;
                }
                if (iL != 6) {
                    if (iL != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    if (!this.f33990h) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                }
                n(7);
                return;
            }
            this.f33985c.append(CoreConstants.COMMA_CHAR);
        }
        j();
    }

    public c b() throws IOException {
        P();
        a();
        m(1);
        this.f33985c.write("[");
        return this;
    }

    public c c() throws IOException {
        P();
        a();
        m(3);
        this.f33985c.write("{");
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f33985c.close();
        int i10 = this.f33987e;
        if (i10 > 1 || (i10 == 1 && this.f33986d[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f33987e = 0;
    }

    public final c e(int i10, int i11, String str) throws IOException {
        int iL = l();
        if (iL != i11 && iL != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f33992j != null) {
            StringBuilder sbA = defpackage.a.a("Dangling name: ");
            sbA.append(this.f33992j);
            throw new IllegalStateException(sbA.toString());
        }
        this.f33987e--;
        if (iL == i11) {
            j();
        }
        this.f33985c.write(str);
        return this;
    }

    public void flush() throws IOException {
        if (this.f33987e == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f33985c.flush();
    }

    public c g() throws IOException {
        e(1, 2, "]");
        return this;
    }

    public c h() throws IOException {
        e(3, 5, "}");
        return this;
    }

    public c i(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.f33992j != null) {
            throw new IllegalStateException();
        }
        if (this.f33987e == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f33992j = str;
        return this;
    }

    public final void j() throws IOException {
        if (this.f33988f == null) {
            return;
        }
        this.f33985c.write("\n");
        int i10 = this.f33987e;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f33985c.write(this.f33988f);
        }
    }

    public c k() throws IOException {
        if (this.f33992j != null) {
            if (!this.f33993k) {
                this.f33992j = null;
                return this;
            }
            P();
        }
        a();
        this.f33985c.write("null");
        return this;
    }

    public final int l() {
        int i10 = this.f33987e;
        if (i10 != 0) {
            return this.f33986d[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void m(int i10) {
        int i11 = this.f33987e;
        int[] iArr = this.f33986d;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[i11 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f33986d = iArr2;
        }
        int[] iArr3 = this.f33986d;
        int i12 = this.f33987e;
        this.f33987e = i12 + 1;
        iArr3[i12] = i10;
    }

    public final void n(int i10) {
        this.f33986d[this.f33987e - 1] = i10;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    public final void p(String str) throws IOException {
        String str2;
        String[] strArr = this.f33991i ? f33984m : f33983l;
        this.f33985c.write("\"");
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i10 < i11) {
                        this.f33985c.write(str, i10, i11 - i10);
                    }
                    this.f33985c.write(str2);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                    this.f33985c.write(str, i10, i11 - i10);
                }
                this.f33985c.write(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            this.f33985c.write(str, i10, length - i10);
        }
        this.f33985c.write("\"");
    }

    public c q(long j10) throws IOException {
        P();
        a();
        this.f33985c.write(Long.toString(j10));
        return this;
    }
}
