package qd;

import fd.j0;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f34906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Inflater f34907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f34909f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(a0 a0Var, Inflater inflater) {
        this(o.c(a0Var), inflater);
        j0.i(a0Var, "source");
        j0.i(inflater, "inflater");
    }

    public m(f fVar, Inflater inflater) {
        j0.i(fVar, "source");
        j0.i(inflater, "inflater");
        this.f34906c = fVar;
        this.f34907d = inflater;
    }

    public final long a(c cVar, long j10) throws IOException {
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(androidx.viewpager2.adapter.a.a("byteCount < 0: ", j10).toString());
        }
        if (!(!this.f34909f)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j10 == 0) {
            return 0L;
        }
        try {
            v vVarJ = cVar.J(1);
            int iMin = (int) Math.min(j10, 8192 - vVarJ.f34933c);
            if (this.f34907d.needsInput() && !this.f34906c.y()) {
                v vVar = this.f34906c.r().f34878c;
                j0.f(vVar);
                int i10 = vVar.f34933c;
                int i11 = vVar.f34932b;
                int i12 = i10 - i11;
                this.f34908e = i12;
                this.f34907d.setInput(vVar.f34931a, i11, i12);
            }
            int iInflate = this.f34907d.inflate(vVarJ.f34931a, vVarJ.f34933c, iMin);
            int i13 = this.f34908e;
            if (i13 != 0) {
                int remaining = i13 - this.f34907d.getRemaining();
                this.f34908e -= remaining;
                this.f34906c.skip(remaining);
            }
            if (iInflate > 0) {
                vVarJ.f34933c += iInflate;
                long j11 = iInflate;
                cVar.f34879d += j11;
                return j11;
            }
            if (vVarJ.f34932b == vVarJ.f34933c) {
                cVar.f34878c = vVarJ.a();
                w.b(vVarJ);
            }
            return 0L;
        } catch (DataFormatException e10) {
            throw new IOException(e10);
        }
    }

    @Override // qd.a0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f34909f) {
            return;
        }
        this.f34907d.end();
        this.f34909f = true;
        this.f34906c.close();
    }

    @Override // qd.a0
    public long read(c cVar, long j10) throws IOException {
        j0.i(cVar, "sink");
        do {
            long jA = a(cVar, j10);
            if (jA > 0) {
                return jA;
            }
            if (this.f34907d.finished() || this.f34907d.needsDictionary()) {
                return -1L;
            }
        } while (!this.f34906c.y());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // qd.a0
    public b0 timeout() {
        return this.f34906c.timeout();
    }
}
