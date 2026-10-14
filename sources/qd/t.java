package qd;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.FileAppender;
import fd.j0;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f34924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f34925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f34926e;

    public t(y yVar) {
        j0.i(yVar, "sink");
        this.f34924c = yVar;
        this.f34925d = new c();
    }

    @Override // qd.e
    public e A() throws IOException {
        if (!(!this.f34926e)) {
            throw new IllegalStateException("closed".toString());
        }
        long jC = this.f34925d.c();
        if (jC > 0) {
            this.f34924c.write(this.f34925d, jC);
        }
        return this;
    }

    @Override // qd.e
    public e E(String str) throws IOException {
        j0.i(str, "string");
        if (!(!this.f34926e)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f34925d.e0(str);
        A();
        return this;
    }

    @Override // qd.e
    public e H(long j10) throws IOException {
        if (!(!this.f34926e)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f34925d.H(j10);
        A();
        return this;
    }

    @Override // qd.e
    public e Q(byte[] bArr) throws IOException {
        j0.i(bArr, "source");
        if (!(!this.f34926e)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f34925d.O(bArr);
        A();
        return this;
    }

    @Override // qd.e
    public e X(long j10) throws IOException {
        if (!(!this.f34926e)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f34925d.X(j10);
        A();
        return this;
    }

    @Override // qd.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f34926e) {
            return;
        }
        Throwable th = null;
        try {
            c cVar = this.f34925d;
            long j10 = cVar.f34879d;
            if (j10 > 0) {
                this.f34924c.write(cVar, j10);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f34924c.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f34926e = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // qd.e, qd.y, java.io.Flushable
    public void flush() throws IOException {
        if (!(!this.f34926e)) {
            throw new IllegalStateException("closed".toString());
        }
        c cVar = this.f34925d;
        long j10 = cVar.f34879d;
        if (j10 > 0) {
            this.f34924c.write(cVar, j10);
        }
        this.f34924c.flush();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f34926e;
    }

    @Override // qd.e
    public c r() {
        return this.f34925d;
    }

    @Override // qd.e
    public e s() throws IOException {
        if (!(!this.f34926e)) {
            throw new IllegalStateException("closed".toString());
        }
        c cVar = this.f34925d;
        long j10 = cVar.f34879d;
        if (j10 > 0) {
            this.f34924c.write(cVar, j10);
        }
        return this;
    }

    @Override // qd.e
    public e t(int i10) throws IOException {
        if (!(!this.f34926e)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f34925d.c0(i10);
        A();
        return this;
    }

    @Override // qd.y
    public b0 timeout() {
        return this.f34924c.timeout();
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("buffer(");
        sbA.append(this.f34924c);
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sbA.toString();
    }

    @Override // qd.e
    public e u(int i10) throws IOException {
        if (!(!this.f34926e)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f34925d.Y(i10);
        A();
        return this;
    }

    @Override // qd.e
    public long v(a0 a0Var) throws IOException {
        long j10 = 0;
        while (true) {
            long j11 = ((n) a0Var).read(this.f34925d, FileAppender.DEFAULT_BUFFER_SIZE);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
            A();
        }
    }

    @Override // qd.e
    public e w(g gVar) throws IOException {
        j0.i(gVar, "byteString");
        if (!(!this.f34926e)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f34925d.K(gVar);
        A();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        j0.i(byteBuffer, "source");
        if (!(!this.f34926e)) {
            throw new IllegalStateException("closed".toString());
        }
        int iWrite = this.f34925d.write(byteBuffer);
        A();
        return iWrite;
    }

    @Override // qd.e
    public e write(byte[] bArr, int i10, int i11) throws IOException {
        j0.i(bArr, "source");
        if (!(!this.f34926e)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f34925d.P(bArr, i10, i11);
        A();
        return this;
    }

    @Override // qd.y
    public void write(c cVar, long j10) throws IOException {
        j0.i(cVar, "source");
        if (!(!this.f34926e)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f34925d.write(cVar, j10);
        A();
    }

    @Override // qd.e
    public e z(int i10) throws IOException {
        if (!(!this.f34926e)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f34925d.R(i10);
        A();
        return this;
    }
}
