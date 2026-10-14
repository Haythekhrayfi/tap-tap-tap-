package okhttp3.internal.ws;

import fd.j0;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import qd.c;
import qd.d0;
import qd.g;
import qd.h;
import qd.y;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class MessageDeflater implements Closeable {
    private final c deflatedBytes;
    private final Deflater deflater;
    private final h deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean z10) {
        this.noContextTakeover = z10;
        c cVar = new c();
        this.deflatedBytes = cVar;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new h((y) cVar, deflater);
    }

    private final boolean endsWith(c cVar, g gVar) {
        return cVar.G(cVar.f34879d - ((long) gVar.c()), gVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.deflaterSink.close();
    }

    public final void deflate(c cVar) throws IOException {
        j0.i(cVar, "buffer");
        if (!(this.deflatedBytes.f34879d == 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.noContextTakeover) {
            this.deflater.reset();
        }
        this.deflaterSink.write(cVar, cVar.f34879d);
        this.deflaterSink.flush();
        if (endsWith(this.deflatedBytes, MessageDeflaterKt.EMPTY_DEFLATE_BLOCK)) {
            c cVar2 = this.deflatedBytes;
            long j10 = cVar2.f34879d - ((long) 4);
            c.a aVarJ = cVar2.j(d0.f34890a);
            try {
                aVarJ.a(j10);
                c0.g(aVarJ, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    c0.g(aVarJ, th);
                    throw th2;
                }
            }
        } else {
            this.deflatedBytes.R(0);
        }
        c cVar3 = this.deflatedBytes;
        cVar.write(cVar3, cVar3.f34879d);
    }
}
