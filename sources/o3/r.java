package o3;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class r extends FilterInputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile byte[] f33930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f33931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f33932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f33933f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f33934g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h3.b f33935h;

    public static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    public r(InputStream inputStream, h3.b bVar) {
        super(inputStream);
        this.f33933f = -1;
        this.f33935h = bVar;
        this.f33930c = (byte[]) bVar.d(65536, byte[].class);
    }

    public static IOException b() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i10 = this.f33933f;
        if (i10 != -1) {
            int i11 = this.f33934g - i10;
            int i12 = this.f33932e;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length && this.f33931d == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f33935h.d(i12, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f33930c = bArr2;
                    this.f33935h.put(bArr);
                    bArr = bArr2;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.f33934g - this.f33933f;
                this.f33934g = i13;
                this.f33933f = 0;
                this.f33931d = 0;
                int i14 = inputStream.read(bArr, i13, bArr.length - i13);
                int i15 = this.f33934g;
                if (i14 > 0) {
                    i15 += i14;
                }
                this.f33931d = i15;
                return i14;
            }
        }
        int i16 = inputStream.read(bArr);
        if (i16 > 0) {
            this.f33933f = -1;
            this.f33934g = 0;
            this.f33931d = i16;
        }
        return i16;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f33930c == null || inputStream == null) {
            b();
            throw null;
        }
        return (this.f33931d - this.f33934g) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f33930c != null) {
            this.f33935h.put(this.f33930c);
            this.f33930c = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        this.f33932e = Math.max(this.f33932e, i10);
        this.f33933f = this.f33934g;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.f33930c;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            b();
            throw null;
        }
        if (this.f33934g >= this.f33931d && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f33930c && (bArr = this.f33930c) == null) {
            b();
            throw null;
        }
        int i10 = this.f33931d;
        int i11 = this.f33934g;
        if (i10 - i11 <= 0) {
            return -1;
        }
        this.f33934g = i11 + 1;
        return bArr[i11] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int i13;
        byte[] bArr2 = this.f33930c;
        if (bArr2 == null) {
            b();
            throw null;
        }
        if (i11 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            b();
            throw null;
        }
        int i14 = this.f33934g;
        int i15 = this.f33931d;
        if (i14 < i15) {
            int i16 = i15 - i14 >= i11 ? i11 : i15 - i14;
            System.arraycopy(bArr2, i14, bArr, i10, i16);
            this.f33934g += i16;
            if (i16 == i11 || inputStream.available() == 0) {
                return i16;
            }
            i10 += i16;
            i12 = i11 - i16;
        } else {
            i12 = i11;
        }
        while (true) {
            if (this.f33933f == -1 && i12 >= bArr2.length) {
                i13 = inputStream.read(bArr, i10, i12);
                if (i13 == -1) {
                    return i12 != i11 ? i11 - i12 : -1;
                }
            } else {
                if (a(inputStream, bArr2) == -1) {
                    return i12 != i11 ? i11 - i12 : -1;
                }
                if (bArr2 != this.f33930c && (bArr2 = this.f33930c) == null) {
                    b();
                    throw null;
                }
                int i17 = this.f33931d;
                int i18 = this.f33934g;
                i13 = i17 - i18 >= i12 ? i12 : i17 - i18;
                System.arraycopy(bArr2, i18, bArr, i10, i13);
                this.f33934g += i13;
            }
            i12 -= i13;
            if (i12 == 0) {
                return i11;
            }
            if (inputStream.available() == 0) {
                return i11 - i12;
            }
            i10 += i13;
        }
    }

    public synchronized void release() {
        if (this.f33930c != null) {
            this.f33935h.put(this.f33930c);
            this.f33930c = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f33930c == null) {
            throw new IOException("Stream is closed");
        }
        int i10 = this.f33933f;
        if (-1 == i10) {
            throw new a("Mark has been invalidated, pos: " + this.f33934g + " markLimit: " + this.f33932e);
        }
        this.f33934g = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j10) throws IOException {
        if (j10 < 1) {
            return 0L;
        }
        byte[] bArr = this.f33930c;
        if (bArr == null) {
            b();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            b();
            throw null;
        }
        int i10 = this.f33931d;
        int i11 = this.f33934g;
        if (i10 - i11 >= j10) {
            this.f33934g = (int) (((long) i11) + j10);
            return j10;
        }
        long j11 = ((long) i10) - ((long) i11);
        this.f33934g = i10;
        if (this.f33933f == -1 || j10 > this.f33932e) {
            return j11 + inputStream.skip(j10 - j11);
        }
        if (a(inputStream, bArr) == -1) {
            return j11;
        }
        int i12 = this.f33931d;
        int i13 = this.f33934g;
        if (i12 - i13 >= j10 - j11) {
            this.f33934g = (int) ((((long) i13) + j10) - j11);
            return j10;
        }
        long j12 = (j11 + ((long) i12)) - ((long) i13);
        this.f33934g = i12;
        return j12;
    }
}
