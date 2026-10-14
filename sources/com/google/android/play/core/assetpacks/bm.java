package com.google.android.play.core.assetpacks;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class bm extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dd f11938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f11939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f11940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f11941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f11942e;

    public bm(InputStream inputStream) {
        super(inputStream);
        this.f11938a = new dd();
        this.f11939b = new byte[4096];
        this.f11941d = false;
        this.f11942e = false;
    }

    private final int a(byte[] bArr, int i10, int i11) throws IOException {
        return Math.max(0, super.read(bArr, i10, i11));
    }

    private final boolean a(int i10) throws IOException {
        int iA = a(this.f11939b, 0, i10);
        if (iA != i10) {
            int i11 = i10 - iA;
            if (a(this.f11939b, iA, i11) != i11) {
                this.f11938a.a(this.f11939b, 0, iA);
                return false;
            }
        }
        this.f11938a.a(this.f11939b, 0, i10);
        return true;
    }

    public final dx a() throws IOException {
        byte[] bArr;
        if (this.f11940c > 0) {
            do {
                bArr = this.f11939b;
            } while (read(bArr, 0, bArr.length) != -1);
        }
        if (this.f11941d || this.f11942e) {
            return new dx(null, -1L, -1, false, false, null);
        }
        if (!a(30)) {
            this.f11941d = true;
            return this.f11938a.a();
        }
        dx dxVarA = this.f11938a.a();
        if (dxVarA.g()) {
            this.f11942e = true;
            return dxVarA;
        }
        if (dxVarA.d() == 4294967295L) {
            throw new bv("Files bigger than 4GiB are not supported.");
        }
        int iB = this.f11938a.b() - 30;
        long j10 = iB;
        int length = this.f11939b.length;
        if (j10 > length) {
            do {
                length += length;
            } while (length < j10);
            this.f11939b = Arrays.copyOf(this.f11939b, length);
        }
        if (!a(iB)) {
            this.f11941d = true;
            return this.f11938a.a();
        }
        dx dxVarA2 = this.f11938a.a();
        this.f11940c = dxVarA2.d();
        return dxVarA2;
    }

    public final boolean b() {
        return this.f11941d;
    }

    public final boolean c() {
        return this.f11942e;
    }

    public final long d() {
        return this.f11940c;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        long j10 = this.f11940c;
        if (j10 <= 0 || this.f11941d) {
            return -1;
        }
        int iA = a(bArr, i10, (int) Math.min(j10, i11));
        this.f11940c -= (long) iA;
        if (iA != 0) {
            return iA;
        }
        this.f11941d = true;
        return 0;
    }
}
