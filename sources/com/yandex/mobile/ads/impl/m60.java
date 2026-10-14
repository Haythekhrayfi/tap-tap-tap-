package com.yandex.mobile.ads.impl;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class m60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f22917a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22918b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22919c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f22920d = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22921e = 15;

    public final void a() {
        this.f22917a = 0;
        this.f22918b = -1;
        this.f22919c = 0;
    }

    public final void a(int i10) {
        int i11 = this.f22919c;
        int[] iArr = this.f22920d;
        if (i11 == iArr.length) {
            int length = iArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i12 = this.f22917a;
            int i13 = length2 - i12;
            System.arraycopy(iArr, i12, iArr2, 0, i13);
            System.arraycopy(this.f22920d, 0, iArr2, i13, i12);
            this.f22917a = 0;
            this.f22918b = this.f22919c - 1;
            this.f22920d = iArr2;
            this.f22921e = length - 1;
        }
        int i14 = (this.f22918b + 1) & this.f22921e;
        this.f22918b = i14;
        this.f22920d[i14] = i10;
        this.f22919c++;
    }

    public final boolean b() {
        return this.f22919c == 0;
    }

    public final int c() {
        int i10 = this.f22919c;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f22920d;
        int i11 = this.f22917a;
        int i12 = iArr[i11];
        this.f22917a = (i11 + 1) & this.f22921e;
        this.f22919c = i10 - 1;
        return i12;
    }
}
