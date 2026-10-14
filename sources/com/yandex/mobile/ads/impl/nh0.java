package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class nh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f23389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23390e;

    public nh0(int i10) {
        this.f23386a = i10;
        byte[] bArr = new byte[131];
        this.f23389d = bArr;
        bArr[2] = 1;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f23387b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f23389d;
            int length = bArr2.length;
            int i13 = this.f23390e + i12;
            if (length < i13) {
                this.f23389d = Arrays.copyOf(bArr2, i13 * 2);
            }
            System.arraycopy(bArr, i10, this.f23389d, this.f23390e, i12);
            this.f23390e += i12;
        }
    }

    public final boolean a() {
        return this.f23388c;
    }

    public final boolean a(int i10) {
        if (!this.f23387b) {
            return false;
        }
        this.f23390e -= i10;
        this.f23387b = false;
        this.f23388c = true;
        return true;
    }

    public final void b() {
        this.f23387b = false;
        this.f23388c = false;
    }

    public final void b(int i10) {
        pa.b(!this.f23387b);
        boolean z10 = i10 == this.f23386a;
        this.f23387b = z10;
        if (z10) {
            this.f23390e = 3;
            this.f23388c = false;
        }
    }
}
