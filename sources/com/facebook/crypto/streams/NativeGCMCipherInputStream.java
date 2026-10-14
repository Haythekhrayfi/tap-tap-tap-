package com.facebook.crypto.streams;

import com.facebook.crypto.cipher.NativeGCMCipher;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class NativeGCMCipherInputStream extends InputStream {
    private static final int SKIP_BUFFER_SIZE = 256;
    private final NativeGCMCipher mCipher;
    private final TailInputStream mCipherDelegate;
    private byte[] mSkipBuffer;
    private boolean mTagChecked = false;

    public NativeGCMCipherInputStream(InputStream inputStream, NativeGCMCipher nativeGCMCipher, int i10) {
        this.mCipherDelegate = new TailInputStream(inputStream, i10);
        this.mCipher = nativeGCMCipher;
    }

    private void ensureTagValid() throws IOException {
        if (this.mTagChecked) {
            return;
        }
        this.mTagChecked = true;
        try {
            byte[] tail = this.mCipherDelegate.getTail();
            this.mCipher.decryptFinal(tail, tail.length);
        } finally {
            this.mCipher.destroy();
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.mCipherDelegate.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            ensureTagValid();
        } finally {
            this.mCipherDelegate.close();
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
        throw new UnsupportedOperationException();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = i10 + i11;
        if (bArr.length < i12) {
            throw new ArrayIndexOutOfBoundsException(i12);
        }
        int i13 = this.mCipherDelegate.read(bArr, i10, i11);
        if (i13 != -1) {
            return this.mCipher.update(bArr, i10, i13, bArr, i10);
        }
        ensureTagValid();
        return -1;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        if (this.mSkipBuffer == null) {
            this.mSkipBuffer = new byte[256];
        }
        long j11 = 0;
        while (j10 > 0) {
            int i10 = read(this.mSkipBuffer, 0, (int) Math.min(j10, 256L));
            if (i10 < 0) {
                break;
            }
            long j12 = i10;
            j11 += j12;
            j10 -= j12;
        }
        if (j11 == 0) {
            return -1L;
        }
        return j11;
    }
}
