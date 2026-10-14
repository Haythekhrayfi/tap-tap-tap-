package com.facebook.crypto.streams;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class FixedSizeByteArrayOutputStream extends ByteArrayOutputStream {
    public FixedSizeByteArrayOutputStream(int i10) {
        super(i10);
    }

    public byte[] getBytes() throws IOException {
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        if (bArr.length == ((ByteArrayOutputStream) this).count) {
            return bArr;
        }
        throw new IOException("Size supplied is too small");
    }
}
