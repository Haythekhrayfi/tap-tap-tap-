package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class dc extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Enumeration<File> f12106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InputStream f12107b;

    public dc(Enumeration<File> enumeration) throws IOException {
        this.f12106a = enumeration;
        a();
    }

    public final void a() throws IOException {
        InputStream inputStream = this.f12107b;
        if (inputStream != null) {
            inputStream.close();
        }
        this.f12107b = this.f12106a.hasMoreElements() ? new FileInputStream(this.f12106a.nextElement()) : null;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        InputStream inputStream = this.f12107b;
        if (inputStream != null) {
            inputStream.close();
            this.f12107b = null;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f12107b;
            if (inputStream == null) {
                return -1;
            }
            int i10 = inputStream.read();
            if (i10 != -1) {
                return i10;
            }
            a();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f12107b == null) {
            return -1;
        }
        Objects.requireNonNull(bArr);
        if (i10 < 0 || i11 < 0 || i11 > bArr.length - i10) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 == 0) {
            return 0;
        }
        do {
            int i12 = this.f12107b.read(bArr, i10, i11);
            if (i12 > 0) {
                return i12;
            }
            a();
        } while (this.f12107b != null);
        return -1;
    }
}
