package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class ji1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f22060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22063d;

    public ji1(byte[] bArr) {
        this.f22060a = bArr;
        this.f22061b = bArr.length;
    }

    public final int a() {
        return (this.f22062c * 8) + this.f22063d;
    }

    public final int a(int i10) {
        int i11 = this.f22062c;
        int iMin = Math.min(i10, 8 - this.f22063d);
        int i12 = i11 + 1;
        int i13 = ((this.f22060a[i11] & 255) >> this.f22063d) & (255 >> (8 - iMin));
        while (iMin < i10) {
            i13 |= (this.f22060a[i12] & 255) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        b(i10);
        return i14;
    }

    public final void b(int i10) {
        int i11;
        int i12 = i10 / 8;
        int i13 = this.f22062c + i12;
        this.f22062c = i13;
        int i14 = (i10 - (i12 * 8)) + this.f22063d;
        this.f22063d = i14;
        boolean z10 = true;
        if (i14 > 7) {
            this.f22062c = i13 + 1;
            this.f22063d = i14 - 8;
        }
        int i15 = this.f22062c;
        if (i15 < 0 || (i15 >= (i11 = this.f22061b) && (i15 != i11 || this.f22063d != 0))) {
            z10 = false;
        }
        pa.b(z10);
    }

    public final boolean b() {
        boolean z10 = (((this.f22060a[this.f22062c] & 255) >> this.f22063d) & 1) == 1;
        b(1);
        return z10;
    }
}
