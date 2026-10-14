package e3;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class c extends OutputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OutputStream f29000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f29001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h3.b f29002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f29003f;

    public c(OutputStream outputStream, h3.b bVar) {
        this.f29000c = outputStream;
        this.f29002e = bVar;
        this.f29001d = (byte[]) bVar.d(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f29000c.close();
            byte[] bArr = this.f29001d;
            if (bArr != null) {
                this.f29002e.put(bArr);
                this.f29001d = null;
            }
        } catch (Throwable th) {
            this.f29000c.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        int i10 = this.f29003f;
        if (i10 > 0) {
            this.f29000c.write(this.f29001d, 0, i10);
            this.f29003f = 0;
        }
        this.f29000c.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.f29001d;
        int i11 = this.f29003f;
        int i12 = i11 + 1;
        this.f29003f = i12;
        bArr[i11] = (byte) i10;
        if (i12 != bArr.length || i12 <= 0) {
            return;
        }
        this.f29000c.write(bArr, 0, i12);
        this.f29003f = 0;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f29003f;
            if (i15 == 0 && i13 >= this.f29001d.length) {
                this.f29000c.write(bArr, i14, i13);
                return;
            }
            int iMin = Math.min(i13, this.f29001d.length - i15);
            System.arraycopy(bArr, i14, this.f29001d, this.f29003f, iMin);
            int i16 = this.f29003f + iMin;
            this.f29003f = i16;
            i12 += iMin;
            byte[] bArr2 = this.f29001d;
            if (i16 == bArr2.length && i16 > 0) {
                this.f29000c.write(bArr2, 0, i16);
                this.f29003f = 0;
            }
        } while (i12 < i11);
    }
}
