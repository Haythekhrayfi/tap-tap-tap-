package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class np0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f23523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23526d;

    public np0(byte[] bArr, int i10, int i11) {
        a(bArr, i10, i11);
    }

    private boolean c(int i10) {
        if (2 <= i10 && i10 < this.f23524b) {
            byte[] bArr = this.f23523a;
            if (bArr[i10] == 3 && bArr[i10 - 2] == 0 && bArr[i10 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        this.f23523a = bArr;
        this.f23525c = i10;
        this.f23524b = i11;
        boolean z10 = false;
        this.f23526d = 0;
        if (i10 >= 0 && (i10 < i11 || i10 == i11)) {
            z10 = true;
        }
        pa.b(z10);
    }

    public final boolean a() {
        int i10 = this.f23525c;
        int i11 = this.f23526d;
        int i12 = 0;
        while (this.f23525c < this.f23524b && !b()) {
            i12++;
        }
        boolean z10 = this.f23525c == this.f23524b;
        this.f23525c = i10;
        this.f23526d = i11;
        return !z10 && a((i12 * 2) + 1);
    }

    public final boolean a(int i10) {
        int i11 = this.f23525c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f23526d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f23524b) {
                break;
            }
            if (c(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f23524b;
        if (i13 >= i15) {
            return i13 == i15 && i14 == 0;
        }
        return true;
    }

    public final int b(int i10) {
        int i11;
        int i12;
        this.f23526d += i10;
        boolean z10 = false;
        int i13 = 0;
        while (true) {
            i11 = this.f23526d;
            int i14 = 2;
            if (i11 <= 8) {
                break;
            }
            int i15 = i11 - 8;
            this.f23526d = i15;
            byte[] bArr = this.f23523a;
            int i16 = this.f23525c;
            i13 |= (bArr[i16] & 255) << i15;
            if (!c(i16 + 1)) {
                i14 = 1;
            }
            this.f23525c = i16 + i14;
        }
        byte[] bArr2 = this.f23523a;
        int i17 = this.f23525c;
        int i18 = ((-1) >>> (32 - i10)) & (i13 | ((bArr2[i17] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f23526d = 0;
            this.f23525c = i17 + (c(i17 + 1) ? 2 : 1);
        }
        int i19 = this.f23525c;
        if (i19 >= 0 && (i19 < (i12 = this.f23524b) || (i19 == i12 && this.f23526d == 0))) {
            z10 = true;
        }
        pa.b(z10);
        return i18;
    }

    public final boolean b() {
        boolean z10 = (this.f23523a[this.f23525c] & (128 >> this.f23526d)) != 0;
        e();
        return z10;
    }

    public final int c() {
        int i10 = 0;
        while (!b()) {
            i10++;
        }
        int iB = ((1 << i10) - 1) + (i10 > 0 ? b(i10) : 0);
        return ((iB + 1) / 2) * (iB % 2 == 0 ? -1 : 1);
    }

    public final int d() {
        int i10 = 0;
        while (!b()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? b(i10) : 0);
    }

    public final void d(int i10) {
        int i11;
        int i12;
        int i13 = this.f23525c;
        int i14 = i10 / 8;
        int i15 = i13 + i14;
        this.f23525c = i15;
        int i16 = (i10 - (i14 * 8)) + this.f23526d;
        this.f23526d = i16;
        boolean z10 = true;
        if (i16 > 7) {
            this.f23525c = i15 + 1;
            this.f23526d = i16 - 8;
        }
        while (true) {
            i13++;
            i11 = this.f23525c;
            if (i13 > i11) {
                break;
            } else if (c(i13)) {
                this.f23525c++;
                i13 += 2;
            }
        }
        if (i11 < 0 || (i11 >= (i12 = this.f23524b) && (i11 != i12 || this.f23526d != 0))) {
            z10 = false;
        }
        pa.b(z10);
    }

    public final void e() {
        int i10;
        boolean z10 = true;
        int i11 = this.f23526d + 1;
        this.f23526d = i11;
        if (i11 == 8) {
            this.f23526d = 0;
            int i12 = this.f23525c;
            this.f23525c = i12 + (c(i12 + 1) ? 2 : 1);
        }
        int i13 = this.f23525c;
        if (i13 < 0 || (i13 >= (i10 = this.f23524b) && (i13 != i10 || this.f23526d != 0))) {
            z10 = false;
        }
        pa.b(z10);
    }
}
