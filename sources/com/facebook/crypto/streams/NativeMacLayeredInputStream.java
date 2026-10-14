package com.facebook.crypto.streams;

import com.facebook.crypto.mac.NativeMac;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class NativeMacLayeredInputStream extends InputStream {
    private static final String MAC_DOES_NOT_MATCH = "Mac does not match";
    private final TailInputStream mInputDelegate;
    private final NativeMac mMac;
    private boolean mMacChecked = false;

    public NativeMacLayeredInputStream(NativeMac nativeMac, InputStream inputStream) {
        this.mMac = nativeMac;
        this.mInputDelegate = new TailInputStream(inputStream, nativeMac.getMacLength());
    }

    private boolean constantTimeEquals(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < bArr.length; i11++) {
            i10 |= bArr[i11] ^ bArr2[i11];
        }
        return i10 == 0;
    }

    private void ensureMacValid() throws IOException {
        if (this.mMacChecked) {
            return;
        }
        this.mMacChecked = true;
        try {
            if (!constantTimeEquals(this.mInputDelegate.getTail(), this.mMac.doFinal())) {
                throw new IOException(MAC_DOES_NOT_MATCH);
            }
            this.mMac.destroy();
        } catch (Throwable th) {
            this.mMac.destroy();
            throw th;
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.mInputDelegate.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            ensureMacValid();
        } finally {
            this.mInputDelegate.close();
        }
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i10;
        byte[] bArr = new byte[1];
        do {
            i10 = read(bArr, 0, 1);
        } while (i10 == 0);
        if (i10 == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.mInputDelegate.read(bArr, i10, i11);
        if (i12 == -1) {
            ensureMacValid();
            return -1;
        }
        if (i12 > 0) {
            this.mMac.update(bArr, i10, i12);
        }
        return i12;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        throw new UnsupportedOperationException();
    }
}
