package com.yandex.mobile.ads.impl;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class mp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f23131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23133c;

    public mp0() {
        this.f23131a = da1.f19808f;
    }

    public mp0(int i10) {
        this.f23131a = new byte[i10];
        this.f23133c = i10;
    }

    public mp0(int i10, byte[] bArr) {
        this.f23131a = bArr;
        this.f23133c = i10;
    }

    public mp0(byte[] bArr) {
        this.f23131a = bArr;
        this.f23133c = bArr.length;
    }

    public final long A() {
        int i10;
        int i11;
        long j10 = this.f23131a[this.f23132b];
        int i12 = 7;
        while (true) {
            if (i12 >= 0) {
                int i13 = 1 << i12;
                if ((((long) i13) & j10) == 0) {
                    if (i12 < 6) {
                        j10 &= (long) (i13 - 1);
                        i11 = 7 - i12;
                        break;
                    }
                    if (i12 == 7) {
                        i11 = 1;
                        break;
                    }
                } else {
                    i12--;
                }
            }
            i11 = 0;
            break;
        }
        if (i11 == 0) {
            throw new NumberFormatException(androidx.viewpager2.adapter.a.a("Invalid UTF-8 sequence first byte: ", j10));
        }
        for (i10 = 1; i10 < i11; i10++) {
            byte b10 = this.f23131a[this.f23132b + i10];
            if ((b10 & 192) != 128) {
                throw new NumberFormatException(androidx.viewpager2.adapter.a.a("Invalid UTF-8 sequence continuation byte: ", j10));
            }
            j10 = (j10 << 6) | ((long) (b10 & 63));
        }
        this.f23132b += i11;
        return j10;
    }

    public final int a() {
        return this.f23133c - this.f23132b;
    }

    public final String a(int i10, Charset charset) {
        String str = new String(this.f23131a, this.f23132b, i10, charset);
        this.f23132b += i10;
        return str;
    }

    public final void a(int i10) {
        byte[] bArr = this.f23131a;
        if (i10 > bArr.length) {
            this.f23131a = Arrays.copyOf(bArr, i10);
        }
    }

    public final void a(int i10, byte[] bArr) {
        this.f23131a = bArr;
        this.f23133c = i10;
        this.f23132b = 0;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f23131a, this.f23132b, bArr, i10, i11);
        this.f23132b += i11;
    }

    public final int b() {
        return this.f23131a.length;
    }

    public final String b(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f23132b;
        int i12 = (i11 + i10) - 1;
        String strA = da1.a(this.f23131a, i11, (i12 >= this.f23133c || this.f23131a[i12] != 0) ? i10 : i10 - 1);
        this.f23132b += i10;
        return strA;
    }

    public final void c(int i10) {
        byte[] bArr = this.f23131a;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        a(i10, bArr);
    }

    public final byte[] c() {
        return this.f23131a;
    }

    public final int d() {
        return this.f23132b;
    }

    public final void d(int i10) {
        pa.a(i10 >= 0 && i10 <= this.f23131a.length);
        this.f23133c = i10;
    }

    public final int e() {
        return this.f23133c;
    }

    public final void e(int i10) {
        pa.a(i10 >= 0 && i10 <= this.f23133c);
        this.f23132b = i10;
    }

    public final char f() {
        byte[] bArr = this.f23131a;
        int i10 = this.f23132b;
        return (char) ((bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8));
    }

    public final void f(int i10) {
        e(this.f23132b + i10);
    }

    public final int g() {
        return this.f23131a[this.f23132b] & 255;
    }

    public final int h() {
        byte[] bArr = this.f23131a;
        int i10 = this.f23132b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = ((bArr[i10] & 255) << 24) | ((bArr[i11] & 255) << 16);
        int i14 = i12 + 1;
        int i15 = i13 | ((bArr[i12] & 255) << 8);
        this.f23132b = i14 + 1;
        return (bArr[i14] & 255) | i15;
    }

    public final int i() {
        byte[] bArr = this.f23131a;
        int i10 = this.f23132b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (((bArr[i10] & 255) << 24) >> 8) | ((bArr[i11] & 255) << 8);
        this.f23132b = i12 + 1;
        return (bArr[i12] & 255) | i13;
    }

    public final String j() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f23132b;
        while (i10 < this.f23133c) {
            byte b10 = this.f23131a[i10];
            int i11 = da1.f19803a;
            if (b10 == 10 || b10 == 13) {
                break;
            }
            i10++;
        }
        int i12 = this.f23132b;
        if (i10 - i12 >= 3) {
            byte[] bArr = this.f23131a;
            if (bArr[i12] == -17 && bArr[i12 + 1] == -69 && bArr[i12 + 2] == -65) {
                this.f23132b = i12 + 3;
            }
        }
        byte[] bArr2 = this.f23131a;
        int i13 = this.f23132b;
        String strA = da1.a(bArr2, i13, i10 - i13);
        this.f23132b = i10;
        int i14 = this.f23133c;
        if (i10 == i14) {
            return strA;
        }
        byte[] bArr3 = this.f23131a;
        if (bArr3[i10] == 13) {
            int i15 = i10 + 1;
            this.f23132b = i15;
            if (i15 == i14) {
                return strA;
            }
        }
        int i16 = this.f23132b;
        if (bArr3[i16] == 10) {
            this.f23132b = i16 + 1;
        }
        return strA;
    }

    public final int k() {
        byte[] bArr = this.f23131a;
        int i10 = this.f23132b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (bArr[i10] & 255) | ((bArr[i11] & 255) << 8);
        int i14 = i12 + 1;
        int i15 = i13 | ((bArr[i12] & 255) << 16);
        this.f23132b = i14 + 1;
        return ((bArr[i14] & 255) << 24) | i15;
    }

    public final long l() {
        byte[] bArr = this.f23131a;
        int i10 = this.f23132b;
        int i11 = i10 + 1;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8) | ((((long) bArr[i12]) & 255) << 16);
        int i14 = i13 + 1;
        long j12 = j11 | ((((long) bArr[i13]) & 255) << 24);
        int i15 = i14 + 1;
        long j13 = j12 | ((((long) bArr[i14]) & 255) << 32);
        int i16 = i15 + 1;
        long j14 = j13 | ((((long) bArr[i15]) & 255) << 40);
        int i17 = i16 + 1;
        long j15 = j14 | ((((long) bArr[i16]) & 255) << 48);
        this.f23132b = i17 + 1;
        return j15 | ((((long) bArr[i17]) & 255) << 56);
    }

    public final short m() {
        byte[] bArr = this.f23131a;
        int i10 = this.f23132b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.f23132b = i11 + 1;
        return (short) (((bArr[i11] & 255) << 8) | i12);
    }

    public final long n() {
        byte[] bArr = this.f23131a;
        int i10 = this.f23132b;
        int i11 = i10 + 1;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8) | ((((long) bArr[i12]) & 255) << 16);
        this.f23132b = i13 + 1;
        return j11 | ((((long) bArr[i13]) & 255) << 24);
    }

    public final int o() {
        byte[] bArr = this.f23131a;
        int i10 = this.f23132b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.f23132b = i11 + 1;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public final long p() {
        byte[] bArr = this.f23131a;
        int i10 = this.f23132b;
        int i11 = i10 + 1;
        long j10 = (((long) bArr[i10]) & 255) << 56;
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 48) | ((((long) bArr[i12]) & 255) << 40);
        int i14 = i13 + 1;
        long j12 = j11 | ((((long) bArr[i13]) & 255) << 32);
        int i15 = i14 + 1;
        long j13 = j12 | ((((long) bArr[i14]) & 255) << 24);
        int i16 = i15 + 1;
        long j14 = j13 | ((((long) bArr[i15]) & 255) << 16);
        int i17 = i16 + 1;
        long j15 = j14 | ((((long) bArr[i16]) & 255) << 8);
        this.f23132b = i17 + 1;
        return j15 | (((long) bArr[i17]) & 255);
    }

    public final String q() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f23132b;
        while (i10 < this.f23133c && this.f23131a[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.f23131a;
        int i11 = this.f23132b;
        String strA = da1.a(bArr, i11, i10 - i11);
        this.f23132b = i10;
        if (i10 < this.f23133c) {
            this.f23132b = i10 + 1;
        }
        return strA;
    }

    public final short r() {
        byte[] bArr = this.f23131a;
        int i10 = this.f23132b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & 255) << 8;
        this.f23132b = i11 + 1;
        return (short) ((bArr[i11] & 255) | i12);
    }

    public final int s() {
        return (t() << 21) | (t() << 14) | (t() << 7) | t();
    }

    public final int t() {
        byte[] bArr = this.f23131a;
        int i10 = this.f23132b;
        this.f23132b = i10 + 1;
        return bArr[i10] & 255;
    }

    public final int u() {
        byte[] bArr = this.f23131a;
        int i10 = this.f23132b;
        int i11 = i10 + 1;
        int i12 = (bArr[i11] & 255) | ((bArr[i10] & 255) << 8);
        this.f23132b = i11 + 1 + 2;
        return i12;
    }

    public final long v() {
        byte[] bArr = this.f23131a;
        int i10 = this.f23132b;
        int i11 = i10 + 1;
        long j10 = (((long) bArr[i10]) & 255) << 24;
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 16) | ((((long) bArr[i12]) & 255) << 8);
        this.f23132b = i13 + 1;
        return j11 | (((long) bArr[i13]) & 255);
    }

    public final int w() {
        byte[] bArr = this.f23131a;
        int i10 = this.f23132b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = ((bArr[i10] & 255) << 16) | ((bArr[i11] & 255) << 8);
        this.f23132b = i12 + 1;
        return (bArr[i12] & 255) | i13;
    }

    public final int x() {
        int iH = h();
        if (iH >= 0) {
            return iH;
        }
        throw new IllegalStateException(u60.a("Top bit not zero: ", iH));
    }

    public final long y() {
        long jP = p();
        if (jP >= 0) {
            return jP;
        }
        throw new IllegalStateException(androidx.viewpager2.adapter.a.a("Top bit not zero: ", jP));
    }

    public final int z() {
        byte[] bArr = this.f23131a;
        int i10 = this.f23132b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & 255) << 8;
        this.f23132b = i11 + 1;
        return (bArr[i11] & 255) | i12;
    }
}
