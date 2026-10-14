package qd;

import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class n implements a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InputStream f34910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f34911d;

    public n(InputStream inputStream, b0 b0Var) {
        j0.i(inputStream, "input");
        j0.i(b0Var, "timeout");
        this.f34910c = inputStream;
        this.f34911d = b0Var;
    }

    @Override // qd.a0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f34910c.close();
    }

    @Override // qd.a0
    public long read(c cVar, long j10) throws IOException {
        j0.i(cVar, "sink");
        if (j10 == 0) {
            return 0L;
        }
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(androidx.viewpager2.adapter.a.a("byteCount < 0: ", j10).toString());
        }
        try {
            this.f34911d.throwIfReached();
            v vVarJ = cVar.J(1);
            int i10 = this.f34910c.read(vVarJ.f34931a, vVarJ.f34933c, (int) Math.min(j10, 8192 - vVarJ.f34933c));
            if (i10 != -1) {
                vVarJ.f34933c += i10;
                long j11 = i10;
                cVar.f34879d += j11;
                return j11;
            }
            if (vVarJ.f34932b != vVarJ.f34933c) {
                return -1L;
            }
            cVar.f34878c = vVarJ.a();
            w.b(vVarJ);
            return -1L;
        } catch (AssertionError e10) {
            if (o.d(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    @Override // qd.a0
    public b0 timeout() {
        return this.f34911d;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("source(");
        sbA.append(this.f34910c);
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sbA.toString();
    }
}
