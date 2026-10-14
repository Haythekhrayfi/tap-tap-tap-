package com.yandex.mobile.ads.impl;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class lp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f22755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22758d;

    public lp0() {
        this.f22755a = da1.f19808f;
    }

    public lp0(int i10, byte[] bArr) {
        this.f22755a = bArr;
        this.f22758d = i10;
    }

    public lp0(byte[] bArr) {
        this(bArr.length, bArr);
    }

    private void a() {
        int i10;
        int i11 = this.f22756b;
        pa.b(i11 >= 0 && (i11 < (i10 = this.f22758d) || (i11 == i10 && this.f22757c == 0)));
    }

    public final String a(int i10, Charset charset) {
        byte[] bArr = new byte[i10];
        b(bArr, i10);
        return new String(bArr, charset);
    }

    public final void a(int i10) {
        int i11 = i10 & 16383;
        int iMin = Math.min(8 - this.f22757c, 14);
        int i12 = this.f22757c;
        int i13 = (8 - i12) - iMin;
        byte[] bArr = this.f22755a;
        int i14 = this.f22756b;
        byte b10 = (byte) (((65280 >> i12) | ((1 << i13) - 1)) & bArr[i14]);
        bArr[i14] = b10;
        int i15 = 14 - iMin;
        bArr[i14] = (byte) (b10 | ((i11 >>> i15) << i13));
        int i16 = i14 + 1;
        while (i15 > 8) {
            this.f22755a[i16] = (byte) (i11 >>> (i15 - 8));
            i15 -= 8;
            i16++;
        }
        int i17 = 8 - i15;
        byte[] bArr2 = this.f22755a;
        byte b11 = (byte) (bArr2[i16] & ((1 << i17) - 1));
        bArr2[i16] = b11;
        bArr2[i16] = (byte) (((i11 & ((1 << i15) - 1)) << i17) | b11);
        d(14);
        a();
    }

    public final void a(int i10, byte[] bArr) {
        this.f22755a = bArr;
        this.f22756b = 0;
        this.f22757c = 0;
        this.f22758d = i10;
    }

    public final void a(byte[] bArr, int i10) {
        int i11 = (i10 >> 3) + 0;
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr2 = this.f22755a;
            int i13 = this.f22756b;
            int i14 = i13 + 1;
            this.f22756b = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f22757c;
            byte b11 = (byte) (b10 << i15);
            bArr[i12] = b11;
            bArr[i12] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b11);
        }
        int i16 = i10 & 7;
        if (i16 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i11] & (255 >> i16));
        bArr[i11] = b12;
        int i17 = this.f22757c;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.f22755a;
            int i18 = this.f22756b;
            this.f22756b = i18 + 1;
            bArr[i11] = (byte) (b12 | ((bArr3[i18] & 255) << i17));
            this.f22757c = i17 - 8;
        }
        int i19 = this.f22757c + i16;
        this.f22757c = i19;
        byte[] bArr4 = this.f22755a;
        int i20 = this.f22756b;
        bArr[i11] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i11]);
        if (i19 == 8) {
            this.f22757c = 0;
            this.f22756b = i20 + 1;
        }
        a();
    }

    public final int b() {
        return ((this.f22758d - this.f22756b) * 8) - this.f22757c;
    }

    public final int b(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.f22757c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f22757c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f22757c = i13;
            byte[] bArr = this.f22755a;
            int i14 = this.f22756b;
            this.f22756b = i14 + 1;
            i12 |= (bArr[i14] & 255) << i13;
        }
        byte[] bArr2 = this.f22755a;
        int i15 = this.f22756b;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f22757c = 0;
            this.f22756b = i15 + 1;
        }
        a();
        return i16;
    }

    public final void b(byte[] bArr, int i10) {
        pa.b(this.f22757c == 0);
        System.arraycopy(this.f22755a, this.f22756b, bArr, 0, i10);
        this.f22756b += i10;
        a();
    }

    public final void c() {
        if (this.f22757c == 0) {
            return;
        }
        this.f22757c = 0;
        this.f22756b++;
        a();
    }

    public final void c(int i10) {
        int i11 = i10 / 8;
        this.f22756b = i11;
        this.f22757c = i10 - (i11 * 8);
        a();
    }

    public final int d() {
        pa.b(this.f22757c == 0);
        return this.f22756b;
    }

    public final void d(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f22756b + i11;
        this.f22756b = i12;
        int i13 = (i10 - (i11 * 8)) + this.f22757c;
        this.f22757c = i13;
        if (i13 > 7) {
            this.f22756b = i12 + 1;
            this.f22757c = i13 - 8;
        }
        a();
    }

    public final int e() {
        return (this.f22756b * 8) + this.f22757c;
    }

    public final void e(int i10) {
        pa.b(this.f22757c == 0);
        this.f22756b += i10;
        a();
    }

    public final boolean f() {
        boolean z10 = (this.f22755a[this.f22756b] & (128 >> this.f22757c)) != 0;
        h();
        return z10;
    }

    public final long g() {
        int iB = b(4);
        int iB2 = b(32);
        int i10 = da1.f19803a;
        return ((((long) iB) & 4294967295L) << 32) | (((long) iB2) & 4294967295L);
    }

    public final void h() {
        int i10 = this.f22757c + 1;
        this.f22757c = i10;
        if (i10 == 8) {
            this.f22757c = 0;
            this.f22756b++;
        }
        a();
    }
}
