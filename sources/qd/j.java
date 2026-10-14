package qd;

import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j implements a0 {
    private final a0 delegate;

    public j(a0 a0Var) {
        j0.i(a0Var, "delegate");
        this.delegate = a0Var;
    }

    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final a0 m142deprecated_delegate() {
        return this.delegate;
    }

    @Override // qd.a0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final a0 delegate() {
        return this.delegate;
    }

    @Override // qd.a0
    public long read(c cVar, long j10) throws IOException {
        j0.i(cVar, "sink");
        return this.delegate.read(cVar, j10);
    }

    @Override // qd.a0
    public b0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + CoreConstants.LEFT_PARENTHESIS_CHAR + this.delegate + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
