package com.google.android.play.core.assetpacks;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
final class bd extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f11915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f11916b;

    public bd(InputStream inputStream, long j10) {
        this.f11915a = inputStream;
        this.f11916b = j10;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.f11915a.close();
        this.f11916b = 0L;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        long j10 = this.f11916b;
        if (j10 <= 0) {
            return -1;
        }
        this.f11916b = j10 - 1;
        return this.f11915a.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        long j10 = this.f11916b;
        if (j10 <= 0) {
            return -1;
        }
        int i12 = this.f11915a.read(bArr, i10, (int) Math.min(i11, j10));
        if (i12 != -1) {
            this.f11916b -= (long) i12;
        }
        return i12;
    }
}
