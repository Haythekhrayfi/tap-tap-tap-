package qd;

import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.FileAppender;
import fd.j0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f34927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f34928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f34929e;

    public u(a0 a0Var) {
        j0.i(a0Var, "source");
        this.f34927c = a0Var;
        this.f34928d = new c();
    }

    @Override // qd.f
    public long B() throws EOFException {
        U(1L);
        long j10 = 0;
        while (true) {
            long j11 = j10 + 1;
            if (!request(j11)) {
                break;
            }
            byte bG = this.f34928d.g(j10);
            if ((bG < ((byte) 48) || bG > ((byte) 57)) && !(j10 == 0 && bG == ((byte) 45))) {
                if (j10 != 0) {
                    break;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Expected a digit or '-' but was 0x");
                ed.a.a(16);
                ed.a.a(16);
                String string = Integer.toString(bG, 16);
                j0.h(string, "toString(this, checkRadix(radix))");
                sb2.append(string);
                throw new NumberFormatException(sb2.toString());
            }
            j10 = j11;
        }
        return this.f34928d.B();
    }

    @Override // qd.f
    public String D(long j10) throws EOFException {
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(androidx.viewpager2.adapter.a.a("limit < 0: ", j10).toString());
        }
        long j11 = j10 == RecyclerView.FOREVER_NS ? Long.MAX_VALUE : j10 + 1;
        byte b10 = (byte) 10;
        long jA = a(b10, 0L, j11);
        if (jA != -1) {
            return rd.a.b(this.f34928d, jA);
        }
        if (j11 < RecyclerView.FOREVER_NS && request(j11) && this.f34928d.g(j11 - 1) == ((byte) 13) && request(1 + j11) && this.f34928d.g(j11) == b10) {
            return rd.a.b(this.f34928d, j11);
        }
        c cVar = new c();
        c cVar2 = this.f34928d;
        cVar2.e(cVar, 0L, Math.min(32, cVar2.f34879d));
        StringBuilder sbA = defpackage.a.a("\\n not found: limit=");
        sbA.append(Math.min(this.f34928d.f34879d, j10));
        sbA.append(" content=");
        sbA.append(cVar.I().d());
        sbA.append((char) 8230);
        throw new EOFException(sbA.toString());
    }

    @Override // qd.f
    public String F(Charset charset) throws IOException {
        j0.i(charset, "charset");
        this.f34928d.v(this.f34927c);
        return this.f34928d.F(charset);
    }

    @Override // qd.f
    public boolean G(long j10, g gVar) {
        j0.i(gVar, "bytes");
        int iC = gVar.c();
        j0.i(gVar, "bytes");
        if (!(!this.f34929e)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j10 >= 0 && iC >= 0 && gVar.c() - 0 >= iC) {
            for (int i10 = 0; i10 < iC; i10++) {
                long j11 = ((long) i10) + j10;
                if (request(1 + j11) && this.f34928d.g(j11) == gVar.f(0 + i10)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // qd.f
    public g I() throws IOException {
        this.f34928d.v(this.f34927c);
        return this.f34928d.I();
    }

    @Override // qd.f
    public void L(c cVar, long j10) throws IOException {
        j0.i(cVar, "sink");
        try {
            if (!request(j10)) {
                throw new EOFException();
            }
            this.f34928d.L(cVar, j10);
        } catch (EOFException e10) {
            cVar.v(this.f34928d);
            throw e10;
        }
    }

    @Override // qd.f
    public String M() {
        return D(RecyclerView.FOREVER_NS);
    }

    @Override // qd.f
    public void U(long j10) throws EOFException {
        if (!request(j10)) {
            throw new EOFException();
        }
    }

    @Override // qd.f
    public int W(q qVar) throws EOFException {
        j0.i(qVar, "options");
        if (!(!this.f34929e)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            int iC = rd.a.c(this.f34928d, qVar, true);
            if (iC != -2) {
                if (iC == -1) {
                    break;
                }
                this.f34928d.skip(qVar.f34914d[iC].c());
                return iC;
            }
        } while (this.f34927c.read(this.f34928d, FileAppender.DEFAULT_BUFFER_SIZE) != -1);
        return -1;
    }

    @Override // qd.f
    public long Z() throws EOFException {
        U(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!request(i11)) {
                break;
            }
            byte bG = this.f34928d.g(i10);
            if ((bG < ((byte) 48) || bG > ((byte) 57)) && ((bG < ((byte) 97) || bG > ((byte) 102)) && (bG < ((byte) 65) || bG > ((byte) 70)))) {
                if (i10 != 0) {
                    break;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Expected leading [0-9a-fA-F] character but was 0x");
                ed.a.a(16);
                ed.a.a(16);
                String string = Integer.toString(bG, 16);
                j0.h(string, "toString(this, checkRadix(radix))");
                sb2.append(string);
                throw new NumberFormatException(sb2.toString());
            }
            i10 = i11;
        }
        return this.f34928d.Z();
    }

    public long a(byte b10, long j10, long j11) {
        if (!(!this.f34929e)) {
            throw new IllegalStateException("closed".toString());
        }
        if (!(0 <= j10 && j10 <= j11)) {
            StringBuilder sbA = i2.a.a("fromIndex=", j10, " toIndex=");
            sbA.append(j11);
            throw new IllegalArgumentException(sbA.toString().toString());
        }
        while (j10 < j11) {
            long jH = this.f34928d.h(b10, j10, j11);
            if (jH != -1) {
                return jH;
            }
            c cVar = this.f34928d;
            long j12 = cVar.f34879d;
            if (j12 >= j11 || this.f34927c.read(cVar, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, j12);
        }
        return -1L;
    }

    @Override // qd.f
    public InputStream a0() {
        return new a();
    }

    public byte[] b(long j10) throws EOFException {
        if (request(j10)) {
            return this.f34928d.k(j10);
        }
        throw new EOFException();
    }

    public int c() throws EOFException {
        U(4L);
        int i10 = this.f34928d.readInt();
        c.a aVar = d0.f34890a;
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    @Override // qd.a0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f34929e) {
            return;
        }
        this.f34929e = true;
        this.f34927c.close();
        c cVar = this.f34928d;
        cVar.skip(cVar.f34879d);
    }

    @Override // qd.f
    public g d(long j10) throws EOFException {
        if (request(j10)) {
            return this.f34928d.d(j10);
        }
        throw new EOFException();
    }

    @Override // qd.f
    public long f(y yVar) {
        long j10 = 0;
        while (this.f34927c.read(this.f34928d, FileAppender.DEFAULT_BUFFER_SIZE) != -1) {
            long jC = this.f34928d.c();
            if (jC > 0) {
                j10 += jC;
                ((c) yVar).write(this.f34928d, jC);
            }
        }
        c cVar = this.f34928d;
        long j11 = cVar.f34879d;
        if (j11 <= 0) {
            return j10;
        }
        long j12 = j10 + j11;
        ((c) yVar).write(cVar, j11);
        return j12;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f34929e;
    }

    @Override // qd.f
    public f peek() {
        return o.c(new s(this));
    }

    @Override // qd.f, qd.e
    public c r() {
        return this.f34928d;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        j0.i(byteBuffer, "sink");
        c cVar = this.f34928d;
        if (cVar.f34879d == 0 && this.f34927c.read(cVar, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
            return -1;
        }
        return this.f34928d.read(byteBuffer);
    }

    @Override // qd.f
    public byte readByte() throws EOFException {
        U(1L);
        return this.f34928d.readByte();
    }

    @Override // qd.f
    public void readFully(byte[] bArr) throws EOFException {
        try {
            U(bArr.length);
            this.f34928d.readFully(bArr);
        } catch (EOFException e10) {
            int i10 = 0;
            while (true) {
                c cVar = this.f34928d;
                long j10 = cVar.f34879d;
                if (j10 <= 0) {
                    throw e10;
                }
                int i11 = cVar.read(bArr, i10, (int) j10);
                if (i11 == -1) {
                    throw new AssertionError();
                }
                i10 += i11;
            }
        }
    }

    @Override // qd.f
    public int readInt() throws EOFException {
        U(4L);
        return this.f34928d.readInt();
    }

    @Override // qd.f
    public long readLong() throws EOFException {
        U(8L);
        return this.f34928d.readLong();
    }

    @Override // qd.f
    public short readShort() throws EOFException {
        U(2L);
        return this.f34928d.readShort();
    }

    @Override // qd.f
    public boolean request(long j10) {
        c cVar;
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(androidx.viewpager2.adapter.a.a("byteCount < 0: ", j10).toString());
        }
        if (!(!this.f34929e)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            cVar = this.f34928d;
            if (cVar.f34879d >= j10) {
                return true;
            }
        } while (this.f34927c.read(cVar, FileAppender.DEFAULT_BUFFER_SIZE) != -1);
        return false;
    }

    @Override // qd.f
    public void skip(long j10) throws EOFException {
        if (!(!this.f34929e)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j10 > 0) {
            c cVar = this.f34928d;
            if (cVar.f34879d == 0 && this.f34927c.read(cVar, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j10, this.f34928d.f34879d);
            this.f34928d.skip(jMin);
            j10 -= jMin;
        }
    }

    @Override // qd.a0
    public b0 timeout() {
        return this.f34927c.timeout();
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("buffer(");
        sbA.append(this.f34927c);
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sbA.toString();
    }

    @Override // qd.f
    public byte[] x() throws IOException {
        this.f34928d.v(this.f34927c);
        return this.f34928d.x();
    }

    @Override // qd.f
    public boolean y() {
        if (!this.f34929e) {
            return this.f34928d.y() && this.f34927c.read(this.f34928d, FileAppender.DEFAULT_BUFFER_SIZE) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            u uVar = u.this;
            if (uVar.f34929e) {
                throw new IOException("closed");
            }
            return (int) Math.min(uVar.f34928d.f34879d, Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            u.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            u uVar = u.this;
            if (uVar.f34929e) {
                throw new IOException("closed");
            }
            c cVar = uVar.f34928d;
            if (cVar.f34879d == 0 && uVar.f34927c.read(cVar, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                return -1;
            }
            return u.this.f34928d.readByte() & 255;
        }

        public String toString() {
            return u.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            j0.i(bArr, "data");
            if (u.this.f34929e) {
                throw new IOException("closed");
            }
            d0.b(bArr.length, i10, i11);
            u uVar = u.this;
            c cVar = uVar.f34928d;
            if (cVar.f34879d == 0 && uVar.f34927c.read(cVar, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                return -1;
            }
            return u.this.f34928d.read(bArr, i10, i11);
        }
    }

    @Override // qd.a0
    public long read(c cVar, long j10) {
        j0.i(cVar, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(androidx.viewpager2.adapter.a.a("byteCount < 0: ", j10).toString());
        }
        if (!(!this.f34929e)) {
            throw new IllegalStateException("closed".toString());
        }
        c cVar2 = this.f34928d;
        if (cVar2.f34879d == 0 && this.f34927c.read(cVar2, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
            return -1L;
        }
        return this.f34928d.read(cVar, Math.min(j10, this.f34928d.f34879d));
    }
}
