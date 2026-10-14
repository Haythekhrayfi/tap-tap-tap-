package com.applovin.exoplayer2.e.i;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f6005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f6007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f6008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f6009e;

    public r(int i10, int i11) {
        this.f6007c = i10;
        byte[] bArr = new byte[i11 + 3];
        this.f6005a = bArr;
        bArr[2] = 1;
    }

    public void a() {
        this.f6008d = false;
        this.f6009e = false;
    }

    public void a(int i10) {
        com.applovin.exoplayer2.l.a.b(!this.f6008d);
        boolean z10 = i10 == this.f6007c;
        this.f6008d = z10;
        if (z10) {
            this.f6006b = 3;
            this.f6009e = false;
        }
    }

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f6008d) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f6005a;
            int length = bArr2.length;
            int i13 = this.f6006b;
            if (length < i13 + i12) {
                this.f6005a = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f6005a, this.f6006b, i12);
            this.f6006b += i12;
        }
    }

    public boolean b() {
        return this.f6009e;
    }

    public boolean b(int i10) {
        if (!this.f6008d) {
            return false;
        }
        this.f6006b -= i10;
        this.f6008d = false;
        this.f6009e = true;
        return true;
    }
}
