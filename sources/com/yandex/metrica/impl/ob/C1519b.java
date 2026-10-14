package com.yandex.metrica.impl.ob;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1519b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f15773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f15774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f15775c;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.b$a */
    public static class a extends IOException {
        public a(int i10, int i11) {
            super(j1.e.a("CodedOutputStream was writing to a flat byte array and ran out of space (pos ", i10, " limit ", i11, ")."));
        }
    }

    private C1519b(byte[] bArr, int i10, int i11) {
        this.f15773a = bArr;
        this.f15775c = i10;
        this.f15774b = i10 + i11;
    }

    public static int a(int i10) {
        if (i10 >= 0) {
            return b(i10);
        }
        return 10;
    }

    public static int a(int i10, double d10) {
        return c(i10) + 8;
    }

    public static int a(int i10, int i11) {
        return a(i11) + c(i10);
    }

    public static int a(int i10, long j10) {
        return a(j10) + c(i10);
    }

    public static int a(int i10, AbstractC1594e abstractC1594e) {
        int iC = c(i10);
        int iA = abstractC1594e.a();
        abstractC1594e.f15981a = iA;
        return b(iA) + iA + iC;
    }

    public static int a(int i10, String str) {
        return a(str) + c(i10);
    }

    public static int a(int i10, boolean z10) {
        return c(i10) + 1;
    }

    public static int a(int i10, byte[] bArr) {
        return b(bArr.length) + bArr.length + c(i10);
    }

    public static int a(long j10) {
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (((-16384) & j10) == 0) {
            return 2;
        }
        if (((-2097152) & j10) == 0) {
            return 3;
        }
        if (((-268435456) & j10) == 0) {
            return 4;
        }
        if (((-34359738368L) & j10) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j10) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j10) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j10) == 0) {
            return 8;
        }
        return (j10 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int a(AbstractC1594e abstractC1594e) {
        int iA = abstractC1594e.a();
        abstractC1594e.f15981a = iA;
        return b(iA) + iA;
    }

    public static int a(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return b(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 not supported.");
        }
    }

    public static C1519b a(byte[] bArr, int i10, int i11) {
        return new C1519b(bArr, i10, i11);
    }

    public static int b(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int b(int i10, int i11) {
        return b((i11 >> 31) ^ (i11 << 1)) + c(i10);
    }

    public static int b(int i10, long j10) {
        return a(j10) + c(i10);
    }

    public static int c(int i10) {
        return b(C1644g.a(i10, 0));
    }

    public static int c(int i10, int i11) {
        return b(i11) + c(i10);
    }

    public void a() {
        if (this.f15774b - this.f15775c != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public void a(int i10, float f10) throws IOException {
        e(C1644g.a(i10, 5));
        int iFloatToIntBits = Float.floatToIntBits(f10);
        d(iFloatToIntBits & 255);
        d((iFloatToIntBits >> 8) & 255);
        d((iFloatToIntBits >> 16) & 255);
        d((iFloatToIntBits >> 24) & 255);
    }

    public void a(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i10 = this.f15774b;
        int i11 = this.f15775c;
        if (i10 - i11 < length) {
            throw new a(this.f15775c, this.f15774b);
        }
        System.arraycopy(bArr, 0, this.f15773a, i11, length);
        this.f15775c += length;
    }

    public void b(int i10, double d10) throws IOException {
        e(C1644g.a(i10, 1));
        long jDoubleToLongBits = Double.doubleToLongBits(d10);
        d(((int) jDoubleToLongBits) & 255);
        d(((int) (jDoubleToLongBits >> 8)) & 255);
        d(((int) (jDoubleToLongBits >> 16)) & 255);
        d(((int) (jDoubleToLongBits >> 24)) & 255);
        d(((int) (jDoubleToLongBits >> 32)) & 255);
        d(((int) (jDoubleToLongBits >> 40)) & 255);
        d(((int) (jDoubleToLongBits >> 48)) & 255);
        d(((int) (jDoubleToLongBits >> 56)) & 255);
    }

    public void b(int i10, AbstractC1594e abstractC1594e) throws IOException {
        e(C1644g.a(i10, 2));
        if (abstractC1594e.f15981a < 0) {
            abstractC1594e.f15981a = abstractC1594e.a();
        }
        e(abstractC1594e.f15981a);
        abstractC1594e.a(this);
    }

    public void b(int i10, String str) throws IOException {
        e(C1644g.a(i10, 2));
        byte[] bytes = str.getBytes("UTF-8");
        e(bytes.length);
        a(bytes);
    }

    public void b(int i10, boolean z10) throws IOException {
        e(C1644g.a(i10, 0));
        d(z10 ? 1 : 0);
    }

    public void b(int i10, byte[] bArr) throws IOException {
        e(C1644g.a(i10, 2));
        e(bArr.length);
        a(bArr);
    }

    public void b(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            d((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        d((int) j10);
    }

    public void c(int i10, long j10) throws IOException {
        e(C1644g.a(i10, 0));
        b(j10);
    }

    public void d(int i10) throws IOException {
        byte b10 = (byte) i10;
        int i11 = this.f15775c;
        if (i11 == this.f15774b) {
            throw new a(this.f15775c, this.f15774b);
        }
        byte[] bArr = this.f15773a;
        this.f15775c = i11 + 1;
        bArr[i11] = b10;
    }

    public void d(int i10, int i11) throws IOException {
        e(C1644g.a(i10, 0));
        if (i11 >= 0) {
            e(i11);
        } else {
            b(i11);
        }
    }

    public void d(int i10, long j10) throws IOException {
        e(C1644g.a(i10, 0));
        b((j10 >> 63) ^ (j10 << 1));
    }

    public void e(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            d((i10 & 127) | 128);
            i10 >>>= 7;
        }
        d(i10);
    }

    public void e(int i10, int i11) throws IOException {
        e(C1644g.a(i10, 0));
        e((i11 << 1) ^ (i11 >> 31));
    }

    public void e(int i10, long j10) throws IOException {
        e(C1644g.a(i10, 0));
        b(j10);
    }

    public void f(int i10, int i11) throws IOException {
        e(C1644g.a(i10, 0));
        e(i11);
    }
}
