package com.applovin.exoplayer2.l;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f7695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f7698d;

    public z(byte[] bArr, int i10, int i11) {
        a(bArr, i10, i11);
    }

    private boolean d(int i10) {
        if (2 <= i10 && i10 < this.f7696b) {
            byte[] bArr = this.f7695a;
            if (bArr[i10] == 3 && bArr[i10 - 2] == 0 && bArr[i10 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    private int f() {
        int i10 = 0;
        while (!b()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? c(i10) : 0);
    }

    private void g() {
        int i10;
        int i11 = this.f7697c;
        a.b(i11 >= 0 && (i11 < (i10 = this.f7696b) || (i11 == i10 && this.f7698d == 0)));
    }

    public void a() {
        int i10 = this.f7698d + 1;
        this.f7698d = i10;
        if (i10 == 8) {
            this.f7698d = 0;
            int i11 = this.f7697c;
            this.f7697c = i11 + (d(i11 + 1) ? 2 : 1);
        }
        g();
    }

    public void a(int i10) {
        int i11 = this.f7697c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f7697c = i13;
        int i14 = (i10 - (i12 * 8)) + this.f7698d;
        this.f7698d = i14;
        if (i14 > 7) {
            this.f7697c = i13 + 1;
            this.f7698d = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.f7697c) {
                g();
                return;
            } else if (d(i11)) {
                this.f7697c++;
                i11 += 2;
            }
        }
    }

    public void a(byte[] bArr, int i10, int i11) {
        this.f7695a = bArr;
        this.f7697c = i10;
        this.f7696b = i11;
        this.f7698d = 0;
        g();
    }

    public boolean b() {
        boolean z10 = (this.f7695a[this.f7697c] & (128 >> this.f7698d)) != 0;
        a();
        return z10;
    }

    public boolean b(int i10) {
        int i11 = this.f7697c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f7698d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f7696b) {
                break;
            }
            if (d(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f7696b;
        if (i13 >= i15) {
            return i13 == i15 && i14 == 0;
        }
        return true;
    }

    public int c(int i10) {
        int i11;
        this.f7698d += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f7698d;
            int i13 = 2;
            if (i11 <= 8) {
                break;
            }
            int i14 = i11 - 8;
            this.f7698d = i14;
            byte[] bArr = this.f7695a;
            int i15 = this.f7697c;
            i12 |= (bArr[i15] & 255) << i14;
            if (!d(i15 + 1)) {
                i13 = 1;
            }
            this.f7697c = i15 + i13;
        }
        byte[] bArr2 = this.f7695a;
        int i16 = this.f7697c;
        int i17 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i16] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f7698d = 0;
            this.f7697c = i16 + (d(i16 + 1) ? 2 : 1);
        }
        g();
        return i17;
    }

    public boolean c() {
        int i10 = this.f7697c;
        int i11 = this.f7698d;
        int i12 = 0;
        while (this.f7697c < this.f7696b && !b()) {
            i12++;
        }
        boolean z10 = this.f7697c == this.f7696b;
        this.f7697c = i10;
        this.f7698d = i11;
        return !z10 && b((i12 * 2) + 1);
    }

    public int d() {
        return f();
    }

    public int e() {
        int iF = f();
        return ((iF + 1) / 2) * (iF % 2 == 0 ? -1 : 1);
    }
}
