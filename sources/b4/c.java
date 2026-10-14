package b4;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class c extends FilterInputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3291d;

    public c(InputStream inputStream, long j10) {
        super(inputStream);
        this.f3290c = j10;
    }

    public final int a(int i10) throws IOException {
        if (i10 >= 0) {
            this.f3291d += i10;
        } else if (this.f3290c - ((long) this.f3291d) > 0) {
            StringBuilder sbA = defpackage.a.a("Failed to read all expected data, expected: ");
            sbA.append(this.f3290c);
            sbA.append(", but read: ");
            sbA.append(this.f3291d);
            throw new IOException(sbA.toString());
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.f3290c - ((long) this.f3291d), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int i10;
        i10 = super.read();
        a(i10 >= 0 ? 1 : -1);
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        i12 = super.read(bArr, i10, i11);
        a(i12);
        return i12;
    }
}
