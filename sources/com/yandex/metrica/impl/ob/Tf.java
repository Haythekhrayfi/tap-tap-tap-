package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class Tf extends AbstractC1594e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static volatile Tf[] f15085r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f15091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15092h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15093i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f15094j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f15095k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15096l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f15097m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f15098n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15099o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f15100p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f15101q;

    public Tf() {
        b();
    }

    public static Tf[] c() {
        if (f15085r == null) {
            synchronized (C1544c.f15862a) {
                if (f15085r == null) {
                    f15085r = new Tf[0];
                }
            }
        }
        return f15085r;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public int a() {
        int i10 = this.f15086b;
        int iC = i10 != -1 ? 0 + C1519b.c(1, i10) : 0;
        int i11 = this.f15087c;
        if (i11 != 0) {
            iC += C1519b.b(2, i11);
        }
        int i12 = this.f15088d;
        if (i12 != -1) {
            iC += C1519b.c(3, i12);
        }
        int i13 = this.f15089e;
        if (i13 != -1) {
            iC += C1519b.c(4, i13);
        }
        int i14 = this.f15090f;
        if (i14 != -1) {
            iC += C1519b.c(5, i14);
        }
        if (!this.f15091g.equals("")) {
            iC += C1519b.a(6, this.f15091g);
        }
        boolean z10 = this.f15092h;
        if (z10) {
            iC += C1519b.a(7, z10);
        }
        int i15 = this.f15093i;
        if (i15 != 0) {
            iC += C1519b.a(8, i15);
        }
        int i16 = this.f15094j;
        if (i16 != -1) {
            iC += C1519b.c(9, i16);
        }
        long j10 = this.f15095k;
        if (j10 != 0) {
            iC += C1519b.b(10, j10);
        }
        int i17 = this.f15096l;
        if (i17 != Integer.MAX_VALUE) {
            iC += C1519b.b(11, i17);
        }
        int i18 = this.f15097m;
        if (i18 != Integer.MAX_VALUE) {
            iC += C1519b.b(12, i18);
        }
        int i19 = this.f15098n;
        if (i19 != Integer.MAX_VALUE) {
            iC += C1519b.b(13, i19);
        }
        int i20 = this.f15099o;
        if (i20 != -1) {
            iC += C1519b.c(14, i20);
        }
        int i21 = this.f15100p;
        if (i21 != -1) {
            iC += C1519b.c(15, i21);
        }
        int i22 = this.f15101q;
        return i22 != -1 ? iC + C1519b.c(16, i22) : iC;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public AbstractC1594e a(C1494a c1494a) throws IOException {
        while (true) {
            int iL = c1494a.l();
            switch (iL) {
                case 0:
                    break;
                case 8:
                    this.f15086b = c1494a.h();
                    break;
                case 16:
                    this.f15087c = c1494a.j();
                    break;
                case 24:
                    this.f15088d = c1494a.h();
                    break;
                case 32:
                    this.f15089e = c1494a.h();
                    break;
                case 40:
                    this.f15090f = c1494a.h();
                    break;
                case 50:
                    this.f15091g = c1494a.k();
                    break;
                case 56:
                    this.f15092h = c1494a.c();
                    break;
                case 64:
                    int iH = c1494a.h();
                    if (iH == 0 || iH == 1 || iH == 2 || iH == 3 || iH == 4) {
                        this.f15093i = iH;
                    }
                    break;
                case 72:
                    this.f15094j = c1494a.h();
                    break;
                case 80:
                    this.f15095k = c1494a.i();
                    break;
                case 88:
                    this.f15096l = c1494a.j();
                    break;
                case 96:
                    this.f15097m = c1494a.j();
                    break;
                case 104:
                    this.f15098n = c1494a.j();
                    break;
                case 112:
                    this.f15099o = c1494a.h();
                    break;
                case 120:
                    this.f15100p = c1494a.h();
                    break;
                case 128:
                    this.f15101q = c1494a.h();
                    break;
                default:
                    if (!c1494a.f(iL)) {
                    }
                    break;
            }
        }
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public void a(C1519b c1519b) throws IOException {
        int i10 = this.f15086b;
        if (i10 != -1) {
            c1519b.f(1, i10);
        }
        int i11 = this.f15087c;
        if (i11 != 0) {
            c1519b.e(2, i11);
        }
        int i12 = this.f15088d;
        if (i12 != -1) {
            c1519b.f(3, i12);
        }
        int i13 = this.f15089e;
        if (i13 != -1) {
            c1519b.f(4, i13);
        }
        int i14 = this.f15090f;
        if (i14 != -1) {
            c1519b.f(5, i14);
        }
        if (!this.f15091g.equals("")) {
            c1519b.b(6, this.f15091g);
        }
        boolean z10 = this.f15092h;
        if (z10) {
            c1519b.b(7, z10);
        }
        int i15 = this.f15093i;
        if (i15 != 0) {
            c1519b.d(8, i15);
        }
        int i16 = this.f15094j;
        if (i16 != -1) {
            c1519b.f(9, i16);
        }
        long j10 = this.f15095k;
        if (j10 != 0) {
            c1519b.e(10, j10);
        }
        int i17 = this.f15096l;
        if (i17 != Integer.MAX_VALUE) {
            c1519b.e(11, i17);
        }
        int i18 = this.f15097m;
        if (i18 != Integer.MAX_VALUE) {
            c1519b.e(12, i18);
        }
        int i19 = this.f15098n;
        if (i19 != Integer.MAX_VALUE) {
            c1519b.e(13, i19);
        }
        int i20 = this.f15099o;
        if (i20 != -1) {
            c1519b.f(14, i20);
        }
        int i21 = this.f15100p;
        if (i21 != -1) {
            c1519b.f(15, i21);
        }
        int i22 = this.f15101q;
        if (i22 != -1) {
            c1519b.f(16, i22);
        }
    }

    public Tf b() {
        this.f15086b = -1;
        this.f15087c = 0;
        this.f15088d = -1;
        this.f15089e = -1;
        this.f15090f = -1;
        this.f15091g = "";
        this.f15092h = false;
        this.f15093i = 0;
        this.f15094j = -1;
        this.f15095k = 0L;
        this.f15096l = Integer.MAX_VALUE;
        this.f15097m = Integer.MAX_VALUE;
        this.f15098n = Integer.MAX_VALUE;
        this.f15099o = -1;
        this.f15100p = -1;
        this.f15101q = -1;
        this.f15981a = -1;
        return this;
    }
}
