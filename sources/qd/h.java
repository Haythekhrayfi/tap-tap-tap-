package qd;

import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.io.IOException;
import java.util.zip.Deflater;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f34897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Deflater f34898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f34899e;

    public h(e eVar, Deflater deflater) {
        j0.i(eVar, "sink");
        j0.i(deflater, "deflater");
        this.f34897c = eVar;
        this.f34898d = deflater;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(y yVar, Deflater deflater) {
        this(o.b(yVar), deflater);
        j0.i(yVar, "sink");
        j0.i(deflater, "deflater");
    }

    @IgnoreJRERequirement
    public final void a(boolean z10) throws IOException {
        v vVarJ;
        c cVarR = this.f34897c.r();
        while (true) {
            vVarJ = cVarR.J(1);
            Deflater deflater = this.f34898d;
            byte[] bArr = vVarJ.f34931a;
            int i10 = vVarJ.f34933c;
            int i11 = 8192 - i10;
            int iDeflate = z10 ? deflater.deflate(bArr, i10, i11, 2) : deflater.deflate(bArr, i10, i11);
            if (iDeflate > 0) {
                vVarJ.f34933c += iDeflate;
                cVarR.f34879d += (long) iDeflate;
                this.f34897c.A();
            } else if (this.f34898d.needsInput()) {
                break;
            }
        }
        if (vVarJ.f34932b == vVarJ.f34933c) {
            cVarR.f34878c = vVarJ.a();
            w.b(vVarJ);
        }
    }

    @Override // qd.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f34899e) {
            return;
        }
        Throwable th = null;
        try {
            this.f34898d.finish();
            a(false);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f34898d.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.f34897c.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.f34899e = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // qd.y, java.io.Flushable
    public void flush() throws IOException {
        a(true);
        this.f34897c.flush();
    }

    @Override // qd.y
    public b0 timeout() {
        return this.f34897c.timeout();
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("DeflaterSink(");
        sbA.append(this.f34897c);
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sbA.toString();
    }

    @Override // qd.y
    public void write(c cVar, long j10) throws IOException {
        j0.i(cVar, "source");
        d0.b(cVar.f34879d, 0L, j10);
        while (j10 > 0) {
            v vVar = cVar.f34878c;
            j0.f(vVar);
            int iMin = (int) Math.min(j10, vVar.f34933c - vVar.f34932b);
            this.f34898d.setInput(vVar.f34931a, vVar.f34932b, iMin);
            a(false);
            long j11 = iMin;
            cVar.f34879d -= j11;
            int i10 = vVar.f34932b + iMin;
            vVar.f34932b = i10;
            if (i10 == vVar.f34933c) {
                cVar.f34878c = vVar.a();
                w.b(vVar);
            }
            j10 -= j11;
        }
    }
}
