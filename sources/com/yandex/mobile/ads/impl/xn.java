package com.yandex.mobile.ads.impl;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class xn implements vt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final im f26561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f26562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f26563d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f26565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f26566g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f26564e = new byte[65536];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f26560a = new byte[4096];

    static {
        us.a("goog.exo.extractor");
    }

    public xn(lm lmVar, long j10, long j11) {
        this.f26561b = lmVar;
        this.f26563d = j10;
        this.f26562c = j11;
    }

    private int a(byte[] bArr, int i10, int i11, int i12, boolean z10) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i13 = this.f26561b.read(bArr, i10 + i12, i11 - i12);
        if (i13 != -1) {
            return i12 + i13;
        }
        if (i12 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.yandex.mobile.ads.impl.vt
    public final long a() {
        return this.f26562c;
    }

    @Override // com.yandex.mobile.ads.impl.vt
    public final void a(int i10) throws IOException {
        int iMin = Math.min(this.f26566g, i10);
        int i11 = this.f26566g - iMin;
        this.f26566g = i11;
        this.f26565f = 0;
        byte[] bArr = this.f26564e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, iMin, bArr2, 0, i11);
        this.f26564e = bArr2;
        int iA = iMin;
        while (iA < i10 && iA != -1) {
            iA = a(this.f26560a, -iA, Math.min(i10, this.f26560a.length + iA), iA, false);
        }
        if (iA != -1) {
            this.f26563d += (long) iA;
        }
    }

    @Override // com.yandex.mobile.ads.impl.vt
    public final void a(byte[] bArr, int i10, int i11) throws IOException {
        b(bArr, i10, i11, false);
    }

    public final boolean a(boolean z10, int i10) throws IOException {
        int i11 = this.f26565f + i10;
        byte[] bArr = this.f26564e;
        if (i11 > bArr.length) {
            int i12 = da1.f19803a;
            this.f26564e = Arrays.copyOf(this.f26564e, Math.max(65536 + i11, Math.min(bArr.length * 2, i11 + 524288)));
        }
        int iA = this.f26566g - this.f26565f;
        while (iA < i10) {
            iA = a(this.f26564e, this.f26565f, i10, iA, z10);
            if (iA == -1) {
                return false;
            }
            this.f26566g = this.f26565f + iA;
        }
        this.f26565f += i10;
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.vt
    public final boolean a(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        int iA;
        int i12 = this.f26566g;
        if (i12 == 0) {
            iA = 0;
        } else {
            int iMin = Math.min(i12, i11);
            System.arraycopy(this.f26564e, 0, bArr, i10, iMin);
            int i13 = this.f26566g - iMin;
            this.f26566g = i13;
            this.f26565f = 0;
            byte[] bArr2 = this.f26564e;
            byte[] bArr3 = i13 < bArr2.length - 524288 ? new byte[65536 + i13] : bArr2;
            System.arraycopy(bArr2, iMin, bArr3, 0, i13);
            this.f26564e = bArr3;
            iA = iMin;
        }
        while (iA < i11 && iA != -1) {
            iA = a(bArr, i10, i11, iA, z10);
        }
        if (iA != -1) {
            this.f26563d += (long) iA;
        }
        return iA != -1;
    }

    public final int b(byte[] bArr, int i10, int i11) throws IOException {
        int iMin;
        int i12 = this.f26565f + i11;
        byte[] bArr2 = this.f26564e;
        if (i12 > bArr2.length) {
            int i13 = da1.f19803a;
            this.f26564e = Arrays.copyOf(this.f26564e, Math.max(65536 + i12, Math.min(bArr2.length * 2, i12 + 524288)));
        }
        int i14 = this.f26566g;
        int i15 = this.f26565f;
        int i16 = i14 - i15;
        if (i16 == 0) {
            iMin = a(this.f26564e, i15, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.f26566g += iMin;
        } else {
            iMin = Math.min(i11, i16);
        }
        System.arraycopy(this.f26564e, this.f26565f, bArr, i10, iMin);
        this.f26565f += iMin;
        return iMin;
    }

    @Override // com.yandex.mobile.ads.impl.vt
    public final void b(int i10) throws IOException {
        a(false, i10);
    }

    @Override // com.yandex.mobile.ads.impl.vt
    public final boolean b(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        if (!a(z10, i11)) {
            return false;
        }
        System.arraycopy(this.f26564e, this.f26565f - i11, bArr, i10, i11);
        return true;
    }

    public final int c(int i10) throws IOException {
        int iMin = Math.min(this.f26566g, i10);
        int i11 = this.f26566g - iMin;
        this.f26566g = i11;
        this.f26565f = 0;
        byte[] bArr = this.f26564e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, iMin, bArr2, 0, i11);
        this.f26564e = bArr2;
        if (iMin == 0) {
            byte[] bArr3 = this.f26560a;
            iMin = a(bArr3, 0, Math.min(i10, bArr3.length), 0, true);
        }
        if (iMin != -1) {
            this.f26563d += (long) iMin;
        }
        return iMin;
    }

    @Override // com.yandex.mobile.ads.impl.vt
    public final void c() {
        this.f26565f = 0;
    }

    @Override // com.yandex.mobile.ads.impl.vt
    public final long e() {
        return this.f26563d + ((long) this.f26565f);
    }

    @Override // com.yandex.mobile.ads.impl.vt
    public final long getPosition() {
        return this.f26563d;
    }

    @Override // com.yandex.mobile.ads.impl.vt, com.yandex.mobile.ads.impl.im
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f26566g;
        int iA = 0;
        if (i12 != 0) {
            int iMin = Math.min(i12, i11);
            System.arraycopy(this.f26564e, 0, bArr, i10, iMin);
            int i13 = this.f26566g - iMin;
            this.f26566g = i13;
            this.f26565f = 0;
            byte[] bArr2 = this.f26564e;
            byte[] bArr3 = i13 < bArr2.length - 524288 ? new byte[65536 + i13] : bArr2;
            System.arraycopy(bArr2, iMin, bArr3, 0, i13);
            this.f26564e = bArr3;
            iA = iMin;
        }
        if (iA == 0) {
            iA = a(bArr, i10, i11, 0, true);
        }
        if (iA != -1) {
            this.f26563d += (long) iA;
        }
        return iA;
    }

    @Override // com.yandex.mobile.ads.impl.vt
    public final void readFully(byte[] bArr, int i10, int i11) throws IOException {
        a(bArr, i10, i11, false);
    }
}
