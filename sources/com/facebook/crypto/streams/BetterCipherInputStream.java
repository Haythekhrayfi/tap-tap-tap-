package com.facebook.crypto.streams;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;

/* JADX INFO: loaded from: classes.dex */
public class BetterCipherInputStream extends FilterInputStream {
    private static final int UPDATE_BUFFER_SIZE = 256;
    private final Cipher mCipher;
    private final byte[] mUpdateBuffer;

    public BetterCipherInputStream(InputStream inputStream, Cipher cipher) {
        super(inputStream);
        this.mCipher = cipher;
        this.mUpdateBuffer = new byte[256];
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = ((FilterInputStream) this).in.read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        int i13 = i12 / 256;
        int i14 = i12 % 256;
        int i15 = i10;
        int i16 = i15;
        for (int i17 = 0; i17 < i13; i17++) {
            try {
                int iUpdate = this.mCipher.update(bArr, i15, 256, this.mUpdateBuffer);
                System.arraycopy(this.mUpdateBuffer, 0, bArr, i16, iUpdate);
                i16 += iUpdate;
                i15 += 256;
            } catch (ShortBufferException unused) {
            }
        }
        if (i14 > 0) {
            int iUpdate2 = this.mCipher.update(bArr, i15, i14, this.mUpdateBuffer);
            System.arraycopy(this.mUpdateBuffer, 0, bArr, i16, iUpdate2);
            i16 += iUpdate2;
        }
        return i16 - i10;
    }
}
