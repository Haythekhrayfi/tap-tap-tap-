package com.facebook.crypto.streams;

import android.support.v4.media.j;
import com.facebook.crypto.cipher.NativeGCMCipher;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class NativeGCMCipherOutputStream extends OutputStream {
    private static final int DEFAULT_ENCRYPT_BUFFER_SIZE = 256;
    private final NativeGCMCipher mCipher;
    private final OutputStream mCipherDelegate;
    private final byte[] mTag;
    private boolean mTagAppended = false;
    private final byte[] mUpdateBuffer;
    private final int mUpdateBufferChunkSize;

    public NativeGCMCipherOutputStream(OutputStream outputStream, NativeGCMCipher nativeGCMCipher, byte[] bArr, int i10) {
        this.mCipherDelegate = outputStream;
        this.mCipher = nativeGCMCipher;
        this.mTag = new byte[i10];
        int cipherBlockSize = nativeGCMCipher.getCipherBlockSize();
        if (bArr == null) {
            bArr = new byte[cipherBlockSize + 256];
        } else {
            int i11 = cipherBlockSize + 1;
            if (bArr.length < i11) {
                throw new IllegalArgumentException(j.a("encryptBuffer cannot be smaller than ", i11, "B"));
            }
        }
        this.mUpdateBufferChunkSize = bArr.length - cipherBlockSize;
        this.mUpdateBuffer = bArr;
    }

    private void appendTag() throws IOException {
        if (this.mTagAppended) {
            return;
        }
        this.mTagAppended = true;
        try {
            NativeGCMCipher nativeGCMCipher = this.mCipher;
            byte[] bArr = this.mTag;
            nativeGCMCipher.encryptFinal(bArr, bArr.length);
            this.mCipherDelegate.write(this.mTag);
        } finally {
            this.mCipher.destroy();
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            appendTag();
        } finally {
            this.mCipherDelegate.close();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.mCipherDelegate.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        write(new byte[]{(byte) i10}, 0, 1);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = i10 + i11;
        if (bArr.length < i12) {
            throw new ArrayIndexOutOfBoundsException(i12);
        }
        int i13 = this.mUpdateBufferChunkSize;
        int i14 = i11 / i13;
        int i15 = i11 % i13;
        int i16 = i10;
        for (int i17 = 0; i17 < i14; i17++) {
            this.mCipherDelegate.write(this.mUpdateBuffer, 0, this.mCipher.update(bArr, i16, this.mUpdateBufferChunkSize, this.mUpdateBuffer, 0));
            i16 += this.mUpdateBufferChunkSize;
        }
        if (i15 > 0) {
            this.mCipherDelegate.write(this.mUpdateBuffer, 0, this.mCipher.update(bArr, i16, i15, this.mUpdateBuffer, 0));
        }
    }
}
