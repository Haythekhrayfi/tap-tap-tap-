package qd;

import fd.j0;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends OutputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f34889c;

    public d(c cVar) {
        this.f34889c = cVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
    }

    public String toString() {
        return this.f34889c + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.f34889c.R(i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        j0.i(bArr, "data");
        this.f34889c.P(bArr, i10, i11);
    }
}
