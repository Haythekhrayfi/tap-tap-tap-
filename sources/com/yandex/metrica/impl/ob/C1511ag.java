package com.yandex.metrica.impl.ob;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ag, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1511ag extends AbstractC1594e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a[] f15749b;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ag$a */
    public static final class a extends AbstractC1594e {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static volatile a[] f15750f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f15751b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f15752c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public b f15753d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c f15754e;

        public a() {
            b();
        }

        public static a[] c() {
            if (f15750f == null) {
                synchronized (C1544c.f15862a) {
                    if (f15750f == null) {
                        f15750f = new a[0];
                    }
                }
            }
            return f15750f;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            int iA = C1519b.a(2, this.f15752c) + C1519b.a(1, this.f15751b) + 0;
            b bVar = this.f15753d;
            if (bVar != null) {
                iA += C1519b.a(3, bVar);
            }
            c cVar = this.f15754e;
            return cVar != null ? iA + C1519b.a(4, cVar) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            AbstractC1594e abstractC1594e;
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 10) {
                    this.f15751b = c1494a.d();
                } else if (iL != 16) {
                    if (iL == 26) {
                        if (this.f15753d == null) {
                            this.f15753d = new b();
                        }
                        abstractC1594e = this.f15753d;
                    } else if (iL == 34) {
                        if (this.f15754e == null) {
                            this.f15754e = new c();
                        }
                        abstractC1594e = this.f15754e;
                    } else if (!c1494a.f(iL)) {
                        break;
                    }
                    c1494a.a(abstractC1594e);
                } else {
                    int iH = c1494a.h();
                    if (iH == 0 || iH == 1 || iH == 2 || iH == 3) {
                        this.f15752c = iH;
                    }
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            c1519b.b(1, this.f15751b);
            c1519b.d(2, this.f15752c);
            b bVar = this.f15753d;
            if (bVar != null) {
                c1519b.b(3, bVar);
            }
            c cVar = this.f15754e;
            if (cVar != null) {
                c1519b.b(4, cVar);
            }
        }

        public a b() {
            this.f15751b = C1644g.f16157d;
            this.f15752c = 0;
            this.f15753d = null;
            this.f15754e = null;
            this.f15981a = -1;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ag$b */
    public static final class b extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f15755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f15756c;

        public b() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            boolean z10 = this.f15755b;
            int iA = z10 ? 0 + C1519b.a(1, z10) : 0;
            boolean z11 = this.f15756c;
            return z11 ? iA + C1519b.a(2, z11) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 8) {
                    this.f15755b = c1494a.c();
                } else if (iL == 16) {
                    this.f15756c = c1494a.c();
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            boolean z10 = this.f15755b;
            if (z10) {
                c1519b.b(1, z10);
            }
            boolean z11 = this.f15756c;
            if (z11) {
                c1519b.b(2, z11);
            }
        }

        public b b() {
            this.f15755b = false;
            this.f15756c = false;
            this.f15981a = -1;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ag$c */
    public static final class c extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f15757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double f15758c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public double f15759d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f15760e;

        public c() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            int iA = Arrays.equals(this.f15757b, C1644g.f16157d) ? 0 : 0 + C1519b.a(1, this.f15757b);
            if (Double.doubleToLongBits(this.f15758c) != Double.doubleToLongBits(0.0d)) {
                iA += C1519b.a(2, this.f15758c);
            }
            if (Double.doubleToLongBits(this.f15759d) != Double.doubleToLongBits(0.0d)) {
                iA += C1519b.a(3, this.f15759d);
            }
            boolean z10 = this.f15760e;
            return z10 ? iA + C1519b.a(4, z10) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 10) {
                    this.f15757b = c1494a.d();
                } else if (iL == 17) {
                    this.f15758c = Double.longBitsToDouble(c1494a.g());
                } else if (iL == 25) {
                    this.f15759d = Double.longBitsToDouble(c1494a.g());
                } else if (iL == 32) {
                    this.f15760e = c1494a.c();
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            if (!Arrays.equals(this.f15757b, C1644g.f16157d)) {
                c1519b.b(1, this.f15757b);
            }
            if (Double.doubleToLongBits(this.f15758c) != Double.doubleToLongBits(0.0d)) {
                c1519b.b(2, this.f15758c);
            }
            if (Double.doubleToLongBits(this.f15759d) != Double.doubleToLongBits(0.0d)) {
                c1519b.b(3, this.f15759d);
            }
            boolean z10 = this.f15760e;
            if (z10) {
                c1519b.b(4, z10);
            }
        }

        public c b() {
            this.f15757b = C1644g.f16157d;
            this.f15758c = 0.0d;
            this.f15759d = 0.0d;
            this.f15760e = false;
            this.f15981a = -1;
            return this;
        }
    }

    public C1511ag() {
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public int a() {
        a[] aVarArr = this.f15749b;
        int i10 = 0;
        if (aVarArr == null || aVarArr.length <= 0) {
            return 0;
        }
        int iA = 0;
        while (true) {
            a[] aVarArr2 = this.f15749b;
            if (i10 >= aVarArr2.length) {
                return iA;
            }
            a aVar = aVarArr2[i10];
            if (aVar != null) {
                iA += C1519b.a(1, aVar);
            }
            i10++;
        }
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
                a[] aVarArr = this.f15749b;
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
                this.f15749b = aVarArr2;
            } else if (!c1494a.f(iL)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public void a(C1519b c1519b) throws IOException {
        a[] aVarArr = this.f15749b;
        if (aVarArr == null || aVarArr.length <= 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            a[] aVarArr2 = this.f15749b;
            if (i10 >= aVarArr2.length) {
                return;
            }
            a aVar = aVarArr2[i10];
            if (aVar != null) {
                c1519b.b(1, aVar);
            }
            i10++;
        }
    }

    public C1511ag b() {
        this.f15749b = a.c();
        this.f15981a = -1;
        return this;
    }
}
