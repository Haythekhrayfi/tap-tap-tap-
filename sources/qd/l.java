package qd;

import androidx.recyclerview.widget.RecyclerView;
import fd.j0;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f34901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f34902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Inflater f34903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f34904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CRC32 f34905g;

    public l(a0 a0Var) {
        j0.i(a0Var, "source");
        u uVar = new u(a0Var);
        this.f34902d = uVar;
        Inflater inflater = new Inflater(true);
        this.f34903e = inflater;
        this.f34904f = new m((f) uVar, inflater);
        this.f34905g = new CRC32();
    }

    public final void a(String str, int i10, int i11) throws IOException {
        if (i11 == i10) {
            return;
        }
        String str2 = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i10)}, 3));
        j0.h(str2, "format(this, *args)");
        throw new IOException(str2);
    }

    public final void b(c cVar, long j10, long j11) {
        v vVar = cVar.f34878c;
        while (true) {
            j0.f(vVar);
            int i10 = vVar.f34933c;
            int i11 = vVar.f34932b;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= (long) (i10 - i11);
            vVar = vVar.f34936f;
        }
        while (j11 > 0) {
            int i12 = (int) (((long) vVar.f34932b) + j10);
            int iMin = (int) Math.min(vVar.f34933c - i12, j11);
            this.f34905g.update(vVar.f34931a, i12, iMin);
            j11 -= (long) iMin;
            vVar = vVar.f34936f;
            j0.f(vVar);
            j10 = 0;
        }
    }

    @Override // qd.a0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f34904f.close();
    }

    @Override // qd.a0
    public long read(c cVar, long j10) throws IOException {
        j0.i(cVar, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(androidx.viewpager2.adapter.a.a("byteCount < 0: ", j10).toString());
        }
        if (j10 == 0) {
            return 0L;
        }
        if (this.f34901c == 0) {
            this.f34902d.U(10L);
            byte bG = this.f34902d.f34928d.g(3L);
            boolean z10 = ((bG >> 1) & 1) == 1;
            if (z10) {
                b(this.f34902d.f34928d, 0L, 10L);
            }
            a("ID1ID2", 8075, this.f34902d.readShort());
            this.f34902d.skip(8L);
            if (((bG >> 2) & 1) == 1) {
                this.f34902d.U(2L);
                if (z10) {
                    b(this.f34902d.f34928d, 0L, 2L);
                }
                long jL = this.f34902d.f34928d.l();
                this.f34902d.U(jL);
                if (z10) {
                    b(this.f34902d.f34928d, 0L, jL);
                }
                this.f34902d.skip(jL);
            }
            if (((bG >> 3) & 1) == 1) {
                long jA = this.f34902d.a((byte) 0, 0L, RecyclerView.FOREVER_NS);
                if (jA == -1) {
                    throw new EOFException();
                }
                if (z10) {
                    b(this.f34902d.f34928d, 0L, jA + 1);
                }
                this.f34902d.skip(jA + 1);
            }
            if (((bG >> 4) & 1) == 1) {
                long jA2 = this.f34902d.a((byte) 0, 0L, RecyclerView.FOREVER_NS);
                if (jA2 == -1) {
                    throw new EOFException();
                }
                if (z10) {
                    b(this.f34902d.f34928d, 0L, jA2 + 1);
                }
                this.f34902d.skip(jA2 + 1);
            }
            if (z10) {
                u uVar = this.f34902d;
                uVar.U(2L);
                a("FHCRC", uVar.f34928d.l(), (short) this.f34905g.getValue());
                this.f34905g.reset();
            }
            this.f34901c = (byte) 1;
        }
        if (this.f34901c == 1) {
            long j11 = cVar.f34879d;
            long j12 = this.f34904f.read(cVar, j10);
            if (j12 != -1) {
                b(cVar, j11, j12);
                return j12;
            }
            this.f34901c = (byte) 2;
        }
        if (this.f34901c == 2) {
            a("CRC", this.f34902d.c(), (int) this.f34905g.getValue());
            a("ISIZE", this.f34902d.c(), (int) this.f34903e.getBytesWritten());
            this.f34901c = (byte) 3;
            if (!this.f34902d.y()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // qd.a0
    public b0 timeout() {
        return this.f34902d.timeout();
    }
}
