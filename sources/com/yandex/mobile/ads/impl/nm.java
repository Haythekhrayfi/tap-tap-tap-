package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class nm extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lm f23441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pm f23442b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f23444d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23445e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f23443c = new byte[1];

    public nm(o41 o41Var, pm pmVar) {
        this.f23441a = o41Var;
        this.f23442b = pmVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f23445e) {
            return;
        }
        this.f23441a.close();
        this.f23445e = true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (read(this.f23443c) == -1) {
            return -1;
        }
        return this.f23443c[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        pa.b(!this.f23445e);
        if (!this.f23444d) {
            this.f23441a.a(this.f23442b);
            this.f23444d = true;
        }
        int i12 = this.f23441a.read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        return i12;
    }
}
