package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.cg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1561cg extends AbstractC1594e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a[] f15879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15880c;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.cg$a */
    public static final class a extends AbstractC1594e {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static volatile a[] f15881g;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15882b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f15883c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f15884d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f15885e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f15886f;

        public a() {
            b();
        }

        public static a[] c() {
            if (f15881g == null) {
                synchronized (C1544c.f15862a) {
                    if (f15881g == null) {
                        f15881g = new a[0];
                    }
                }
            }
            return f15881g;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            return C1519b.b(5, this.f15886f) + C1519b.b(4, this.f15885e) + C1519b.a(3, this.f15884d) + C1519b.a(2, this.f15883c) + C1519b.a(1, this.f15882b) + 0;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 8) {
                    int iH = c1494a.h();
                    if (iH == 1 || iH == 2 || iH == 3) {
                        this.f15882b = iH;
                    }
                } else if (iL == 18) {
                    this.f15883c = c1494a.k();
                } else if (iL == 26) {
                    this.f15884d = c1494a.k();
                } else if (iL == 32) {
                    this.f15885e = c1494a.i();
                } else if (iL == 40) {
                    this.f15886f = c1494a.i();
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            c1519b.d(1, this.f15882b);
            c1519b.b(2, this.f15883c);
            c1519b.b(3, this.f15884d);
            c1519b.e(4, this.f15885e);
            c1519b.e(5, this.f15886f);
        }

        public a b() {
            this.f15882b = 1;
            this.f15883c = "";
            this.f15884d = "";
            this.f15885e = 0L;
            this.f15886f = 0L;
            this.f15981a = -1;
            return this;
        }
    }

    public C1561cg() {
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public int a() {
        a[] aVarArr = this.f15879b;
        int i10 = 0;
        if (aVarArr != null && aVarArr.length > 0) {
            int iA = 0;
            while (true) {
                a[] aVarArr2 = this.f15879b;
                if (i10 >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i10];
                if (aVar != null) {
                    iA += C1519b.a(1, aVar);
                }
                i10++;
            }
            i10 = iA;
        }
        return C1519b.a(2, this.f15880c) + i10;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public AbstractC1594e a(C1494a c1494a) throws IOException {
        while (true) {
            int iL = c1494a.l();
            if (iL == 0) {
                break;
            }
            if (iL == 10) {
                int iA = C1644g.a(c1494a, 10);
                a[] aVarArr = this.f15879b;
                int length = aVarArr == null ? 0 : aVarArr.length;
                int i10 = iA + length;
                a[] aVarArr2 = new a[i10];
                if (length != 0) {
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                }
                while (length < i10 - 1) {
                    aVarArr2[length] = new a();
                    c1494a.a(aVarArr2[length]);
                    c1494a.l();
                    length++;
                }
                aVarArr2[length] = new a();
                c1494a.a(aVarArr2[length]);
                this.f15879b = aVarArr2;
            } else if (iL == 16) {
                this.f15880c = c1494a.c();
            } else if (!c1494a.f(iL)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public void a(C1519b c1519b) throws IOException {
        a[] aVarArr = this.f15879b;
        if (aVarArr != null && aVarArr.length > 0) {
            int i10 = 0;
            while (true) {
                a[] aVarArr2 = this.f15879b;
                if (i10 >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i10];
                if (aVar != null) {
                    c1519b.b(1, aVar);
                }
                i10++;
            }
        }
        c1519b.b(2, this.f15880c);
    }

    public C1561cg b() {
        this.f15879b = a.c();
        this.f15880c = false;
        this.f15981a = -1;
        return this;
    }
}
