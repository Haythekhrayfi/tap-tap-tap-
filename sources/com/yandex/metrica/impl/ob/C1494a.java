package com.yandex.metrica.impl.ob;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1494a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f15713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f15714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f15715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f15716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f15717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f15718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f15719g = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f15720h;

    private C1494a(byte[] bArr, int i10, int i11) {
        this.f15713a = bArr;
        this.f15714b = i10;
        this.f15715c = i11 + i10;
        this.f15717e = i10;
    }

    public static C1494a a(byte[] bArr, int i10, int i11) {
        return new C1494a(bArr, i10, i11);
    }

    private void m() {
        int i10 = this.f15715c + this.f15716d;
        this.f15715c = i10;
        int i11 = this.f15719g;
        if (i10 <= i11) {
            this.f15716d = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f15716d = i12;
        this.f15715c = i10 - i12;
    }

    public int a() {
        int i10 = this.f15719g;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - this.f15717e;
    }

    public void a(int i10) throws C1569d {
        if (this.f15718f != i10) {
            throw new C1569d("Protocol message end-group tag did not match expected tag.");
        }
    }

    public void a(AbstractC1594e abstractC1594e) throws IOException {
        int iH = h();
        if (this.f15720h >= 64) {
            throw new C1569d("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iC = c(iH);
        this.f15720h++;
        abstractC1594e.a(this);
        a(0);
        this.f15720h--;
        this.f15719g = iC;
        m();
    }

    public int b() {
        return this.f15717e - this.f15714b;
    }

    public void b(int i10) {
        this.f15719g = i10;
        m();
    }

    public int c(int i10) throws C1569d {
        if (i10 < 0) {
            throw C1569d.a();
        }
        int i11 = i10 + this.f15717e;
        int i12 = this.f15719g;
        if (i11 > i12) {
            throw C1569d.b();
        }
        this.f15719g = i11;
        m();
        return i12;
    }

    public boolean c() throws IOException {
        return h() != 0;
    }

    public byte[] d() throws IOException {
        int iH = h();
        int i10 = this.f15715c;
        int i11 = this.f15717e;
        if (iH > i10 - i11 || iH <= 0) {
            return d(iH);
        }
        byte[] bArr = new byte[iH];
        System.arraycopy(this.f15713a, i11, bArr, 0, iH);
        this.f15717e += iH;
        return bArr;
    }

    public byte[] d(int i10) throws IOException {
        if (i10 < 0) {
            throw C1569d.a();
        }
        int i11 = this.f15717e;
        int i12 = i11 + i10;
        int i13 = this.f15719g;
        if (i12 > i13) {
            g(i13 - i11);
            throw C1569d.b();
        }
        if (i10 > this.f15715c - i11) {
            throw C1569d.b();
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f15713a, i11, bArr, 0, i10);
        this.f15717e += i10;
        return bArr;
    }

    public byte e() throws IOException {
        int i10 = this.f15717e;
        if (i10 == this.f15715c) {
            throw C1569d.b();
        }
        byte[] bArr = this.f15713a;
        this.f15717e = i10 + 1;
        return bArr[i10];
    }

    public void e(int i10) {
        int i11 = this.f15717e;
        int i12 = this.f15714b;
        if (i10 > i11 - i12) {
            StringBuilder sbA = androidx.appcompat.widget.r0.a("Position ", i10, " is beyond current ");
            sbA.append(this.f15717e - this.f15714b);
            throw new IllegalArgumentException(sbA.toString());
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("Bad position ", i10));
        }
        this.f15717e = i12 + i10;
    }

    public int f() throws IOException {
        return (e() & 255) | ((e() & 255) << 8) | ((e() & 255) << 16) | ((e() & 255) << 24);
    }

    public boolean f(int i10) throws IOException {
        int iL;
        int i11 = i10 & 7;
        if (i11 == 0) {
            h();
            return true;
        }
        if (i11 == 1) {
            g();
            return true;
        }
        if (i11 == 2) {
            g(h());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw new C1569d("Protocol message tag had invalid wire type.");
            }
            f();
            return true;
        }
        do {
            iL = l();
            if (iL == 0) {
                break;
            }
        } while (f(iL));
        a(C1644g.a(i10 >>> 3, 4));
        return true;
    }

    public long g() throws IOException {
        byte bE = e();
        return ((((long) e()) & 255) << 8) | (((long) bE) & 255) | ((((long) e()) & 255) << 16) | ((((long) e()) & 255) << 24) | ((((long) e()) & 255) << 32) | ((((long) e()) & 255) << 40) | ((((long) e()) & 255) << 48) | ((((long) e()) & 255) << 56);
    }

    public void g(int i10) throws IOException {
        if (i10 < 0) {
            throw C1569d.a();
        }
        int i11 = this.f15717e;
        int i12 = i11 + i10;
        int i13 = this.f15719g;
        if (i12 > i13) {
            g(i13 - i11);
            throw C1569d.b();
        }
        if (i10 > this.f15715c - i11) {
            throw C1569d.b();
        }
        this.f15717e = i12;
    }

    public int h() throws IOException {
        int i10;
        byte bE = e();
        if (bE >= 0) {
            return bE;
        }
        int i11 = bE & Ascii.DEL;
        byte bE2 = e();
        if (bE2 >= 0) {
            i10 = bE2 << 7;
        } else {
            i11 |= (bE2 & Ascii.DEL) << 7;
            byte bE3 = e();
            if (bE3 >= 0) {
                i10 = bE3 << 14;
            } else {
                i11 |= (bE3 & Ascii.DEL) << 14;
                byte bE4 = e();
                if (bE4 < 0) {
                    int i12 = i11 | ((bE4 & Ascii.DEL) << 21);
                    byte bE5 = e();
                    int i13 = i12 | (bE5 << Ascii.FS);
                    if (bE5 >= 0) {
                        return i13;
                    }
                    for (int i14 = 0; i14 < 5; i14++) {
                        if (e() >= 0) {
                            return i13;
                        }
                    }
                    throw new C1569d("CodedInputStream encountered a malformed varint.");
                }
                i10 = bE4 << 21;
            }
        }
        return i11 | i10;
    }

    public long i() throws IOException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte bE = e();
            j10 |= ((long) (bE & Ascii.DEL)) << i10;
            if ((bE & 128) == 0) {
                return j10;
            }
        }
        throw new C1569d("CodedInputStream encountered a malformed varint.");
    }

    public int j() throws IOException {
        int iH = h();
        return (-(iH & 1)) ^ (iH >>> 1);
    }

    public String k() throws IOException {
        int iH = h();
        int i10 = this.f15715c;
        int i11 = this.f15717e;
        if (iH > i10 - i11 || iH <= 0) {
            return new String(d(iH), "UTF-8");
        }
        String str = new String(this.f15713a, i11, iH, "UTF-8");
        this.f15717e += iH;
        return str;
    }

    public int l() throws IOException {
        if (this.f15717e == this.f15715c) {
            this.f15718f = 0;
            return 0;
        }
        int iH = h();
        this.f15718f = iH;
        if (iH != 0) {
            return iH;
        }
        throw new C1569d("Protocol message contained an invalid tag (zero).");
    }
}
