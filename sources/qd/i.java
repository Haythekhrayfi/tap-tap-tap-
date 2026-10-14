package qd;

import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i implements y {
    private final y delegate;

    public i(y yVar) {
        j0.i(yVar, "delegate");
        this.delegate = yVar;
    }

    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final y m141deprecated_delegate() {
        return this.delegate;
    }

    @Override // qd.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final y delegate() {
        return this.delegate;
    }

    @Override // qd.y, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // qd.y
    public b0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + CoreConstants.LEFT_PARENTHESIS_CHAR + this.delegate + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // qd.y
    public void write(c cVar, long j10) throws IOException {
        j0.i(cVar, "source");
        this.delegate.write(cVar, j10);
    }
}
