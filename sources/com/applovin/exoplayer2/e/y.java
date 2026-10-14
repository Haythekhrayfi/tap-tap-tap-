package com.applovin.exoplayer2.e;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f6146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6149d;

    public y(byte[] bArr) {
        this.f6146a = bArr;
        this.f6147b = bArr.length;
    }

    private void c() {
        int i10;
        int i11 = this.f6148c;
        com.applovin.exoplayer2.l.a.b(i11 >= 0 && (i11 < (i10 = this.f6147b) || (i11 == i10 && this.f6149d == 0)));
    }

    public int a(int i10) {
        int i11 = this.f6148c;
        int iMin = Math.min(i10, 8 - this.f6149d);
        int i12 = i11 + 1;
        int i13 = ((this.f6146a[i11] & 255) >> this.f6149d) & (255 >> (8 - iMin));
        while (iMin < i10) {
            i13 |= (this.f6146a[i12] & 255) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        b(i10);
        return i14;
    }

    public boolean a() {
        boolean z10 = (((this.f6146a[this.f6148c] & 255) >> this.f6149d) & 1) == 1;
        b(1);
        return z10;
    }

    public int b() {
        return (this.f6148c * 8) + this.f6149d;
    }

    public void b(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f6148c + i11;
        this.f6148c = i12;
        int i13 = (i10 - (i11 * 8)) + this.f6149d;
        this.f6149d = i13;
        if (i13 > 7) {
            this.f6148c = i12 + 1;
            this.f6149d = i13 - 8;
        }
        c();
    }
}
