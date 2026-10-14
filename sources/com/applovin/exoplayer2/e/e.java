package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.l.ai;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class e implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.exoplayer2.k.g f5328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f5329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f5330d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f5332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f5333g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f5331e = new byte[65536];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f5327a = new byte[4096];

    public e(com.applovin.exoplayer2.k.g gVar, long j10, long j11) {
        this.f5328b = gVar;
        this.f5330d = j10;
        this.f5329c = j11;
    }

    private int a(byte[] bArr, int i10, int i11, int i12, boolean z10) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iA = this.f5328b.a(bArr, i10 + i12, i11 - i12);
        if (iA != -1) {
            return i12 + iA;
        }
        if (i12 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    private void d(int i10) {
        int i11 = this.f5332f + i10;
        byte[] bArr = this.f5331e;
        if (i11 > bArr.length) {
            this.f5331e = Arrays.copyOf(this.f5331e, ai.a(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    private int e(int i10) {
        int iMin = Math.min(this.f5333g, i10);
        f(iMin);
        return iMin;
    }

    private int e(byte[] bArr, int i10, int i11) {
        int i12 = this.f5333g;
        if (i12 == 0) {
            return 0;
        }
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f5331e, 0, bArr, i10, iMin);
        f(iMin);
        return iMin;
    }

    private void f(int i10) {
        int i11 = this.f5333g - i10;
        this.f5333g = i11;
        this.f5332f = 0;
        byte[] bArr = this.f5331e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f5331e = bArr2;
    }

    private void g(int i10) {
        if (i10 != -1) {
            this.f5330d += (long) i10;
        }
    }

    @Override // com.applovin.exoplayer2.e.i
    public int a(int i10) throws IOException {
        int iE = e(i10);
        if (iE == 0) {
            byte[] bArr = this.f5327a;
            iE = a(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        g(iE);
        return iE;
    }

    @Override // com.applovin.exoplayer2.e.i, com.applovin.exoplayer2.k.g
    public int a(byte[] bArr, int i10, int i11) throws IOException {
        int iE = e(bArr, i10, i11);
        if (iE == 0) {
            iE = a(bArr, i10, i11, 0, true);
        }
        g(iE);
        return iE;
    }

    @Override // com.applovin.exoplayer2.e.i
    public void a() {
        this.f5332f = 0;
    }

    public boolean a(int i10, boolean z10) throws IOException {
        int iE = e(i10);
        while (iE < i10 && iE != -1) {
            iE = a(this.f5327a, -iE, Math.min(i10, this.f5327a.length + iE), iE, z10);
        }
        g(iE);
        return iE != -1;
    }

    @Override // com.applovin.exoplayer2.e.i
    public boolean a(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        int iE = e(bArr, i10, i11);
        while (iE < i11 && iE != -1) {
            iE = a(bArr, i10, i11, iE, z10);
        }
        g(iE);
        return iE != -1;
    }

    @Override // com.applovin.exoplayer2.e.i
    public long b() {
        return this.f5330d + ((long) this.f5332f);
    }

    @Override // com.applovin.exoplayer2.e.i
    public void b(int i10) throws IOException {
        a(i10, false);
    }

    @Override // com.applovin.exoplayer2.e.i
    public void b(byte[] bArr, int i10, int i11) throws IOException {
        a(bArr, i10, i11, false);
    }

    @Override // com.applovin.exoplayer2.e.i
    public boolean b(int i10, boolean z10) throws IOException {
        d(i10);
        int iA = this.f5333g - this.f5332f;
        while (iA < i10) {
            iA = a(this.f5331e, this.f5332f, i10, iA, z10);
            if (iA == -1) {
                return false;
            }
            this.f5333g = this.f5332f + iA;
        }
        this.f5332f += i10;
        return true;
    }

    @Override // com.applovin.exoplayer2.e.i
    public boolean b(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        if (!b(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f5331e, this.f5332f - i11, bArr, i10, i11);
        return true;
    }

    @Override // com.applovin.exoplayer2.e.i
    public int c(byte[] bArr, int i10, int i11) throws IOException {
        int iMin;
        d(i11);
        int i12 = this.f5333g;
        int i13 = this.f5332f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            iMin = a(this.f5331e, i13, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.f5333g += iMin;
        } else {
            iMin = Math.min(i11, i14);
        }
        System.arraycopy(this.f5331e, this.f5332f, bArr, i10, iMin);
        this.f5332f += iMin;
        return iMin;
    }

    @Override // com.applovin.exoplayer2.e.i
    public long c() {
        return this.f5330d;
    }

    @Override // com.applovin.exoplayer2.e.i
    public void c(int i10) throws IOException {
        b(i10, false);
    }

    @Override // com.applovin.exoplayer2.e.i
    public long d() {
        return this.f5329c;
    }

    @Override // com.applovin.exoplayer2.e.i
    public void d(byte[] bArr, int i10, int i11) throws IOException {
        b(bArr, i10, i11, false);
    }
}
