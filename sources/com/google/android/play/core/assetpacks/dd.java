package com.google.android.play.core.assetpacks;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class dd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f12108a = new byte[4096];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f12109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f12110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f12111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f12112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f12113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f12114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f12115h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f12116i;

    public dd() {
        c();
    }

    private final int a(int i10, byte[] bArr, int i11, int i12) {
        int i13 = this.f12109b;
        if (i13 >= i10) {
            return 0;
        }
        int iMin = Math.min(i12, i10 - i13);
        System.arraycopy(bArr, i11, this.f12108a, this.f12109b, iMin);
        int i14 = this.f12109b + iMin;
        this.f12109b = i14;
        if (i14 < i10) {
            return -1;
        }
        return iMin;
    }

    public final int a(byte[] bArr, int i10, int i11) {
        int iA = a(30, bArr, i10, i11);
        if (iA == -1) {
            return -1;
        }
        if (this.f12110c == -1) {
            long jB = db.b(this.f12108a, 0);
            this.f12110c = jB;
            if (jB == 67324752) {
                this.f12115h = false;
                this.f12111d = db.b(this.f12108a, 18);
                this.f12114g = db.c(this.f12108a, 8);
                this.f12112e = db.c(this.f12108a, 26);
                int iC = this.f12112e + 30 + db.c(this.f12108a, 28);
                this.f12113f = iC;
                int length = this.f12108a.length;
                if (length < iC) {
                    do {
                        length += length;
                    } while (length < iC);
                    this.f12108a = Arrays.copyOf(this.f12108a, length);
                }
            } else {
                this.f12115h = true;
            }
        }
        int iA2 = a(this.f12113f, bArr, i10 + iA, i11 - iA);
        if (iA2 == -1) {
            return -1;
        }
        int i12 = iA + iA2;
        if (!this.f12115h && this.f12116i == null) {
            this.f12116i = new String(this.f12108a, 30, this.f12112e);
        }
        return i12;
    }

    public final dx a() {
        int i10 = this.f12109b;
        int i11 = this.f12113f;
        if (i10 < i11) {
            return dx.a(this.f12116i, this.f12111d, this.f12114g, true, Arrays.copyOf(this.f12108a, i10), this.f12115h);
        }
        dx dxVarA = dx.a(this.f12116i, this.f12111d, this.f12114g, false, Arrays.copyOf(this.f12108a, i11), this.f12115h);
        c();
        return dxVarA;
    }

    public final int b() {
        return this.f12113f;
    }

    public final void c() {
        this.f12109b = 0;
        this.f12112e = -1;
        this.f12110c = -1L;
        this.f12115h = false;
        this.f12113f = 30;
        this.f12111d = -1L;
        this.f12114g = -1;
        this.f12116i = null;
    }
}
