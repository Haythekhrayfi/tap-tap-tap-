package com.applovin.exoplayer2.f;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6222a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6223b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6224c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f6225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f6226e;

    public f() {
        int[] iArr = new int[16];
        this.f6225d = iArr;
        this.f6226e = iArr.length - 1;
    }

    private void d() {
        int[] iArr = this.f6225d;
        int length = iArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        int[] iArr2 = new int[length];
        int length2 = iArr.length;
        int i10 = this.f6222a;
        int i11 = length2 - i10;
        System.arraycopy(iArr, i10, iArr2, 0, i11);
        System.arraycopy(this.f6225d, 0, iArr2, i11, i10);
        this.f6222a = 0;
        this.f6223b = this.f6224c - 1;
        this.f6225d = iArr2;
        this.f6226e = iArr2.length - 1;
    }

    public int a() {
        int i10 = this.f6224c;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f6225d;
        int i11 = this.f6222a;
        int i12 = iArr[i11];
        this.f6222a = (i11 + 1) & this.f6226e;
        this.f6224c = i10 - 1;
        return i12;
    }

    public void a(int i10) {
        if (this.f6224c == this.f6225d.length) {
            d();
        }
        int i11 = (this.f6223b + 1) & this.f6226e;
        this.f6223b = i11;
        this.f6225d[i11] = i10;
        this.f6224c++;
    }

    public boolean b() {
        return this.f6224c == 0;
    }

    public void c() {
        this.f6222a = 0;
        this.f6223b = -1;
        this.f6224c = 0;
    }
}
