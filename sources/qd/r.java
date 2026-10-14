package qd;

import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OutputStream f34916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f34917d;

    public r(OutputStream outputStream, b0 b0Var) {
        j0.i(outputStream, "out");
        j0.i(b0Var, "timeout");
        this.f34916c = outputStream;
        this.f34917d = b0Var;
    }

    @Override // qd.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f34916c.close();
    }

    @Override // qd.y, java.io.Flushable
    public void flush() throws IOException {
        this.f34916c.flush();
    }

    @Override // qd.y
    public b0 timeout() {
        return this.f34917d;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("sink(");
        sbA.append(this.f34916c);
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sbA.toString();
    }

    @Override // qd.y
    public void write(c cVar, long j10) throws IOException {
        j0.i(cVar, "source");
        d0.b(cVar.f34879d, 0L, j10);
        while (j10 > 0) {
            this.f34917d.throwIfReached();
            v vVar = cVar.f34878c;
            j0.f(vVar);
            int iMin = (int) Math.min(j10, vVar.f34933c - vVar.f34932b);
            this.f34916c.write(vVar.f34931a, vVar.f34932b, iMin);
            int i10 = vVar.f34932b + iMin;
            vVar.f34932b = i10;
            long j11 = iMin;
            j10 -= j11;
            cVar.f34879d -= j11;
            if (i10 == vVar.f34933c) {
                cVar.f34878c = vVar.a();
                w.b(vVar);
            }
        }
    }
}
