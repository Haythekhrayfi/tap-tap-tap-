package com.applovin.exoplayer2.l;

import com.applovin.exoplayer2.common.base.Charsets;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f7692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7694c;

    public y() {
        this.f7692a = ai.f7600f;
    }

    public y(int i10) {
        this.f7692a = new byte[i10];
        this.f7694c = i10;
    }

    public y(byte[] bArr) {
        this.f7692a = bArr;
        this.f7694c = bArr.length;
    }

    public y(byte[] bArr, int i10) {
        this.f7692a = bArr;
        this.f7694c = i10;
    }

    public double A() {
        return Double.longBitsToDouble(s());
    }

    public String B() {
        return a((char) 0);
    }

    public String C() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f7693b;
        while (i10 < this.f7694c && !ai.a((int) this.f7692a[i10])) {
            i10++;
        }
        int i11 = this.f7693b;
        if (i10 - i11 >= 3) {
            byte[] bArr = this.f7692a;
            if (bArr[i11] == -17 && bArr[i11 + 1] == -69 && bArr[i11 + 2] == -65) {
                this.f7693b = i11 + 3;
            }
        }
        byte[] bArr2 = this.f7692a;
        int i12 = this.f7693b;
        String strA = ai.a(bArr2, i12, i10 - i12);
        this.f7693b = i10;
        int i13 = this.f7694c;
        if (i10 == i13) {
            return strA;
        }
        byte[] bArr3 = this.f7692a;
        if (bArr3[i10] == 13) {
            int i14 = i10 + 1;
            this.f7693b = i14;
            if (i14 == i13) {
                return strA;
            }
        }
        int i15 = this.f7693b;
        if (bArr3[i15] == 10) {
            this.f7693b = i15 + 1;
        }
        return strA;
    }

    public long D() {
        int i10;
        int i11;
        long j10 = this.f7692a[this.f7693b];
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
            byte b10 = this.f7692a[this.f7693b + i10];
            if ((b10 & 192) != 128) {
                throw new NumberFormatException(androidx.viewpager2.adapter.a.a("Invalid UTF-8 sequence continuation byte: ", j10));
            }
            j10 = (j10 << 6) | ((long) (b10 & 63));
        }
        this.f7693b += i11;
        return j10;
    }

    public int a() {
        return this.f7694c - this.f7693b;
    }

    public String a(char c10) {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f7693b;
        while (i10 < this.f7694c && this.f7692a[i10] != c10) {
            i10++;
        }
        byte[] bArr = this.f7692a;
        int i11 = this.f7693b;
        String strA = ai.a(bArr, i11, i10 - i11);
        this.f7693b = i10;
        if (i10 < this.f7694c) {
            this.f7693b = i10 + 1;
        }
        return strA;
    }

    public String a(int i10, Charset charset) {
        String str = new String(this.f7692a, this.f7693b, i10, charset);
        this.f7693b += i10;
        return str;
    }

    public void a(int i10) {
        a(e() < i10 ? new byte[i10] : this.f7692a, i10);
    }

    public void a(x xVar, int i10) {
        a(xVar.f7688a, 0, i10);
        xVar.a(0);
    }

    public void a(byte[] bArr) {
        a(bArr, bArr.length);
    }

    public void a(byte[] bArr, int i10) {
        this.f7692a = bArr;
        this.f7694c = i10;
        this.f7693b = 0;
    }

    public void a(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f7692a, this.f7693b, bArr, i10, i11);
        this.f7693b += i11;
    }

    public int b() {
        return this.f7694c;
    }

    public void b(int i10) {
        if (i10 > e()) {
            this.f7692a = Arrays.copyOf(this.f7692a, i10);
        }
    }

    public int c() {
        return this.f7693b;
    }

    public void c(int i10) {
        a.a(i10 >= 0 && i10 <= this.f7692a.length);
        this.f7694c = i10;
    }

    public void d(int i10) {
        a.a(i10 >= 0 && i10 <= this.f7694c);
        this.f7693b = i10;
    }

    public byte[] d() {
        return this.f7692a;
    }

    public int e() {
        return this.f7692a.length;
    }

    public void e(int i10) {
        d(this.f7693b + i10);
    }

    public int f() {
        return this.f7692a[this.f7693b] & 255;
    }

    public String f(int i10) {
        return a(i10, Charsets.UTF_8);
    }

    public char g() {
        byte[] bArr = this.f7692a;
        int i10 = this.f7693b;
        return (char) ((bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8));
    }

    public String g(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f7693b;
        int i12 = (i11 + i10) - 1;
        String strA = ai.a(this.f7692a, i11, (i12 >= this.f7694c || this.f7692a[i12] != 0) ? i10 : i10 - 1);
        this.f7693b += i10;
        return strA;
    }

    public int h() {
        byte[] bArr = this.f7692a;
        int i10 = this.f7693b;
        this.f7693b = i10 + 1;
        return bArr[i10] & 255;
    }

    public int i() {
        byte[] bArr = this.f7692a;
        int i10 = this.f7693b;
        int i11 = i10 + 1;
        this.f7693b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f7693b = i11 + 1;
        return (bArr[i11] & 255) | i12;
    }

    public int j() {
        byte[] bArr = this.f7692a;
        int i10 = this.f7693b;
        int i11 = i10 + 1;
        this.f7693b = i11;
        int i12 = bArr[i10] & 255;
        this.f7693b = i11 + 1;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public short k() {
        byte[] bArr = this.f7692a;
        int i10 = this.f7693b;
        int i11 = i10 + 1;
        this.f7693b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f7693b = i11 + 1;
        return (short) ((bArr[i11] & 255) | i12);
    }

    public short l() {
        byte[] bArr = this.f7692a;
        int i10 = this.f7693b;
        int i11 = i10 + 1;
        this.f7693b = i11;
        int i12 = bArr[i10] & 255;
        this.f7693b = i11 + 1;
        return (short) (((bArr[i11] & 255) << 8) | i12);
    }

    public int m() {
        byte[] bArr = this.f7692a;
        int i10 = this.f7693b;
        int i11 = i10 + 1;
        this.f7693b = i11;
        int i12 = (bArr[i10] & 255) << 16;
        int i13 = i11 + 1;
        this.f7693b = i13;
        int i14 = i12 | ((bArr[i11] & 255) << 8);
        this.f7693b = i13 + 1;
        return (bArr[i13] & 255) | i14;
    }

    public int n() {
        byte[] bArr = this.f7692a;
        int i10 = this.f7693b;
        int i11 = i10 + 1;
        this.f7693b = i11;
        int i12 = ((bArr[i10] & 255) << 24) >> 8;
        int i13 = i11 + 1;
        this.f7693b = i13;
        int i14 = i12 | ((bArr[i11] & 255) << 8);
        this.f7693b = i13 + 1;
        return (bArr[i13] & 255) | i14;
    }

    public long o() {
        byte[] bArr = this.f7692a;
        int i10 = this.f7693b;
        int i11 = i10 + 1;
        this.f7693b = i11;
        long j10 = (((long) bArr[i10]) & 255) << 24;
        int i12 = i11 + 1;
        this.f7693b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 16);
        int i13 = i12 + 1;
        this.f7693b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 8);
        this.f7693b = i13 + 1;
        return j12 | (((long) bArr[i13]) & 255);
    }

    public long p() {
        byte[] bArr = this.f7692a;
        int i10 = this.f7693b;
        int i11 = i10 + 1;
        this.f7693b = i11;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i11 + 1;
        this.f7693b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i12 + 1;
        this.f7693b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        this.f7693b = i13 + 1;
        return j12 | ((((long) bArr[i13]) & 255) << 24);
    }

    public int q() {
        byte[] bArr = this.f7692a;
        int i10 = this.f7693b;
        int i11 = i10 + 1;
        this.f7693b = i11;
        int i12 = (bArr[i10] & 255) << 24;
        int i13 = i11 + 1;
        this.f7693b = i13;
        int i14 = i12 | ((bArr[i11] & 255) << 16);
        int i15 = i13 + 1;
        this.f7693b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        this.f7693b = i15 + 1;
        return (bArr[i15] & 255) | i16;
    }

    public int r() {
        byte[] bArr = this.f7692a;
        int i10 = this.f7693b;
        int i11 = i10 + 1;
        this.f7693b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i11 + 1;
        this.f7693b = i13;
        int i14 = i12 | ((bArr[i11] & 255) << 8);
        int i15 = i13 + 1;
        this.f7693b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 16);
        this.f7693b = i15 + 1;
        return ((bArr[i15] & 255) << 24) | i16;
    }

    public long s() {
        byte[] bArr = this.f7692a;
        int i10 = this.f7693b;
        int i11 = i10 + 1;
        this.f7693b = i11;
        long j10 = (((long) bArr[i10]) & 255) << 56;
        int i12 = i11 + 1;
        this.f7693b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 48);
        int i13 = i12 + 1;
        this.f7693b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 40);
        int i14 = i13 + 1;
        this.f7693b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 32);
        int i15 = i14 + 1;
        this.f7693b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 24);
        int i16 = i15 + 1;
        this.f7693b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 16);
        int i17 = i16 + 1;
        this.f7693b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 8);
        this.f7693b = i17 + 1;
        return j16 | (((long) bArr[i17]) & 255);
    }

    public long t() {
        byte[] bArr = this.f7692a;
        int i10 = this.f7693b;
        int i11 = i10 + 1;
        this.f7693b = i11;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i11 + 1;
        this.f7693b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i12 + 1;
        this.f7693b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        int i14 = i13 + 1;
        this.f7693b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 24);
        int i15 = i14 + 1;
        this.f7693b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 32);
        int i16 = i15 + 1;
        this.f7693b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 40);
        int i17 = i16 + 1;
        this.f7693b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 48);
        this.f7693b = i17 + 1;
        return j16 | ((((long) bArr[i17]) & 255) << 56);
    }

    public int u() {
        byte[] bArr = this.f7692a;
        int i10 = this.f7693b;
        int i11 = i10 + 1;
        this.f7693b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        int i13 = i11 + 1;
        this.f7693b = i13;
        int i14 = (bArr[i11] & 255) | i12;
        this.f7693b = i13 + 2;
        return i14;
    }

    public int v() {
        return (h() << 21) | (h() << 14) | (h() << 7) | h();
    }

    public int w() {
        int iQ = q();
        if (iQ >= 0) {
            return iQ;
        }
        throw new IllegalStateException(android.support.v4.media.a.a("Top bit not zero: ", iQ));
    }

    public int x() {
        int iR = r();
        if (iR >= 0) {
            return iR;
        }
        throw new IllegalStateException(android.support.v4.media.a.a("Top bit not zero: ", iR));
    }

    public long y() {
        long jS = s();
        if (jS >= 0) {
            return jS;
        }
        throw new IllegalStateException(androidx.viewpager2.adapter.a.a("Top bit not zero: ", jS));
    }

    public float z() {
        return Float.intBitsToFloat(q());
    }
}
