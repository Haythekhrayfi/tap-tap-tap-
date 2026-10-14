package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class Pf extends AbstractC1594e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile Pf[] f14721h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f14724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f14725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Of[] f14727g;

    public Pf() {
        b();
    }

    public static Pf[] c() {
        if (f14721h == null) {
            synchronized (C1544c.f15862a) {
                if (f14721h == null) {
                    f14721h = new Pf[0];
                }
            }
        }
        return f14721h;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public int a() {
        int i10 = 0;
        int iB = C1519b.b(2, this.f14723c) + C1519b.a(1, this.f14722b) + 0;
        long j10 = this.f14724d;
        int iA = C1519b.a((j10 >> 63) ^ (j10 << 1)) + C1519b.c(3) + iB;
        if (!this.f14725e.equals("")) {
            iA += C1519b.a(4, this.f14725e);
        }
        int i11 = this.f14726f;
        if (i11 != 0) {
            iA += C1519b.c(5, i11);
        }
        Of[] ofArr = this.f14727g;
        if (ofArr != null && ofArr.length > 0) {
            while (true) {
                Of[] ofArr2 = this.f14727g;
                if (i10 >= ofArr2.length) {
                    break;
                }
                Of of = ofArr2[i10];
                if (of != null) {
                    iA += C1519b.a(6, of);
                }
                i10++;
            }
        }
        return iA;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public AbstractC1594e a(C1494a c1494a) throws IOException {
        while (true) {
            int iL = c1494a.l();
            if (iL == 0) {
                break;
            }
            if (iL == 10) {
                this.f14722b = c1494a.k();
            } else if (iL == 16) {
                this.f14723c = c1494a.j();
            } else if (iL == 24) {
                long jI = c1494a.i();
                this.f14724d = (-(jI & 1)) ^ (jI >>> 1);
            } else if (iL == 34) {
                this.f14725e = c1494a.k();
            } else if (iL == 40) {
                this.f14726f = c1494a.h();
            } else if (iL == 50) {
                int iA = C1644g.a(c1494a, 50);
                Of[] ofArr = this.f14727g;
                int length = ofArr == null ? 0 : ofArr.length;
                int i10 = iA + length;
                Of[] ofArr2 = new Of[i10];
                if (length != 0) {
                    System.arraycopy(ofArr, 0, ofArr2, 0, length);
                }
                while (length < i10 - 1) {
                    ofArr2[length] = new Of();
                    c1494a.a(ofArr2[length]);
                    c1494a.l();
                    length++;
                }
                ofArr2[length] = new Of();
                c1494a.a(ofArr2[length]);
                this.f14727g = ofArr2;
            } else if (!c1494a.f(iL)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public void a(C1519b c1519b) throws IOException {
        c1519b.b(1, this.f14722b);
        c1519b.e(2, this.f14723c);
        c1519b.d(3, this.f14724d);
        if (!this.f14725e.equals("")) {
            c1519b.b(4, this.f14725e);
        }
        int i10 = this.f14726f;
        if (i10 != 0) {
            c1519b.f(5, i10);
        }
        Of[] ofArr = this.f14727g;
        if (ofArr == null || ofArr.length <= 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            Of[] ofArr2 = this.f14727g;
            if (i11 >= ofArr2.length) {
                return;
            }
            Of of = ofArr2[i11];
            if (of != null) {
                c1519b.b(6, of);
            }
            i11++;
        }
    }

    public Pf b() {
        this.f14722b = "";
        this.f14723c = 0;
        this.f14724d = 0L;
        this.f14725e = "";
        this.f14726f = 0;
        this.f14727g = Of.c();
        this.f15981a = -1;
        return this;
    }
}
