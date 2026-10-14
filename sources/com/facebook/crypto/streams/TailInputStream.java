package com.facebook.crypto.streams;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class TailInputStream extends FilterInputStream {
    private int mCount;
    private boolean mEOF;
    private final byte[] mTail;
    private final int mTailTength;

    public TailInputStream(InputStream inputStream, int i10) {
        super(inputStream);
        this.mTail = new byte[i10];
        this.mTailTength = i10;
    }

    private int extractTail(byte[] bArr, int i10, int i11, int i12) {
        int i13 = this.mTailTength - i11;
        int iMax = Math.max(0, i10 - i13) + i12;
        int iMin = Math.min(i13, i10);
        if (iMin > 0) {
            if (i11 > 0) {
                byte[] bArr2 = this.mTail;
                System.arraycopy(bArr2, 0, bArr2, iMin, i11);
            }
            System.arraycopy(bArr, iMax, this.mTail, 0, iMin);
        }
        this.mCount = iMin + i11;
        return iMax - i12;
    }

    private int readTail(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.mCount;
        int i13 = 0;
        if (i11 < i12) {
            int i14 = i12 - i11;
            System.arraycopy(this.mTail, 0, bArr, i10, i11);
            byte[] bArr2 = this.mTail;
            System.arraycopy(bArr2, i11, bArr2, 0, i14);
            int i15 = ((FilterInputStream) this).in.read(this.mTail, i14, this.mTailTength - i14);
            if (i15 != -1) {
                return extractTail(bArr, i11, i15 + i14, i10);
            }
            byte[] bArr3 = this.mTail;
            System.arraycopy(bArr3, 0, bArr3, i11, i14);
            System.arraycopy(bArr, i10, this.mTail, 0, i11);
            this.mEOF = true;
            return -1;
        }
        int i16 = ((FilterInputStream) this).in.read(bArr, this.mCount + i10, i11 - i12);
        if (i16 == -1) {
            this.mEOF = true;
            return -1;
        }
        int i17 = this.mCount;
        if (i17 > 0) {
            System.arraycopy(this.mTail, 0, bArr, i10, i17);
        }
        int i18 = this.mCount + i16;
        int i19 = ((FilterInputStream) this).in.read(this.mTail, 0, this.mTailTength);
        if (i19 == -1) {
            this.mEOF = true;
        } else {
            i13 = i19;
        }
        return extractTail(bArr, i18, i13, i10);
    }

    public byte[] getTail() throws IOException {
        if (this.mCount == this.mTailTength) {
            return this.mTail;
        }
        throw new IOException("Not enough tail data");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
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

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.mEOF) {
            return -1;
        }
        int tail = 0;
        if (i11 == 0) {
            return 0;
        }
        while (tail == 0) {
            tail = readTail(bArr, i10, i11);
        }
        return tail;
    }
}
