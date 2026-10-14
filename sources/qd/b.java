package qd;

import fd.j0;
import java.io.EOFException;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements y {
    @Override // qd.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // qd.y, java.io.Flushable
    public void flush() {
    }

    @Override // qd.y
    public b0 timeout() {
        return b0.NONE;
    }

    @Override // qd.y
    public void write(c cVar, long j10) throws EOFException {
        j0.i(cVar, "source");
        cVar.skip(j10);
    }
}
