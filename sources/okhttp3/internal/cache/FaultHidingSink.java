package okhttp3.internal.cache;

import fd.j0;
import java.io.EOFException;
import java.io.IOException;
import jc.w;
import qd.c;
import qd.i;
import qd.y;
import uc.l;

/* JADX INFO: loaded from: classes3.dex */
public class FaultHidingSink extends i {
    private boolean hasErrors;
    private final l<IOException, w> onException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FaultHidingSink(y yVar, l<? super IOException, w> lVar) {
        super(yVar);
        j0.i(yVar, "delegate");
        j0.i(lVar, "onException");
        this.onException = lVar;
    }

    @Override // qd.i, qd.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e10) {
            this.hasErrors = true;
            this.onException.invoke(e10);
        }
    }

    @Override // qd.i, qd.y, java.io.Flushable
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e10) {
            this.hasErrors = true;
            this.onException.invoke(e10);
        }
    }

    public final l<IOException, w> getOnException() {
        return this.onException;
    }

    @Override // qd.i, qd.y
    public void write(c cVar, long j10) throws EOFException {
        j0.i(cVar, "source");
        if (this.hasErrors) {
            cVar.skip(j10);
            return;
        }
        try {
            super.write(cVar, j10);
        } catch (IOException e10) {
            this.hasErrors = true;
            this.onException.invoke(e10);
        }
    }
}
