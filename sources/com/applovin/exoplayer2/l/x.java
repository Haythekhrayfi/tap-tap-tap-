package com.applovin.exoplayer2.l;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f7688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f7691d;

    public x() {
        this.f7688a = ai.f7600f;
    }

    public x(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public x(byte[] bArr, int i10) {
        this.f7688a = bArr;
        this.f7691d = i10;
    }

    private void g() {
        int i10;
        int i11 = this.f7689b;
        a.b(i11 >= 0 && (i11 < (i10 = this.f7691d) || (i11 == i10 && this.f7690c == 0)));
    }

    public int a() {
        return ((this.f7691d - this.f7689b) * 8) - this.f7690c;
    }

    public String a(int i10, Charset charset) {
        byte[] bArr = new byte[i10];
        b(bArr, 0, i10);
        return new String(bArr, charset);
    }

    public void a(int i10) {
        int i11 = i10 / 8;
        this.f7689b = i11;
        this.f7690c = i10 - (i11 * 8);
        g();
    }

    public void a(int i10, int i11) {
        if (i11 < 32) {
            i10 &= (1 << i11) - 1;
        }
        int iMin = Math.min(8 - this.f7690c, i11);
        int i12 = this.f7690c;
        int i13 = (8 - i12) - iMin;
        byte[] bArr = this.f7688a;
        int i14 = this.f7689b;
        bArr[i14] = (byte) (((65280 >> i12) | ((1 << i13) - 1)) & bArr[i14]);
        int i15 = i11 - iMin;
        bArr[i14] = (byte) (((i10 >>> i15) << i13) | bArr[i14]);
        int i16 = i14 + 1;
        while (i15 > 8) {
            this.f7688a[i16] = (byte) (i10 >>> (i15 - 8));
            i15 -= 8;
            i16++;
        }
        int i17 = 8 - i15;
        byte[] bArr2 = this.f7688a;
        bArr2[i16] = (byte) (bArr2[i16] & ((1 << i17) - 1));
        bArr2[i16] = (byte) (((i10 & ((1 << i15) - 1)) << i17) | bArr2[i16]);
        b(i11);
        g();
    }

    public void a(y yVar) {
        a(yVar.d(), yVar.b());
        a(yVar.c() * 8);
    }

    public void a(byte[] bArr) {
        a(bArr, bArr.length);
    }

    public void a(byte[] bArr, int i10) {
        this.f7688a = bArr;
        this.f7689b = 0;
        this.f7690c = 0;
        this.f7691d = i10;
    }

    public void a(byte[] bArr, int i10, int i11) {
        int i12 = (i11 >> 3) + i10;
        while (i10 < i12) {
            byte[] bArr2 = this.f7688a;
            int i13 = this.f7689b;
            int i14 = i13 + 1;
            this.f7689b = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f7690c;
            bArr[i10] = (byte) (b10 << i15);
            bArr[i10] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | bArr[i10]);
            i10++;
        }
        int i16 = i11 & 7;
        if (i16 == 0) {
            return;
        }
        bArr[i12] = (byte) (bArr[i12] & (255 >> i16));
        int i17 = this.f7690c;
        if (i17 + i16 > 8) {
            int i18 = bArr[i12];
            byte[] bArr3 = this.f7688a;
            int i19 = this.f7689b;
            this.f7689b = i19 + 1;
            bArr[i12] = (byte) (i18 | ((bArr3[i19] & 255) << i17));
            this.f7690c = i17 - 8;
        }
        int i20 = this.f7690c + i16;
        this.f7690c = i20;
        byte[] bArr4 = this.f7688a;
        int i21 = this.f7689b;
        bArr[i12] = (byte) (((byte) (((255 & bArr4[i21]) >> (8 - i20)) << (8 - i16))) | bArr[i12]);
        if (i20 == 8) {
            this.f7690c = 0;
            this.f7689b = i21 + 1;
        }
        g();
    }

    public int b() {
        return (this.f7689b * 8) + this.f7690c;
    }

    public void b(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f7689b + i11;
        this.f7689b = i12;
        int i13 = (i10 - (i11 * 8)) + this.f7690c;
        this.f7690c = i13;
        if (i13 > 7) {
            this.f7689b = i12 + 1;
            this.f7690c = i13 - 8;
        }
        g();
    }

    public void b(byte[] bArr, int i10, int i11) {
        a.b(this.f7690c == 0);
        System.arraycopy(this.f7688a, this.f7689b, bArr, i10, i11);
        this.f7689b += i11;
        g();
    }

    public int c() {
        a.b(this.f7690c == 0);
        return this.f7689b;
    }

    public int c(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.f7690c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f7690c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f7690c = i13;
            byte[] bArr = this.f7688a;
            int i14 = this.f7689b;
            this.f7689b = i14 + 1;
            i12 |= (bArr[i14] & 255) << i13;
        }
        byte[] bArr2 = this.f7688a;
        int i15 = this.f7689b;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f7690c = 0;
            this.f7689b = i15 + 1;
        }
        g();
        return i16;
    }

    public long d(int i10) {
        return i10 <= 32 ? ai.b(c(i10)) : ai.b(c(i10 - 32), c(32));
    }

    public void d() {
        int i10 = this.f7690c + 1;
        this.f7690c = i10;
        if (i10 == 8) {
            this.f7690c = 0;
            this.f7689b++;
        }
        g();
    }

    public void e(int i10) {
        a.b(this.f7690c == 0);
        this.f7689b += i10;
        g();
    }

    public boolean e() {
        boolean z10 = (this.f7688a[this.f7689b] & (128 >> this.f7690c)) != 0;
        d();
        return z10;
    }

    public void f() {
        if (this.f7690c == 0) {
            return;
        }
        this.f7690c = 0;
        this.f7689b++;
        g();
    }
}
