package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ob, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1086Ob extends InputStream {
    public int A00;
    public long A01;
    public InterfaceC0885Ga A02;
    public final Uri A03;
    public final C1336Xv A04;
    public final GZ A05;
    public final String A06;

    public C1086Ob(C1336Xv c1336Xv, Uri uri, GZ gz) throws IOException {
        this.A04 = c1336Xv;
        this.A05 = gz;
        this.A03 = uri;
        this.A06 = QD.A08(c1336Xv, uri);
        A00(0);
    }

    private void A00(int i10) throws IOException {
        InterfaceC0885Ga interfaceC0885Ga = this.A02;
        if (interfaceC0885Ga != null) {
            interfaceC0885Ga.close();
        }
        this.A02 = this.A05.A4T();
        this.A01 = (int) this.A02.ADQ(new C0889Ge(this.A03, i10, -1L, this.A06));
    }

    @Override // java.io.InputStream
    public final int available() {
        return ((int) this.A01) - this.A00;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A02.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] b10 = new byte[1];
        return read(b10);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.A02.read(bArr, i10, i11);
        int read = this.A00;
        this.A00 = read + i12;
        return i12;
    }

    @Override // java.io.InputStream
    public final long skip(long j10) throws IOException {
        long j11 = this.A01;
        int i10 = this.A00;
        long skipped = j11 - ((long) i10);
        if (skipped <= 0) {
            return 0L;
        }
        if (j10 > skipped) {
            j10 = skipped;
        }
        int i11 = (int) (((long) i10) + j10);
        this.A00 = i11;
        A00(i11);
        return j10;
    }
}
