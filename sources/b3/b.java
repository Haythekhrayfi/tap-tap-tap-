package b3;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class b implements Closeable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InputStream f3276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Charset f3277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f3278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3280g;

    public class a extends ByteArrayOutputStream {
        public a(int i10) {
            super(i10);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i10 = ((ByteArrayOutputStream) this).count;
            if (i10 > 0 && ((ByteArrayOutputStream) this).buf[i10 - 1] == 13) {
                i10--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i10, b.this.f3277d.name());
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public b(InputStream inputStream, int i10, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(c.f3282a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f3276c = inputStream;
        this.f3277d = charset;
        this.f3278e = new byte[i10];
    }

    public b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    public final void a() throws IOException {
        InputStream inputStream = this.f3276c;
        byte[] bArr = this.f3278e;
        int i10 = inputStream.read(bArr, 0, bArr.length);
        if (i10 == -1) {
            throw new EOFException();
        }
        this.f3279f = 0;
        this.f3280g = i10;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002b  */
    public String b() throws IOException {
        int i10;
        byte[] bArr;
        int i11;
        synchronized (this.f3276c) {
            if (this.f3278e == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.f3279f >= this.f3280g) {
                a();
            }
            for (int i12 = this.f3279f; i12 != this.f3280g; i12++) {
                byte[] bArr2 = this.f3278e;
                if (bArr2[i12] == 10) {
                    int i13 = this.f3279f;
                    if (i12 != i13) {
                        i11 = i12 - 1;
                        if (bArr2[i11] != 13) {
                            i11 = i12;
                        }
                    } else {
                        i11 = i12;
                    }
                    String str = new String(bArr2, i13, i11 - i13, this.f3277d.name());
                    this.f3279f = i12 + 1;
                    return str;
                }
            }
            a aVar = new a((this.f3280g - this.f3279f) + 80);
            loop1: while (true) {
                byte[] bArr3 = this.f3278e;
                int i14 = this.f3279f;
                aVar.write(bArr3, i14, this.f3280g - i14);
                this.f3280g = -1;
                a();
                i10 = this.f3279f;
                while (i10 != this.f3280g) {
                    bArr = this.f3278e;
                    if (bArr[i10] == 10) {
                        break loop1;
                    }
                    i10++;
                }
            }
            int i15 = this.f3279f;
            if (i10 != i15) {
                aVar.write(bArr, i15, i10 - i15);
            }
            this.f3279f = i10 + 1;
            return aVar.toString();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f3276c) {
            if (this.f3278e != null) {
                this.f3278e = null;
                this.f3276c.close();
            }
        }
    }
}
