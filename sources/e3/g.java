package e3;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class g extends FilterInputStream {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f29007e = {-1, -31, 0, Ascii.FS, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f29008f = 31;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte f29009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29010d;

    public g(InputStream inputStream, int i10) {
        super(inputStream);
        if (i10 < -1 || i10 > 8) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("Cannot add invalid orientation: ", i10));
        }
        this.f29009c = (byte) i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i10;
        int i11;
        int i12 = this.f29010d;
        if (i12 < 2 || i12 > (i11 = f29008f)) {
            i10 = super.read();
        } else {
            i10 = i12 == i11 ? this.f29009c : f29007e[i12 - 2] & 255;
        }
        if (i10 != -1) {
            this.f29010d++;
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int i13 = this.f29010d;
        int i14 = f29008f;
        if (i13 > i14) {
            i12 = super.read(bArr, i10, i11);
        } else if (i13 == i14) {
            bArr[i10] = this.f29009c;
            i12 = 1;
        } else if (i13 < 2) {
            i12 = super.read(bArr, i10, 2 - i13);
        } else {
            int iMin = Math.min(i14 - i13, i11);
            System.arraycopy(f29007e, this.f29010d - 2, bArr, i10, iMin);
            i12 = iMin;
        }
        if (i12 > 0) {
            this.f29010d += i12;
        }
        return i12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        long jSkip = super.skip(j10);
        if (jSkip > 0) {
            this.f29010d = (int) (((long) this.f29010d) + jSkip);
        }
        return jSkip;
    }
}
