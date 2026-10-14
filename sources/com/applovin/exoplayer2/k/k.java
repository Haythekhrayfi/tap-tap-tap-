package com.applovin.exoplayer2.k;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class k extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f7386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f7387b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f7391f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f7389d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f7390e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f7388c = new byte[1];

    public k(i iVar, l lVar) {
        this.f7386a = iVar;
        this.f7387b = lVar;
    }

    private void a() throws IOException {
        if (this.f7389d) {
            return;
        }
        this.f7386a.a(this.f7387b);
        this.f7389d = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f7390e) {
            return;
        }
        this.f7386a.c();
        this.f7390e = true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f7388c) == -1) {
            return -1;
        }
        return this.f7388c[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        com.applovin.exoplayer2.l.a.b(!this.f7390e);
        a();
        int iA = this.f7386a.a(bArr, i10, i11);
        if (iA == -1) {
            return -1;
        }
        this.f7391f += (long) iA;
        return iA;
    }
}
