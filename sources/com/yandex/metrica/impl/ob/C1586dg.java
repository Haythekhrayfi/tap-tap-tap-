package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.dg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1586dg extends AbstractC1594e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f15947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a[] f15948c;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.dg$a */
    public static final class a extends AbstractC1594e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static volatile a[] f15949d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b f15950b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f15951c;

        public a() {
            b();
        }

        public static a[] c() {
            if (f15949d == null) {
                synchronized (C1544c.f15862a) {
                    if (f15949d == null) {
                        f15949d = new a[0];
                    }
                }
            }
            return f15949d;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            b bVar = this.f15950b;
            int iA = bVar != null ? 0 + C1519b.a(1, bVar) : 0;
            int i10 = this.f15951c;
            return i10 != 0 ? iA + C1519b.a(2, i10) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public AbstractC1594e a(C1494a c1494a) throws IOException {
            while (true) {
                int iL = c1494a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 10) {
                    if (this.f15950b == null) {
                        this.f15950b = new b();
                    }
                    c1494a.a(this.f15950b);
                } else if (iL == 16) {
                    int iH = c1494a.h();
                    if (iH == 0 || iH == 1 || iH == 2 || iH == 3) {
                        this.f15951c = iH;
                    }
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            b bVar = this.f15950b;
            if (bVar != null) {
                c1519b.b(1, bVar);
            }
            int i10 = this.f15951c;
            if (i10 != 0) {
                c1519b.d(2, i10);
            }
        }

        public a b() {
            this.f15950b = null;
            this.f15951c = 0;
            this.f15981a = -1;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.dg$b */
    public static final class b extends AbstractC1594e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a[] f15952b;

        /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.dg$b$a */
        public static final class a extends AbstractC1594e {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static volatile a[] f15953d;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public String f15954b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public String f15955c;

            public a() {
                b();
            }

            public static a[] c() {
                if (f15953d == null) {
                    synchronized (C1544c.f15862a) {
                        if (f15953d == null) {
                            f15953d = new a[0];
                        }
                    }
                }
                return f15953d;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public int a() {
                int iA = this.f15954b.equals("") ? 0 : 0 + C1519b.a(1, this.f15954b);
                return !this.f15955c.equals("") ? iA + C1519b.a(2, this.f15955c) : iA;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public AbstractC1594e a(C1494a c1494a) throws IOException {
                while (true) {
                    int iL = c1494a.l();
                    if (iL == 0) {
                        break;
                    }
                    if (iL == 10) {
                        this.f15954b = c1494a.k();
                    } else if (iL == 18) {
                        this.f15955c = c1494a.k();
                    } else if (!c1494a.f(iL)) {
                        break;
                    }
                }
                return this;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC1594e
            public void a(C1519b c1519b) throws IOException {
                if (!this.f15954b.equals("")) {
                    c1519b.b(1, this.f15954b);
                }
                if (this.f15955c.equals("")) {
                    return;
                }
                c1519b.b(2, this.f15955c);
            }

            public a b() {
                this.f15954b = "";
                this.f15955c = "";
                this.f15981a = -1;
                return this;
            }
        }

        public b() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public int a() {
            a[] aVarArr = this.f15952b;
            int i10 = 0;
            if (aVarArr == null || aVarArr.length <= 0) {
                return 0;
            }
            int iA = 0;
            while (true) {
                a[] aVarArr2 = this.f15952b;
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
                    a[] aVarArr = this.f15952b;
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
                    this.f15952b = aVarArr2;
                } else if (!c1494a.f(iL)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC1594e
        public void a(C1519b c1519b) throws IOException {
            a[] aVarArr = this.f15952b;
            if (aVarArr == null || aVarArr.length <= 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                a[] aVarArr2 = this.f15952b;
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

        public b b() {
            this.f15952b = a.c();
            this.f15981a = -1;
            return this;
        }
    }

    public C1586dg() {
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public int a() {
        a aVar = this.f15947b;
        int i10 = 0;
        int iA = aVar != null ? C1519b.a(1, aVar) + 0 : 0;
        a[] aVarArr = this.f15948c;
        if (aVarArr != null && aVarArr.length > 0) {
            while (true) {
                a[] aVarArr2 = this.f15948c;
                if (i10 >= aVarArr2.length) {
                    break;
                }
                a aVar2 = aVarArr2[i10];
                if (aVar2 != null) {
                    iA += C1519b.a(2, aVar2);
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
                if (this.f15947b == null) {
                    this.f15947b = new a();
                }
                c1494a.a(this.f15947b);
            } else if (iL == 18) {
                int iA = C1644g.a(c1494a, 18);
                a[] aVarArr = this.f15948c;
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
                this.f15948c = aVarArr2;
            } else if (!c1494a.f(iL)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public void a(C1519b c1519b) throws IOException {
        a aVar = this.f15947b;
        if (aVar != null) {
            c1519b.b(1, aVar);
        }
        a[] aVarArr = this.f15948c;
        if (aVarArr == null || aVarArr.length <= 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            a[] aVarArr2 = this.f15948c;
            if (i10 >= aVarArr2.length) {
                return;
            }
            a aVar2 = aVarArr2[i10];
            if (aVar2 != null) {
                c1519b.b(2, aVar2);
            }
            i10++;
        }
    }

    public C1586dg b() {
        this.f15947b = null;
        this.f15948c = a.c();
        this.f15981a = -1;
        return this;
    }
}
